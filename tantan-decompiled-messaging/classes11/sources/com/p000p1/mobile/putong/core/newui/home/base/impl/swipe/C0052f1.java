package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import p009l.jj4;
import p009l.nt30;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0052f1 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public static volatile boolean f857g = false;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f858h = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f1$a */
    public class a implements C0079o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0062j.a f859a;

        public a(C0062j.a aVar) {
            this.f859a = aVar;
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        /* JADX INFO: renamed from: a */
        public void mo1569a() {
            C0052f1.f858h = true;
            C0052f1.f857g = false;
            this.f859a.f872a.m19385X8(true);
            if (this.f859a.f873b.m1310q2().isAdded()) {
                this.f859a.f873b.m1092A2().mo2797A(SwipeDirection.UP);
            }
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        public void onCancel() {
            C0052f1.f857g = false;
            this.f859a.f872a.m19390Y8(false);
            C0079o1.m1685c(this.f859a.f873b.m1092A2());
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1586s() {
        return f858h;
    }

    /* JADX INFO: renamed from: t */
    public static void m1587t() {
        f858h = false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1588v(C0062j.a aVar) {
        jj4 jj4Var;
        if (aVar == null || (jj4Var = aVar.f874c) == null || jj4Var.m17130d() == null) {
            return false;
        }
        User userM17130d = aVar.f874c.m17130d();
        return C0079o1.m1686d(new C0079o1.b(userM17130d, aVar.f875d, aVar.f872a.m19468p6(), aVar.f872a.m19441j6(((DbObject) userM17130d).id)));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        boolean zM19472q6 = aVar.f872a.m19472q6();
        nt30 nt30Var = aVar.f872a;
        if (zM19472q6) {
            nt30Var.m19407c5();
            return VSwipeStack.OnCardSwipeResult.stay;
        }
        nt30Var.m19390Y8(true);
        f857g = true;
        C0079o1.m1687e(aVar.f873b.act(), ((DbObject) aVar.f874c.m17130d()).id, new a(aVar));
        aVar.f872a.m19407c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (f858h || f857g) {
            return false;
        }
        return m1588v(aVar);
    }
}
