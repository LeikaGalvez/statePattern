package statePattern;
public class ActiveState implements AccountState {

    @Override
    public void deposit(Account account, double depositAmount) {
        account.setBalance((account.getBalance() + depositAmount));
        account.toString();
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        account.setBalance((account.getBalance() - withdrawAmount));
        account.toString();
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }

    
}
