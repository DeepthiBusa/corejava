package corejavapackage;

class A {
	// private int data = 40;
	int data = 40;

	// void msg() {
	// System.out.println("Hello java");
	// }

	// }

	private void msg() {
		System.out.println("Hello java");
	}
}

// public class AccessModifiers {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// A obj = new A();
// System.out.println(obj.data);// Compile Time Error
//// obj.msg();
// }
//
// }

class B {
	public static void main(String args[]) {
		A obj = new A();// Compile Time Error
		obj.msg();// Compile Time Error

		// System.out.println(data);
	}
}