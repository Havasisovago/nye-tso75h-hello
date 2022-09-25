package hu.nye.progtech.hello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        String lang;
        System.out.print("Add meg a kereszt neved:");
        name = input.nextLine();
        System.out.print("Add meg a nyelved:");
        lang = input.nextLine();


        switch(lang) {
            case "hun":
                System.out.println(" Szia" + name + "!" );
                break;
            case "eng":
                System.out.println(" Hello" + name + "!" );
            case "haw":
                System.out.println(" Aloha" + name + "!" );
                break;
            default:
                System.out.println(" Szia" + name + "!" );
        }
    }
}
