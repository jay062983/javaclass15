package Stringmethods;

public class practice02 {
    // create a method that takes a string reverse it and return the reversed string
    //call the method reverse

    String namereverse(String input){
        String namereverse="";
        for (int i = input.length()-1; i >=0 ; i--) {
namereverse+=input.charAt(i);
        }
        return namereverse;



}}
