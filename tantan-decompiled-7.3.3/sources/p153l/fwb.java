package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaShapeMask;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fwb implements dw5 {

    /* JADX INFO: renamed from: a */
    public Paint f101145a;

    /* JADX INFO: renamed from: b */
    public Paint f101146b;

    /* JADX INFO: renamed from: c */
    public Paint f101147c;

    /* JADX INFO: renamed from: d */
    public Paint f101148d;

    /* JADX INFO: renamed from: e */
    public bwb f101149e;

    public fwb(bwb bwbVar) {
        this.f101149e = bwbVar;
        Paint paint = new Paint(1);
        this.f101145a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f101147c = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f101147c.setStrokeCap(Paint.Cap.SQUARE);
        this.f101148d = new Paint(this.f101147c);
        Paint paint3 = new Paint(1);
        this.f101146b = paint3;
        paint3.setStyle(style);
        this.f101146b.setStrokeCap(Paint.Cap.ROUND);
        m127755h();
    }

    @Override // p153l.dw5
    /* JADX INFO: renamed from: a */
    public void mo21917a() {
        m127755h();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo22072b(Canvas canvas, RectF rectF, Paint paint);

    /* JADX INFO: renamed from: c */
    public final void m127753c(Canvas canvas, RectF rectF) {
        mo22072b(canvas, rectF, this.f101145a);
        if (this.f101149e.m106666Q()) {
            mo22074f(canvas, rectF, this.f101147c);
        }
        mo22073d(canvas, rectF, this.f101148d);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo22073d(Canvas canvas, RectF rectF, Paint paint);

    /* JADX INFO: renamed from: e */
    public void mo127754e(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.drawLine(f, f2, f + f3, f2, this.f101146b);
        canvas.drawLine(f, f2, f, f2 + f4, this.f101146b);
    }

    /* JADX INFO: renamed from: f */
    public void mo22074f(Canvas canvas, RectF rectF, Paint paint) {
        float fWidth = rectF.width() * 0.333f;
        float fHeight = rectF.height() * 0.333f;
        float f = rectF.left;
        float f2 = rectF.top;
        int i = 0;
        while (i < 2) {
            float f3 = f + fWidth;
            f2 += fHeight;
            canvas.drawLine(f3, rectF.top, f3, rectF.bottom, paint);
            canvas.drawLine(rectF.left, f2, rectF.right, f2, paint);
            i++;
            f = f3;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract CropIwaShapeMask mo22075g();

    /* JADX INFO: renamed from: h */
    public final void m127755h() {
        this.f101146b.setStrokeWidth(this.f101149e.m106673i());
        this.f101146b.setColor(this.f101149e.m106672h());
        this.f101147c.setColor(this.f101149e.m106675k());
        this.f101147c.setStrokeWidth(this.f101149e.m106676l());
        this.f101148d.setColor(this.f101149e.m106670f());
        this.f101148d.setStrokeWidth(this.f101149e.m106671g());
    }
}
