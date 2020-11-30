/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Chelsea
 */
public class Clock {
    private int min;
    private int hour;
    private int sec;

    public Clock() {
        this.hour = 0;
        this.sec = 0;
        this.min = 0;
    }
    
    public Clock(int hour, int min, int sec) {
        this.min = min;
        this.hour = hour;
        this.sec = sec;
    }
    
    public Clock(Clock clock) {
        this.hour = clock.hour;
        this.sec = clock.sec;
        this.min = clock.min;
    }
    
    /**
     * To increase the hour by 1
     */
    public void increaseHour() {
         hour++;
         if (hour == 24)
            hour = 0;
        // OR YOU CAN DO:
        // hour = (hour + 1) % 24; 
    }
    
    /**
     *  To increase the min by 1
     */
    public void increaseMin() {
        min++;
        if (min == 60) {
            min = 0;
            increaseHour();
        }
    }
    
    /**
     *  To increase the seconds by 1
     */
    public void increaseSecond() {
        sec++;
        if (sec == 60) {
            sec = 0;
            increaseMin();
        }
    }
    
    public boolean equals (Clock clock) {
        return this.hour == clock.hour &&
                this.min == clock.min &&
                this.sec == clock.sec;
    }
    
    @Override 
    public String toString() { //13:05:27 --> you need to do zero padding for this (which is what you did)
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
}
