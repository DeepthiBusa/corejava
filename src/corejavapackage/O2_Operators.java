package corejavapackage;

// 1) Arithmetic
// 2) Assignment operator
// 3) logical operator
// 4) Increment decrement
// 5) Ternary operator
// 6) Bitwise operator
//
// public class O2_Operators {
// // // // //
// public static void main(String[] args) {
// // // // // // // // // Assignment operator
// int a = 10;
// System.out.println(a);// 20
// a = a + 10;
// System.out.println(a);// 20
// System.out.println("first program");// 10
// a += 10;// a=a+10
// System.out.println(a);// 20
// a -= 10;
// System.out.println(a);// 0
// a *= 5;
// System.out.println(a);// 50
// // // //
//
// }
// }
// =================================
/*
 * Arithmetic Operators Arithmetic Operators return value based Result.
 * 
 * 1) Addition + (for Addition and String concatenation)
 * 
 * 2) Subtraction - (for Subtraction and negation)
 * 
 * 3) Multiplication *
 * 
 * 4) Division /
 * 
 * 5) Modules %
 * 
 * 6) Increment ++
 */
// Plus operator +
// public class O2_Operators {
// // // // // // // //
// public static void main(String[] args) {
// // int a = 10, b = 5;
// String c = "Selenium", d = " Testing";
// System.out.println("Addition of a, b is: " + (a + b)); // Addition of a, b
// System.out.println("Concatenation of c, d is: " + (c + d)); //
// //
// System.out.println(a - b);
// System.out.println(a + b);
// System.out.println("Subtraction of a, b is: " + (a - b));
// System.out.println("Multiplication of a, b is: " + (a * b));
// System.out.println("Divison of a, b is: " + (a / b));
// System.out.println("Modulas of a, b is: " + (a % b));
// System.out.println("Modulas of a, b is: " + (10 % 3));
// System.out.println(133 % 1000);
// System.out.println(123 % 1000);

// Increment

// ++a- preinclrement
// a++ - post increment
//
// int a = 10;
// // System.out.println(++a);
// System.out.println(a++);
// System.out.println(a);

// 0
// int a = 10, b = 5;
// // // //
// a = ++b;// pre increment
// a = b++;// post increment
// a = b;
// // // // // //
// System.out.println(a);
// System.out.println(b);
// // // ////
// int b = 5;
// // int a;
// int a = --b;
// // a = b--;
// // // // // ////
// System.out.println(a);// 4
// System.out.println(b);
// // // // //
// }
// }
// ---------------------------------------------
// Relational operators return boolean or logical result (true or false)
//
// 1) ==
//
// 2) !=
//
// 3) >
//
// 4) >=
//
// 5) <
//
// 6) <=
// public class O2_Operators {
//
// public static void main(String[] args) {
//
// int a = 20, b = 10;
// System.out.println("a > b is " + (a > b));
// System.out.println("a >= b is " + (a >= b));
// System.out.println("a < b is " + (a < b));
// System.out.println("a <= b is " + (a <= b));
// System.out.println("a == b is " + (a == b));
// System.out.println("a != b is " + (a != b));
// }
// }
// ===============================================================
// Logical operator
// 1) Logical Not operator !
//
// 2) Logical And Operator &&
//
// 3) Logical Or operator ||
// --------------------------------
// Result Criteria for Not operator
// Operand 1 Operand 2 Result
// ----------------------------------------
// true true false
// true false true
// false true true
// false false true
// -----------------------------------------
// Result Criteria for And operator
// Operand 1 Operand 2 Result
// ----------------------------------------
// true true true
// true false false
// false true false
// false false false
// -----------------------------------------
// Result Criteria for Or operator
// Operand 1 Operand 2 Result
// ----------------------------------------
// true true true
// true false true
// false true true
// false false false
// -----------------------------------------
// public class O2_Operators {
// // // //
// public static void main(String[] args) {
// // //
// boolean a = true, b = false;
// System.out.println((a && b));
// System.out.println((a || b));
// System.out.println(!(a && b));
// // //
// // int a = 100, b = 500, c = 700;
// // System.out.println((a > b) && (a > c));
// //
// // System.out.println((a > b) || (a > c));
//
// }
// // //
// }
// =================================
// public class O2_Operators {
// //
// public static void main(String[] args) {
// //
// char grade = 'X';
// int a = 10;
// System.out.println(grade == 'A');
// System.out.println(a == 10);
// System.out.println(a == 11);
//
// System.out.println(grade == 'C');
// //
// }
// }

// ====================================
// Ternary operator

public class O2_Operators {
	////
	public static void main(String[] args) {
		//// //
		int num1, num2;
		num1 = 100;
		num2 = (num1 == 1000) ? 100 : 200;
		System.out.println(num2);

	}
}
// ============================
