package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.ArrayList;
import java.util.List;
import p153l.aku;
import p153l.jjs;
import p153l.jyb;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftBubbleWithFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f46114a;

    /* JADX INFO: renamed from: b */
    public final List<LiveVChatGiftLongPressFlyView> f46115b;

    /* JADX INFO: renamed from: c */
    public final int[] f46116c;

    /* JADX INFO: renamed from: d */
    public int f46117d;

    public LiveVChatGiftBubbleWithFlyView(@NonNull Context context) {
        super(context);
        this.f46115b = new ArrayList();
        this.f46116c = new int[]{16, -16, -36, 20};
        this.f46117d = 0;
    }

    private LiveVChatGiftLongPressFlyView getReleaseFlyView() {
        if (jyb.m147479J(this.f46115b)) {
            return new LiveVChatGiftLongPressFlyView(getContext());
        }
        LiveVChatGiftLongPressFlyView liveVChatGiftLongPressFlyView = this.f46115b.get(0);
        this.f46115b.remove(liveVChatGiftLongPressFlyView);
        ViewParent parent = liveVChatGiftLongPressFlyView.getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).removeView(liveVChatGiftLongPressFlyView);
        }
        return liveVChatGiftLongPressFlyView;
    }

    /* JADX INFO: renamed from: b */
    public final void m70747b(View view) {
        aku.m98625a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m70748c(LiveVChatGiftLongPressFlyView liveVChatGiftLongPressFlyView) {
        this.f46115b.add(liveVChatGiftLongPressFlyView);
    }

    /* JADX INFO: renamed from: d */
    public void m70749d() {
        this.f46115b.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m70750e(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, boolean z, int[] iArr) {
        int[] iArr2 = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr2);
        if (z && liveVChatGiftItemView.m70603B0() && !jjsVar.m145117c()) {
            final LiveVChatGiftLongPressFlyView releaseFlyView = getReleaseFlyView();
            int iM175859d = qa00.m175859d(52.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM175859d, iM175859d);
            int width = iArr2[0] + (liveVChatGiftItemView.getWidth() / 2);
            int i = qa00.f156331r;
            layoutParams.leftMargin = width - i;
            layoutParams.topMargin = (iArr2[1] + (liveVChatGiftItemView.getHeight() / 2)) - i;
            this.f46114a.addView(releaseFlyView, layoutParams);
            releaseFlyView.m70753A(liveVChatGiftItemView, jjsVar, iArr, this.f46116c, this.f46117d, new x20() { // from class: l.zju
                @Override // p153l.x20
                public final void call() {
                    this.f204707a.m70748c(releaseFlyView);
                }
            });
            this.f46117d++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70747b(this);
    }

    public LiveVChatGiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46115b = new ArrayList();
        this.f46116c = new int[]{16, -16, -36, 20};
        this.f46117d = 0;
    }

    public LiveVChatGiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46115b = new ArrayList();
        this.f46116c = new int[]{16, -16, -36, 20};
        this.f46117d = 0;
    }
}
