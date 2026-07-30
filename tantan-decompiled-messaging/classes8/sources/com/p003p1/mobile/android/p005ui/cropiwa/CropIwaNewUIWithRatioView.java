package com.p003p1.mobile.android.p005ui.cropiwa;

import android.annotation.SuppressLint;
import p007l.j11;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@SuppressLint({"ViewConstructor"})
class CropIwaNewUIWithRatioView extends CropIwaOverlayView {
    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo1185o() {
        j11 aspectRatio;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0.0f || measuredHeight == 0.0f || (aspectRatio = getAspectRatio()) == null || aspectRatio.m9452b() == 0.0f) {
            return;
        }
        if (this.f1499e.width() == 0.0f || this.f1499e.height() == 0.0f || Math.abs((this.f1499e.width() / this.f1499e.height()) - aspectRatio.m9452b()) >= 0.001d) {
            float f = measuredHeight * 0.5f;
            float f2 = measuredWidth * 0.5f;
            float fM10127p = this.f1501g.m10127p() * 0.5f;
            float fM9452b = fM10127p / aspectRatio.m9452b();
            this.f1499e.set(f2 - fM10127p, f - fM9452b, f2 + fM10127p, f + fM9452b);
        }
    }
}
