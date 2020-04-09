/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spp.npm046;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomz
 */
public class PurchaseOrderDataSource {
    
    private Connection connection;
    private PurchaseOrder purchaseOrder;
    
    public PurchaseOrderDataSource() {
        connection = DatabaseUtility.getConnection();
        
    }
    public List<PurchaseOrder>getAll(){
        List<PurchaseOrder> list = new ArrayList<>();
    String sql = "Select * Form PurchaseOrder";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            PurchaseOrder purchaseOrder;
            while (rs.next()) {
                purchaseOrder = new PurchaseOrder();
                purchaseOrder.setIdPO(rs.getString("idPO"));
                purchaseOrder.setDeskripsi(rs.getString("Deskripsi"));
                purchaseOrder.setTanggalPO(rs.getString("TanggalPO"));
                purchaseOrder.setSupplier(rs.getString("Supplier"));
                purchaseOrder.setTotalPO(rs.getString("TotalPO"));
                list.add(purchaseOrder);
                
            }
        } catch (Exception e) {
        }
    }
    
   

}
