package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Root$$b_account implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("account_common_service", Injecter$$Group$$account_common_service.class);
        map.put("account_module", Injecter$$Group$$account_module.class);
        map.put("account_service", Injecter$$Group$$account_service.class);
    }
}
