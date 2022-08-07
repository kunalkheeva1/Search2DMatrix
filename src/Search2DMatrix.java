public class Search2DMatrix {

    public static boolean search2DMatrix(int [][] arr, int target){
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
