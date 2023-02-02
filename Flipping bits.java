class Result {
    public static long flippingBits(long n) {
        long a = ((long) Math.pow(2, 32)) - 1 - n;
        return a;
    }
}