package com.sibsutis.devices;

public class Phone extends Device {
    
    // Конструктор без IP
    public Phone(int id, int price) {
        super(id, price, null);
    }
    
    // Конструктор с IP
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    // Реализация абстрактного метода
    @Override
    public String getDeviceType() {
        return "Phone";
    }
    
    // equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
