package main;

import java.util.ArrayList;

public class Main {
//hi
    public static ArrayList<String> lines = new ArrayList<>();              // Arraylist wo die Zeilen der Datei drinnen sind
    public static ArrayList<int[]> idxy = new ArrayList<>();                // Arraylist mit id, x, y

    public static ArrayList<int[]> touren = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //Datei Einlesen
        Readfile.readFile();
        //Aussortieren
        Sortout.sortOut();
        //Zahlen splitten und in endgültige Liste
        Sortin.sortIn();
        //Abstandsmatrix bestimmen
        AbstandsMatrix.matrix();



                /*for (int i = 0; i < lines.size()-1; i++){                                            //
                    System.out.println();                                                           // Wenn du den code
                    for (int a = 0; a < lines.size()-1; a++){                                       // ausführen lässt
                        System.out.print(AbstandsMatrix.abstandsMatrix[i][a] + " | ");              // wird die Abbildungsmatrix in der Console ausgegeben
                    }                                                                               // Versuch es wenn du kein Angsthase bist
                }    */                                                                             //

        //erste auf nächst besten etc.
        Erstbeste.ertsBeste();                                                              // Alghorithmus der immer den erst besten weg nimmt
        //System.out.println(Erstbeste.fitness);                                              // gibt fitness von Erstbeste aus

        //random gewählte Orte
        Randomort.randomOrt();                                                              // Algorithmus der random Orte auswählt also uin der regel schlecht aber eaSY
        //System.out.println(Randomort.fitness);                                              // gibt die fitness von RAndomort aus


        


    }
}



//Wruzel von (x2 - x1)^2 + (y2 -y1)^2


//  x  y
//  1  4
//  2  6
//  2  1

//      1 2 3
//   1 |-| | |
//   2 | |-| |
//   3 | | |-|