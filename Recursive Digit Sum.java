class Result {
  public static int superDigit(String n, int k) {
        long res = k * Stream.of(n.split("")).mapToLong(Long::parseLong).sum();
        if (res > 10){
           res = superDigit(String.valueOf(res), 1);
        }
        return (int) res;
    }
}
