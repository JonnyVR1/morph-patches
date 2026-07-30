package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.message.module.CoreMessageModule;
import com.p051p1.mobile.putong.core.message.module.CoreMessageProviderImpl;
import com.p051p1.mobile.putong.core.message.module.CoreMessageServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$message implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.core.message.service.CoreMessageInnerService", RouteMeta.build(routeType, CoreMessageServiceImpl.class, "/message_service/service", "message_service", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CoreMessageModule.class, "/message_module/module", "message_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreMessageProviderInterface", RouteMeta.build(routeType, CoreMessageProviderImpl.class, "/core_message/service", "core_message", null, -1, Integer.MIN_VALUE));
    }
}
