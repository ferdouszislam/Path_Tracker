package com.example.pathtracker;

public class LinearAccelerationData {

    private double xValue=0, yValue=0, zValue=0; // unit: m/s^2
    private double dt=0; // unit: nano seconds
    private boolean available = true;

    //@Exclude
    private double startTime=-1, timePassed = 0; // unit: nano seconds
    //@Exclude
    private static final double nanoToS = 1.0d / 1000000000.0d;

    public LinearAccelerationData() {
    }

    public LinearAccelerationData(double xValue, double yValue, double zValue) {
        this.xValue = xValue;
        this.yValue = yValue;
        this.zValue = zValue;
    }

    public void setTime(double time) {

        if(startTime==-1)
            startTime = time;

        dt = (time-startTime) - timePassed;

        timePassed = time-startTime;

    }

    public double getxValue() {
        return xValue;
    }

    public void setxValue(double xValue) {
        this.xValue = xValue;
    }

    public double getyValue() {
        return yValue;
    }

    public void setyValue(double yValue) {
        this.yValue = yValue;
    }

    public double getzValue() {
        return zValue;
    }

    public void setzValue(double zValue) {
        this.zValue = zValue;
    }

    public double getDt() {
        return dt*nanoToS;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getTimePassed() {
        return timePassed;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}