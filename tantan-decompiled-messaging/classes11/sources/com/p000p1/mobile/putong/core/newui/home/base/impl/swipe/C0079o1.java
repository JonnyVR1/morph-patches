package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.g6a;
import l.gxg0;
import l.rxg0;
import l.swh0;
import l.u59;
import l.wge0;
import p009l.a5m;
import p009l.wsf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class C0079o1 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1569a();

        void onCancel();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final User f895a;

        /* JADX INFO: renamed from: b */
        public final SwipeDirection f896b;

        /* JADX INFO: renamed from: c */
        public final boolean f897c;

        /* JADX INFO: renamed from: d */
        public final boolean f898d;

        public b(User user, SwipeDirection swipeDirection, boolean z, boolean z2) {
            this.f895a = user;
            this.f896b = swipeDirection;
            this.f897c = z;
            this.f898d = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1683a(a aVar) {
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1684b(a aVar) {
        swh0.p0().Y0();
        if (aVar != null) {
            aVar.mo1569a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1685c(Object obj) {
        if (obj instanceof wsf0) {
            wsf0 wsf0Var = (wsf0) obj;
            if (NullChecker.a(wsf0Var.mo2805d()) && (wsf0Var.mo2805d() instanceof a5m)) {
                wsf0Var.mo2818y();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1686d(b bVar) {
        if (bVar == null || bVar.f895a == null || bVar.f896b != SwipeDirection.UP || bVar.f897c || !swh0.p0().j1()) {
            return false;
        }
        String str = ((DbObject) bVar.f895a).id;
        if (g6a.w() && rxg0.j().l(str)) {
            return false;
        }
        int iD = wge0.f().d(str);
        if (CoreModule.P().a().Mf() && iD > swh0.v0() && iD <= swh0.x0()) {
            return true;
        }
        if (swh0.L1() && swh0.J1()) {
            return (u59.f0() && bVar.f898d) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m1687e(Act act, String str, final a aVar) {
        int iD = wge0.f().d(str);
        d30 d30Var = new d30() { // from class: l.tvh0
            public final void call() {
                C0079o1.m1684b(aVar);
            }
        };
        d30 d30Var2 = new d30() { // from class: l.uvh0
            public final void call() {
                C0079o1.m1683a(aVar);
            }
        };
        if (iD > 1) {
            gxg0.w(act, iD, d30Var, d30Var2);
        } else {
            swh0.B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, d30Var, d30Var2);
        }
    }
}
