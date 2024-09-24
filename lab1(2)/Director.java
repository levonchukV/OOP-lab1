public class Director {
    private String name;
    private String surname;
    private Date birthdate;

    public Director(){}

    public Director(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public void printInfo(){
        System.out.printf("Name - %s, surname - %s%n", name, surname);
        System.out.println("Director birthday: ");
        birthdate.printInfo();
    }

    public Date getBirthday() {
        return birthdate;
    }

    public void setBirthday(Date birthday) {
        this.birthdate = birthdate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
