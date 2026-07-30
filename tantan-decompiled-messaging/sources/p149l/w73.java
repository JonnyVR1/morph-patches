package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class w73 implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f185017a;

    /* JADX INFO: renamed from: b */
    public BoostGuideCardView f185018b;

    /* JADX INFO: renamed from: c */
    public Boolean f185019c;

    /* JADX INFO: renamed from: d */
    public Boolean f185020d;

    public w73(NewNewHomeFrag newNewHomeFrag) {
        Boolean bool = Boolean.FALSE;
        this.f185019c = bool;
        this.f185020d = bool;
        this.f185017a = newNewHomeFrag;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f95634X, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (NullChecker.m81303a(this.f185017a) && NullChecker.m81303a(this.f185017a.f21678C)) {
            this.f185017a.f21678C.m37204P2();
            if (view instanceof BoostGuideCardView) {
                BoostGuideCardView boostGuideCardView = (BoostGuideCardView) view;
                this.f185018b = boostGuideCardView;
                boostGuideCardView.m36177f(this.f185017a, this);
            }
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        if (z) {
            boolean zM149136m = lac0.m149136m();
            NewNewHomeFrag newNewHomeFrag = this.f185017a;
            if (zM149136m) {
                C16319da.m110497c(newNewHomeFrag.act(), false, "p_home,accelerate_card");
            } else {
                g83.m124743f(newNewHomeFrag.act(), false, "p_home,accelerate_card");
            }
        }
        if (!this.f185019c.booleanValue()) {
            zvf0.m220401w("e_boost_card", "p_suggest_users_home_view", vwb.m200311Y("direction", z ? "like" : "dislike"));
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
