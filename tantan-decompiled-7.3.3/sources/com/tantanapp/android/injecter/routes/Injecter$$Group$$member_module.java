package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Group$$member_module implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/member_module/module", RouteMeta.build(RouteType.PROVIDER, CoreMemberModule.class, "/member_module/module", "member_module", null, -1, Integer.MIN_VALUE));
    }
}
