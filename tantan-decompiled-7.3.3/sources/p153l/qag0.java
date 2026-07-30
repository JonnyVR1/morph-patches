package p153l;

import android.os.Build;
import android.view.Window;

/* JADX INFO: loaded from: classes4.dex */
public class qag0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m175920a(Window window) {
        window.setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static rq2 m175921b() {
        return le3.C18383a.m153874b().m153875a();
    }

    /* JADX INFO: renamed from: c */
    public static rq2 m175922c(float f) {
        return le3.C18383a.m153874b().m153876c(f).m153875a();
    }

    /* JADX INFO: renamed from: d */
    public static rq2 m175923d(float f, boolean z) {
        return le3.C18383a.m153874b().m153877d(z).m153876c(f).m153875a();
    }

    /* JADX INFO: renamed from: e */
    public static rq2 m175924e(boolean z) {
        return le3.C18383a.m153874b().m153877d(z).m153875a();
    }

    /* JADX INFO: renamed from: f */
    public static rq2 m175925f() {
        return vo4.C20872a.m202073b().m202074a();
    }

    /* JADX INFO: renamed from: g */
    public static rq2 m175926g() {
        return vo4.C20872a.m202073b().m202075c(0.3f).m202074a();
    }

    /* JADX INFO: renamed from: h */
    public static rq2 m175927h() {
        return k5j0.C18103a.m148408b().m148410c(new y20() { // from class: l.pag0
            @Override // p153l.y20
            public final void call(Object obj) {
                qag0.m175920a((Window) obj);
            }
        }).m148409a();
    }
}
