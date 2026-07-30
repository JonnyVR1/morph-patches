package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.module.CoreMemberBusinessServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Group$$member_business_service implements IRouteGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/member_business_service/service", RouteMeta.build(RouteType.PROVIDER, CoreMemberBusinessServiceImpl.class, "/member_business_service/service", "member_business_service", null, -1, Integer.MIN_VALUE));
    }
}
