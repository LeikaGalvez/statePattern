package statePattern;
public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
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
        accountState.activate(this);
    }

    public void suspend(){
        accountState.suspend(this);
    }

    public void close(){
        accountState.close(this);
    }

    @Override
    public String toString(){
        return "Account Number: " + accountNumber + "\nCurrent balance: " + String.valueOf(balance);
    }
}
