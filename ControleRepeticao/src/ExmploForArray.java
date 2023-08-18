public class ExmploForArray {
    public static void main(String[] args) {
        
        String students []= {"João", "Pedro", "Maria", "José"};
        //Using structure For default.
        for( int x=0; x < students.length; x++){
            System.out.println("The Students name is: " + students[x] + " and it is position: " + x);
        }

        //Using For Each, the best form, it is cleaner.
        for (String student : students){
            System.out.println("The Students name is: " + student);
        }

        //Using For with Continue (it does not print the value 3).
        for (int num = 0; num <= 5; num++){
            if (num == 3){
                continue;
            }
            System.out.println("Continue: " + num);
        }
        //Using For with Break (it will stop when the value is 3).
        for (int num = 0; num <= 5; num++){
            if (num == 3){
                break;
            }
            System.out.println("Break: " + num);
        }

    }
}
