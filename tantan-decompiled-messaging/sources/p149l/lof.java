package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class lof implements p3m<C18270a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f129090a;

    /* JADX INFO: renamed from: l.lof$a */
    public static class C18270a implements kzl {

        /* JADX INFO: renamed from: a */
        public Act f129091a;

        /* JADX INFO: renamed from: b */
        public View f129092b;

        /* JADX INFO: renamed from: c */
        public User f129093c;

        /* JADX INFO: renamed from: d */
        public ExploreDialogData f129094d;

        /* JADX INFO: renamed from: e */
        public boolean f129095e;

        /* JADX INFO: renamed from: f */
        public boolean f129096f;

        /* JADX INFO: renamed from: g */
        public String f129097g;

        /* JADX INFO: renamed from: h */
        public boolean f129098h;

        /* JADX INFO: renamed from: i */
        public SwipeDirection f129099i;

        /* JADX INFO: renamed from: j */
        public boolean f129100j;

        /* JADX INFO: renamed from: k */
        public pql f129101k;

        public C18270a(Act act, User user, ExploreDialogData exploreDialogData, boolean z, boolean z2, String str, boolean z3, View view, SwipeDirection swipeDirection, boolean z4, pql pqlVar) {
            this.f129091a = act;
            this.f129093c = user;
            this.f129094d = exploreDialogData;
            this.f129095e = z;
            this.f129096f = z2;
            this.f129097g = str;
            this.f129098h = z3;
            this.f129092b = view;
            this.f129099i = swipeDirection;
            this.f129100j = z4;
            this.f129101k = pqlVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m150772a() {
            return this.f129099i == SwipeDirection.RIGHT;
        }
    }

    public lof() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f129090a = dialogStrategyQueue;
        dialogStrategyQueue.m37406c(new mof());
        this.f129090a.m37406c(new pof());
        this.f129090a.m37406c(new oof());
        this.f129090a.m37406c(new tof());
        this.f129090a.m37406c(new gof());
        this.f129090a.m37406c(new uof());
        this.f129090a.m37406c(new nof());
        this.f129090a.m37406c(new eof());
        this.f129090a.m37408e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C18270a c18270a) {
        for (p3m p3mVar : this.f129090a.m37407d()) {
            if (p3mVar instanceof kof) {
                kof kofVar = (kof) p3mVar;
                if (kofVar.mo37498b(c18270a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = kofVar.mo37497a(c18270a);
                    du2.m113670a("SwipeActionStrategyProxy", "swipeStrategy:" + kofVar.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo37497a.name());
                    return onCardSwipeResultMo37497a;
                }
            }
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C18270a c18270a) {
        return true;
    }
}
