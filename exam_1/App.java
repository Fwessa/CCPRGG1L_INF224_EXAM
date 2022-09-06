public class App {
    public static void main(String[] args) {
        
        Student Me = new Student();
        Me.firstname = "Luisa";
        Me.surname = "Dala";
        Me.middleInitial = "T.";
        Me.dateOfBirth = "12/06/03";
        Me.studentNumber = 2022104745;
        Me.studentEmailAddress = "dalalt@students.national-u.edu.ph";
        Me.iAmAwesome = true;  
        Me.sayMyName();
        Me.saydateOfBirth();
        Me.saystudentNumber();
        Me.saystudentEmailAddress();
        Me.sayiAmAwesome();
    }
}
