package test1;


import java.util.*;

/**
 * 十五分钟编写程序，随机10000次，把1-10000全部随机随出来，不能重复。
 *
 * 解答函数为 this.func(length)
 *
 * @Author: shican.sc
 * @Date: 2022/6/17 21:20
 * @see
 */
public class Test1 {


    public static void main(String[] args) {
        //System.out.println(func(20));
    }

    /**
     *
     * 循环length次，出现所有不重复的数
     *
     *     //思路：
     *     // 1）新建数组nums[0-10000] == 1 - 10000
     *     // 2）随机一个整数 对10000取模， 将nums中对应的数保存并移出
     *
     * @param length
     * @return
     */
    public static List<Integer> func(int length) {
        List<Integer> res = new LinkedList<>();
        int[] nums = new int[length];
        for(int i = 0; i < length; i++) {
            nums[i] = i + 1;
        }

        int rest = length;
        for (int i = 0; i < length; i++) {
            int value = (int) (Math.random() * rest);
            value = value % rest;

            int temp = nums[value];
            //该坐标tmp的保存下来
            res.add(temp);

            //将该temp移出数组 (前后对调)
            nums[value] = nums[rest-1];
            nums[rest-1] = temp;

            //除数递减
            rest--;
        }
        return res;
    };

}
