package com.p051p1.mobile.android.p053ui.cropiwa;

import android.content.Context;
import p153l.bwb;
import p153l.q11;
import p153l.qa00;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaNewProfileOverlayView extends CropIwaOverlayView {
    public CropIwaNewProfileOverlayView(Context context, bwb bwbVar) {
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
            float fM175859d = (measuredWidth - qa00.m175859d(16.0f)) * 0.5f;
            float f3 = (5.0f * fM175859d) / 4.0f;
            this.f16519e.set(f - fM175859d, f2 - f3, f + fM175859d, f2 + f3);
        }
    }
}
