public class ClassTwo extends Over{
    // Переопределим метод, дополнив его
    @Override
    public void method(){
        super.method(); // Вызов метода супер-класса
        System.out.println("Ошибка! Это метод класса ClassTwo");
    }
}