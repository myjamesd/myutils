package com.gangjian.jvm;

public class RuntimeConstantPoolOOM2 {

	public static void main(String[] args) {
		String str1 = new StringBuffer("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);

		String str2 = new StringBuffer("ja").append("va").toString();
		String str3 = "java";
		System.out.println(str2.intern() == str2);
	}

}
