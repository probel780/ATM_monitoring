package com.monitoring;

public class CassetteData {

    private String luno;
    private String dateTime;
    private char letter;
    private String currency;
    private int nominal;
    private int load;
    private int dispensed;
    private int remained;
    private String fileName;

    public String getLuno() {
        return luno;
    }

    public void setLuno(String luno) {
        this.luno = luno;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}