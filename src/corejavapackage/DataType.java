package corejavapackage;

/*
  long 64bit       �9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 maximum
 * int 32bit      �2,147,483,648 to 2,147,483,647 maximum value it can contain in
 * short 16 bit    �32,768 to 32,767 byte 8 �128 to 127
 */
//public class DataType {
//	public static void main(String[] args) {
//
//		long carSpeed = 90;
//		int duration = 2;
//		long distance = carSpeed * duration; // compute distance
//		System.out.print(distance);
//		System.out.print(" hours car will travel about ");
//	}
//}

// ==========================================
/*
 * Floating points 
 * double 64bit range:4.9e�324 to 1.8e+308 
 * float 32 bit range: *
 * 1.4e�045 to 3.4e+038 //
 */
//public class DataType {
//	//
//	public static void main(String[] args) {
//		double pi, r, a;
//		r = 10.8; // radius of circle
//		pi = 3.1416; // pi, approximately
//		a = pi * r * r; // compute area
//		System.out.println("Area of circle is " + a);
//	}
//}

// ======================================
/*
 * Java char is a 16-bit type 65-A 66-B 67-C....88-X 97-a 98-b 99-c .........z
 * ASCII Values
 */
//public class DataType {
//	// // //
//	public static void main(String[] args) {
//		char ch2 = 'Y';
//		char ch1 = 67; // code for C ch1='C'
//		int ch3 = 67; // code for C
//		// //
//
//		System.out.println("ch1 and ch2: " + ch1 + " and " + ch2);
//		System.out.println("integer Ch3: " + ch3);
//
//	}
//}
// =========================================
////
//public class DataType {
//	// //
//	public static void main(String[] args) {
//		// // //
//		boolean b;
//		b = false;
//		System.out.println("b is " + b);
//		b = true;
//		System.out.println("b is " + b);
//
//	}
//}

// ===============================
/*
 * Arrays An array is a group of like-typed variables that are referred to by a
 * common name. Arrays of any type can be created and may have one or more
 * dimensions. A specific element in an array is accessed by its index. Arrays
 * offer a convenient means of grouping related information. Array declaration
 * type var-name[ ]; var-name = new type [size];
 */
// class DataType {
// public static void main(String args[]) {
// int month_days[];
// month_days = new int[12];// new is a special operator that allocates memory.
// month_days[0] = 31;
// month_days[1] = 28;
// month_days[2] = 31;
// month_days[3] = 30;
// month_days[4] = 31;
// month_days[5] = 30;
// month_days[6] = 31;
// month_days[7] = 31;
// month_days[8] = 30;
// month_days[9] = 31;
// month_days[10] = 30;
// month_days[11] = 31;
// System.out.println("April has " + month_days[3] + " days.");
// month_days[10] = 35;
// System.out.println("november has " + month_days[10] + " days.");
// //
// }
// }

// ===========================================
// An improved version of the previous program.
// class DataType {
// public static void main(String args[]) {
// int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
// System.out.println("April has " + month_days[3] + " days.");
// }
// }
// ===================================
//
//class DataType {
//	public static void main(String args[]) {
//		String strOb1 = "First 100 String";
//		String strOb2 = "Second String";
//		String strOb3 = strOb1 + " and " + strOb2;
//		String strOb4 = "100";
//		System.out.println(strOb1);
//		System.out.println(strOb2);
//		System.out.println(strOb3);
//		System.out.println(strOb4);
//		//
//	}
//}
// =========================================

// Type Casting
public class DataType {
	// // //
	public static void main(String[] args) {
		//
		// int i = 100;// 32 bit
		// // // // automatic type conversion
		// long l = i;// 64 bit
		// // // //// automatic type conversion
		// float f = l;// 64 bit value to float
		// System.out.println("Int value " + i);
		// System.out.println("Long value " + l);
		// System.out.println("Float value " + f);
		// // //
		// double d = 9999999999999999999999999.9;
		// int i;
		// // i = d;
		// i = (int) d; // Cast double value of 3.5 to int 3. Assign the resultant
		// // // // //// value
		// System.out.println("i value is :: " + i);

		// 3 to i
		//// Casting from double to int truncates.
		// ////
		int i = 3;
		double d = 9889;
		d = i; // OK, no explicit type casting required
		System.out.println("i value is :: " + d);
		// i = d;
		i = (int) d;
		System.out.println("i value is :: " + i);
		// // //
		// d = (double) i; // Explicit type casting operator used here
		// double aDouble = 55; // Compiler auto-casts int 55 to double 55.0
		// // double nought = 0; // Compiler auto-casts int 0 to double 0.0
		// // int 0 and double 0.0 are different.
		// //
		// //
	}
}
