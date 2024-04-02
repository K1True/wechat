package com.zjgsu.kongyizhen.wechat;

public class Person {
    private String name;
    private String time;
    private int personId;
    private String sentence;

    public Person(String name, int personId,String time,String sentence) {
        this.name = name;
        this.time = time;
        this.personId = personId;
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }
}
