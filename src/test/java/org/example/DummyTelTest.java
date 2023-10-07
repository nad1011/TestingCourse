package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTelTest {

    //    Phan hoach tuong duong
    @Test
    public void testNormalCallDuringDaytime() {
        double cost = DummyTel.calculateCallCost(10, 30, 30);
        assertEquals(15.75, cost);
    }

    @Test
    public void testNormalCallDuringNighttime() {
        double cost = DummyTel.calculateCallCost(20, 0, 45);
        assertEquals(11.81, cost);
    }

    @Test
    public void testLongCallDuringDaytime() {
        double cost = DummyTel.calculateCallCost(10, 15, 90);
        assertEquals(40.16, cost);
    }

    @Test
    public void testLongCallDuringNighttime() {
        double cost = DummyTel.calculateCallCost(22, 30, 120);
        assertEquals(22.05, cost);
    }

    //      bva
    @Test
    public void testStartHourMinMinusBoundary() {
        double cost = DummyTel.calculateCallCost(-1, 30, 30);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testStartHourMinBoundary() {
        double cost = DummyTel.calculateCallCost(0, 30, 30);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testStartHourMinPlusBoundary() {
        double cost = DummyTel.calculateCallCost(1, 30, 30);
        assertEquals(0.79, cost, 0.01);
    }

    @Test
    public void testStartHourMaxMinusBoundary() {
        double cost = DummyTel.calculateCallCost(22, 30, 30);
        assertEquals(11.81, cost, 0.01);
    }

    @Test
    public void testStartHourMaxBoundary() {
        double cost = DummyTel.calculateCallCost(23, 30, 30);
        assertEquals(31.50, cost, 0.01);
    }

    @Test
    public void testStartHourMaxPlusBoundary() {
        double cost = DummyTel.calculateCallCost(24, 30, 30);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testStartMinutesMinMinusBoundary() {
        double cost = DummyTel.calculateCallCost(12, -1, 30);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testStartMinutesMinBoundary() {
        double cost = DummyTel.calculateCallCost(12, 0, 30);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testStartMinutesMinPlusBoundary() {
        double cost = DummyTel.calculateCallCost(12, 1, 30);
        assertEquals(0.79, cost, 0.01);
    }

    @Test
    public void testStartMinutesMaxMinusBoundary() {
        double cost = DummyTel.calculateCallCost(12, 59, 30);
        assertEquals(0.79, cost, 0.01);
    }

    @Test
    public void testStartMinutesMaxBoundary() {
        double cost = DummyTel.calculateCallCost(12, 60, 30);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testStartMinutesMaxPlusBoundary() {
        double cost = DummyTel.calculateCallCost(12, 61, 30);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testDurationMinMinusBoundary() {
        double cost = DummyTel.calculateCallCost(10, 30, -1);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testDurationMinBoundary() {
        double cost = DummyTel.calculateCallCost(10, 30, 0);
        assertEquals(0.0, cost, 0.01);
    }

    @Test
    public void testDurationMinPlusBoundary() {
        double cost = DummyTel.calculateCallCost(10, 30, 1);
        assertEquals(0.53, cost, 0.01);
    }



}