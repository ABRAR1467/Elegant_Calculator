package master;

public class master_class {
    int roll;
    string name;

    master_class(string a, int r) {
        this.roll = r;
        this.name = a;
    }
    public int getRoll()
    {
        return roll;
    }
    punlic void setRoll(int roll)
    {
        this.roll = roll;
    }
    public void setName(string name)
    {
        this.name = name;
    }
    public string getName()
    {
        return name;
    }

}
