package com.example.nyt; // <============= CHANGE ME

/***
 * Model class for news articles. This should be 100% familiar to you.
 */
public class MenuItems {

    private int itemID;
    private String headline;
    private String summary;
    private String content;
    private int imageDrawableId;


    public MenuItems(int itemID, String headline, String summary, String content, int imageDrawableId) {
        this.itemID = itemID;
        this.headline = headline;
        this.summary = summary;
        this.content = content;
        this.imageDrawableId = imageDrawableId;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
