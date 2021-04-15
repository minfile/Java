package Case1;

public class Student {

    private int id;
    private String name;
    private int age;
    private String address;

    Student(){

    }

    Student(int id,String name,int age,String address){
        this.id = id ;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getId(){
        return id;
    }
}
