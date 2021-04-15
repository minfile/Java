package Case1;

import java.util.Scanner;
import java.util.ArrayList;
public class Interface {
    boolean run = true;
    ArrayList<Student> array = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    public Interface(){

    }
    public void showInterface(){
        while (run) {
            System.out.println("-----welcome to student manager-----");
            System.out.println("1. Add student");
            System.out.println("2. del student");
            System.out.println("3. modify student");
            System.out.println("4. view Student");
            System.out.println("5. exit system");
            System.out.println("plz enter your choice");
            userInput();
        }
    }
    public void userInput(){

        int input = sc.nextInt();
        switch (input){
            case 1:
                addStudent(array);
                break;
            case 2:
                delStudent(array);
                break;
            case 3:
                modifyInfo(array);
                break;
            case 4:
                checkStudent(array);
                break;
            case 5:
                run = false;
                break;
        }
    }
    public void addStudent(ArrayList<Student> array){
        System.out.println("Plz enter student id");
        int id = sc.nextInt();
        if(identify(array,id)) {
            sc.nextLine();
            System.out.println("Plz enter student name");
            String n = sc.nextLine();

            System.out.println("Plz enter student age");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Plz enter student address");

            String address = sc.nextLine();

            Student s = new Student(id, n, age, address);
            array.add(s);

            System.out.println("Successfully add ");
        }else{
            System.out.println("cannot add ");
        }
    }

    public void checkStudent(ArrayList<Student> array){
        if(array.size() == 0){
            System.out.println("No any record");
        }else {
            System.out.println("id\t" + "name\t" + "age\t" + "address");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
            }
        }
    }
    public void delStudent(ArrayList<Student> array){
        System.out.println("Plz enter what sid you want to delete");
        int sid = sc.nextInt();
        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if(sid == s.getId()){
                array.remove(i);
                System.out.println("delete successfully");
            }else{
                System.out.println("no this id");
            }
        }
    }

    public void modifyInfo(ArrayList<Student> array){
        System.out.println("Plz enter the student id to modify");
        int sid = sc.nextInt();
        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if(sid == s.getId()){
                System.out.println("Plz enter new name");
                String name = sc.nextLine();
                s.setName(name);
                System.out.println("Plz enter new age ");
                int age = sc.nextInt();
                s.setAge(age);
                System.out.println("Plz enter new address");
                String address = sc.nextLine();
                s.setAddress(address);
                System.out.println("modify success");
            }else{
                System.out.println("No this id");
            }
        }
    }
    public boolean identify(ArrayList<Student> array, int sid) {
        boolean get = true;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (sid == s.getId()) {
                get =  false;
                break;
            } else {
                get = true;
            }
        }
        return get;
    }
}
