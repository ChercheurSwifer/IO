package fr.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class UtilisateurWriter extends NomPrenomReader
{
    public static void writeUtilisateur(String unNomDeFichier, int combien) throws IOException
    {
        File file = new File(unNomDeFichier);
        try (PrintWriter writer = new PrintWriter(new File(unNomDeFichier)))
        {
                StringBuilder sb = new StringBuilder();
                int i = combien;
                Random rand = new Random();
                int nom_size = NomPrenomReader.readNom().size();
                int prenom_size = NomPrenomReader.readPrenom().size();
                for(i = 0; i < combien ; i++)
                {
                    sb.append(i + ";");
                    sb.append(NomPrenomReader.readNom().get(rand.nextInt(nom_size)));
                    sb.append(NomPrenomReader.readPrenom().get(rand.nextInt(prenom_size)));
                    NomPrenomReader.readNom().forEach(nom ->{
                        sb.append(nom + ";");
                    } );
                    NomPrenomReader.readPrenom().forEach(prenom ->{
                        sb.append(prenom + ";");
                    } );
                }

                writer.write(sb.toString());
                writer.close();
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        }
}

