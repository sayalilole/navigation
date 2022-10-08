
package com.example.myapplication.retrofit;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Notification {

    @SerializedName("item")
    private Item mItem;
    @SerializedName("type")
    private String mType;

    public Item getItem() {
        return mItem;
    }

    public void setItem(Item item) {
        mItem = item;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
