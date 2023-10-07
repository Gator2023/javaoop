public class JavaReverse {

    public static void main(String[] args) {

        JavaReverse obj = new JavaReverse();
        obj.paraint(5000, 4000);
        JavaReverse.para("Saima", " A");
    }

    private static void para(String firstname, String lastname) {

        String fullname = firstname + lastname;
        System.out.println(fullname);
    }

    public void paraint(int a,int b) {
        int c = a + b;
        System.out.println(c);
    }
}
