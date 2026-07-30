package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Root$$member implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("core_member", Injecter$$Group$$core_member.class);
        map.put("member_module", Injecter$$Group$$member_module.class);
        map.put("member_service", Injecter$$Group$$member_service.class);
    }
}
