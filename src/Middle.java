public class Middle{
	
	public int middle(int []a) {
		if(a.length % 2 ==0 || a==null) return 0;
		int middleIndex = a.length/2;
	int middleElement = a[middleIndex];
	
	for(int i=0;i<a.length;i++) {
		if(i!=middleIndex && middleElement>=a[i])
			return 0;
	}
	return 1;
	}
	
	//summing even and substract from sum of odd
	
	public int sum(int []s) {
		int evenSum =0;
		int oddSum = 0;
		for(int i=0;i<s.length;i++) {
			if(s[i]%2==0) {
				evenSum = evenSum + s[i];
			}
				else 
					oddSum = oddSum + s[i];
		}
		return evenSum - oddSum;
	}
	
	//this method counts the element of an array from a given start point
	
	public void start(char []c, int start, int len) {
		char sub [] = new char[len];
		for(int i = start, j = 0; j<len; i++,j++) {
			
			sub[j] = c[i];
		}
		   for(int l = 0; l<len; l++) System.out.print(sub[l]+" ");
	}
	
	//this method reverses a number
	
	public int reverse(int number) {
		int rev= 0;
		int carry;
		while(number!=0) {
			carry = number%10;  //this gives the last digit of the number
			rev = rev*10 + carry;  //append it at first position 
			number = number/10;   //strips the last digit after each iteration
		}
		 return rev;   //the final reversed number
	}
	
	//this method prints number in accending order and 
	//also prints out the first 3 smallest
	
	public void accending(int []a) {
		int temp;
		System.out.print("Accending = ");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
				
				if(a[i]<a[j]) {  //where element a[j] is smallest
					
					temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
				
			}
		}
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
		
	}
	
	//this method prints in descending order
	public void decending(int []a) {
		int temp;
		System.out.print("decending = ");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
				
				if(a[i]>a[j]) {  //where element a[j] is greatest
					
					temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
				
			}
		}
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
		
	}
	//This method reverses and array
	
	public void reversing(int []rev) {
		int n=rev.length;
		System.out.print("Reversing = ");
		
		for(int i=n-1 ;i>0;i--) {
			System.out.print(rev[i]+" ");
			
		}
	}
	//this method gives intersection
	
	public void intersects(int[] a, int []b) {
		int min = a.length < b.length ? a.length : b.length;
		int sub[] = new int[min];
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<b.length;j++) {
				if(a[i]==b[j]) {
			    //    sub[i] = a[i];		
			       System.out.print(a[i]+" ");
				   }
				}		
		}		
	}
	// this method verifies if a number is prime or not
	
	public boolean isprime(int n) {
		int i;
		if(n==2) return true;
		
		for(i=2;i<n;i++) {
			
			if(n % i ==0) 
				return false;
			
		}
		return true;
	}
	//this method prints maximum number in an aray
	
	public int maximum(int a[]) {
		int max = a[0];
		int min =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>a[0]) {
				
				max = a[i];
			}
		}
		return max;
		
		}
		//This method prints the index of an array when the element is passed
	public int indexing(int []a, int n) {
		System.out.print("the index of "+n+" is ");
		for(int index=0; index<a.length;index++) {
			if(n==a[index])
			return index;
		}
		return 0;
	}
	//THIS METHOD IS FOR DUPLICATES ELEMENT IN AN ARRAY
	
	public void duplicate(int []a) {
		
		System.out.print("Duplicate =");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j] & i!=j) {
					System.out.print(a[i]+",");
				}
			}
			
		}
		
	}
	
	//this method prints duplicate element element in a string
	public void duplicate(String a) {
		System.out.print("duplicate = ");
		char [] ch = a.toCharArray();
		for(int i=0; i<ch.length-1; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j] && i!=j) {
					System.out.print(ch[i]+" ");
				}
			}
			
		}
		
	}
	//this method counts the number of vowels in a string
	public void numberOfVowels(String s) {
		int count = 0;
		char [] c = s.toCharArray();
		for(int j=0;j<c.length;j++) {
			if(c[j]=='a' || c[j]=='e'||c[j]=='o' ||c[j]=='u' || c[j]=='i') {
				count++;
			}
		}
		System.out.println("There are "+count+" vowels in "+s);
	}
	
	//this method reverses a given a string
	public void stringReverse(String s) {
		char []c = s.toCharArray();
		int n = c.length;
		System.out.print("Reversed string is ");
		for(int i=n-1; i>=0; i--) {
			System.out.print(c[i]);
		}
	}
	
	//this method is a palidrome
	
	public static boolean isPalidrome(String str) {
		char []c = str.toCharArray();
		int n = c.length;
		for(int i=0;i<n;i++) {
			if(c[i]!=c[(n-1)-i])
				return false;
		}
		return true;
	}
	//this method is factorial calculation
		public int factorial(int n) {
			
			if(n==0) return 1;
			else return n*factorial(n-1);
		}
	//this method proofs if a serries in Fibonacci or not
		
		public boolean fibonacci(int []a) {
			int n = a.length;
			for(int i=0; i<n-2;i++) {
				if(a[i+2]!=a[i+1]+a[i]) return false;
			}
			return true;
		}
		//the power method
		public int power(int number, int n) {
			int product = number;
			for(int i=1; i<n;i++) {
				product = product * number;
			}
			return product;
		}
		
	//this method calculates exponential of x
		public double exponential(int x) {
			int sum =0;
			for(int i=0;i<=2;i++) {
				sum = sum + power(x,i)/factorial(i); 
			}
			return sum;
		}
		
		//this method removes a specific element from an arry
		
		public void removeSpecific(int []arr, int n) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==n)
					continue;
				System.out.print(arr[i]+" ");
			}
			
		}
		
		//this method gives the common elements in three arrays
		public void threeCommon(int []a, int []b, int []c) {
			int [] intersect = new int[a.length];
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<b.length; j++) {
					for(int k=0; k<c.length; k++) {
						if(a[i]==b[j] && b[j]==c[k])
							intersect[i] = a[i];
					}
				}
			}
			for(int i=0; i<a.length; i++) {
				 if(intersect[i]!=0) 
				    System.out.print(intersect[i]+" ");
			}
		}
	
}