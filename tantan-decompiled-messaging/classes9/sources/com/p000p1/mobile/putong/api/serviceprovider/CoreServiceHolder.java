package com.p000p1.mobile.putong.api.serviceprovider;

import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p006l.zq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreServiceHolder extends zq2<CoreService, CoreCommonService> {

    @Autowired(name = "/core_common_service/service", required = true)
    public CoreCommonService coreCommonService;

    @Autowired(name = "/core_service/service", required = true)
    public CoreService coreService;

    @Override // p006l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CoreCommonService mo1508a() {
        return this.coreCommonService;
    }

    @Override // p006l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public CoreService mo1509b() {
        return this.coreService;
    }
}
