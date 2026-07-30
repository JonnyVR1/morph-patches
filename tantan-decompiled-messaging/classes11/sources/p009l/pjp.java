package p009l;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pjp extends udp {

    /* JADX INFO: renamed from: l.pjp$a */
    public class C1118a implements C0079o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j7h0.C0970a f18758a;

        public C1118a(j7h0.C0970a c0970a) {
            this.f18758a = c0970a;
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        /* JADX INFO: renamed from: a */
        public void mo1569a() {
            this.f18758a.f14967a.m15788B2(true);
            if (this.f18758a.f14968b.m20403e0().isAdded()) {
                this.f18758a.f14968b.m20414m0().mo2797A(SwipeDirection.UP);
            }
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        public void onCancel() {
            this.f18758a.f14967a.m15790C2(false);
            C0079o1.m1685c(this.f18758a.f14968b.m20414m0());
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m20488k(j7h0.C0970a c0970a) {
        jj4 jj4Var;
        if (c0970a == null || (jj4Var = c0970a.f14969c) == null || jj4Var.m17130d() == null) {
            return false;
        }
        User userM17130d = c0970a.f14969c.m17130d();
        return C0079o1.m1686d(new C0079o1.b(userM17130d, c0970a.f14970d, c0970a.f14967a.m15792E1(), c0970a.f14967a.m15789C1(((DbObject) userM17130d).id)));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(j7h0.C0970a c0970a) {
        boolean zM15794F1 = c0970a.f14967a.m15794F1();
        hhp hhpVar = c0970a.f14967a;
        if (zM15794F1) {
            hhpVar.m15815i1();
            return VSwipeStack.OnCardSwipeResult.stay;
        }
        hhpVar.m15790C2(true);
        C0079o1.m1687e(c0970a.f14968b.act(), ((DbObject) c0970a.f14969c.m17130d()).id, new C1118a(c0970a));
        c0970a.f14967a.m15815i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        return m20488k(c0970a);
    }
}
