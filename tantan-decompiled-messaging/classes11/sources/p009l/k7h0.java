package p009l;

import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k7h0 implements p3m<C0984a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f15440a;

    /* JADX INFO: renamed from: l.k7h0$a */
    public static class C0984a implements kzl {

        /* JADX INFO: renamed from: a */
        public dcl f15441a;

        /* JADX INFO: renamed from: b */
        public idl f15442b;

        /* JADX INFO: renamed from: c */
        public jj4 f15443c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f15444d;

        /* JADX INFO: renamed from: e */
        public boolean f15445e;

        /* JADX INFO: renamed from: f */
        public C0158d f15446f;

        /* JADX INFO: renamed from: g */
        public boolean f15447g = false;

        public C0984a(dcl dclVar, idl idlVar, jj4 jj4Var, SwipeDirection swipeDirection, boolean z) {
            this.f15441a = dclVar;
            this.f15442b = idlVar;
            this.f15443c = jj4Var;
            this.f15444d = swipeDirection;
            this.f15445e = z;
            this.f15446f = HomeStatisticsHelper.m647d(jj4Var, z, dclVar.f11746g, swipeDirection, idlVar.m16475r0());
        }
    }

    public k7h0() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f15440a = dialogStrategyQueue;
        dialogStrategyQueue.m1377c(new fli0());
        this.f15440a.m1377c(new kli0());
        this.f15440a.m1377c(new pli0());
        this.f15440a.m1377c(new jli0());
        this.f15440a.m1377c(new rli0());
        this.f15440a.m1377c(new oli0());
        this.f15440a.m1377c(new gli0());
        this.f15440a.m1379e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0984a c0984a) {
        for (p3m p3mVar : this.f15440a.m1378d()) {
            if (p3mVar instanceof cli0) {
                cli0 cli0Var = (cli0) p3mVar;
                if (cli0Var.mo1469b(c0984a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = cli0Var.mo1468a(c0984a);
                    du2.a("SwipeActionThemeSlideStrategyProxy", "swipeStrategy:" + cli0Var.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo1468a.name());
                    return onCardSwipeResultMo1468a;
                }
            }
        }
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0984a c0984a) {
        return true;
    }
}
