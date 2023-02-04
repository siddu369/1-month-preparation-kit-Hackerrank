class Result {
  public static int superDigit(String n, int k) {
        long superDigit = k * Stream.of(n.split("")).mapToLong(Long::parseLong).sum();
        if (superDigit > 10){
           superDigit = superDigit(String.valueOf(superDigit), 1);
        }
        return (int) superDigit;
    }
}
