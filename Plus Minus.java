class Result {
    public static void plusMinus(List<Integer> arr) {
      int length = arr.size();
      float pc = 0, nc = 0, zc = 0;
    
      for (int i = 0; i < length; i++){
          if (arr.get(i) > 0){
              pc ++;
          }
          else if (arr.get(i) < 0){
              nc ++;
          }
          else if (arr.get(i) == 0){
              zc ++;
          }
      }
      System.out.printf("%f%n", (pc / length), 6);
      System.out.printf("%f%n", (nc / length), 6);
      System.out.printf("%f%n", (zc / length), 6);
   }
}
