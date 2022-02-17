package com.wyc.dream.Solution;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: wangyuancun
 * @description: 两数之和
 * <p>
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值target的两整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案
 *
 * 示例1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例2:
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 *
 * </p>
 *
 * @date: 2022/2/13
 */
public class Solution {
    public static int[] twoSum(int[] nums,int target){
        int [] res=new int[2];
        //step1:初始化容器 HashMap,key为目标值,value为数组下表
        HashMap<Integer, Integer> twoSumHashMap = new HashMap<>(2);
        for(int i=0;i<=nums.length;i++){
            //step2:用目标值减去当前循环的数组值，为第step3;
            int i1 = target - nums[i];
            //step3:判断当前容器里面是否已存在目标值,如果是则返回;
            if(twoSumHashMap.containsKey(i1)){
                res[0]=twoSumHashMap.get(i1);
                res[1]=i;
                return res;
            }
            twoSumHashMap.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

}
