public class Problem2 {
    //for submission

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        int one = data.length;
        int two = data.length - 1;
            for(int i = 0; i < two; i++){
                for(int a = 0; a < one - i - 1; a++){
                    if(data[a] > data[a+1]){
                        int swap = data[a];
                        data[a] = data[a+1];
                        data[a+1] = swap;
                    }
                }
            }
            for(int i = 0; i < one; i++){
                System.out.print(data[i] + " ");
            }
        }
    }
