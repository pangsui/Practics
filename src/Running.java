
public class Running {

	public static void main(String[] args) {
		Middle obj = new Middle();
		int b[] = {1,2,3,4,5};
		System.out.println(obj.middle(b));
		
		// Summing even number and summing odd numbers in an array;
     	int arr[] = {3,3,4,4};
		System.out.println("The difference is "+obj.sum(arr));
//		
		Middle obj1 = new Middle();
		char b1[] = {'a','b','c'};
		obj1.start(b1, 0, 0);
     	//System.out.print(b1);
		
		System.out.println();
		Middle answer = new Middle();
		System.out.println(answer.reverse(-1234));
		
		
		Middle accen = new Middle();
		int t[] = {3,4,2,1,6,8,7};
		accen.accending(t);
		System.out.println();
		accen.decending(t);

		 System.out.println();
        System.out.print("intersecting = ");
    	Middle ints = new Middle();
		int x1[] = {2,4,5,6,8,9};
     	int y1[] = {2,6,9,3,5};
    	ints.intersects(x1, y1);
		
    	System.out.println();
		Middle reva = new Middle();
		int []g = {9,2,3,4,6,8};
		reva.reversing(g);
		
		System.out.println();
		System.out.println(reva.isprime(6));
		
		System.out.println("Maximum = "+reva.maximum(g));
		int []q = {9,2,3,4,6,8};
		System.out.println();
		System.out.println(accen.indexing(q, 7));
		
		System.out.println();
		
		int []r = {9,2,3,4,8,6,8,2,9};
		reva.duplicate(r);
		
		System.out.println();
		String s = " javav ";
		reva.duplicate(s);
		
		System.out.println();
		
		String st = "How many vowels in this String";
		ints.numberOfVowels(st);
		
		System.out.println();
		
        String n = "1234";
        ints.stringReverse(st);
        System.out.println();
		ints.stringReverse(n);
		
		System.out.println();
		System.out.println(Middle.isPalidrome("madam"));
		
		System.out.println();
		
		System.out.println(ints.factorial(4));
		
		int []a = {0, 1, 1, 2, 3, 5,3};
		System.out.println(ints.fibonacci(a));
		
		System.out.println("The power function...");
		System.out.println(ints.power(5, 2));
		
		System.out.println("The exponential function...");
		System.out.println(ints.exponential(2));
		
		System.out.println();
		int [] p = {2,3,4,6,8,1};
		System.out.print("Removed Array = ");
		ints.removeSpecific(p, 8);
		System.out.println();
		char []ar = {'a','s','e','r','a','a','s','e','s'};
		
		System.out.print("Intersection : ");
		int array1[] = {2, 4, 8};
	    int array2[] = {2, 3, 4, 8, 10, 16};
	    int array3[] = {4, 8, 14, 40};
	    ints.threeCommon(array1, array2, array3);
		
	}

}
