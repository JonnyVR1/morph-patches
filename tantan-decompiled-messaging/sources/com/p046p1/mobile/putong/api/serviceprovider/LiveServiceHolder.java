package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p149l.zq2;

/* JADX INFO: loaded from: classes9.dex */
public class LiveServiceHolder extends zq2<LiveService, LiveCommonService> {

    @Autowired(name = "/live_common_service/service", required = true)
    public LiveCommonService liveCommonService;

    @Autowired(name = "/live_service/service", required = true)
    public LiveService liveService;

    @Override // p149l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LiveCommonService mo29602a() {
        return this.liveCommonService;
    }

    @Override // p149l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LiveService mo29603b() {
        return this.liveService;
    }
}
