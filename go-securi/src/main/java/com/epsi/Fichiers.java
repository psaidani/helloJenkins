package com.epsi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class Fichiers 
{
    public ArrayList<String> list_staff = new ArrayList<String>();
    public ArrayList<String> fiche_agent = new ArrayList<String>();
    public String header = "<!DOCTYPE html><html><head><meta charset=\"utf-8\"><link rel=\"stylesheet\" href=\"style/css/styles.css\" /></head><body><div class=\"container\"><header><h1>Go-Securi</h1><style type=\"text/css\">.container {color: black;}</style></header><section class=\"container\"><div><h1 style=\"color : black\">Agents</h1></div></section><section id=\"sidebar\"><div class=\"navigation\">";
    public String footer = "</section></div></body></html>";


    public void readStaff() throws IOException
    {
        Scanner s = new Scanner(new File("go-securi/staff.txt"));
        while (s.hasNext()){
            list_staff.add(s.next());
        }
        s.close();

        System.out.println(list_staff);
    }

    public void writeIndex() throws IOException
    {
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/lucas/Projects/MSPR/go-securi/templates/index.html")));
        bw.write(header);
        bw.write("<nav>\n<ul>\n");
        for (String str : list_staff ){
            bw.write("<li>");
            bw.write("<a href='/Users/lucas/Projects/MSPR/go-securi/templates/" + str + ".html'>" + str + "</a>");
            bw.write("</li>\n");
        }
        bw.write("</ul>\n</nav>");
        bw.write(footer);
        bw.close();
    }


    public void readAgent() throws IOException
    {
        for(String a : list_staff){
            Scanner s = new Scanner(new File("/Users/lucas/Projects/MSPR/go-securi/" + a + ".txt"));
            System.out.println(a);
            while (s.hasNext()){
                fiche_agent.add(s.next());
            }
            s.close();

            System.out.println(fiche_agent);
        }
    }

    public void writeAgent() throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/lucas/Projects/MSPR/go-securi/templates/.html")));
        bw.write(header);
        bw.write("");
        //PARTIE POUR CHAQUE FICHIER AGENT 
        for (String str : fiche_agent ){
            bw.write("<li>");
            bw.write(str);
            bw.write("</li>\n");
        }
        bw.write("</ul>\n</nav>");
        bw.write(footer);
        bw.close();
    }  

    /* read agentfile */
    /* list de variable */
    // for(string a : staffList)





}