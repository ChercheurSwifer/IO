package fr.io;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

       System.out.println(NomPrenomReader.readNom());
       System.out.println(NomPrenomReader.readPrenom());
       UtilisateurWriter.writeUtilisateur("toto.txt",50);
    }
}
