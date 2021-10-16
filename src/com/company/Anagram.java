package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public boolean checkIfAnagrams(String firstWord, String secondWord) {

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();
        char[] firstWordArray = firstWord.toCharArray();
        char[] secondWordArray = secondWord.toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);
        boolean compareResult = Arrays.equals(firstWordArray, secondWordArray);

        if (compareResult) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String firstWord, secondWord;
        Scanner scannerObject = new Scanner(System.in);
        Anagram anagramObject = new Anagram();

        System.out.println("Enter the first word : ");
        firstWord = scannerObject.next();
        System.out.println("Enter the second word : ");
        secondWord = scannerObject.next();
        scannerObject.close();

        boolean result = anagramObject.checkIfAnagrams(firstWord, secondWord);

        if (result)
            System.out.println("The words are anagrams");
        else
            System.out.println("The words are not anagrams");

    }


}

