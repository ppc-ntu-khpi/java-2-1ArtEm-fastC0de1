package domain;

public class Exercise {
    public static boolean Calculate(String word){
        String reversedWord = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reversedWord  += word.charAt(i);
        }
        return reversedWord.equals(word);
           
    }
}
