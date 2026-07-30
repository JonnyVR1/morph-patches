package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class spf implements g6m<C20128a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f170038a;

    /* JADX INFO: renamed from: l.spf$a */
    public static class C20128a implements e2m {

        /* JADX INFO: renamed from: a */
        public Act f170039a;

        /* JADX INFO: renamed from: b */
        public View f170040b;

        /* JADX INFO: renamed from: c */
        public User f170041c;

        /* JADX INFO: renamed from: d */
        public ExploreDialogData f170042d;

        /* JADX INFO: renamed from: e */
        public boolean f170043e;

        /* JADX INFO: renamed from: f */
        public boolean f170044f;

        /* JADX INFO: renamed from: g */
        public String f170045g;

        /* JADX INFO: renamed from: h */
        public boolean f170046h;

        /* JADX INFO: renamed from: i */
        public SwipeDirection f170047i;

        /* JADX INFO: renamed from: j */
        public boolean f170048j;

        /* JADX INFO: renamed from: k */
        public btl f170049k;

        public C20128a(Act act, User user, ExploreDialogData exploreDialogData, boolean z, boolean z2, String str, boolean z3, View view, SwipeDirection swipeDirection, boolean z4, btl btlVar) {
            this.f170039a = act;
            this.f170041c = user;
            this.f170042d = exploreDialogData;
            this.f170043e = z;
            this.f170044f = z2;
            this.f170045g = str;
            this.f170046h = z3;
            this.f170040b = view;
            this.f170047i = swipeDirection;
            this.f170048j = z4;
            this.f170049k = btlVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m187342a() {
            return this.f170047i == SwipeDirection.RIGHT;
        }
    }

    public spf() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f170038a = dialogStrategyQueue;
        dialogStrategyQueue.m38409c(new tpf());
        this.f170038a.m38409c(new wpf());
        this.f170038a.m38409c(new vpf());
        this.f170038a.m38409c(new aqf());
        this.f170038a.m38409c(new npf());
        this.f170038a.m38409c(new bqf());
        this.f170038a.m38409c(new upf());
        this.f170038a.m38409c(new lpf());
        this.f170038a.m38411e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C20128a c20128a) {
        for (g6m g6mVar : this.f170038a.m38410d()) {
            if (g6mVar instanceof rpf) {
                rpf rpfVar = (rpf) g6mVar;
                if (rpfVar.mo38501b(c20128a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = rpfVar.mo38500a(c20128a);
                    tu2.m192703a("SwipeActionStrategyProxy", "swipeStrategy:" + rpfVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo38500a.name());
                    return onCardSwipeResultMo38500a;
                }
            }
        }
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C20128a c20128a) {
        return true;
    }
}
