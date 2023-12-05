public class classMatesReverse {
    public static void main(String[] args) {
        String[] names ={"Gulzar ADEM","Emel ADEM","Esra ADEM","Elif ADEM","Sabira ADEM","Havva ADEM","Nurdan ADEM","Nur ADEM","Mahmut ADEM","Malik ADEM"};
        String result = "";

        for (int i = 0; i < names.length; i++) {

            for (int j = names[i].length() - 1; j >= 0; j--) {
                result+=names[i].charAt(j);

            }

           result+="\n";
        }
        System.out.println(result);
    }

}
/*
 create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */