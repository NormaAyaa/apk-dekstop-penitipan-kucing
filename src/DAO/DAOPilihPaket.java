/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Helper.KoneksiDB;
import Model.PilihPaket;
import java.sql.PreparedStatement;
//import com.mysql.jdbc.ResultSetImpl;
//import com.mysql.jdbc.Statement;
//import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOInterface.IDAOPilihPaket;

/**
 *
 * @author LENOVO9
 */
public class DAOPilihPaket implements IDAOPilihPaket{
    
    public DAOPilihPaket()
    {
        con = KoneksiDB.getConnection();
    }

    @Override
    public List<PilihPaket> getAll() {
        List<PilihPaket> pilPaket = null;
        try
        {
            pilPaket = new ArrayList<PilihPaket>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while(rs.next())
            {
                
                PilihPaket pilPkt = new PilihPaket();
                pilPkt.setPaket(rs.getString("Paket"));
                pilPkt.setJenis_makanan(rs.getString("Jenis_makanan"));
                pilPaket.add(pilPkt);
            }
            
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return pilPaket;
    }
    
    

    public void insert(PilihPaket b) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement (strInsert);
            statement.setString(1, b.getPaket());
            statement.setString(2, b.getJenis_makanan());
            statement.execute();
        }
        catch(SQLException e)
        {
            System.out.println("error e :" + e);
            System.out.println("gagal input");
        }
        finally
        {
            try
            {
                statement.close();
            } catch(SQLException ex){
                System.out.println("gagal input");
            }
        }
        
    }
    
    public void update(PilihPaket b) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement (strUpdate);
            statement.setString(1, b.getJenis_makanan());
            statement.setString(2, b.getPaket());
            statement.execute();
        }
        catch(SQLException e)
        {
            System.out.println("error e :" + e);
            System.out.println("gagal update");
        }
        finally
        {
            try
            {
                statement.close();
            } catch(SQLException ex){
                System.out.println("gagal update");
            }
        }
    }
     
    public void delete(String paket) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement (strDelete);
            statement.setString(1, paket);
            statement.execute();
        }
        catch(SQLException e)
        {
            System.out.println("error e :" + e);
            System.out.println("gagal delete");
        }
        finally
        {
            try
            {
                statement.close();
            } catch(SQLException ex){
                System.out.println("gagal delete");
            }
        }
    }
    
    @Override
    public List<PilihPaket> getAllByName(String paket) {
        List<PilihPaket> pilPaket = null;
        try
        {
            pilPaket = new ArrayList<PilihPaket>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%" + paket + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                PilihPaket pilPkt = new PilihPaket();
                pilPkt.setPaket(rs.getString("Paket"));
                pilPkt.setJenis_makanan(rs.getString("Jenis_makanan"));
                pilPaket.add(pilPkt);
            }
            
        }
        catch(SQLException e)
        {
            System.out.println("error: "+e);
        }
        return pilPaket;
    }
    
    Connection con;
    // SQL Query
    //String strRead = "select tbl_pemilik.nik, tbl_pemilik.nama_pemilik, tbl_pemilik.alamat, tbl_pemilik.no_tlp, tbl_pemilik.nama_kucing from tbl_pemilik inner join tbl_paket on tbl_pemilik.nik = tabel_paket.nik;";
    String strRead = "select * from tbl_paket;";
    String strInsert = "insert into tbl_paket ( paket, jenis_makanan) values (?,?);";
    String strUpdate = "update tbl_paket set jenis_makanan=? where paket=?;";
    String strDelete = "delete from tbl_paket where paket=?;";
    String strSearch = "select * from tbl_paket where paket like ?;";
    

    
}
