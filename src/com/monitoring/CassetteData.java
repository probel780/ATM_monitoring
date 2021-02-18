package com.monitoring;

public class CassetteData {

    private String letter;
    private String currency;
    private int nominal;
    private int load;
    private int dispensed;
    private int remained;

    public boolean isEmpty() {
        return getCurrency() == null;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getDispensed() {
        return dispensed;
    }

    public void setDispensed(int dispensed) {
        this.dispensed = dispensed;
    }

    public int getRemained() {
        return remained;
    }

    public void setRemained(int remained) {
        this.remained = remained;
    }
}