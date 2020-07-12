package cn.lisen.sort_algorithm;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

/**
 * 归并排序
 * @author Lisen
 *
 */
public class MergerSort {
	public static void main(String[] args) {
		//定义一个待排序数组
    	//int[] arr = {8,4,5,7,1,3,6,2};   
    	int [] arr = new int [ 8000000];
    	for (int i = 0; i <  8000000; i++) {
			arr[i] = (int) (Math.random()* 8000000);
		}
    	int [] temp = new int [arr.length];
    	int right = arr.length-1;
    	Date date1 = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String str1 = sdf.format(date1);
    	System.out.println("排序前时间 ："+str1);
    	mergeSort(arr,0,right,temp);
    	Date date2 = new Date();
    	String str2 = sdf.format(date2);
    	System.out.println("排序后时间 ："+str2);
    	//System.out.print("归并排序后=" +Arrays.toString(arr));
	}
    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
    	if(left<right) {
    		int mid = (left+right)/2;
    		mergeSort(arr,left,mid,temp);
    		mergeSort(arr,mid+1,right,temp);
    		merge(arr,left,mid,right,temp);
    	}
    }
    //排序方法
    public static void merge(int[] arr,int left,int mid,int right,int[] temp) {
    	//定义临时变量
    	int i =left;
    	int j =mid+1;//中间索引
    	int t =0;//临时数组索引
    	while(i<=mid&&j<=right) {
    	if(arr[i]<=arr[j]) {
    		//左边元素小于右边元素，将左元素加入临时数组
    		temp[t]=arr[i];
    		i++;
    		t++;
    	}else {
    		//左侧第一个元素大于右侧第一个元素，将右侧元素加入临时数组
    		temp[t]=arr[j];
    		j++;
    		t++;
    	}
    }
    //当左侧筛选后将剩下的元素，加入temp
    	while(i<=mid) {
    		temp[t]=arr[i];
    		t++;
    		i++;
    	}
    //当右侧筛选后将剩下的元素，加入temp
    	while(j<=right) {
    		temp[t]=arr[j];
    		t++;
    		j++;
    	}
    //拷贝temp数组元素到arr
    	t=0;
    	int templeft = left;
    	while(templeft<=right) {
    		arr[templeft] = temp[t];
    		t++;
    		templeft++;
    	}
    		
   }
    
    
}
