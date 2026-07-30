package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class zjs<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f203465e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f203466f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f203467g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f203468h;

    /* JADX INFO: renamed from: i */
    public VText f203469i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f203470j;

    /* JADX INFO: renamed from: k */
    public VText f203471k;

    /* JADX INFO: renamed from: l */
    public GiftSuitItemView f203472l;

    /* JADX INFO: renamed from: m */
    public GiftSuitItemView f203473m;

    /* JADX INFO: renamed from: n */
    public GiftSuitItemView f203474n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f203475o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f203476p;

    /* JADX INFO: renamed from: q */
    public View f203477q;

    /* JADX INFO: renamed from: r */
    public EmptyView f203478r;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167997D1, viewGroup, false);
        m219147u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m219147u(ViewGroup viewGroup) {
        this.f203465e = (ConstraintLayout) viewGroup;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.getChildAt(0);
        this.f203466f = constraintLayout;
        String str = constraintLayout == null ? "_content" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f203467g = vDraweeView;
        if (vDraweeView == null) {
            str = "_rules";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f203468h = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_count_down_bg";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f203469i = vText;
        if (vText == null) {
            str = "_count_down";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f203470j = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_suit_hint_bg";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        this.f203471k = vText2;
        if (vText2 == null) {
            str = "_suit_hint";
        }
        GiftSuitItemView giftSuitItemView = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        this.f203472l = giftSuitItemView;
        if (giftSuitItemView == null) {
            str = "_suit_item_1";
        }
        GiftSuitItemView giftSuitItemView2 = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        this.f203473m = giftSuitItemView2;
        if (giftSuitItemView2 == null) {
            str = "_suit_item_2";
        }
        GiftSuitItemView giftSuitItemView3 = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        this.f203474n = giftSuitItemView3;
        if (giftSuitItemView3 == null) {
            str = "_suit_item_3";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        this.f203475o = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_reward_bg";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        this.f203476p = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_reward_icon";
        }
        View childAt = viewGroup.getChildAt(1);
        this.f203477q = childAt;
        if (childAt == null) {
            str = "_safe_area_view";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(2);
        this.f203478r = emptyView;
        if (emptyView == null) {
            str = "_empty";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public ConstraintLayout m219148v() {
        return this.f203465e;
    }
}
