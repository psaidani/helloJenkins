package com.epsi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    static ArrayList<String> result = new ArrayList<>();
    public static void main( String[] args ) throws IOException
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

        File outputFile = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));


      e.printStackTrace();
    }
    }
}
