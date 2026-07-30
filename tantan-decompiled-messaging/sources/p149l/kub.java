package p149l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape;

/* JADX INFO: loaded from: classes8.dex */
public class kub extends CropIwaRectShape {

    /* JADX INFO: renamed from: f */
    public Paint f124672f;

    /* JADX INFO: renamed from: g */
    public int f124673g;

    /* JADX INFO: renamed from: h */
    public float f124674h;

    /* JADX INFO: renamed from: i */
    public RectF f124675i;

    /* JADX INFO: renamed from: j */
    public RectF f124676j;

    /* JADX INFO: renamed from: k */
    public int f124677k;

    /* JADX INFO: renamed from: l */
    public int f124678l;

    /* JADX INFO: renamed from: m */
    public float[] f124679m;

    public kub(nub nubVar) {
        super(nubVar);
        this.f124673g = t100.m186890d(4.0f);
        this.f124675i = new RectF();
        this.f124676j = new RectF();
        this.f124677k = t100.m186890d(36.0f);
        this.f124678l = t100.m186890d(20.0f);
        Paint paint = new Paint();
        this.f124672f = paint;
        paint.setStrokeWidth(this.f124673g);
        this.f124672f.setColor(-1);
        this.f124672f.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: i */
    public static float[] m147265i(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: b */
    public void mo21073b(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.f167260i;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: d */
    public void mo21074d(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.f167260i;
        canvas.drawRoundRect(rectF, i, i, paint);
        float strokeWidth = (this.f124673g - paint.getStrokeWidth()) / 2.0f;
        this.f124674h = strokeWidth;
        this.f124675i.set(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth);
        canvas.save();
        this.f124676j.set(this.f124675i);
        RectF rectF2 = this.f124676j;
        int i2 = this.f124677k;
        rectF2.inset(i2, -i2);
        RectF rectF3 = this.f124676j;
        Region.Op op = Region.Op.DIFFERENCE;
        canvas.clipRect(rectF3, op);
        this.f124676j.set(this.f124675i);
        RectF rectF4 = this.f124676j;
        int i3 = this.f124677k;
        rectF4.inset(-i3, i3);
        canvas.clipRect(this.f124676j, op);
        canvas.drawRoundRect(this.f124675i, i, i, this.f124672f);
        canvas.restore();
        m147268k();
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: f */
    public void mo21075f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo21075f(canvas, rectF, paint);
    }

    /* JADX INFO: renamed from: j */
    public int m147267j(float f, float f2) {
        double d = this.f124678l;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f - this.f124679m[i2], 2.0d) + Math.pow(f2 - this.f124679m[i2 + 1], 2.0d));
            if (dSqrt < d) {
                i = i2 / 2;
                d = dSqrt;
            }
        }
        RectF rectF = new RectF();
        RectF rectF2 = this.f124675i;
        float f3 = rectF2.left;
        float f4 = rectF2.top;
        int i3 = this.f124678l;
        rectF.set(f3, f4 - i3, rectF2.right, f4 + i3);
        RectF rectF3 = new RectF();
        RectF rectF4 = this.f124675i;
        float f5 = rectF4.left;
        float f6 = rectF4.bottom;
        int i4 = this.f124678l;
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
    public final void m147268k() {
        this.f124679m = m147265i(this.f124675i);
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: e */
    public void mo147266e(Canvas canvas, float f, float f2, float f3, float f4) {
    }
}
