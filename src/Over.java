public class Over {
    // Метод
    public void method(String s){
        System.out.println("Ввели текст: " + s);
    }
    // Перегруженный метод
    public void method(int i){
        System.out.println("Ввели число: " + i);
    }
    // Ещё один перегруженный метод
    public void method(String s, int i){
        System.out.println("Ввели текст: " + s + " и чис-ло: " + i);
    }

    // Полностью переопределим метод
    public void method(){
        System.out.println("Это метод базового класса");
    }
}