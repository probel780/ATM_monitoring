package com.monitoring;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class GenAtmFiles {

    public static final int NUM_LOAD_A = 500;
    public static final int NUM_LOAD_B = 1000;
    public static final int NUM_LOAD_C = 1500;
    public static final int NUM_LOAD_D = 2000;
    public static final int NUM_LOAD_H = 1000;

    public static void main(String[] args) {
        String dir = new File("").getAbsolutePath() + "\\src\\temp\\";
        Date dt = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateInFile = formatter.format(dt);
        SimpleDateFormat formFileName = new SimpleDateFormat("-yyyyMMdd-HHmmss");
        String dateFileName = formFileName.format(dt);
        int dispenseA, dispenseB, dispenseC, dispenseD, dispenseH;
        for (int i = 1; i < 10; i++) {
            String fileName = "ATM00" + i + dateFileName;
            dispenseA = (int) (Math.random() * NUM_LOAD_A);
            dispenseB = (int) (Math.random() * NUM_LOAD_B);
            dispenseC = (int) (Math.random() * NUM_LOAD_C);
            dispenseD = (int) (Math.random() * NUM_LOAD_D);
            dispenseH = (int) (Math.random() * NUM_LOAD_H);
            try (FileWriter writer = new FileWriter(dir + fileName, false)) {
                writer.write(fileName + "\r\n");
                writer.append(dateInFile).append("\r\n");
                writer.append("Cassette Currency Nominal Load Dispensed Remained\r\n");
                writer.append("A BYN 5 ").append(String.valueOf(NUM_LOAD_A)).append(" ").append(String.valueOf(dispenseA)).append(" ").append(String.valueOf(NUM_LOAD_A - dispenseA)).append("\r\n");
                writer.append("B BYN 10 ").append(String.valueOf(NUM_LOAD_B)).append(" ").append(String.valueOf(dispenseB)).append(" ").append(String.valueOf(NUM_LOAD_B - dispenseB)).append("\r\n");
                writer.append("C BYN 20 ").append(String.valueOf(NUM_LOAD_C)).append(" ").append(String.valueOf(dispenseC)).append(" ").append(String.valueOf(NUM_LOAD_C - dispenseC)).append("\r\n");
                writer.append("D BYN 50 ").append(String.valueOf(NUM_LOAD_D)).append(" ").append(String.valueOf(dispenseD)).append(" ").append(String.valueOf(NUM_LOAD_D - dispenseD)).append("\r\n");
                writer.append("H USD 100 ").append(String.valueOf(NUM_LOAD_H)).append(" ").append(String.valueOf(dispenseH)).append(" ").append(String.valueOf(NUM_LOAD_H - dispenseH)).append("\r\n");
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}