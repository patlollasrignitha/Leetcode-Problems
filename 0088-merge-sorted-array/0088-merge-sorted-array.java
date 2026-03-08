class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*for(int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);*/
        int midx=m-1;
        int nidx=n-1;
        int k=m+n-1;
        while(nidx>=0){
            if(midx>=0 && nums1[midx]>=nums2[nidx]){
                nums1[k]=nums1[midx];
                midx--;
            }
            else{
                nums1[k]=nums2[nidx];
                nidx--;
            }
            k--;
        }
    }
}