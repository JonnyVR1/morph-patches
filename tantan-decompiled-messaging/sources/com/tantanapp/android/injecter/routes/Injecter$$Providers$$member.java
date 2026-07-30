package com.tantanapp.android.injecter.routes;

import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.member.module.CoreMemberProviderImpl;
import com.p046p1.mobile.putong.core.member.module.CoreMemberServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Injecter$$Providers$$member implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface", RouteMeta.build(routeType, CoreMemberProviderImpl.class, "/core_member/service", "core_member", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.core.biz.service.CoreMemberInnerService", RouteMeta.build(routeType, CoreMemberServiceImpl.class, "/member_service/service", "member_service", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, CoreMemberModule.class, "/member_module/module", "member_module", null, -1, Integer.MIN_VALUE));
    }
}
