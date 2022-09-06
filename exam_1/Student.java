public class Student{

   String firstname;
   String surname;
   String middleInitial;
   String dateOfBirth;
   int studentNumber;
   String studentEmailAddress;
   boolean iAmAwesome;

   public void sayMyName() {
    System.out.println(" Hello!! My name is " + firstname + " " + middleInitial+ " " + surname );
   }

   public void saydateOfBirth() {
    System.out.println(" My Birthday is " + dateOfBirth);
   }

   public void saystudentNumber() {
    System.out.println(" My Student number is " + studentNumber);
   }

   public void saystudentEmailAddress() {
    System.out.println(" You can contact me at my email - " + studentEmailAddress);
   }

   public void sayiAmAwesome() {
    System.out.println(" I am Awesome! " + iAmAwesome);
   }
}
