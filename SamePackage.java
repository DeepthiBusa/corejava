package corejavapackage;

class SamePackage {
	SamePackage() {
		Protection p = new Protection();
		System.out.println("same package constructor");
		System.out.println("n = " + p.n);
		// class only
		System.out.println("n_pri = " + p.n_pri);
		System.out.println("n_pro = " + p.n_pro);// same package so accessible
		System.out.println("n_pub = " + p.n_pub);
	}
}

// int n = 1;
// private int n_pri = 2;
// protected int n_pro = 3;
// public int n_pub = 4;
