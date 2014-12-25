package com.tundem.materialdrawer.model;


import com.mikepenz.iconics.typeface.IIcon;

public class NavDrawerItem {

    private String title;
    private IIcon icon;
    private boolean primary = true;
    private boolean enabled = true;

    public NavDrawerItem() {
    }

    public NavDrawerItem(String title) {
        this.title = title;
    }

    public NavDrawerItem(String title, IIcon icon) {
        this.setTitle(title);
        this.setIcon(icon);
    }

    public NavDrawerItem(String title, boolean primary) {
        this.title = title;
        this.setPrimary(primary);
    }

    public NavDrawerItem(String title, boolean primary, boolean enabled) {
        this.title = title;
        this.primary = primary;
        this.enabled = enabled;
    }

    public NavDrawerItem(String title, IIcon icon, boolean primary) {
        this.setTitle(title);
        this.setIcon(icon);
        this.setPrimary(primary);
    }

    public NavDrawerItem(String title, IIcon icon, boolean primary, boolean enabled) {
        this.setTitle(title);
        this.setIcon(icon);
        this.setPrimary(primary);
        this.setEnabled(enabled);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IIcon getIcon() {
        return icon;
    }

    public void setIcon(IIcon icon) {
        this.icon = icon;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}