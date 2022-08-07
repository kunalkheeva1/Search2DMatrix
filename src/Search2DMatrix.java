public class Search2DMatrix {


    //return true if target is found else false but not in On^2, you can use ON
    //condition is array is sorted from top to bottom, left to right
    public static boolean search2DMatrix(int [][] arr, int target){

        //n is no. of rows, m is no. of columns
        //basically we need to start from the right top most block
        //as if the target is greater, then we can move downwards to check if there is one present
        // or if its smaller, then we can move to left side to check the row
        int n = arr.length;
        int m = arr[0].length;
        int i=0, j=m-1;
        while(i<n && j>=0){
            if(arr[i][j]> target){
                j--;
            }else if(arr[i][j]< target){
                i++;
            }else if(arr[i][j]==target){
                return true;
            }

        }return false;




    }



    public static void main(String[] args) {

    }
}
