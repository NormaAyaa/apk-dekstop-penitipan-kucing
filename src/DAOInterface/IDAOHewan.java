/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Hewan;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface IDAOHewan {
    //Read Data
    public List<Hewan> getAll();
    //Insert Data
    public void insert(Hewan a);
     //update Data
    public void update(Hewan a);
    //delete data
    public void delete(int Id_kucing);
    // cari data
    public List<Hewan> getAllByName(String nama_kucing);
}
