package Book;

import Author.Authors;

public class Books {
   private String name;
   private Authors author;
   private int year;

    public Books(String name, Authors author, int year)
    {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName()
    {
        return name;
    }
    public Authors getAuthor()
    {
        return author;
    }
    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }


    @Override
    public String toString() {
        String info = "";
        info += "\n Название: " + name;
        info += "\n Автор: \n " + author;
        info += "\n Год написания: " + year;
        return info;
    }
    @Override
    public int hashCode() {
        return name.hashCode() + author.hashCode() + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Books) {
            Books bookObj = (Books) obj;
            return name.equals(bookObj.getName()) && author.equals(bookObj.getAuthor()) && year == bookObj.getYear();
        }
        return false;
    }
}
