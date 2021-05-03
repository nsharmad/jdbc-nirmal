package com.nirmal.jdbcnirmal.basic;

import com.nirmal.jdbcnirmal.util.DbConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL = "Delete from user_tbl where id =5";


    public static void main(String[] args) {

        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            //1. register the driver
            st.executeUpdate(SQL);
            System.out.println("Data Deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}

