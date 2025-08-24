public class Ceiling {
    public static void main(String args[]){
        int[] nums = {1,3,4,55,67,89,90};
        int target=56;
        int ans=Ceiling(nums,target);
        System.out.println("Ans="+ans);
    }
    static int Ceiling(int[] nums,int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            if(target==nums[mid]){
                return nums[mid];
            }
        }
        return nums[start];
    }
}
