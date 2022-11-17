 public class Main {
     public static void main(String[] args) {
         // Задание 1
         System.out.println("Задание 1");
         int age = 12;
         if (age >= 18) {
             System.out.println("Поздравляем с совершеннолетием! ");
         }
         if (age < 18) {
             System.out.println("Возраст совершеннолетия ещё не наступил,  нужно немного подождать ");
             // Задание 2
             System.out.println("Задание 2");
             int humanAge = 8;
             if (humanAge >= 7) {
                 System.out.println("Ребёнок идёт в школу");
                 if (humanAge >= 18) {
                     System.out.println("человек уже закончил школу и может отправляться в университет ");
                     if (humanAge >= 24) {
                         System.out.println("человек окончил университет и ему пора искать первую работу ");
                     }
                 }
             }
             // Задание 3
             System.out.println("Задание 3");

             int passengerCount = 102;
             int seatingPlaces = 60;
             int standingPlaces = passengerCount - seatingPlaces;

             int seatingOccupied = 60;
             int standingOccupied = 42;
             if (seatingOccupied < seatingPlaces) {
                 System.out.println("есть ещё " + (seatingPlaces - seatingOccupied) + " Сидячих мест");
             }
             if (seatingPlaces == seatingOccupied) {
                 System.out.println("Сидячих мест нет");
             }
             if (standingOccupied < standingPlaces) {
                 System.out.println("Есть ещё " + (standingPlaces - standingOccupied) + " стоячих мест");
             }
             if (standingPlaces == standingOccupied) {
                 System.out.println("Стоячих мест нет");
             }
             if (passengerCount == (standingOccupied + seatingOccupied)) {
                 System.out.println("Мест в вагоне нет");
             }
             // Задание 4
         }
         System.out.println("Задание 4");
         int age2 = 19;
         if (age2 >= 18) {
             System.out.println("Поздравляем с совершеннолетием! ");
         } else {
             System.out.println("Возраст совершеннолетия ещё не наступил,  нужно немного подождать ");
         }

         // Задание 5
         System.out.println("Задание 5");
         int age3 = 25;
         if (age3 >= 7 && age3 < 18) {
             System.out.println("Ребёнок идёт в школу");
         }
         if (age3 > 18 && age3 < 24) {
             System.out.println("человек уже закончил школу и может отправляться в университет ");
         } else if (age3 >= 24) {
             System.out.println("человек окончил университет и ему пора искать первую работу ");
         }

         // Задание 6
         System.out.println("Задание 6");
         int passengercount1 = 102;
         int seatingPlaces1 = 60;
         int standingPlaces1 = passengercount1 - seatingPlaces1;

         int seatingOccupied = 60;
         int standingOccupied = 42;
         if (seatingOccupied < seatingPlaces1) {
             System.out.println("есть ещё " + (seatingPlaces1 - seatingOccupied) + " Сидячих мест");
         } else {
             System.out.println("Сидячих мест нет");
         }
         if (standingOccupied < standingPlaces1) {
             System.out.println("Есть ещё " + (standingPlaces1 - standingOccupied) + " стоячих мест");
         } else {
             System.out.println("Стоячих мест нет");
         }

         // Задание 7
         System.out.println("Задание 7");
         int peopleAge = 17;
         boolean goStudy = peopleAge >= 2 && peopleAge <= 6;

         if (goStudy) {
             System.out.println("Если возрост человека равен " + peopleAge + " лет, то ему надо ходить в детский сад");
         } else if (peopleAge >= 7 && peopleAge < 18) {
             System.out.println("Если возраст реловека равен " + peopleAge + " лет, то ему надо ходить в школц");
         } else if (peopleAge >= 18 && peopleAge < 24) {
             System.out.println("Если возраст человека равен " + peopleAge + " лет, то ему надо ходить в университет");
         } else if (peopleAge > 24) {
             System.out.println("Если возраст человека равен " + peopleAge + " лет, то ему надо ходить на работу");
         }
         // Задание 8
         System.out.println("Задание 8");
         int oldChild = 14;
         boolean canRide1 = oldChild < 5;
         if (canRide1) {
             System.out.println("Ребёнок не может котаться");
         } else if (oldChild >= 5 && oldChild < 14) {
             System.out.println("Ребёнок может котаться только в сопровождении родителей");
         } else if (oldChild >= 14) {
             System.out.println("Ребёнок может котаться без соровождения");
         }
         // Задание 9
         System.out.println("Задание 9");
         int one = 15;
         int two = 1;
         int three = 15;
         if (one >= two && one > three) {
             System.out.println("Большее число " + one);
         } else if (two > one && two >= three) {
             System.out.println("Большее число " + two);
         } else if (three >= one && three > two) {
             System.out.println("Большее число " + three);
         } else {
             System.out.println("Все числа равны");
         }
     }
 }