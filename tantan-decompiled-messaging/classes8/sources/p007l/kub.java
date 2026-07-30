package p007l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class kub extends CropIwaRectShape {

    /* JADX INFO: renamed from: f */
    public Paint f3089f;

    /* JADX INFO: renamed from: g */
    public int f3090g;

    /* JADX INFO: renamed from: h */
    public float f3091h;

    /* JADX INFO: renamed from: i */
    public RectF f3092i;

    /* JADX INFO: renamed from: j */
    public RectF f3093j;

    /* JADX INFO: renamed from: k */
    public int f3094k;

    /* JADX INFO: renamed from: l */
    public int f3095l;

    /* JADX INFO: renamed from: m */
    public float[] f3096m;

    public kub(nub nubVar) {
        super(nubVar);
        this.f3090g = t100.d(4.0f);
        this.f3092i = new RectF();
        this.f3093j = new RectF();
        this.f3094k = t100.d(36.0f);
        this.f3095l = t100.d(20.0f);
        Paint paint = new Paint();
        this.f3089f = paint;
        paint.setStrokeWidth(this.f3090g);
        this.f3089f.setColor(-1);
        this.f3089f.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: i */
    public static float[] m9611i(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: b */
    public void mo1345b(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.i;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: d */
    public void mo1346d(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.i;
        canvas.drawRoundRect(rectF, i, i, paint);
        float strokeWidth = (this.f3090g - paint.getStrokeWidth()) / 2.0f;
        this.f3091h = strokeWidth;
        this.f3092i.set(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth);
        canvas.save();
        this.f3093j.set(this.f3092i);
        RectF rectF2 = this.f3093j;
        int i2 = this.f3094k;
        rectF2.inset(i2, -i2);
        RectF rectF3 = this.f3093j;
        Region.Op op = Region.Op.DIFFERENCE;
        canvas.clipRect(rectF3, op);
        this.f3093j.set(this.f3092i);
        RectF rectF4 = this.f3093j;
        int i3 = this.f3094k;
        rectF4.inset(-i3, i3);
        canvas.clipRect(this.f3093j, op);
        canvas.drawRoundRect(this.f3092i, i, i, this.f3089f);
        canvas.restore();
        m9614k();
    }

    @Override // p007l.rub
    /* JADX INFO: renamed from: f */
    public void mo1347f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo1347f(canvas, rectF, paint);
    }

    /* JADX INFO: renamed from: j */
    public int m9613j(float f, float f2) {
        double d = this.f3095l;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f - this.f3096m[i2], 2.0d) + Math.pow(f2 - this.f3096m[i2 + 1], 2.0d));
            if (dSqrt < d) {
                i = i2 / 2;
                d = dSqrt;
            }
        }
        RectF rectF = new RectF();
        RectF rectF2 = this.f3092i;
        float f3 = rectF2.left;
        float f4 = rectF2.top;
        int i3 = this.f3095l;
        rectF.set(f3, f4 - i3, rectF2.right, f4 + i3);
        RectF rectF3 = new RectF();
        RectF rectF4 = this.f3092i;
        float f5 = rectF4.left;
        float f6 = rectF4.bottom;
        int i4 = this.f3095l;
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
    public final void m9614k() {
        this.f3096m = m9611i(this.f3092i);
    }

    @Override // p007l.rub
    /* JADX INFO: renamed from: e */
    public void mo9612e(Canvas canvas, float f, float f2, float f3, float f4) {
    }
}
