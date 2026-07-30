package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListItem;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionLeaderboardItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionLeaderboardListItem f49043a;

    /* JADX INFO: renamed from: b */
    public VLinear f49044b;

    /* JADX INFO: renamed from: c */
    public VText f49045c;

    /* JADX INFO: renamed from: d */
    public VText f49046d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f49047e;

    /* JADX INFO: renamed from: f */
    public VText f49048f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49049g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49050h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f49051i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f49052j;

    /* JADX INFO: renamed from: k */
    public VText f49053k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f49054l;

    /* JADX INFO: renamed from: m */
    public VText f49055m;

    /* JADX INFO: renamed from: n */
    public VText f49056n;

    public LiveVoiceAuctionLeaderboardItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73236a(ViewGroup viewGroup) {
        this.f49043a = (LiveVoiceAuctionLeaderboardListItem) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f49044b = vLinear;
        String str = vLinear == null ? "_time_layout" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f49045c = vText;
        if (vText == null) {
            str = "_time_layout_day";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f49046d = vText2;
        if (vText2 == null) {
            str = "_time_layout_month";
        }
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f49047e = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_rank_svga";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f49048f = vText3;
        if (vText3 == null) {
            str = "_rank";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f49049g = vDraweeView;
        if (vDraweeView == null) {
            str = "_avatar_view";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f49050h = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_avatar_view_other";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f49051i = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_avatar_tag_view";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f49052j = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_avatar_tag_view_other";
        }
        VText vText4 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f49053k = vText4;
        if (vText4 == null) {
            str = "_name";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        this.f49054l = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_relation_img";
        }
        VText vText5 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        this.f49055m = vText5;
        if (vText5 == null) {
            str = "_relation";
        }
        VText vText6 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        this.f49056n = vText6;
        if (vText6 == null) {
            str = "_user_worth";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionLeaderboardListItem getRoot() {
        return this.f49043a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73236a(this);
    }

    public LiveVoiceAuctionLeaderboardItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
