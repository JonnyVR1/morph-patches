package p009l;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qph implements p3m<C1150a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f19424a;

    /* JADX INFO: renamed from: l.qph$a */
    public static class C1150a implements kzl {

        /* JADX INFO: renamed from: a */
        public Act f19425a;

        /* JADX INFO: renamed from: b */
        public View f19426b;

        /* JADX INFO: renamed from: c */
        public User f19427c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f19428d;

        /* JADX INFO: renamed from: e */
        public boolean f19429e;

        /* JADX INFO: renamed from: f */
        public C0158d f19430f;

        /* JADX INFO: renamed from: g */
        public frl f19431g;

        public C1150a(Act act, User user, View view, SwipeDirection swipeDirection, boolean z, frl frlVar) {
            this.f19425a = act;
            this.f19427c = user;
            this.f19426b = view;
            this.f19428d = swipeDirection;
            this.f19429e = z;
            this.f19431g = frlVar;
            this.f19430f = mph.m18529a(user, "p_poi_nearby_card", z, swipeDirection);
        }
    }

    public qph() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f19424a = dialogStrategyQueue;
        dialogStrategyQueue.m1377c(new rph());
        this.f19424a.m1377c(new wph());
        this.f19424a.m1377c(new bqh());
        this.f19424a.m1377c(new vph());
        this.f19424a.m1377c(new dqh());
        this.f19424a.m1377c(new aqh());
        this.f19424a.m1377c(new sph());
        this.f19424a.m1379e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C1150a c1150a) {
        for (p3m p3mVar : this.f19424a.m1378d()) {
            if (p3mVar instanceof pph) {
                pph pphVar = (pph) p3mVar;
                if (pphVar.mo1469b(c1150a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = pphVar.mo1468a(c1150a);
                    du2.a("SwipeActionStrategyProxy", "swipeStrategy:" + pphVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo1468a.name());
                    return onCardSwipeResultMo1468a;
                }
            }
        }
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C1150a c1150a) {
        return true;
    }
}
