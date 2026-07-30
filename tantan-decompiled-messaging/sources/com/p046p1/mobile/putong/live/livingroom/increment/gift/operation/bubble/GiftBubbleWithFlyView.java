package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.bubble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.ArrayList;
import java.util.List;
import p149l.d30;
import p149l.glj;
import p149l.ihs;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class GiftBubbleWithFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49770a;

    /* JADX INFO: renamed from: b */
    public final List<GiftLongPressFlyView> f49771b;

    /* JADX INFO: renamed from: c */
    public final int[] f49772c;

    /* JADX INFO: renamed from: d */
    public int f49773d;

    public GiftBubbleWithFlyView(@NonNull Context context) {
        super(context);
        this.f49771b = new ArrayList();
        this.f49772c = new int[]{16, -16, -36, 20};
        this.f49773d = 0;
    }

    private GiftLongPressFlyView getReleaseFlyView() {
        if (vwb.m200296J(this.f49771b)) {
            return new GiftLongPressFlyView(getContext());
        }
        GiftLongPressFlyView giftLongPressFlyView = this.f49771b.get(0);
        this.f49771b.remove(giftLongPressFlyView);
        ViewParent parent = giftLongPressFlyView.getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).removeView(giftLongPressFlyView);
        }
        return giftLongPressFlyView;
    }

    /* JADX INFO: renamed from: b */
    public final void m73716b(View view) {
        glj.m126771a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m73717c(GiftLongPressFlyView giftLongPressFlyView) {
        this.f49771b.add(giftLongPressFlyView);
    }

    /* JADX INFO: renamed from: d */
    public void m73718d() {
        this.f49771b.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m73719e(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z, int[] iArr) {
        int[] iArr2 = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr2);
        if (z && liveGiftItemView.m73474E0() && !ihsVar.m136278c()) {
            final GiftLongPressFlyView releaseFlyView = getReleaseFlyView();
            int iM186890d = t100.m186890d(52.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM186890d, iM186890d);
            int width = iArr2[0] + (liveGiftItemView.getWidth() / 2);
            int i = t100.f167269r;
            layoutParams.leftMargin = width - i;
            layoutParams.topMargin = (iArr2[1] + (liveGiftItemView.getHeight() / 2)) - i;
            this.f49770a.addView(releaseFlyView, layoutParams);
            releaseFlyView.m73725A(liveGiftItemView, ihsVar, iArr, this.f49772c, this.f49773d, new d30() { // from class: l.flj
                @Override // p149l.d30
                public final void call() {
                    this.f98185a.m73717c(releaseFlyView);
                }
            });
            this.f49773d++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73716b(this);
    }

    public GiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49771b = new ArrayList();
        this.f49772c = new int[]{16, -16, -36, 20};
        this.f49773d = 0;
    }

    public GiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49771b = new ArrayList();
        this.f49772c = new int[]{16, -16, -36, 20};
        this.f49773d = 0;
    }
}
