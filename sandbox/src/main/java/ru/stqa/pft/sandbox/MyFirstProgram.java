package ru.stqa.pft.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Kate");

        Square s = new Square(5);

        System.out.println("Площадь квадрата " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 5);

        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

 @Test
        void selenideSearchTest() {
            // Открыть yandex
            open("https://yandex.ru");

            // Ввести Selenide в поиска
            $(byName("text")).setValue("Selenide").pressEnter();

            // Проверить, что Selenide появился в результатах поиска
            $("html").shouldHave(Condition.text("selenide.org"));


        }


}
