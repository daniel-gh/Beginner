package com.ibm.eclipse;

//commit 3
//commit 2
//commit 1
//commit 0
//test
/**
 * 
 * @author 051589858
 *
 */
public class FirstJavaClass {
	private int var1;
	private int var2;
	// comment

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	private static final double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = calculateSumForSumething(numbers);

		//
		System.out.println(sum);

		int radius = 0;
		double area = PI * radius * radius;
		System.out.println("Area: " + area);

	}

	private static int calculateSumForSumething(int[] numbers) {
		int rename = 0;
		for (int number : numbers) {
			rename += number;
		}
		return rename;
	}

}
