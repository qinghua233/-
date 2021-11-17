package exam;

public class CatNotFoundException extends Exception{
    public CatNotFoundException(){}
    public CatNotFoundException(String s){
        super(s);
    }
}
