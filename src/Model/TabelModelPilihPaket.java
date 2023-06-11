/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LENOVO9
 */
public class TabelModelPilihPaket extends AbstractTableModel{
    
    public TabelModelPilihPaket(List<PilihPaket> pilPaket)
    {
        this.pilPaket = pilPaket;
    }

    @Override
    public int getRowCount() {
        return this.pilPaket.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return switch (column) {
            case 0 -> "Paket yang Dipilih";
            case 1 -> "Jenis Makanan";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> pilPaket.get(rowIndex).getPaket();
            case 1 -> pilPaket.get(rowIndex).getJenis_makanan();
            default -> null;
        };
                
    }
    
    List<PilihPaket> pilPaket;
}
