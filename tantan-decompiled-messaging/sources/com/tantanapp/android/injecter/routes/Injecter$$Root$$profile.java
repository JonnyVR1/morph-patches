package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Root$$profile implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("core_profile", Injecter$$Group$$core_profile.class);
        map.put("profile_module", Injecter$$Group$$profile_module.class);
        map.put("profile_service", Injecter$$Group$$profile_service.class);
    }
}
