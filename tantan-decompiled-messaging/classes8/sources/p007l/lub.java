package p007l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class lub extends kub {

    /* JADX INFO: renamed from: n */
    public Paint f3253n;

    /* JADX INFO: renamed from: o */
    public int f3254o;

    /* JADX INFO: renamed from: p */
    public int f3255p;

    /* JADX INFO: renamed from: q */
    public int f3256q;

    /* JADX INFO: renamed from: r */
    public float f3257r;

    /* JADX INFO: renamed from: s */
    public PathEffect f3258s;

    /* JADX INFO: renamed from: t */
    public Paint f3259t;

    /* JADX INFO: renamed from: u */
    public RectF f3260u;

    public lub(nub nubVar) {
        super(nubVar);
        this.f3254o = t100.d(2.0f);
        this.f3255p = t100.d(2.0f);
        this.f3256q = t100.d(8.0f);
        this.f3257r = 0.11f;
        int i = this.f3256q;
        this.f3258s = new DashPathEffect(new float[]{i, i}, 0.0f);
        this.f3260u = null;
        Paint paint = new Paint();
        this.f3253n = paint;
        paint.setStrokeWidth(this.f3254o);
        this.f3253n.setColor(-1);
        Paint paint2 = this.f3253n;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f3259t = paint3;
        paint3.setStrokeWidth(this.f3255p);
        this.f3259t.setColor(-1);
        this.f3259t.setStyle(style);
        this.f3259t.setPathEffect(this.f3258s);
    }

    @Override // p007l.kub, com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: b */
    public void mo1345b(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.i;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // p007l.kub, com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: d */
    public void mo1346d(Canvas canvas, RectF rectF, Paint paint) {
        super.mo1346d(canvas, rectF, paint);
        float fWidth = rectF.width() * this.f3257r;
        Path path = new Path();
        path.moveTo(rectF.left + fWidth, rectF.top);
        path.lineTo(rectF.left + fWidth, rectF.bottom);
        path.moveTo(rectF.right - fWidth, rectF.top);
        path.lineTo(rectF.right - fWidth, rectF.bottom);
        canvas.drawPath(path, this.f3259t);
    }

    @Override // p007l.kub, p007l.rub
    /* JADX INFO: renamed from: f */
    public void mo1347f(Canvas canvas, RectF rectF, Paint paint) {
    }
}
