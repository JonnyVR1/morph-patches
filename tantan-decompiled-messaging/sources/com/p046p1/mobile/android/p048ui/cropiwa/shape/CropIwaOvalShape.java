package com.p046p1.mobile.android.p048ui.cropiwa.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import p149l.nub;
import p149l.rub;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaOvalShape extends rub {

    /* JADX INFO: renamed from: f */
    public Path f15839f;

    public static class OvalShapeMask implements CropIwaShapeMask {
        @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaShapeMask
        public Bitmap applyMaskTo(Bitmap bitmap) {
            bitmap.setHasAlpha(true);
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            Path path = new Path();
            path.addRect(rectF, Path.Direction.CW);
            path.addOval(rectF, Path.Direction.CCW);
            new Canvas(bitmap).drawPath(path, paint);
            return bitmap;
        }

        private OvalShapeMask() {
        }
    }

    public CropIwaOvalShape(nub nubVar) {
        super(nubVar);
        this.f15839f = new Path();
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: b */
    public void mo21073b(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawOval(rectF, paint);
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: d */
    public void mo21074d(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawOval(rectF, paint);
        if (this.f161048e.m161473q()) {
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: f */
    public void mo21075f(Canvas canvas, RectF rectF, Paint paint) {
        this.f15839f.rewind();
        this.f15839f.addOval(rectF, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.f15839f);
        super.mo21075f(canvas, rectF, paint);
        canvas.restore();
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: g */
    public CropIwaShapeMask mo21076g() {
        return new OvalShapeMask();
    }
}
