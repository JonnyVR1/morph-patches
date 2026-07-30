package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p149l.bmt;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSettingBaseView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f52042a;

    /* JADX INFO: renamed from: b */
    public LiveSettingView f52043b;

    public LiveSettingBaseView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76581a(View view) {
        bmt.m102674a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76581a(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        int iMax = 0;
        while (i3 < this.getChildCount()) {
            View childAt = this.getChildAt(i3);
            LiveSettingBaseView liveSettingBaseView = this;
            liveSettingBaseView.measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec((int) (((double) xdl0.m208408w0()) * 0.85d), 1073741824), 0);
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
