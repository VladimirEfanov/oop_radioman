package ru.netology.oop_radioman;

public class Radio {
    private int currentStationNumber;
    static final int minStationNumber = 0;
    static final int maxStationNumber = 9;
    private int currentVolume;

    static final int minVolume = 0;
    static final int maxVolume = 100;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setSelectStationNumber(int setSelectStationNumber) {
        if (setSelectStationNumber < minStationNumber || setSelectStationNumber > maxStationNumber) {
            return;
        }
        this.currentStationNumber = setSelectStationNumber;

    }

    public void nextStationNumber() {
        if (currentStationNumber == maxStationNumber) {
            this.currentStationNumber = minStationNumber;
        } else {
            this.currentStationNumber++;
        }
    }

    public void prevStationNumber() {
        if (currentStationNumber == minStationNumber) {
            this.currentStationNumber = maxStationNumber;
        } else {
            this.currentStationNumber--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }
}