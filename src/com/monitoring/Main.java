package com.monitoring;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String dir = new File("").getAbsolutePath() + "\\src\\temp\\";
        System.out.println(dir);
        ArrayList<String> listOfFiles = new ProcessingFile().readDir(dir);
        for (String fileName : listOfFiles) {
            File file = new File(dir + fileName);
            ProcessingFile.readFile(file);
            //System.out.println(atmFileData.getFileName());
            //file.delete();
        }
    }
}







