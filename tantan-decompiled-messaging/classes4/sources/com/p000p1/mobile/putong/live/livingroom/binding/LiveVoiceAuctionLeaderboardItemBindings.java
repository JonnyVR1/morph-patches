package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListItem;
import l.jfd0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionLeaderboardItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionLeaderboardListItem f4237a;

    /* JADX INFO: renamed from: b */
    public VLinear f4238b;

    /* JADX INFO: renamed from: c */
    public VText f4239c;

    /* JADX INFO: renamed from: d */
    public VText f4240d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f4241e;

    /* JADX INFO: renamed from: f */
    public VText f4242f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4243g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4244h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4245i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f4246j;

    /* JADX INFO: renamed from: k */
    public VText f4247k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f4248l;

    /* JADX INFO: renamed from: m */
    public VText f4249m;

    /* JADX INFO: renamed from: n */
    public VText f4250n;

    public LiveVoiceAuctionLeaderboardItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5510a(ViewGroup viewGroup) {
        this.f4237a = (LiveVoiceAuctionLeaderboardListItem) viewGroup;
        VLinear childAt = viewGroup.getChildAt(0);
        this.f4238b = childAt;
        String str = childAt == null ? "_time_layout" : null;
        VText childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4239c = childAt2;
        if (childAt2 == null) {
            str = "_time_layout_day";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        this.f4240d = childAt3;
        if (childAt3 == null) {
            str = "_time_layout_month";
        }
        AnimEffectPlayer childAt4 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4241e = childAt4;
        if (childAt4 == null) {
            str = "_rank_svga";
        }
        VText childAt5 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f4242f = childAt5;
        if (childAt5 == null) {
            str = "_rank";
        }
        VDraweeView childAt6 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f4243g = childAt6;
        if (childAt6 == null) {
            str = "_avatar_view";
        }
        VDraweeView childAt7 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f4244h = childAt7;
        if (childAt7 == null) {
            str = "_avatar_view_other";
        }
        VDraweeView childAt8 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f4245i = childAt8;
        if (childAt8 == null) {
            str = "_avatar_tag_view";
        }
        VDraweeView childAt9 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        this.f4246j = childAt9;
        if (childAt9 == null) {
            str = "_avatar_tag_view_other";
        }
        VText childAt10 = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        this.f4247k = childAt10;
        if (childAt10 == null) {
            str = "_name";
        }
        VDraweeView childAt11 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        this.f4248l = childAt11;
        if (childAt11 == null) {
            str = "_relation_img";
        }
        VText childAt12 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        this.f4249m = childAt12;
        if (childAt12 == null) {
            str = "_relation";
        }
        VText childAt13 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
        this.f4250n = childAt13;
        if (childAt13 == null) {
            str = "_user_worth";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionLeaderboardListItem getRoot() {
        return this.f4237a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5510a(this);
    }

    public LiveVoiceAuctionLeaderboardItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
