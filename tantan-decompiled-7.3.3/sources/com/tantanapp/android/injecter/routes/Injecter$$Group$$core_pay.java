package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.pay.module.CorePayProviderImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$core_pay implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/core_pay/service", RouteMeta.build(RouteType.PROVIDER, CorePayProviderImpl.class, "/core_pay/service", "core_pay", null, -1, Integer.MIN_VALUE));
    }
}
