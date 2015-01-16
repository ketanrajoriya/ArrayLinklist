import java.util.*;
class Ques2
{
public static void main(String s[])
{
System.out.println("enter the size of first array");
Scanner scr = new Scanner(System.in);
int len1=scr.nextInt();
int arr1[]=new int[len1];
System.out.println("enter the "+len1+" elements");

for(int i=0;i<len1;i++)
{
arr1[i]=scr.nextInt();
}
System.out.println("enter the size of Second array");
int len2=scr.nextInt();
int arr2[]=new int[len2];
for(int i=0;i<len1;i++)
{
System.out.print(arr1[i]+" , ");
}
System.out.print("\n");
System.out.println("enter the "+len2+" elements");

for(int i=0;i<len2;i++)
{
arr2[i]=scr.nextInt();
}
for(int i=0;i<len2;i++)
{
System.out.print(arr2[i]+" , ");
}
System.out.print("\n");

System.out.print("enter the number");
int num = scr.nextInt();

System.out.print("number closet to the number");
int arr3[]= new int[4];
int min=0,max=10000;
int sum;
for(int i=0;i<len1;i++)
{
for(int j=0;j<len2;j++)
{
sum =arr1[i]+arr2[j];
if(sum<num && sum > min )
{ 
min = sum;
arr3[0]=i;
arr3[1]=j;
}

else if (sum > num && sum < max)
{
max=sum;
arr3[2]=i;
arr3[3]=j;
}
}
}
if(max-num<num-min)
{
System.out.println("your numbers are");
System.out.println("first "+arr1[arr3[2]]+"   second number  " + arr2[arr3[3]]);
}
else
{
System.out.println("your numbers are");
System.out.println("first "+arr1[arr3[0]]+" ,  second number  " + arr2[arr3[1]] );

}

}
}