package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import l.jfd0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionQueueTabLayoutBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceAuctionTabView f4276a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f4277b;

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5519a(ViewGroup viewGroup) {
        this.f4276a = (VoiceAuctionTabView) viewGroup;
        VRecyclerView childAt = viewGroup.getChildAt(0);
        this.f4277b = childAt;
        String str = childAt == null ? "_tabs" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public VoiceAuctionTabView getRoot() {
        return this.f4276a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5519a(this);
    }

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
