package com.nirmal.jdbcnirmal.basic;

import com.nirmal.jdbcnirmal.util.DbConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = "insert into user_tbl(user_name)values('aaa')";


    public static void main(String[] args) {

        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            //1. register the driver
            st.executeUpdate(SQL);
            System.out.println("Data Inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}

