package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.profile.module.CoreProfileServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$profile_service implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/profile_service/service", RouteMeta.build(RouteType.PROVIDER, CoreProfileServiceImpl.class, "/profile_service/service", "profile_service", null, -1, Integer.MIN_VALUE));
    }
}
