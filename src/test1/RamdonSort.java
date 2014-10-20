package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RamdonSort{

	private static int a[]= new int[100];


	public static void main(String[] argv){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("������n�Ĵ�С��");
			String s = br.readLine();
			System.out.println("������r�Ĵ�С��");
			String str =br.readLine();
			int n = Integer.parseInt(s);
			int r = Integer.parseInt(str);
			a[0]=r;//�����ֵ����Ҫ
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
			a[r] = i;//����һ��������a[r]��
			if (r > 1){
				//������ֽ�ΪRamdonsot(i-1,k-1)�𲽷ֽ⣬�ݹ����
				Ramdonsot(i - 1, r - 1);
				
				} else {
					//a[0]��û�д�����е�����ֻ����Ϊһ���н����
					for ( j = a[0]; j >0; j--){
						System.out.print(a[j]);
						}
					}
			System.out.println();
			}
		}
	}
