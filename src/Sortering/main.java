package Sortering;

/**
 * Created by olal15 on 2017-04-10.
 */
public class main {

    public static void main(String[] args) {
        int[] integers = {13, 1, 7, -300, 9000000};
        integers = Sort.selSort(integers);
        System.out.println("Sorted Integers:\n");
        for(int i : integers) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

        double[] doubles = {3.14, 0.12, 1, 1.337, -4.20};
        doubles = Sort.selSort(doubles);
        System.out.println("Sorted Doubles:\n");
        for(double i : doubles) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

        String[] StringLengths = {"Hej", "Då", "Pappa", "Hadetbra"};
        StringLengths = Sort.selSortStringLength(StringLengths);
        System.out.println("Sorted Strings by length:\n");
        for(String i : StringLengths) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

        String[] StringAlphas = {"Fisk", "Fluga", "Fågel", "Groda"};
        StringAlphas = Sort.selSortStringAlpha(StringAlphas);
        System.out.println("Sorted Strings by alphabet:\n");
        for(String i : StringAlphas) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

    }
}
