 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOPilihPaket;
import DAOInterface.IDAOPilihPaket;
import Model.PilihPaket;
import Model.TabelModelPilihPaket;
import View.FormPaket;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO9
 */
public class ControllerPilihPaket {

    
    public ControllerPilihPaket(FormPaket frmPilPaket)
    {
        this.frmPilPaket = frmPilPaket;
        iPilihPaket = new DAOPilihPaket();
        
    }
    
    public void isiTable()
    {
        pilPaket = iPilihPaket.getAll();
        TabelModelPilihPaket tblPilPaket = new TabelModelPilihPaket(pilPaket);
        frmPilPaket.getTblPaket().setModel(tblPilPaket);
    }
    
    public void insert()
    {
        PilihPaket b = new PilihPaket();
        b.setPaket(frmPilPaket.getSetPilPaket().getSelectedItem().toString());
        b.setJenis_makanan(frmPilPaket.getTxtPilMakanan().getText());
        iPilihPaket.insert(b);
        JOptionPane.showMessageDialog(null, "input berhasil");
    }
    
    /**
     *
     */
    public void reset()
    {
        frmPilPaket.getSetPilPaket().setSelectedItem("");
        frmPilPaket.getTxtPilMakanan().setText("");
    }
    
    /**
     *
     * @param row
     */
    public void selectTable(int row)
    {
        frmPilPaket.getSetPilPaket().setSelectedItem(pilPaket.get(row).getPaket());
        frmPilPaket.getTxtPilMakanan().setText(pilPaket.get(row).getJenis_makanan());
    }
    
    public void update()
    {
        PilihPaket b = new PilihPaket();
        b.setPaket(frmPilPaket.getSetPilPaket().getSelectedItem().toString());
        b.setJenis_makanan(frmPilPaket.getTxtPilMakanan().getText());
        iPilihPaket.update(b);
        JOptionPane.showMessageDialog(null, "update berhasil");
    }
            
    public void delete()
    {
        PilihPaket b = new PilihPaket();
        iPilihPaket.delete(frmPilPaket.getSetPilPaket().getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "delete berhasil");
    }
    
    public void cari()
    {
        pilPaket = iPilihPaket.getAllByName(frmPilPaket.getTxtCariNama().getText());
        TabelModelPilihPaket tblPilPaket = new TabelModelPilihPaket(pilPaket);
        frmPilPaket.getTblPaket().setModel(tblPilPaket);
    }
    
    FormPaket frmPilPaket;
    IDAOPilihPaket iPilihPaket;
    List<PilihPaket> pilPaket;

   
}
