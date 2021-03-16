package com.garygriffaw.restaurant;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public boolean addMenuItem(MenuItem menuItem) {
        if (menuItems.contains(menuItem)) {
            return false;
        }

        menuItems.add(menuItem);
        updateLastUpdated();
        return true;
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
        updateLastUpdated();
    }

    public ArrayList<String> displayMenu() {
        ArrayList<String> displayMenuItems = new ArrayList<>();

        SimpleDateFormat ft =
                new SimpleDateFormat("MMMM d, yyyy 'at' h:mm:ss a");
        displayMenuItems.add("Menu updated: " + ft.format(lastUpdated));
        for (MenuItem menuItem : menuItems)
            displayMenuItems.add(menuItem.displayMenuItem());

        return displayMenuItems;
    }

    private void updateLastUpdated() {
        lastUpdated = new Date();
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
