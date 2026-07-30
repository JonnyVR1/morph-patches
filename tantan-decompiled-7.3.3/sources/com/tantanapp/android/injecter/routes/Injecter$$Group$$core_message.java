package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.message.module.CoreMessageProviderImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$core_message implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/core_message/service", RouteMeta.build(RouteType.PROVIDER, CoreMessageProviderImpl.class, "/core_message/service", "core_message", null, -1, Integer.MIN_VALUE));
    }
}
