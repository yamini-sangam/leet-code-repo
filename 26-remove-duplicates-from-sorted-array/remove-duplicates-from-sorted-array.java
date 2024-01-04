class Solution {
    public int removeDuplicates(int[] nums) {
        // [0,0,1,1,1,2,2,3,3,4]

        int lastUniqueIndex = 0;
        for (int i=1; i<nums.length; i++) {
            if(nums[lastUniqueIndex] != nums[i]) {
                nums[lastUniqueIndex + 1] = nums[i];
                lastUniqueIndex++;
            }
        }

        return lastUniqueIndex + 1 ;
        
    }
}