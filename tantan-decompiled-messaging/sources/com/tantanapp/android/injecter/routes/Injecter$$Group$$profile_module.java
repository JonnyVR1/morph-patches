package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.profile.module.CoreProfileModule;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$profile_module implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/profile_module/module", RouteMeta.build(RouteType.PROVIDER, CoreProfileModule.class, "/profile_module/module", "profile_module", null, -1, Integer.MIN_VALUE));
    }
}
