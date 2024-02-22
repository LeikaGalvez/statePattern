package statePattern;
public interface AccountState {

    void deposit(Account account);
    void withdraw(Account account);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);

}