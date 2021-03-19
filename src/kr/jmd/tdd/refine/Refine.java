package kr.jmd.tdd.refine;

public class Refine {

    public static String refineText(String str) {
        return str.replace("    ", " ").replace("  ", " ");
    }

}
