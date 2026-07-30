package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.ArrayList;
import java.util.List;
import p149l.d30;
import p149l.ihs;
import p149l.t100;
import p149l.vwb;
import p149l.zhu;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftBubbleWithFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f45266a;

    /* JADX INFO: renamed from: b */
    public final List<LiveVChatGiftLongPressFlyView> f45267b;

    /* JADX INFO: renamed from: c */
    public final int[] f45268c;

    /* JADX INFO: renamed from: d */
    public int f45269d;

    public LiveVChatGiftBubbleWithFlyView(@NonNull Context context) {
        super(context);
        this.f45267b = new ArrayList();
        this.f45268c = new int[]{16, -16, -36, 20};
        this.f45269d = 0;
    }

    private LiveVChatGiftLongPressFlyView getReleaseFlyView() {
        if (vwb.m200296J(this.f45267b)) {
            return new LiveVChatGiftLongPressFlyView(getContext());
        }
        LiveVChatGiftLongPressFlyView liveVChatGiftLongPressFlyView = this.f45267b.get(0);
        this.f45267b.remove(liveVChatGiftLongPressFlyView);
        ViewParent parent = liveVChatGiftLongPressFlyView.getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).removeView(liveVChatGiftLongPressFlyView);
        }
        return liveVChatGiftLongPressFlyView;
    }

    /* JADX INFO: renamed from: b */
    public final void m69564b(View view) {
        zhu.m218866a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m69565c(LiveVChatGiftLongPressFlyView liveVChatGiftLongPressFlyView) {
        this.f45267b.add(liveVChatGiftLongPressFlyView);
    }

    /* JADX INFO: renamed from: d */
    public void m69566d() {
        this.f45267b.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m69567e(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, boolean z, int[] iArr) {
        int[] iArr2 = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr2);
        if (z && liveVChatGiftItemView.m69420B0() && !ihsVar.m136278c()) {
            final LiveVChatGiftLongPressFlyView releaseFlyView = getReleaseFlyView();
            int iM186890d = t100.m186890d(52.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM186890d, iM186890d);
            int width = iArr2[0] + (liveVChatGiftItemView.getWidth() / 2);
            int i = t100.f167269r;
            layoutParams.leftMargin = width - i;
            layoutParams.topMargin = (iArr2[1] + (liveVChatGiftItemView.getHeight() / 2)) - i;
            this.f45266a.addView(releaseFlyView, layoutParams);
            releaseFlyView.m69570A(liveVChatGiftItemView, ihsVar, iArr, this.f45268c, this.f45269d, new d30() { // from class: l.yhu
                @Override // p149l.d30
                public final void call() {
                    this.f198395a.m69565c(releaseFlyView);
                }
            });
            this.f45269d++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69564b(this);
    }

    public LiveVChatGiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45267b = new ArrayList();
        this.f45268c = new int[]{16, -16, -36, 20};
        this.f45269d = 0;
    }

    public LiveVChatGiftBubbleWithFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45267b = new ArrayList();
        this.f45268c = new int[]{16, -16, -36, 20};
        this.f45269d = 0;
    }
}
