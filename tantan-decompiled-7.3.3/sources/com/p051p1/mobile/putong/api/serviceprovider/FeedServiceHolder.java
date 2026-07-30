package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p153l.pr2;

/* JADX INFO: loaded from: classes9.dex */
public class FeedServiceHolder extends pr2<FeedService, FeedCommonService> {

    @Autowired(name = "/feed_common_service/service", required = true)
    public FeedCommonService feedCommonService;

    @Autowired(name = "/feed_service/service", required = true)
    public FeedService feedService;

    @Override // p153l.pr2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FeedCommonService mo30600a() {
        return this.feedCommonService;
    }

    @Override // p153l.pr2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FeedService mo30601b() {
        return this.feedService;
    }
}
