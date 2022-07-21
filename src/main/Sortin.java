package main;

import java.util.Arrays;

public class Sortin {

    public static void sortIn() {
        for (int i = 0; i < Main.lines.size() - 1; i++) {                          // läuft so oft wie die lines liste ist
            String[] split = Main.lines.get(i).split(" ");                // splittet die zeilen bei leerzeichen Bsp: vorher(1 672 293) nachher(1)(672)(293) in das Array

            int[] values = new int[3];                                          // erstellt ein int array mit größe 3 für id, x, y

            for (int a = 0; a < split.length; a++) {                             // läuft so oft durch wie das split array ist in dem Fall 3 mal wegen id, x, y
                double dnum = Double.parseDouble(split[a]);                     // wandelt das String array in ein double array weil es sein kann das zahlen mit . wie bsp. 676.0 vorkommen könnten
                values[a] = (int) dnum;                                         // dann die doubles zu int damit wir keine . zahlen mehr haben
            }


            Main.idxy.add(values);                                              // das array mit den drei sachen also id, x, y in die endgültige Liste  eintragen
        }
    }

}


//verständniss für die idxy liste:
//ArrayList mit int[]
//Liste:
//1. ([id][x][y])
//2. ([id][x][y])
//3. ([id][x][y])
// usw. für alle einträge