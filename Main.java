public class Main {
    public static void main(String[] args) {
        Integer aObject = Integer.valueOf(134);
        Double bObject = Double.valueOf(342.35);

        int a = aObject.intValue();
        double b = bObject.doubleValue();

        System.out.println("the value of a is :" + a);
        System.out.println("the value of b is :" + b);
    }
}
