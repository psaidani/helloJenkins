package com.epsi;

import java.io.IOException;



public class App 
{
    public static void main( String[] args ) throws IOException
    {
<<<<<<< HEAD
        System.out.println( "Hello World! - mspr - test" );
||||||| e90fa55
        System.out.println( "Hello World! - mspr" );
=======
        Fichiers f = new Fichiers();
        f.readStaff();
        f.readAgent();

        f.writeIndex();
        f.writeAgent();
        
>>>>>>> dev
    }
}