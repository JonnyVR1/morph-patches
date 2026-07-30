package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageView;
import l.jfd0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionBasePriceGiftPageBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelationPageView f4235a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f4236b;

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5509a(ViewGroup viewGroup) {
        this.f4235a = (RelationPageView) viewGroup;
        VRecyclerView childAt = viewGroup.getChildAt(0);
        this.f4236b = childAt;
        String str = childAt == null ? "_relations" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public RelationPageView getRoot() {
        return this.f4235a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5509a(this);
    }

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
