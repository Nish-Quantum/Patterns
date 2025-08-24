public class _2_Smallest_Number {
    public static void main(String args[]){
        char[] arr = {'a','c','e','f','i','l','o','t'};
        char target = 'd';
        char ans=Small(arr,target);
        System.out.println("ans= "+ans);
    }
    static char Small(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target==arr[mid]){
                return arr[mid];
            }
        }
        return arr[start];
    }
}
