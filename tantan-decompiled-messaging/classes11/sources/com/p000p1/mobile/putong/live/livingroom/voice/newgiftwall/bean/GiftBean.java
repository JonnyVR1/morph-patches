package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.gson.annotations.SerializedName;
import com.p1.mobile.putong.live.base.apibean.BaseListItemBean;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GiftBean extends BaseListItemBean implements Serializable {

    @SerializedName("bgImage")
    public String bgImage;

    @SerializedName("canGift")
    public boolean canGift;

    @SerializedName("icon")
    public String icon;

    /* JADX INFO: renamed from: id */
    @SerializedName("id")
    public String f7359id;

    @SerializedName("isOwned")
    public boolean isOwned;

    @SerializedName("isPacketGift")
    public boolean isPacketGift;

    @SerializedName("label")
    public String label;

    @SerializedName("name")
    public String name;

    @SerializedName("price")
    public int price;

    @SerializedName("receivedCount")
    public int receivedCount;

    @SerializedName("tips")
    public String tips;

    @SerializedName("top1ContributorUser")
    public UserBean top1ContributorUser;
}
