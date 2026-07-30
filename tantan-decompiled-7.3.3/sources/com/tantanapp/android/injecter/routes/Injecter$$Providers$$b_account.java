package com.tantanapp.android.injecter.routes;

import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.AccountCommonServiceImpl;
import com.p051p1.mobile.putong.account.api.AccountServiceImpl;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Injecter$$Providers$$b_account implements IProviderGroup {
    @Override // com.tantanapp.android.injecter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService", RouteMeta.build(routeType, AccountCommonServiceImpl.class, "/account_common_service/service", "account_common_service", null, -1, Integer.MIN_VALUE));
        map.put("com.tantanapp.putong.module.Module", RouteMeta.build(routeType, AccountModule.class, "/account_module/module", "account_module", null, -1, Integer.MIN_VALUE));
        map.put("com.p1.mobile.putong.account_api.api.serviceprovider.api.AccountService", RouteMeta.build(routeType, AccountServiceImpl.class, "/account_service/service", "account_service", null, -1, Integer.MIN_VALUE));
    }
}
