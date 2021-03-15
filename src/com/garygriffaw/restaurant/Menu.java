package com.garygriffaw.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    // Getters and Setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
