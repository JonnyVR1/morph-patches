package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListTimelineItem;
import l.jfd0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionLeaderboardTimelineItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionLeaderboardListTimelineItem f4263a;

    /* JADX INFO: renamed from: b */
    public VText f4264b;

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5514a(ViewGroup viewGroup) {
        this.f4263a = (LiveVoiceAuctionLeaderboardListTimelineItem) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4264b = childAt;
        String str = childAt == null ? "_rank" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionLeaderboardListTimelineItem getRoot() {
        return this.f4263a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5514a(this);
    }

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
