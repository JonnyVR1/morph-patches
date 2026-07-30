package com.p051p1.mobile.putong.live.base.apibean;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveOperationItemBean extends BaseListItemBean {

    @SerializedName("countDownTimestamp")
    public long countDownTimestamp;

    @SerializedName("digitalRedDotCount")
    public int digitalRedDotCount;

    @SerializedName("enableRedDot")
    public boolean enableRedDot;

    @SerializedName("icon")
    public String icon;

    @SerializedName("iconType")
    public String iconType;

    /* JADX INFO: renamed from: id */
    @SerializedName("id")
    public String f45083id;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    public String name;

    @SerializedName("schema")
    public String schema;

    @SerializedName("type")
    public String type;
}
