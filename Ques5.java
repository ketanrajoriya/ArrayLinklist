import java.util.*;
class Link
{
public int data;
public Link nextLink;

public Link(int a){
data = a;
}

public void printLink(){
System.out.print("{" + data + "}");
}
}

class LinkList
{

private Link first;

public LinkList()
{
first = null;
}

public boolean isEmpty()
{
    return first == null;

}


public void delete()
{
int pos;
Scanner scr6= new Scanner(System.in);

System.out.println("enter the pos for insertion");
pos=scr6.nextInt();
Link temp;
temp=first;
while(pos!=2)
{
temp=temp.nextLink;
pos--;}
temp.nextLink=(temp.nextLink).nextLink;

}

public void insert()
{
int data;
int pos=0;
Link temp;
char answer;
Scanner scr2= new Scanner(System.in);

do{
System.out.println("enter the data part of link");
data = scr2.nextInt();
temp = first;
Link link = new Link(data);

if(first==null)
{
link.nextLink=null;
first=link;
temp=first;
}
else
{
while(temp.nextLink!=null)
{
temp=temp.nextLink;
}
temp.nextLink=link;
}

System.out.println("do you want to continue select 'y' or 'n'");
Scanner scr3= new Scanner(System.in);
answer = scr3.next().charAt(0);

}
while(answer=='y');
}

public void printList() 
{
	    Link currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printLink();
		    currentLink = currentLink.nextLink;
	    }
		

	
}
public void rev()
       {
int count=0;
		  	   Link tempq=null;
	   int i =0,j=0,k; 
	   int arr[] = new int[10];
	   int temp =0;
	    Link currentLink = first;
        while(currentLink != null) {
		//    currentLink.printLink();
		   temp++;

		  if(temp%2==0)
{
arr[i]=currentLink.data;
//System.out.print("     hello   "+currentLink.data);
//System.out.print("     arr   "+arr[i]);
count++;	
i++;
}	    currentLink = currentLink.nextLink;
 }
 
 int arr2[] = new int[count];
 //System.out.print("     hello   "+arr2.length);
	i=0;
 for(j=count-1;j>=0;j--)
 {
 arr2[i]=arr[j];
 i++;
 }
 for(j=0;j<arr2.length;j++)
 {
    //System.out.print("     hellob  "+arr2[j]);
	}
	currentLink=first;
	j=0;
	    while(currentLink != null) {
		   if(((currentLink.nextLink).data==arr[j]) && (arr[j]>0))
		   {
		//System.out.print("     aaaa  "+currentLink.data);
   currentLink.nextLink=(currentLink.nextLink).nextLink;
		   j++;
		   }
		    tempq=currentLink;
 
		  currentLink = currentLink.nextLink;
 }
for( j=0;j<arr2.length;j++)
{
 Link link = new Link(arr2[j]);
tempq.nextLink=link;
tempq=link;}
}
}


class Ques5
{
public static void main(String s[])
{
LinkList link1 = new LinkList();
link1.insert();
link1.printList();
link1.rev();
System.out.println("");
link1.printList();
}
}