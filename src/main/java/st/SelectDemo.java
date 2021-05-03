package com.nirmal.jdbcnirmal.basic;

import com.nirmal.jdbcnirmal.util.DbConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {
    public static final String SQL = "Select * from user_tbl";


    public static void main(String[] args) {

        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            //1. register the driver
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                System.out.println("id is: "+ rs.getInt("id"));
                System.out.println("User is: "+ rs.getString("user_name"));
                System.out.println("==============================");
                }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
