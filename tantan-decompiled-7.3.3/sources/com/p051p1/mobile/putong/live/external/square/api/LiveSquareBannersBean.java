package com.p051p1.mobile.putong.live.external.square.api;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareBannersBean extends BaseLiveBean {

    @SerializedName(Banners.TYPE)
    public List<LiveSquareBannerBean> banners;
}
