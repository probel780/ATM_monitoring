package com.monitoring;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String dir = new File("").getAbsolutePath() + "\\src\\temp\\";
        ArrayList<String> listOfFiles = new ProcessingFile().readDir(dir);
        for (String fileName : listOfFiles) {
            File file = new File(dir + fileName);
            AtmCassette atmFileData = ProcessingFile.readFile(file);
            //todo check empty cassettes
            CassetteData cassetteA = atmFileData.getCassetteA();
            CassetteData cassetteB = atmFileData.getCassetteB();
            CassetteData cassetteC = atmFileData.getCassetteC();
            CassetteData cassetteD = atmFileData.getCassetteD();
//            CassetteData cassetteE = atmFileData.getCassetteE();
//            CassetteData cassetteF = atmFileData.getCassetteF();
//            CassetteData cassetteG = atmFileData.getCassetteG();
            CassetteData cassetteH = atmFileData.getCassetteH();
            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteA.getLetter()+" "+cassetteA.getCurrency()+" "+cassetteA.getNominal()+" "+cassetteA.getLoad()+" "+cassetteA.getDispensed()+" "+cassetteA.getRemained()+" "+atmFileData.getFileName());
            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteB.getLetter()+" "+cassetteB.getCurrency()+" "+cassetteB.getNominal()+" "+cassetteB.getLoad()+" "+cassetteB.getDispensed()+" "+cassetteB.getRemained()+" "+atmFileData.getFileName());
            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteC.getLetter()+" "+cassetteC.getCurrency()+" "+cassetteC.getNominal()+" "+cassetteC.getLoad()+" "+cassetteC.getDispensed()+" "+cassetteC.getRemained()+" "+atmFileData.getFileName());
            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteD.getLetter()+" "+cassetteD.getCurrency()+" "+cassetteD.getNominal()+" "+cassetteD.getLoad()+" "+cassetteD.getDispensed()+" "+cassetteD.getRemained()+" "+atmFileData.getFileName());
//            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteE.getLetter()+" "+cassetteE.getCurrency()+" "+cassetteE.getNominal()+" "+cassetteE.getLoad()+" "+cassetteE.getDispensed()+" "+cassetteE.getRemained()+" "+atmFileData.getFileName());
//            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteF.getLetter()+" "+cassetteF.getCurrency()+" "+cassetteF.getNominal()+" "+cassetteF.getLoad()+" "+cassetteF.getDispensed()+" "+cassetteF.getRemained()+" "+atmFileData.getFileName());
//            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteG.getLetter()+" "+cassetteG.getCurrency()+" "+cassetteG.getNominal()+" "+cassetteG.getLoad()+" "+cassetteG.getDispensed()+" "+cassetteG.getRemained()+" "+atmFileData.getFileName());
            System.out.println(atmFileData.getLuno()+" "+atmFileData.getDateTime()+" "+cassetteH.getLetter()+" "+cassetteH.getCurrency()+" "+cassetteH.getNominal()+" "+cassetteH.getLoad()+" "+cassetteH.getDispensed()+" "+cassetteH.getRemained()+" "+atmFileData.getFileName());
        }
    }
}







