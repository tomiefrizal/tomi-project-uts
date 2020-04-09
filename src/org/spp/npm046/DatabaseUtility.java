/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spp.npm046;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author tomz
 */
public class DatabaseUtility {
    private static Connection connection;
    
    static {
        MysqlDataSource db_tomi = new MysqlConnectionPoolDataSource();
        db_tomi.setServerName("localhost");
        db_tomi.setDatabaseName("procurement");
        db_tomi.setUser("root");
        db_tomi.setPassword("");
        try {
            connection = db_tomi.getConnection();
        } catch (Exception e) {
            System.out.print("Koneksi Gagal");
            
            
        }
    }
           
    public static Connection getConnection() {
        return connection;
    }
}
