package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import p147v.VRecyclerView;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionQueueTabLayoutBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceAuctionTabView f48234a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f48235b;

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72058a(ViewGroup viewGroup) {
        this.f48234a = (VoiceAuctionTabView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f48235b = vRecyclerView;
        String str = vRecyclerView == null ? "_tabs" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public VoiceAuctionTabView getRoot() {
        return this.f48234a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72058a(this);
    }

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
