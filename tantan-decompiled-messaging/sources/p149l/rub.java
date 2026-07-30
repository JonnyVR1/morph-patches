package p149l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaShapeMask;

/* JADX INFO: loaded from: classes8.dex */
public abstract class rub implements zu5 {

    /* JADX INFO: renamed from: a */
    public Paint f161044a;

    /* JADX INFO: renamed from: b */
    public Paint f161045b;

    /* JADX INFO: renamed from: c */
    public Paint f161046c;

    /* JADX INFO: renamed from: d */
    public Paint f161047d;

    /* JADX INFO: renamed from: e */
    public nub f161048e;

    public rub(nub nubVar) {
        this.f161048e = nubVar;
        Paint paint = new Paint(1);
        this.f161044a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f161046c = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f161046c.setStrokeCap(Paint.Cap.SQUARE);
        this.f161047d = new Paint(this.f161046c);
        Paint paint3 = new Paint(1);
        this.f161045b = paint3;
        paint3.setStyle(style);
        this.f161045b.setStrokeCap(Paint.Cap.ROUND);
        m180865h();
    }

    @Override // p149l.zu5
    /* JADX INFO: renamed from: a */
    public void mo20918a() {
        m180865h();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo21073b(Canvas canvas, RectF rectF, Paint paint);

    /* JADX INFO: renamed from: c */
    public final void m180864c(Canvas canvas, RectF rectF) {
        mo21073b(canvas, rectF, this.f161044a);
        if (this.f161048e.m161458Q()) {
            mo21075f(canvas, rectF, this.f161046c);
        }
        mo21074d(canvas, rectF, this.f161047d);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo21074d(Canvas canvas, RectF rectF, Paint paint);

    /* JADX INFO: renamed from: e */
    public void mo147266e(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.drawLine(f, f2, f + f3, f2, this.f161045b);
        canvas.drawLine(f, f2, f, f2 + f4, this.f161045b);
    }

    /* JADX INFO: renamed from: f */
    public void mo21075f(Canvas canvas, RectF rectF, Paint paint) {
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
    public abstract CropIwaShapeMask mo21076g();

    /* JADX INFO: renamed from: h */
    public final void m180865h() {
        this.f161045b.setStrokeWidth(this.f161048e.m161465i());
        this.f161045b.setColor(this.f161048e.m161464h());
        this.f161046c.setColor(this.f161048e.m161467k());
        this.f161046c.setStrokeWidth(this.f161048e.m161468l());
        this.f161047d.setColor(this.f161048e.m161462f());
        this.f161047d.setStrokeWidth(this.f161048e.m161463g());
    }
}
