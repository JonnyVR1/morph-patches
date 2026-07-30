package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class l83 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f130407a;

    /* JADX INFO: renamed from: b */
    public BoostGuideCardView f130408b;

    /* JADX INFO: renamed from: c */
    public Boolean f130409c;

    /* JADX INFO: renamed from: d */
    public Boolean f130410d;

    public l83(NewNewHomeFrag newNewHomeFrag) {
        Boolean bool = Boolean.FALSE;
        this.f130409c = bool;
        this.f130410d = bool;
        this.f130407a = newNewHomeFrag;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(kec0.f125688X, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (NullChecker.m82486a(this.f130407a) && NullChecker.m82486a(this.f130407a.f22420C)) {
            this.f130407a.f22420C.m38207P2();
            if (view instanceof BoostGuideCardView) {
                BoostGuideCardView boostGuideCardView = (BoostGuideCardView) view;
                this.f130408b = boostGuideCardView;
                boostGuideCardView.m37180f(this.f130407a, this);
            }
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        if (z) {
            boolean zM181583m = ric0.m181583m();
            NewNewHomeFrag newNewHomeFrag = this.f130407a;
            if (zM181583m) {
                C21545y9.m214784c(newNewHomeFrag.act(), false, "p_home,accelerate_card");
            } else {
                v83.m200286f(newNewHomeFrag.act(), false, "p_home,accelerate_card");
            }
        }
        if (!this.f130409c.booleanValue()) {
            i4g0.m138525w("e_boost_card", "p_suggest_users_home_view", jyb.m147494Y("direction", z ? "like" : "dislike"));
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
