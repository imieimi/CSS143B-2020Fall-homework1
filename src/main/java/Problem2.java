public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        int target;
        int targetTwo;
        for(int i = 0; i < data.length; i++){
            target = data[i];
            for(i = 0; i < data.length; i++){
                targetTwo = data[i+1];
                if(target > targetTwo){
                    data[target] = data[targetTwo];
                    data[targetTwo] = data[target];
                }

            }
        }
    }
}
