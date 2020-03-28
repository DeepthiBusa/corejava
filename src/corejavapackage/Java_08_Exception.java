package corejavapackage;

/*
 * Imagine you�re about to board an airplane to Geneva to attend an important
 * confer- ence. At the last minute, you learn that the flight has been
 * cancelled because the pilot isn�t feeling well. Fortunately, the airline
 * quickly arranges for an alternative pilot, allowing the flight to take off at
 * its originally scheduled time. What a relief! This example illustrates how
 * exceptional conditions can modify the initial flow of an action and
 * demonstrates the need to handle those conditions appropriately. In Java, an
 * exceptional condition (like the illness of a pilot) can affect the normal
 * code flow (airline flight operation). In this context, the arrangement for an
 * alternative pilot can be compared to an exception handler.
 * 
 */
// public class Java_08_Exception {
// public static void main(String[] args) {
// int a = 10;
// int b = a / 0;
// System.out.println(b);
// System.out.println("Java exception");// ArithmeticException: / by zero
// }
// }
// =====================
// public class Java_08_Exception {
// public static void main(String[] args) {
// String s = null;
// System.out.println(s.length());// NullPointerException
// System.out.println("Java exception");
// }
// }

// =========================
// public class Java_08_Exception {
// public static void main(String[] args) {
// String s = "123";
// int y = Integer.parseInt(s);
// System.out.println(y);// NumberFormatException }
// }
// }
// =============================
// public class Java_08_Exception {
// public static void main(String[] args) {
// String s = "abc123";
// int y = Integer.parseInt(s);
// System.out.println(y);// NumberFormatException }
// }
// }

// ================================
// public class Java_08_Exception {
// public static void main(String[] args) {
// int a[] = new int[5];
// a[10] = 100;
// System.out.println(a[10]);
// }
// }
// ==========================

// Try catch

/// *

// =====================
// public class Java_08_Exception {
//
// public static void main(String[] args) {
//
// int a = 10;
// int b = 0;
// int result;
// try {
// result = a / b;
// System.out.println(result);
// } catch (Exception e) {
// System.out.println("Divided by Zero Error");
// }
// System.out.println("Hello Java");
// System.out.println("Hello Selenium");
// }
// }

// =========================================

// public class Java_08_Exception {
// public static void main(String[] args) {
// //
// int a = 10;
// int b = 0;
// int result;
// try {
// result = a / b;
// System.out.println(result);
// } catch (ArithmeticException c) {
// c.printStackTrace();
// System.out.println("Divided by Zero Error");
// }
// System.out.println("Hello Java");
// System.out.println("Hello Selenium");
// }
// }
// ==============================
// public class Java_08_Exception {
// public static void main(String[] args) {
//
// int a = 10;
// int b = 0;
// int result;
// int array1[] = new int[4];
// try {
// result = a / b;
// System.out.println(result);
// } catch (ArithmeticException e) {
// System.out.println("Divided by Zero Error");
// }
// try {
// array1[10] = 100;
// System.out.println(array1[10]);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Array Out of Bound Error");
// }
// System.out.println("Hello Java");
// System.out.println("Hello Selenium");
// }
// }

//// ============================
// public class Java_08_Exception {
// public static void main(String[] args) {
//
// try {
// int data = 25 / 0;
// System.out.println(data);
// } catch (Exception e) {
// System.out.println("abcd");
// e.printStackTrace();
// }
// System.out.println("rest of the code...");
// }
// }
// =========================
// Finally block cant be placed before catch block

// public class Java_08_Exception {
// public static void main(String[] args) {
// try {
// // connect to data base
// //
// int data = 25 / 5;
// System.out.println(data);
// } catch (ArithmeticException e) {
// System.out.println(e);
// } finally {
// System.out.println("finally block is always executed");
// }
// System.out.println("rest of the code...");
// }
// }
// ===========================
// Finally block will be executed even if we do not handle the particular
//// exception

