package a.b.c;

privileged aspect Foo pertypewithin(Runnable+) {
	after() : staticinitialization(*) {
		  System.out.println(thisJoinPointStaticPart+" getWithinTypeName() = " + getWithinTypeName());
		  Class c = thisJoinPointStaticPart.getSourceLocation().getWithinType();
		  System.out.println(thisJoinPointStaticPart+" aspectOf("+c.getName()+") = "+Foo.aspectOf(c).getClass().getName());
	}
}
