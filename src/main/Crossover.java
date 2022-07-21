package main;

import java.util.ArrayList;

public class Crossover {

    static int randombot = Main.lines.size()/2 - 10;
    static int randomtop = Main.lines.size()/2 + 10;
    static int randomrange = randomtop - randombot;
    static int random = randombot + (int) Math.random()*randomrange;


    public static void crossover(int[] parent1, int[] parent2){

        ArrayList<Integer> part1 = new ArrayList<>();
        for (int i = random; i < parent1.length; i++){
            part1.add(parent1[i]);
        }


        ArrayList<Integer> part2 = new ArrayList<>();
        for (int i = 0; i < parent1.length-1; i++){
            part2.add(parent2[i]);
        }


        for (int i = 0; i < part2.size(); i++){
            for (int a = 0; a < part1.size(); a++){
                if (part2.get(i) == part1.get(a)){
                    part2.remove(i);
                }
            }
        }

        for (int i = 0; i < part1.size(); i++){
            part2.add(part1.get(i));
        }


        for (int i = 0; i < parent1.length; i++){
            System.out.print(parent1[i] + " | ");
        }
        System.out.println();

        for (int i = 0; i < parent2.length; i++){
            System.out.print(parent2[i] + " | ");
        }
        System.out.println();

        for (int i = 0; i < part2.size(); i++){
            System.out.print(part2.get(i) + " | ");
        }




    }


}