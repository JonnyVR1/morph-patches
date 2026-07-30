package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListItem;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionLeaderboardItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionLeaderboardListItem f48195a;

    /* JADX INFO: renamed from: b */
    public VLinear f48196b;

    /* JADX INFO: renamed from: c */
    public VText f48197c;

    /* JADX INFO: renamed from: d */
    public VText f48198d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f48199e;

    /* JADX INFO: renamed from: f */
    public VText f48200f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f48201g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f48202h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f48203i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f48204j;

    /* JADX INFO: renamed from: k */
    public VText f48205k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f48206l;

    /* JADX INFO: renamed from: m */
    public VText f48207m;

    /* JADX INFO: renamed from: n */
    public VText f48208n;

    public LiveVoiceAuctionLeaderboardItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72053a(ViewGroup viewGroup) {
        this.f48195a = (LiveVoiceAuctionLeaderboardListItem) viewGroup;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(0);
        this.f48196b = vLinear;
        String str = vLinear == null ? "_time_layout" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48197c = vText;
        if (vText == null) {
            str = "_time_layout_day";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f48198d = vText2;
        if (vText2 == null) {
            str = "_time_layout_month";
        }
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48199e = animEffectPlayer;
        if (animEffectPlayer == null) {
            str = "_rank_svga";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f48200f = vText3;
        if (vText3 == null) {
            str = "_rank";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f48201g = vDraweeView;
        if (vDraweeView == null) {
            str = "_avatar_view";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f48202h = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_avatar_view_other";
        }
        VDraweeView vDraweeView3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f48203i = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_avatar_tag_view";
        }
        VDraweeView vDraweeView4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f48204j = vDraweeView4;
        if (vDraweeView4 == null) {
            str = "_avatar_tag_view_other";
        }
        VText vText4 = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f48205k = vText4;
        if (vText4 == null) {
            str = "_name";
        }
        VDraweeView vDraweeView5 = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        this.f48206l = vDraweeView5;
        if (vDraweeView5 == null) {
            str = "_relation_img";
        }
        VText vText5 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        this.f48207m = vText5;
        if (vText5 == null) {
            str = "_relation";
        }
        VText vText6 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        this.f48208n = vText6;
        if (vText6 == null) {
            str = "_user_worth";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionLeaderboardListItem getRoot() {
        return this.f48195a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72053a(this);
    }

    public LiveVoiceAuctionLeaderboardItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
