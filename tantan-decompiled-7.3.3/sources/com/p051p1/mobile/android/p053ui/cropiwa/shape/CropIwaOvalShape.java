package com.p051p1.mobile.android.p053ui.cropiwa.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import p153l.bwb;
import p153l.fwb;

/* JADX INFO: loaded from: classes8.dex */
public class CropIwaOvalShape extends fwb {

    /* JADX INFO: renamed from: f */
    public Path f16558f;

    public static class OvalShapeMask implements CropIwaShapeMask {
        @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaShapeMask
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

    public CropIwaOvalShape(bwb bwbVar) {
        super(bwbVar);
        this.f16558f = new Path();
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: b */
    public void mo22072b(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawOval(rectF, paint);
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: d */
    public void mo22073d(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawOval(rectF, paint);
        if (this.f101149e.m106681q()) {
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: f */
    public void mo22074f(Canvas canvas, RectF rectF, Paint paint) {
        this.f16558f.rewind();
        this.f16558f.addOval(rectF, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.f16558f);
        super.mo22074f(canvas, rectF, paint);
        canvas.restore();
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: g */
    public CropIwaShapeMask mo22075g() {
        return new OvalShapeMask();
    }
}
