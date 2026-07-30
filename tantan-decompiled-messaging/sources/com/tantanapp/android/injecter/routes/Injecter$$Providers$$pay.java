package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.pay.module.CorePayModule;
import com.p046p1.mobile.putong.core.pay.module.CorePayProviderImpl;
import com.p046p1.mobile.putong.core.pay.module.CorePayServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Providers$$pay implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.core.biz.service.CorePayInnerService", RouteMeta.build(routeType, CorePayServiceImpl.class, "/pay_service/service", "pay_service", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.api.inject.provider.CorePayProviderInterface", RouteMeta.build(routeType, CorePayProviderImpl.class, "/core_pay/service", "core_pay", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CorePayModule.class, "/pay_module/module", "pay_module", null, -1, Integer.MIN_VALUE));
    }
}
