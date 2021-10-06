package fr.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NomPrenomReader
{
    private static List<String> readFichier(String File) throws IOException
    {
        BufferedReader bufferedReader = null;
        List<String> lines = new ArrayList<String>();
        bufferedReader = new BufferedReader(new FileReader(File));
        String line = bufferedReader.readLine();

        while (line != null) {
            line = bufferedReader.readLine();
            if ( line != null ) {
                lines.add(line);
            }
        }
        bufferedReader.close();
        return lines;
    }

    public static List<String> readNom() throws IOException
    {
        return readFichier("C:\\Users\\Administrateur\\IdeaProjects\\IO\\src\\fr\\io\\nom.txt");
    }

    public static List<String> readPrenom() throws IOException
    {
        return readFichier("C:\\Users\\Administrateur\\IdeaProjects\\IO\\src\\fr\\io\\prenom.txt");
    }


}
