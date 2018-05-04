/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09actividadesfichbinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class EjerciciosBinarios01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichero = "ficheroprueba";
        int suma=0,num;
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(new File(fichero)));
            DataInputStream in = new DataInputStream(new FileInputStream(new File(fichero)));
            for (int i = 0; i < 100; i++) {
                out.writeInt(i);
            }
            out.close();
            for (int i = 0; i < 100; i++) {
                num=in.readInt();
                suma+=num;
                
            }
            System.out.println(suma);
            in.close();
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjerciciosBinarios01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjerciciosBinarios01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
