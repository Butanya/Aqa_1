package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class JunitCashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCountIfAverageAmount() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfSmallAmount() {

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfBigAmount() {

        int actual = service.remain(9800);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIf0() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfNegativeAmount() {

        int actual = service.remain(-900);
        int expected = 1900;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfHugeAmount() {

        int actual = service.remain(10000999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfResult0() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

}

