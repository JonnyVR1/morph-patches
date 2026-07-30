package com.p046p1.mobile.android.p048ui.cropiwa;

import android.content.Context;
import p149l.nub;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaKanKanOverlayView extends CropIwaOverlayView {
    public CropIwaKanKanOverlayView(Context context, nub nubVar) {
        super(context, nubVar);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.CropIwaOverlayView
    /* JADX INFO: renamed from: o */
    public void mo20913o() {
        float fM186890d = t100.m186890d(12.0f);
        float fM186890d2 = t100.m186890d(8.0f) + t100.m186890d(56.0f);
        float fM208412y0 = xdl0.m208412y0() - (fM186890d * 2.0f);
        float measuredHeight = (fM208412y0 * 16.0f) / 9.0f;
        if (measuredHeight >= (getMeasuredHeight() - t100.m186890d(56.0f)) - (t100.m186890d(8.0f) * 2)) {
            measuredHeight = (getMeasuredHeight() - t100.m186890d(56.0f)) - (t100.m186890d(8.0f) * 2);
            fM208412y0 = (9.0f * measuredHeight) / 16.0f;
            fM186890d = (getMeasuredWidth() - fM208412y0) / 2.0f;
        } else if (fM208412y0 >= getMeasuredWidth() - (t100.m186890d(12.0f) * 2)) {
            fM208412y0 = getMeasuredWidth() - (t100.m186890d(12.0f) * 2);
            measuredHeight = (16.0f * fM208412y0) / 9.0f;
            fM186890d2 = (((getMeasuredHeight() - t100.m186890d(56.0f)) - measuredHeight) / 2.0f) + t100.m186890d(56.0f);
        }
        this.f15800e.set(fM186890d, fM186890d2, fM208412y0 + fM186890d, measuredHeight + fM186890d2);
    }
}
