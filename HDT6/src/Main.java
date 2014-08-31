
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cont = true;
        
        while(cont){
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de implementacion desea usar:"
                    + "1. HashSet"
                    + "2. TreeSet"
                    + "3. LinkedHashSet"));
            if(opc==1){
                
                HashSet<Desarrolladores> personas = new HashSet<Desarrolladores>();
            }
            if(opc==2){
                TreeSet<Desarrolladores> personas = new TreeSet<Desarrolladores>();
            }
            if(opc==3){
                LinkedHashSet<Desarrolladores> personas = new LinkedHashSet<Desarrolladores>();
            }
        }
    }
    
}
