package io.turtabl;

public class Main {

    //todo: work on the main method
    public static void main(String[] args)
    {
         System.out.println("Hello, turntabl!");
          if(args.length == 0){
              System.out.print("please pass an argument");
          }
          else{
              printArgs(args);
          }
    }

    public static void printArgs(String[] args){
        for(String arg: args){
            printArg(arg);
        }
    }
    public static void printArg(String arg){
        System.out.println(arg);
    }



}



