public class Slogan {
    private String Value;

    public Slogan(String update){
        Value = update;
    }

    public Slogan(){
        this.Value = "Default, not found.";
    }

    public String toString() {
        return Value;
    }
}
