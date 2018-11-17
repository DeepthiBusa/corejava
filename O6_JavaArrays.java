package corejavapackage;

/* Java Array is an object that holds a fixed number of values of a
 single data type.
The length of an Array is established when the Array is created.
 Array length is fixed, Java Array has Zero based index.

/*
 *   int intArray[];
 *   int x[];
     int[] intArray;
     byte byteArray[];
     short shortsArray[];
     boolean booleanArray[];
     long longArray[];
     float floatArray[];
     double doubleArray[];
     char charArray[];
     Declaring Array
     var-name = new type [size];
*/

//public class O6_JavaArrays {
//	public static void main(String[] args) {
//		// int intArray[]; // declaring array
//		// intArray = new int[10]; // allocating memory to array
//		// Number a[];
//		int a[] = new int[3];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		System.out.println(a[0]);
//		System.out.println(a[1]);// 50
//		System.out.println(a[2]);// 50
//		System.out.println(a[1] + a[2]);
//
//	}
//}

// ====================================== // 50

//class O6_JavaArrays {
//	public static void main(String[] args) {
//		char[] abc = { 'A', 'B', 'Z' }; // Array of Characters
//		int[] xyz = { 10, 20, 30, 40 }; // Array of Integers
//		String[] a = { "UFT", "Selenium", "RFT" }; // Array of Strings
//		boolean[] b = { true, false, false, true }; // Array of Boolean values
//		System.out.println(abc[1]);// B
//		System.out.println(xyz[3]);// 40
//		System.out.println(a[1]);// Selenium
//		System.out.println(b[2]);// false
//
//	}
//}

// =============================

//class O6_JavaArrays {
//	public static void main(String[] args) {
//		// // $$$Copying Values of one array from another
//		int array1[] = { 1, 2, 3, 4, 5 };
//		int array2[] = array1;
//		int array3[] = array1;
//		System.out.println(array2 == array1);
//
//	}
//}

// ====================================
/* copying the array */
//class O6_JavaArrays {
//	public static void main(String[] args) {
//		int array1[] = { 1, 2, 3, 4, 5 };
//		int array2[] = { 1, 2, 3, 4, 5 };
//		int array2[] = array1;
//
//		// int[] array2 = int[array1.length];
//		// int[] array2
//		// for (int i = 0; i < array1.length; i++) {
//		// System.out.print(array1[i]);
//		// }
//		//
//		// for (int i = 0; i < array1.length; i++) {
//		// array2[i] = array1[i];
//		// }
//		// for (int i = 0; i < array2.length; i++) {
//		// System.out.println(array2[i]);
//		// }
//		System.out.println(array2 == array1);
//
//	}
//}

// ===================================

// Parameters:src - the source array.srcPos - starting position in the source
// array.dest - the destination
// data.length - the number of array elements to be copied.
// public class O6_JavaArrays {
// public static void main(String[] args) {
// int array1[] = { 1, 2, 130, 4, 5 };
// int array2[] = { 1, 2, 13, 8, 9 };
// System.arraycopy(array1, 2, array2, 2, 3);
// for (int i = 0; i < array2.length; i++) {
// System.out.println(array2[i]);
// }
// }
// }

// -------------------------------------
// toString() Method (print Array)
// public class O6_JavaArrays {
// public static void main(String[] args) {
// String[] arr1 = { "UFT", "Selenium", "RFT", "SilkTest" };
// String str = Arrays.toString(arr1);
// System.out.println(str);
// }
// }
// =========================================
// * =============================== boolean : false int : 0 double : 0.0 String
// :
// * null User Defined Type : null // =============================
// */
// ================================
// class O6_JavaArrays {
// public static void main(String[] args) {
// System.out.println("String array default values:");
// String str[] = new String[5];
// for (String s : str)
// System.out.print(s);
// System.out.println("\n\nInteger array default values:");
// int num[] = new int[5];
// for (int val : num)
// System.out.print(val + " ");
// System.out.println("\n\nDouble array default values:");
// double dnum[] = new double[5];
// for (double val : dnum)
// System.out.print(val + " ");
// System.out.println("\n\nBoolean array default values:");
// boolean bnum[] = new boolean[5];
// for (boolean val : bnum)
// System.out.print(val + " ");
// System.out.println("\n\nReference Array default values:");
// O6_JavaArrays ademo[] = new O6_JavaArrays[5];
// for (O6_JavaArrays val : ademo)
// System.out.print(val + " ");
//
// // String s = "null";
// // String s1 = null;
// // if (s == s1) {
// // System.out.println("true");
// // } else {
// // System.out.println("false");
// // }
//
// }
// }

