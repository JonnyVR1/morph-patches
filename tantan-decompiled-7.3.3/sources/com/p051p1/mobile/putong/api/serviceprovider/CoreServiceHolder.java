package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p153l.pr2;

/* JADX INFO: loaded from: classes9.dex */
public class CoreServiceHolder extends pr2<CoreService, CoreCommonService> {

    @Autowired(name = "/core_common_service/service", required = true)
    public CoreCommonService coreCommonService;

    @Autowired(name = "/core_service/service", required = true)
    public CoreService coreService;

    @Override // p153l.pr2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CoreCommonService mo30600a() {
        return this.coreCommonService;
    }

    @Override // p153l.pr2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public CoreService mo30601b() {
        return this.coreService;
    }
}
