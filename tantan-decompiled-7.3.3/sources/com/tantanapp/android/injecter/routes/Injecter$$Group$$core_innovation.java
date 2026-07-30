package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.innovation.module.CoreInnovationProviderImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$core_innovation implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/core_innovation/service", RouteMeta.build(RouteType.PROVIDER, CoreInnovationProviderImpl.class, "/core_innovation/service", "core_innovation", null, -1, Integer.MIN_VALUE));
    }
}
