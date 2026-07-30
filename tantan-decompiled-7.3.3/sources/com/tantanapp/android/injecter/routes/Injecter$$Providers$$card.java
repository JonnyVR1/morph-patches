package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.card.module.CoreCardModule;
import com.p051p1.mobile.putong.core.card.module.CoreCardProviderImpl;
import com.p051p1.mobile.putong.core.card.module.CoreCardServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$card implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreCardProviderInterface", RouteMeta.build(routeType, CoreCardProviderImpl.class, "/core_card/service", "core_card", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CoreCardModule.class, "/card_module/module", "card_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.card.service.CoreCardInnerService", RouteMeta.build(routeType, CoreCardServiceImpl.class, "/card_service/service", "card_service", null, -1, Integer.MIN_VALUE));
    }
}
