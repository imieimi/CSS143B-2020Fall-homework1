public class Problem1 {
    //new submission update
    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        int answer = -1;
        for(int i = 0; i < data.length; i++){
            if(data[i] == target){
                answer = i;
                break;
            }
        }
        return answer;
    }


}
