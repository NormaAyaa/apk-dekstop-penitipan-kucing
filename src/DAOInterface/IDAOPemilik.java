/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import java.util.List;
import Model.Pemilik;

/**
 *
 * @author LEGION
 */
public interface IDAOPemilik {
    public List<Pemilik> getAll();
    
    public void insert(Pemilik pml);
    
    public void update(Pemilik pml);
    
    public void delete(int nik);
    
    public List<Pemilik> getAllByName(String nama_pemilik);
}
