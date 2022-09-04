package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void ShouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCalculateOnEdge() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCalculateOnTheEdge() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2);
        int expected = 998;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculateUnderEdge() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCalculateOnBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCalculateOverEdge() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

}