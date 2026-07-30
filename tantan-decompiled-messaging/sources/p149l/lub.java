package p149l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class lub extends kub {

    /* JADX INFO: renamed from: n */
    public Paint f130041n;

    /* JADX INFO: renamed from: o */
    public int f130042o;

    /* JADX INFO: renamed from: p */
    public int f130043p;

    /* JADX INFO: renamed from: q */
    public int f130044q;

    /* JADX INFO: renamed from: r */
    public float f130045r;

    /* JADX INFO: renamed from: s */
    public PathEffect f130046s;

    /* JADX INFO: renamed from: t */
    public Paint f130047t;

    /* JADX INFO: renamed from: u */
    public RectF f130048u;

    public lub(nub nubVar) {
        super(nubVar);
        this.f130042o = t100.m186890d(2.0f);
        this.f130043p = t100.m186890d(2.0f);
        this.f130044q = t100.m186890d(8.0f);
        this.f130045r = 0.11f;
        int i = this.f130044q;
        this.f130046s = new DashPathEffect(new float[]{i, i}, 0.0f);
        this.f130048u = null;
        Paint paint = new Paint();
        this.f130041n = paint;
        paint.setStrokeWidth(this.f130042o);
        this.f130041n.setColor(-1);
        Paint paint2 = this.f130041n;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f130047t = paint3;
        paint3.setStrokeWidth(this.f130043p);
        this.f130047t.setColor(-1);
        this.f130047t.setStyle(style);
        this.f130047t.setPathEffect(this.f130046s);
    }

    @Override // p149l.kub, com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: b */
    public void mo21073b(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.f167260i;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // p149l.kub, com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: d */
    public void mo21074d(Canvas canvas, RectF rectF, Paint paint) {
        super.mo21074d(canvas, rectF, paint);
        float fWidth = rectF.width() * this.f130045r;
        Path path = new Path();
        path.moveTo(rectF.left + fWidth, rectF.top);
        path.lineTo(rectF.left + fWidth, rectF.bottom);
        path.moveTo(rectF.right - fWidth, rectF.top);
        path.lineTo(rectF.right - fWidth, rectF.bottom);
        canvas.drawPath(path, this.f130047t);
    }

    @Override // p149l.kub, p149l.rub
    /* JADX INFO: renamed from: f */
    public void mo21075f(Canvas canvas, RectF rectF, Paint paint) {
    }
}
