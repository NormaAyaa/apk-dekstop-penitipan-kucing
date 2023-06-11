/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Helper.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Pemilik;
import DAOInterface.IDAOPemilik;

/**
 *
 * @author LEGION
 */
public class DAOPemilik implements IDAOPemilik{

    public DAOPemilik(){
        con = KoneksiDB.getConnection();
    }
    
    @Override
    public List<Pemilik> getAll() {
        List<Pemilik> list_pml = null;
        
        try {
            list_pml = new ArrayList<Pemilik>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlRead);
            
            while (rs.next()) {                
                Pemilik strg = new Pemilik();
                strg.setnik(rs.getInt("nik"));
                strg.setNama_pemilik(rs.getString("nama_pemilik"));
                strg.setAlamat(rs.getString("alamat"));
                strg.setNo_telpon(rs.getInt("no_tlp"));
                strg.setNama_kucing(rs.getString("nama_kucing"));
                list_pml.add(strg);
            }
        } catch (SQLException e){
            System.out.println("error : " + e);
        }
        
        return list_pml;
    }
    
    @Override
    public void insert(Pemilik pml) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sqlCreate);
            statement.setInt(1, pml.getnik());
            statement.setString(2, pml.getnama_pemilik());
            statement.setString(3, pml.getAlamat());
            statement.setInt(4, pml.getNo_telpon());
            statement.setString(5, pml.getNama_kucing());
            statement.execute();
                  
        } catch (SQLException e) {
            System.out.println("Berhasil Input");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input Barang");
            }
        }
    }
    
    @Override
    public void update(Pemilik pml) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sqlUpdate);
            statement.setString(1, pml.getnama_pemilik());
            statement.setString(2, pml.getAlamat());
            statement.setInt(3, pml.getNo_telpon());
            statement.setString(4, pml.getNama_kucing());
            statement.setInt(5, pml.getnik());
            statement.execute();
                  
        } catch (SQLException e) {
            System.out.println("Berhasil Update");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            }
        }
    }
    
    @Override
    public void delete(int nik) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sqlDelete);
            statement.setInt(1, nik);
            statement.execute();
                  
        } catch (SQLException e) {
            System.out.println("Berhasil delete");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal delete");
            }
        }
    }
    
    @Override
    public List<Pemilik> getAllByName(String nama_pemilik) {
        List<Pemilik> list_pml = null;
        
        try {
            list_pml = new ArrayList<Pemilik>();
            PreparedStatement st = con.prepareStatement(sqlSearch);
            st.setString(1, "%" + nama_pemilik + "%");
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {                
                Pemilik strg = new Pemilik();
                strg.setnik(rs.getInt("nik"));
                strg.setNama_pemilik(rs.getString("nama_pemilik"));
                strg.setAlamat(rs.getString("alamat"));
                strg.setNo_telpon(rs.getInt("no_tlp"));
                strg.setNama_kucing(rs.getString("nama_kucing"));
                list_pml.add(strg);
            }
        } catch (SQLException e){
            System.out.println("error : " + e);
        }
        
        return list_pml;
    }
    
    Connection con;
    String sqlCreate = "insert into tbl_pemilik (nik, nama_pemilik, alamat, no_tlp, nama_kucing) values (?, ?, ?, ?, ?);";
    String sqlRead = "Select * from tbl_pemilik;";
    String sqlUpdate = "Update tbl_pemilik set nama_pemilik=?, alamat=?, no_tlp=?, nama_kucing=? where nik=?";
    String sqlDelete = "delete from tbl_pemilik where nik=?";
    String sqlSearch = "select * from tbl_pemilik where nama_pemilik like ?;";
 
    
    
    
    
}
