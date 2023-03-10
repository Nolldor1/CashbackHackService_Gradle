package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {

    @Test
    public void testUpperBorderValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  999;

        int actual = 1;
        int expected = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void testLowerBorderValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  1;

        int actual = 999;
        int expected = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void testZeroValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  0;

        int actual = 1000;
        int expected = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void testWhenValueAlreadyReached() {
        CashbackHackService service = new CashbackHackService();
        int amount =  1000;

        int actual = 0;
        int expected = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void testJunit5UpperBorderValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  999;

        int actual = 1;
        int expected = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testJunit5LowerBorderValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  1;

        int actual = 999;
        int expected = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testJunit5ZeroValue() {
        CashbackHackService service = new CashbackHackService();
        int amount =  0;

        int actual = 1000;
        int expected = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testJunit5WhenValueAlreadyReached() {
        CashbackHackService service = new CashbackHackService();
        int amount =  1000;

        int actual = 0;
        int expected = service.remain(amount);
        Assertions.assertEquals(expected,actual);

    }
}
