public class InfiniteArray {
    public static void main(String args[]){
        //start with box of size 2
        int[] arr={1,2,3,4,5,6,7,8,9,10,33,45,67,77,89,990};
        int target=990;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with a box of size 2
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newstart=end+1;
            //double the box value
            //newend=prev end+sizeofbox*2
            int newend=end+(end-start+1)*2;
            start=newstart;
            end=newend;

        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

