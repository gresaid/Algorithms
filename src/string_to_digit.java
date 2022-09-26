import java.util.ArrayList;
public class string_to_digit {
    static ArrayList<String> letter = new ArrayList<>();
    public static void createAlphabet() {
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            letter.add(String.valueOf(alphabet));
        }

    }
    public static String letterToDigit (String input){
        createAlphabet();
       String[] splitString = input.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();
        for (String s: splitString){
            if(letter.contains(s))
                result.append(letter.indexOf(s) + 1).append(" ");
        }
        return result.toString();

    }
    }
