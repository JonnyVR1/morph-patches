package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Root$$pay implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("core_pay", Injecter$$Group$$core_pay.class);
        map.put("pay_module", Injecter$$Group$$pay_module.class);
        map.put("pay_service", Injecter$$Group$$pay_service.class);
    }
}
