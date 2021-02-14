package com.monitoring;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String dir = new File("").getAbsolutePath() + "\\src\\temp\\";
        ArrayList<String> listOfFiles = new ProcessingFile().readDir(dir);
        for (String fileName : listOfFiles) {
            File file = new File(dir + fileName);
            AtmCassettes atmFileData = ProcessingFile.readFile(file);
            //todo check empty beans
            CassetteData cassetteA = atmFileData.getCassetteA();
            CassetteData cassetteB = atmFileData.getCassetteB();
            CassetteData cassetteC = atmFileData.getCassetteC();
            CassetteData cassetteD = atmFileData.getCassetteD();
//            CassetteData cassetteE = atmFileData.getCassetteE();
//            CassetteData cassetteF = atmFileData.getCassetteF();
//            CassetteData cassetteG = atmFileData.getCassetteG();
            CassetteData cassetteH = atmFileData.getCassetteH();
            System.out.println(cassetteA.getLuno()+" "+cassetteA.getDateTime()+" "+cassetteA.getLetter()+" "+cassetteA.getCurrency()+" "+cassetteA.getNominal()+" "+cassetteA.getLoad()+" "+cassetteA.getDispensed()+" "+cassetteA.getRemained()+" "+cassetteA.getFileName());
            System.out.println(cassetteB.getLuno()+" "+cassetteB.getDateTime()+" "+cassetteB.getLetter()+" "+cassetteB.getCurrency()+" "+cassetteB.getNominal()+" "+cassetteB.getLoad()+" "+cassetteB.getDispensed()+" "+cassetteB.getRemained()+" "+cassetteB.getFileName());
            System.out.println(cassetteC.getLuno()+" "+cassetteC.getDateTime()+" "+cassetteC.getLetter()+" "+cassetteC.getCurrency()+" "+cassetteC.getNominal()+" "+cassetteC.getLoad()+" "+cassetteC.getDispensed()+" "+cassetteC.getRemained()+" "+cassetteC.getFileName());
            System.out.println(cassetteD.getLuno()+" "+cassetteD.getDateTime()+" "+cassetteD.getLetter()+" "+cassetteD.getCurrency()+" "+cassetteD.getNominal()+" "+cassetteD.getLoad()+" "+cassetteD.getDispensed()+" "+cassetteD.getRemained()+" "+cassetteD.getFileName());
//            System.out.println(cassetteE.getLuno()+" "+cassetteE.getDateTime()+" "+cassetteE.getLetter()+" "+cassetteE.getCurrency()+" "+cassetteE.getNominal()+" "+cassetteE.getLoad()+" "+cassetteE.getDispensed()+" "+cassetteE.getRemained()+" "+cassetteE.getFileName());
//            System.out.println(cassetteF.getLuno()+" "+cassetteF.getDateTime()+" "+cassetteF.getLetter()+" "+cassetteF.getCurrency()+" "+cassetteF.getNominal()+" "+cassetteF.getLoad()+" "+cassetteF.getDispensed()+" "+cassetteF.getRemained()+" "+cassetteF.getFileName());
//            System.out.println(cassetteG.getLuno()+" "+cassetteG.getDateTime()+" "+cassetteG.getLetter()+" "+cassetteG.getCurrency()+" "+cassetteG.getNominal()+" "+cassetteG.getLoad()+" "+cassetteG.getDispensed()+" "+cassetteG.getRemained()+" "+cassetteG.getFileName());
            System.out.println(cassetteH.getLuno()+" "+cassetteH.getDateTime()+" "+cassetteH.getLetter()+" "+cassetteH.getCurrency()+" "+cassetteH.getNominal()+" "+cassetteH.getLoad()+" "+cassetteH.getDispensed()+" "+cassetteH.getRemained()+" "+cassetteH.getFileName());
        }
    }
}







