package branch;

public class sample_Branch_b1 {
    String name,id;
    float cgpa;

    public int getNumber_of_branches() {
        return number_of_branches;
    }

    public void setNumber_of_branches(int number_of_branches) {
        this.number_of_branches = number_of_branches;
    }

    int number_of_branches;

    public sample_Branch_b1(String name, String id, float cgpa, int number_of_branches) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.number_of_branches = number_of_branches;
    }


    sample_Branch_b1(String s, String s1, float f)
    {
        this.name = s;
        this.id = s1;
        this.cgpa = f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
