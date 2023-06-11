/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LEGION
 */
public class TableModedPemilik extends AbstractTableModel{
    
    public TableModedPemilik(List<Pemilik> list_pml){
        this.list_pml = list_pml;
    }
    
    @Override
    public int getRowCount() {
        return this.list_pml.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        return switch (column) {
            case 0 -> "NIK";
            case 1 -> "Nama Pemilik";
            case 2 -> "Alamat";
            case 3 -> "No Telpon";
            case 4 -> "Kucing kamu";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> list_pml.get(rowIndex).getnik();
            case 1 -> list_pml.get(rowIndex).getnama_pemilik();
            case 2 -> list_pml.get(rowIndex).getAlamat();
            case 3 -> list_pml.get(rowIndex).getNo_telpon();
            case 4 -> list_pml.get(rowIndex).getNama_kucing();
            default -> null;
        };
    }
    
    List<Pemilik> list_pml;
}
