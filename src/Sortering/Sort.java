package Sortering;

/**
 * Created by olal15 on 2017-04-03.
 */
public class Sort {
    public static int[] selSort(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            int index = i;
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] > numbers[index]) {
                    index = j;
                }
                int smallerNumber = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = smallerNumber;
            }
        }
        return numbers;
    }
    public static double[] selSort(double[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            int index = i;
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] > numbers[index]) {
                    index = j;
                }
                double smallerNumber = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = smallerNumber;
            }
        }
        return numbers;
    }
    public static String[] selSortStringLength(String[] words) {
        for(int i = 0; i < words.length; i++) {
            int index = i;
            for(int j = 0; j < words.length; j++) {
                if(words[j].length() > words[index].length()) {
                    index = j;
                }
                String smallerNumber = words[index];
                words[index] = words[i];
                words[i] = smallerNumber;
            }
        }
        return words;
    }
    public static String[] selSortStringAlpha(String[] words) {
        for(int i = 0; i < words.length; i++) {
            int index = i;
            for(int j = 0; j < words.length; j++) {
                if(words[j].charAt(0) > words[index].charAt(0)) {
                    index = j;
                }
                String smallerNumber = words[index];
                words[index] = words[i];
                words[i] = smallerNumber;
            }
        }
        return words;
    }
}