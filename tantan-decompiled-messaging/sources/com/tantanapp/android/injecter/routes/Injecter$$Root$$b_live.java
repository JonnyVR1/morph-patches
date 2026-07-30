package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Root$$b_live implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("live_common_service", Injecter$$Group$$live_common_service.class);
        map.put("live_module", Injecter$$Group$$live_module.class);
        map.put("live_service", Injecter$$Group$$live_service.class);
    }
}
