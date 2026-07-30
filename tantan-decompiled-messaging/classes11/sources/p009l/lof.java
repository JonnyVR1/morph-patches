package p009l;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lof implements p3m<C1021a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f16273a;

    /* JADX INFO: renamed from: l.lof$a */
    public static class C1021a implements kzl {

        /* JADX INFO: renamed from: a */
        public Act f16274a;

        /* JADX INFO: renamed from: b */
        public View f16275b;

        /* JADX INFO: renamed from: c */
        public User f16276c;

        /* JADX INFO: renamed from: d */
        public ExploreDialogData f16277d;

        /* JADX INFO: renamed from: e */
        public boolean f16278e;

        /* JADX INFO: renamed from: f */
        public boolean f16279f;

        /* JADX INFO: renamed from: g */
        public String f16280g;

        /* JADX INFO: renamed from: h */
        public boolean f16281h;

        /* JADX INFO: renamed from: i */
        public SwipeDirection f16282i;

        /* JADX INFO: renamed from: j */
        public boolean f16283j;

        /* JADX INFO: renamed from: k */
        public pql f16284k;

        public C1021a(Act act, User user, ExploreDialogData exploreDialogData, boolean z, boolean z2, String str, boolean z3, View view, SwipeDirection swipeDirection, boolean z4, pql pqlVar) {
            this.f16274a = act;
            this.f16276c = user;
            this.f16277d = exploreDialogData;
            this.f16278e = z;
            this.f16279f = z2;
            this.f16280g = str;
            this.f16281h = z3;
            this.f16275b = view;
            this.f16282i = swipeDirection;
            this.f16283j = z4;
            this.f16284k = pqlVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m17971a() {
            return this.f16282i == SwipeDirection.RIGHT;
        }
    }

    public lof() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f16273a = dialogStrategyQueue;
        dialogStrategyQueue.m1377c(new mof());
        this.f16273a.m1377c(new pof());
        this.f16273a.m1377c(new oof());
        this.f16273a.m1377c(new tof());
        this.f16273a.m1377c(new gof());
        this.f16273a.m1377c(new uof());
        this.f16273a.m1377c(new nof());
        this.f16273a.m1377c(new eof());
        this.f16273a.m1379e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C1021a c1021a) {
        for (p3m p3mVar : this.f16273a.m1378d()) {
            if (p3mVar instanceof kof) {
                kof kofVar = (kof) p3mVar;
                if (kofVar.mo1469b(c1021a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = kofVar.mo1468a(c1021a);
                    du2.a("SwipeActionStrategyProxy", "swipeStrategy:" + kofVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo1468a.name());
                    return onCardSwipeResultMo1468a;
                }
            }
        }
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C1021a c1021a) {
        return true;
    }
}
