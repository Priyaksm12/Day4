public class inherit {
    public void language() {
        System.out.println("JAVA");
    }
}
class lang extends inherit {
    public void language() {
        super.language();
        System.out.println("JAVA is a programming language");
    }
    public void oop() {
        System.out.println("Java is a object oriented programming language");
    }
}

class Main {
    public static void main(String[] args) {

        lang l = new lang();
        l.language();
        l.oop();
    }
}
