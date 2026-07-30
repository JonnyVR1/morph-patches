package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.femalevip.FemaleVipGuideCardView;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class uei implements sxl0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f178658a;

    /* JADX INFO: renamed from: b */
    public FemaleVipGuideCardView f178659b;

    /* JADX INFO: renamed from: c */
    public Boolean f178660c = Boolean.FALSE;

    public uei(NewNewHomeFrag newNewHomeFrag) {
        this.f178658a = newNewHomeFrag;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: a */
    public void mo164283a() {
        super.mo164283a();
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(kec0.f125960n3, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (NullChecker.m82486a(this.f178658a) && NullChecker.m82486a(this.f178658a.f22420C)) {
            this.f178658a.f22420C.m38207P2();
            if (view instanceof FemaleVipGuideCardView) {
                FemaleVipGuideCardView femaleVipGuideCardView = (FemaleVipGuideCardView) view;
                this.f178659b = femaleVipGuideCardView;
                femaleVipGuideCardView.m37456f(this.f178658a, this);
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
        String str;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        boolean z = (swipeDirection == swipeDirection2 && xei.m210680c().m210689i()) || swipeDirection == SwipeDirection.UP;
        if (z) {
            C8927c.m54614V(this.f178658a.act(), "p_home,femalevip_card", Privilege.pick_tantan_credits_users);
        }
        if (!this.f178660c.booleanValue()) {
            if (z) {
                str = swipeDirection == swipeDirection2 ? "right" : "up";
            } else {
                str = BLiveGiftBubblePopupTitlePosition.left;
            }
            i4g0.m138525w("e_card_femalevip", "p_suggest_users_home_view", jyb.m147494Y("swipe_directions", str));
        }
        this.f178660c = Boolean.FALSE;
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
