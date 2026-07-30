package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.feed.api.FeedServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$feed_service implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/feed_service/service", RouteMeta.build(RouteType.PROVIDER, FeedServiceImpl.class, "/feed_service/service", "feed_service", null, -1, Integer.MIN_VALUE));
    }
}
