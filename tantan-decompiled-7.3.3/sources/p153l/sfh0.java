package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;

/* JADX INFO: loaded from: classes11.dex */
public class sfh0 implements g6m<C20031a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f167701a;

    /* JADX INFO: renamed from: l.sfh0$a */
    public static class C20031a implements e2m {

        /* JADX INFO: renamed from: a */
        public tel f167702a;

        /* JADX INFO: renamed from: b */
        public yfl f167703b;

        /* JADX INFO: renamed from: c */
        public ik4 f167704c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f167705d;

        /* JADX INFO: renamed from: e */
        public boolean f167706e;

        /* JADX INFO: renamed from: f */
        public C8145d f167707f;

        /* JADX INFO: renamed from: g */
        public boolean f167708g = false;

        public C20031a(tel telVar, yfl yflVar, ik4 ik4Var, SwipeDirection swipeDirection, boolean z) {
            this.f167702a = telVar;
            this.f167703b = yflVar;
            this.f167704c = ik4Var;
            this.f167705d = swipeDirection;
            this.f167706e = z;
            this.f167707f = HomeStatisticsHelper.m37701d(ik4Var, z, telVar.f173861g, swipeDirection, yflVar.m215735r0());
        }
    }

    public sfh0() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f167701a = dialogStrategyQueue;
        dialogStrategyQueue.m38409c(new fui0());
        this.f167701a.m38409c(new kui0());
        this.f167701a.m38409c(new pui0());
        this.f167701a.m38409c(new jui0());
        this.f167701a.m38409c(new rui0());
        this.f167701a.m38409c(new oui0());
        this.f167701a.m38409c(new gui0());
        this.f167701a.m38411e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C20031a c20031a) {
        for (g6m g6mVar : this.f167701a.m38410d()) {
            if (g6mVar instanceof cui0) {
                cui0 cui0Var = (cui0) g6mVar;
                if (cui0Var.mo38501b(c20031a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = cui0Var.mo38500a(c20031a);
                    tu2.m192703a("SwipeActionThemeSlideStrategyProxy", "swipeStrategy:" + cui0Var.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo38500a.name());
                    return onCardSwipeResultMo38500a;
                }
            }
        }
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C20031a c20031a) {
        return true;
    }
}
