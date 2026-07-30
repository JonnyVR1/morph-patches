package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.a5m;
import p149l.d30;
import p149l.g6a;
import p149l.gxg0;
import p149l.rxg0;
import p149l.swh0;
import p149l.u59;
import p149l.wge0;
import p149l.wsf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1 */
/* JADX INFO: loaded from: classes11.dex */
public final class C7915o1 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo37598a();

        void onCancel();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final User f22117a;

        /* JADX INFO: renamed from: b */
        public final SwipeDirection f22118b;

        /* JADX INFO: renamed from: c */
        public final boolean f22119c;

        /* JADX INFO: renamed from: d */
        public final boolean f22120d;

        public b(User user, SwipeDirection swipeDirection, boolean z, boolean z2) {
            this.f22117a = user;
            this.f22118b = swipeDirection;
            this.f22119c = z;
            this.f22120d = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37712a(a aVar) {
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37713b(a aVar) {
        swh0.m186255p0().m186305Y0();
        if (aVar != null) {
            aVar.mo37598a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m37714c(Object obj) {
        if (obj instanceof wsf0) {
            wsf0 wsf0Var = (wsf0) obj;
            if (NullChecker.m81303a(wsf0Var.mo38809d()) && (wsf0Var.mo38809d() instanceof a5m)) {
                wsf0Var.mo38822y();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m37715d(b bVar) {
        if (bVar == null || bVar.f22117a == null || bVar.f22118b != SwipeDirection.UP || bVar.f22119c || !swh0.m186255p0().m186316j1()) {
            return false;
        }
        String str = bVar.f22117a.f56011id;
        if (g6a.m124574w() && rxg0.m181572j().m181589l(str)) {
            return false;
        }
        int iM203037d = wge0.m203034f().m203037d(str);
        if (CoreModule.m29935P().m94651a().mo33368Mf() && iM203037d > swh0.m186270v0() && iM203037d <= swh0.m186276x0()) {
            return true;
        }
        if (swh0.m186203L1() && swh0.m186200J1()) {
            return (u59.m191827f0() && bVar.f22120d) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m37716e(Act act, String str, final a aVar) {
        int iM203037d = wge0.m203034f().m203037d(str);
        d30 d30Var = new d30() { // from class: l.tvh0
            @Override // p149l.d30
            public final void call() {
                C7915o1.m37713b(aVar);
            }
        };
        d30 d30Var2 = new d30() { // from class: l.uvh0
            @Override // p149l.d30
            public final void call() {
                C7915o1.m37712a(aVar);
            }
        };
        if (iM203037d > 1) {
            gxg0.m128614w(act, iM203037d, d30Var, d30Var2);
        } else {
            swh0.m186180B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, d30Var, d30Var2);
        }
    }
}
