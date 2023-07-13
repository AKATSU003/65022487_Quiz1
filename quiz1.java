import java.util.Scanner;

class Person{
    private int ID;
    private String Name;
    private int AddmissionYear;
    private float GPA;

    Person(int ID,String Name,int AddmissionYear,float GPA){
        this.ID = ID;
        this.Name = name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public int getAddmission(){
        return Addmission;
    }

    public void setAddmission(int Addmission){
        this.Addmission = Addmission;
    }

    public int getGPA(){
        return GPA;
    }

    public void setGPA(int GPA){
        this.GPA = GPA;
    }

    public void ShowDetails(){
        System.out.println("ID : "+this.ID);
        System.out.println("Name : "+this.Name);
        System.out.println("AddMission : "+this.AddmissionYear);
        System.out.println("GPA : "+this.GPA);
    }
}

public class Student extends Person{
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.ID = 65022487;
        p1.Name = "March";
        p1.AddMission = 2566;
        p1.GPA = 3.76;
        
        p1.ShowDetails();

    }
}