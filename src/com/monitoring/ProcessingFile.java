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


    static AtmBean readFile(File file) {
        AtmBean atmFileData = new AtmBean();

        FileReader fr = null;
        Scanner sc = null;
        //todo: make try with resource

        try {
            fr = new FileReader(file);
            sc = new Scanner(fr);

            String fileName = sc.nextLine(); //fileName
            atmFileData.setFileName(fileName);

            String dateTime = sc.nextLine(); //dateTime
            atmFileData.setDateTime(dateTime);

            String luno = fileName.substring(0, 6); //luno
            atmFileData.setLuno(luno);

            sc.nextLine(); //columnName

            while (sc.hasNextLine()) {
                //todo: check empty lines
                if (sc.nextLine().isEmpty()) {
                    break;
                } else {
                    CassetteBean cassetteData = new CassetteBean();
                    cassetteData.setLetter(sc.next().charAt(0));
                    cassetteData.setCurrency(sc.next());
                    cassetteData.setNominal(sc.nextInt());
                    cassetteData.setLoad(sc.nextInt());
                    cassetteData.setDispensed(sc.nextInt());
                    cassetteData.setRemained(sc.nextInt());
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
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (sc != null) {
                    sc.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return atmFileData;
    }
}