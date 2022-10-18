public class Main {
    public static void main(String[] args) {
        //задание 1 и задание 2
        Human max = new Human(35, "Максим", "Минск", "Бренд-менеджер");
        Human anya = new Human(29, "Аня", "Москва", "Методист образовательных программ");
        Human katya = new Human(-28, "Катя", "Калининград", "Продакт-менеджер");
        Human artem = new Human(27, "Артем", null, "Директор по развитию бизнеса");

        System.out.println(max);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        //задание 3
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8", 3.0, null, 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "z8", 0, "черный", 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, null);

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}