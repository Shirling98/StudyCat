public class Loader {

    public static Cat getKitten(){
        return new Cat(1100);
    }

    public static void main(String[] args) {

        Cat Mika = new Cat();
        Cat Buba = new Cat();
        Cat Musya = new Cat();

        Cat Stepa = getKitten();
        System.out.println("Weight kitten Stepa is " + Stepa.getWeight());

     //   System.out.println("Color is Buba " + Cat.catColor.ginger);

       /* System.out.println(Cat.getCount());

        while (Buba.getWeight() >= 1000) {
            Buba.meow();
        }
        System.out.println(Buba.getStatus());

        Buba.pee();
        Buba.feed(10.0);
        Mika.feed(10.0);
        System.out.println("Вес Мики " + Mika.getWeight());
        System.out.println(Cat.getCount());*/


/*
// first task
        System.out.println("Weight is Mika " + Mika.getWeight());
        System.out.println("Weight is Buba " + Buba.getWeight());
        System.out.println("Weight is Musya " + Musya.getWeight());

        Buba.feed(2.1);
        Musya.feed(1.8);
        Mika.feed(3.4);

        System.out.println("Weight is Mika after feed " + Mika.getWeight());
        System.out.println("Weight is Musya after feed " + Musya.getWeight());
*/
/*//second task
        double feedCat = Math.random();
        System.out.println(Mika.isAlive(Mika));
        while (Mika.getWeight() <= Mika.getMaxWeight()) {
            Mika.feed(feedCat,Mika);
        }
        System.out.println(Mika.getStatus());
        System.out.println(Mika.isAlive(Mika));

        while (Buba.getWeight() >= Buba.getMinWeight()) {
            Buba.meow();
        }
        System.out.println(Buba.getStatus());*/
/*//third task

        Buba.feed(100);
        Buba.feed(150);
        System.out.println(Buba.amountFood());

        Musya.pee();
    }
    }*/
    }
}
