package com.openbootcamp_modulo10;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Input_Stream {

    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte[] datos = fichero.readAllBytes();

                for (byte dato : datos){
                    System.out.print((char)dato);
                }

           } catch (IOException e){
            System.out.println("No pudo leer el fichero: " + e.getMessage());
           }

        }catch (FileNotFoundException e){
            System.out.println("Oye, el programa da error: " + e.getMessage());
        }

    }
}
