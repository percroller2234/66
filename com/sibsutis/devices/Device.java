package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    protected int id;          // уникальный идентификатор устройства
    protected int price;       // стоимость устройства
    protected String ip;       // IP адрес устройства, может быть null
    
    // Конструктор
    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }
    
    // Абстрактный метод - должен быть реализован в наследниках
    public abstract String getDeviceType();
    
    // Реализация метода из интерфейса Printable
    @Override
    public String sprint() {
        return String.format("Device{id=%d, price=%d, ip=%s, type=%s}", 
                           id, price, ip, getDeviceType());
    }
    
    // Метод split() из диаграммы
    public int split() {
        return price / 100; // пример реализации
    }
    
    // Геттеры
    public int getId() { return id; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }
    
    // equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return id == device.id;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
