package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RamdonSort{

	private static int a[]= new int[100];


	public static void main(String[] argv){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("请输入n的大小：");
			String s = br.readLine();
			System.out.println("请输入r的大小：");
			String str =br.readLine();
			int n = Integer.parseInt(s);
			int r = Integer.parseInt(str);
			a[0]=r;//这个初值很重要
			Ramdonsot(n,r);
			} catch (IOException e){
				e.printStackTrace();
				}
		}


	public static void Ramdonsot(int n, int r){

		int i,j;
		if (r < 0 || r > n){
			return;
		}

		for ( i = n; i >= r; i--){
			a[r] = i;//将第一个数放在a[r]中
			if (r > 1){
				//将问题分解为Ramdonsot(i-1,k-1)逐步分解，递归求和
				Ramdonsot(i - 1, r - 1);
				
				} else {
					//a[0]并没有存放排列的数，只是做为一个中介的量
					for ( j = a[0]; j >0; j--){
						System.out.print(a[j]);
						}
					}
			System.out.println();
			}
		}
	}
