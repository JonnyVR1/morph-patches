package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.member.module.CoreMemberProviderImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$core_member implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/core_member/service", RouteMeta.build(RouteType.PROVIDER, CoreMemberProviderImpl.class, "/core_member/service", "core_member", null, -1, Integer.MIN_VALUE));
    }
}
