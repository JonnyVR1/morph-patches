package p006l;

import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class q850 implements ABManager.InterfaceC0104d {
    /* JADX INFO: renamed from: c */
    public static boolean m21956c() {
        try {
            return Long.parseLong(CoreModule.m1850H().userId()) % 17 != 0;
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public final void mo1299a() {
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public final void mo1300b() {
    }
}
