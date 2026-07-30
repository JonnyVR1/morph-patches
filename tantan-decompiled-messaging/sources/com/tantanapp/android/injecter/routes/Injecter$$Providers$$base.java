package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Providers$$base implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(RouteType.PROVIDER, CoreModule.class, "/base_module/module", "base_module", null, -1, Integer.MIN_VALUE));
    }
}
