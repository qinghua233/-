package exam;

import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Test02 {
    public static void main(String[] args) {

        Customer ZS=new Customer();
        ZS.time= LocalDate.of(2020,12,30);
        ZS.ruanum=3;
        ZS.name="zhangsan";

        Customer LS=new Customer();
        LS.name="lisi";
        LS.time=LocalDate.of(2020,12,30);
        LS.ruanum=4;

        Customer WW=new Customer();
        WW.ruanum=5;
        WW.name="wangwu";
        WW.time=LocalDate.of(2020,11,30);

        Customer CYH=new Customer();
        CYH.name="cyh";
        CYH.ruanum=1;
        CYH.time=LocalDate.of(2020,12,30);

        Customer CY=new Customer();
        CY.name="cy";
        CY.ruanum=1;
        CY.time=LocalDate.of(2020,12,30);

        Cat xiaobai=new Shorthair();
        xiaobai.price=500.0;
        xiaobai.age=2;
        xiaobai.name="xiaobai";
        xiaobai.sexy=true;

       Cat xiaohei=new BlackCat();
       xiaohei.name="xiaohei";
       xiaohei.sexy=false;
       xiaohei.price=400;
       xiaohei.age=1;

        Cat xiaojv=new OrangeCat();
        xiaojv.age=3;
        xiaojv.name="xiaojv";
        xiaojv.sexy=true;
        xiaojv.price=400;

        MyCatCafe ruaheaven=new MyCatCafe();
        ruaheaven.cat.add(xiaobai);
        ruaheaven.cat.add(xiaohei);
        ruaheaven.cat.add(xiaojv);

        ruaheaven.balance=1000.0;
        Cat dabai=new Shorthair();
        dabai.price=200;


        try {
            ruaheaven.BUYCAT(dabai);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        };
        try {
            ruaheaven.Entertaincustomers(ZS);
            ruaheaven.Entertaincustomers(LS);
            ruaheaven.Entertaincustomers(CYH);
            ruaheaven.Entertaincustomers(CY);
            ruaheaven.Entertaincustomers(WW);


        } catch (CatNotFoundException e) {
            e.printStackTrace();
        }

        ruaheaven.Closeshop(LocalDate.of(2020,12,30));



    }
}
