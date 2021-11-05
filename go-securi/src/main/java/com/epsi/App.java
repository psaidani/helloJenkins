package com.epsi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        try
    {
      // Le fichier d'entrée
      File file = new File("cberthier.txt");    
      // Créer l'objet File Reader
      FileReader fr = new FileReader(file);  
      // Créer l'objet BufferedReader        
      BufferedReader br = new BufferedReader(fr);  
      StringBuffer sb = new StringBuffer();    
      String line;
      while((line = br.readLine()) != null)
      {
        // ajoute la ligne au buffer
        sb.append(line);      
        sb.append("\n");     
      }
      fr.close();    
      System.out.println("Contenu du fichier: ");
      System.out.println(sb.toString());  
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    }
}
