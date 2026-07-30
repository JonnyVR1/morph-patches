package com.p000p1.mobile.putong.live.livingroom.binding;

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
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.LevelView;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.VoiceAuctionAvatarView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceCallAuctionViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: A */
    public CommonAnimMaskAvatarView f4298A;

    /* JADX INFO: renamed from: B */
    public TextView f4299B;

    /* JADX INFO: renamed from: C */
    public VText f4300C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f4301D;

    /* JADX INFO: renamed from: E */
    public TextView f4302E;

    /* JADX INFO: renamed from: E0 */
    public CommonMaskAvatarView f4303E0;

    /* JADX INFO: renamed from: F */
    public VText f4304F;

    /* JADX INFO: renamed from: F0 */
    public VText f4305F0;

    /* JADX INFO: renamed from: G */
    public LevelView f4306G;

    /* JADX INFO: renamed from: G0 */
    public VText f4307G0;

    /* JADX INFO: renamed from: H */
    public ConstraintLayout f4308H;

    /* JADX INFO: renamed from: H0 */
    public TextView f4309H0;

    /* JADX INFO: renamed from: I */
    public VDraweeView f4310I;

    /* JADX INFO: renamed from: I0 */
    public VLinear f4311I0;

    /* JADX INFO: renamed from: J */
    public VText f4312J;

    /* JADX INFO: renamed from: J0 */
    public VText f4313J0;

    /* JADX INFO: renamed from: K */
    public VText f4314K;

    /* JADX INFO: renamed from: K0 */
    public VText f4315K0;

    /* JADX INFO: renamed from: L */
    public CommonMaskAvatarView f4316L;

    /* JADX INFO: renamed from: M */
    public VText f4317M;

    /* JADX INFO: renamed from: N */
    public VText f4318N;

    /* JADX INFO: renamed from: O */
    public ConstraintLayout f4319O;

    /* JADX INFO: renamed from: P */
    public VDraweeView f4320P;

    /* JADX INFO: renamed from: Q */
    public VText f4321Q;

    /* JADX INFO: renamed from: R */
    public VText f4322R;

    /* JADX INFO: renamed from: S */
    public CommonMaskAvatarView f4323S;

    /* JADX INFO: renamed from: T */
    public VText f4324T;

    /* JADX INFO: renamed from: U */
    public VText f4325U;

    /* JADX INFO: renamed from: V */
    public ConstraintLayout f4326V;

    /* JADX INFO: renamed from: W */
    public VDraweeView f4327W;

    /* JADX INFO: renamed from: a */
    public T f4328a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceCallAuctionView f4329b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f4330c;

    /* JADX INFO: renamed from: d */
    public LiveVirtualVoicePanelCollapseView f4331d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f4332e;

    /* JADX INFO: renamed from: f */
    public Group f4333f;

    /* JADX INFO: renamed from: g */
    public Group f4334g;

    /* JADX INFO: renamed from: h */
    public Group f4335h;

    /* JADX INFO: renamed from: i */
    public Guideline f4336i;

    /* JADX INFO: renamed from: j */
    public VText f4337j;

    /* JADX INFO: renamed from: k */
    public VText f4338k;

    /* JADX INFO: renamed from: k0 */
    public VText f4339k0;

    /* JADX INFO: renamed from: l */
    public VLinear f4340l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f4341m;

    /* JADX INFO: renamed from: n */
    public TextView f4342n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f4343o;

    /* JADX INFO: renamed from: p */
    public TextView f4344p;

    /* JADX INFO: renamed from: p0 */
    public VText f4345p0;

    /* JADX INFO: renamed from: q */
    public VText f4346q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f4347r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f4348s;

    /* JADX INFO: renamed from: t */
    public TextView f4349t;

    /* JADX INFO: renamed from: u */
    public VText f4350u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f4351v;

    /* JADX INFO: renamed from: w */
    public VoiceAuctionAvatarView f4352w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f4353x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f4354y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f4355z;

    public LiveVoiceCallAuctionViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5525C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5526a(ViewGroup viewGroup) {
        this.f4329b = (LiveVoiceCallAuctionView) viewGroup;
        AnimEffectPlayer childAt = viewGroup.getChildAt(0);
        this.f4330c = childAt;
        String str = childAt == null ? "_panel_bg" : null;
        LiveVirtualVoicePanelCollapseView childAt2 = viewGroup.getChildAt(1);
        this.f4331d = childAt2;
        if (childAt2 == null) {
            str = "_collapse_view";
        }
        ConstraintLayout childAt3 = viewGroup.getChildAt(2);
        this.f4332e = childAt3;
        if (childAt3 == null) {
            str = "_content";
        }
        Group childAt4 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f4333f = childAt4;
        if (childAt4 == null) {
            str = "_final_group";
        }
        Group childAt5 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f4334g = childAt5;
        if (childAt5 == null) {
            str = "_ongoing_auctioneer_group";
        }
        Group childAt6 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f4335h = childAt6;
        if (childAt6 == null) {
            str = "_ongoing_group";
        }
        Guideline childAt7 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f4336i = childAt7;
        if (childAt7 == null) {
            str = "_top_baseline";
        }
        VText childAt8 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        this.f4337j = childAt8;
        if (childAt8 == null) {
            str = "_live_bidder_start";
        }
        VText childAt9 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        this.f4338k = childAt9;
        if (childAt9 == null) {
            str = "_auction_step_action";
        }
        VLinear childAt10 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        this.f4340l = childAt10;
        if (childAt10 == null) {
            str = "_live_final_relation_layout";
        }
        VDraweeView childAt11 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(0);
        this.f4341m = childAt11;
        if (childAt11 == null) {
            str = "_live_final_relation_layout_final_relation_img";
        }
        TextView textView = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6)).getChildAt(1);
        this.f4342n = textView;
        if (textView == null) {
            str = "_live_final_relation_layout_final_relation_name";
        }
        VDraweeView childAt12 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(7);
        this.f4343o = childAt12;
        if (childAt12 == null) {
            str = "_live_final_bidder_avatar";
        }
        TextView textView2 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(8);
        this.f4344p = textView2;
        if (textView2 == null) {
            str = "_live_final_bidder_name";
        }
        VText childAt13 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(9);
        this.f4346q = childAt13;
        if (childAt13 == null) {
            str = "_live_final_bidder_value";
        }
        VDraweeView childAt14 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(10);
        this.f4347r = childAt14;
        if (childAt14 == null) {
            str = "_live_final_bidder_tag";
        }
        VDraweeView childAt15 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(11);
        this.f4348s = childAt15;
        if (childAt15 == null) {
            str = "_live_final_auctioneer_avatar";
        }
        TextView textView3 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(12);
        this.f4349t = textView3;
        if (textView3 == null) {
            str = "_live_final_auctioneer_name";
        }
        VText childAt16 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(13);
        this.f4350u = childAt16;
        if (childAt16 == null) {
            str = "_live_final_auctioneer_value";
        }
        VDraweeView childAt17 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(14);
        this.f4351v = childAt17;
        if (childAt17 == null) {
            str = "_live_final_auctioneer_tag";
        }
        VoiceAuctionAvatarView childAt18 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15);
        this.f4352w = childAt18;
        if (childAt18 == null) {
            str = "_live_auctioneer_avatar";
        }
        VDraweeView childAt19 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(0);
        this.f4353x = childAt19;
        if (childAt19 == null) {
            str = "_avatar_3";
        }
        VDraweeView childAt20 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(1);
        this.f4354y = childAt20;
        if (childAt20 == null) {
            str = "_avatar_2";
        }
        VDraweeView childAt21 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(15)).getChildAt(2);
        this.f4355z = childAt21;
        if (childAt21 == null) {
            str = "_avatar_1";
        }
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = (CommonAnimMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(16);
        this.f4298A = commonAnimMaskAvatarView;
        if (commonAnimMaskAvatarView == null) {
            str = "_virtual_avatar_view";
        }
        TextView textView4 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(17);
        this.f4299B = textView4;
        if (textView4 == null) {
            str = "_live_auctioneer_name";
        }
        VText childAt22 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(18);
        this.f4300C = childAt22;
        if (childAt22 == null) {
            str = "_live_auctioneer_value";
        }
        VDraweeView childAt23 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(19);
        this.f4301D = childAt23;
        if (childAt23 == null) {
            str = "_live_relation_img";
        }
        TextView textView5 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(20);
        this.f4302E = textView5;
        if (textView5 == null) {
            str = "_live_relation_name";
        }
        VText childAt24 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(21);
        this.f4304F = childAt24;
        if (childAt24 == null) {
            str = "_live_relation_tip";
        }
        LevelView childAt25 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(22);
        this.f4306G = childAt25;
        if (childAt25 == null) {
            str = "_auctioneer_level";
        }
        ConstraintLayout childAt26 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23);
        this.f4308H = childAt26;
        if (childAt26 == null) {
            str = "_live_bidder_order_1";
        }
        VDraweeView childAt27 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(0);
        this.f4310I = childAt27;
        if (childAt27 == null) {
            str = "_live_bidder_order_1_bidder_bg";
        }
        VText childAt28 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(1);
        this.f4312J = childAt28;
        if (childAt28 == null) {
            str = "_live_bidder_order_1_bidder_price";
        }
        VText childAt29 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(2);
        this.f4314K = childAt29;
        if (childAt29 == null) {
            str = "_live_bidder_order_1_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(3);
        this.f4316L = commonMaskAvatarView;
        if (commonMaskAvatarView == null) {
            str = "_live_bidder_order_1_bidder_avatar";
        }
        VText childAt30 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(4)).getChildAt(0);
        this.f4317M = childAt30;
        if (childAt30 == null) {
            str = "_live_bidder_order_1_bidder_order";
        }
        VText childAt31 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(23)).getChildAt(4)).getChildAt(1);
        this.f4318N = childAt31;
        if (childAt31 == null) {
            str = "_live_bidder_order_1_bidder_name";
        }
        ConstraintLayout childAt32 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24);
        this.f4319O = childAt32;
        if (childAt32 == null) {
            str = "_live_bidder_order_2";
        }
        VDraweeView childAt33 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(0);
        this.f4320P = childAt33;
        if (childAt33 == null) {
            str = "_live_bidder_order_2_bidder_bg";
        }
        VText childAt34 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(1);
        this.f4321Q = childAt34;
        if (childAt34 == null) {
            str = "_live_bidder_order_2_bidder_price";
        }
        VText childAt35 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(2);
        this.f4322R = childAt35;
        if (childAt35 == null) {
            str = "_live_bidder_order_2_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView2 = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(3);
        this.f4323S = commonMaskAvatarView2;
        if (commonMaskAvatarView2 == null) {
            str = "_live_bidder_order_2_bidder_avatar";
        }
        VText childAt36 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(4)).getChildAt(0);
        this.f4324T = childAt36;
        if (childAt36 == null) {
            str = "_live_bidder_order_2_bidder_order";
        }
        VText childAt37 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(24)).getChildAt(4)).getChildAt(1);
        this.f4325U = childAt37;
        if (childAt37 == null) {
            str = "_live_bidder_order_2_bidder_name";
        }
        ConstraintLayout childAt38 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25);
        this.f4326V = childAt38;
        if (childAt38 == null) {
            str = "_live_bidder_order_3";
        }
        VDraweeView childAt39 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(0);
        this.f4327W = childAt39;
        if (childAt39 == null) {
            str = "_live_bidder_order_3_bidder_bg";
        }
        VText childAt40 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(1);
        this.f4339k0 = childAt40;
        if (childAt40 == null) {
            str = "_live_bidder_order_3_bidder_price";
        }
        VText childAt41 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(2);
        this.f4345p0 = childAt41;
        if (childAt41 == null) {
            str = "_live_bidder_order_3_bidder_empty_order";
        }
        CommonMaskAvatarView commonMaskAvatarView3 = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(3);
        this.f4303E0 = commonMaskAvatarView3;
        if (commonMaskAvatarView3 == null) {
            str = "_live_bidder_order_3_bidder_avatar";
        }
        VText childAt42 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(4)).getChildAt(0);
        this.f4305F0 = childAt42;
        if (childAt42 == null) {
            str = "_live_bidder_order_3_bidder_order";
        }
        VText childAt43 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(25)).getChildAt(4)).getChildAt(1);
        this.f4307G0 = childAt43;
        if (childAt43 == null) {
            str = "_live_bidder_order_3_bidder_name";
        }
        TextView textView6 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(26);
        this.f4309H0 = textView6;
        if (textView6 == null) {
            str = "_live_auction_gap";
        }
        VLinear childAt44 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27);
        this.f4311I0 = childAt44;
        if (childAt44 == null) {
            str = "_live_bless_end_layout";
        }
        VText childAt45 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27)).getChildAt(0);
        this.f4313J0 = childAt45;
        if (childAt45 == null) {
            str = "_live_bless_end_layout_live_auction_end";
        }
        VText childAt46 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(27)).getChildAt(1);
        this.f4315K0 = childAt46;
        if (childAt46 == null) {
            str = "_live_bless_end_layout_live_bless_start";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public LiveVoiceCallAuctionView getRoot() {
        return this.f4329b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5527i1(T t) {
        this.f4328a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19715V7, viewGroup, false);
        m5526a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5526a(this);
    }

    public LiveVoiceCallAuctionViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceCallAuctionViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
