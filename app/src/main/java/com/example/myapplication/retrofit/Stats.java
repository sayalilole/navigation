
package com.example.myapplication.retrofit;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Stats {

    @SerializedName("checkinsCount")
    private Long mCheckinsCount;
    @SerializedName("tipCount")
    private Long mTipCount;
    @SerializedName("usersCount")
    private Long mUsersCount;

    public Long getCheckinsCount() {
        return mCheckinsCount;
    }

    public void setCheckinsCount(Long checkinsCount) {
        mCheckinsCount = checkinsCount;
    }

    public Long getTipCount() {
        return mTipCount;
    }

    public void setTipCount(Long tipCount) {
        mTipCount = tipCount;
    }

    public Long getUsersCount() {
        return mUsersCount;
    }

    public void setUsersCount(Long usersCount) {
        mUsersCount = usersCount;
    }

}
