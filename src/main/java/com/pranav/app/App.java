package com.pranav.app;

import java.util.Scanner;

public class App 
{
   public static int add(int n1, int n2){
      return n1+n2;
   }
   public static int sub(int n1, int n2){
      return n1-n2;
   }
   public static int mul(int n1, int n2){
      return n1*n2;
   }
   public static int div(int n1, int n2){
      return (int) Math.round(n1/n2);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter two numbers:");

      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int res = 0;

      int op = (int) Math.floor(Math.random()*4);

      switch (op) {
         case 0:
            res = add(n1, n2);
            break;

         case 1:
            res = sub(n1, n2);
            break;

         case 3:
            res = mul(n1, n2);
            break;

         case 4:
            res = div(n1, n2);
            break;
      }

      System.out.print("The result after a random operation: ");
      System.out.print(res);
   }
}