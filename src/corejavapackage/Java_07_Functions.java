package corejavapackage;

// <access modifier> returnType methodName(Parameters){Method body}
// public static void main(String[] args) {}

// public
//
// modifier -It is optional, it defines access type of the method
//
// returnType - Method may retrun a value
//
// methodName - Name of the method.
//
// parameters - Parameters are optional, we can use mutiple parameters by
// separating with ,
//
// method body - set of statements define that what the method does.

// */

// public class O7Functions {
// // // // // // // // //
// public static void main(String[] args) {
// System.out.println("Before function");
// // printclass();
// System.out.println("after function");
// // //
// printclass();
// printclass();
// printclass();
// printname();
// printname();
// printname();
// // // printname();
// // // printname();
// // // printname();
// }
//
// //
// // //
// public static void printclass() {
// System.out.println("I am learning java");
// }
//
// //
// //
// public static void printname() {
// System.out.println("I am learning python");
// }
// }

// =================================
// public class O7Functions {
// // // //
// public static void main(String[] args) {
// printname("java");
// printname("python");
// printname("javascript");
// addLang("javascript ", " Java", " Python");
//
// }
//
// //
// public static void printname(String s) {
// System.out.println("I am learning " + s);
// }
//
// //
// // //
// public static void addLang(String s1, String s2, String s3) {
// System.out.println(s1 + s2 + s3);
// //
// }
// }
// ================================
// public class O7Functions {
// //
// public static void main(String[] args) {
// double r = 22.0;
// getArea(r);
//// System.out.println("area is " + area);
//
// }
//
// //
// public static void getArea(double radius) {
// //
// double area = radius * radius * Math.PI;
// System.out.println("area is " + area);
//
// }
// }
// =================================
// public class O7Functions {
// //
// public static void main(String[] args) {
// double r = 22.0;
// double area = getArea(r);
// double price = area * 2000;
// System.out.println("Price is " + price);
//
// }
//
// public static double getArea(double radius) {
//
// double area = radius * radius * Math.PI;
// return area;
// }
// }

// ================================

// TODO Auto-generated method stub
//
// public class O7Functions {
// //
// public static void main(String[] args) {
// //
// int c, d;
// c = add(5, 3);
// d = add(100, 200);
// System.out.println(c * 10);
// System.out.println(d);
//
// }
//
// public static int add(int a, int b) {
// int result;
// result = a + b;
// return result;
// }
// }
// ===========================
// public class O7Functions {
// public static void main(String[] args) {
// studentRank(1000);
// }
//
// public static void studentRank(int marks) {
// if (marks >= 600) {
// System.out.println("Rank:A1");
// } else if (marks < 500) {
// System.out.println("Rank:A2");
// } else {
// System.out.println("Rank:A3");
// }
// }
// }

// ===========================================
//
// public class O7Functions {
// public static void main(String[] args) {
// String Rank = studentRank(1000);
// System.out.println(Rank);
// }
//
// public static String studentRank(int marks) {
// if (marks >= 600) {
// String r = "A1";
// return r;
// } else if (marks <= 500) {
// String r = "A2";
// return r;
// } else {
// String r = "A3";
// return r;
// }
// }
// //
// }

// ====================================

/* Function Overloading */
// ---------------------------
// public class O7Functions {
// public static void main(String[] args) {
// add(1000);
// System.out.println("after function execution");
// add(1000, 2000);
// int z = add(1000, 2000, 30000);
// System.out.println(z);
// double a, b;
// a = 1000;
// b = 10000;
// add(a, b);
// }
//
// public static void add(int a) {
// int result;
// result = a + 10;
// System.out.println(result);
//
// }
//
// public static int add(int a, int b, int c) {
// int result;
// result = a + b + c;
// System.out.println(result);
//
// return result;
// }
//
// public static void add(int a, int b) {
// int result;
// result = a + b;
// System.out.println(result);
//
// }
//
// //
// public static void add(double a, double b) {
// double result;
// result = a + b;
// System.out.println(result);
//
// }
//
// }