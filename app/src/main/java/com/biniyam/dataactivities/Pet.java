package com.biniyam.dataactivities;


import androidx.annotation.NonNull;

public class Pet {  // implements Serializable {   // watch out
    static String type;
   private static String name;
   int age;

    public Pet(String type, String name, int age) {
        this.type = type;
        this.setName(name);
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        Pet.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @NonNull
    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + age +
                '}';
    }
}

