package com.garygriffaw.restaurant;

import java.util.Objects;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private Category category;
    private boolean newItem;

    public MenuItem(String name, String description, double price, Category category, boolean newItem) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.newItem = newItem;
    }

    public String displayMenuItem() {
        String newItem;
        if (isNewItem())
            newItem = "New Item! ";
        else
            newItem = "";

        return "Category: " + category +
                " " + newItem +
                name +
                " - " + description +
                "; Price: " + price;
    }

    @Override
    public String toString() {
        return "MenuItem(" +
                "Item: " + name +
                "; Description: " + description +
                "; Price: " + price +
                "; Category: " + category +
                "; NewItem: " + newItem +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
}
