package com.p051p1.mobile.putong.live.external.square.api;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import java.util.List;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareBannerBean {

    /* JADX INFO: renamed from: id */
    @SerializedName("id")
    public String f47069id;

    @SerializedName("rowIndex")
    public int rowIndex;

    @SerializedName("tabs")
    public List<LiveBannerTabBean> tabs;

    @SerializedName("type")
    public String type;

    public void removeLiveGroupBanners() {
        this.tabs = jyb.m147522n(this.tabs, new qcj() { // from class: l.s0u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((LiveBannerTabBean) obj).isLiveGroupType());
            }
        });
    }
}
