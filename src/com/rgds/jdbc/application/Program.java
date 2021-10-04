package com.rgds.jdbc.application;

import com.rgds.jdbc.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args){
        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
