package com.p051p1.mobile.putong.core.api;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import p153l.jxd0;
import p153l.uxj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.e0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4888e0 {

    /* JADX INFO: renamed from: b */
    public static C4888e0 f20549b;

    /* JADX INFO: renamed from: a */
    public final jxd0 f20550a = new jxd0("showFakeDailog" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public static C4888e0 m32952a() {
        if (f20549b == null) {
            synchronized (C4888e0.class) {
                try {
                    if (f20549b == null) {
                        f20549b = new C4888e0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20549b;
    }

    /* JADX INFO: renamed from: g */
    public static void m32953g() {
        f20549b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m32954b() {
        CoreSuggested.UserInfo userInfoM32143r6 = CoreModule.f18264c.f20405m0.m32143r6();
        if (userInfoM32143r6 == null || userInfoM32143r6.virtualCardType != VirtualCardType.FakeCard) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.FakeCard;
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m32955c(boolean z) {
        if (z || m32957e()) {
            m32959h(false);
            m32954b();
            m32959h(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m32956d() {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            m32955c(false);
        } else {
            m32959h(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m32957e() {
        return this.f20550a.get().booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public void m32958f() {
        CoreSuggested.UserInfo userInfoM32143r6 = CoreModule.f18264c.f20405m0.m32143r6();
        if (userInfoM32143r6 != null && userInfoM32143r6.virtualCardType == VirtualCardType.FakeCard) {
            CoreModule.f18264c.f20405m0.m31989C8("fake_dlg");
            CoreModule.f18264c.f20381e0.f89168Y1.m137019l(uxj0.f181467a);
        }
        m32959h(false);
    }

    /* JADX INFO: renamed from: h */
    public void m32959h(boolean z) {
        this.f20550a.put(Boolean.valueOf(z));
    }
}
