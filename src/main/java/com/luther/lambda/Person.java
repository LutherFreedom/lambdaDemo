package com.luther.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/11 20:50
 * @UpdateTime: 2018/12/11 20:50
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class Person {
    private String name;
    private Integer age;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Predicate<Person> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public DemoL<Person> testDemo() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public Consumer<Person> testConsumer() {
        return p -> System.out.println("这是第一步");
    }

    public Consumer<Person> testCon() {
        return p -> System.out.println("这是第二步");
    }

    public Function<Person, Couple> testFun1(Couple couple) {
        return p -> {
            if (p.getGender().equalsIgnoreCase("M")) {
                couple.setHusbandName(name);
            } else {
                couple.setWifeName(name);
            }
            System.out.println(couple.getHusbandName());
            return couple;
        };
    }
}
