package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;

/* JADX INFO: loaded from: classes11.dex */
public class k7h0 implements p3m<C17941a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f121579a;

    /* JADX INFO: renamed from: l.k7h0$a */
    public static class C17941a implements kzl {

        /* JADX INFO: renamed from: a */
        public dcl f121580a;

        /* JADX INFO: renamed from: b */
        public idl f121581b;

        /* JADX INFO: renamed from: c */
        public jj4 f121582c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f121583d;

        /* JADX INFO: renamed from: e */
        public boolean f121584e;

        /* JADX INFO: renamed from: f */
        public C7994d f121585f;

        /* JADX INFO: renamed from: g */
        public boolean f121586g = false;

        public C17941a(dcl dclVar, idl idlVar, jj4 jj4Var, SwipeDirection swipeDirection, boolean z) {
            this.f121580a = dclVar;
            this.f121581b = idlVar;
            this.f121582c = jj4Var;
            this.f121583d = swipeDirection;
            this.f121584e = z;
            this.f121585f = HomeStatisticsHelper.m36698d(jj4Var, z, dclVar.f85458g, swipeDirection, idlVar.m135582r0());
        }
    }

    public k7h0() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f121579a = dialogStrategyQueue;
        dialogStrategyQueue.m37406c(new fli0());
        this.f121579a.m37406c(new kli0());
        this.f121579a.m37406c(new pli0());
        this.f121579a.m37406c(new jli0());
        this.f121579a.m37406c(new rli0());
        this.f121579a.m37406c(new oli0());
        this.f121579a.m37406c(new gli0());
        this.f121579a.m37408e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C17941a c17941a) {
        for (p3m p3mVar : this.f121579a.m37407d()) {
            if (p3mVar instanceof cli0) {
                cli0 cli0Var = (cli0) p3mVar;
                if (cli0Var.mo37498b(c17941a)) {
                    VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = cli0Var.mo37497a(c17941a);
                    du2.m113670a("SwipeActionThemeSlideStrategyProxy", "swipeStrategy:" + cli0Var.getClass().getName() + " OnCardSwipeResult: " + onCardSwipeResultMo37497a.name());
                    return onCardSwipeResultMo37497a;
                }
            }
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C17941a c17941a) {
        return true;
    }
}
