package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testUpperBorderValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  999;

        int actual = 1;
        int expected = service.remain(amount);
        assertEquals(actual,expected);
    }
    @Test
    public void testLowerBorderValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  1;

        int actual = 999;
        int expected = service.remain(amount);
        assertEquals(actual,expected);
    }
    @Test
    public void testZeroValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  0;

        int actual = 1000;
        int expected = service.remain(amount);
        assertEquals(actual,expected);
    }
    @Test
    public void testWhenValueAlreadyReached() {
        CashbackHackService service = new CashbackHackService();
        int amount =  1000;

        int actual = 0;
        int expected = service.remain(amount);
        assertEquals(actual,expected);
    }
}