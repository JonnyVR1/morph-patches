package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PkWinTimesBaseView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public float f52638a;

    public PkWinTimesBaseView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52638a = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo77475a();

    /* JADX INFO: renamed from: b */
    public void m77493b(Animator animator) {
        if (animator == null || !animator.isStarted()) {
            return;
        }
        animator.removeAllListeners();
        animator.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.skew(this.f52638a, 0.0f);
        super.dispatchDraw(canvas);
    }

    public void setWinTimes(long j) {
        mo77475a();
    }

    public PkWinTimesBaseView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkWinTimesBaseView(Context context) {
        this(context, null);
    }
}
