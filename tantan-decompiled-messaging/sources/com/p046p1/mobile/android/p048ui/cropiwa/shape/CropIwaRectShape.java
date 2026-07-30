package com.p046p1.mobile.android.p048ui.cropiwa.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p149l.nub;
import p149l.rub;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaRectShape extends rub {

    public static class RectShapeMask implements CropIwaShapeMask {
        @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaShapeMask
        public Bitmap applyMaskTo(Bitmap bitmap) {
            return bitmap;
        }

        private RectShapeMask() {
        }
    }

    public CropIwaRectShape(nub nubVar) {
        super(nubVar);
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: b */
    public void mo21073b(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawRect(rectF, paint);
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: d */
    public void mo21074d(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawRect(rectF, paint);
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: g */
    public CropIwaShapeMask mo21076g() {
        return new RectShapeMask();
    }
}
