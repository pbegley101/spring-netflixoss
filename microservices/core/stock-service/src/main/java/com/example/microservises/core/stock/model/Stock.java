package com.example.microservises.core.stock.model;

import java.lang.*;


public class Stock {
    private String symbol;
    private double open;
    private double last;
    private double high;
    private double low;

    public Stock() {

    }

    public Stock(String symbol, double open, double last,double high,double low) {
        this.symbol = symbol;
        this.open = open;
        this.last = last;
        this.high = high;
        this.low = low;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getChange(){
        return Math.random() * low;
    }
}
