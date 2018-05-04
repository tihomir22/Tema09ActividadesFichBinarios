/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09actividadesfichbinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
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
public class EjercicioBinarios03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichero="ficheroprueba2";
        try {
            DataOutputStream out=new DataOutputStream(new FileOutputStream(fichero));
            DataInputStream in=new DataInputStream(new FileInputStream(fichero));
            for (int i = 0; i < 100; i++) {
                if(i % 10==0){
                   out.writeInt(i);
                }
            }
            out.close();
            for (int i = 0; i < 100; i++) {
                System.out.println(in.readInt());
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioBinarios03.class.getName()).log(Level.SEVERE, null, ex);
        }catch(EOFException e){
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            Logger.getLogger(EjercicioBinarios03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
