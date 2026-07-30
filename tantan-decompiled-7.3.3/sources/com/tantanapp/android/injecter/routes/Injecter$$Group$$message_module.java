package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.message.module.CoreMessageModule;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$message_module implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/message_module/module", RouteMeta.build(RouteType.PROVIDER, CoreMessageModule.class, "/message_module/module", "message_module", null, -1, Integer.MIN_VALUE));
    }
}
