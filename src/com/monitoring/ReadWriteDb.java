package com.monitoring;

import java.sql.*;

public class ReadWriteDb {

    static String urlDB = "jdbc:mysql://localhost/atm_monitoring";
    static String driverName = "com.mysql.cj.jdbc.Driver";
    private static Connection cn;
    private static Statement st;
    private static ResultSet rs;


//    static void writeToDB(String file) {
//        try {//#1
//            Class.forName(driverName);
//            try {//#2
//                cn = DriverManager.getConnection(urlDB, "root", "rootpass");
//            } catch (SQLException e) {
//                System.out.println("Exception in try #2");
//                e.printStackTrace();
//            }
//            try {//#5
//                st = cn.createStatement();
//                try {//#6
//                    st.executeUpdate("INSERT INTO balans VALUES (NULL, '" ++"', '"+dateTime+"', '"
//                        +sc.next()+"', '"+sc.next()+"', '"+sc.next()+"', '"
//                        +sc.next()+"', '"+sc.next()+"', '"+sc.next()+"', '"+fileName+"')");
//                } catch (SQLException e) {
//                    System.out.println("Exception in try #6");
//                    e.printStackTrace();
//                }
//            } catch (SQLException e) {
//                System.out.println("Exception in try #5");
//                e.printStackTrace();
//            }
//
//        } catch (ClassNotFoundException e) {
//            System.out.println("Exception in try #1");
//            e.printStackTrace();
//        }
//    }
//
//    static void update(String SQLQuery) {
//
//    }
//
//    static ResultSet query(String SQLQuery) {
//        try {//#7
//            st = cn.createStatement();
//            st.executeQuery(SQLQuery);
//            try {//#8
//                rs = st.executeQuery(SQLQuery);
//            } catch (SQLException e) {
//                System.out.println("Exception in try #8");
//                e.printStackTrace();
//            }
//        } catch (SQLException e) {
//            System.out.println("Exception in try #7");
//            e.printStackTrace();
//        }
//        return rs;
//    }
//
//    static String getValue(String SQLQuery) {
//        String result = null;
//        try {//Logon.CheckUser()
//            rs = AtmDataBase.query(SQLQuery);
//            if (rs.next()) {
//                result = rs.getString(1);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error in Logon.CheckUser()");
//            e.printStackTrace();
//        }
//        return result;
//    }
//    static void disconnectDB(){
//        try {
//            cn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}