package ru.netology.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JunitJupiterCashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCountIfAverageAmount() {

        int actual = service.remain(900);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfSmallAmount() {

        int actual = service.remain(1);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfBigAmount() {

        int actual = service.remain(9800);
        int expected = 200;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIf0() {

        int actual = service.remain(0);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfNegativeAmount() {

        int actual = service.remain(-900);
        int expected = 1900;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfHugeAmount() {

        int actual = service.remain(10000999);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfResult0() {

        int actual = service.remain(1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}



