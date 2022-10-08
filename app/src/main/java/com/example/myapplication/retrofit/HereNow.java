
package com.example.myapplication.retrofit;

import java.util.List;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class HereNow {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("groups")
    private List<Object> mGroups;
    @SerializedName("summary")
    private String mSummary;

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public List<Object> getGroups() {
        return mGroups;
    }

    public void setGroups(List<Object> groups) {
        mGroups = groups;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

}
