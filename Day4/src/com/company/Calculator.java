package com.company;

public class Calculator {

    //psvm
    public static void main(String[] args) {
        //need code calculator with math operator using if-else-if statements
        // /+*-%
        /**
         * char operators = ' -';
         * else if ( operator == '- '){
         * result = nr1-nr2;
         * System.out.println(result);
        */

        char opt = '-';
        double nr1 = 20;
        double nr2 = 5;
        double result;

        if (opt == '-'){
            result=nr1-nr2;
            System.out.println(result);
        }else if (opt =='+'){
            result=nr1+nr2;
            System.out.println(result);
        }else if (opt =='*'){
            result=nr1*nr2;
            System.out.println(result);
        }else if (opt=='/'){
            result=nr1/nr2;
            System.out.println(result);
        }else{
            System.out.println("Wrong manipulation!");
        }



    }
}
