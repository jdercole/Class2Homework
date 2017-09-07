
package class2homework;


public class StartUp {

    
    public static void main(String[] args) {
        Person person1 = new Person("John", "McLemore", 67);
        Person person2 = new Person("Sarah", "Schmidt", 32);
        
        person2.setAge(35);
        System.out.println(person2.getFirstName() + " " + person2.getLastName() +
                 " is " + person2.getAge()+ " years old.");
    }
    
}
