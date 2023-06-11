/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.PilihPaket;
import java.util.List;

/**
 *
 * @author LENOVO9
 */
public interface IDAOPilihPaket {
    // read data
    public List<PilihPaket> getAll();
    // insert data
    public void insert(PilihPaket b);
    // update data
    public void update(PilihPaket b);
    //delete data
    public void delete(String paket);
    //cari data
    public List<PilihPaket> getAllByName(String paket);
}
