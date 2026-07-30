package com.p046p1.mobile.putong.live.external.square.api;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import java.util.List;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareBannerBean {

    /* JADX INFO: renamed from: id */
    @SerializedName("id")
    public String f46221id;

    @SerializedName("rowIndex")
    public int rowIndex;

    @SerializedName("tabs")
    public List<LiveBannerTabBean> tabs;

    @SerializedName("type")
    public String type;

    public void removeLiveGroupBanners() {
        this.tabs = vwb.m200339n(this.tabs, new w9j() { // from class: l.ryt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((LiveBannerTabBean) obj).isLiveGroupType());
            }
        });
    }
}
