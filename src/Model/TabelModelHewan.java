/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class TabelModelHewan extends AbstractTableModel{

    
    public TabelModelHewan(List<Hewan> lstHwn) 
    {
        this.lstHwn = lstHwn;
    }

    @Override
    public int getRowCount() {
        return this.lstHwn.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return switch (column) {
            case 0 -> "ID";
            case 1 -> "Tanggal Penitipan";
            case 2 -> "Tanggal Pengambilan";
            case 3 -> "Nama Kucing";
            case 4 -> "Ras";
            case 5 -> "Umur";
            case 6 -> "Jenis Kelamin";
            case 7 -> "Kondisi Kesehatan";
            case 8 -> "Vaksin Terakhir";
            case 9 -> "Riwayat Penyakit";
            default -> null;
        };
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> lstHwn.get(rowIndex).getId_kucing();
            case 1 -> lstHwn.get(rowIndex).getTgl_masuk();
            case 2 -> lstHwn.get(rowIndex).getTgl_keluar();
            case 3 -> lstHwn.get(rowIndex).getNama_kucing();
            case 4 -> lstHwn.get(rowIndex).getRas();
            case 5 -> lstHwn.get(rowIndex).getUmur();
            case 6 -> lstHwn.get(rowIndex).getJenis_Kelamin();
            case 7 -> lstHwn.get(rowIndex).getKesehatan();
            case 8 -> lstHwn.get(rowIndex).getVaksin();
            case 9 -> lstHwn.get(rowIndex).getRiw_Peny();
            default -> null;
        };
    }
    
    List<Hewan> lstHwn;
    
}
