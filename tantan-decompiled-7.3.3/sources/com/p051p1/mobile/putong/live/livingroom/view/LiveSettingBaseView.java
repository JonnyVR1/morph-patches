package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p153l.bnl0;
import p153l.dot;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSettingBaseView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f52890a;

    /* JADX INFO: renamed from: b */
    public LiveSettingView f52891b;

    public LiveSettingBaseView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77764a(View view) {
        dot.m117362a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77764a(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        int iMax = 0;
        while (i3 < this.getChildCount()) {
            View childAt = this.getChildAt(i3);
            LiveSettingBaseView liveSettingBaseView = this;
            liveSettingBaseView.measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec((int) (((double) bnl0.m105588w0()) * 0.85d), 1073741824), 0);
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
            i3++;
            this = liveSettingBaseView;
        }
        this.setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
    }

    public LiveSettingBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSettingBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
