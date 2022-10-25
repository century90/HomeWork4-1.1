package ru.netology;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    void needToIncreasePurchase() {
        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(700);
        Assert.assertEquals(actual, expected);

    }

    @Test
    void NeedToIncreasePurchaseBy1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(actual, expected);

    }

    @Test
    void NoNeedToIncreasePurchaseEquals1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);

    }

    @Test
    void NoNeedToIncreasePurchaseMore1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1001);
        Assert.assertEquals(actual, expected);

    }

}
