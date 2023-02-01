package Author;

public class Authors {
    private String name;
    private String surname;
    public Authors(String name, String surname)
    {
        this.name= name;
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }
    @Override
    public String toString() {
        String info = "";
        info += "\t Имя: " + name;
        info += "\n \t Фамилия: " + surname;
        return info;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Authors) {
            Authors authorObj = (Authors) obj;
            return name.equals(authorObj.getName()) && surname.equals(authorObj.getSurname());
        }
        return false;
    }

}
