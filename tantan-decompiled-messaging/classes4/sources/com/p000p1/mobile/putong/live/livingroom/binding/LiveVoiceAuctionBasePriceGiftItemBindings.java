package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageItemView;
import l.jfd0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionBasePriceGiftItemBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelationPageItemView f4230a;

    /* JADX INFO: renamed from: b */
    public View f4231b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4232c;

    /* JADX INFO: renamed from: d */
    public VText f4233d;

    /* JADX INFO: renamed from: e */
    public VText f4234e;

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5508a(ViewGroup viewGroup) {
        this.f4230a = (RelationPageItemView) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f4231b = childAt;
        String str = childAt == null ? "_bg" : null;
        VDraweeView childAt2 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4232c = childAt2;
        if (childAt2 == null) {
            str = "_icon";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f4233d = childAt3;
        if (childAt3 == null) {
            str = "_name";
        }
        VText childAt4 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f4234e = childAt4;
        if (childAt4 == null) {
            str = "_price";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public RelationPageItemView getRoot() {
        return this.f4230a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5508a(this);
    }

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionBasePriceGiftItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
