package com.p000p1.mobile.putong.api.serviceprovider;

import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p006l.zq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FeedServiceHolder extends zq2<FeedService, FeedCommonService> {

    @Autowired(name = "/feed_common_service/service", required = true)
    public FeedCommonService feedCommonService;

    @Autowired(name = "/feed_service/service", required = true)
    public FeedService feedService;

    @Override // p006l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FeedCommonService mo1508a() {
        return this.feedCommonService;
    }

    @Override // p006l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FeedService mo1509b() {
        return this.feedService;
    }
}
