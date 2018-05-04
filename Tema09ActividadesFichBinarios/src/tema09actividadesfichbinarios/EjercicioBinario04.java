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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class EjercicioBinario04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichero = ("ficheroprueba3");
        int num;
        Scanner teclado = new Scanner(System.in);
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fichero));
            DataInputStream in = new DataInputStream(new FileInputStream(fichero));
            do {
                num = teclado.nextInt();
                out.writeInt(num);
                System.out.println(in.readInt());
            } while (num != -1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioBinario04.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjercicioBinario04.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
