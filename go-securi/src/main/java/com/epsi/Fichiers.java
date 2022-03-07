package com.epsi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fichiers 
{
    public ArrayList<String> list_staff = new ArrayList<String>();
    public ArrayList<Agent> list_agents = new ArrayList<Agent>();
    public String header = "<!DOCTYPE html><html><head><meta charset='utf-8'><link rel='stylesheet' type='text/css' href='/Users/lucas/Projects/MSPR/go-securi/static/style/css/styles.css'/></head><body><div id='container'><div id='header'><a href='/Users/lucas/Projects/MSPR/go-securi/templates/index.html'><img style='width: 200px; height:150px;' src='/Users/lucas/Projects/MSPR/go-securi/logo.png'></a></div></div>";
    public String footer = "<div id='footer'><p>Projet MSPR - EPSI Auxerre</p></div></div></body></html>";
    public final Map<String, String> list_tools = new HashMap<String, String>();

    public void readStaff() throws IOException
    {
        Scanner s = new Scanner(new File("go-securi/staff.txt"));
        while (s.hasNextLine()){
            list_staff.add(s.nextLine());
        }
        s.close();
    }

    public void readTools() throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("/Users/lucas/Projects/MSPR/go-securi/liste.txt"));
        String strCurrentLine;
        while ((strCurrentLine = r.readLine()) != null){
            list_tools.put(strCurrentLine.split("\t")[0], strCurrentLine.split("\t")[1]);
        }
        r.close();
    }

    public void readAgent() throws IOException
    {
        String name = null;
        String firstname = null;
        String mission = null;
        String password = null;
        ArrayList<String> tools;
        
        for(String a : list_staff){
            BufferedReader s = new BufferedReader(new FileReader("/Users/lucas/Projects/MSPR/go-securi/" + a + ".txt"));
            tools = new ArrayList<>();
            String str;
            int i = 1;
            while ((str = s.readLine()) != null){
                
                if(!str.isEmpty()){
                    if(i == 1){
                        name = str;
                    }else if(i == 2){
                        firstname = str;
                    }else if(i == 3){
                        mission = str;
                    }else if(i == 4){
                        password = str;
                    }else{
                        tools.add(list_tools.get(str));
                    }
                    i++;
                }   
            }
            s.close();
            Agent agent = new Agent(name, firstname, mission, password, tools);
            list_agents.add(agent);
        }
    }

    public void writeIndex() throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/lucas/Projects/MSPR/go-securi/templates/index.html")));
        bw.write(header);
        //Navigation
        bw.write("<div id='accueil' style='text-align:center'>");
        bw.write("<br>");
        bw.write("<h2>AGENTS</h2>");
        bw.write("<ul>");
        for (Agent a : list_agents){
            
            bw.write("<a href='/Users/lucas/Projects/MSPR/go-securi/templates/" + (a.getFirstname().charAt(0) + a.getName()).toLowerCase() + ".html'>" + a.getFirstname() + " " + a.getName() + "</a><br><br><br>");
            
        }
        bw.write("</div>");
        bw.write(footer);
        bw.close();
    }

    public void writeAgent() throws IOException{
        
        //PARTIE POUR CHAQUE FICHIER AGENT 
        for (Agent o : list_agents){
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/lucas/Projects/MSPR/go-securi/templates/" + (o.getFirstname().charAt(0) + o.getName()).toLowerCase() + ".html")));
            bw.write(header);

            //affichage contenu
            bw.write("<div id='wrapper'><div id='content'>");
            bw.write("<br>");
            bw.write("<h2>"+o.getFirstname()+ " " +o.getName()+"</h2>");
            bw.write("<br>");
            bw.write("<h3>Equipements : </h3>");
            bw.write("<div><ul>");
            

            for (int i = 0; i < o.getTools().size(); i++) {
                bw.write("<li>");
                bw.write(o.getTools().get(i));
                bw.write("</li>");
            }        
            bw.write("</ul></div>");
            bw.write("</div></div>");

            //Navigation
            bw.write("<div id='navigation'><ul>");
            for (Agent a : list_agents){
                bw.write("<li>");
                bw.write("<a href='/Users/lucas/Projects/MSPR/go-securi/templates/" + (a.getFirstname().charAt(0) + a.getName()).toLowerCase() + ".html'>" + a.getFirstname() + " " + a.getName() + "</a>");
                bw.write("</li>\n");
            }
            bw.write("</div>");

            //Affichage piece identité
            bw.write("<div id='extra'>");
            bw.write("<img style='width:300px; height:200px' src='/Users/lucas/Projects/MSPR/go-securi/"+(o.getFirstname().charAt(0) + o.getName()).toLowerCase()+".jpg'>");
            bw.write("</div>");
            
            
            bw.write(footer);
            bw.close();
        }
    }

    
}