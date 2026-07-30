package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageView;
import p151v.VRecyclerView;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionBasePriceGiftPageBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelationPageView f49041a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f49042b;

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73235a(ViewGroup viewGroup) {
        this.f49041a = (RelationPageView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f49042b = vRecyclerView;
        String str = vRecyclerView == null ? "_relations" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public RelationPageView getRoot() {
        return this.f49041a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73235a(this);
    }

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
