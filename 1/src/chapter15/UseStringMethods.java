package chapter15;

import java.util.Locale;

public class UseStringMethods {

    public static void main(String[] args) {
        String text = "The String class represents character strings";
        UseStringMethods us = new UseStringMethods();
        us.printWords(text);
        us.findString(text,"string");
        us.findAnyCaseString(text,"string");
        us.countChar(text,'s');
        us.printContainWords(text,"ss");
    }

    public void printWords(String str){
        for (String word : str.split(" ")){
            System.out.println(word);
        }
    }

    public void findString(String str,String findStr){
        System.out.println(str.indexOf(findStr));
    }

    public void findAnyCaseString(String str,String findStr){
        System.out.println(str.toLowerCase().indexOf(findStr));
    }

    public void countChar(String str,char c){
        int i = 0;
        char[] strChars = str.toCharArray();
        for (char strChar : strChars){
            if (strChar == c){
                i++;
            }
        }
        System.out.println(i);
    }

    public void printContainWords(String str,String findStr){
        String[] strWords = str.split(" ");
        for (String strWord : strWords) {
            if (strWord.contains(findStr)){
                System.out.println(strWord);
            }
        }
    }
}
