package com.p051p1.mobile.putong.core.profile.module;

import android.content.Context;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p153l.tr90;
import p153l.xra;
import p153l.z90;

/* JADX INFO: loaded from: classes11.dex */
@Route(name = "CoreProfileInnerService", path = "/profile_service/service")
public class CoreProfileServiceImpl implements CoreProfileInnerService {
    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: nc */
    public void mo45071nc(String str) {
        z90.m219037a().m219040d(str);
    }

    @Override // com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: pt */
    public String mo45072pt() {
        return z90.m219037a().m219039b();
    }

    @Override // com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: r8 */
    public void mo45073r8(Act act, User user, Runnable runnable) {
        tr90.m192435y(act, user, runnable);
    }

    @Override // com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: sr */
    public boolean mo45074sr() {
        return xra.m212783b();
    }

    @Override // com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService
    /* JADX INFO: renamed from: xt */
    public void mo45075xt(Act act, User user, Runnable runnable) {
        tr90.m192423j(act, user, runnable);
    }
}
