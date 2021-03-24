
public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    static int count;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
        final int countEyes = 2;
    }

    // Конструктор кошки
    public Cat(double weight){
        this.weight = weight;
    }

    // Погладить кошку
    public void meow() {
        weight = weight - 300;
        System.out.println("Meow");
    }

    public boolean isAlive (Cat cat) {
        return (cat.getWeight() < cat.getMinWeight() || cat.getWeight() > cat.getMaxWeight());
    }



    // Покормите кошку
    public void feed(double amount, Cat cat) {
        if (!isAlive(cat)) {
            weight = weight + amount;
        } else {
            System.out.println("Кошка мертва, она не может покушать");
        }

    }

    // Сходить в туалет
    public void pee(Cat cat) {
        if (!isAlive(cat)) {
            weight = weight - 300;
            System.out.println("pee");
        } else {
            System.out.println("Кошка мертва, она не может сходить в туалет");
        }

    }

    // Кол-во съеденного корма
    public double amountFood() {
        return  weight - originWeight;
    }

    // Напоить кошку
    public void drink(double amount, Cat cat) {
        if (!isAlive(cat)) {
            weight = weight + amount;
        } else {
            System.out.println("Кошка мертва, она не может попить");
        }

    }

    // Вернуть вес кошки
    public double getWeight() {
        return weight;
    }

    // Кол-во кошек

    static int getCount() {
        return count;
    }

    // Окрас кошек
    enum catColor {
        black,
        white,
        ginger,
        gray
    }

    // Получить статус кошки
    public String getStatus() {
        if (weight < minWeight) {
            Cat.count--;
            return "Dead";
        } else if (weight > maxWeight) {
            Cat.count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}