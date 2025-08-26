public class Find_in_Mountain_Array_LeetCode_1095 {
    public static void main(String args[]){
        int[] nums={1,2,3,4,5,6,5,4,2,1};
        int target=2;
        int peak = FindPeak(nums);
        int firstTry= IsAgnostic(nums,target,0,peak);
        if(firstTry!=-1){
            System.out.println(firstTry);
        }
        firstTry= IsAgnostic(nums,target,peak+1,nums.length-1);
        System.out.println(firstTry);


    }
    static int FindPeak(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
                }else{//nums[mid]>nums[mid+1]
                    end=mid;
                }
            }
        return end;
        }
    static int IsAgnostic(int[] nums, int target, int start, int end){
        boolean isAgnostic=nums[start]<nums[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(isAgnostic){
                if(target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target<nums[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }


}


