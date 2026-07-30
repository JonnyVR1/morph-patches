package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.bubble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.t100;
import l.vwb;
import p002l.glj;
import p002l.ihs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftBubbleWithFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5812a;

    /* JADX INFO: renamed from: b */
    public final List<GiftLongPressFlyView> f5813b;

    /* JADX INFO: renamed from: c */
    public final int[] f5814c;

    /* JADX INFO: renamed from: d */
    public int f5815d;

    public GiftBubbleWithFlyView(@NonNull Context context) {
        super(context);
        this.f5813b = new ArrayList();
        this.f5814c = new int[]{16, -16, -36, 20};
        this.f5815d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftLongPressFlyView, java.lang.Object] */
    private GiftLongPressFlyView getReleaseFlyView() {
        if (vwb.J(this.f5813b)) {
            return new GiftLongPressFlyView(getContext());
        }
        GiftLongPressFlyView giftLongPressFlyView = this.f5813b.get(0);
        this.f5813b.remove(giftLongPressFlyView);
        ViewParent parent = giftLongPressFlyView.getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).removeView(giftLongPressFlyView);
        }
        return giftLongPressFlyView;
    }

    /* JADX INFO: renamed from: b */
    public final void m7266b(View view) {
        glj.m13896a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m7267c(GiftLongPressFlyView giftLongPressFlyView) {
        this.f5813b.add(giftLongPressFlyView);
    }

    /* JADX INFO: renamed from: d */
    public void m7268d() {
        this.f5813b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftLongPressFlyView] */
    /* JADX INFO: renamed from: e */
    public void m7269e(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z, int[] iArr) {
        int[] iArr2 = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr2);
        if (z && liveGiftItemView.m7016E0() && !ihsVar.m15155c()) {
            final ?? releaseFlyView = getReleaseFlyView();
            int iD = t100.d(52.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
            int width = iArr2[0] + (liveGiftItemView.getWidth() / 2);
            int i = t100.r;
            layoutParams.leftMargin = width - i;
            layoutParams.topMargin = (iArr2[1] + (liveGiftItemView.getHeight() / 2)) - i;
            this.f5812a.addView((View) releaseFlyView, layoutParams);
            releaseFlyView.m7275A(liveGiftItemView, ihsVar, iArr, this.f5814c, this.f5815d, new d30() { // from class: l.flj
                public final void call() {
                    this.f10461a.m7267c(releaseFlyView);
                }
            });
            this.f5815d++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7266b(this);
    }

    public GiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5813b = new ArrayList();
        this.f5814c = new int[]{16, -16, -36, 20};
        this.f5815d = 0;
    }

    public GiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5813b = new ArrayList();
        this.f5814c = new int[]{16, -16, -36, 20};
        this.f5815d = 0;
    }
}