// ================================ARRAY LIST=================
/* ........... Normal Array............. */
// class O6_JavaArrays {
// public static void main(String[] args) {
// int[] arr = new int[3];
// arr[0] = 1;
// arr[1] = 2;
// arr[2] = 2;
// arr[3] = 2;
// arr[4] = 2;
//
// }
// }
// ============================================
// class O6_JavaArrays {
// public static void main(String[] args) {
// String[] arr1 = { "UFT", "Selenium", "RFT", "SilkTest" };
// arr1[4] = "python";
// }
// }
// ==================================
// class O6_JavaArrays {
// public static void main(String[] args) {// System.out.println(arr[0]);
// ArrayList<Integer> arrL = new ArrayList<Integer>(2);
// arrL.add(1);
// arrL.add(2);
// arrL.add(33);
// arrL.add(20);
// arrL.add(233);
// System.out.println(arrL.get(4));
// System.out.println(arrL);
// System.out.println(arrL.size());
//
// }
// }
// ==========================================

// class O6_JavaArrays {
// public static void main(String[] args) {
// ArrayList<Integer> arrL = new ArrayList<Integer>();
// arrL.add(1);
// arrL.add(2);
// arrL.add(33);
// arrL.add(20);
// arrL.add(233);
// System.out.println(arrL.get(4));
// System.out.println(arrL);
//
// }
// }
// ========================================
// class O6_JavaArrays {
// public static void main(String[] args) {
// int a[];
// a = new int[-5];
// a[1] = 10;
// a[3] = 20;
// System.out.println(a[2]);
// }
// }
// ===========================================
// class O6_JavaArrays {
// public static void main(String[] args) {
// int a[];
// a = new int[5];
// a[1] = 10;
// a[3] = 20;
// System.out.println(a[2]);
// }
// }
// ==================================

// class O6_JavaArrays {
// public static void main(String[] args) {
// // Sorting of an array
// int a[] = { 100, 20, 100, 101 };
// Arrays.sort(a);
// for (int i = 0; i < a.length; i++) {
// System.out.println(a[i]);
// }
// }
// }

// ======================================
// class O6_JavaArrays {
// public static void main(String[] args) {
//
// String arr[] = { "z", "x", "c", "d" };
//
// Arrays.sort(arr);
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);
// }
//
// }
// }
// =================================
// no< capital letter< small letter
// class O6_JavaArrays {
// public static void main(String[] args) {
// String arr1[] = { "1212z", "x", "c", "d", "A", "222" };
//
// Arrays.sort(arr1);
// for (int i = 0; i < arr1.length; i++) {
// System.out.println(arr1[i]);
// }
// }
// }
// =====================================

// class O6_JavaArrays {
// public static void main(String[] args) {
// int a[];
// a = new int[5];
// Arrays.fill(a, 10);// fill the values by 10
// for (int i = 0; i < a.length; i++) {
// System.out.println(a[i]);
// }
// }
// }
// =============================
class O6_JavaArrays {
	public static void main(String[] args) {
		System.out.println(new int[] { 1, 2, 3, 4 }.length);// annonymous array
		System.out.println(new int[] { 1, 2, 3, 4 }[1]);
	}
}
// ================================

// class O6_JavaArrays {
// public static void main(String[] args) {
// int a[] = { 1, 2, 3, 4 };
// for (int i = 0; i < a.length; i++) {
// System.out.println(a[i]);
// }
// }
// }

// Write a Java program to sum values of an array.
// Write a Java program to find max value of an integer array.
// Write a Java program to find min value of an integer array.
// Write a Java program to calculate the average value of array elements.
//
// Write a Java program to test if an array contains a specific value.
//
// Write a Java program to find the index of an array element.
//
// Write a Java program to remove a specific element from an array.
//
// Write a Java program to reverse an array of integer values
//
// Write a Java program to find the duplicate values of an array of integer
// values.
//

// Comparing array
// class O6_JavaArrays {
// public static void main(String[] args) {
// int[] arrayone = { 2, 5, 6, 7, 8 };
// // int[] arraytwo;
// int[] arraytwo = { 2, 5, 9, 7, 8 };//
// // arraytwo = arrayone;
// boolean same = false;
// // System.out.println(arrayone == arraytwo);
// // // System.out.println(arrayone);
// // // System.out.println(arraytwo);
// // //
// for (int i = 0; i < arrayone.length; i++) {
// if (arrayone[i] == arraytwo[i]) {
// same = true;
// } else {
// // System.out.println("different");
// same = false;
// break;
// }
// // //
// }
// if (same) {
// System.out.println("same array");
// } else {
// System.out.println("different");
// // //
// }
// // System.out.println(Arrays.equals(arrayone, arraytwo));
// } //
// }
////
// ==========================

// class O6_JavaArrays {
// public static void main(String[] args) {
//
// // int[] array1 = { 1, 2, 3, 4, 5 };
// // int[] array2 = new int[array1.length];
// int[] array2 = { 3, 4, 5, 6, 7 };
// //// // //
// String[] names = { "abc", "sys", "xyz", "ashok" };
//
// for (int i = 0; i < names.length; i++) {
// if (names[i].startsWith("a")) {
// System.out.println(names[i]);
// }
//
// }
// }
// }