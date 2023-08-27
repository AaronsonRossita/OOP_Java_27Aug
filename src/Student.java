import java.time.LocalDate;

public class Student {

    //   Create     Read    Update   Delete
    //Constructor    Get     Set       -
    private int id;
    private String name;
    private LocalDate startDate;

    public Student(int id, String name, LocalDate startDate) {
        this.id = id;
        if (name == null){
            this.name = "John Doe";
        }else{
            this.name = name;
        }
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            this.name = "John Doe";
        }else{
            this.name = name;
        }
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
