package com.immomo.moment.filtermanager;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class MMProcessUnit implements Serializable {
    private static final String FILTER_DECORATION = "[Decoration]";
    public static final int UnitTextureLocationOverSourceImage = 0;
    public static final long serialVersionUID = 8953832831202944611L;
    private HashMap<String, Object> mFilterMap;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    private String mFilterName;
    private String mTexturePath1;

    @SerializedName("resourceName")
    private String resourceName;

    public MMProcessUnit() {
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

    public String getTexturePath1() {
        return this.mTexturePath1;
    }

    public boolean isDecoration() {
        if (TextUtils.isEmpty(this.mFilterName)) {
            return false;
        }
        return this.mFilterName.endsWith(FILTER_DECORATION);
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

    public void setTexturePath1(String str) {
        this.mTexturePath1 = str;
    }

    public MMProcessUnit(int i) {
    }
}
