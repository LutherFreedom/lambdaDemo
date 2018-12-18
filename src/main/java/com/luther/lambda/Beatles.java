package com.luther.lambda;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/18 21:13
 * @UpdateTime: 2018/12/18 21:13
 * @Version: 1.0.0
 * @PackageName: com.luther.s4
 * TODO:
 */
public class Beatles implements Comparable<Beatles>{
    private String name;
    private String country;

    public Boolean isFrom(String country) {
        return country.equals(this.country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Beatles(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Integer getLength() {
        return name.length();
    }

    @Override
    public int compareTo(Beatles o) {
        return 0;
    }
}
