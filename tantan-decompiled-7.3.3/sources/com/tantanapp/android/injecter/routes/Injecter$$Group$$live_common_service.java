package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.live.LiveCommonServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$live_common_service implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/live_common_service/service", RouteMeta.build(RouteType.PROVIDER, LiveCommonServiceImpl.class, "/live_common_service/service", "live_common_service", null, -1, Integer.MIN_VALUE));
    }
}
