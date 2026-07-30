package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class FeedServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        FeedServiceHolder feedServiceHolder = (FeedServiceHolder) obj;
        FeedService feedService = (FeedService) mum.m160228d().m160230a("/feed_service/service").navigation();
        feedServiceHolder.feedService = feedService;
        if (feedService == null) {
            zzq0.m222278a("The field 'feedService' is null, in class '", FeedServiceHolder.class.getName(), "!");
            return;
        }
        FeedCommonService feedCommonService = (FeedCommonService) mum.m160228d().m160230a("/feed_common_service/service").navigation();
        feedServiceHolder.feedCommonService = feedCommonService;
        if (feedCommonService != null) {
            return;
        }
        zzq0.m222278a("The field 'feedCommonService' is null, in class '", FeedServiceHolder.class.getName(), "!");
    }
}
