package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class FeedServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        FeedServiceHolder feedServiceHolder = (FeedServiceHolder) obj;
        FeedService feedService = (FeedService) ksm.m147096d().m147098a("/feed_service/service").navigation();
        feedServiceHolder.feedService = feedService;
        if (feedService == null) {
            tqq0.m190155a("The field 'feedService' is null, in class '", FeedServiceHolder.class.getName(), "!");
            return;
        }
        FeedCommonService feedCommonService = (FeedCommonService) ksm.m147096d().m147098a("/feed_common_service/service").navigation();
        feedServiceHolder.feedCommonService = feedCommonService;
        if (feedCommonService != null) {
            return;
        }
        tqq0.m190155a("The field 'feedCommonService' is null, in class '", FeedServiceHolder.class.getName(), "!");
    }
}
