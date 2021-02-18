package com.monitoring;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProcessingFile {

    ArrayList<String> readDir(String dir) {
        Date dt = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String date = formatter.format(dt);
        File dr = new File(dir);
        String[] dirFiles = dr.list();
        ArrayList<String> files = new ArrayList<>();
        if (dirFiles != null) {
            for (String dirFile : dirFiles) {
                if (dirFile.matches("ATM\\d{3}-" + date + "-\\d{6}")) {
                    files.add(dirFile);
                }
            }
        }
        return files;
    }

    static AtmCassette readFile(File file) {
        AtmCassette atmFileData = new AtmCassette();
        //todo: make try with resource

        try (
                FileReader fr = new FileReader(file);
                Scanner sc = new Scanner(fr)
        ) {

            String fileName = sc.nextLine();
            String dateTime = sc.nextLine();
            String luno = fileName.substring(0, 6);
            sc.nextLine(); //skip columnName string

            while (sc.hasNextLine()) {
                //todo check empty lines
                CassetteData cassetteData = new CassetteData();
                cassetteData.setLuno(luno);
                cassetteData.setDateTime(dateTime);
                cassetteData.setLetter(sc.next().charAt(0));
                cassetteData.setCurrency(sc.next());
                cassetteData.setNominal(sc.nextInt());
                cassetteData.setLoad(sc.nextInt());
                cassetteData.setDispensed(sc.nextInt());
                cassetteData.setRemained(sc.nextInt());
                cassetteData.setFileName(fileName);

                switch (cassetteData.getLetter()) {
                    case 'A':
                        atmFileData.setCassetteA(cassetteData);
                        break;
                    case 'B':
                        atmFileData.setCassetteB(cassetteData);
                        break;
                    case 'C':
                        atmFileData.setCassetteC(cassetteData);
                        break;
                    case 'D':
                        atmFileData.setCassetteD(cassetteData);
                        break;
                    case 'E':
                        atmFileData.setCassetteE(cassetteData);
                        break;
                    case 'F':
                        atmFileData.setCassetteF(cassetteData);
                        break;
                    case 'G':
                        atmFileData.setCassetteG(cassetteData);
                        break;
                    case 'H':
                        atmFileData.setCassetteH(cassetteData);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid letter");
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return atmFileData;
    }
}