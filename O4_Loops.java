package corejavapackage;

// // // // // // /*
// // // // // // * // * //Print 1 to 10 Numbers one counter should be taken
// // // // // // initialization:once
// // // // // // * condition:Will be checked*every time
// increment/decrement:every
// // // timedo
// // // // // // */

// public class O4_Loops {
// public static void main(String[] args) {
// for (int i = 0; i <= 10; i = i + 1) {
// // System.out.println("java");
// System.out.println("java : " + i);
// }
// }
// }
// ======================================
// public class O4_Loops {
// public static void main(String[] args) {
// for (int i = 10; i >= 1; i--) {
// System.out.println(i);
// }
// }
// }
// ========================================
// public class O4_Loops {
// public static void main(String[] args) {
// for (int i = 1; i <= 10; i++) {
// if (i != 7) {
// System.out.println(i);
// }
// }
// System.out.println("out of loop");
// }
// }
// ================================
// Print 1 to 10 Numbers except 4th number and 7th Number
// public class O4_Loops {
// public static void main(String[] args) {
// for (int i = 1; i <= 10; i++) {
// if ((i != 4) && (i != 7)) {
// System.out.println(i);
// }
// }
// }
// }

// ==========================
// public class O4_Loops {
// public static void main(String[] args) {
// for (int i = 1; i <= 10; i++) {
// if ((i != 4) && (i != 7)) {
// System.out.println(i);
// } else {
// System.out.println("java " + i);
//
// }
// }
// }
// }
// ========================================
// public class O4_Loops {
// public static void main(String[] args) {
// int i = 2;
// while (i <= 10) {
// System.out.println(i);
// i++;
// }
// }
// }
// ===================
//// Print 10 to 1 Numbers
// public class O4_Loops {
// public static void main(String[] args) {
// int i = 10;
// while (i >= 1) {
// System.out.println(i);
// i--;
// }
// }
// }

// ====================

// // //// Print 1 to 10 Numbers except 7
// // //
// public class O4_Loops {
// public static void main(String[] args) {// //
// int i = 1;
// while (i <= 10) {
// if (i != 7) {
// System.out.println(i);
// }
// i++;
// }
// }
// }

// ---------------------------------------
// public class O4_Loops {
// public static void main(String[] args) {
// int i = 1000;
// do {
// System.out.println("i value is : " + i);
// i++;
// } while (i <= 10);
// }
// }

// ========================================

// Using Enhanced For Loop
// public class O4_Loops {
//
// public static void main(String[] args) {
//
// char[] vowels = { 'a', 'j', 'i', 'o', 'u' };
//
// // System.out.println(vowels[1]);
//
// for (char x : vowels) {
// System.out.println(x);
// }
// }
// }
// ====================
// Using Enhanced For Loop
// public class O4_Loops {
// public static void main(String[] args) {
// int[] vowels = { 100, 111, 3434, 878, 999 };
// for (int x : vowels) {
// System.out.println(x);
// }
// }
// }
// =========================

// public class O4_Loops {
// public static void main(String[] args) {
// int[] vowels = { 100, 111, 3434, 878, 999 };
// for (int x : vowels) {
// System.out.println(x * 2);
// }
// }
// }
// ========================
// public class O4_Loops {
// public static void main(String[] args) {
// String[] vowels = { "python", "java", "scala", "java script" };
// for (String x : vowels) {
// System.out.println(x);
// }
// }
// }

// --------------------
// public class O4_Loops {
// public static void main(String[] args) {
// int[] mathOperations = new int[3];
// int a = 10, b = 20;
// mathOperations[0] = a + b;
// mathOperations[1] = a - b;
// mathOperations[2] = a * b;
// for (int operation : mathOperations) {
// System.out.println(operation);
// }
// }
// }
// =======================================

// =======================================
//class O4_Loops {
//	public static void main(String[] arg) {
//		{
//			int[] marks = { 125, 132, 95, 116, 110 };
//			//
//			int highest_marks = maximum(marks);
//			System.out.println("The highest score is " + highest_marks);
//		}
//	}
//
//	public static int maximum(int[] numbers) {
//		int maxSoFar = numbers[0];
//
//		// // for each loop
//		for (int num : numbers) {
//			if (num > maxSoFar) {
//				maxSoFar = num;
//			}
//		}
//		return maxSoFar;
//	}
//}

// ===============================
//// break
//public class O4_Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			if (i == 5) {
//				System.out.println("this is inside break :" + i);
//				 break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("Out side the loop");
//	}
//}
// ==========================================
//public class O4_Loops {
//	//
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 10; i++) {
//			if (i == 7) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		System.out.println("Out side the loop");
//
//	}
//	// //
//}
// ===================================
//public class O4_Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if (i == 7) {
//				continue;
//			}
//		}
//		System.out.println("Out side the loop");
//	}
//
//}
// ==================================
//public class O4_Loops {
//	public static void main(String[] args) {
//		int i = 0;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//
//	}
//}
// ===========================
//public class O4_Loops {
//	public static void main(String[] args) {
//		// Using Label for outer and for loop
//		int i = 1;
//		for (int j = 1; j <= 3; j++) {
//
//			System.out.println(i + " " + j);
//		}
//
//	}
//}
// =========================

//public class O4_Loops {
//	public static void main(String[] args) {
//		int i = 2;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//
//	}
//}
// =======================
//public class O4_Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
//	}
//}

// =====================================
// Loop labeling

//public class O4_Loops {
//	public static void main(String[] args) {
//		// Using Label for outer and for loop
//		aa: for (int i = 1; i <= 3; i++) {
//			bb: for (int j = 1; j <= 3; j++) {
//				if (i == 2 && j == 2) {
//					break aa;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
//	}
//}
// ==============================
//public class O4_Loops {
//	public static void main(String[] args) {
//		aa: for (int i = 1; i <= 3; i++) {
//			bb: for (int j = 1; j <= 3; j++) {
//				if (i == 2 && j == 2) {
//					break bb;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
//	}
//}
// ==================================

public class O4_Loops {
	public static void main(String[] args) {
		// Using no condition in for loop
		for (;;) {

			System.out.println("infinitive loop");
			// break;
			// continue;
		}
	}
}

// ======================
// # ***********For loop**********
// # 1) Write a program to find the factorial value of any number entered
// through the keyboard.
// # 2) Two numbers are entered through the keyboard. Write a program to find
// the value of one number raised to the power
// # of another.
// # 3) Write a program to enter the numbers till the user wants and
// # at the end it should display the count of positive, negative and
// # zeros entered.
