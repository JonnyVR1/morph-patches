package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseListItemBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class GiftBean extends BaseListItemBean implements Serializable {

    @SerializedName("bgImage")
    public String bgImage;

    @SerializedName("canGift")
    public boolean canGift;

    @SerializedName("icon")
    public String icon;

    /* JADX INFO: renamed from: id */
    @SerializedName("id")
    public String f54601id;

    @SerializedName("isOwned")
    public boolean isOwned;

    @SerializedName("isPacketGift")
    public boolean isPacketGift;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    public String label;

    @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
    public String name;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    public int price;

    @SerializedName("receivedCount")
    public int receivedCount;

    @SerializedName("tips")
    public String tips;

    @SerializedName("top1ContributorUser")
    public UserBean top1ContributorUser;
}
