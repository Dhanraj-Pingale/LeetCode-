class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            if (hm.get(nums[i]) > (nums.length / 3)) {
                if (!list.contains(nums[i])) {
                        list.add(nums[i]);
                }
            }
        }

        return list;
    }
}