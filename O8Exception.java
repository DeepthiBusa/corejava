package corejavapackage;

//public class O8Exception {
//	// //
//	public static void main(String[] args) {
//		// // // TODO Auto-generated method stub
//		int a = 10 / 0;
//		System.out.println(a);
//		System.out.println("Java exception");// ArithmeticException: / by zero
//	}
//}
// =====================
//
//public class O8Exception {
//
//	public static void main(String[] args) {
//
//		String s = null;
//		System.out.println(s.length());// NullPointerException
//		System.out.println("Java exception");
//	}
//}

// =========================
//
//public class O8Exception {
//
//	public static void main(String[] args) {
//
////		String s = "123";
//		 String s = "abc123";
//
//		int y = Integer.parseInt(s);
//		System.out.println(y);// NumberFormatException }
//	}
//}

// ================================
//public class O8Exception {
//
//	public static void main(String[] args) {
//
//		int a[] = new int[5];
//		a[10] = 100;
//		System.out.println(a[10]);//
//		// ArrayIndexOutOfBounds }
//	}
//}

// ==========================

//public class O8Exception {
//	public static void main(String[] args) {
//
//		int a = 10;
//		int b = 0;
//		int result;
//		result = a / b;
//		System.out.println(result);
//		System.out.println("Hello Java");
//		System.out.println("Hello Selenium");
//	}
//}

// =================================
// Try catch

/// *
//public class O8Exception {
//
//	public static void main(String[] args) {
//
//		int a = 10;
//		int b = 0;
//		int result;
//		try {
//			result = a / b;
//			System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println("Divided by Zero Error");
//		}
//		System.out.println("Hello Java");
//		System.out.println("Hello Selenium");
//	}
//}

// =========================================

//public class O8Exception {
//	public static void main(String[] args) {
//
//		int a = 10;
//		int b = 0;
//		int result;
//		int array1[] = new int[4];
//		try {
//			result = a / b;
//			System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println("Divided by Zero Error");
//		}
//		try {
//			array1[10] = 100;
//			System.out.println(array1[10]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Out of Bound Error");
//		}
//		System.out.println("Hello Java");
//		System.out.println("Hello Selenium");
//	}
//}

// ============================
////
//public class O8Exception {
//	//
//	public static void main(String[] args) {
//
//		try {
//			// int data = 25 / 5;
//			int data = 25 / 0;
//			//
//			System.out.println(data);
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//			// closing file
//		}
//
//		finally {
//			// closing file
//			System.out.println("finally block is always executed");
//		}
//		//
//		System.out.println("rest of the code...");
//	}
//}

// ================================
//public class O8Exception {
//
//	public static void main(String[] args) {
//
//		try {
//			validate(10);
//		} catch (ArithmeticException e) { //
//			e.printStackTrace();
//			System.out.println("welcome to exception");
//
//		}
//	}
//
//	static void validate(int age) {
//		if (age < 18)
//			throw new ArithmeticException("not valid");
//		else
//			System.out.println("welcome to vote");
//	}
//}

// ==============================
//
//public class O8Exception {
//	//
//	public static void main(String[] args) {
//		//
//		try {
//			int age = 10;
//			if (age < 20) {
//				throw new NullPointerException();
//			}
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		}
//		//
//		try {
//			throw new IOException();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}

// =================================
// Handle an exception and move on.

// ===============================

class O8Exception {
	public static void main(String args[]) {
		try {
			int a = 1;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		System.out.println("After try/catch blocks.");
	}
}

// ======================================
// The Java throws keyword is used to declare an exception. It gives an
// information to the programmer
// that there may occur an exception so it is better for
// the programmer to provide the exception handling code so that normal flow can
// be maintained.
// We can use throws keyword to delegate the responsibility of exception
// handling to the caller (It may be a method or JVM) then caller method is
// responsible to handle that exception.
// throws

// throws is a keyword in Java which is used in the signature of method to
// indicate that this method might throw
// one of the listed type exceptions. The caller to these methods has to handle
// the exception using a try-catch block.

// Java program to illustrate error in case
// of unhandled exception
// class O8Exception {
// public static void main(String[] args) {
// Thread.sleep(10000);
// System.out.println("Hello world");
// }
// }

// Explanation : In the above program, we are getting compile time error because
// there is a chance of exception if
// the main thread is going to sleep, other threads get the chance to execute
// main() method which will cause InterruptedException.

// ---------------------

// class tst {
// public static void main(String[] args) throws InterruptedException {
// Thread.sleep(10000);
// System.out.println("Hello workd");
// }
// }
