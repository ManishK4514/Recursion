// Given an array print all the sum of the subset generated from it, in the increasing order

package recursion;

import java.util.*;

public class subsetSum {
    public static void func(int idx, ArrayList<Integer> arr, int sum, int N, ArrayList<Integer> sumSubset){
        if(idx == N){
            sumSubset.add(sum);
            return;
        }
        // will add
        func(idx + 1, arr, sum + arr.get(idx), N, sumSubset);
        
        // will not add
        func(idx + 1, arr, sum, N, sumSubset);
    }
    static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, arr, 0, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        ArrayList<Integer> ans = subsetSum(arr, arr.size());
        System.out.println("The sum of each subset is: ");
        System.out.print(ans);
        // for (int i = 0; i < ans.size(); i++)
        //     System.out.print(ans.get(i) + " ");
    
    }
}
