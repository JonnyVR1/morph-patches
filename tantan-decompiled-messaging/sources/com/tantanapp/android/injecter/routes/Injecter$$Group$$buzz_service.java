package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.buzz.module.CoreBuzzInnerServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$buzz_service implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/buzz_service/service", RouteMeta.build(RouteType.PROVIDER, CoreBuzzInnerServiceImpl.class, "/buzz_service/service", "buzz_service", null, -1, Integer.MIN_VALUE));
    }
}
