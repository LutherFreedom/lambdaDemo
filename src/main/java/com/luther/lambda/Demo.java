package com.luther.lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/11 19:49
 * @UpdateTime: 2018/12/11 19:49
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("This My Demo");

        Person person = new Person("Alex", 29, "M");
        Person person2 = new Person("Candy", 16, "F");
        Predicate<Person> personPredicate = person.isAdultMale();
        Predicate<Person> personPredicate1 = person2.isAdultMale();
        System.out.println(personPredicate.and(personPredicate1).test(person2));
        System.out.println(personPredicate.negate().test(person));

        DemoL<Person> demo = person.testDemo();
        System.out.println(demo.test(person));

        System.out.println();
        person.testConsumer().andThen(person.testCon()).accept(person);

        //Function test
        Couple couple = new Couple();
        Function<Person, Couple> function = person.testFun1(couple);
        Function<Couple, Person> function2 = couple.testFun1(person2);
        function.andThen(function2).apply(person);
        System.out.println(couple.getHusbandName());
        System.out.println(couple.getWifeName());
        Supplier<String> supplier = ()->{
            return "abc";
        };
        ThreadLocal.withInitial(supplier);
    }
}
