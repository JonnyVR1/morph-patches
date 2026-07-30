package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.buzz.module.CoreBuzzInnerServiceImpl;
import com.p051p1.mobile.putong.core.buzz.module.CoreBuzzModule;
import com.p051p1.mobile.putong.core.buzz.module.CoreBuzzProviderImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$buzz implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreBuzzProviderInterface", RouteMeta.build(routeType, CoreBuzzProviderImpl.class, "/core_buzz/service", "core_buzz", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CoreBuzzModule.class, "/buzz_module/module", "buzz_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.buzz.service.CoreBuzzInnerService", RouteMeta.build(routeType, CoreBuzzInnerServiceImpl.class, "/buzz_service/service", "buzz_service", null, -1, Integer.MIN_VALUE));
    }
}
