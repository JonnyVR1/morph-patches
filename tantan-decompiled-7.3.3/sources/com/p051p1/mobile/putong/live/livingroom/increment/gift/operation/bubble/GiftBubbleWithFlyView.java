package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.bubble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.ArrayList;
import java.util.List;
import p153l.jjs;
import p153l.jyb;
import p153l.qa00;
import p153l.wnj;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class GiftBubbleWithFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f50618a;

    /* JADX INFO: renamed from: b */
    public final List<GiftLongPressFlyView> f50619b;

    /* JADX INFO: renamed from: c */
    public final int[] f50620c;

    /* JADX INFO: renamed from: d */
    public int f50621d;

    public GiftBubbleWithFlyView(@NonNull Context context) {
        super(context);
        this.f50619b = new ArrayList();
        this.f50620c = new int[]{16, -16, -36, 20};
        this.f50621d = 0;
    }

    private GiftLongPressFlyView getReleaseFlyView() {
        if (jyb.m147479J(this.f50619b)) {
            return new GiftLongPressFlyView(getContext());
        }
        GiftLongPressFlyView giftLongPressFlyView = this.f50619b.get(0);
        this.f50619b.remove(giftLongPressFlyView);
        ViewParent parent = giftLongPressFlyView.getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).removeView(giftLongPressFlyView);
        }
        return giftLongPressFlyView;
    }

    /* JADX INFO: renamed from: b */
    public final void m74899b(View view) {
        wnj.m207211a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m74900c(GiftLongPressFlyView giftLongPressFlyView) {
        this.f50619b.add(giftLongPressFlyView);
    }

    /* JADX INFO: renamed from: d */
    public void m74901d() {
        this.f50619b.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m74902e(LiveGiftItemView liveGiftItemView, jjs jjsVar, boolean z, int[] iArr) {
        int[] iArr2 = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr2);
        if (z && liveGiftItemView.m74657E0() && !jjsVar.m145117c()) {
            final GiftLongPressFlyView releaseFlyView = getReleaseFlyView();
            int iM175859d = qa00.m175859d(52.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM175859d, iM175859d);
            int width = iArr2[0] + (liveGiftItemView.getWidth() / 2);
            int i = qa00.f156331r;
            layoutParams.leftMargin = width - i;
            layoutParams.topMargin = (iArr2[1] + (liveGiftItemView.getHeight() / 2)) - i;
            this.f50618a.addView(releaseFlyView, layoutParams);
            releaseFlyView.m74908A(liveGiftItemView, jjsVar, iArr, this.f50620c, this.f50621d, new x20() { // from class: l.vnj
                @Override // p153l.x20
                public final void call() {
                    this.f184883a.m74900c(releaseFlyView);
                }
            });
            this.f50621d++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74899b(this);
    }

    public GiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50619b = new ArrayList();
        this.f50620c = new int[]{16, -16, -36, 20};
        this.f50621d = 0;
    }

    public GiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50619b = new ArrayList();
        this.f50620c = new int[]{16, -16, -36, 20};
        this.f50621d = 0;
    }
}
