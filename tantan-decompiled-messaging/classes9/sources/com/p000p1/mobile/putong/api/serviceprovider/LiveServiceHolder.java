package com.p000p1.mobile.putong.api.serviceprovider;

import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p006l.zq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LiveServiceHolder extends zq2<LiveService, LiveCommonService> {

    @Autowired(name = "/live_common_service/service", required = true)
    public LiveCommonService liveCommonService;

    @Autowired(name = "/live_service/service", required = true)
    public LiveService liveService;

    @Override // p006l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LiveCommonService mo1508a() {
        return this.liveCommonService;
    }

    @Override // p006l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LiveService mo1509b() {
        return this.liveService;
    }
}
