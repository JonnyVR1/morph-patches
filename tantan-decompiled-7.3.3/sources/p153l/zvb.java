package p153l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class zvb extends yvb {

    /* JADX INFO: renamed from: n */
    public Paint f206199n;

    /* JADX INFO: renamed from: o */
    public int f206200o;

    /* JADX INFO: renamed from: p */
    public int f206201p;

    /* JADX INFO: renamed from: q */
    public int f206202q;

    /* JADX INFO: renamed from: r */
    public float f206203r;

    /* JADX INFO: renamed from: s */
    public PathEffect f206204s;

    /* JADX INFO: renamed from: t */
    public Paint f206205t;

    /* JADX INFO: renamed from: u */
    public RectF f206206u;

    public zvb(bwb bwbVar) {
        super(bwbVar);
        this.f206200o = qa00.m175859d(2.0f);
        this.f206201p = qa00.m175859d(2.0f);
        this.f206202q = qa00.m175859d(8.0f);
        this.f206203r = 0.11f;
        int i = this.f206202q;
        this.f206204s = new DashPathEffect(new float[]{i, i}, 0.0f);
        this.f206206u = null;
        Paint paint = new Paint();
        this.f206199n = paint;
        paint.setStrokeWidth(this.f206200o);
        this.f206199n.setColor(-1);
        Paint paint2 = this.f206199n;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f206205t = paint3;
        paint3.setStrokeWidth(this.f206201p);
        this.f206205t.setColor(-1);
        this.f206205t.setStyle(style);
        this.f206205t.setPathEffect(this.f206204s);
    }

    @Override // p153l.yvb, com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: b */
    public void mo22072b(Canvas canvas, RectF rectF, Paint paint) {
        int i = qa00.f156322i;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // p153l.yvb, com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: d */
    public void mo22073d(Canvas canvas, RectF rectF, Paint paint) {
        super.mo22073d(canvas, rectF, paint);
        float fWidth = rectF.width() * this.f206203r;
        Path path = new Path();
        path.moveTo(rectF.left + fWidth, rectF.top);
        path.lineTo(rectF.left + fWidth, rectF.bottom);
        path.moveTo(rectF.right - fWidth, rectF.top);
        path.lineTo(rectF.right - fWidth, rectF.bottom);
        canvas.drawPath(path, this.f206205t);
    }

    @Override // p153l.yvb, p153l.fwb
    /* JADX INFO: renamed from: f */
    public void mo22074f(Canvas canvas, RectF rectF, Paint paint) {
    }
}
