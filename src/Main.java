public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        // Задача 2
        System.out.println("Задача 2");
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если ребенку " + childAge + " лет, то он не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если ребенку " + childAge + " лет, то он может кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если ребенку " + childAge + " лет, то он может кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 3
        System.out.println("Задача 3");
        int one = 100;
        int two = 100;
        int three = 100;
        if (one > two) {
            if (one >= three) {
                System.out.println("Наибольшее число: " + one);
            } else {
                System.out.println("Наибольшее число: " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Наибольшее число: " + two);
            } else {
                System.out.println("Наибольшее число: " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Наибольшее число: " + one);
            }else if (three > one) {
                System.out.println("Наибольшее число: " + three);
            }
            else {
                System.out.println("Все 3 числа равны");
            }

        }
    }
}