import java.util.Arrays;

public class classmates {
    public static void main(String[] args) {
        String[] names ={"Gulzar ADEM","Emel ADEM","Esra ADEM","Elif ADEM","Sabira ADEM","Havva ADEM","Nurdan ADEM","Nur ADEM","Mahmut ADEM","Malik ADEM"};

        String result = "";

        for (int i = 0; i < names.length; i++) {
            result += names[i].charAt(0)+" "+ names[i].substring( names[i].indexOf(" ")+1,names[i].indexOf(" ")+2) + "\n";


        }
        System.out.println(result);


    }

}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */