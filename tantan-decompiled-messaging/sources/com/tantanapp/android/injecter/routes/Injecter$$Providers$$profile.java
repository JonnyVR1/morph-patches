package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.profile.module.CoreProfileModule;
import com.p046p1.mobile.putong.core.profile.module.CoreProfileProviderImpl;
import com.p046p1.mobile.putong.core.profile.module.CoreProfileServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Providers$$profile implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CoreProfileModule.class, "/profile_module/module", "profile_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreProfileProviderInterface", RouteMeta.build(routeType, CoreProfileProviderImpl.class, "/core_profile/service", "core_profile", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.profile.service.CoreProfileInnerService", RouteMeta.build(routeType, CoreProfileServiceImpl.class, "/profile_service/service", "profile_service", null, -1, Integer.MIN_VALUE));
    }
}
