import java.util.Scanner;

public class PairSum {
    static int pairSum(int[]arr,int target){
        int n =arr.length;
        int ans=0;
        for(int i = 0; i < n; i++){
            for(int j=i+1; j < n ; j++){
                if(arr[i]+arr[j]==target){
                    ans++;

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println(" enter " + n +" element ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter targeted value:");
        int target=sc.nextInt();
        System.out.println("total number of pairs is:" +pairSum(arr,target));
    }
}
