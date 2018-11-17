package corejavapackage;

//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 200;
//		if (a == b) {
//			System.out.println("A is a Big Number");
//		}
//		System.out.println("After if");
//	}
//}
// =================================
// // 2) Executing a block of statements when compound condition is true

//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int a, b, c = 2;
//		a = 100;
//		b = 15;
//		if ((a > b) && (a > c)) {
//			System.out.println("A is a Big Number");
//		}
//		System.out.println("After if");
//	}
//}
// =============================
// Program to check odd even number
//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int a = 100;
//		// int a = 101;
//		if (a % 2 == 0) {
//			System.out.println("its even Number");
//		}
//		System.out.println("its out side");
//	}
//}

// ====================================
// 3) Executing a block of statements when condition is true. otherwise
// executing another block of statements
//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 50;
//		if (a > b) {
//			System.out.println("A is a Big Number");
//		} else {
//			System.out.println("B is a Big Number");
//		}
//
//		System.out.println("I am after the if else");
//	}
//}
// =================================
// 4) Decide among several Alternates (else if structure)

//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int a = 50;
//		if ((a >= 1) && (a < 100)) {
//			System.out.println("A is a Small Number");
//		} else if ((a > 100) && (a <= 1000)) {
//			System.out.println("A is a Medium Number");
//		} else if (a > 1000) {
//			System.out.println("A is a Big Number");
//		} else {
//			System.out.println("A is either Zero or negative value");
//		}
//	}
//}
// ===============================================
//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 50;
//		if (a > b) {
//			if (a > 5) {
//				System.out.println("A is a Big Number");
//			}
//		}
//		System.out.println("I am after the if else");
//	}
//}
// =====================================
//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 10;
//		b = 50;
//		if (a < b) {
//			if (a < 5) {
//				System.out.println("A is a Big Number");
//			}
//		}
//		System.out.println("I am after the if else");
//	}
//}
// ============================================
// 6) Decide among several alternates (using Switch case structure).
// char grade = 'D';
////
// long startTime = System.nanoTime();
// .....your program....
// long endTime = System.currentTimeMillis();
// long totalTime = endTime - startTime;
// System.out.println(totalTime);
//
//public class O3_IF_Else {
//	public static void main(String[] args) {
//
//		// int a = 10;
//		int a = 'C';
//
//		// int a = 1070;
//		// int a = 40;
//		switch (a) {
//		case 10:
//			System.out.println("Excellent");
//			break;//
//		case 40:
//			System.out.println("Well Done");
//			break;
//		case 'C':
//			System.out.println("Better");
//
//			break;
//		default:
//			System.out.println("Invalid Grade");
//		}
//		System.out.println("After switch case");
//	}
//}
// =========================================

//public class O3_IF_Else {
//	//
//	public static void main(String[] args) {
//
//		// int a = 10;
//
//		int a = 40;
//
//		switch (a) {
//		case 10:
//			System.out.println("Excellent");
//			break;//
//		case 40:
//			System.out.println("Well Done");
//		case 'C':
//			System.out.println("Better");
//			break;
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}
// =======================================

//public class O3_IF_Else {
//	//
//	public static void main(String[] args) {
//
//		int a = 10;
//
//		switch (a) {
//		//
//		case 10:
//			System.out.println("Excellent");
//
//		case 40:
//			System.out.println("Well Done");
//
//		case 'C':
//			System.out.println("Better");
//
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}
// =========================================

//public class O3_IF_Else {
//	//
//	public static void main(String[] args) {
//		String a = "Excellent";
//		switch (a) {
//		case "Excellent":
//			System.out.println("Excellent");
//			break;
//		case "Well Done":
//			System.out.println("Well Done");
//			break;
//		case "Better":
//			System.out.println("Better");
//			break;
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}
// =========================================

