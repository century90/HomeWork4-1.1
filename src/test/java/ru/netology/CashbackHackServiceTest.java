package ru.netology;

import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {

    @Test
    public void needToIncreasePurchase() {
        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(700);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void NeedToIncreasePurchaseBy1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(expected, actual);

    }

}
