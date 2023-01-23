public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Joanna Panek";
        student1.index = 26846;
        System.out.println(student1.name + " s" + student1.index);

        Student student2 = new Student();
        student2.name = "Maria Nowak";
        student2.index = 54879;
        System.out.println(student2.name + " s" + student1.index);

        SecretStudent student3 = new SecretStudent();
        System.out.println(student3.getName() + " " + student3.getSurname() + " " + student3.getIndex());

        SecretStudent student4 = new SecretStudent();
        student4.setName("Jan");
        student4.setSurname("Kowalski");
        student4.setIndex(26549);
        System.out.println(student4.getName() + " " + student4.getSurname() + " s" + student4.getIndex());

        SecretStudent st = new SecretStudent();
        st.readFromScanner();
        st.printSt();


    }
}
