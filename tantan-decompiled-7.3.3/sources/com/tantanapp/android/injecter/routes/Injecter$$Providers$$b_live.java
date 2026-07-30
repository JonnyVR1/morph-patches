package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.live.LiveCommonServiceImpl;
import com.p051p1.mobile.putong.live.LiveModule;
import com.p051p1.mobile.putong.live.LiveServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$b_live implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService", RouteMeta.build(routeType, LiveCommonServiceImpl.class, "/live_common_service/service", "live_common_service", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, LiveModule.class, "/live_module/module", "live_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService", RouteMeta.build(routeType, LiveServiceImpl.class, "/live_service/service", "live_service", null, -1, Integer.MIN_VALUE));
    }
}
