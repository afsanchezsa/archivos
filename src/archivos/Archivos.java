/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        System.out.println("Nombre del Archivo");
        String nombre = lectura.next();
        String[] listaArchivos = null;

       // File archivo2=new File(nombre);
        File archivo = new File(nombre);
        if (archivo.exists()) {
            System.out.println("existe");
            if (archivo.isDirectory()) {
                listaArchivos = archivo.list();
                System.out.println("la carpeta tiene " + listaArchivos.length);
            }

        } else {
            try{
            PrintStream salida=new PrintStream(archivo);
            salida.println("hola");
            salida.flush();
            salida.close();
            
            }catch(FileNotFoundException e){
            
            
            }
            
            
            
            
            
            
            try {
                archivo.createNewFile();// si no existe el archivo entonces este metodo me lo crea y le pone el nombre que yo puse en file
                System.out.println(archivo.getAbsolutePath());

            } catch (IOException ex) {
                System.out.println("NO se puede crear el archivo" + ex.getMessage());
            }
            /*  try {
             //  archivo2.createNewFile();
             } catch (IOException ex) {
               
             }*/
            System.out.println("no existe");

        }
    buscar_archivos("raiz");
        //Archivos ahora=new Archivos();
        //ahora.ListarArchivos(nombre);
    }

    public static void buscar_archivos(String carpeta) {
        File archivo = new File(carpeta);
        ArrayList<String> total=new ArrayList<>();
        String[] lista = null;
        if (archivo.exists()) {

            if (archivo.isDirectory()) {
             lista=archivo.list();
             for(String s:lista){
             //total.add(s);
             if(new File(s).isDirectory()){
             buscar_archivos(carpeta+"/"+s);
             
             }else{
                 System.out.println(s);
             
             }
             }
            } else {
                System.out.println("el archivo no existe");
            }

        }

    }
    public void ListarArchivos(String ruta){
    String[]lista=null;
    File archivo=new File(ruta);
    File archivointerno=null;
    if(archivo.exists()){
    
    if(archivo.isFile()){
        System.out.println(archivo.getName());
    
    }else{
    lista=archivo.list();
    for(String nombre:lista){
    this.ListarArchivos(ruta+"/"+nombre);
    
    }
    
    }
    }
    }
}
