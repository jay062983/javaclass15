package Stringmethods;

public class MPractice04 {

    //create a method that takes two numbers as parameters and return the large number

    int two( int a,int b){
        if(a>b) {
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {

        MPractice04 large=new MPractice04();
        System.out.println(large.two(6,7));
}}
