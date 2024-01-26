// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b);//Ошибка при делении на ноль.
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }

}