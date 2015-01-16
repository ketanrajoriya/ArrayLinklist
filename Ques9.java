import java.util.*;
class Link
{
public Link next=null;
public int data;

public Link(int a)
{
data= a;
}  
}

class LinkList
{
public int data;
private Link start;
Scanner scr = new Scanner(System.in);

LinkList()
{
start=null;
}
void insert()
{
char choice; 
Link temp=null;

do
{
System.out.println("enter the data part");
data = scr.nextInt();
Link link = new Link(data);
if(start==null)
{
start= link;
link= start;
}
else
{
temp=start; 
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=link;
}
System.out.println("do you want to continue ");
choice = scr.next().charAt(0);
}while(choice=='y');

}

void print()
{ 
Link temp= start; 
while(temp!=null)
{
System.out.print(" {"+temp.data+"}, ");
temp=temp.next;
}
}

void remove()
{
int m,n;
Link temp,temp1;
System.out.println("");

temp=start;
while(temp.next!=null)
{
temp1=temp.next;
while(temp1!=null)
{

if((temp1).data==temp.data &&temp1!=null)
{
temp.next=(temp.next).next;
}
temp1=temp1.next;
}
temp=temp.next;
}
}

}




class Ques9
{
public static void main(String s[])
{
LinkList list = new LinkList();
list.insert();list.print();
list.remove();
System.out.println("updated list after removing duplicacy");
list.print();
}
}
