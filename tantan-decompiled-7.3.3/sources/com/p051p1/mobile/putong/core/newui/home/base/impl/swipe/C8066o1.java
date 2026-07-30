package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.a5i0;
import p153l.bpe0;
import p153l.d79;
import p153l.f1g0;
import p153l.o5h0;
import p153l.q7m;
import p153l.s7a;
import p153l.x20;
import p153l.z5h0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1 */
/* JADX INFO: loaded from: classes11.dex */
public final class C8066o1 {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo38601a();

        void onCancel();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o1$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final User f22859a;

        /* JADX INFO: renamed from: b */
        public final SwipeDirection f22860b;

        /* JADX INFO: renamed from: c */
        public final boolean f22861c;

        /* JADX INFO: renamed from: d */
        public final boolean f22862d;

        public b(User user, SwipeDirection swipeDirection, boolean z, boolean z2) {
            this.f22859a = user;
            this.f22860b = swipeDirection;
            this.f22861c = z;
            this.f22862d = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m38715a(a aVar) {
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m38716b(a aVar) {
        a5i0.m96160p0().m96210Y0();
        if (aVar != null) {
            aVar.mo38601a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m38717c(Object obj) {
        if (obj instanceof f1g0) {
            f1g0 f1g0Var = (f1g0) obj;
            if (NullChecker.m82486a(f1g0Var.mo39812d()) && (f1g0Var.mo39812d() instanceof q7m)) {
                f1g0Var.mo39825y();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m38718d(b bVar) {
        if (bVar == null || bVar.f22859a == null || bVar.f22860b != SwipeDirection.UP || bVar.f22861c || !a5i0.m96160p0().m96221j1()) {
            return false;
        }
        String str = bVar.f22859a.f56859id;
        if (s7a.m184994w() && z5h0.m218675j().m218692l(str)) {
            return false;
        }
        int iM105817d = bpe0.m105814f().m105817d(str);
        if (CoreModule.m30933P().m143405a().mo34371Mf() && iM105817d > a5i0.m96175v0() && iM105817d <= a5i0.m96181x0()) {
            return true;
        }
        if (a5i0.m96108L1() && a5i0.m96105J1()) {
            return (d79.m114685j0() && bVar.f22862d) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m38719e(Act act, String str, final a aVar) {
        int iM105817d = bpe0.m105814f().m105817d(str);
        x20 x20Var = new x20() { // from class: l.b4i0
            @Override // p153l.x20
            public final void call() {
                C8066o1.m38716b(aVar);
            }
        };
        x20 x20Var2 = new x20() { // from class: l.c4i0
            @Override // p153l.x20
            public final void call() {
                C8066o1.m38715a(aVar);
            }
        };
        if (iM105817d > 1) {
            o5h0.m166150w(act, iM105817d, x20Var, x20Var2);
        } else {
            a5i0.m96085B1(act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, x20Var, x20Var2);
        }
    }
}
