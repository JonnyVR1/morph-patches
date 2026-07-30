package com.p051p1.mobile.android.p053ui.cropiwa.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p153l.bwb;
import p153l.fwb;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaRectShape extends fwb {

    public static class RectShapeMask implements CropIwaShapeMask {
        @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaShapeMask
        public Bitmap applyMaskTo(Bitmap bitmap) {
            return bitmap;
        }

        private RectShapeMask() {
        }
    }

    public CropIwaRectShape(bwb bwbVar) {
        super(bwbVar);
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: b */
    public void mo22072b(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawRect(rectF, paint);
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: d */
    public void mo22073d(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawRect(rectF, paint);
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: g */
    public CropIwaShapeMask mo22075g() {
        return new RectShapeMask();
    }
}
