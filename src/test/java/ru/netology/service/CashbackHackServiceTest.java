package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void ShouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(950);
        int expected = 50;
        assertEquals(actual, expected);

    }
    @Test
    public void ShouldCalculateOnLeftEdge() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);

    }
    @Test
    public void ShouldCalculateOnTheLeftEdge() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2);
        int expected = 998;
        assertEquals(actual, expected);

    }
    @Test
    public void ShouldCalculateUnderEdge() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);

    }
    @Test
    public void ShouldCalculateOnEdge() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @Test
    public void ShouldCalculateAboveEdge() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);

    }
}