package main;

import java.io.File;
import java.util.Scanner;

public class Readfile
    {
        public static void readFile() throws Exception
        {
            File doc = new File("src/res/berlin52.tsp");        //File erstellen mit Pfad
            Scanner obj = new Scanner(doc);                             // Scanner Objekt erstellen

            while (obj.hasNextLine()) {                                 // läuft jede Zeile von Datei durch
                Main.lines.add(obj.nextLine());                         // Macht jede Zeile in die "lines" Arraylist
            }

        }
    }