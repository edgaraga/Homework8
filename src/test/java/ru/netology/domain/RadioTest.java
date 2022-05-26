package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    void setRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);

        int actual = rad.getCurrentRadioStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);

        int actual = rad.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void negativeDownSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void negativeDownSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-4);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void negativeUpSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(35);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void negativeUpSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(48);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void nextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);
        rad.nextRadioStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void NextIfMaxRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseMaxCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.prevRadioStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseCurrentVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void prevIfMinRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseMinCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void negativeLargeDownSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.setCurrentRadioStation(-1);

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void negativeLargeDownSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);
        rad.setCurrentVolume(-4);

        int actual = rad.getCurrentVolume();
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void negativeLargeUpSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(2);
        rad.setCurrentRadioStation(35);

        int actual = rad.getCurrentRadioStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void negativeLargeUpSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);
        rad.setCurrentVolume(48);

        int actual = rad.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }


}
