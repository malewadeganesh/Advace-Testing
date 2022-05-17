package Testpackage1;

public class Testclass1
{
	public static void main(String[] args) 
	{
	int a[]= {10,50,40,85,96};
	int n = a.length;
	int b[]= new int [n];
	int i,j;
	// store array a into b in reverse way
	for(i=(n-1),j=0;i>=0;i--,j++)
	{b[j]=a[i];}
	
    // print array b
	System.out.println("Print array a: ");
	for (i=0;i<n;i++)
	{System.out.print(a[i] +" ");}
	System.out.println();
	System.out.println("Print array b: ");
	for (j=0;j<n;j++)
	{System.out.print(b[j] +" ");}
}
}


	
	