//public class O3_IF_Else {
//	public static void main(String[] args) {
//		String a = "Excellent";
//		int marks = 50;
//		switch (a) {
//		case "Excellent":
//			switch (marks) {
//			case 60:
//				System.out.println("second division");
//				break;
//			case 50:
//				System.out.println("second division");
//				break;
//			case 40:
//				System.out.println("third division");
//				break;
//			default:
//				System.out.println("Invalid Grade");
//			}
//			System.out.println("Excellent");
//			break;
//		case "Well Done":
//			System.out.println("Well Done");
//			break;
//		case "Better":
//			System.out.println("Better");
//			break;
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}

//// =====================================//
//public class O3_IF_Else {
//	public static void main(String[] args) {
//		char grade = 'A';
//		if (grade == 'A') {
//			System.out.println("Excellent");
//		} else if (grade == 'B') {
//			System.out.println("well done");
//		} else if (grade == 'C') {
//			System.out.println("better");
//		} else {
//			System.out.println("invalid grade");
//		}
//	}
//}

// ===============================
//public class O3_IF_Else {
//	public static void main(String[] args) {
//		int x = -10;
//		boolean a = false;
//		if (x == 0) {
//			System.out.println("x is zero");
//			a = true;
//		} else {
//			if (x > 0) {
//				System.out.println("x is positive");
//				a = false;
//			} else {
//				System.out.println("x is negative");
//				a = true;
//			}
//		}
//		if (a) {
//			System.out.println("a is true");
//		} else {
//			System.out.println("a is false");
//		}
//	}
//}
// ==========================================
public class O3_IF_Else {
	public static void main(String[] args) {
		String Branch = "CSE";
		int year = 2;
		switch (year) {
		case 1:
			System.out.println("elective courses : Advance english, Algebra");
			break;
		case 2:
			switch (Branch) // nested switch
			{
			case "CSE":
			case "CCE":
				System.out.println("elective courses : Machine Learning, Big Data");
				// break;

			case "ECE":
				System.out.println("elective courses : Antenna Engineering");
				break;
			default:
				System.out.println("Elective courses : Optimization");
			}
		}
	}
}
// ======================

// #Assignment
// # 1)The current year and the year in which the employee joined the
// organization are entered through the keyboard. If the number of years for
// which the employee has
// # served the organization is greater than 3 then a bonus of Rs. 2500/- is
// given to the employee. If the years of service are not greater
// # than 3, then the program should do nothing.
// # 2) The marks obtained by a student in 5 different subjects are input
// through the keyboard. The student gets a
// # division as per the following rules: Percentage above or equal to 60 -
// First division
// # Percentage between 50 and 59 - Second division
// # Percentage between 40 and 49 - Third division
// # Percentage less than 40 - Fail
// # Write a program to calculate the division obtained by the student
// # 3) A company insures its drivers in the following cases:
// # If the driver is married.
// # If the driver is unmarried, male & above 30 years of age.
// # If the driver is unmarried, female & above 25 years of age.
// # In all other cases the driver is not insured. If the marital status, sex
// and age of the driver are the inputs, write a program to determine
// # whether the driver is to be insured or not.
// # 4) If cost price and selling price of an item is input through the
// keyboard, write a program to determine whether the seller has
// # made profit or incurred loss. Also determine how much profit he made or
// loss he incurred.
// # 5) Any integer is input through the keyboard. Write a program to find out
// whether it is an odd number or even number.
// # 6) Any year is input through the keyboard. Write a program to determine
// whether the year is a leap year or not.
// # (Hint: Use the % (modulus) operator)
// # 8) A five-digit number is entered through the keyboard. Write aprogram to
// obtain the reversed number and to determine
// # whether the original and reversed numbers are equal or not.
// # 9) If the ages of Ram, Shyam and Ajay are input through the keyboard, write
// a program to determine the youngest of the
// # three.
// # 10) Write a program to check whether a triangle is valid or not, when the
// three angles of the triangle are entered through the
// # keyboard. A triangle is valid if the sum of all the three angles is equal
// to 180 degrees.
//
// # 11)Find the absolute value of a number enter
//
