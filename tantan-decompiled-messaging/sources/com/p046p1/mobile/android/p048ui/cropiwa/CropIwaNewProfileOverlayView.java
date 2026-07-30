package com.p046p1.mobile.android.p048ui.cropiwa;

import android.content.Context;
import p149l.j11;
import p149l.nub;
import p149l.t100;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaNewProfileOverlayView extends CropIwaOverlayView {
    public CropIwaNewProfileOverlayView(Context context, nub nubVar) {
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
            float fM186890d = (measuredWidth - t100.m186890d(16.0f)) * 0.5f;
            float f3 = (5.0f * fM186890d) / 4.0f;
            this.f15800e.set(f - fM186890d, f2 - f3, f + fM186890d, f2 + f3);
        }
    }
}
