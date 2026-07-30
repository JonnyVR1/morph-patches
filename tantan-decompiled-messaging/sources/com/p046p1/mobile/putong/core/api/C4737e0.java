package com.p046p1.mobile.putong.core.api;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import p149l.hpd0;
import p149l.roj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4737e0 {

    /* JADX INFO: renamed from: b */
    public static C4737e0 f19807b;

    /* JADX INFO: renamed from: a */
    public final hpd0 f19808a = new hpd0("showFakeDailog" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public static C4737e0 m31949a() {
        if (f19807b == null) {
            synchronized (C4737e0.class) {
                try {
                    if (f19807b == null) {
                        f19807b = new C4737e0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19807b;
    }

    /* JADX INFO: renamed from: g */
    public static void m31950g() {
        f19807b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m31951b() {
        CoreSuggested.UserInfo userInfoM31140r6 = CoreModule.f17545c.f19663m0.m31140r6();
        if (userInfoM31140r6 == null || userInfoM31140r6.virtualCardType != VirtualCardType.FakeCard) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.FakeCard;
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m31952c(boolean z) {
        if (z || m31954e()) {
            m31956h(false);
            m31951b();
            m31956h(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m31953d() {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            m31952c(false);
        } else {
            m31956h(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m31954e() {
        return this.f19808a.get().booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public void m31955f() {
        CoreSuggested.UserInfo userInfoM31140r6 = CoreModule.f17545c.f19663m0.m31140r6();
        if (userInfoM31140r6 != null && userInfoM31140r6.virtualCardType == VirtualCardType.FakeCard) {
            CoreModule.f17545c.f19663m0.m30986C8("fake_dlg");
            CoreModule.f17545c.f19639e0.f149311Y1.m132487l(roj0.f160388a);
        }
        m31956h(false);
    }

    /* JADX INFO: renamed from: h */
    public void m31956h(boolean z) {
        this.f19808a.put(Boolean.valueOf(z));
    }
}
