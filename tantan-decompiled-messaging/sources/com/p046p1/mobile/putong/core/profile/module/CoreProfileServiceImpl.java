package com.p046p1.mobile.putong.core.profile.module;

import android.content.Context;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p149l.da0;
import p149l.lqa;
import p149l.pj90;

/* JADX INFO: loaded from: classes11.dex */
@Route(name = "CoreProfileInnerService", path = "/profile_service/service")
public class CoreProfileServiceImpl implements CoreProfileInnerService {
    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: nc */
    public void mo43885nc(String str) {
        da0.m110520a().m110523d(str);
    }

    @Override // com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: pt */
    public String mo43886pt() {
        return da0.m110520a().m110522b();
    }

    @Override // com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: r8 */
    public void mo43887r8(Act act, User user, Runnable runnable) {
        pj90.m169810y(act, user, runnable);
    }

    @Override // com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: sr */
    public boolean mo43888sr() {
        return lqa.m150964b();
    }

    @Override // com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: xt */
    public void mo43889xt(Act act, User user, Runnable runnable) {
        pj90.m169798j(act, user, runnable);
    }
}
