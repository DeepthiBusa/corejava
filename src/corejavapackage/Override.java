package corejavapackage;

// class A2 {
//
// int i, j;
//
// A2(int a, int b) {
// i = a;
// j = b;
// }
//
// // // display i and j
// void show() {
// System.out.println("i and j: " + i + " " + j);
// }
// }
//
// class B2 extends A2 {
// int k;
//
// B2(int a, int b, int c) {
// super(a, b);
// k = c;
// }
//
// // // display k � this overrides show() in A
// void show() {
// System.out.println("k: " + k);
// }
// }
//
// class Override {
// public static void main(String args[]) {
// A2 supOb = new A2(6, 7);
// B2 subOb = new B2(1, 2, 3);
// subOb.show(); // this calls show() in B
// supOb.show();
// }
// }
// ==============================

/* final to prevent inheritence */
class A2 {
	final void meth() {
		System.out.println("This is a final method.");
	}
}

class B2 extends A2 {
	void meth() { // ERROR! Can't override.
		System.out.println("Illegal!");
	}
}
