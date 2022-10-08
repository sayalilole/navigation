
package com.example.myapplication.retrofit;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class BeenHere {

    @SerializedName("lastCheckinExpiredAt")
    private Long mLastCheckinExpiredAt;

    public Long getLastCheckinExpiredAt() {
        return mLastCheckinExpiredAt;
    }

    public void setLastCheckinExpiredAt(Long lastCheckinExpiredAt) {
        mLastCheckinExpiredAt = lastCheckinExpiredAt;
    }

}
