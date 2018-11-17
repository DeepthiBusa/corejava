package corejavapackage;

//class BoxSuper {
//	private double height;
//	private double depth;
//	private double width;
//
//	// // construct clone of an object
//	BoxSuper(BoxSuper ob) { // pass object to constructor
//		width = ob.width;
//		height = ob.height;
//		depth = ob.depth;
//	}
//
//	// // // constructor used when all dimensions specified
//	BoxSuper(double w, double h, double d) {
//		width = w;
//		height = h;
//		depth = d;
//	}
//
//	// // // constructor used when no dimensions specified
//	BoxSuper() {
//		width = -1; // use -1 to indicate
//		height = -1; // an uninitialized
//		depth = -1; // box
//	}
//
//	// // // // // constructor used when cube is created
//	BoxSuper(double len) {
//		width = height = depth = len;
//	}
//
//	// // // // // compute and return volume
//	double volume() {
//		return width * height * depth;
//	}
//}
//
//////// BoxWeight now fully implements all constructors.
//class BoxWeight1 extends BoxSuper {
//	double weight; // weight of box
//	// // // construct clone of an object
//
//	BoxWeight1(BoxWeight1 ob) { // pass object to constructor
//		super(ob);
//		// width = ob.width;
//		// height = ob.height;
//		// depth = ob.depth;
//		weight = ob.weight;
//	}
//
//	// // // constructor when all parameters are specified
//	BoxWeight1(double w, double h, double d, double m) {
//		super(w, h, d); // call superclass constructor
//		// height=20
//		weight = m;
//	}
//
//	 // default constructor
//	BoxWeight1() {
//		super();
//		weight = -1;
//	}
//
//	 // constructor used when cube is created
//	BoxWeight1(double len, double m) {
//		super(len);
//		weight = m;
//	}
//}
//
////
//////
//public class SuperDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
//		BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
//		BoxWeight1 mybox3 = new BoxWeight1(); // default
//		BoxWeight1 mycube = new BoxWeight1(3, 2);
//		BoxWeight1 myclone = new BoxWeight1(mybox1);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("Volume of mybox1 is " + vol);
//		System.out.println("Weight of mybox1 is " + mybox1.weight);
//		System.out.println();
//		vol = mybox2.volume();
//		System.out.println("Volume of mybox2 is " + vol);
//		System.out.println("Weight of mybox2 is " + mybox2.weight);
//		System.out.println();
//		vol = mybox3.volume();
//		System.out.println("Volume of mybox3 is " + vol);
//		System.out.println("Weight of mybox3 is " + mybox3.weight);
//		System.out.println();
//		vol = myclone.volume();
//		System.out.println("Volume of myclone is " + vol);
//		System.out.println("Weight of myclone is " + myclone.weight);
//		System.out.println();
//		vol = mycube.volume();
//		System.out.println("Volume of mycube is " + vol);
//		System.out.println("Weight of mycube is " + mycube.weight);
//		System.out.println();
//
//	}
//
//}
// ======================================================

// Using super to overcome name hiding.
class ASuper {
	int i;
}

// Create a subclass by extending class A.

class Bsub extends ASuper {
	int i; // this i hides the i in A

	Bsub(int a, int b) {
		super.i = a; // i in A
		i = b; // i in B
	}

	//
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

//
class SuperDemo {
	public static void main(String args[]) {
		Bsub subOb = new Bsub(1, 2);
		subOb.show();
	}
}
// =======================================================