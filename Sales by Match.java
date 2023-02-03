class Result {
  public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int color = ar.get(i);
            if (hm.containsKey(color)) {
                hm.put(color, hm.get(color) + 1);
            }
            else {
                hm.put(color, 1);
            }
        }
        for (Integer value : hm.values()) {
            count += value / 2;
        }
        return count;
    }
}
