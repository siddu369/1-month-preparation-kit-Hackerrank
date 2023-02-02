class Result {
public static List<Integer> countingSort(List<Integer> arr) {
    ArrayList<Integer> newarr = new ArrayList<>();
    for (int i = 0; i < 100; i++){
        newarr.add(0);
    }
    for (int i : arr){
        newarr.set(i, newarr.get(i) + 1);
    }
    return newarr;
    }
}