package com.tantanapp.android.injecter.routes;

import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Root$$base implements IRouteRoot {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("base_module", Injecter$$Group$$base_module.class);
    }
}
