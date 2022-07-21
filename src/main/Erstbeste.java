package main;

import java.util.ArrayList;

public class Erstbeste {

    static int d;                                                               // bei welchem Ort wir gerade sind
    static int fitness;                                                             // addierte länge der Wege

    public static void ertsBeste() {

        d = 0;
        fitness = 0;
        ArrayList<Integer> visit = new ArrayList<>();                            // alle Orte die wir schon besucht haben
        int[] tour = new int[Main.lines.size()];


        visit.add(0);                                                               // weil wir bei dem nulltem Ort also dem ersten starten

        for (int a = 0; a < Main.lines.size()-1; a++) {                             // Läuft Orte durch

            ArrayList<Integer> min = new ArrayList<>();                             // da kommen alle entfernungen von n bis so viele Orte es eben gibt (bei uns 52)


            for (int i = 0; i < Main.lines.size() - 1; i++) {                       // läuft die zeile durch eben die entfernung von n zu p  hoffe ihr versteht
                min.add(AbstandsMatrix.abstandsMatrix[d][i]);                       // speichert alle abstände von n zu p Bsp: 1.(Anstand von Ort1 zu Ort1) 2.(Abstand von Ort1 zu Ort2) usw.
            }


            ArrayList<Integer> temp = new ArrayList<>();                            // Liste zum 1:1 übertragen von dem min weil ich min sortieren will um die min rauszufinden aber die reihenfolge nicht kapiutt machen will

            for (int i = 0; i < min.size(); i++) {                                  // läuft die min liste durhc
                temp.add(min.get(i));                                               // überträgt die werte von min liste in temp liste dann sind die genau gleich
            }

            min.sort(null);                                                      // min liste wird sortiert mit minimum oben
        //int[][] reihenfolge = new int[Main.lines.size()-1][2];                  // reihenfolge zu welchem Ort wir gehen mit entsprechender fitness



            int plus = 1;                                                           // brauch ich für die nächsten schritte evt. bisschen verwirrend aber egaaaaaal

            for (int c = 0; c < Main.lines.size() -1; c++) {                        // läuft alle Abstände durch um rauszufinden was das minimum ist und zu welchem ort wir gehen

                for (int i = 0; i < temp.size(); i++) {                             // läuftdie temp liste durch
                    if (temp.get(i) == min.get(plus)) {                             // checkt bei welchem ort der geringste Abstand ist (plus ist 1 wel Ort 1 sollen wir ja nicht)
                        d = i;                                                      // der nächst entfernteste Ort wird dann in d gespeichert damit wir von dem als nächstes starten
                    }
                }


                visit.sort(null);                                               // visit liste wird sortiert damit es besser zum suchen ist ob wir bei dem Ort schon waren


                for (int i = 0; i < visit.size(); i++) {                            // läuft die visit liste durch
                    if (d == visit.get(i)) {                                        // wenn der Ort wo wir hin wollen schon besucht wurde
                        plus++;                                                     // wird plus erhöht damit wir den nächst nächsten nehmen können
                        if (plus >= Main.lines.size()-1){                           // wenn plus zu groß wird
                            plus = 1;                                               // fangen wir wieder bei 1 an einfach nur zur sicherheit für den code
                        }
                    }
                }
            }

            //reihenfoge[][];
            visit.add(d);                                                           // dann wird der Ort den wir bescuhen in visit liste gespoeichert
            fitness += min.get(plus);                                               // das gewählte minimum auf die fitness addiert
            tour[a] = d;

        }


        fitness += AbstandsMatrix.abstandsMatrix[d][0];                             // als Ende muss man ja nochmal zum 1.Ort und die enfernung wird auch noch drauf addiert


        Main.touren.add(tour);
    }

}
