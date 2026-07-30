package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VirtualCardType;
import l.hpd0;
import l.roj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0163e0 {

    /* JADX INFO: renamed from: b */
    public static C0163e0 f3796b;

    /* JADX INFO: renamed from: a */
    public final hpd0 f3797a = new hpd0("showFakeDailog" + CoreModule.m1850H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public static C0163e0 m3879a() {
        if (f3796b == null) {
            synchronized (C0163e0.class) {
                try {
                    if (f3796b == null) {
                        f3796b = new C0163e0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3796b;
    }

    /* JADX INFO: renamed from: g */
    public static void m3880g() {
        f3796b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m3881b() {
        CoreSuggested.UserInfo userInfoM3070r6 = CoreModule.f1534c.f3652m0.m3070r6();
        if (userInfoM3070r6 == null || userInfoM3070r6.virtualCardType != VirtualCardType.FakeCard) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.FakeCard;
            CoreModule.f1534c.f3652m0.m3084w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3882c(boolean z) {
        if (z || m3884e()) {
            m3886h(false);
            m3881b();
            m3886h(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3883d() {
        if (CoreModule.f1534c.f3628e0.m21427Z7()) {
            m3882c(false);
        } else {
            m3886h(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m3884e() {
        return ((Boolean) this.f3797a.get()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public void m3885f() {
        CoreSuggested.UserInfo userInfoM3070r6 = CoreModule.f1534c.f3652m0.m3070r6();
        if (userInfoM3070r6 != null && userInfoM3070r6.virtualCardType == VirtualCardType.FakeCard) {
            CoreModule.f1534c.f3652m0.m2916C8("fake_dlg");
            CoreModule.f1534c.f3628e0.f18923Y1.onNext(roj0.a);
        }
        m3886h(false);
    }

    /* JADX INFO: renamed from: h */
    public void m3886h(boolean z) {
        this.f3797a.put(Boolean.valueOf(z));
    }
}
