package com.p051p1.mobile.android.p053ui.cropiwa;

import android.content.Context;
import p153l.bnl0;
import p153l.bwb;
import p153l.qa00;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaKanKanOverlayView extends CropIwaOverlayView {
    public CropIwaKanKanOverlayView(Context context, bwb bwbVar) {
        super(context, bwbVar);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo21912o() {
        float fM175859d = qa00.m175859d(12.0f);
        float fM175859d2 = qa00.m175859d(8.0f) + qa00.m175859d(56.0f);
        float fM105592y0 = bnl0.m105592y0() - (fM175859d * 2.0f);
        float measuredHeight = (fM105592y0 * 16.0f) / 9.0f;
        if (measuredHeight >= (getMeasuredHeight() - qa00.m175859d(56.0f)) - (qa00.m175859d(8.0f) * 2)) {
            measuredHeight = (getMeasuredHeight() - qa00.m175859d(56.0f)) - (qa00.m175859d(8.0f) * 2);
            fM105592y0 = (9.0f * measuredHeight) / 16.0f;
            fM175859d = (getMeasuredWidth() - fM105592y0) / 2.0f;
        } else if (fM105592y0 >= getMeasuredWidth() - (qa00.m175859d(12.0f) * 2)) {
            fM105592y0 = getMeasuredWidth() - (qa00.m175859d(12.0f) * 2);
            measuredHeight = (16.0f * fM105592y0) / 9.0f;
            fM175859d2 = (((getMeasuredHeight() - qa00.m175859d(56.0f)) - measuredHeight) / 2.0f) + qa00.m175859d(56.0f);
        }
        this.f16519e.set(fM175859d, fM175859d2, fM105592y0 + fM175859d, measuredHeight + fM175859d2);
    }
}
