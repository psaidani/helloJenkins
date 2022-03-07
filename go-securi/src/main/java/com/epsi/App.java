package com.epsi;

import java.io.IOException;



public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Fichiers f = new Fichiers();
        f.readStaff();
        f.readTools();
        f.readAgent();
        f.writeIndex();
        f.writeAgent();

    }
}