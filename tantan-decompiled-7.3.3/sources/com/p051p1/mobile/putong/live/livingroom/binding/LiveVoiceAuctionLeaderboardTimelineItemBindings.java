package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListTimelineItem;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionLeaderboardTimelineItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionLeaderboardListTimelineItem f49069a;

    /* JADX INFO: renamed from: b */
    public VText f49070b;

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73238a(ViewGroup viewGroup) {
        this.f49069a = (LiveVoiceAuctionLeaderboardListTimelineItem) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f49070b = vText;
        String str = vText == null ? "_rank" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionLeaderboardListTimelineItem getRoot() {
        return this.f49069a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73238a(this);
    }

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardTimelineItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
