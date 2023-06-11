/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOPemilik;
import View.FormPemilik;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Pemilik;
import Model.TableModedPemilik;
import DAOInterface.IDAOPemilik;

/**
 *
 * @author LEGION
 */
public class FormController {
    
    public FormController(FormPemilik frmPml){
        this.frmPml = frmPml;
        iPemilik = new DAOPemilik();
    }
    
    public void tblContent(){
        list_pml = iPemilik.getAll();
        TableModedPemilik tblPemilik = new TableModedPemilik(list_pml);
        frmPml.getTableData().setModel(tblPemilik);
    }
    
    public void insert(){
        Pemilik pml = new Pemilik();
        pml.setnik(Integer.parseInt(frmPml.getNIK().getText()));
        pml.setNama_pemilik(frmPml.getPemilik().getText());
        pml.setAlamat(frmPml.getAlamat().getText());
        pml.setNo_telpon(Integer.parseInt(frmPml.getNoTlp().getText()));
        pml.setNama_kucing(frmPml.getHewan().getText());
        iPemilik.insert(pml);
        JOptionPane.showMessageDialog(null, "Input Berhasil");
    }
    
    public void reset(){
        if(!frmPml.getNIK().isEnabled())
            frmPml.getNIK().setEnabled(true);
        frmPml.getPemilik().setText("");
        frmPml.getNIK().setText("");
        frmPml.getAlamat().setText("");
        frmPml.getNoTlp().setText("");
        frmPml.getHewan().setText("");
        
    }
    
    public void isiField(int row)
    {
        frmPml.getNIK().setEnabled(false);
        frmPml.getPemilik().setText(list_pml.get(row).getnama_pemilik());
        frmPml.getNIK().setText(list_pml.get(row).getnik().toString());
        frmPml.getAlamat().setText(list_pml.get(row).getAlamat());
        frmPml.getNoTlp().setText(list_pml.get(row).getNo_telpon().toString());
        frmPml.getHewan().setText(list_pml.get(row).getNama_kucing());
    }
    
    public void update(){
        Pemilik pml = new Pemilik();
        pml.setNama_pemilik(frmPml.getPemilik().getText());
        pml.setAlamat(frmPml.getAlamat().getText());
        pml.setNo_telpon(Integer.parseInt(frmPml.getNoTlp().getText()));
        pml.setNama_kucing(frmPml.getHewan().getText());
        pml.setnik(Integer.parseInt(frmPml.getNIK().getText()));
        iPemilik.update(pml);
        JOptionPane.showMessageDialog(null, "update Berhasil");
    }
    
    public void delete(){
        Pemilik pml = new Pemilik();
        iPemilik.delete(Integer.parseInt(frmPml.getNIK().getText()));
        JOptionPane.showMessageDialog(null, "update Berhasil");
    } 
    
    public void cari(){
        list_pml = iPemilik.getAllByName(frmPml.gettxtCariNama().getText());
        TableModedPemilik tblPemilik = new TableModedPemilik(list_pml);
        frmPml.getTableData().setModel(tblPemilik);
    }
    
    FormPemilik frmPml;
    IDAOPemilik iPemilik;
    List<Pemilik> list_pml;
}
