package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import com.p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import l.jfd0;
import p002l.zi2;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y0v<P extends zi2> extends BaseDialogHolder<P, BLiveAuctionAsset> {

    /* JADX INFO: renamed from: A */
    public VDraweeView f22567A;

    /* JADX INFO: renamed from: B */
    public TextView f22568B;

    /* JADX INFO: renamed from: C */
    public TextView f22569C;

    /* JADX INFO: renamed from: D */
    public VText f22570D;

    /* JADX INFO: renamed from: E */
    public VText f22571E;

    /* JADX INFO: renamed from: e */
    public VLinear f22572e;

    /* JADX INFO: renamed from: f */
    public VImage f22573f;

    /* JADX INFO: renamed from: g */
    public VText f22574g;

    /* JADX INFO: renamed from: h */
    public VText f22575h;

    /* JADX INFO: renamed from: i */
    public VText f22576i;

    /* JADX INFO: renamed from: j */
    public View f22577j;

    /* JADX INFO: renamed from: k */
    public VPager f22578k;

    /* JADX INFO: renamed from: l */
    public GiftDialogIndicator f22579l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f22580m;

    /* JADX INFO: renamed from: n */
    public VPager f22581n;

    /* JADX INFO: renamed from: o */
    public GiftDialogIndicator f22582o;

    /* JADX INFO: renamed from: p */
    public VText f22583p;

    /* JADX INFO: renamed from: q */
    public View f22584q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f22585r;

    /* JADX INFO: renamed from: s */
    public TextView f22586s;

    /* JADX INFO: renamed from: t */
    public TextView f22587t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f22588u;

    /* JADX INFO: renamed from: v */
    public TextView f22589v;

    /* JADX INFO: renamed from: w */
    public TextView f22590w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f22591x;

    /* JADX INFO: renamed from: y */
    public TextView f22592y;

    /* JADX INFO: renamed from: z */
    public TextView f22593z;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20087y7, viewGroup, false);
        m26289u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m26289u(ViewGroup viewGroup) {
        this.f22572e = (VLinear) viewGroup;
        VImage childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f22573f = childAt;
        String str = childAt == null ? "_back" : null;
        VText childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f22574g = childAt2;
        if (childAt2 == null) {
            str = "_normal_title";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f22575h = childAt3;
        if (childAt3 == null) {
            str = "_special_title";
        }
        VText childAt4 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f22576i = childAt4;
        if (childAt4 == null) {
            str = "_special_title_tag";
        }
        View childAt5 = viewGroup.getChildAt(1);
        this.f22577j = childAt5;
        if (childAt5 == null) {
            str = "_divider";
        }
        VPager childAt6 = viewGroup.getChildAt(2);
        this.f22578k = childAt6;
        if (childAt6 == null) {
            str = "_relation_pager";
        }
        GiftDialogIndicator giftDialogIndicator = (GiftDialogIndicator) viewGroup.getChildAt(3);
        this.f22579l = giftDialogIndicator;
        if (giftDialogIndicator == null) {
            str = "_relation_indicator";
        }
        ConstraintLayout childAt7 = viewGroup.getChildAt(4);
        this.f22580m = childAt7;
        if (childAt7 == null) {
            str = "_special_content";
        }
        VPager childAt8 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        this.f22581n = childAt8;
        if (childAt8 == null) {
            str = "_special_relation_pager";
        }
        GiftDialogIndicator giftDialogIndicator2 = (GiftDialogIndicator) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        this.f22582o = giftDialogIndicator2;
        if (giftDialogIndicator2 == null) {
            str = "_special_relation_indicator";
        }
        VText childAt9 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        this.f22583p = childAt9;
        if (childAt9 == null) {
            str = "_special_des_title";
        }
        View childAt10 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        this.f22584q = childAt10;
        if (childAt10 == null) {
            str = "_right_content";
        }
        VDraweeView childAt11 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        this.f22585r = childAt11;
        if (childAt11 == null) {
            str = "_icon1";
        }
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        this.f22586s = textView;
        if (textView == null) {
            str = "_title1";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(6);
        this.f22587t = textView2;
        if (textView2 == null) {
            str = "_sub_title1";
        }
        VDraweeView childAt12 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(7);
        this.f22588u = childAt12;
        if (childAt12 == null) {
            str = "_icon2";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(8);
        this.f22589v = textView3;
        if (textView3 == null) {
            str = "_title2";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(9);
        this.f22590w = textView4;
        if (textView4 == null) {
            str = "_sub_title2";
        }
        VDraweeView childAt13 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(10);
        this.f22591x = childAt13;
        if (childAt13 == null) {
            str = "_icon3";
        }
        TextView textView5 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(11);
        this.f22592y = textView5;
        if (textView5 == null) {
            str = "_title3";
        }
        TextView textView6 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(12);
        this.f22593z = textView6;
        if (textView6 == null) {
            str = "_sub_title3";
        }
        VDraweeView childAt14 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(13);
        this.f22567A = childAt14;
        if (childAt14 == null) {
            str = "_icon4";
        }
        TextView textView7 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(14);
        this.f22568B = textView7;
        if (textView7 == null) {
            str = "_title4";
        }
        TextView textView8 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(15);
        this.f22569C = textView8;
        if (textView8 == null) {
            str = "_sub_title4";
        }
        VText childAt15 = viewGroup.getChildAt(5);
        this.f22570D = childAt15;
        if (childAt15 == null) {
            str = "_finish";
        }
        VText childAt16 = viewGroup.getChildAt(6);
        this.f22571E = childAt16;
        if (childAt16 == null) {
            str = "_info";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
