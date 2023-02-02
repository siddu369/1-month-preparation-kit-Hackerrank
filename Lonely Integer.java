class Result {
    public static int lonelyinteger(List<Integer> a) {
    List<Integer> unq = new ArrayList<>();
        for (Integer number: a) {
            if (!unq.remove(number)){
                unq.add(number);
            }
       }
       return unq.get(0);
    }
}