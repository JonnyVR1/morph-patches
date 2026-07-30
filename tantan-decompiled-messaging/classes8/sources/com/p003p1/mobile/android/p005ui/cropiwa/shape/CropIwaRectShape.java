package com.p003p1.mobile.android.p005ui.cropiwa.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p007l.nub;
import p007l.rub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CropIwaRectShape extends rub {

    public static class RectShapeMask implements CropIwaShapeMask {
        @Override // com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaShapeMask
        public Bitmap applyMaskTo(Bitmap bitmap) {
            return bitmap;
        }

        private RectShapeMask() {
        }
    }

    public CropIwaRectShape(nub nubVar) {
        super(nubVar);
    }

    @Override // p007l.rub
    /* JADX INFO: renamed from: b */
    public void mo1345b(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawRect(rectF, paint);
    }

    @Override // p007l.rub
    /* JADX INFO: renamed from: d */
    public void mo1346d(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawRect(rectF, paint);
    }

    @Override // p007l.rub
    /* JADX INFO: renamed from: g */
    public CropIwaShapeMask mo1348g() {
        return new RectShapeMask();
    }
}
