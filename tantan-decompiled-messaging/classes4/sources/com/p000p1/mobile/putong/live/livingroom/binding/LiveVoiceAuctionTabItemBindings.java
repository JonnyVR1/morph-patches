package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabItemView;
import l.jfd0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionTabItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceAuctionTabItemView f4290a;

    /* JADX INFO: renamed from: b */
    public VText f4291b;

    public LiveVoiceAuctionTabItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5521a(ViewGroup viewGroup) {
        this.f4290a = (VoiceAuctionTabItemView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4291b = childAt;
        String str = childAt == null ? "_tab" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public VoiceAuctionTabItemView getRoot() {
        return this.f4290a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5521a(this);
    }

    public LiveVoiceAuctionTabItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionTabItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
