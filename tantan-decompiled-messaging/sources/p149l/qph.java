package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class qph implements p3m<C19553a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f155756a;

    /* JADX INFO: renamed from: l.qph$a */
    public static class C19553a implements kzl {

        /* JADX INFO: renamed from: a */
        public Act f155757a;

        /* JADX INFO: renamed from: b */
        public View f155758b;

        /* JADX INFO: renamed from: c */
        public User f155759c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f155760d;

        /* JADX INFO: renamed from: e */
        public boolean f155761e;

        /* JADX INFO: renamed from: f */
        public C7994d f155762f;

        /* JADX INFO: renamed from: g */
        public frl f155763g;

        public C19553a(Act act, User user, View view, SwipeDirection swipeDirection, boolean z, frl frlVar) {
            this.f155757a = act;
            this.f155759c = user;
            this.f155758b = view;
            this.f155760d = swipeDirection;
            this.f155761e = z;
            this.f155763g = frlVar;
            this.f155762f = mph.m155805a(user, "p_poi_nearby_card", z, swipeDirection);
        }
    }

    public qph() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f155756a = dialogStrategyQueue;
        dialogStrategyQueue.m37406c(new rph());
        this.f155756a.m37406c(new wph());
        this.f155756a.m37406c(new bqh());
        this.f155756a.m37406c(new vph());
        this.f155756a.m37406c(new dqh());
        this.f155756a.m37406c(new aqh());
        this.f155756a.m37406c(new sph());
        this.f155756a.m37408e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C19553a c19553a) {
        for (p3m p3mVar : this.f155756a.m37407d()) {
            if (p3mVar instanceof pph) {
                pph pphVar = (pph) p3mVar;
                if (pphVar.mo37498b(c19553a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = pphVar.mo37497a(c19553a);
                    du2.m113670a("SwipeActionStrategyProxy", "swipeStrategy:" + pphVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo37497a.name());
                    return onCardSwipeResultMo37497a;
                }
            }
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C19553a c19553a) {
        return true;
    }
}
