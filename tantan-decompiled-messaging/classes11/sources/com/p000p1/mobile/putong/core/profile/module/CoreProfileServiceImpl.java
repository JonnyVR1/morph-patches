package com.p000p1.mobile.putong.core.profile.module;

import android.content.Context;
import com.p000p1.mobile.putong.core.profile.service.CoreProfileInnerService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import l.da0;
import l.lqa;
import p009l.pj90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Route(name = "CoreProfileInnerService", path = "/profile_service/service")
public class CoreProfileServiceImpl implements CoreProfileInnerService {
    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: nc */
    public void mo8261nc(String str) {
        da0.a().d(str);
    }

    @Override // com.p000p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: pt */
    public String mo8262pt() {
        return da0.a().b();
    }

    @Override // com.p000p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: r8 */
    public void mo8263r8(Act act, User user, Runnable runnable) {
        pj90.m20482y(act, user, runnable);
    }

    @Override // com.p000p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: sr */
    public boolean mo8264sr() {
        return lqa.b();
    }

    @Override // com.p000p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: xt */
    public void mo8265xt(Act act, User user, Runnable runnable) {
        pj90.m20470j(act, user, runnable);
    }
}
