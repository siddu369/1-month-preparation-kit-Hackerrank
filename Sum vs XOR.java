class Result {

  public static long sumXor(long n) {
    // Write your code here
        long result = 1;
        while (n > 0){
            if (n % 2 == 0){
                result *= 2;
            }
            n /= 2;
          // divide and conquer 😂
        }
        return result; 
    }
  
  /*
  public static long sumXor(long n) {
    // Write your code here
        long count = 0;
        for (long i = 0; i < n; i++){
            if ((n + i) == (n ^ i)){
                count++;
            }
        }
        return count;
    }
    
    don't know why this commented code is not working for all the test cases, even the logic seems to work for all.
    
  */
}
