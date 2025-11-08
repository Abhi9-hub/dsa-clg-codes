package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> allRes = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        Helper(nums,new ArrayList<>(), allRes, used);
        return allRes; 
    }
    public static void Helper(int[] nums,List<Integer> res, List<List<Integer>> allRes, boolean[] used){
        if(res.size() == nums.length){
            allRes.add(new ArrayList<>(res));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i])continue;
            if(i>0 && nums[i] == nums[i-1] && !used[i-1])continue;
            used[i] = true;
            res.add(nums[i]);
            Helper(nums, res, allRes, used);
            res.remove(res.size()-1);
            used[i]= false;
        }
    }
}
