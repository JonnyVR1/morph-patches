package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabItemView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionTabItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceAuctionTabItemView f49096a;

    /* JADX INFO: renamed from: b */
    public VText f49097b;

    public LiveVoiceAuctionTabItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73243a(ViewGroup viewGroup) {
        this.f49096a = (VoiceAuctionTabItemView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f49097b = vText;
        String str = vText == null ? "_tab" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public VoiceAuctionTabItemView getRoot() {
        return this.f49096a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73243a(this);
    }

    public LiveVoiceAuctionTabItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionTabItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
