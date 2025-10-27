package com.sibsutis.devices;

public class PersonalComputer extends Device {
    
    // Конструктор без IP
    public PersonalComputer(int id, int price) {
        super(id, price, null);
    }
    
    // Конструктор с IP
    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    // Реализация абстрактного метода
    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }
    
    // equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalComputer that = (PersonalComputer) o;
        return id == that.id;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
