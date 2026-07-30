package com.p046p1.mobile.android.p048ui.cropiwa;

import android.annotation.SuppressLint;
import p149l.j11;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaNewUIWithRatioView extends CropIwaOverlayView {
    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo20913o() {
        j11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null || aspectRatio.m139217b() == 0.0f) {
            return;
        }
        if (this.f15800e.width() == 0.0f || this.f15800e.height() == 0.0f || Math.abs((this.f15800e.width() / this.f15800e.height()) - aspectRatio.m139217b()) >= 0.001d) {
            float f = measuredHeight * 0.5f;
            float f2 = measuredWidth * 0.5f;
            float fM161472p = this.f15802g.m161472p() * 0.5f;
            float fM139217b = fM161472p / aspectRatio.m139217b();
            this.f15800e.set(f2 - fM161472p, f - fM139217b, f2 + fM161472p, f + fM139217b);
        }
    }
}
