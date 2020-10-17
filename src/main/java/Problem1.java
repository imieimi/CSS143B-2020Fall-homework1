public class Problem1 {
    // Do not change signature (function name, parameters)
    //Homework redo 10/16/20
    public static int binarySearch(int[] data, int target) {
        int lower = 0;
        int higher = data.length - 1;
        while(lower <= higher){
            int middle = lower + (higher - 1) / 2;
            if(data[middle] == target) {
                return middle;
            }else if(data[middle] < target){
                lower = middle + 1;
            }else{
                higher = middle - 1;
            }
        }
        return -1;
    }


}
