package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p149l.zq2;

/* JADX INFO: loaded from: classes9.dex */
public class CoreServiceHolder extends zq2<CoreService, CoreCommonService> {

    @Autowired(name = "/core_common_service/service", required = true)
    public CoreCommonService coreCommonService;

    @Autowired(name = "/core_service/service", required = true)
    public CoreService coreService;

    @Override // p149l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CoreCommonService mo29602a() {
        return this.coreCommonService;
    }

    @Override // p149l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public CoreService mo29603b() {
        return this.coreService;
    }
}
