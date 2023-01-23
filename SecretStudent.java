import java.util.Scanner;

public class SecretStudent {

    private String name = "default name";
    private String surname = "default surname";
    private int index = 0;

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getIndex(){
        return index;
    }

    public void setName(String newName){
        if(newName == null || newName.isBlank()){
            throw new IllegalStateException("Imie nie moze byc puste");
        }
        name = newName;
    }

    public void setSurname(String newSurname){
        surname = newSurname;
    }

    public void setIndex(int newIndex){
        index = newIndex;
    }

    public void readFromScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        setName(scanner.nextLine());
        System.out.println("podaj nazwisko");
        setSurname(scanner.nextLine());
        System.out.println("podaj index");
        setIndex(scanner.nextInt());



    }
    public void printSt(){
        System.out.println(getName() + " " + getSurname()+" "+getIndex() );

    }
}
