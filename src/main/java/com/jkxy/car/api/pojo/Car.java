package com.jkxy.car.api.pojo;

public class Car {
    private int id;
    private String carName;
    private String carType;
    private String price;
    private String carSeries;
    private int beginNum;
    private int displayNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries;
    }

    public int getBeginNum() {
        return beginNum;
    }

    public void setBeginNum(int beginNum) {
        this.beginNum = beginNum;
    }

    public int getDisplayNum() {
        return displayNum;
    }

    public void setDisplayNum(int displayNum) {
        this.displayNum = displayNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                ", price='" + price + '\'' +
                ", carSeries='" + carSeries + '\'' +
                ", beginNum=" + beginNum +
                ", displayNum=" + displayNum +
                '}';
    }
}
