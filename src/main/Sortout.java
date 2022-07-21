package main;

public class Sortout {

    public static void sortOut(){ // alle Zeilen mit Buchstaben werden rausgelöscht
        Main.lines.removeIf(at -> at.contains("a"));Main.lines.removeIf(at -> at.contains("A"));
        Main.lines.removeIf(at -> at.contains("b"));Main.lines.removeIf(at -> at.contains("B"));
        Main.lines.removeIf(at -> at.contains("c"));Main.lines.removeIf(at -> at.contains("C"));
        Main.lines.removeIf(at -> at.contains("d"));Main.lines.removeIf(at -> at.contains("D"));
        Main.lines.removeIf(at -> at.contains("e"));Main.lines.removeIf(at -> at.contains("E"));
        Main.lines.removeIf(at -> at.contains("f"));Main.lines.removeIf(at -> at.contains("F"));
        Main.lines.removeIf(at -> at.contains("g"));Main.lines.removeIf(at -> at.contains("G"));
        Main.lines.removeIf(at -> at.contains("h"));Main.lines.removeIf(at -> at.contains("H"));
        Main.lines.removeIf(at -> at.contains("i"));Main.lines.removeIf(at -> at.contains("I"));
        Main.lines.removeIf(at -> at.contains("j"));Main.lines.removeIf(at -> at.contains("J"));
        Main.lines.removeIf(at -> at.contains("k"));Main.lines.removeIf(at -> at.contains("K"));
        Main.lines.removeIf(at -> at.contains("l"));Main.lines.removeIf(at -> at.contains("L"));
        Main.lines.removeIf(at -> at.contains("m"));Main.lines.removeIf(at -> at.contains("M"));
        Main.lines.removeIf(at -> at.contains("n"));Main.lines.removeIf(at -> at.contains("N"));
        Main.lines.removeIf(at -> at.contains("o"));Main.lines.removeIf(at -> at.contains("O"));
        Main.lines.removeIf(at -> at.contains("p"));Main.lines.removeIf(at -> at.contains("P"));
        Main.lines.removeIf(at -> at.contains("q"));Main.lines.removeIf(at -> at.contains("Q"));
        Main.lines.removeIf(at -> at.contains("r"));Main.lines.removeIf(at -> at.contains("R"));
        Main.lines.removeIf(at -> at.contains("s"));Main.lines.removeIf(at -> at.contains("S"));
        Main.lines.removeIf(at -> at.contains("t"));Main.lines.removeIf(at -> at.contains("T"));
        Main.lines.removeIf(at -> at.contains("u"));Main.lines.removeIf(at -> at.contains("U"));
        Main.lines.removeIf(at -> at.contains("v"));Main.lines.removeIf(at -> at.contains("V"));
        Main.lines.removeIf(at -> at.contains("w"));Main.lines.removeIf(at -> at.contains("W"));
        Main.lines.removeIf(at -> at.contains("x"));Main.lines.removeIf(at -> at.contains("X"));
        Main.lines.removeIf(at -> at.contains("y"));Main.lines.removeIf(at -> at.contains("Y"));
        Main.lines.removeIf(at -> at.contains("z"));Main.lines.removeIf(at -> at.contains("Z"));
        }
}
