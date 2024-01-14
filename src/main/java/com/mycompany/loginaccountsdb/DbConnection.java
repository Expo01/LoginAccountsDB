package com.mycompany.loginaccountsdb;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chrisdailey
 */
public class DbConnection {
    Connection con = null;
    
    public static Connection ConnectionDB(){
        try{
            Class.forName("org.sqlite.JDBC");
             Connection con = DriverManager.getConnection("jdbc:sqlite:LoginAccountsDB.db");
             System.out.println("Connection Succeeded");
             return con;
        } catch(Exception e){
            System.out.println("Connection failed");
            System.out.println(e.toString());
            return null;
                  
        }
    }
}
