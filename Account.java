public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(Double depositAmount){
        balance = balance + depositAmount;
        //call toString
        System.out.println(toString());
    }

    public void withdraw(Double withdrawAmount){
        balance = balance - withdrawAmount;
        //call toString
        System.out.println(toString());
    }

    public void activate(){
        accountState = new ActiveState();
        accountState.activate(this);
    }

    public void suspend(){
        accountState = new SuspendedState();
        accountState.suspend(this);
    }

    public void close(){
        accountState = new ClosedState();
        accountState.close(this);
    }

    public String toString(){
        return "Account Number: " + accountNumber + "\nCurrent balance: " + String.valueOf(balance);
    }
}
