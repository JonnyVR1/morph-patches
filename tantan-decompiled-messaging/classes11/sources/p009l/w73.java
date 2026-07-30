package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import l.da;
import l.f6c0;
import l.g83;
import l.j760;
import l.lac0;
import l.ool0;
import l.t7m;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w73 implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f21928a;

    /* JADX INFO: renamed from: b */
    public BoostGuideCardView f21929b;

    /* JADX INFO: renamed from: c */
    public Boolean f21930c;

    /* JADX INFO: renamed from: d */
    public Boolean f21931d;

    public w73(NewNewHomeFrag newNewHomeFrag) {
        Boolean bool = Boolean.FALSE;
        this.f21930c = bool;
        this.f21931d = bool;
        this.f21928a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: d */
    public View m23966d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.X, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m23967e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (NullChecker.a(this.f21928a) && NullChecker.a(this.f21928a.f456C)) {
            this.f21928a.f456C.m1172P2();
            if (view instanceof BoostGuideCardView) {
                BoostGuideCardView boostGuideCardView = (BoostGuideCardView) view;
                this.f21929b = boostGuideCardView;
                boostGuideCardView.m78f(this.f21928a, this);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m23968f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m23969g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        if (z) {
            boolean zM = lac0.m();
            NewNewHomeFrag newNewHomeFrag = this.f21928a;
            if (zM) {
                da.c(newNewHomeFrag.act(), false, "p_home,accelerate_card");
            } else {
                g83.f(newNewHomeFrag.act(), false, "p_home,accelerate_card");
            }
        }
        if (!this.f21930c.booleanValue()) {
            zvf0.w("e_boost_card", "p_suggest_users_home_view", new j760[]{vwb.Y("direction", z ? "like" : "dislike")});
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m23964b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m23965c(View view) {
    }
}
