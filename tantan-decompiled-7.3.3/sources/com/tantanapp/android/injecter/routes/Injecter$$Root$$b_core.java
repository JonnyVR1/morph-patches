package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Root$$b_core implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("core_business", Injecter$$Group$$core_business.class);
        map.put("core_common_service", Injecter$$Group$$core_common_service.class);
        map.put("core_global", Injecter$$Group$$core_global.class);
        map.put("core_module", Injecter$$Group$$core_module.class);
        map.put("core_service", Injecter$$Group$$core_service.class);
        map.put("member_business_service", Injecter$$Group$$member_business_service.class);
    }
}
