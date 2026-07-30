package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionBasePriceGiftItemBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelationPageItemView f48188a;

    /* JADX INFO: renamed from: b */
    public View f48189b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48190c;

    /* JADX INFO: renamed from: d */
    public VText f48191d;

    /* JADX INFO: renamed from: e */
    public VText f48192e;

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72051a(ViewGroup viewGroup) {
        this.f48188a = (RelationPageItemView) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f48189b = childAt;
        String str = childAt == null ? "_bg" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48190c = vDraweeView;
        if (vDraweeView == null) {
            str = "_icon";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f48191d = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f48192e = vText2;
        if (vText2 == null) {
            str = "_price";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public RelationPageItemView getRoot() {
        return this.f48188a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72051a(this);
    }

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
