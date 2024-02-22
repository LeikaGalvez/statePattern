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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(Double depositAmount){
        //balance = balance + depositAmount;
        //call toString
        System.out.println(toString());
    }

    public void withdraw(Double withdrawAmount){
        //balance = balance - withdrawAmount;
        //call toString
        System.out.println(toString());
    }

    public void activate(){        
        accountState.activate(this);
        this.accountState = new ActiveState();
    }

    public void suspend(){ 
        accountState.suspend(this);
        this.accountState = new SuspendedState();
      
    }

    public void close(){
       accountState.close(this);
       this.accountState = new ClosedState();
       
    }

    @Override
    public String toString(){
        return "Account Number: " + accountNumber + "\nCurrent balance: " + String.valueOf(this.getBalance());
    }
}
