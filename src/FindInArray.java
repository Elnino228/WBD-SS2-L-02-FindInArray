import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {
        String[] students={"Christian","Michael","Camila","Zachariah", "Mallory", "Zoe", "Emily"};
        String inputName;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name: ");
        inputName=scanner.nextLine();
        boolean isExist=false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(inputName)){
                System.out.println("Position of the student is "+i);
                isExist=true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found "+inputName);

    }

}
