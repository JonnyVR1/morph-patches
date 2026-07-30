package com.momo.mcamera.filtermanager;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class MMProcessUnit implements Serializable {
    private static final String FILTER_DECORATION = "[Decoration]";
    public static final int UnitTextureLocationOverSourceImage = 0;
    public static final int UnitTextureLocationUnderSourceImage = 1;
    public static final long serialVersionUID = 8953832831202944611L;
    private String bak;
    private HashMap<String, Object> mFilterMap;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    private String mFilterName;
    private int mTextLocation;
    private String mTexturePath1;
    private String mTexturePath2;

    @SerializedName("resourceName")
    private String resourceName;

    public MMProcessUnit(int i) {
        this.mTextLocation = i;
    }

    public String getBak() {
        return this.bak;
    }

    public HashMap<String, Object> getFilterMap() {
        return this.mFilterMap;
    }

    public String getFilterName() {
        return this.mFilterName;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public int getTextLocation() {
        return this.mTextLocation;
    }

    public String getTexturePath1() {
        return this.mTexturePath1;
    }

    public String getTexturePath2() {
        return this.mTexturePath2;
    }

    public boolean isDecoration() {
        if (TextUtils.isEmpty(this.mFilterName)) {
            return false;
        }
        return this.mFilterName.endsWith(FILTER_DECORATION);
    }

    public void setBak(String str) {
        this.bak = str;
    }

    public void setFilterMap(HashMap<String, Object> map) {
        this.mFilterMap = map;
    }

    public void setFilterName(String str) {
        this.mFilterName = str;
    }

    public void setResourceName(String str) {
        this.resourceName = str;
    }

    public void setTextLocation(int i) {
        this.mTextLocation = i;
    }

    public void setTexturePath1(String str) {
        this.mTexturePath1 = str;
    }

    public void setTexturePath2(String str) {
        this.mTexturePath2 = str;
    }

    public String toString() {
        return "MMProcessUnit{mTextLocation=" + this.mTextLocation + ", mFilterName='" + this.mFilterName + "', mFilterMap=" + this.mFilterMap + ", mTexturePath1='" + this.mTexturePath1 + "', mTexturePath2='" + this.mTexturePath2 + "'}";
    }
}
