package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import com.p1.mobile.putong.live.base.view.EmptyView;
import l.jfd0;
import p002l.zi2;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zjs<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f23455e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f23456f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f23457g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f23458h;

    /* JADX INFO: renamed from: i */
    public VText f23459i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f23460j;

    /* JADX INFO: renamed from: k */
    public VText f23461k;

    /* JADX INFO: renamed from: l */
    public GiftSuitItemView f23462l;

    /* JADX INFO: renamed from: m */
    public GiftSuitItemView f23463m;

    /* JADX INFO: renamed from: n */
    public GiftSuitItemView f23464n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f23465o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f23466p;

    /* JADX INFO: renamed from: q */
    public View f23467q;

    /* JADX INFO: renamed from: r */
    public EmptyView f23468r;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19493D1, viewGroup, false);
        m27399u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m27399u(ViewGroup viewGroup) {
        this.f23455e = (ConstraintLayout) viewGroup;
        ConstraintLayout childAt = viewGroup.getChildAt(0);
        this.f23456f = childAt;
        String str = childAt == null ? "_content" : null;
        VDraweeView childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f23457g = childAt2;
        if (childAt2 == null) {
            str = "_rules";
        }
        VDraweeView childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f23458h = childAt3;
        if (childAt3 == null) {
            str = "_count_down_bg";
        }
        VText childAt4 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f23459i = childAt4;
        if (childAt4 == null) {
            str = "_count_down";
        }
        VDraweeView childAt5 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f23460j = childAt5;
        if (childAt5 == null) {
            str = "_suit_hint_bg";
        }
        VText childAt6 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        this.f23461k = childAt6;
        if (childAt6 == null) {
            str = "_suit_hint";
        }
        GiftSuitItemView giftSuitItemView = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        this.f23462l = giftSuitItemView;
        if (giftSuitItemView == null) {
            str = "_suit_item_1";
        }
        GiftSuitItemView giftSuitItemView2 = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        this.f23463m = giftSuitItemView2;
        if (giftSuitItemView2 == null) {
            str = "_suit_item_2";
        }
        GiftSuitItemView giftSuitItemView3 = (GiftSuitItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        this.f23464n = giftSuitItemView3;
        if (giftSuitItemView3 == null) {
            str = "_suit_item_3";
        }
        VDraweeView childAt7 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        this.f23465o = childAt7;
        if (childAt7 == null) {
            str = "_reward_bg";
        }
        VDraweeView childAt8 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        this.f23466p = childAt8;
        if (childAt8 == null) {
            str = "_reward_icon";
        }
        View childAt9 = viewGroup.getChildAt(1);
        this.f23467q = childAt9;
        if (childAt9 == null) {
            str = "_safe_area_view";
        }
        EmptyView childAt10 = viewGroup.getChildAt(2);
        this.f23468r = childAt10;
        if (childAt10 == null) {
            str = "_empty";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public ConstraintLayout m27400v() {
        return this.f23455e;
    }
}
