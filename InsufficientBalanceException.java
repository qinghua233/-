package exam;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){}
    public InsufficientBalanceException(String s){
        super(s);

    }
}
