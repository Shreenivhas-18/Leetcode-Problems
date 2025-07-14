class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums1){
            set.add(n);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int n : nums2){
            set1.add(n);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        list.removeAll(set1);
        ArrayList<Integer> list1 = new ArrayList<>(set1);
        list1.removeAll(set);
        return Arrays.asList(list,list1);
    }
}