package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.live.LiveServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$live_service implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/live_service/service", RouteMeta.build(RouteType.PROVIDER, LiveServiceImpl.class, "/live_service/service", "live_service", null, -1, Integer.MIN_VALUE));
    }
}
