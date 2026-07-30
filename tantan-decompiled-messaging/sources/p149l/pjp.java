package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class pjp extends udp {

    /* JADX INFO: renamed from: l.pjp$a */
    public class C19250a implements C7915o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j7h0.C17710a f149854a;

        public C19250a(j7h0.C17710a c17710a) {
            this.f149854a = c17710a;
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        /* JADX INFO: renamed from: a */
        public void mo37598a() {
            this.f149854a.f116599a.m131046B2(true);
            if (this.f149854a.f116600b.m169719e0().isAdded()) {
                this.f149854a.f116600b.m169729m0().mo38801A(SwipeDirection.UP);
            }
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        public void onCancel() {
            this.f149854a.f116599a.m131048C2(false);
            C7915o1.m37714c(this.f149854a.f116600b.m169729m0());
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m169914k(j7h0.C17710a c17710a) {
        jj4 jj4Var;
        if (c17710a == null || (jj4Var = c17710a.f116601c) == null || jj4Var.m141745d() == null) {
            return false;
        }
        User userM141745d = c17710a.f116601c.m141745d();
        return C7915o1.m37715d(new C7915o1.b(userM141745d, c17710a.f116602d, c17710a.f116599a.m131050E1(), c17710a.f116599a.m131047C1(userM141745d.f56011id)));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(j7h0.C17710a c17710a) {
        boolean zM131052F1 = c17710a.f116599a.m131052F1();
        hhp hhpVar = c17710a.f116599a;
        if (zM131052F1) {
            hhpVar.m131072i1();
            return VSwipeStack.OnCardSwipeResult.stay;
        }
        hhpVar.m131048C2(true);
        C7915o1.m37716e(c17710a.f116600b.getAct(), c17710a.f116601c.m141745d().f56011id, new C19250a(c17710a));
        c17710a.f116599a.m131072i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        return m169914k(c17710a);
    }
}
