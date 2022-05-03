package com.company;
import java.util.Scanner;
class List {
    String []name;
    String []description;
    String []time;
    String []date;
    String []location;
    List(){
        name=new String[10];
        description=new String[10];
        time=new String[10];
        date=new String[10];
        location=new String[10];
    }
    int count=0;
    public void displayTask(){
        if(count==0){
            System.out.println("LIst is empty ");
        }
       for(int i=0;i<count;i++){
           if(name[i]!=null &&  date[i]!=null && time[i]!=null && description[i]!=null && location[i]!=null){
           System.out.println("* task is "+name[i]);
           System.out.println("      Date when "+name[i] +" started is "+date[i]);
           System.out.println("      Time when "+name[i] +" started is "+time[i]);
           System.out.println("      Location where "+name[i] +" is performed is "+location[i]);
           System.out.println("      Description about "+name[i] +" is  "+description[i]);
           System.out.println("\n");}
       }
    }
    public void addTask(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of a task");
        String n=s.next();
        this.name[count]=n;
        System.out.println("Enter date for "+n+" when started");
        String d=s.next();
        this.date[count]=d;
        System.out.println("Enter time for "+n+" when started");
        String t=s.next();
        this.time[count]=t;
        System.out.println("Enter location where "+n+" is performed");
        String l=s.next();
        this.location[count]=l;
        System.out.println("Enter description about "+n);
        String de=s.next();
        this.description[count]=de;
        count++;
    }
    public void searchTask(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name of task you want to check details ");
        String s=in.next();
        for(int i=0;i<count;i++){
            if(name[i]!=null && date[i]!=null && time[i]!=null && location[i]!=null && description[i]!=null) {
                if (name[i].compareTo(s) == 0) {
                    System.out.println("* task is " + name[i]);
                    System.out.println("      Date when task started is " + date[i]);
                    System.out.println("      Time when task started is " + time[i]);
                    System.out.println("      Location where task is performed is " + location[i]);
                    System.out.println("      Description about task is  " + description[i]);
                    System.out.println("\n");
                }
            }
        }
    }
    public void removeTask(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of task you want to remove details ");
        String r=s.next();
        for(int i=0;i<count;i++){
            if(name[i].compareTo(r)==0){
                name[i]=null;
                date[i]=null;
                time[i]=null;
                description[i]=null;
                location[i]=null;
            }
        }

    }
    public void updateTask(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of task you want to change contents of ");
        String a=sc.next();
        for(int i=0;i<count;i++){
            if(name[i]!=null && date[i]!=null && time[i]!=null && location[i]!=null && description[i]!=null){
            if(name[i].compareTo(a)==0){

                System.out.println("Enter date for "+a+" when started");
                String d=sc.next();
                this.date[i]=d;
                System.out.println("Enter time for "+a+" when started");
                String t=sc.next();
                this.time[i]=t;
                System.out.println("Enter location where "+a+" is performed");
                String l=sc.next();
                this.location[i]=l;
                System.out.println("Enter description about "+a);
                String de=sc.next();
                this.description[i]=de;}
            }
        }
    }

}
public class Todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List student1 = new List();
        System.out.println("***********************************Rayyan's todo List********************************");
        while (true) {
            System.out.println("                 Press 1 to watch todo list");
            System.out.println("                 Press 2 to add a task");
            System.out.println("                 Press 3 to search todo list");
            System.out.println("                 Press 4 to remove todo list");
            System.out.println("                 Press 5 to update contents within a task");
            System.out.println("                 Press 6 to exit from the menu");
            int op = sc.nextInt();
            if (op == 1)
                student1.displayTask();
            else if (op == 2)
                student1.addTask();
            else if(op==3)
                student1.searchTask();
            else if(op==4)
                student1.removeTask();
            else if(op==5)
                student1.updateTask();
            else if(op==6)
                break;
        }
    }
}
