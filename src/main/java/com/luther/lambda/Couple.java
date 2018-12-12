package com.luther.lambda;

import java.util.function.Function;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/11 21:40
 * @UpdateTime: 2018/12/11 21:40
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class Couple {
    private String husbandName;
    private String wifeName;

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public Function<Couple, Person> testFun1(Person person) {
        return couple -> {
            if (person.getGender().equalsIgnoreCase("F")) {
                couple.setWifeName(person.getName());
            }
            System.out.println(couple.getWifeName());
            return person;
        };
    }
}
