package com.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamedpc
 */


public class myconnection {
 private  ResultSet result ;    
 private static final String user      = "root";
 private static final String password  = "EwiesProgramming";
 private static Statement stat ;
 private static final String conction_string = "jdbc:mysql://"
         + "localhost:3306/mobiles"
         + "?useSSL=false";
 private Connection connect =null;

 /* open and close funtion */
 ///////////////////////////////////////////////////
 //////////////////////////////////////////////////
 public void connect_fuction() throws ClassNotFoundException, SQLException
 {
     try{
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection(conction_string, user, password);
        stat = connect.createStatement();
        } 
        catch(SQLException e )
        {
            e.printStackTrace();
        }
     stat.execute("SET SQL_SAFE_UPDATES = 0;");
     
 }
 public void close_fuction() throws SQLException
 {
         stat.close(); 
         connect.close();   
 }
 ///////////////////////////////////////////////////////////////////
 //////////////////////////////////////////////////////////////////
 
  public void insert_function (String sql_statement) throws SQLException { 
             stat.execute(sql_statement);

    }
  
  //////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////
  public void update_and_delete_function(String sql_statement) throws SQLException
  {
      stat.execute(sql_statement);
  }


  
  //////////////////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////////////////
 
  
 public ResultSet Select (String sql_statement ) throws SQLException
 {
      result =stat.executeQuery(sql_statement);
      return result;
 }
  
 
  
  
}
