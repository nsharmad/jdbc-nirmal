package com.nirmal.jdbcnirmal.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBDemo {

    public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/";
    public static final String USER_NAME="root";
    public static final String PASSWORD="Kathmandu123@";
    public static final String SQL = "Create database jdbc_demo_db";


    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        try {
            //1. register the driver
            Class.forName(DRIVER_NAME);
            //2. obtain connection object
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            //3. OBTAIN Statement Object
            st = con.createStatement();
            //4.  Execute the query
            st.executeUpdate(SQL);
            System.out.println("DB Created");
            } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                //5. Close the connection
                con.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


}
