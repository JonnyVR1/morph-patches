package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionBasePriceGiftItemBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelationPageItemView f49036a;

    /* JADX INFO: renamed from: b */
    public View f49037b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49038c;

    /* JADX INFO: renamed from: d */
    public VText f49039d;

    /* JADX INFO: renamed from: e */
    public VText f49040e;

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73234a(ViewGroup viewGroup) {
        this.f49036a = (RelationPageItemView) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f49037b = childAt;
        String str = childAt == null ? "_bg" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f49038c = vDraweeView;
        if (vDraweeView == null) {
            str = "_icon";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f49039d = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f49040e = vText2;
        if (vText2 == null) {
            str = "_price";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public RelationPageItemView getRoot() {
        return this.f49036a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73234a(this);
    }

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
