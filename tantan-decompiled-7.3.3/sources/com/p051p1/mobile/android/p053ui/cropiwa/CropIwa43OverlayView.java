package com.p051p1.mobile.android.p053ui.cropiwa;

import android.content.Context;
import p153l.bwb;
import p153l.q11;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwa43OverlayView extends CropIwaOverlayView {
    public CropIwa43OverlayView(Context context, bwb bwbVar) {
        super(context, bwbVar);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo21912o() {
        q11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null) {
            return;
        }
        if (this.f16519e.width() == 0.0f || this.f16519e.height() == 0.0f || Math.abs((this.f16519e.width() / this.f16519e.height()) - aspectRatio.m174804b()) >= 0.001d) {
            float f = measuredWidth * 0.5f;
            float f2 = measuredHeight * 0.5f;
            float f3 = (measuredWidth * 5.0f < measuredHeight * 4.0f ? measuredWidth * 0.9f : 0.8f * measuredHeight * 0.9f) * 0.5f;
            float f4 = (5.0f * f3) / 4.0f;
            this.f16519e.set(f - f3, f2 - f4, f + f3, f2 + f4);
        }
    }
}
