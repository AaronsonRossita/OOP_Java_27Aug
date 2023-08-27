import package_one.A;
import package_one.B;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

//        Student student1 = new Student(1,null, LocalDate.now());
//        System.out.println(student1.getName());
//        student1.setName(null);
//        System.out.println(student1.getName());
//        student1.setName("Tom");
//        System.out.println(student1.getName());

        Item itemA = new Item(1,100,"Chair",2,"Brown");
        Item itemB = new Item(2,200,"Sofa",1,"Green");

//        System.out.println(itemA.getId());
//        System.out.println(itemA.getPrice());
//        System.out.println(itemA.getName());
//        System.out.println(itemA.getAmount());
//        System.out.println(itemA.getColor());
//        System.out.println("------------");
//        System.out.println(itemB.getId());
//        System.out.println(itemB.getPrice());
//        System.out.println(itemB.getName());
//        System.out.println(itemB.getAmount());
//        System.out.println(itemB.getColor());

//        itemA.printAllFields();
//        System.out.println("--------");
        itemA.setId(3);
        itemA.setPrice(300);
        itemA.setName("Table");
        itemA.setAmount(3);
        itemA.setColor("White");
//        itemA.printAllFields();
//        System.out.println("--------");
//        itemB.printAllFields();

//        System.out.println(itemA.getId());
//        System.out.println(itemA.getPrice());
//        System.out.println(itemA.getName());
//        System.out.println(itemA.getAmount());
//        System.out.println(itemA.getColor());

        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(1);
        list1.add("three");
        list1.add(true);
        list1.add(itemA);

//        System.out.println(list1);
//        list1.add(1,"two");
//        System.out.println(list1);
//        list1.remove(3);
//        System.out.println(list1);
//        System.out.println(list1.get(2)); // list1[2]
//        System.out.println(list1.size());
        ArrayList<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("def");

        int primitiveInt = 1;
        Integer classInt = 2;

        char primitiveChar = 'a';
        Character classChar = 'A';

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(3);








    }

}