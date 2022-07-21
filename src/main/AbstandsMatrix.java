package main;

public class AbstandsMatrix {

    public static int[][] abstandsMatrix = new int[Main.lines.size()-1][Main.lines.size()-1];   //die Matrix als mehrdimmensioinales Array erstellen



    public static void matrix(){

        for (int i = 0; i < Main.lines.size()-1; i++){                                      // läuft die Zeilen der Matrix durch
            for (int a = 0; a < Main.lines.size()-1; a++){                                  // läuft die Spalten der Matrix durch
                abstandsMatrix[i][a] = mabestimmung(i, a);                                  // Setzt die Werte in die MAtrix ein // gibt die Zeilen und Spalten mit in mabestimmung
            }
        }

    }

    public static int abstandsRechnung(int x1, int y1,int x2, int y2){          //in der MEthode einfach nur die Abstandberechnung
                                                                                //Wruzel von (x2 - x1)^2 + (y2 -y1)^2
        int a,b,c;
        a = x2-x1;
        b = y2-y1;
        c = a*a + b*b;
        int result = (int) Math.sqrt(c);

        return result;
    }

    public static int mabestimmung(int i, int a){                           // Zeilen und Spalten wurden übergeben in i und a
        int x1=0,x2=0,y1=0,y2=0;                                            // erstellt die x1,x2,y1,y2 variablen

        for (int x = 0; x < Main.lines.size()-1; x++){                      // läuft die idxy Liste durch
            if (Main.idxy.get(x)[0] == i){                                  // die Zeile aus der wir die Werte brauchen dann ist true
                x1 = Main.idxy.get(x)[1];                                   // nimmt den x Wert und macht den in x1
                y1 = Main.idxy.get(x)[2];                                   // nimmt den y Wert und macht den in y1
            }
            if (Main.idxy.get(x)[0] == a){                                  // die Spalte aus der wir die Werte brauchen dann ist true
                x2 = Main.idxy.get(x)[1];                                   // selbe wie oben
                y2 = Main.idxy.get(x)[2];
            }
        }
        int result = abstandsRechnung(x1, y1, x2, y2);                      // in result geht dann der Abstand

        return result;                                                      // gibt den Abstand zurück
    }



}



