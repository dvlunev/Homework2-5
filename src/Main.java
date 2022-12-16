import animalspractice.*;
import transport.*;

public class Main {
    public static void main(String[] args) {
        // Тренировка
        System.out.println("Тренировка");
        Cat.Breed brShBreed = new Cat.Breed(
                "Британская короткошерстная",
                "ВБ",
                Cat.Breed.HairType.SHORT
        );
        Cat murzik = new Cat("Мурзик");
        //*Cat.FavToy murzikFavToy = murzik.new FavToy("Рыбка", "заводная");
        //murzik.setToy(murzikFavToy);
        //System.out.println(murzikFavToy.getCatName());
        //murzik.age = 3;
        //murzik.meow();
        //System.out.println(murzik.getName());
        //Cat begemot = new Cat("Бегемот", -5);
        //begemot.age = -5;
        //begemot.setName(null);
        //begemot.meow();
        //System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");
        //System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        //murzik.friends[0].meow();
        //System.out.println(Cat.getCount());
        //System.out.println();

        //murzik.talk();
        //murzik.eat();

        Dog sharik = new Dog("Шарик", 2005);
        //sharik.setAddress("random address");
        //Dog sharik2 = new Dog("Шарик",2005);
        //sharik2.setAddress("random address");
//
        //if (sharik.equals(sharik2)) {
        //    sharik2 = sharik;
        //}

        //sharik.talk();
        //sharik.eat();

        //Parrot kesha = new Parrot("Кеша");
        //kesha.talk();

        //murzik.addFriend(begemot);
        //murzik.addFriend(sharik);
        //murzik.addFriend(kesha);

        for (Pet friend : murzik.getFriends()) {
            if (friend instanceof Cat) {
                Cat cat = (Cat) friend;
                cat.meow();
            } else if (friend.getClass() == Parrot.class) {
                ((Parrot) friend).talk();
            } else {
                System.out.println(friend);
            }
        }

        //Trained trained = new Trained();

        Tiger tiger = new Tiger();

        sharik.train("Апорт");
        sharik.train("Голос");
        sharik.train(TrainedCommand.CMD_SIT.name());
        sharik.train(TrainedCommand.CMD_LIE_DOWN.name());

        checkTrained(sharik);

        System.out.println();

        sharik.doCommand("Апорт");
        sharik.doCommand("Голос");
        sharik.doCommand("Сидеть");
        sharik.doCommand("Лежать");

        //sharik.train("апорт");
        //sharik.doCommand("апорт");

        /*Trainer<Dog> alex = new Trainer<>("Alex");
        alex.train(sharik);

        Trainer<Cat> mike = new Trainer<>("Mike");
        mike.train(murzik);

        Trainer bob = new Trainer<>("Bob");
        bob.train(tiger);
        bob.train(sharik);
        bob.train(murzik);*/
        System.out.println();

        // Задание 1
        System.out.println("Задание 1");
        Car car1 = new Car(
                "Hyundai",
                "Avante",
                2
        );
        car1.setBodyTypeName(BodyType.WAGON.name());
        System.out.println(car1);
        Car car2 = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4
        );
        car2.setBodyTypeName("Кроссовер");
        System.out.println(car2);
        Car car3 = new Car(
                "BMW",
                "Z8",
                3
        );
        System.out.println(car3);

        Truck truck1 = new Truck(
                "Камаз",
                "54654",
                5.5
        );
        truck1.setLoadCapacity(LoadCapacity.N1);
        System.out.println(truck1);
        Truck truck2 = new Truck(
                "Hyundai",
                "A353",
                4.5
        );
        truck2.setLoadCapacity(LoadCapacity.N2);
        System.out.println(truck2);
        Truck truck3 = new Truck(
                "ВАЗ",
                "2152",
                3.5
        );
        System.out.println(truck3);

        Bus bus1 = new Bus(
                "Scania",
                "A80 4x2",
                6
        );
        bus1.setCapacity(Capacity.ESPECIALLY_SMALL);
        System.out.println(bus1);
        Bus bus2 = new Bus(
                "Газ",
                "5292",
                5.0
        );
        bus2.setCapacity(Capacity.LARGE);
        System.out.println(bus2);
        Bus bus3 = new Bus(
                "МАЗ",
                "3432",
                4.5
        );
        System.out.println(bus3);
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        car1.printType();
        car2.printType();
        car3.printType();
        truck1.printType();
        truck2.printType();
        truck3.printType();
        bus1.printType();
        bus2.printType();
        bus3.printType();
    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (String command : animal.getTrainedCommands()) {
                animal.doCommand(command);
            }
        }
    }

}