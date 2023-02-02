import java.util.HashSet;

class Result {
public static String pangrams(String s) {
    s = s.replace(" ","");
    s = s.toLowerCase();
    char[] ch = s.toCharArray();
    HashSet<Character> set = new HashSet<>();
    for (char i : ch){
            set.add(i);
        }
        if (set.size() == 26){
            return "pangram";
        }
        else{
            return "not pangram";
        }
    }
}