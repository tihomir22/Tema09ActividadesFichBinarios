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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class EjercicioBinario05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int col, fil;
        double num;
        System.out.println("Introduce num de columnas de la matriz");
        col = teclado.nextInt();
        System.out.println("Introduce num de filas de la matriz");
        fil = teclado.nextInt();
        String fichero = "ficheroprueba5";
        double[][] matriz = new double[fil][col];
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fichero));
            DataInputStream in = new DataInputStream(new FileInputStream(fichero));
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (i == 0 && j == 0) {
                        out.writeDouble(col);
                        out.writeDouble(fil);
                    }
                    System.out.println("Introduce numero para la fila " + i + " y en la columna " + j);
                    num = teclado.nextDouble();
                    out.writeDouble(num);
                }
            }
            leerFichero(in);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioBinario05.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            Logger.getLogger(EjercicioBinario05.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void leerFichero(DataInputStream in) throws IOException {
        while (true) {
            System.out.println(in.readDouble());

        }
    }

}
