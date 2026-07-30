package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.femalevip.FemaleVipGuideCardView;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class fdi implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f97047a;

    /* JADX INFO: renamed from: b */
    public FemaleVipGuideCardView f97048b;

    /* JADX INFO: renamed from: c */
    public Boolean f97049c = Boolean.FALSE;

    public fdi(NewNewHomeFrag newNewHomeFrag) {
        this.f97047a = newNewHomeFrag;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: a */
    public void mo120980a() {
        super.mo120980a();
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f95906n3, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (NullChecker.m81303a(this.f97047a) && NullChecker.m81303a(this.f97047a.f21678C)) {
            this.f97047a.f21678C.m37204P2();
            if (view instanceof FemaleVipGuideCardView) {
                FemaleVipGuideCardView femaleVipGuideCardView = (FemaleVipGuideCardView) view;
                this.f97048b = femaleVipGuideCardView;
                femaleVipGuideCardView.m36453f(this.f97047a, this);
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
        String str;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z = (swipeDirection == swipeDirection2 && idi.m135447c().m135456i()) || swipeDirection == SwipeDirection.UP;
        if (z) {
            C8764c.m53431V(this.f97047a.act(), "p_home,femalevip_card", Privilege.pick_tantan_credits_users);
        }
        if (!this.f97049c.booleanValue()) {
            if (z) {
                str = swipeDirection == swipeDirection2 ? "right" : "up";
            } else {
                str = BLiveGiftBubblePopupTitlePosition.left;
            }
            zvf0.m220401w("e_card_femalevip", "p_suggest_users_home_view", vwb.m200311Y("swipe_directions", str));
        }
        this.f97049c = Boolean.FALSE;
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
