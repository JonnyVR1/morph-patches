package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Root$$buzz implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("buzz_module", Injecter$$Group$$buzz_module.class);
        map.put("buzz_service", Injecter$$Group$$buzz_service.class);
        map.put("core_buzz", Injecter$$Group$$core_buzz.class);
    }
}
