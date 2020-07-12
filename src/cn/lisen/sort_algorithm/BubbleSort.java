package cn.lisen.sort_algorithm;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
		public static void main(String[] args) {
			//int []arr = {2,5,3,6,7,4,1};
			int [] arr = new int[80000];
			for (int i = 0;  i< arr.length; i++) {
				arr[i] = (int)(Math.random()*8000000);
			}
			Date date1 = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String str1 = sdf.format(date1);
			System.out.println("排序前时间 ："+str1);
			bubbleSort(arr);
			Date date2 = new Date();
			String str2 = sdf.format(date2);
			System.out.println("排序后时间 ："+str2);
		}
		public static void bubbleSort(int [] arr) {
			int temp =0;
			//总共排序次数
			for (int i = 0; i < arr.length-1; i++){
				//对尚未排序的数进行排序
				for(int j =0;j<arr.length-1-i;j++) {
					if (arr[j] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j+ 1];
						arr[j+ 1] = temp;
					}

				}		
//				int k =i+1;
//			System.out.println("第"+k +"次排序后数组 :"+Arrays.toString(arr));
			}
			
			
		}
}
