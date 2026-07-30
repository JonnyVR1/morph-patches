package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Root$$innovation implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("core_innovation", Injecter$$Group$$core_innovation.class);
        map.put("innovation_module", Injecter$$Group$$innovation_module.class);
        map.put("innovation_service", Injecter$$Group$$innovation_service.class);
    }
}
