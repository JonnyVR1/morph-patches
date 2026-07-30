package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p153l.pr2;

/* JADX INFO: loaded from: classes9.dex */
public class LiveServiceHolder extends pr2<LiveService, LiveCommonService> {

    @Autowired(name = "/live_common_service/service", required = true)
    public LiveCommonService liveCommonService;

    @Autowired(name = "/live_service/service", required = true)
    public LiveService liveService;

    @Override // p153l.pr2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LiveCommonService mo30600a() {
        return this.liveCommonService;
    }

    @Override // p153l.pr2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LiveService mo30601b() {
        return this.liveService;
    }
}
