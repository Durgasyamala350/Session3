import java.util.*;
public class MinAndMax{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] arr= new int[5];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<arr.length; i++)  
{  
//reading array elements from the user   
arr[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<arr.length; i++)   
{  
System.out.println(arr[i]);  
}
int max=arr[0],min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}

}
System.out.println("max value in the array is"+max);
for(int i=0;i<arr.length;i++){
if(arr[i]<min)
{
min=arr[i];
}
}

System.out.println("min value in the array is:"+min);
}
}
