public class HelloApp {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder sb = new StringBuilder();
            for (String name : args) {
                if (sb.length() > 0) sb.append(", ");
                sb.append(name);
            }
            System.out.println("Hello, " + sb.toString() + "!");
        }
    }
}
