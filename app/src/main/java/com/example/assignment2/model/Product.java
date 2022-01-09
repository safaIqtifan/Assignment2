package com.example.assignment2.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    private String productName;
    private String productPrice;
    private String currency;
    private String productType;
    private String day;
    private String month;
    private String year;

    public Product(String productName, String productPrice, String currency,
                   String productType, String day, String month, String year) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.currency = currency;
        this.productType = productType;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    protected Product(Parcel in) {
        productName = in.readString();
        productPrice = in.readString();
        currency = in.readString();
        productType = in.readString();
        day = in.readString();
        month = in.readString();
        year = in.readString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(productName);
        dest.writeString(productPrice);
        dest.writeString(currency);
        dest.writeString(productType);
        dest.writeString(day);
        dest.writeString(month);
        dest.writeString(year);
    }

    @Override
    public String toString() {
        return  "Product Name = " + productName + "\n" +"\n" +
                " ProductPrice = " + productPrice + "\n" +"\n" +
                " Currency = " + currency + "\n" +"\n" +
                " ProductType = " + productType + "\n" +"\n" +
                " Day = " + day +
                "  Month = " + month + "\n" +"\n" +
                " Year = " + year;
    }

}
