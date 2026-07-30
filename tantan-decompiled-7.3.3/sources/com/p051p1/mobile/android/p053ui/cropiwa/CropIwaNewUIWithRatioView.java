package com.p051p1.mobile.android.p053ui.cropiwa;

import android.annotation.SuppressLint;
import p153l.q11;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaNewUIWithRatioView extends CropIwaOverlayView {
    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo21912o() {
        q11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null || aspectRatio.m174804b() == 0.0f) {
            return;
        }
        if (this.f16519e.width() == 0.0f || this.f16519e.height() == 0.0f || Math.abs((this.f16519e.width() / this.f16519e.height()) - aspectRatio.m174804b()) >= 0.001d) {
            float f = measuredHeight * 0.5f;
            float f2 = measuredWidth * 0.5f;
            float fM106680p = this.f16521g.m106680p() * 0.5f;
            float fM174804b = fM106680p / aspectRatio.m174804b();
            this.f16519e.set(f2 - fM106680p, f - fM174804b, f2 + fM106680p, f + fM174804b);
        }
    }
}
