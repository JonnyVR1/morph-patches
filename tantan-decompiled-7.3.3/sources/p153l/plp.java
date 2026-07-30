package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class plp extends ufp {

    /* JADX INFO: renamed from: l.plp$a */
    public class C19395a implements C8066o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rfh0.C19824a f153053a;

        public C19395a(rfh0.C19824a c19824a) {
            this.f153053a = c19824a;
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        /* JADX INFO: renamed from: a */
        public void mo38601a() {
            this.f153053a.f162787a.m135450B2(true);
            if (this.f153053a.f162788b.m172715e0().isAdded()) {
                this.f153053a.f162788b.m172725m0().mo39804A(SwipeDirection.UP);
            }
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        public void onCancel() {
            this.f153053a.f162787a.m135452C2(false);
            C8066o1.m38717c(this.f153053a.f162788b.m172725m0());
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m172841k(rfh0.C19824a c19824a) {
        ik4 ik4Var;
        if (c19824a == null || (ik4Var = c19824a.f162789c) == null || ik4Var.m140259d() == null) {
            return false;
        }
        User userM140259d = c19824a.f162789c.m140259d();
        return C8066o1.m38718d(new C8066o1.b(userM140259d, c19824a.f162790d, c19824a.f162787a.m135454E1(), c19824a.f162787a.m135451C1(userM140259d.f56859id)));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(rfh0.C19824a c19824a) {
        boolean zM135456F1 = c19824a.f162787a.m135456F1();
        hjp hjpVar = c19824a.f162787a;
        if (zM135456F1) {
            hjpVar.m135476i1();
            return VSwipeStack.OnCardSwipeResult.stay;
        }
        hjpVar.m135452C2(true);
        C8066o1.m38719e(c19824a.f162788b.getAct(), c19824a.f162789c.m140259d().f56859id, new C19395a(c19824a));
        c19824a.f162787a.m135476i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        return m172841k(c19824a);
    }
}
