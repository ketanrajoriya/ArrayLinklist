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

void rotate()
{
int m,n;
Link temp,temp1;
System.out.println("");
System.out.println("enter number of times u want to rotate");
m = scr.nextInt();

while((m)>0)
{
temp1=start;
temp=start;
while((temp.next).next!=null)
{
temp=temp.next;
}
Link link = new Link((temp.next).data);
link.next=start;
temp.next=(temp.next).next;
start=link;
m--;
}

}


}

class Ques7
{
public static void main(String s[])
{
LinkList list = new LinkList();
list.insert();list.print();
list.rotate();
System.out.println("new list");
list.print();
}
}
