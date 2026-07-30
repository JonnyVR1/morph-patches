package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabItemView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionTabItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceAuctionTabItemView f48248a;

    /* JADX INFO: renamed from: b */
    public VText f48249b;

    public LiveVoiceAuctionTabItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72060a(ViewGroup viewGroup) {
        this.f48248a = (VoiceAuctionTabItemView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48249b = vText;
        String str = vText == null ? "_tab" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public VoiceAuctionTabItemView getRoot() {
        return this.f48248a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72060a(this);
    }

    public LiveVoiceAuctionTabItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionTabItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
