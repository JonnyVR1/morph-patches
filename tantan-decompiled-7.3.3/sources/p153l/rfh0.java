package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;

/* JADX INFO: loaded from: classes11.dex */
public class rfh0 implements g6m<C19824a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f162786a;

    /* JADX INFO: renamed from: l.rfh0$a */
    public static class C19824a implements e2m {

        /* JADX INFO: renamed from: a */
        public hjp f162787a;

        /* JADX INFO: renamed from: b */
        public pkp f162788b;

        /* JADX INFO: renamed from: c */
        public ik4 f162789c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f162790d;

        /* JADX INFO: renamed from: e */
        public boolean f162791e;

        /* JADX INFO: renamed from: f */
        public C8145d f162792f;

        /* JADX INFO: renamed from: g */
        public boolean f162793g = false;

        public C19824a(hjp hjpVar, pkp pkpVar, ik4 ik4Var, SwipeDirection swipeDirection, boolean z) {
            this.f162787a = hjpVar;
            this.f162788b = pkpVar;
            this.f162789c = ik4Var;
            this.f162790d = swipeDirection;
            this.f162791e = z;
            this.f162792f = HomeStatisticsHelper.m37701d(ik4Var, z, hjpVar.f110272i, swipeDirection, pkpVar.m172725m0());
        }
    }

    public rfh0() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f162786a = dialogStrategyQueue;
        dialogStrategyQueue.m38409c(new rkp());
        this.f162786a.m38409c(new dlp());
        this.f162786a.m38409c(new jlp());
        this.f162786a.m38409c(new ilp());
        this.f162786a.m38409c(new zkp());
        this.f162786a.m38409c(new clp());
        this.f162786a.m38409c(new vkp());
        this.f162786a.m38409c(new olp());
        this.f162786a.m38409c(new hlp());
        this.f162786a.m38409c(new plp());
        this.f162786a.m38409c(new skp());
        this.f162786a.m38411e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C19824a c19824a) {
        for (g6m g6mVar : this.f162786a.m38410d()) {
            if (g6mVar instanceof ufp) {
                ufp ufpVar = (ufp) g6mVar;
                if (ufpVar.mo38501b(c19824a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = ufpVar.mo38500a(c19824a);
                    tu2.m192703a("SwipeActionThemeSlideStrategyProxy", "swipeStrategy:" + ufpVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo38500a.name());
                    return onCardSwipeResultMo38500a;
                }
            }
        }
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C19824a c19824a) {
        return true;
    }
}
