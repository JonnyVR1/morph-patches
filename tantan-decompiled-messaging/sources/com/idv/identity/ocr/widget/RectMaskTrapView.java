package com.idv.identity.ocr.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.r1c0;

/* JADX INFO: loaded from: classes7.dex */
public class RectMaskTrapView extends View {

    /* JADX INFO: renamed from: a */
    private int f12648a;

    /* JADX INFO: renamed from: b */
    private float[] f12649b;

    /* JADX INFO: renamed from: c */
    private Paint f12650c;

    public RectMaskTrapView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12648a = 1;
        this.f12649b = new float[8];
        m18053b();
    }

    /* JADX INFO: renamed from: a */
    private void m18052a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        path.lineTo(f7, f8);
        path.lineTo(f5, f6);
        path.close();
        canvas.drawPath(path, paint);
    }

    /* JADX INFO: renamed from: b */
    private void m18053b() {
        Paint paint = new Paint(1);
        this.f12650c = paint;
        paint.setColor(getResources().getColor(r1c0.f157261a));
        this.f12650c.setStrokeWidth(this.f12648a);
        this.f12650c.setStyle(Paint.Style.STROKE);
        this.f12650c.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float[] fArr = this.f12649b;
        m18052a(canvas, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], this.f12650c);
    }

    public void setRectPoints(float[] fArr) {
        this.f12649b = fArr;
        invalidate();
    }

    public RectMaskTrapView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectMaskTrapView(Context context) {
        this(context, null);
    }
}
