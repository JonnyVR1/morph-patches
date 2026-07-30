package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.femalevip.FemaleVipGuideCardView;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.tantanapp.common.utils.NullChecker;
import l.f6c0;
import l.j760;
import l.ool0;
import l.t7m;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fdi implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f12945a;

    /* JADX INFO: renamed from: b */
    public FemaleVipGuideCardView f12946b;

    /* JADX INFO: renamed from: c */
    public Boolean f12947c = Boolean.FALSE;

    public fdi(NewNewHomeFrag newNewHomeFrag) {
        this.f12945a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: a */
    public void m14383a() {
        super.a();
    }

    /* JADX INFO: renamed from: d */
    public View m14386d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.n3, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m14387e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (NullChecker.a(this.f12945a) && NullChecker.a(this.f12945a.f456C)) {
            this.f12945a.f456C.m1172P2();
            if (view instanceof FemaleVipGuideCardView) {
                FemaleVipGuideCardView femaleVipGuideCardView = (FemaleVipGuideCardView) view;
                this.f12946b = femaleVipGuideCardView;
                femaleVipGuideCardView.m382f(this.f12945a, this);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m14388f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m14389g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z = (swipeDirection == swipeDirection2 && idi.m16341c().m16350i()) || swipeDirection == SwipeDirection.UP;
        if (z) {
            c.V(this.f12945a.act(), "p_home,femalevip_card", Privilege.pick_tantan_credits_users);
        }
        if (!this.f12947c.booleanValue()) {
            if (z) {
                str = swipeDirection == swipeDirection2 ? "right" : "up";
            } else {
                str = "left";
            }
            zvf0.w("e_card_femalevip", "p_suggest_users_home_view", new j760[]{vwb.Y("swipe_directions", str)});
        }
        this.f12947c = Boolean.FALSE;
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m14384b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m14385c(View view) {
    }
}
