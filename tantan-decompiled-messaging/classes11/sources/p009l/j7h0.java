package p009l;

import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class j7h0 implements p3m<C0970a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f14966a;

    /* JADX INFO: renamed from: l.j7h0$a */
    public static class C0970a implements kzl {

        /* JADX INFO: renamed from: a */
        public hhp f14967a;

        /* JADX INFO: renamed from: b */
        public pip f14968b;

        /* JADX INFO: renamed from: c */
        public jj4 f14969c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f14970d;

        /* JADX INFO: renamed from: e */
        public boolean f14971e;

        /* JADX INFO: renamed from: f */
        public C0158d f14972f;

        /* JADX INFO: renamed from: g */
        public boolean f14973g = false;

        public C0970a(hhp hhpVar, pip pipVar, jj4 jj4Var, SwipeDirection swipeDirection, boolean z) {
            this.f14967a = hhpVar;
            this.f14968b = pipVar;
            this.f14969c = jj4Var;
            this.f14970d = swipeDirection;
            this.f14971e = z;
            this.f14972f = HomeStatisticsHelper.m647d(jj4Var, z, hhpVar.f14109i, swipeDirection, pipVar.m20414m0());
        }
    }

    public j7h0() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f14966a = dialogStrategyQueue;
        dialogStrategyQueue.m1377c(new rip());
        this.f14966a.m1377c(new djp());
        this.f14966a.m1377c(new jjp());
        this.f14966a.m1377c(new ijp());
        this.f14966a.m1377c(new zip());
        this.f14966a.m1377c(new cjp());
        this.f14966a.m1377c(new vip());
        this.f14966a.m1377c(new ojp());
        this.f14966a.m1377c(new hjp());
        this.f14966a.m1377c(new pjp());
        this.f14966a.m1377c(new sip());
        this.f14966a.m1379e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0970a c0970a) {
        for (p3m p3mVar : this.f14966a.m1378d()) {
            if (p3mVar instanceof udp) {
                udp udpVar = (udp) p3mVar;
                if (udpVar.mo1469b(c0970a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = udpVar.mo1468a(c0970a);
                    du2.a("SwipeActionThemeSlideStrategyProxy", "swipeStrategy:" + udpVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo1468a.name());
                    return onCardSwipeResultMo1468a;
                }
            }
        }
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0970a c0970a) {
        return true;
    }
}
