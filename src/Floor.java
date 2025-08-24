public class Floor {
    public static void main(String args[]){
        int[] nums ={2,4,66,78,99,110};
        int target = 100;
        int ans=Floor(nums,target);
        System.out.println("ans ="+ans);

    }
    static int Floor(int[] nums ,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
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
        return nums[end];
    }
}
