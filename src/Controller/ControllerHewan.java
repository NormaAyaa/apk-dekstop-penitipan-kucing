/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAOHewan;
import DAOInterface.IDAOHewan;
import Model.Hewan;
import Model.TabelModelHewan;
import View.FormHewan;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class ControllerHewan {
    
    
    public ControllerHewan(FormHewan frmHewan){
        this.frmHewan = frmHewan;
        iHewan = new DAOHewan();
        
    }
    
    public void isiTable()
    {
        lstHwn = iHewan.getAll();
        TabelModelHewan tabelHwn = new TabelModelHewan(lstHwn);
        frmHewan.getTableData().setModel(tabelHwn);
    }
    
    public void insert()
    {
        Hewan a = new Hewan();
        a.setId_kucing(Integer.valueOf(frmHewan.getId_kucing().getText()));
        a.setJenis_Kelamin(frmHewan.getJenis_Kelamin().getSelectedItem().toString());
        a.setKesehatan(frmHewan.getKesehatan().getText());
        a.setNama_kucing(frmHewan.getnama_kucing().getText());
        a.setRas(frmHewan.getRas().getText());
        a.setRiw_Peny(frmHewan.getRiw_Peny().getText());
        a.setTgl_keluar(frmHewan.gettgl_keluar().getText());
        a.setTgl_masuk(frmHewan.gettgl_masuk().getText());
        a.setUmur(Integer.valueOf(frmHewan.getUmur().getText()));
        iHewan.insert(a);
        JOptionPane.showMessageDialog(null, "Input Berhasil");
    }
    
    public void reset()
    {
        if(frmHewan.getId_kucing().isEnabled())
        frmHewan.getId_kucing().setEnabled(true);
        frmHewan.getId_kucing().setText("");
        frmHewan.getnama_kucing().setText("");
        frmHewan.getRas().setText("");
        frmHewan.getKesehatan().setText("");
        frmHewan.getRiw_Peny().setText("");
        frmHewan.gettgl_keluar().setText("");
        frmHewan.gettgl_masuk().setText("");
        frmHewan.getJenis_Kelamin().setSelectedItem("");
        frmHewan.getUmur().setText("");
    }
    
    public void isiField(int row)
    {
        frmHewan.getId_kucing().setEnabled(false);
        frmHewan.getId_kucing().setText(lstHwn.get(row).getId_kucing().toString());
        frmHewan.getnama_kucing().setText(lstHwn.get(row).getNama_kucing());
        frmHewan.getRas().setText(lstHwn.get(row).getRas());
        frmHewan.getKesehatan().setText(lstHwn.get(row).getKesehatan());
        frmHewan.getRiw_Peny().setText(lstHwn.get(row).getRiw_Peny());
        frmHewan.gettgl_keluar().setText(lstHwn.get(row).getTgl_keluar());
        frmHewan.gettgl_masuk().setText(lstHwn.get(row).getTgl_masuk());
        frmHewan.getJenis_Kelamin().setSelectedItem(lstHwn.get(row).getJenis_Kelamin());
        frmHewan.getUmur().setText(lstHwn.get(row).getUmur().toString());
    }
    
    public void update()
    {
        Hewan a = new Hewan();
        a.setJenis_Kelamin(frmHewan.getJenis_Kelamin().getSelectedItem().toString());
        a.setKesehatan(frmHewan.getKesehatan().getText());
        a.setNama_kucing(frmHewan.getnama_kucing().getText());
        a.setRas(frmHewan.getRas().getText());
        a.setRiw_Peny(frmHewan.getRiw_Peny().getText());
        a.setTgl_keluar(frmHewan.gettgl_keluar().getText());
        a.setTgl_masuk(frmHewan.gettgl_masuk().getText());
        a.setUmur(Integer.parseInt(frmHewan.getUmur().getText()));
        a.setId_kucing(Integer.parseInt(frmHewan.getId_kucing().getText()));
        iHewan.update(a);
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    }
    
    public void delete()
    {
        iHewan.delete(Integer.parseInt(frmHewan.getId_kucing().getText()));
        JOptionPane.showMessageDialog(null, "Delete Berhasil");
    }
    
    public void cari()
    {
        lstHwn = iHewan.getAllByName(frmHewan.gettxtCariNama().getText());
        TabelModelHewan tabelHwn = new TabelModelHewan(lstHwn);
        frmHewan.getTableData().setModel(tabelHwn);
    }
            
            
    FormHewan frmHewan;
    IDAOHewan iHewan;
    List<Hewan> lstHwn;
}
