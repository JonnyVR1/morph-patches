package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.live.LiveModule;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$live_module implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/live_module/module", RouteMeta.build(RouteType.PROVIDER, LiveModule.class, "/live_module/module", "live_module", null, -1, Integer.MIN_VALUE));
    }
}
