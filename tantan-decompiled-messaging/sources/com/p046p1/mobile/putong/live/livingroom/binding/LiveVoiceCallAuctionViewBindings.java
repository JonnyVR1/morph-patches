package com.p046p1.mobile.putong.live.livingroom.binding;

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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LevelView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.VoiceAuctionAvatarView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceCallAuctionViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: A */
    public CommonAnimMaskAvatarView f48256A;

    /* JADX INFO: renamed from: B */
    public TextView f48257B;

    /* JADX INFO: renamed from: C */
    public VText f48258C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f48259D;

    /* JADX INFO: renamed from: E */
    public TextView f48260E;

    /* JADX INFO: renamed from: E0 */
    public CommonMaskAvatarView f48261E0;

    /* JADX INFO: renamed from: F */
    public VText f48262F;

    /* JADX INFO: renamed from: F0 */
    public VText f48263F0;

    /* JADX INFO: renamed from: G */
    public LevelView f48264G;

    /* JADX INFO: renamed from: G0 */
    public VText f48265G0;

    /* JADX INFO: renamed from: H */
    public ConstraintLayout f48266H;

    /* JADX INFO: renamed from: H0 */
    public TextView f48267H0;

    /* JADX INFO: renamed from: I */
    public VDraweeView f48268I;

    /* JADX INFO: renamed from: I0 */
    public VLinear f48269I0;

    /* JADX INFO: renamed from: J */
    public VText f48270J;

    /* JADX INFO: renamed from: J0 */
    public VText f48271J0;

    /* JADX INFO: renamed from: K */
    public VText f48272K;

    /* JADX INFO: renamed from: K0 */
    public VText f48273K0;

    /* JADX INFO: renamed from: L */
    public CommonMaskAvatarView f48274L;

    /* JADX INFO: renamed from: M */
    public VText f48275M;

    /* JADX INFO: renamed from: N */
    public VText f48276N;

    /* JADX INFO: renamed from: O */
    public ConstraintLayout f48277O;

    /* JADX INFO: renamed from: P */
    public VDraweeView f48278P;

    /* JADX INFO: renamed from: Q */
    public VText f48279Q;

    /* JADX INFO: renamed from: R */
    public VText f48280R;

    /* JADX INFO: renamed from: S */
    public CommonMaskAvatarView f48281S;

    /* JADX INFO: renamed from: T */
    public VText f48282T;

    /* JADX INFO: renamed from: U */
    public VText f48283U;

    /* JADX INFO: renamed from: V */
    public ConstraintLayout f48284V;

    /* JADX INFO: renamed from: W */
    public VDraweeView f48285W;

    /* JADX INFO: renamed from: a */
    public T f48286a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceCallAuctionView f48287b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f48288c;

    /* JADX INFO: renamed from: d */
    public LiveVirtualVoicePanelCollapseView f48289d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f48290e;

    /* JADX INFO: renamed from: f */
    public Group f48291f;

    /* JADX INFO: renamed from: g */
    public Group f48292g;

    /* JADX INFO: renamed from: h */
    public Group f48293h;

    /* JADX INFO: renamed from: i */
    public Guideline f48294i;

    /* JADX INFO: renamed from: j */
    public VText f48295j;

    /* JADX INFO: renamed from: k */
    public VText f48296k;

    /* JADX INFO: renamed from: k0 */
    public VText f48297k0;

    /* JADX INFO: renamed from: l */
    public VLinear f48298l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f48299m;

    /* JADX INFO: renamed from: n */
    public TextView f48300n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f48301o;

    /* JADX INFO: renamed from: p */
    public TextView f48302p;

    /* JADX INFO: renamed from: p0 */
    public VText f48303p0;

    /* JADX INFO: renamed from: q */
    public VText f48304q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f48305r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f48306s;

    /* JADX INFO: renamed from: t */
    public TextView f48307t;

    /* JADX INFO: renamed from: u */
    public VText f48308u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f48309v;

    /* JADX INFO: renamed from: w */
    public VoiceAuctionAvatarView f48310w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f48311x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f48312y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f48313z;

    public LiveVoiceCallAuctionViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72062a(ViewGroup viewGroup) {
        this.f48287b = (LiveVoiceCallAuctionView) viewGroup;
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) viewGroup.getChildAt(0);
        this.f48288c = animEffectPlayer;
        String str = animEffectPlayer == null ? "_panel_bg" : null;
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = (LiveVirtualVoicePanelCollapseView) viewGroup.getChildAt(1);
        this.f48289d = liveVirtualVoicePanelCollapseView;
        if (liveVirtualVoicePanelCollapseView == null) {
            str = "_collapse_view";
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.getChildAt(2);
        this.f48290e = constraintLayout;
        if (constraintLayout == null) {
            str = "_content";
        }
        Group group = (Group) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f48291f = group;
        if (group == null) {
            str = "_final_group";
        }
        Group group2 = (Group) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f48292g = group2;
        if (group2 == null) {
            str = "_ongoing_auctioneer_group";
        }
        Group group3 = (Group) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f48293h = group3;
        if (group3 == null) {
            str = "_ongoing_group";
        }
        Guideline guideline = (Guideline) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f48294i = guideline;
        if (guideline == null) {
            str = "_top_baseline";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        this.f48295j = vText;
        if (vText == null) {
            str = "_live_bidder_start";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        this.f48296k = vText2;
        if (vText2 == null) {
            str = "_auction_step_action";
        }
        VLinear vLinear = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        this.f48298l = vLinear;
        if (vLinear == null) {
            str = "_live_final_relation_layout";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        this.f48299m = vDraweeView;
        if (vDraweeView == null) {
            str = "_live_final_relation_layout_final_relation_img";
        }
        TextView textView = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(1);
        this.f48300n = textView;
        if (textView == null) {
            str = "_live_final_relation_layout_final_relation_name";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        this.f48301o = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_live_final_bidder_avatar";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(8);
        this.f48302p = textView2;
        if (textView2 == null) {
            str = "_live_final_bidder_name";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9);
        this.f48304q = vText3;
        if (vText3 == null) {
            str = "_live_final_bidder_value";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(10);
        this.f48305r = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_live_final_bidder_tag";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(11);
        this.f48306s = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_live_final_auctioneer_avatar";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(12);
        this.f48307t = textView3;
        if (textView3 == null) {
            str = "_live_final_auctioneer_name";
        }
        VText vText4 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(13);
        this.f48308u = vText4;
        if (vText4 == null) {
            str = "_live_final_auctioneer_value";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(14);
        this.f48309v = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_live_final_auctioneer_tag";
        }
        VoiceAuctionAvatarView voiceAuctionAvatarView = (VoiceAuctionAvatarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15);
        this.f48310w = voiceAuctionAvatarView;
        if (voiceAuctionAvatarView == null) {
            str = "_live_auctioneer_avatar";
        }
        VDraweeView vDraweeView6 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(0);
        this.f48311x = vDraweeView6;
        if (vDraweeView6 == null) {
            str = "_avatar_3";
        }
        VDraweeView vDraweeView7 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(1);
        this.f48312y = vDraweeView7;
        if (vDraweeView7 == null) {
            str = "_avatar_2";
        }
        VDraweeView vDraweeView8 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(2);
        this.f48313z = vDraweeView8;
        if (vDraweeView8 == null) {
            str = "_avatar_1";
        }
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = (CommonAnimMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(16);
        this.f48256A = commonAnimMaskAvatarView;
        if (commonAnimMaskAvatarView == null) {
            str = "_virtual_avatar_view";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(17);
        this.f48257B = textView4;
        if (textView4 == null) {
            str = "_live_auctioneer_name";
        }
        VText vText5 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(18);
        this.f48258C = vText5;
        if (vText5 == null) {
            str = "_live_auctioneer_value";
        }
        VDraweeView vDraweeView9 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(19);
        this.f48259D = vDraweeView9;
        if (vDraweeView9 == null) {
            str = "_live_relation_img";
        }
        TextView textView5 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(20);
        this.f48260E = textView5;
        if (textView5 == null) {
            str = "_live_relation_name";
        }
        VText vText6 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(21);
        this.f48262F = vText6;
        if (vText6 == null) {
            str = "_live_relation_tip";
        }
        LevelView levelView = (LevelView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(22);
        this.f48264G = levelView;
        if (levelView == null) {
            str = "_auctioneer_level";
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23);
        this.f48266H = constraintLayout2;
        if (constraintLayout2 == null) {
            str = "_live_bidder_order_1";
        }
        VDraweeView vDraweeView10 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(0);
        this.f48268I = vDraweeView10;
        if (vDraweeView10 == null) {
            str = "_live_bidder_order_1_bidder_bg";
        }
        VText vText7 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(1);
        this.f48270J = vText7;
        if (vText7 == null) {
            str = "_live_bidder_order_1_bidder_price";
        }
        VText vText8 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(2);
        this.f48272K = vText8;
        if (vText8 == null) {
            str = "_live_bidder_order_1_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(3);
        this.f48274L = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_live_bidder_order_1_bidder_avatar";
        }
        VText vText9 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(4)).getChildAt(0);
        this.f48275M = vText9;
        if (vText9 == null) {
            str = "_live_bidder_order_1_bidder_order";
        }
        VText vText10 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(4)).getChildAt(1);
        this.f48276N = vText10;
        if (vText10 == null) {
            str = "_live_bidder_order_1_bidder_name";
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24);
        this.f48277O = constraintLayout3;
        if (constraintLayout3 == null) {
            str = "_live_bidder_order_2";
        }
        VDraweeView vDraweeView11 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(0);
        this.f48278P = vDraweeView11;
        if (vDraweeView11 == null) {
            str = "_live_bidder_order_2_bidder_bg";
        }
        VText vText11 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(1);
        this.f48279Q = vText11;
        if (vText11 == null) {
            str = "_live_bidder_order_2_bidder_price";
        }
        VText vText12 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(2);
        this.f48280R = vText12;
        if (vText12 == null) {
            str = "_live_bidder_order_2_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView2 = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(3);
        this.f48281S = commonMaskAvatarView2;
        if (commonMaskAvatarView2 == null) {
            str = "_live_bidder_order_2_bidder_avatar";
        }
        VText vText13 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(4)).getChildAt(0);
        this.f48282T = vText13;
        if (vText13 == null) {
            str = "_live_bidder_order_2_bidder_order";
        }
        VText vText14 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(4)).getChildAt(1);
        this.f48283U = vText14;
        if (vText14 == null) {
            str = "_live_bidder_order_2_bidder_name";
        }
        ConstraintLayout constraintLayout4 = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25);
        this.f48284V = constraintLayout4;
        if (constraintLayout4 == null) {
            str = "_live_bidder_order_3";
        }
        VDraweeView vDraweeView12 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(0);
        this.f48285W = vDraweeView12;
        if (vDraweeView12 == null) {
            str = "_live_bidder_order_3_bidder_bg";
        }
        VText vText15 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(1);
        this.f48297k0 = vText15;
        if (vText15 == null) {
            str = "_live_bidder_order_3_bidder_price";
        }
        VText vText16 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(2);
        this.f48303p0 = vText16;
        if (vText16 == null) {
            str = "_live_bidder_order_3_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView3 = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(3);
        this.f48261E0 = commonMaskAvatarView3;
        if (commonMaskAvatarView3 == null) {
            str = "_live_bidder_order_3_bidder_avatar";
        }
        VText vText17 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(4)).getChildAt(0);
        this.f48263F0 = vText17;
        if (vText17 == null) {
            str = "_live_bidder_order_3_bidder_order";
        }
        VText vText18 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(4)).getChildAt(1);
        this.f48265G0 = vText18;
        if (vText18 == null) {
            str = "_live_bidder_order_3_bidder_name";
        }
        TextView textView6 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(26);
        this.f48267H0 = textView6;
        if (textView6 == null) {
            str = "_live_auction_gap";
        }
        VLinear vLinear2 = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27);
        this.f48269I0 = vLinear2;
        if (vLinear2 == null) {
            str = "_live_bless_end_layout";
        }
        VText vText19 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27)).getChildAt(0);
        this.f48271J0 = vText19;
        if (vText19 == null) {
            str = "_live_bless_end_layout_live_auction_end";
        }
        VText vText20 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27)).getChildAt(1);
        this.f48273K0 = vText20;
        if (vText20 == null) {
            str = "_live_bless_end_layout_live_bless_start";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public LiveVoiceCallAuctionView getRoot() {
        return this.f48287b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48286a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168219V7, viewGroup, false);
        m72062a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72062a(this);
    }

    public LiveVoiceCallAuctionViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceCallAuctionViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
