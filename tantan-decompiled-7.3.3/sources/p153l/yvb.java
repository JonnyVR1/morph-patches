package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape;

/* JADX INFO: loaded from: classes8.dex */
public class yvb extends CropIwaRectShape {

    /* JADX INFO: renamed from: f */
    public Paint f201694f;

    /* JADX INFO: renamed from: g */
    public int f201695g;

    /* JADX INFO: renamed from: h */
    public float f201696h;

    /* JADX INFO: renamed from: i */
    public RectF f201697i;

    /* JADX INFO: renamed from: j */
    public RectF f201698j;

    /* JADX INFO: renamed from: k */
    public int f201699k;

    /* JADX INFO: renamed from: l */
    public int f201700l;

    /* JADX INFO: renamed from: m */
    public float[] f201701m;

    public yvb(bwb bwbVar) {
        super(bwbVar);
        this.f201695g = qa00.m175859d(4.0f);
        this.f201697i = new RectF();
        this.f201698j = new RectF();
        this.f201699k = qa00.m175859d(36.0f);
        this.f201700l = qa00.m175859d(20.0f);
        Paint paint = new Paint();
        this.f201694f = paint;
        paint.setStrokeWidth(this.f201695g);
        this.f201694f.setColor(-1);
        this.f201694f.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: i */
    public static float[] m217484i(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: b */
    public void mo22072b(Canvas canvas, RectF rectF, Paint paint) {
        int i = qa00.f156322i;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: d */
    public void mo22073d(Canvas canvas, RectF rectF, Paint paint) {
        int i = qa00.f156322i;
        canvas.drawRoundRect(rectF, i, i, paint);
        float strokeWidth = (this.f201695g - paint.getStrokeWidth()) / 2.0f;
        this.f201696h = strokeWidth;
        this.f201697i.set(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth);
        canvas.save();
        this.f201698j.set(this.f201697i);
        RectF rectF2 = this.f201698j;
        int i2 = this.f201699k;
        rectF2.inset(i2, -i2);
        RectF rectF3 = this.f201698j;
        Region.Op op = Region.Op.DIFFERENCE;
        canvas.clipRect(rectF3, op);
        this.f201698j.set(this.f201697i);
        RectF rectF4 = this.f201698j;
        int i3 = this.f201699k;
        rectF4.inset(-i3, i3);
        canvas.clipRect(this.f201698j, op);
        canvas.drawRoundRect(this.f201697i, i, i, this.f201694f);
        canvas.restore();
        m217486k();
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: f */
    public void mo22074f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo22074f(canvas, rectF, paint);
    }

    /* JADX INFO: renamed from: j */
    public int m217485j(float f, float f2) {
        double d = this.f201700l;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f - this.f201701m[i2], 2.0d) + Math.pow(f2 - this.f201701m[i2 + 1], 2.0d));
            if (dSqrt < d) {
                i = i2 / 2;
                d = dSqrt;
            }
        }
        RectF rectF = new RectF();
        RectF rectF2 = this.f201697i;
        float f3 = rectF2.left;
        float f4 = rectF2.top;
        int i3 = this.f201700l;
        rectF.set(f3, f4 - i3, rectF2.right, f4 + i3);
        RectF rectF3 = new RectF();
        RectF rectF4 = this.f201697i;
        float f5 = rectF4.left;
        float f6 = rectF4.bottom;
        int i4 = this.f201700l;
        rectF3.set(f5, f6 - i4, rectF4.right, f6 + i4);
        if (i < 0 && rectF.contains(f, f2)) {
            i = 4;
        }
        if (i >= 0 || !rectF3.contains(f, f2)) {
            return i;
        }
        return 5;
    }

    /* JADX INFO: renamed from: k */
    public final void m217486k() {
        this.f201701m = m217484i(this.f201697i);
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: e */
    public void mo127754e(Canvas canvas, float f, float f2, float f3, float f4) {
    }
}
