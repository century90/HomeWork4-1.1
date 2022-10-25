package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void needToIncreasePurchase() {
        BonusService service = new BonusService();

        int expected = 300;
        int actual = service.remain(700);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void NeedToIncreasePurchaseBy1() {
        BonusService service = new BonusService();

        int expected = 1;
        int actual = service.remain(999);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void NoNeedToIncreasePurchase() {
        BonusService service = new BonusService();

        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);

    }
}
