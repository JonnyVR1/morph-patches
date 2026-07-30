package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LevelView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.VoiceAuctionAvatarView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceCallAuctionViewBindings<T extends k3m> extends FrameLayout implements iam<T> {

    /* JADX INFO: renamed from: A */
    public CommonAnimMaskAvatarView f49104A;

    /* JADX INFO: renamed from: B */
    public TextView f49105B;

    /* JADX INFO: renamed from: C */
    public VText f49106C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f49107D;

    /* JADX INFO: renamed from: E */
    public TextView f49108E;

    /* JADX INFO: renamed from: E0 */
    public CommonMaskAvatarView f49109E0;

    /* JADX INFO: renamed from: F */
    public VText f49110F;

    /* JADX INFO: renamed from: F0 */
    public VText f49111F0;

    /* JADX INFO: renamed from: G */
    public LevelView f49112G;

    /* JADX INFO: renamed from: G0 */
    public VText f49113G0;

    /* JADX INFO: renamed from: H */
    public ConstraintLayout f49114H;

    /* JADX INFO: renamed from: H0 */
    public TextView f49115H0;

    /* JADX INFO: renamed from: I */
    public VDraweeView f49116I;

    /* JADX INFO: renamed from: I0 */
    public VLinear f49117I0;

    /* JADX INFO: renamed from: J */
    public VText f49118J;

    /* JADX INFO: renamed from: J0 */
    public VText f49119J0;

    /* JADX INFO: renamed from: K */
    public VText f49120K;

    /* JADX INFO: renamed from: K0 */
    public VText f49121K0;

    /* JADX INFO: renamed from: L */
    public CommonMaskAvatarView f49122L;

    /* JADX INFO: renamed from: M */
    public VText f49123M;

    /* JADX INFO: renamed from: N */
    public VText f49124N;

    /* JADX INFO: renamed from: O */
    public ConstraintLayout f49125O;

    /* JADX INFO: renamed from: P */
    public VDraweeView f49126P;

    /* JADX INFO: renamed from: Q */
    public VText f49127Q;

    /* JADX INFO: renamed from: R */
    public VText f49128R;

    /* JADX INFO: renamed from: S */
    public CommonMaskAvatarView f49129S;

    /* JADX INFO: renamed from: T */
    public VText f49130T;

    /* JADX INFO: renamed from: U */
    public VText f49131U;

    /* JADX INFO: renamed from: V */
    public ConstraintLayout f49132V;

    /* JADX INFO: renamed from: W */
    public VDraweeView f49133W;

    /* JADX INFO: renamed from: a */
    public T f49134a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceCallAuctionView f49135b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f49136c;

    /* JADX INFO: renamed from: d */
    public LiveVirtualVoicePanelCollapseView f49137d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f49138e;

    /* JADX INFO: renamed from: f */
    public Group f49139f;

    /* JADX INFO: renamed from: g */
    public Group f49140g;

    /* JADX INFO: renamed from: h */
    public Group f49141h;

    /* JADX INFO: renamed from: i */
    public Guideline f49142i;

    /* JADX INFO: renamed from: j */
    public VText f49143j;

    /* JADX INFO: renamed from: k */
    public VText f49144k;

    /* JADX INFO: renamed from: k0 */
    public VText f49145k0;

    /* JADX INFO: renamed from: l */
    public VLinear f49146l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f49147m;

    /* JADX INFO: renamed from: n */
    public TextView f49148n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f49149o;

    /* JADX INFO: renamed from: p */
    public TextView f49150p;

    /* JADX INFO: renamed from: p0 */
    public VText f49151p0;

    /* JADX INFO: renamed from: q */
    public VText f49152q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f49153r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f49154s;

    /* JADX INFO: renamed from: t */
    public TextView f49155t;

    /* JADX INFO: renamed from: u */
    public VText f49156u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f49157v;

    /* JADX INFO: renamed from: w */
    public VoiceAuctionAvatarView f49158w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f49159x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f49160y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f49161z;

    public LiveVoiceCallAuctionViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73245a(ViewGroup viewGroup) {
        this.f49135b = (LiveVoiceCallAuctionView) viewGroup;
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(0);
        this.f49136c = animEffectPlayer;
        String str = animEffectPlayer == null ? "_panel_bg" : null;
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = (LiveVirtualVoicePanelCollapseView) viewGroup.getChildAt(1);
        this.f49137d = liveVirtualVoicePanelCollapseView;
        if (liveVirtualVoicePanelCollapseView == null) {
            str = "_collapse_view";
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.getChildAt(2);
        this.f49138e = constraintLayout;
        if (constraintLayout == null) {
            str = "_content";
        }
        Group group = (Group) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f49139f = group;
        if (group == null) {
            str = "_final_group";
        }
        Group group2 = (Group) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f49140g = group2;
        if (group2 == null) {
            str = "_ongoing_auctioneer_group";
        }
        Group group3 = (Group) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f49141h = group3;
        if (group3 == null) {
            str = "_ongoing_group";
        }
        Guideline guideline = (Guideline) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f49142i = guideline;
        if (guideline == null) {
            str = "_top_baseline";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        this.f49143j = vText;
        if (vText == null) {
            str = "_live_bidder_start";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        this.f49144k = vText2;
        if (vText2 == null) {
            str = "_auction_step_action";
        }
        VLinear vLinear = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        this.f49146l = vLinear;
        if (vLinear == null) {
            str = "_live_final_relation_layout";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        this.f49147m = vDraweeView;
        if (vDraweeView == null) {
            str = "_live_final_relation_layout_final_relation_img";
        }
        TextView textView = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(1);
        this.f49148n = textView;
        if (textView == null) {
            str = "_live_final_relation_layout_final_relation_name";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        this.f49149o = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_live_final_bidder_avatar";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(8);
        this.f49150p = textView2;
        if (textView2 == null) {
            str = "_live_final_bidder_name";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9);
        this.f49152q = vText3;
        if (vText3 == null) {
            str = "_live_final_bidder_value";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(10);
        this.f49153r = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_live_final_bidder_tag";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(11);
        this.f49154s = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_live_final_auctioneer_avatar";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(12);
        this.f49155t = textView3;
        if (textView3 == null) {
            str = "_live_final_auctioneer_name";
        }
        VText vText4 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(13);
        this.f49156u = vText4;
        if (vText4 == null) {
            str = "_live_final_auctioneer_value";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(14);
        this.f49157v = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_live_final_auctioneer_tag";
        }
        VoiceAuctionAvatarView voiceAuctionAvatarView = (VoiceAuctionAvatarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15);
        this.f49158w = voiceAuctionAvatarView;
        if (voiceAuctionAvatarView == null) {
            str = "_live_auctioneer_avatar";
        }
        VDraweeView vDraweeView6 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(0);
        this.f49159x = vDraweeView6;
        if (vDraweeView6 == null) {
            str = "_avatar_3";
        }
        VDraweeView vDraweeView7 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(1);
        this.f49160y = vDraweeView7;
        if (vDraweeView7 == null) {
            str = "_avatar_2";
        }
        VDraweeView vDraweeView8 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(2);
        this.f49161z = vDraweeView8;
        if (vDraweeView8 == null) {
            str = "_avatar_1";
        }
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = (CommonAnimMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(16);
        this.f49104A = commonAnimMaskAvatarView;
        if (commonAnimMaskAvatarView == null) {
            str = "_virtual_avatar_view";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(17);
        this.f49105B = textView4;
        if (textView4 == null) {
            str = "_live_auctioneer_name";
        }
        VText vText5 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(18);
        this.f49106C = vText5;
        if (vText5 == null) {
            str = "_live_auctioneer_value";
        }
        VDraweeView vDraweeView9 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(19);
        this.f49107D = vDraweeView9;
        if (vDraweeView9 == null) {
            str = "_live_relation_img";
        }
        TextView textView5 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(20);
        this.f49108E = textView5;
        if (textView5 == null) {
            str = "_live_relation_name";
        }
        VText vText6 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(21);
        this.f49110F = vText6;
        if (vText6 == null) {
            str = "_live_relation_tip";
        }
        LevelView levelView = (LevelView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(22);
        this.f49112G = levelView;
        if (levelView == null) {
            str = "_auctioneer_level";
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23);
        this.f49114H = constraintLayout2;
        if (constraintLayout2 == null) {
            str = "_live_bidder_order_1";
        }
        VDraweeView vDraweeView10 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(0);
        this.f49116I = vDraweeView10;
        if (vDraweeView10 == null) {
            str = "_live_bidder_order_1_bidder_bg";
        }
        VText vText7 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(1);
        this.f49118J = vText7;
        if (vText7 == null) {
            str = "_live_bidder_order_1_bidder_price";
        }
        VText vText8 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(2);
        this.f49120K = vText8;
        if (vText8 == null) {
            str = "_live_bidder_order_1_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(3);
        this.f49122L = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_live_bidder_order_1_bidder_avatar";
        }
        VText vText9 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(4)).getChildAt(0);
        this.f49123M = vText9;
        if (vText9 == null) {
            str = "_live_bidder_order_1_bidder_order";
        }
        VText vText10 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(4)).getChildAt(1);
        this.f49124N = vText10;
        if (vText10 == null) {
            str = "_live_bidder_order_1_bidder_name";
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24);
        this.f49125O = constraintLayout3;
        if (constraintLayout3 == null) {
            str = "_live_bidder_order_2";
        }
        VDraweeView vDraweeView11 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(0);
        this.f49126P = vDraweeView11;
        if (vDraweeView11 == null) {
            str = "_live_bidder_order_2_bidder_bg";
        }
        VText vText11 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(1);
        this.f49127Q = vText11;
        if (vText11 == null) {
            str = "_live_bidder_order_2_bidder_price";
        }
        VText vText12 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(2);
        this.f49128R = vText12;
        if (vText12 == null) {
            str = "_live_bidder_order_2_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView2 = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(3);
        this.f49129S = commonMaskAvatarView2;
        if (commonMaskAvatarView2 == null) {
            str = "_live_bidder_order_2_bidder_avatar";
        }
        VText vText13 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(4)).getChildAt(0);
        this.f49130T = vText13;
        if (vText13 == null) {
            str = "_live_bidder_order_2_bidder_order";
        }
        VText vText14 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(4)).getChildAt(1);
        this.f49131U = vText14;
        if (vText14 == null) {
            str = "_live_bidder_order_2_bidder_name";
        }
        ConstraintLayout constraintLayout4 = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25);
        this.f49132V = constraintLayout4;
        if (constraintLayout4 == null) {
            str = "_live_bidder_order_3";
        }
        VDraweeView vDraweeView12 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(0);
        this.f49133W = vDraweeView12;
        if (vDraweeView12 == null) {
            str = "_live_bidder_order_3_bidder_bg";
        }
        VText vText15 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(1);
        this.f49145k0 = vText15;
        if (vText15 == null) {
            str = "_live_bidder_order_3_bidder_price";
        }
        VText vText16 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(2);
        this.f49151p0 = vText16;
        if (vText16 == null) {
            str = "_live_bidder_order_3_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView3 = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(3);
        this.f49109E0 = commonMaskAvatarView3;
        if (commonMaskAvatarView3 == null) {
            str = "_live_bidder_order_3_bidder_avatar";
        }
        VText vText17 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(4)).getChildAt(0);
        this.f49111F0 = vText17;
        if (vText17 == null) {
            str = "_live_bidder_order_3_bidder_order";
        }
        VText vText18 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(4)).getChildAt(1);
        this.f49113G0 = vText18;
        if (vText18 == null) {
            str = "_live_bidder_order_3_bidder_name";
        }
        TextView textView6 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(26);
        this.f49115H0 = textView6;
        if (textView6 == null) {
            str = "_live_auction_gap";
        }
        VLinear vLinear2 = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27);
        this.f49117I0 = vLinear2;
        if (vLinear2 == null) {
            str = "_live_bless_end_layout";
        }
        VText vText19 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27)).getChildAt(0);
        this.f49119J0 = vText19;
        if (vText19 == null) {
            str = "_live_bless_end_layout_live_auction_end";
        }
        VText vText20 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27)).getChildAt(1);
        this.f49121K0 = vText20;
        if (vText20 == null) {
            str = "_live_bless_end_layout_live_bless_start";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public LiveVoiceCallAuctionView getRoot() {
        return this.f49135b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49134a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198951V7, viewGroup, false);
        m73245a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73245a(this);
    }

    public LiveVoiceCallAuctionViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceCallAuctionViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
