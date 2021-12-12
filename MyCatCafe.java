package exam;

import java.sql.Array;
import java.time.LocalDate;
import java.util.*;

public class MyCatCafe implements exam.CatCafe {
    LocalDate A;
    double balance;
    List<Cat> cat=new ArrayList();
Iterator it=cat.iterator();
List<exam.Customer> Customer=new ArrayList();
    Iterator it2=cat.iterator();
    public void BUYCAT(Cat CAT) throws exam.InsufficientBalanceException {
        if (balance>CAT.price){
            cat.add(CAT);
            balance=balance-CAT.price;
        }else {
throw new exam.InsufficientBalanceException("您的余额不足，自动判断养不活多余的猫");
        }


    };



    public void Entertaincustomers(Customer customer) {

        Object cAt[]= cat.toArray();
        Random random = new Random();
//&&customer.time==A
if (cat.size()>0){
    if(customer.time.isEqual(A)){
    int shu = random.nextInt(cat.size());
    System.out.println(cat.size());
    Customer.add(customer);
    cat.remove(shu);
    System.out.println(cat.size());
    System.out.println(cAt[shu]);}
    else Customer.add(customer);
}else try {
    throw new CatNotFoundException("没猫了啊");
} catch (CatNotFoundException e) {
    e.printStackTrace();
}


    }

    public void Closeshop(LocalDate A){
       for (int c=0;c<Customer.size();c++){
           if (Customer.get(c).time.equals(A)){
               System.out.println(Customer.get(c));
               balance +=Customer.get(c).ruanum*15;
           }
       }


        System.out.println(balance);
    };
}










