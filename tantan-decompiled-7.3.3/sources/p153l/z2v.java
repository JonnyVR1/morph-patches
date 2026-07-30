package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VText;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class z2v<P extends hj2> extends BaseDialogHolder<P, BLiveAuctionAsset> {

    /* JADX INFO: renamed from: A */
    public VDraweeView f202738A;

    /* JADX INFO: renamed from: B */
    public TextView f202739B;

    /* JADX INFO: renamed from: C */
    public TextView f202740C;

    /* JADX INFO: renamed from: D */
    public VText f202741D;

    /* JADX INFO: renamed from: E */
    public VText f202742E;

    /* JADX INFO: renamed from: e */
    public VLinear f202743e;

    /* JADX INFO: renamed from: f */
    public VImage f202744f;

    /* JADX INFO: renamed from: g */
    public VText f202745g;

    /* JADX INFO: renamed from: h */
    public VText f202746h;

    /* JADX INFO: renamed from: i */
    public VText f202747i;

    /* JADX INFO: renamed from: j */
    public View f202748j;

    /* JADX INFO: renamed from: k */
    public VPager f202749k;

    /* JADX INFO: renamed from: l */
    public GiftDialogIndicator f202750l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f202751m;

    /* JADX INFO: renamed from: n */
    public VPager f202752n;

    /* JADX INFO: renamed from: o */
    public GiftDialogIndicator f202753o;

    /* JADX INFO: renamed from: p */
    public VText f202754p;

    /* JADX INFO: renamed from: q */
    public View f202755q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f202756r;

    /* JADX INFO: renamed from: s */
    public TextView f202757s;

    /* JADX INFO: renamed from: t */
    public TextView f202758t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f202759u;

    /* JADX INFO: renamed from: v */
    public TextView f202760v;

    /* JADX INFO: renamed from: w */
    public TextView f202761w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f202762x;

    /* JADX INFO: renamed from: y */
    public TextView f202763y;

    /* JADX INFO: renamed from: z */
    public TextView f202764z;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199323y7, viewGroup, false);
        m218464u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m218464u(ViewGroup viewGroup) {
        this.f202743e = (VLinear) viewGroup;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f202744f = vImage;
        String str = vImage == null ? "_back" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f202745g = vText;
        if (vText == null) {
            str = "_normal_title";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f202746h = vText2;
        if (vText2 == null) {
            str = "_special_title";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f202747i = vText3;
        if (vText3 == null) {
            str = "_special_title_tag";
        }
        View childAt = viewGroup.getChildAt(1);
        this.f202748j = childAt;
        if (childAt == null) {
            str = "_divider";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(2);
        this.f202749k = vPager;
        if (vPager == null) {
            str = "_relation_pager";
        }
        GiftDialogIndicator giftDialogIndicator = (GiftDialogIndicator) viewGroup.getChildAt(3);
        this.f202750l = giftDialogIndicator;
        if (giftDialogIndicator == null) {
            str = "_relation_indicator";
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.getChildAt(4);
        this.f202751m = constraintLayout;
        if (constraintLayout == null) {
            str = "_special_content";
        }
        VPager vPager2 = (VPager) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        this.f202752n = vPager2;
        if (vPager2 == null) {
            str = "_special_relation_pager";
        }
        GiftDialogIndicator giftDialogIndicator2 = (GiftDialogIndicator) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        this.f202753o = giftDialogIndicator2;
        if (giftDialogIndicator2 == null) {
            str = "_special_relation_indicator";
        }
        VText vText4 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        this.f202754p = vText4;
        if (vText4 == null) {
            str = "_special_des_title";
        }
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        this.f202755q = childAt2;
        if (childAt2 == null) {
            str = "_right_content";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        this.f202756r = vDraweeView;
        if (vDraweeView == null) {
            str = "_icon1";
        }
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        this.f202757s = textView;
        if (textView == null) {
            str = "_title1";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(6);
        this.f202758t = textView2;
        if (textView2 == null) {
            str = "_sub_title1";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(7);
        this.f202759u = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_icon2";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(8);
        this.f202760v = textView3;
        if (textView3 == null) {
            str = "_title2";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(9);
        this.f202761w = textView4;
        if (textView4 == null) {
            str = "_sub_title2";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(10);
        this.f202762x = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_icon3";
        }
        TextView textView5 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(11);
        this.f202763y = textView5;
        if (textView5 == null) {
            str = "_title3";
        }
        TextView textView6 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(12);
        this.f202764z = textView6;
        if (textView6 == null) {
            str = "_sub_title3";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(13);
        this.f202738A = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_icon4";
        }
        TextView textView7 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(14);
        this.f202739B = textView7;
        if (textView7 == null) {
            str = "_title4";
        }
        TextView textView8 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(15);
        this.f202740C = textView8;
        if (textView8 == null) {
            str = "_sub_title4";
        }
        VText vText5 = (VText) viewGroup.getChildAt(5);
        this.f202741D = vText5;
        if (vText5 == null) {
            str = "_finish";
        }
        VText vText6 = (VText) viewGroup.getChildAt(6);
        this.f202742E = vText6;
        if (vText6 == null) {
            str = "_info";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
