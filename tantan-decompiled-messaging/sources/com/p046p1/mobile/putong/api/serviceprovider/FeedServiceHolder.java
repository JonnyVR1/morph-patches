package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p149l.zq2;

/* JADX INFO: loaded from: classes9.dex */
public class FeedServiceHolder extends zq2<FeedService, FeedCommonService> {

    @Autowired(name = "/feed_common_service/service", required = true)
    public FeedCommonService feedCommonService;

    @Autowired(name = "/feed_service/service", required = true)
    public FeedService feedService;

    @Override // p149l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FeedCommonService mo29602a() {
        return this.feedCommonService;
    }

    @Override // p149l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FeedService mo29603b() {
        return this.feedService;
    }
}
