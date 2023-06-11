/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOHewan;
import Helper.KoneksiDB;
import Model.Hewan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

/**
 *
 * @author Lenovo
 */

public class DAOHewan implements IDAOHewan{
    
    
    public DAOHewan()
    {
        con = KoneksiDB.getConnection();
    }

    @Override
    public List<Hewan> getAll() 
    {
        List<Hewan> lstHwn = null;
        try
        {
            lstHwn = new ArrayList<Hewan>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strread);
            
            while(rs.next())
            {
                Hewan Hwn = new Hewan();
                Hwn.setId_kucing(rs.getInt("Id_kucing"));
                Hwn.setNama_kucing(rs.getString("nama_kucing"));
                Hwn.setRas(rs.getString("Ras"));
                Hwn.setJenis_Kelamin(rs.getString("Jenis_Kelamin"));
                Hwn.setVaksin(rs.getString("Vaksin"));
                Hwn.setKesehatan(rs.getString("Kesehatan"));
                Hwn.setRiw_Peny(rs.getString("Riw_Peny"));
                Hwn.setTgl_masuk(rs.getString("tgl_masuk"));
                Hwn.setTgl_keluar(rs.getString("tgl_keluar"));
                Hwn.setUmur(rs.getInt("Umur"));
                lstHwn.add(Hwn);
            }  
        }
        catch(SQLException e)
        {
            System.out.println("Error: "+ e());
        }
        return lstHwn;
    }
    
    private String e() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Hewan a) {
       PreparedStatement statement = null;
       try
       {
           statement = con.prepareStatement(strinsert);
           statement.setInt(1, a.getId_kucing());
           statement.setString(2, a.getNama_kucing());
           statement.setString(3, a.getRas());
           statement.setInt(4, a.getUmur());
           statement.setString(5, a.getJenis_Kelamin());
           statement.setString(6, a.getKesehatan());
           statement.setString(7,a.getVaksin());
           statement.setString(8, a.getRiw_Peny());
           statement.setString(9, a.getTgl_masuk());
           statement.setString(10, a.getTgl_keluar());
           statement.execute();
       }catch(SQLException e)
       {
           System.out.println("gagal Input");
       }
       finally
       {
           try {
               statement.close();
           } catch (SQLException ex)
           {
               System.out.println("gagal Input");
           }
       }
    }
    
    @Override
    public void update(Hewan a) {
        PreparedStatement statement = null;
       try
       {
           statement = con.prepareStatement(strupdate); 
           statement.setString(1, a.getNama_kucing());
           statement.setString(2, a.getRas());
           statement.setInt(3, a.getUmur());
           statement.setString(4, a.getJenis_Kelamin());
           statement.setString(5, a.getKesehatan());
           statement.setString(6,a.getVaksin());
           statement.setString(7, a.getRiw_Peny());
           statement.setString(8, a.getTgl_masuk());
           statement.setString(9, a.getTgl_keluar());
           statement.setInt(10, a.getId_kucing());
           statement.execute();
       }catch(SQLException e)
       {
           System.out.println("gagal Update");
       }
       finally
       {
           try {
               statement.close();
           } catch (SQLException ex)
           {
               System.out.println("gagal Update");
           }
       }
    }
    
    @Override
    public void delete(int Id_kucing) {
        PreparedStatement statement = null;
       try
       {
           statement = con.prepareStatement(strdelete); 
           statement.setInt(1, Id_kucing);
           statement.execute();
       }catch(SQLException e)
       {
           System.out.println("gagal Delete");
       }
       finally
       {
           try {
               statement.close();
           } catch (SQLException ex)
           {
               System.out.println("gagal Delete");
           }
       }
    }
    
    @Override
    public List<Hewan> getAllByName(String nama_kucing) {
        List<Hewan> lstHwn = null;
        try
        {
            lstHwn = new ArrayList<Hewan>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%" + nama_kucing + "%");
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Hewan Hwn = new Hewan();
                Hwn.setId_kucing(rs.getInt("Id_kucing"));
                Hwn.setNama_kucing(rs.getString("nama_kucing"));
                Hwn.setRas(rs.getString("Ras"));
                Hwn.setJenis_Kelamin(rs.getString("Jenis_Kelamin"));
                Hwn.setVaksin(rs.getString("Vaksin"));
                Hwn.setKesehatan(rs.getString("Kesehatan"));
                Hwn.setRiw_Peny(rs.getString("Riw_Peny"));
                Hwn.setTgl_masuk(rs.getString("tgl_masuk"));
                Hwn.setTgl_keluar(rs.getString("tgl_keluar"));
                Hwn.setUmur(rs.getInt("Umur"));
                lstHwn.add(Hwn);
            } 
        }
        catch(SQLException e)
        {
            System.out.println("Error: "+ e());
        }
        return lstHwn;
    }
    
    Connection con;
    //SQL Query
    String strread = "SELECT *FROM tbl_hewan"; 
    String strinsert = "insert into tbl_hewan(Id_kucing,nama_kucing,Ras,Umur,Jenis_Kelamin,Kesehatan,Vaksin,Riw_Peny,tgl_masuk,tgl_keluar) values (?,?,?,?,?,?,?,?,?,?);";
    String strupdate = "update tbl_hewan set nama_kucing=?, Ras=?, Umur=?, Jenis_Kelamin=?, Kesehatan=?, Vaksin=?, Riw_Peny=?, tgl_masuk=?, tgl_keluar=? where Id_kucing=?";
    String strdelete = "delete from tbl_hewan where Id_kucing=?";
    String strSearch = "SELECT *FROM tbl_hewan where nama_kucing like ?;"; 

    
    
}
