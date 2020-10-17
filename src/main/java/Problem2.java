public class Problem2 {
    //submission 2

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        int length = data.length;
        int count = data.length - 1;
            for(int i = 0; i < count; i++){
                for(int a = 0; a < length - i - 1; a++){
                    if(data[a] > data[a+1]){
                        int swap = data[a];
                        data[a] = data[a+1];
                        data[a+1] = swap;
                    }
                }
            }
            for(int i = 0; i < length; i++){
                System.out.print(data[i] + " ");
            }
        }
    }
