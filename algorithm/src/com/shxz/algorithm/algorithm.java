package com.shxz.algorithm;


public class algorithm {
	
	public static void bubbleSort(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1;j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
	}
	
	public static void chooseSort(int[] a)
	{
		int small;
		for(int i=0;i<a.length-1; i++)
		{
			small=i;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[small]>a[j])
				{
					small=j;
				}
			}
			if(small!=i)
			{
				int temp=a[i];
				a[i]=a[small];
				a[small]=temp;
			}
		
		}
	}
	public static void insertSort(int[] a)
	{
		int temp,i,j;
		for(i=0; i<a.length-1; i++)
		{
			temp=a[i+1];
			j=i;
			while(j>-1&&temp<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	
	public static void print(int[] a)
	{
		for(int b: a)
			System.out.print(b+"\t");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] a={3254,543,265,4654,7,551,54,36,543,4135,467,54,15,467,57,65,51234,67,567,1352,5,635,7,5467,568,52,34,654,51,431,341,6,54,76567,465,754,675,62,431,342,654,565,7,657,3561,45,132,567,65,76,58,53,42,54,65345,65435,654,36754,43,21,2312,43,543,543,654,76,5};
//		bubbleSort(a);
//		print(a);
//		chooseSort(a);
//		print(a);
		insertSort(a);
		print(a);
	}
}