// public class Java_08_Exception {
// public static void main(String[] args) {
// try {
// int data = 25 / 0;
// System.out.println(data);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("error");
//
// } finally {
// System.out.println("finally block is always executed");
// }
//
// System.out.println("rest of the code...");
//
// System.out.println("rest of the code...");
//
// }
// }
// ==================
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
//
// public class Java_08_Exception {
// public static void main(String args[]) {
// openFile();
// System.out.println("after the exception");
//
// }
//
// private static void openFile() {
// FileInputStream fis = null;
// try {
// fis = new FileInputStream("file.txt");
//
// // The return statement does not return the control to
// // the main method before execution of thefinally block
// // completes.
//
// } catch (FileNotFoundException fnfe) {
// System.out.println("file not found");
// return;
// } finally {
// System.out.println("finally");
// }
// System.out.println("Next task..");
//
// }
// }

// ===============
// If both the catch and finally blocks define return statements,
// the calling method will receive a value from the finally block.

// class Java_08_Exception {
//
// public static void main(String args[]) {
// Java_08_Exception var = new Java_08_Exception();
// System.out.println(var.getInt());
// }
//
// int getInt() {
// try {
// String[] students = { "Harry", "Paul" };
// System.out.println(students[5]);
// } catch (Exception e) {
//
// return 10;
// } finally {
// return 20;
// }
// }
//
// }
// ===================
// If a catch block returns a primitive data type, the finally block can�t
// modify the value being returned by it. Here�s an example:

// class Java_08_Exception {
// int getInt() {
// int returnVal = 10;
// try {
// String[] students = { "Harry", "Paul" };
// System.out.println(students[5]);
// } catch (Exception e) {
//
// System.out.println("About to return :" + returnVal);
// return returnVal;
// } finally {
// returnVal += 10;
// System.out.println("Return value is now :" + returnVal);
// }
// return returnVal;
// }
//
// public static void main(String args[]) {
// Java_08_Exception var = new Java_08_Exception();
// System.out.println("In Main:" + var.getInt());
//
// }
// }

// =============

// class Java_08_Exception {
// public static void main(String args[]) {
// String name = null;
// try {
// System.out.println("Try block : open resource 1");
// System.out.println("Try block : open resource 2");
//
// System.out.println("in try : " + name.length());
// System.out.println("Try block : close resources");
// } finally {
// System.out.println("finally : close resources");
// }
// System.out.println("after finally block ");
//
// }
// }
// =======================
// public class Java_08_Exception {
// public static void main(String[] args) {
// try {
// int age = 10;
// if (age < 18) {
// throw new Exception();
// }
// } catch (Exception e) {
// System.out.println(e);
// }
// try {
// int age = 10;
// if (age < 18) {
// throw new NullPointerException();
// }
// } catch (NullPointerException e) {
// System.out.println(e);
// }
// try {
// throw new IOException();
// } catch (IOException e) {
//
// e.printStackTrace();
// }
// }
// }

// ================================
// public class Java_08_Exception {
//
// public static void main(String[] args) {
//
// try {
// validate(10);
// } catch (ArithmeticException e) { //
// e.printStackTrace();
// System.out.println("welcome to exception");
// }
// }
//
// static void validate(int age) {
// if (age < 18)
// throw new ArithmeticException("not valid");
// else
// System.out.println("welcome to vote");
// }
// }

// ==============================
//
// class Java_08_Exception {
// public static void main(String args[]) {
// try {
// int a = 1;
// System.out.println("a = " + a);
// int b = 42 / a;
// int c[] = { 1 };
// c[42] = 99;
// } catch (ArithmeticException e) {
// System.out.println("Divide by 0: " + e);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Array index oob: " + e);
// }
// System.out.println("After try/catch blocks.");
// }
// }

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
////
// class Java_08_Exception {
// public static void main(String[] args) throws InterruptedException {
// System.out.println("Hello java");
// Thread.sleep(10000);
// System.out.println("Hello selenium");
// }
// }

// =====================
// class O8Exception {
// public void finalize() {
// System.out.println("finalize called");
// }
//
// public static void main(String[] args) {
// O8Exception f1 = new O8Exception();
// O8Exception f2 = new O8Exception();
// f1 = null;
// f2 = null;
// System.gc();
// }
// }
// =====================

// class O8Exception {
// public static void main(String args[]){
// int i = 0, j=10;
// try{
// j /=i;
// }
// System.out.print("Divide by Zero! ");
// catch(Exception e){
// System.out.print("error");
// }
// }
// }

/*
 * You can't enter code between try and catch clause. Here line 7 causes the
 * failure. So the answer is E, if you remove line 7 then code will compile fine
 * and provide output as error so in that case answer would be D
 */