package exam;

import java.time.LocalDate;

public interface CatCafe {
    void BUYCAT(Cat CAT) throws InsufficientBalanceException;
    void Entertaincustomers(Customer customer) throws CatNotFoundException;
    void Closeshop(LocalDate a);

}
