public class RoatedBinarySearch {
    public static void main(String args[]){
        int[] arr={4,5,6,7,0,1,2};
        int target=1;
        System.out.println(Pivot(arr));
        System.out.println(PivotBinarySearch(arr,target));
    }
    static int PivotBinarySearch(int[] arr,int target){
        int pivot=Pivot(arr);
        //if we dont find pivot just do normal binary search cause arrey inst rotated
        if(pivot==-1){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        //if pivot isv found you have found 2 ascending sorted arrays
        //3 cases
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        if(target<arr[0]){
            return BinarySearch(arr,target,pivot+1,arr.length-1);
        }
        return -1;
    }
    static int BinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int Pivot(int[] arr){
        int start = 0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;//if mid is last then it gives index out of bound error
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
