package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPager;
import p147v.VText;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class y0v<P extends zi2> extends BaseDialogHolder<P, BLiveAuctionAsset> {

    /* JADX INFO: renamed from: A */
    public VDraweeView f195330A;

    /* JADX INFO: renamed from: B */
    public TextView f195331B;

    /* JADX INFO: renamed from: C */
    public TextView f195332C;

    /* JADX INFO: renamed from: D */
    public VText f195333D;

    /* JADX INFO: renamed from: E */
    public VText f195334E;

    /* JADX INFO: renamed from: e */
    public VLinear f195335e;

    /* JADX INFO: renamed from: f */
    public VImage f195336f;

    /* JADX INFO: renamed from: g */
    public VText f195337g;

    /* JADX INFO: renamed from: h */
    public VText f195338h;

    /* JADX INFO: renamed from: i */
    public VText f195339i;

    /* JADX INFO: renamed from: j */
    public View f195340j;

    /* JADX INFO: renamed from: k */
    public VPager f195341k;

    /* JADX INFO: renamed from: l */
    public GiftDialogIndicator f195342l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f195343m;

    /* JADX INFO: renamed from: n */
    public VPager f195344n;

    /* JADX INFO: renamed from: o */
    public GiftDialogIndicator f195345o;

    /* JADX INFO: renamed from: p */
    public VText f195346p;

    /* JADX INFO: renamed from: q */
    public View f195347q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f195348r;

    /* JADX INFO: renamed from: s */
    public TextView f195349s;

    /* JADX INFO: renamed from: t */
    public TextView f195350t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f195351u;

    /* JADX INFO: renamed from: v */
    public TextView f195352v;

    /* JADX INFO: renamed from: w */
    public TextView f195353w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f195354x;

    /* JADX INFO: renamed from: y */
    public TextView f195355y;

    /* JADX INFO: renamed from: z */
    public TextView f195356z;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168591y7, viewGroup, false);
        m212125u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m212125u(ViewGroup viewGroup) {
        this.f195335e = (VLinear) viewGroup;
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f195336f = vImage;
        String str = vImage == null ? "_back" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f195337g = vText;
        if (vText == null) {
            str = "_normal_title";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f195338h = vText2;
        if (vText2 == null) {
            str = "_special_title";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        this.f195339i = vText3;
        if (vText3 == null) {
            str = "_special_title_tag";
        }
        View childAt = viewGroup.getChildAt(1);
        this.f195340j = childAt;
        if (childAt == null) {
            str = "_divider";
        }
        VPager vPager = (VPager) viewGroup.getChildAt(2);
        this.f195341k = vPager;
        if (vPager == null) {
            str = "_relation_pager";
        }
        GiftDialogIndicator giftDialogIndicator = (GiftDialogIndicator) viewGroup.getChildAt(3);
        this.f195342l = giftDialogIndicator;
        if (giftDialogIndicator == null) {
            str = "_relation_indicator";
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.getChildAt(4);
        this.f195343m = constraintLayout;
        if (constraintLayout == null) {
            str = "_special_content";
        }
        VPager vPager2 = (VPager) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        this.f195344n = vPager2;
        if (vPager2 == null) {
            str = "_special_relation_pager";
        }
        GiftDialogIndicator giftDialogIndicator2 = (GiftDialogIndicator) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        this.f195345o = giftDialogIndicator2;
        if (giftDialogIndicator2 == null) {
            str = "_special_relation_indicator";
        }
        VText vText4 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        this.f195346p = vText4;
        if (vText4 == null) {
            str = "_special_des_title";
        }
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        this.f195347q = childAt2;
        if (childAt2 == null) {
            str = "_right_content";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        this.f195348r = vDraweeView;
        if (vDraweeView == null) {
            str = "_icon1";
        }
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        this.f195349s = textView;
        if (textView == null) {
            str = "_title1";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(6);
        this.f195350t = textView2;
        if (textView2 == null) {
            str = "_sub_title1";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(7);
        this.f195351u = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_icon2";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(8);
        this.f195352v = textView3;
        if (textView3 == null) {
            str = "_title2";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(9);
        this.f195353w = textView4;
        if (textView4 == null) {
            str = "_sub_title2";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(10);
        this.f195354x = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_icon3";
        }
        TextView textView5 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(11);
        this.f195355y = textView5;
        if (textView5 == null) {
            str = "_title3";
        }
        TextView textView6 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(12);
        this.f195356z = textView6;
        if (textView6 == null) {
            str = "_sub_title3";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(13);
        this.f195330A = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_icon4";
        }
        TextView textView7 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(14);
        this.f195331B = textView7;
        if (textView7 == null) {
            str = "_title4";
        }
        TextView textView8 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(15);
        this.f195332C = textView8;
        if (textView8 == null) {
            str = "_sub_title4";
        }
        VText vText5 = (VText) viewGroup.getChildAt(5);
        this.f195333D = vText5;
        if (vText5 == null) {
            str = "_finish";
        }
        VText vText6 = (VText) viewGroup.getChildAt(6);
        this.f195334E = vText6;
        if (vText6 == null) {
            str = "_info";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
