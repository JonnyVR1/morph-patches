package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;

/* JADX INFO: loaded from: classes11.dex */
public class j7h0 implements p3m<C17710a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f116598a;

    /* JADX INFO: renamed from: l.j7h0$a */
    public static class C17710a implements kzl {

        /* JADX INFO: renamed from: a */
        public hhp f116599a;

        /* JADX INFO: renamed from: b */
        public pip f116600b;

        /* JADX INFO: renamed from: c */
        public jj4 f116601c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f116602d;

        /* JADX INFO: renamed from: e */
        public boolean f116603e;

        /* JADX INFO: renamed from: f */
        public C7994d f116604f;

        /* JADX INFO: renamed from: g */
        public boolean f116605g = false;

        public C17710a(hhp hhpVar, pip pipVar, jj4 jj4Var, SwipeDirection swipeDirection, boolean z) {
            this.f116599a = hhpVar;
            this.f116600b = pipVar;
            this.f116601c = jj4Var;
            this.f116602d = swipeDirection;
            this.f116603e = z;
            this.f116604f = HomeStatisticsHelper.m36698d(jj4Var, z, hhpVar.f107754i, swipeDirection, pipVar.m169729m0());
        }
    }

    public j7h0() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f116598a = dialogStrategyQueue;
        dialogStrategyQueue.m37406c(new rip());
        this.f116598a.m37406c(new djp());
        this.f116598a.m37406c(new jjp());
        this.f116598a.m37406c(new ijp());
        this.f116598a.m37406c(new zip());
        this.f116598a.m37406c(new cjp());
        this.f116598a.m37406c(new vip());
        this.f116598a.m37406c(new ojp());
        this.f116598a.m37406c(new hjp());
        this.f116598a.m37406c(new pjp());
        this.f116598a.m37406c(new sip());
        this.f116598a.m37408e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C17710a c17710a) {
        for (p3m p3mVar : this.f116598a.m37407d()) {
            if (p3mVar instanceof udp) {
                udp udpVar = (udp) p3mVar;
                if (udpVar.mo37498b(c17710a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = udpVar.mo37497a(c17710a);
                    du2.m113670a("SwipeActionThemeSlideStrategyProxy", "swipeStrategy:" + udpVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo37497a.name());
                    return onCardSwipeResultMo37497a;
                }
            }
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C17710a c17710a) {
        return true;
    }
}
