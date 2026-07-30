package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.api.FeedCommonServiceImpl;
import com.p051p1.mobile.putong.feed.api.FeedServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$b_feed implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, FeedModule.class, "/feed_module/module", "feed_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService", RouteMeta.build(routeType, FeedCommonServiceImpl.class, "/feed_common_service/service", "feed_common_service", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService", RouteMeta.build(routeType, FeedServiceImpl.class, "/feed_service/service", "feed_service", null, -1, Integer.MIN_VALUE));
    }
}
