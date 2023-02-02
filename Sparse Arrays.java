class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (String s: strings){
            if (hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }else{
                hm.put(s,1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (String q: queries){
            if (!hm.containsKey(q)){
                res.add(0);
            }else{
                res.add(hm.get(q));
            }
        }
        return res;
    }
}