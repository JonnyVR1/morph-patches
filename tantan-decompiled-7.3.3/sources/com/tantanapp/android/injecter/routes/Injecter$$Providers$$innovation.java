package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.innovation.module.CoreInnovationInnerServiceImpl;
import com.p051p1.mobile.putong.core.innovation.module.CoreInnovationModule;
import com.p051p1.mobile.putong.core.innovation.module.CoreInnovationProviderImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$innovation implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreInnovationProviderInterface", RouteMeta.build(routeType, CoreInnovationProviderImpl.class, "/core_innovation/service", "core_innovation", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.innovation.service.CoreInnovationInnerService", RouteMeta.build(routeType, CoreInnovationInnerServiceImpl.class, "/innovation_service/service", "innovation_service", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CoreInnovationModule.class, "/innovation_module/module", "innovation_module", null, -1, Integer.MIN_VALUE));
    }
}
