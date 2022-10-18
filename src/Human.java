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
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
