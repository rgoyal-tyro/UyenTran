import java.util.*;
class Tyro {
    static int fun1(int arr[], int n){
        Arrays.sort(arr); 
        int m_c = 1, res = arr[0];
        int c_c = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                c_c++;
            else
                c_c = 1;
            if (c_c > m_c) {
                m_c = c_c;
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

