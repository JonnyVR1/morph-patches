package com.tantanapp.beatles.p077v2.data;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class User {

    @SerializedName("ab_groups")
    private List<String> abGroups;

    @SerializedName("oneid")
    private String oneId;

    @SerializedName("user_id")
    private String userId;

    public List<String> getAbGroups() {
        return this.abGroups;
    }

    public String getOneId() {
        return this.oneId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setAbGroups(List<String> list) {
        this.abGroups = list;
    }

    public void setOneId(String str) {
        this.oneId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
