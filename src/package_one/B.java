package package_one;

import package_one.A;

public class B {

    int defaultInt; // access int the same package
    public int publicInt; // access everywhere
    protected int protectedInt; // access int the same package
    private int privateInt; // access only inside the class

    A a;

    public B() {

    }
}
