package test;
import java.io.*;


// Write a method which takes 3 parameters
// Param 1 : String S1
// Param 2 : String S2
// Param 3 : String S3
// Replace all S2 in S1 with S3

// E.g. S1: MyNameIsApple.IamRed
// S2: am
// S3: AM123
// output: MyNAM123eIsApple.IAM123Red



class MyCode {
  public static void main (String[] args) {
    System.out.println("Hello Java");
    System.out.println("My String"+myString("MyNameIsApple.IamRed","am","AM123"));
  }
  
  
  public static String myString(String s1, String s2, String s3){      
      String s =new String();
      for(int i=0; i<s1.length(); i++){
        for(int j=0;j<s2.length(); j++){
          char c1=s2.charAt(i);
          
        }
        
      }
    return s;
  }
}
