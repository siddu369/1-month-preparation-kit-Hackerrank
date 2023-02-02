class Result {
    public static String timeConversion(String s) {
    int len = s.length();
    if(s.charAt(len - 2) == 'A'){
        if(s.substring(0, 2).equals("12")){
            return "00" + s.substring(2, len - 2);
        }
    }
    else{
        if(!s.substring(0,2).equals("12")){
            return (Integer.parseInt(s.substring(0, 2))+12 + s.substring(2, len - 2));
        }
    }
    return s.substring(0, len - 2);
    }
}