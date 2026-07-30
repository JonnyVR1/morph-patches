package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.api.CoreCommonServiceImpl;
import com.p051p1.mobile.putong.core.api.CoreServiceImpl;
import com.p051p1.mobile.putong.core.module.CoreBusinessServiceIml;
import com.p051p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl;
import com.p051p1.mobile.putong.core.module.CoreProviderImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$b_core implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.core.member.module.CoreMemberBusinessService", RouteMeta.build(routeType, CoreMemberBusinessServiceImpl.class, "/member_business_service/service", "member_business_service", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreProviderInterface", RouteMeta.build(routeType, CoreProviderImpl.class, "/core_global/service", "core_global", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService", RouteMeta.build(routeType, CoreServiceImpl.class, "/core_service/service", "core_service", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CoreBusinessModule.class, "/core_module/module", "core_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService", RouteMeta.build(routeType, CoreBusinessServiceIml.class, "/core_business/service", "core_business", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService", RouteMeta.build(routeType, CoreCommonServiceImpl.class, "/core_common_service/service", "core_common_service", null, -1, Integer.MIN_VALUE));
    }
}
