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
public class EjercicioBinario06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichero = ("ficheroprueba3");
        try {
            DataInputStream in = new DataInputStream(new FileInputStream(fichero));
            leerFichero(in);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioBinario06.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            Logger.getLogger(EjercicioBinario06.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void leerFichero(DataInputStream in) throws IOException {
        while (true) {
            System.out.println(in.readInt());

        }
    }

}
