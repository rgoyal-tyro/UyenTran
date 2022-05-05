import java.util.*;
class Tyro {
    static int fun1(int arr[], int n){
        Arrays.sort(arr); 
        int max_count = 1, res = arr[0];
        int curr_count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
                curr_count = 1;
            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr[i - 1];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = { 40,50,30,40,30,50,30};
        int n = arr.length;
        System.out.println(fun1(arr, n));
    }
}

