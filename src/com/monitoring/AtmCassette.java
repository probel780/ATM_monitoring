package com.monitoring;

public class AtmCassette {
    private static String luno;
    private static String dateTime;
    private static String fileName;
    private CassetteData cassetteA = new CassetteData();
    private CassetteData cassetteB = new CassetteData();
    private CassetteData cassetteC = new CassetteData();
    private CassetteData cassetteD = new CassetteData();
    private CassetteData cassetteE = new CassetteData();
    private CassetteData cassetteF = new CassetteData();
    private CassetteData cassetteG = new CassetteData();
    private CassetteData cassetteH = new CassetteData();

    private int index = 0;
    //todo реализовать метод Iterable

    public CassetteData next() {
        CassetteData result = null;
        index++;
        switch (index) {
            case 1:
                result = cassetteA;
                break;
            case 2:
                result = cassetteB;
                break;
            case 3:
                result = cassetteC;
                break;
            case 4:
                result = cassetteD;
                break;
            case 5:
                result = cassetteE;
                break;
            case 6:
                result = cassetteF;
                break;
            case 7:
                result = cassetteG;
                break;
            case 8:
                result = cassetteH;
                break;
        }
        if (result != null && result.isEmpty()) {
            result = next();
        }
        return result;
    }

    public static String getLuno() {
        return luno;
    }

    public void setLuno(String luno) {
        this.luno = luno;
    }

    public static String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public static String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CassetteData getCassetteA() {
        return cassetteA;
    }

    public void setCassetteA(CassetteData cassetteA) {
        this.cassetteA = cassetteA;
    }

    public CassetteData getCassetteB() {
        return cassetteB;
    }

    public void setCassetteB(CassetteData cassetteB) {
        this.cassetteB = cassetteB;
    }

    public CassetteData getCassetteC() {
        return cassetteC;
    }

    public void setCassetteC(CassetteData cassetteC) {
        this.cassetteC = cassetteC;
    }

    public CassetteData getCassetteD() {
        return cassetteD;
    }

    public void setCassetteD(CassetteData cassetteD) {
        this.cassetteD = cassetteD;
    }

    public CassetteData getCassetteE() {
        return cassetteE;
    }

    public void setCassetteE(CassetteData cassetteE) {
        this.cassetteE = cassetteE;
    }

    public CassetteData getCassetteF() {
        return cassetteF;
    }

    public void setCassetteF(CassetteData cassetteF) {
        this.cassetteF = cassetteF;
    }

    public CassetteData getCassetteG() {
        return cassetteG;
    }

    public void setCassetteG(CassetteData cassetteG) {
        this.cassetteG = cassetteG;
    }

    public CassetteData getCassetteH() {
        return cassetteH;
    }

    public void setCassetteH(CassetteData cassetteH) {
        this.cassetteH = cassetteH;
    }

}