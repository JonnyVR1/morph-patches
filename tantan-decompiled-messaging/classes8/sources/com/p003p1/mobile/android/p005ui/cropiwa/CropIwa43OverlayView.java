package com.p003p1.mobile.android.p005ui.cropiwa;

import android.content.Context;
import p007l.j11;
import p007l.nub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropIwa43OverlayView extends CropIwaOverlayView {
    public CropIwa43OverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo1185o() {
        j11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null) {
            return;
        }
        if (this.f1499e.width() == 0.0f || this.f1499e.height() == 0.0f || Math.abs((this.f1499e.width() / this.f1499e.height()) - aspectRatio.m9452b()) >= 0.001d) {
            float f = measuredWidth * 0.5f;
            float f2 = measuredHeight * 0.5f;
            float f3 = (measuredWidth * 5.0f < measuredHeight * 4.0f ? measuredWidth * 0.9f : 0.8f * measuredHeight * 0.9f) * 0.5f;
            float f4 = (5.0f * f3) / 4.0f;
            this.f1499e.set(f - f3, f2 - f4, f + f3, f2 + f4);
        }
    }
}
