/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobiles.app;

import com.database.myconnection;
import java.sql.SQLException;

/**
 *
 * @author mohamedpc
 */
public class MobilesApp {
public static myconnection connect_and_excute = new myconnection();
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        MacIp ipo = new MacIp();
        if(ipo.mac_value()==false){
        login m = new login ();
        connect_and_excute.connect_fuction();
        
        }
    }
    
}
