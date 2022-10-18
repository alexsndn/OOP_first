public class Human {
    int yearOfBirth;
    String name;
    String city;
    String job;

    Human(int yearOfBirth, String name, String city, String job) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = 2022 - yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
            this.name = name;
            this.city = city;
            this.job = job;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
