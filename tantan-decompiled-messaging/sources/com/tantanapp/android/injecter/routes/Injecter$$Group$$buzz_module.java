package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.buzz.module.CoreBuzzModule;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$buzz_module implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/buzz_module/module", RouteMeta.build(RouteType.PROVIDER, CoreBuzzModule.class, "/buzz_module/module", "buzz_module", null, -1, Integer.MIN_VALUE));
    }
}
