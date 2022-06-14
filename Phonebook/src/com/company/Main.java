package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        HashMap<String, String> phonebook = new HashMap<>();

        while (!input.equals("search")){
            String[] people = input.split("-");
            String name = people[0];
            String phone = people[1];
            phonebook.put(name, phone);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("stop")){
            if (phonebook.containsKey(input)){
                System.out.printf("%s -> %s%n",input, phonebook.get(input));
            }else{
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scan.nextLine();
        }
    }
}
