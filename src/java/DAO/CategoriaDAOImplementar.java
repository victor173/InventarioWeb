
package DAO;

import Model.Categoria;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import Factory.ConexionDB;
import Factory.FactoryConexionDB;

public class CategoriaDAOImplementar implements CategoriaDAO {

    ConexionDB conn;
    private Object FactoryConexion;
    
    public CategoriaDAOImplementar(){
    this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
    }
    
    @Override
    public List<Categoria> Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria editarCat(int id_caredit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarCat(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarCat(int id_cat_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
