/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.javacase;

/**
 *
 * @author ayza
 */
public class Notebook {
private int Id;
    private double price;
    private int discountRate;
    private int stock;
    private String name;
    private String brand;
    private int ram;
    private int memory;
    private double screen;

    public Notebook(int Id, String name,double price,String brand,int memory,double screen,int ram,int stock,int discountRate){
        this.Id=Id;
        this.name=name;
        this.price=price;
        this.brand= brand;
        this.memory=memory;
        this.screen=screen;
        this.ram=ram;
        this.stock=stock;
        this.discountRate=discountRate;
    }


    
    void print(){
        System.out.printf(" |%-4d| %-20s| %-8.1fTL| %-8s| %-8d|   %-8.1f | %-8d|%-10d|%-16d|\n" ,Id ,  name , price , brand , memory , screen , ram,stock,discountRate);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount_rate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        screen = screen;
    }
}
