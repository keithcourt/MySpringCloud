package com.my.cloud;

/**
 * @Author: liuxw
 * @Description:
 * @Date: Created in 15:46 2018/4/27
 * @Modified By:
 */
public class Person {
    private Integer personId;
    private String name;
    private Integer age;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Person(Integer personId, String name, Integer age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
}
