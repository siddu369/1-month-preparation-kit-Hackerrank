class Result {
  public static void miniMaxSum(List<Integer> arr) {
    //arr = arr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    Collections.sort(arr);
    long sum = 0;
    for (int i = 0; i < arr.size(); i++){
        sum += arr.get(i);
    }
    long max = sum - arr.get(arr.size() - 1);
    long min = sum - arr.get(0);
    System.out.printf(max + " " + min);
  }
}
