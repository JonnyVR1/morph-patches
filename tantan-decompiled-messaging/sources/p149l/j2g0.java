package p149l;

import android.os.Build;
import android.view.Window;

/* JADX INFO: loaded from: classes4.dex */
public class j2g0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m139454a(Window window) {
        window.setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static aq2 m139455b() {
        return wd3.C20853a.m202709b().m202710a();
    }

    /* JADX INFO: renamed from: c */
    public static aq2 m139456c(float f) {
        return wd3.C20853a.m202709b().m202711c(f).m202710a();
    }

    /* JADX INFO: renamed from: d */
    public static aq2 m139457d(float f, boolean z) {
        return wd3.C20853a.m202709b().m202712d(z).m202711c(f).m202710a();
    }

    /* JADX INFO: renamed from: e */
    public static aq2 m139458e(boolean z) {
        return wd3.C20853a.m202709b().m202712d(z).m202710a();
    }

    /* JADX INFO: renamed from: f */
    public static aq2 m139459f() {
        return wn4.C20920a.m204599b().m204600a();
    }

    /* JADX INFO: renamed from: g */
    public static aq2 m139460g() {
        return wn4.C20920a.m204599b().m204601c(0.3f).m204600a();
    }

    /* JADX INFO: renamed from: h */
    public static aq2 m139461h() {
        return gwi0.C17180a.m128420b().m128422c(new e30() { // from class: l.i2g0
            @Override // p149l.e30
            public final void call(Object obj) {
                j2g0.m139454a((Window) obj);
            }
        }).m128421a();
    }
}
