package ru.netology.oop_radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldChangeStation() {
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
        radio.setSelectStationNumber(3);
        Assertions.assertEquals(3, radio.getCurrentStationNumber());
    }

    @Test
    void shouldSetStationUnderMinStation() {
        radio.setSelectStationNumber(-1);
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void shouldSetStationOverMaxStation() {
        radio.setSelectStationNumber(10);
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void shouldNextStation() {
        radio.setSelectStationNumber(7);
        radio.nextStationNumber();
        Assertions.assertEquals(8, radio.getCurrentStationNumber());
    }

    @Test
    void shouldOverMaxStation1() {
        radio.setSelectStationNumber(9);
        radio.nextStationNumber();
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void shouldOverMaxStation2() {
        radio.setSelectStationNumber(10);
        radio.nextStationNumber();
        Assertions.assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    void shouldPrevStation() {
        radio.setSelectStationNumber(8);
        radio.prevStationNumber();
        Assertions.assertEquals(7, radio.getCurrentStationNumber());
    }

    @Test
    void shouldBelowMinStation1() {
        radio.setSelectStationNumber(0);
        radio.prevStationNumber();
        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void shouldBelowMinStation2() {
        radio.setSelectStationNumber(-1);
        radio.prevStationNumber();
        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void shouldChangeVolume() {
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(3);
        Assertions.assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void shouldUpVolume() {
        radio.setCurrentVolume(20);
        radio.volumeUp();
        Assertions.assertEquals(21, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume1() {
        radio.setCurrentVolume(100);
        radio.volumeUp();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume2() {
        radio.setCurrentVolume(101);
        radio.volumeUp();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    void shouldDownVolume() {
        radio.setCurrentVolume(8);
        radio.volumeDown();
        Assertions.assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume() {
        radio.setCurrentVolume(-1);
        radio.volumeDown();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}




