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

void merge(LinkList list1 ,LinkList list2)
{
Link temp1=list1.start;
Link temp2=list2.start;
Link start=null;
Link temp=null;
//System.out.println("firts"+list1.start.data);
//System.out.println("seconf"+list2.start.data);
while(temp1!=null || temp2!=null)
{
if (temp1==null)
{
while(temp2!=null)
{
//System.out.println("t2"+temp2.data);

Link link = new Link(temp2.data);
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
temp2=temp2.next;
}
}

else if(temp2==null)
{
while(temp1!=null)
{
//System.out.println("t1"+temp1.data);

Link link = new Link(temp1.data);
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
temp1=temp1.next;
}
} 
else
{
if(temp1.data<temp2.data)
{
//System.out.println("firts"+temp1.data);
Link link = new Link(temp1.data);
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
temp1=temp1.next;
}

else 
{
//System.out.println("second"+temp2.data);
Link link = new Link(temp2.data);
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
temp2=temp2.next;
}
}
}
Link tt = start;
System.out.println("");
System.out.println("");
System.out.println("combined linked list");
while(tt!=null)
{
System.out.print("{"+tt.data+"}, ");
tt=tt.next;
}
}

}

class Ques8
{
public static void main(String s[])
{
LinkList list = new LinkList();
LinkList list2 = new LinkList();
list.insert();
System.out.println("for second linkedlist");
list2.insert();
System.out.println("first list");
list.print();
System.out.println("");
System.out.println("second list");
list2.print();
LinkList list3 = new LinkList();
list3.merge(list,list2);
list3.print();
}
}
