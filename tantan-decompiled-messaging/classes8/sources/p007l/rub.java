package p007l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaShapeMask;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class rub implements zu5 {

    /* JADX INFO: renamed from: a */
    public Paint f4089a;

    /* JADX INFO: renamed from: b */
    public Paint f4090b;

    /* JADX INFO: renamed from: c */
    public Paint f4091c;

    /* JADX INFO: renamed from: d */
    public Paint f4092d;

    /* JADX INFO: renamed from: e */
    public nub f4093e;

    public rub(nub nubVar) {
        this.f4093e = nubVar;
        Paint paint = new Paint(1);
        this.f4089a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f4091c = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f4091c.setStrokeCap(Paint.Cap.SQUARE);
        this.f4092d = new Paint(this.f4091c);
        Paint paint3 = new Paint(1);
        this.f4090b = paint3;
        paint3.setStyle(style);
        this.f4090b.setStrokeCap(Paint.Cap.ROUND);
        m10605h();
    }

    @Override // p007l.zu5
    /* JADX INFO: renamed from: a */
    public void mo1190a() {
        m10605h();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1345b(Canvas canvas, RectF rectF, Paint paint);

    /* JADX INFO: renamed from: c */
    public final void m10604c(Canvas canvas, RectF rectF) {
        mo1345b(canvas, rectF, this.f4089a);
        if (this.f4093e.m10113Q()) {
            mo1347f(canvas, rectF, this.f4091c);
        }
        mo1346d(canvas, rectF, this.f4092d);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1346d(Canvas canvas, RectF rectF, Paint paint);

    /* JADX INFO: renamed from: e */
    public void mo9612e(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.drawLine(f, f2, f + f3, f2, this.f4090b);
        canvas.drawLine(f, f2, f, f2 + f4, this.f4090b);
    }

    /* JADX INFO: renamed from: f */
    public void mo1347f(Canvas canvas, RectF rectF, Paint paint) {
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
    public abstract CropIwaShapeMask mo1348g();

    /* JADX INFO: renamed from: h */
    public final void m10605h() {
        this.f4090b.setStrokeWidth(this.f4093e.m10120i());
        this.f4090b.setColor(this.f4093e.m10119h());
        this.f4091c.setColor(this.f4093e.m10122k());
        this.f4091c.setStrokeWidth(this.f4093e.m10123l());
        this.f4092d.setColor(this.f4093e.m10117f());
        this.f4092d.setStrokeWidth(this.f4093e.m10118g());
    }
}
