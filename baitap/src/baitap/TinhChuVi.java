package baitap;

import java.util.Scanner;

public class TinhChuVi {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap ban kinh hinh tron: ");
			double bankinh = input.nextDouble();
			double chuvi;
			chuvi= 2 * bankinh * 3.14159;
			System.out.print("chu vi hinh tron la: "+chuvi);
		} catch(Exception e) { 
			System.out.print("Nhap sai du lieu.");
		}
	}
}
