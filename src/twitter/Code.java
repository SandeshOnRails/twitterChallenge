package twitter;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Code {

	public static void main(String[] args) {
		/*int num =0;
		int dum = 0;
		int newPrintNum;
		int newPageNum;
		int printerNum;
		int time =0;
		int x =0;
		int papers;
		int printers[] = new int[100000];
		int pages[] = new int [100000];
      while (true){
    	     Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number of printer : ");
       printerNum = sc.nextInt();
      if (printerNum >= 100000 || printerNum <= 0 ){
   	   System.out.println("The number of printers should be > 0 and < 100000");
continue;
      }
      else {
    	  break;
      }
      }
      while (true){
    	  Scanner bc = new Scanner(System.in);
      System.out.println("Enter the number of papers : ");
       papers = bc.nextInt();
       if (papers >= 100000 || papers <=0 ){
    	   System.out.println("The number of papers should be > 0 and < 100000");
    	   continue;
       }
       else {
    	   break;
       }
      }
     newPrintNum = printerNum;
     newPageNum = papers;
   while(newPrintNum > 0){
	   Scanner sc = new Scanner(System.in);
	  if (printerNum < 100000 && printerNum > 0){
	   System.out.println("Enter the difficulty level of the printer : ");
	   printers[num] = sc.nextInt();
	  }
	  else {
   	   System.out.println("The difficulty level of printer should be > 0 and < 100000");
   	   continue;

	  }
   num++;
   newPrintNum --;
   }
	while (newPageNum > 0){
		Scanner sc = new Scanner(System.in);
		
		if (papers < 100000 && papers > 0){
			System.out.println("Enter the difficulty level of the paper : ");
			   pages[dum] = sc.nextInt();
			  }
		else {
		   	   System.out.println("The difficulty level of paper should be > 0 and < 100000");
continue;
		}
	dum++;
	newPageNum --;
	}
	while (true){
for ( int i =0; i < printerNum; i ++){
	for ( int j = 0; j < papers; j ++){
		if ((printers[i] > pages[x]) && (x < papers)){
			System.out.println("The printer " + printers[i] + " is printing " + pages[x]);
			x++;
			break;
		}
	}

}
time++;
	if (x < papers){
		continue;
	}
	else {
		break;
	}
	}

      
System.out.println("The total time taken by " + printerNum + " printers " + " to print " + papers + " papers is " +
	time + " seconds");
*/
	/*	ArrayList<String>google = new ArrayList<>();
        ArrayList<String>obama = new ArrayList<>();
        ArrayList<String>kingJames = new ArrayList<>();
        ArrayList<String>billGates = new ArrayList<>();
        ArrayList<String>justinBieber = new ArrayList<>();
        String [] tweets = new String[5];
        tweets[0]="google";
        tweets[1]="BarackObama";
        tweets[2]="justinbieber";
        tweets[3]="BillGates";
        tweets[4]="KingJames";


        try(BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))){
            String line ="";
            while ((line = br.readLine())!= null){
            	for ( int i =0; i < 5; i ++){
               Pattern pattern = Pattern.compile(tweets[i]);
               Matcher matcher = pattern.matcher(line);
               if ( matcher.find()){
            	   if(matcher.group().equals("BarackObama"))
            	   obama.add(line.substring(matcher.end()+1));
            	   if(matcher.group().equals("google"))
            		   google.add(line.substring(matcher.end()+1));
            	   if(matcher.group().equals("justinbieber"))
            		   justinBieber.add(line.substring(matcher.end()+1));
            	   if(matcher.group().equals("BillGates"))
            		   billGates.add(line.substring(matcher.end()+1));
            	   if(matcher.group().equals("KingJames"))
            		   kingJames.add(line.substring(matcher.end()+1));
               }
            	}
               }
        }
        
    catch(Exception e){
        System.out.println(e.getMessage());
    }
        String a = "Help the President by picking up the phone: http://t.co/M3eHxlmi, http://t.co/kwS9igKq";
String b ="My Beliebers in Vienna! Love you! http://t.co/qa1YOxATOS";
   for ( String s: obama){
	   if (s.equals(a)){
		   System.out.println("Tweet belongs to barack obama");
	   }
   }
   for ( String s: justinBieber){
	   if (s.equals(b)){
		   System.out.println("Tweet belongs to justin");
	   }
   }
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
    
    
        for( String found: google){
            if(a.equals(found)){
                System.out.println("google");
            }
        }
           for( String found: obama){
            if(a.equals(found)){
                System.out.println("BarackObama");
            }
        }
         for( String found: kingJames){
            if(a.equals(found)){
                System.out.println("KingJames");
            }
        }
         for( String found: billGates){
            if(a.equals(found)){
                System.out.println("BillGates");
            }
        }
         for( String found: justinBieber){
            if(a.equals(found)){
                System.out.println("justinbieber");
            }
        }*/
		Code code = new Code(); 
		int a;
		System.out.println(a = firstOccurrence("Sandesh","es"));}
		static int firstOccurrence(String s, String x) {
			   int len = x.length();
			   System.out.println(len);
			        String check ="";
			        for ( int i =0; i < s.length(); i ++){
			            if(len < s.length()){
			            System.out.println( s.substring(i,len));
			           if(check.equals(x)){
			                return i;
			           }
			              }
			           len++;
			        }
			   return -1;
			    }
        
}
