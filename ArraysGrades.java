public class ArraysGrades {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];



        for (int i = 0; i < names.length; i++) {
            String result = "";

            if (scores[i] >= 90 && scores[i] <= 100) {
                grades[i] = 'A';

            } else if (scores[i] >= 80) {
                grades[i] = 'B';

            } else if (scores[i] >= 75) {
                grades[i] = 'C';

            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else if (scores[i] >= 50) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }

            result+= names[i] + "'s score is " + scores[i] + ", and grades is " + grades[i] + "\n";
            System.out.println(result);
        }



    }

}


/*
 given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */