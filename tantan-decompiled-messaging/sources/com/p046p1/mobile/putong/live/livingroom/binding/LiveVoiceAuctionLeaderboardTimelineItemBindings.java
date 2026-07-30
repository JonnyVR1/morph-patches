package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListTimelineItem;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionLeaderboardTimelineItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionLeaderboardListTimelineItem f48221a;

    /* JADX INFO: renamed from: b */
    public VText f48222b;

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72055a(ViewGroup viewGroup) {
        this.f48221a = (LiveVoiceAuctionLeaderboardListTimelineItem) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48222b = vText;
        String str = vText == null ? "_rank" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionLeaderboardListTimelineItem getRoot() {
        return this.f48221a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72055a(this);
    }

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
