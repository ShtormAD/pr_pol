public class Main {
    public static void main(String[] args) {
        Over over = new Over();
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();

        //Полиморфизм - перегрузка
        over.method("Привет");
        over.method(27);
        over.method("Привет ещё раз", 13);

        //Полиморфизм - переопределение
        over.method();
        one.method();
        two.method();
    }
}