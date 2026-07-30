package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class ams<P extends hj2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f72258e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f72259f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f72260g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f72261h;

    /* JADX INFO: renamed from: i */
    public VText f72262i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f72263j;

    /* JADX INFO: renamed from: k */
    public VText f72264k;

    /* JADX INFO: renamed from: l */
    public GiftSuitItemView f72265l;

    /* JADX INFO: renamed from: m */
    public GiftSuitItemView f72266m;

    /* JADX INFO: renamed from: n */
    public GiftSuitItemView f72267n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f72268o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f72269p;

    /* JADX INFO: renamed from: q */
    public View f72270q;

    /* JADX INFO: renamed from: r */
    public EmptyView f72271r;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198729D1, viewGroup, false);
        m98854u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m98854u(ViewGroup viewGroup) {
        this.f72258e = (ConstraintLayout) viewGroup;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.getChildAt(0);
        this.f72259f = constraintLayout;
        String str = constraintLayout == null ? "_content" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f72260g = vDraweeView;
        if (vDraweeView == null) {
            str = "_rules";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f72261h = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_count_down_bg";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f72262i = vText;
        if (vText == null) {
            str = "_count_down";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f72263j = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_suit_hint_bg";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        this.f72264k = vText2;
        if (vText2 == null) {
            str = "_suit_hint";
        }
        GiftSuitItemView giftSuitItemView = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        this.f72265l = giftSuitItemView;
        if (giftSuitItemView == null) {
            str = "_suit_item_1";
        }
        GiftSuitItemView giftSuitItemView2 = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        this.f72266m = giftSuitItemView2;
        if (giftSuitItemView2 == null) {
            str = "_suit_item_2";
        }
        GiftSuitItemView giftSuitItemView3 = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        this.f72267n = giftSuitItemView3;
        if (giftSuitItemView3 == null) {
            str = "_suit_item_3";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        this.f72268o = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_reward_bg";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        this.f72269p = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_reward_icon";
        }
        View childAt = viewGroup.getChildAt(1);
        this.f72270q = childAt;
        if (childAt == null) {
            str = "_safe_area_view";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(2);
        this.f72271r = emptyView;
        if (emptyView == null) {
            str = "_empty";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public ConstraintLayout m98855v() {
        return this.f72258e;
    }
}
