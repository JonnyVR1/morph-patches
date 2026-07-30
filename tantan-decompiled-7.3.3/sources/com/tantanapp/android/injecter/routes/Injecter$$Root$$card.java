package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Root$$card implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("card_module", Injecter$$Group$$card_module.class);
        map.put("card_service", Injecter$$Group$$card_service.class);
        map.put("core_card", Injecter$$Group$$core_card.class);
    }
}
