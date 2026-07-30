package p002l;

import android.os.Build;
import android.view.Window;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j2g0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15575a(Window window) {
        window.setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static aq2 m15576b() {
        return wd3.C0879a.m24518b().m24519a();
    }

    /* JADX INFO: renamed from: c */
    public static aq2 m15577c(float f) {
        return wd3.C0879a.m24518b().m24520c(f).m24519a();
    }

    /* JADX INFO: renamed from: d */
    public static aq2 m15578d(float f, boolean z) {
        return wd3.C0879a.m24518b().m24521d(z).m24520c(f).m24519a();
    }

    /* JADX INFO: renamed from: e */
    public static aq2 m15579e(boolean z) {
        return wd3.C0879a.m24518b().m24521d(z).m24519a();
    }

    /* JADX INFO: renamed from: f */
    public static aq2 m15580f() {
        return wn4.C0887a.m25251b().m25252a();
    }

    /* JADX INFO: renamed from: g */
    public static aq2 m15581g() {
        return wn4.C0887a.m25251b().m25253c(0.3f).m25252a();
    }

    /* JADX INFO: renamed from: h */
    public static aq2 m15582h() {
        return gwi0.C0598a.m14065b().m14067c(new e30() { // from class: l.i2g0
            public final void call(Object obj) {
                j2g0.m15575a((Window) obj);
            }
        }).m14066a();
    }
}
