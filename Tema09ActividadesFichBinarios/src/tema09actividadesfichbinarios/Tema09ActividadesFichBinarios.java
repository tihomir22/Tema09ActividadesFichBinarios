/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09actividadesfichbinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class Tema09ActividadesFichBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fichero="calificaciones.data";
       String nombre="IIP";
       int conv=1;
       double data=7.9;
       
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fichero));
            out.writeUTF(nombre);
            out.writeInt(conv);
            out.writeDouble(data);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tema09ActividadesFichBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tema09ActividadesFichBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DataInputStream in=new DataInputStream(new FileInputStream(fichero));
            System.out.println("Valor leido de nombre"+in.readUTF());
            System.out.println("Valor leido de convocatoria"+in.readInt());
            System.out.println("Valor leido nota"+in.readDouble());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tema09ActividadesFichBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tema09ActividadesFichBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
