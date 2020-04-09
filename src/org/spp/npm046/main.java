/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spp.npm046;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomz
 */
public class main {
    public static void main(String[] args) {
        
        MysqlDataSource db_tomi = new MysqlDataSource();
                
                db_tomi.setServerName("localhost");
                db_tomi.setDatabaseName("procurement");
                db_tomi.setUser("root");
                db_tomi.setPassword("");
                
        try {
            java.sql.Connection connection = db_tomi.getConnection();
            System.out.println("Koneksi Berhasil)");
        } catch (SQLException ex) {
            System.out.println("Koneksi Gagal");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             
        
    }
    
}
