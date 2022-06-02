package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void setNumberStation() {
        Radio rad = new Radio(20);
        assertEquals(20, rad.getNumberOfRadioStations());
    }

    @Test
    public void setDefaultNumberStation() {
        Radio rad = new Radio();
        assertEquals(10, rad.getNumberOfRadioStations());
    }

    @Test
    void setCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);

        assertEquals(6, rad.getCurrentVolume());
    }

    @Test
    public void nextMaxNumberStation() {
        Radio rad = new Radio(50);

        rad.setCurrentRadioStation(49);
        rad.nextRadioStation();

        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void nextDefaultMaxNumberStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void increaseMaxCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio(50);

        rad.setCurrentRadioStation(25);
        rad.nextRadioStation();

        assertEquals(26, rad.getCurrentRadioStation());
    }

    @Test
    public void nextDefaultStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.nextRadioStation();

        assertEquals(6, rad.getCurrentRadioStation());
    }

    @Test
    void increaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(70);
        rad.increaseVolume();

        assertEquals(71, rad.getCurrentVolume());
    }

    @Test
    public void prevMinNumberStation() {
        Radio rad = new Radio(50);

        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        assertEquals(49, rad.getCurrentRadioStation());
    }

    @Test
    public void prevDefaultMinNumberStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    void decreaseMinCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio(50);

        rad.setCurrentRadioStation(25);
        rad.prevRadioStation();

        assertEquals(24, rad.getCurrentRadioStation());
    }

    @Test
    public void prevDefaultStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.prevRadioStation();

        assertEquals(4, rad.getCurrentRadioStation());
    }

    @Test
    void decreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(70);
        rad.decreaseVolume();

        assertEquals(69, rad.getCurrentVolume());
    }

    @Test
    public void setNegativeMaxNumberStation() {
        Radio rad = new Radio(50);

        rad.setCurrentRadioStation(42);
        rad.setCurrentRadioStation(60);

        assertEquals(42, rad.getCurrentRadioStation());
    }

    @Test
    public void setNegativeMaxDefaultNumberStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);
        rad.setCurrentRadioStation(15);

        assertEquals(4, rad.getCurrentRadioStation());
    }

    @Test
    void setNegativeMaxCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);
        rad.setCurrentVolume(120);

        assertEquals(6, rad.getCurrentVolume());
    }

    @Test
    public void setNegativeMinNumberStation() {
        Radio rad = new Radio(50);

        rad.setCurrentRadioStation(42);
        rad.setCurrentRadioStation(-6);

        assertEquals(42, rad.getCurrentRadioStation());
    }

    @Test
    public void setNegativeMinDefaultNumberStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);
        rad.setCurrentRadioStation(-6);

        assertEquals(4, rad.getCurrentRadioStation());
    }

    @Test
    void setNegativeMinCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);
        rad.setCurrentVolume(-9);

        assertEquals(6, rad.getCurrentVolume());
    }

}
