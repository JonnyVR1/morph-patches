package com.p000p1.mobile.putong.api.serviceprovider;

import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FeedServiceHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        FeedServiceHolder feedServiceHolder = (FeedServiceHolder) obj;
        FeedService feedService = (FeedService) ksm.d().a("/feed_service/service").navigation();
        feedServiceHolder.feedService = feedService;
        if (feedService == null) {
            tqq0.a("The field 'feedService' is null, in class '", FeedServiceHolder.class.getName(), "!");
            return;
        }
        FeedCommonService feedCommonService = (FeedCommonService) ksm.d().a("/feed_common_service/service").navigation();
        feedServiceHolder.feedCommonService = feedCommonService;
        if (feedCommonService != null) {
            return;
        }
        tqq0.a("The field 'feedCommonService' is null, in class '", FeedServiceHolder.class.getName(), "!");
    }
}
