package com.driver;

import java.sql.SQLOutput;

public class Pizza
{
    private int price; //total
    private int base;
    private int cheese;
    private int toppings;
    private int paper;

    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill ="";
    }

    public int getPrice()
    {
        if(isVeg)
        {
            this.price += 300;
            base = 300;
        }
        else
        {
            this.price += 400;
            base = 400;
        }
        return this.price;
    }

    public void addExtraCheese()
    {
        this.cheese += 80;
        this.price += 80;
    }

    public void addExtraToppings()
    {
        this.toppings += isVeg ? 70 : 120;
        this.price += isVeg ? 70 : 120;
    }

    public void addTakeaway()
    {
        this.paper += 20;
        this.price += 20;
    }

    public String getBill()
    {
        bill += "Base Price Of The Pizza: " + base + "\n";

        if(cheese > 0) bill += "Extra Cheese Added: " + cheese+ "\n";

        if(toppings > 0 ) bill+= "Extra Toppings Added: " + toppings + "\n";

        if(paper > 0) bill += "Paperbag Added: " + paper +"\n";

        bill += "Total Price: " + price + "\n";

        return this.bill;
    }
}
