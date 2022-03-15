package com.adltestapi;

import java.util.Scanner;

import org.testng.annotations.Test;


public class MainTest_CRUD {
	private Post test01_POST;
	private Get test02_1_GET;
	private Patch test02_2_PATCH;
	private Put test03_PUT;
	private Delete test06_DELETE;
	
	
	@Test(priority = 0)
	public void test01_post() {
		
		test01_POST = new Post();
		
		test01_POST.test01_post();
		
		System.out.println("test post selesai");

	}
	@Test(priority = 1)
	public void test02_get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user post terbaru metode get: ");
		int inputid=sc.nextInt();
		
		test02_1_GET = new Get();
		test02_1_GET.test_01();
		test02_1_GET.test_02(inputid);
		
		System.out.println("test get selesai");

	}
	@Test(priority = 2)
	public void test03_patch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user dan nama patch terbaru metode : ");
		int inputid=sc.nextInt();
//		System.out.println("");
		String inputnama = sc.next();
		
		test02_2_PATCH = new Patch();
		test02_2_PATCH.test03_patch(inputid,inputnama);
//		test02_2_PATCH.test03_2patch(inputid);
		
		System.out.println("test patch selesai");

	}
	@Test(priority = 3)
	public void test04_put() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user dan nama put terbaru metode : ");
		int inputid=sc.nextInt();
		String inputnama = sc.next();
		
		test03_PUT = new Put();
		test03_PUT.test02_put(inputid,inputnama);

	}
	@Test(priority = 4)
	public void test04_delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user dan nama delete terbaru metode : ");
		int inputid=sc.nextInt();
		String inputnama = sc.next();
		
		test06_DELETE = new Delete();
		test06_DELETE.test04_delete(inputid, inputnama);
		

	}
	
	

}
