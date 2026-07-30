package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import p151v.VRecyclerView;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionQueueTabLayoutBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceAuctionTabView f49082a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f49083b;

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73241a(ViewGroup viewGroup) {
        this.f49082a = (VoiceAuctionTabView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f49083b = vRecyclerView;
        String str = vRecyclerView == null ? "_tabs" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public VoiceAuctionTabView getRoot() {
        return this.f49082a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73241a(this);
    }

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueueTabLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
