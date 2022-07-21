package main;

import java.util.ArrayList;

public class Randomort {

    static int d;                                                               // bei welchem Ort wir gerade sind
    static int fitness;                                                             // addierte länge der Wege


    public static void randomOrt(){
        d = 0;
        fitness = 0;
        ArrayList<Integer> visit = new ArrayList<>();                    // alle Orte die wir schon besucht haben
        int[] tour = new int[Main.lines.size()];


        visit.add(0);


        for (int a = 0; a < Main.lines.size()-1; a++){

            ArrayList<Integer> entfernung = new ArrayList<>();                      // da kommen alle entfernungen von n bis so viele Orte es eben gibt (bei uns 52)



            for (int i = 0; i < Main.lines.size() - 1; i++) {                       // läuft die zeile durch eben die entfernung von n zu p  hoffe ihr versteht
                entfernung.add(AbstandsMatrix.abstandsMatrix[d][i]);                // speichert alle abstände von n zu p Bsp: 1.(Anstand von Ort1 zu Ort1) 2.(Abstand von Ort1 zu Ort2) usw.
            }




            int random = (int) (((Main.lines.size()-1) * Math.random()));            // bestimmt zufällig zu welchem ort wir als nächstes gehen
            int plus = random;                                                       // random zahl kommt in plus rein

            for (int c = 0; c < Main.lines.size() -1; c++) {                         // läuft alle Abstände durch

                d = plus;                                                           // random (plus) wird der nächste Ort also random Ort

                visit.sort(null);                                                 // visit liste wird sortiert damit es besser zum suchen ist ob wir bei dem Ort schon waren



                for (int i = 0; i < visit.size(); i++) {                            // läuft die visit liste durch
                    if (d == visit.get(i)) {                                        // wenn der Ort wo wir hin wollen schon besucht wurde
                        plus++;                                                     // wird plus erhöht damit wir den nächst nächsten nehmen können
                        if (plus >= Main.lines.size() -1) {                           // wenn plus zu groß wird
                            plus = 1;                                               // fangen wir wieder bei 1 an einfach nur zur sicherheit für den code
                        }
                    }
                }
            }


            visit.add(d);                                                           // dann wird der Ort den wir bescuhen in visit liste gespoeichert
            fitness += entfernung.get(plus);                                      // die gewählte random entfernung wird auf die fitness addiert
            tour[a] = d;

        }

        for (int i = 0; i < tour.length; i++){
            System.out.print(tour[i] + (" | "));
        }


        fitness += AbstandsMatrix.abstandsMatrix[d][0];                             // als Ende muss man ja nochmal zum 1.Ort und die enfernung wird auch noch drauf addiert

        Main.touren.add(tour);

    }

}
