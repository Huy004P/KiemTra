package kiemtra;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cau 1
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao 3 so:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		coPhaiBaCanhCuaTamGiac(a, b, c);
		//Cau 2 
		int[] z = new int[10];
		//a
		ranDom(z);
		//b
		sapXep (z);
		//c
		demChanLe (z);
	}
		 private static void demChanLe(int[] z) {
		// TODO Auto-generated method stub
		int demChan = 0;
		for (int i =0; i < z.length; i++) {
			if(z[i] % 2 == 0)
				demChan++;
		}
		System.out.format("%d so chan, %d so le", demChan, z.length - demChan);
	}
		private static void sapXep(int[] z) {
		// TODO Auto-generated method stub
		for (int i = 0; i < z.length; i++) {
			for (int j = i + 1; j < z.length; j++) {
				if(z[i] > z[j]) {
					int x = z[i];
					z[i] = z[j];
					z[j] = x;
				}
			}
			System.out.print(z[i] + " ");
		}
	}
		private static void ranDom(int[] z) {
			 System.out.println();
		Random rd = new Random();
		for (int i = 0; i < z.length; i++) {
			z[i] = rd.nextInt(1,100);
			System.out.print(z[i] + " ");
		}
	}
		 
		public static void coPhaiBaCanhCuaTamGiac(int a, int b, int c) {
			 if(a + b > c && a + c > b && c + b >a) {
				 System.out.format("%d, %d, %d la do dai 3 canh cua 1 tam giac", a, b, c);
			 }else {
				 System.out.format("%d, %d, %d khong phai do dai la 3 canh cua 1 tam giac", a, b, c);
			 }
		
		 }
		 
		 
}
