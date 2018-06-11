package com.tzl;

/**
 * 插入排序
 */
public class InsSorting {
    public static void main(String[] args){
        int[] arr = new int[100000];
        System.out.print("排序前的数组：");
        for (int i = 0; i<100000;i++){
            arr[i] = (int) (Math.random()*10000000);
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        int[] result = insSort(arr);
        for (int i = 0; i<100000;i++){
            System.out.print(result[i]+"\t");
        }
    }

    public static int[] insSort(int[] arg){
        if (arg == null)
            return null;

        int[] mid = arg.clone();
        long curTime = System.currentTimeMillis();

        for (int i=1;i<mid.length; i++){//默认第一个位置一排序，从第二个数开始
            for (int j=i;j>0;j--){//从当前位置，递减比较已排序的部分
                if (mid[j] < mid[j-1]){//如果当前未排序的数，小于已排序的数，则交换位置，继续递减比较剩下的部分
                 int tem;
                 tem = mid[j-1];
                 mid[j-1] = mid[j];
                 mid[j] = tem;
                }else {//当需要排序的数，已经不小于剩下的部分，怎插入当当前位置，即直接跳出循环
                   break;
                }
            }
        }
        double time = (System.currentTimeMillis() - curTime)/1000;
        System.out.println("用时："+time+" s");
        return mid;
    }
}
