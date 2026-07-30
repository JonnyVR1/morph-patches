package com.p046p1.mobile.putong.core.newui.home.card.opt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;
import com.p046p1.mobile.putong.core.newui.home.views.CommercialCardBottomActionLayout;
import com.p046p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p046p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.likeminded.LikeMindedCardTabView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.cmd;
import p149l.d30;
import p149l.oql;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultCardViewOpt extends NewNewProfileCard {

    /* JADX INFO: renamed from: A3 */
    public ViewStub f22914A3;

    /* JADX INFO: renamed from: B3 */
    public LikeMindedCardTabView f22915B3;

    /* JADX INFO: renamed from: C3 */
    public VLinear f22916C3;

    /* JADX INFO: renamed from: D3 */
    public VText f22917D3;

    /* JADX INFO: renamed from: E3 */
    public ViewStub f22918E3;

    /* JADX INFO: renamed from: F3 */
    public ViewStub f22919F3;

    /* JADX INFO: renamed from: G3 */
    public ViewStub f22920G3;

    /* JADX INFO: renamed from: H3 */
    public SuperLikeBanner f22921H3;

    /* JADX INFO: renamed from: I3 */
    public SwipeLikeButton f22922I3;

    /* JADX INFO: renamed from: J3 */
    public SwipeLikeButton f22923J3;

    /* JADX INFO: renamed from: K3 */
    public NewPictureContainerIndicator f22924K3;

    /* JADX INFO: renamed from: L3 */
    public ViewStub f22925L3;

    /* JADX INFO: renamed from: M3 */
    public ViewStub f22926M3;

    /* JADX INFO: renamed from: N3 */
    public ViewStub f22927N3;

    /* JADX INFO: renamed from: O3 */
    public ViewStub f22928O3;

    /* JADX INFO: renamed from: P3 */
    public ViewStub f22929P3;

    /* JADX INFO: renamed from: Q2 */
    public DefaultCardViewOpt f22930Q2;

    /* JADX INFO: renamed from: Q3 */
    public LinearLayout f22931Q3;

    /* JADX INFO: renamed from: R2 */
    public LinearLayout f22932R2;

    /* JADX INFO: renamed from: R3 */
    public VText f22933R3;

    /* JADX INFO: renamed from: S2 */
    public View f22934S2;

    /* JADX INFO: renamed from: S3 */
    public LinearLayout f22935S3;

    /* JADX INFO: renamed from: T2 */
    public VLinear f22936T2;

    /* JADX INFO: renamed from: T3 */
    public VText f22937T3;

    /* JADX INFO: renamed from: U2 */
    public View f22938U2;

    /* JADX INFO: renamed from: U3 */
    public VFrame f22939U3;

    /* JADX INFO: renamed from: V2 */
    public CardBottomMomentCardTwoView f22940V2;

    /* JADX INFO: renamed from: V3 */
    public ViewStub f22941V3;

    /* JADX INFO: renamed from: W2 */
    public View f22942W2;

    /* JADX INFO: renamed from: X2 */
    public PictureView f22943X2;

    /* JADX INFO: renamed from: Y2 */
    public Space f22944Y2;

    /* JADX INFO: renamed from: Z2 */
    public View f22945Z2;

    /* JADX INFO: renamed from: a3 */
    public View f22946a3;

    /* JADX INFO: renamed from: b3 */
    public View f22947b3;

    /* JADX INFO: renamed from: c3 */
    public View f22948c3;

    /* JADX INFO: renamed from: d3 */
    public LinearMeasureOrderLayout f22949d3;

    /* JADX INFO: renamed from: e3 */
    public VFrame f22950e3;

    /* JADX INFO: renamed from: f3 */
    public SVGAnimationView f22951f3;

    /* JADX INFO: renamed from: g3 */
    public VText f22952g3;

    /* JADX INFO: renamed from: h3 */
    public TextView f22953h3;

    /* JADX INFO: renamed from: i3 */
    public VText f22954i3;

    /* JADX INFO: renamed from: j3 */
    public VText f22955j3;

    /* JADX INFO: renamed from: k3 */
    public VLinear f22956k3;

    /* JADX INFO: renamed from: l3 */
    public ImageView f22957l3;

    /* JADX INFO: renamed from: m3 */
    public TextView f22958m3;

    /* JADX INFO: renamed from: n3 */
    public VText f22959n3;

    /* JADX INFO: renamed from: o3 */
    public VText f22960o3;

    /* JADX INFO: renamed from: p3 */
    public VLinear f22961p3;

    /* JADX INFO: renamed from: q3 */
    public VDraweeView f22962q3;

    /* JADX INFO: renamed from: r3 */
    public VText f22963r3;

    /* JADX INFO: renamed from: s3 */
    public VText f22964s3;

    /* JADX INFO: renamed from: t3 */
    public VImage f22965t3;

    /* JADX INFO: renamed from: u3 */
    public FrameLayout f22966u3;

    /* JADX INFO: renamed from: v3 */
    public VLinear f22967v3;

    /* JADX INFO: renamed from: w3 */
    public VIcon f22968w3;

    /* JADX INFO: renamed from: x3 */
    public VImage f22969x3;

    /* JADX INFO: renamed from: y3 */
    public VImage f22970y3;

    /* JADX INFO: renamed from: z3 */
    public ViewStub f22971z3;

    public DefaultCardViewOpt(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard
    /* JADX INFO: renamed from: Q3 */
    public boolean mo36847Q3() {
        return true;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m38458S3(View view) {
        cmd.m107609a(this, view);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m38459T3() {
        this.f21715M = this.f22930Q2;
        this.f21719N = this.f22932R2;
        this.f21722O = this.f22934S2;
        this.f21725P = this.f22936T2;
        this.f21728Q = this.f22938U2;
        this.f21731R = this.f22940V2;
        this.f21734S = this.f22942W2;
        this.f21737T = this.f22943X2;
        this.f21740U = this.f22944Y2;
        this.f21743V = this.f22945Z2;
        this.f21746W = this.f22946a3;
        this.f21775k0 = this.f22947b3;
        this.f21786p0 = this.f22948c3;
        this.f21691E0 = this.f22949d3;
        this.f21694F0 = this.f22950e3;
        this.f21697G0 = this.f22951f3;
        this.f21700H0 = this.f22952g3;
        this.f21703I0 = this.f22953h3;
        this.f21706J0 = this.f22954i3;
        this.f21709K0 = this.f22955j3;
        this.f21712L0 = this.f22956k3;
        this.f21716M0 = this.f22957l3;
        this.f21720N0 = this.f22958m3;
        this.f21723O0 = this.f22959n3;
        this.f21726P0 = this.f22960o3;
        this.f21729Q0 = this.f22961p3;
        this.f21732R0 = this.f22962q3;
        this.f21735S0 = this.f22963r3;
        this.f21738T0 = this.f22964s3;
        this.f21741U0 = this.f22965t3;
        this.f21744V0 = this.f22966u3;
        this.f21761d1 = this.f22967v3;
        this.f21763e1 = this.f22968w3;
        this.f21765f1 = this.f22969x3;
        this.f21767g1 = this.f22970y3;
        this.f21769h1 = this.f22971z3;
        this.f21771i1 = this.f22914A3;
        this.f21773j1 = this.f22915B3;
        this.f21776k1 = this.f22916C3;
        this.f21778l1 = this.f22917D3;
        this.f21780m1 = this.f22918E3;
        this.f21782n1 = this.f22919F3;
        this.f21784o1 = this.f22920G3;
        this.f21787p1 = this.f22921H3;
        this.f21789q1 = this.f22922I3;
        this.f21791r1 = this.f22923J3;
        this.f21793s1 = this.f22924K3;
        this.f21795t1 = this.f22925L3;
        this.f21797u1 = this.f22926M3;
        this.f21799v1 = this.f22927N3;
        this.f21801w1 = this.f22928O3;
        this.f21803x1 = this.f22929P3;
        this.f21805y1 = this.f22931Q3;
        this.f21807z1 = this.f22933R3;
        this.f21683A1 = this.f22935S3;
        this.f21685B1 = this.f22937T3;
        this.f21687C1 = this.f22939U3;
        this.f21689D1 = this.f22941V3;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard, p149l.hol
    public /* bridge */ /* synthetic */ CommercialCardBottomActionLayout getCommercialCardBottomActionLayout() {
        return super.getCommercialCardBottomActionLayout();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard, android.view.View
    public void onFinishInflate() {
        m38458S3(this);
        super.onFinishInflate();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard, p149l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard, p149l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard
    /* JADX INFO: renamed from: u3 */
    public void mo36938u3() {
        super.mo36938u3();
        m38459T3();
    }

    public DefaultCardViewOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DefaultCardViewOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
