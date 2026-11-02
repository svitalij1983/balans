import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class balansTest {
    @Test
    public static void main(String[] args) {
        int initialBalance = 300;
        int addend = 2700;

        int bonus = 0;
        if(addend > 1000){
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
        Assertions.assertArrayEquals(args,args);
    }
    }

