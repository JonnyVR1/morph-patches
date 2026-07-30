package com.idv.identity.ocr.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.y9c0;

/* JADX INFO: loaded from: classes7.dex */
public class RectMaskTrapView extends View {

    /* JADX INFO: renamed from: a */
    private int f13389a;

    /* JADX INFO: renamed from: b */
    private float[] f13390b;

    /* JADX INFO: renamed from: c */
    private Paint f13391c;

    public RectMaskTrapView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13389a = 1;
        this.f13390b = new float[8];
        m19130b();
    }

    /* JADX INFO: renamed from: a */
    private void m19129a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        path.lineTo(f7, f8);
        path.lineTo(f5, f6);
        path.close();
        canvas.drawPath(path, paint);
    }

    /* JADX INFO: renamed from: b */
    private void m19130b() {
        Paint paint = new Paint(1);
        this.f13391c = paint;
        paint.setColor(getResources().getColor(y9c0.f198076a));
        this.f13391c.setStrokeWidth(this.f13389a);
        this.f13391c.setStyle(Paint.Style.STROKE);
        this.f13391c.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float[] fArr = this.f13390b;
        m19129a(canvas, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], this.f13391c);
    }

    public void setRectPoints(float[] fArr) {
        this.f13390b = fArr;
        invalidate();
    }

    public RectMaskTrapView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectMaskTrapView(Context context) {
        this(context, null);
    }
}
