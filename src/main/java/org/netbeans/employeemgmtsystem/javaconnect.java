/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.employeemgmtsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Neeraj
 */
public class javaconnect {
    
    
    public static Connection ConnectDB(){
    
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Neeraj\\Documents\\NetBeansProjects\\EmployeeMgmtSystem\\EmployeeMgmtSystemDB.sqlite", null, null);
            //JOptionPane.showMessageDialog(null, "Connected to DB");
            return conn;
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
