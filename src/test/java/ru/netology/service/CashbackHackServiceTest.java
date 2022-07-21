package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCountIfAverageAmount() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountIfSmallAmount() {

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountIfBigAmount() {

        int actual = service.remain(9800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountIf0() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountIfNegativeAmount() {

        int actual = service.remain(-900);
        int expected = 1900;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountIfHugeAmount() {

        int actual = service.remain(10000999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountIfResult0() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

}