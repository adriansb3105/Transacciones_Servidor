package business;

import data.ProcesoData;
import domain.Transaccion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author adrian
 */
public class ProcesoBusiness {

    private ProcesoData procesoData;
    
    public ProcesoBusiness() {
        try {
            this.procesoData = new ProcesoData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcesoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProcesoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean deposito(Transaccion transaccion){
        try {
            return this.procesoData.deposito(transaccion);
        } catch (SQLException ex) {
            Logger.getLogger(ProcesoBusiness.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}