package com.p046p1.mobile.android.p048ui.cropiwa;

import android.content.Context;
import p149l.j11;
import p149l.nub;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwa43OverlayView extends CropIwaOverlayView {
    public CropIwa43OverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo20913o() {
        j11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null) {
            return;
        }
        if (this.f15800e.width() == 0.0f || this.f15800e.height() == 0.0f || Math.abs((this.f15800e.width() / this.f15800e.height()) - aspectRatio.m139217b()) >= 0.001d) {
            float f = measuredWidth * 0.5f;
            float f2 = measuredHeight * 0.5f;
            float f3 = (measuredWidth * 5.0f < measuredHeight * 4.0f ? measuredWidth * 0.9f : 0.8f * measuredHeight * 0.9f) * 0.5f;
            float f4 = (5.0f * f3) / 4.0f;
            this.f15800e.set(f - f3, f2 - f4, f + f3, f2 + f4);
        }
    }
}
