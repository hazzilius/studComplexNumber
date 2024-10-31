public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(5,6);
        System.out.println("Сложение: " + c1.str() + " + " + c2.str() + " = " + c1.add(c2).str());
        System.out.println("Вычитание: " + c1.str() + " - " + c2.str() + " = " + c1.sub(c2).str());
        System.out.println("Деление: " + c1.str() + " / " + c2.str() + " = " + c1.div(c2).str());
        System.out.println("Умножение: " + c1.str() + " * " + c2.str() + " = " + c1.mul(c2).str());
        System.out.println("Модуль |" + c1.str() + "| = " + c1.abs());
        Complex c3 = new Complex(3,4);
        System.out.println("Равность " + c1.str() + " и " + c2.str() + " = " + c1.equals(c2));
        System.out.println("Равность " + c1.str() + " и " + c3.str() + " = " + c1.equals(c3));
    }
}