package com.example.nyt;

public class CartItems {

    public String headline;
    public int summary;
    public int quantity;
    public int t;


    public CartItems(String headline, int summary, int quantity, int t) {

        this.headline = headline;
        this.summary = summary;
        this.quantity = quantity;
        this.t = t;
    }



    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }


    public int getSummary() {
        return summary;
    }

    public void setSummary(int summary) { this.summary = summary; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public int getT() { return t;
    }

    public void setT(int t) { this.t = t; }


@Override
    public String toString() {
        return "Order Item: " + headline + "\n" +
                "Price: " + "$" + summary + "\n" +
                "Quantity " + quantity + "\n " +
                "Total " + "$" + t + "\n" +"\n";
    }

    public static int t() {
        int total = 0;
        for(CartItems c : MainActivity.orderList) {
            total += c.getT();
        }
        return total;
    }

}
