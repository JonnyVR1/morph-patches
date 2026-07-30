package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageView;
import p147v.VRecyclerView;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionBasePriceGiftPageBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelationPageView f48193a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f48194b;

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72052a(ViewGroup viewGroup) {
        this.f48193a = (RelationPageView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f48194b = vRecyclerView;
        String str = vRecyclerView == null ? "_relations" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public RelationPageView getRoot() {
        return this.f48193a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72052a(this);
    }

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionBasePriceGiftPageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
