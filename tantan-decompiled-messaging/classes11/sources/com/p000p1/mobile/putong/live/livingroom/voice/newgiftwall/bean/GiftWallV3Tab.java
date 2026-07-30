package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean;

import com.google.gson.annotations.SerializedName;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GiftWallV3Tab extends BaseLiveBean {

    @SerializedName("gifts")
    public List<GiftBean> gifts;

    @SerializedName("nextPageLink")
    public String nextPageLink;
}
