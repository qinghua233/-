package exam;

public abstract class Cat {
    public Cat(){};
    String name;
    int age;
    boolean sexy;
    double price;
    void information(String name,int age,boolean sexy,double price){};
enum Result{Male,Female}
public Result S(boolean sexy){
    if (sexy=true){
        return Result.Male;
    }else {return Result.Female;}
}

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexy=" + S(sexy) +
                ", price=" + price +
                '}';
    }
}

