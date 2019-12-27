package task_1_7;

public class PetShop {
    //1.Необходимо создать класс — зоомагазин. В классе должны быть следующие поля:
    // животное ( напр. волк, пингвин, собака ), пол , цена штуку, количество.
    // Создать конструктор для данного класса и метод подсчета стоимости животного
    // в зависимости от количества и пола.

    enum Animal {WOLF, DOG, PENGUIN}
    enum Gender {MALE, FEMALE}

    Animal animal;
    Gender gender;
    double price;
    int quantity;

    public PetShop (int q , Gender g, double p, Animal a)
    {
        animal = a;
        gender = g;
        price = p;
        quantity =q;

    }
    public double sumPrice(int q)
    {

       switch (this.gender) {
           case MALE: return this.price * q;

           case FEMALE: return (this.price * 2) * q;
           default: return -1; //throw new IllegalStateException("не известный тип");

       }

    }

}
