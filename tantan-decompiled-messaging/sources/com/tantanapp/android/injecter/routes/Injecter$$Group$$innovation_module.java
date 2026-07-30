package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.innovation.module.CoreInnovationModule;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$innovation_module implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/innovation_module/module", RouteMeta.build(RouteType.PROVIDER, CoreInnovationModule.class, "/innovation_module/module", "innovation_module", null, -1, Integer.MIN_VALUE));
    }
}
