import java.util.*;;
public class Solution {

    public static String XORStrings2(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)){
                res = res + "0";
            }
            else{
                res = res + "1";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s, t;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        t = sc.nextLine();
        sc.close();
        System.out.println(XORStrings2(s, t));
    }
}
