package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class frh implements g6m<C17047a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f100419a;

    /* JADX INFO: renamed from: l.frh$a */
    public static class C17047a implements e2m {

        /* JADX INFO: renamed from: a */
        public Act f100420a;

        /* JADX INFO: renamed from: b */
        public View f100421b;

        /* JADX INFO: renamed from: c */
        public User f100422c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f100423d;

        /* JADX INFO: renamed from: e */
        public boolean f100424e;

        /* JADX INFO: renamed from: f */
        public C8145d f100425f;

        /* JADX INFO: renamed from: g */
        public ttl f100426g;

        public C17047a(Act act, User user, View view, SwipeDirection swipeDirection, boolean z, ttl ttlVar) {
            this.f100420a = act;
            this.f100422c = user;
            this.f100421b = view;
            this.f100423d = swipeDirection;
            this.f100424e = z;
            this.f100426g = ttlVar;
            this.f100425f = brh.m106136a(user, "p_poi_nearby_card", z, swipeDirection);
        }
    }

    public frh() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f100419a = dialogStrategyQueue;
        dialogStrategyQueue.m38409c(new grh());
        this.f100419a.m38409c(new lrh());
        this.f100419a.m38409c(new qrh());
        this.f100419a.m38409c(new krh());
        this.f100419a.m38409c(new srh());
        this.f100419a.m38409c(new prh());
        this.f100419a.m38409c(new hrh());
        this.f100419a.m38411e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C17047a c17047a) {
        for (g6m g6mVar : this.f100419a.m38410d()) {
            if (g6mVar instanceof erh) {
                erh erhVar = (erh) g6mVar;
                if (erhVar.mo38501b(c17047a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = erhVar.mo38500a(c17047a);
                    tu2.m192703a("SwipeActionStrategyProxy", "swipeStrategy:" + erhVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo38500a.name());
                    return onCardSwipeResultMo38500a;
                }
            }
        }
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C17047a c17047a) {
        return true;
    }
}
