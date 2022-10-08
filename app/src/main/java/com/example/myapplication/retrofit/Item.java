
package com.example.myapplication.retrofit;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Item {

    @SerializedName("unreadCount")
    private Long mUnreadCount;

    public Long getUnreadCount() {
        return mUnreadCount;
    }

    public void setUnreadCount(Long unreadCount) {
        mUnreadCount = unreadCount;
    }

}
