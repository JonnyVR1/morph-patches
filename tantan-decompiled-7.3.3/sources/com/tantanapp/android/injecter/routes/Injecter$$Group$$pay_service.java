package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.pay.module.CorePayServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$pay_service implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/pay_service/service", RouteMeta.build(RouteType.PROVIDER, CorePayServiceImpl.class, "/pay_service/service", "pay_service", null, -1, Integer.MIN_VALUE));
    }
}
