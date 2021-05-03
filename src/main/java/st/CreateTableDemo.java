package com.nirmal.jdbcnirmal.basic;

import com.nirmal.jdbcnirmal.util.DbConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

    public static final String SQL = "Create table user_tbl (id int not null auto_increment, user_name varchar (50), primary key (id))";


    public static void main(String[] args) {

        try (

                Statement st = DbConnectionUtil.getConnection().createStatement();
                ) {
            //1. register the driver
            st.executeUpdate(SQL);
            System.out.println("Table Created");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
