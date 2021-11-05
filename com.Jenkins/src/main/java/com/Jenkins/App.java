package com.Jenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // permet de gérer les opérations sur les employés: créer, modifier, supprimer,...
        GestionEmploye ge = new GestionEmploye();
        ge.menu();
    }
}
