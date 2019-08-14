public class Base {
    private String s;
    private int n;

    public Base() {
        this("");
    }

    public Base(String s) {
        this.s = s;
        this.n = 0;
    }

    public Base(String s, int n) {
        this.s = s;
        this.n = n;
    }

    public String getMessage() {
        return s;
    }
}
