package com.company;

public class Brand extends Car{
        private String brandName;
        private int year;

        public Brand(int noOfTires, String color, String brandName, int year) {
                super(noOfTires, color);
                this.brandName = brandName;
                this.year = year;
        }
}
