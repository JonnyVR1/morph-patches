package com.p003p1.mobile.android.p005ui.cropiwa;

import android.content.Context;
import l.t100;
import p007l.j11;
import p007l.nub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropIwaNewProfileOverlayView extends CropIwaOverlayView {
    public CropIwaNewProfileOverlayView(Context context, nub nubVar) {
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
            float fD = (measuredWidth - t100.d(16.0f)) * 0.5f;
            float f3 = (5.0f * fD) / 4.0f;
            this.f1499e.set(f - fD, f2 - f3, f + fD, f2 + f3);
        }
    }
}
