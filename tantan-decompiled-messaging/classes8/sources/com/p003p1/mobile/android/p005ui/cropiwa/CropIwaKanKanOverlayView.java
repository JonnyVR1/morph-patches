package com.p003p1.mobile.android.p005ui.cropiwa;

import android.content.Context;
import l.t100;
import l.xdl0;
import p007l.nub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropIwaKanKanOverlayView extends CropIwaOverlayView {
    public CropIwaKanKanOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo1185o() {
        float fD = t100.d(12.0f);
        float fD2 = t100.d(8.0f) + t100.d(56.0f);
        float fY0 = xdl0.y0() - (fD * 2.0f);
        float measuredHeight = (fY0 * 16.0f) / 9.0f;
        if (measuredHeight >= (getMeasuredHeight() - t100.d(56.0f)) - (t100.d(8.0f) * 2)) {
            measuredHeight = (getMeasuredHeight() - t100.d(56.0f)) - (t100.d(8.0f) * 2);
            fY0 = (9.0f * measuredHeight) / 16.0f;
            fD = (getMeasuredWidth() - fY0) / 2.0f;
        } else if (fY0 >= getMeasuredWidth() - (t100.d(12.0f) * 2)) {
            fY0 = getMeasuredWidth() - (t100.d(12.0f) * 2);
            measuredHeight = (16.0f * fY0) / 9.0f;
            fD2 = (((getMeasuredHeight() - t100.d(56.0f)) - measuredHeight) / 2.0f) + t100.d(56.0f);
        }
        this.f1499e.set(fD, fD2, fY0 + fD, measuredHeight + fD2);
    }
}
