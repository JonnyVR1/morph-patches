package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.User;
import p153l.b240;
import p153l.ik4;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8039f1 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public static volatile boolean f22821g = false;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f22822h = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f1$a */
    public class a implements C8066o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8049j.a f22823a;

        public a(C8049j.a aVar) {
            this.f22823a = aVar;
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        /* JADX INFO: renamed from: a */
        public void mo38601a() {
            C8039f1.f22822h = true;
            C8039f1.f22821g = false;
            this.f22823a.f22836a.m101975X8(true);
            if (this.f22823a.f22837b.m38344q2().isAdded()) {
                this.f22823a.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
            }
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        public void onCancel() {
            C8039f1.f22821g = false;
            this.f22823a.f22836a.m101980Y8(false);
            C8066o1.m38717c(this.f22823a.f22837b.m38128A2());
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m38618s() {
        return f22822h;
    }

    /* JADX INFO: renamed from: t */
    public static void m38619t() {
        f22822h = false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m38620v(C8049j.a aVar) {
        ik4 ik4Var;
        if (aVar == null || (ik4Var = aVar.f22838c) == null || ik4Var.m140259d() == null) {
            return false;
        }
        User userM140259d = aVar.f22838c.m140259d();
        return C8066o1.m38718d(new C8066o1.b(userM140259d, aVar.f22839d, aVar.f22836a.m102056p6(), aVar.f22836a.m102029j6(userM140259d.f56859id)));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        boolean zM102060q6 = aVar.f22836a.m102060q6();
        b240 b240Var = aVar.f22836a;
        if (zM102060q6) {
            b240Var.m101995c5();
            return VSwipeStack.OnCardSwipeResult.stay;
        }
        b240Var.m101980Y8(true);
        f22821g = true;
        C8066o1.m38719e(aVar.f22837b.act(), aVar.f22838c.m140259d().f56859id, new a(aVar));
        aVar.f22836a.m101995c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (f22822h || f22821g) {
            return false;
        }
        return m38620v(aVar);
    }
}
