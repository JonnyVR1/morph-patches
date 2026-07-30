package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import l.t100;
import l.upa;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardDraweeViewOpt extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public float[] f1262o;

    /* JADX INFO: renamed from: p */
    public float[] f1263p;

    /* JADX INFO: renamed from: q */
    public float[] f1264q;

    /* JADX INFO: renamed from: r */
    public Paint f1265r;

    /* JADX INFO: renamed from: s */
    public Paint f1266s;

    /* JADX INFO: renamed from: t */
    public PorterDuffXfermode f1267t;

    /* JADX INFO: renamed from: u */
    public Path f1268u;

    /* JADX INFO: renamed from: v */
    public boolean f1269v;

    /* JADX INFO: renamed from: w */
    public float f1270w;

    /* JADX INFO: renamed from: x */
    public int f1271x;

    /* JADX INFO: renamed from: y */
    public final int f1272y;

    public CardDraweeViewOpt(Context context) {
        super(context);
        this.f1262o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1263p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1264q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1267t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1269v = false;
        this.f1270w = 1.0f;
        this.f1271x = 2;
        this.f1272y = t100.d(1.0f);
        m2197v();
    }

    /* JADX INFO: renamed from: v */
    private void m2197v() {
        Paint paint = new Paint();
        this.f1265r = paint;
        paint.setAntiAlias(true);
        this.f1268u = new Path();
        Paint paint2 = new Paint();
        this.f1266s = paint2;
        paint2.setColor(-65536);
        this.f1266s.setStyle(Paint.Style.FILL);
        this.f1266s.setAntiAlias(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        int iSaveLayer;
        if (this.f1269v) {
            canvas2 = canvas;
            iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        } else {
            canvas2 = canvas;
            iSaveLayer = -1;
        }
        super.onDraw(canvas);
        if (this.f1269v) {
            this.f1265r.setColor(-1);
            this.f1268u.reset();
            this.f1268u.setFillType(Path.FillType.EVEN_ODD);
            boolean zN3 = upa.N3();
            Path path = this.f1268u;
            if (zN3) {
                int i = this.f1272y;
                path.addRect(-i, -i, getMeasuredWidth() + this.f1272y, getMeasuredHeight() + this.f1272y, Path.Direction.CW);
            } else {
                path.addRect(-1.0f, -1.0f, getMeasuredWidth() + 1, getMeasuredHeight() + 1, Path.Direction.CW);
            }
            int i2 = this.f1271x;
            if (i2 == 1) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Path path2 = this.f1268u;
                if (measuredHeight > measuredWidth) {
                    path2.addRoundRect(0.0f, (measuredHeight - measuredWidth) / 2.0f, getMeasuredWidth(), getMeasuredWidth(), this.f1263p, Path.Direction.CW);
                } else {
                    path2.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f1263p, Path.Direction.CW);
                }
            } else if (i2 == 3) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                if (measuredHeight2 > measuredWidth2) {
                    float f = measuredHeight2 - measuredWidth2;
                    float f2 = f / 2.0f;
                    float f3 = this.f1263p[0];
                    float f4 = (f3 - this.f1264q[0]) / (f3 - this.f1262o[0]);
                    this.f1268u.addRoundRect(0.0f, f2 - (f4 * f2), getMeasuredWidth(), getMeasuredWidth() + (f * f4), this.f1264q, Path.Direction.CW);
                } else {
                    this.f1268u.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f1264q, Path.Direction.CW);
                }
            } else {
                this.f1268u.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f1262o, Path.Direction.CW);
            }
            this.f1265r.setXfermode(this.f1267t);
            this.f1268u.close();
            canvas2.drawPath(this.f1268u, this.f1265r);
            canvas2.restoreToCount(iSaveLayer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        float[] fArr = this.f1263p;
        float f = iMin / 2.0f;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCircleToRoundTransition(float f) {
        this.f1270w = f;
        if (f == 0.0f) {
            this.f1271x = 1;
        } else if (f == 1.0f) {
            this.f1271x = 2;
        } else {
            this.f1271x = 3;
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2;
            float[] fArr = this.f1262o;
            float f2 = fArr[0];
            float f3 = iMin;
            float f4 = 1.0f - f;
            float f5 = fArr[2];
            float f6 = fArr[4];
            float f7 = fArr[6];
            m2198u((int) (f2 + ((f3 - f2) * f4)), (int) (f5 + ((f3 - f5) * f4)), (int) (f6 + ((f3 - f6) * f4)), (int) (f7 + ((f3 - f7) * f4)));
        }
        invalidate();
    }

    public void setCurState(int i) {
        this.f1271x = i;
    }

    /* JADX INFO: renamed from: u */
    public void m2198u(int i, int i2, int i3, int i4) {
        float[] fArr = this.f1264q;
        float f = i;
        fArr[1] = f;
        fArr[0] = f;
        float f2 = i2;
        fArr[3] = f2;
        fArr[2] = f2;
        float f3 = i3;
        fArr[5] = f3;
        fArr[4] = f3;
        float f4 = i4;
        fArr[7] = f4;
        fArr[6] = f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m2199w(int i, int i2, int i3, int i4) {
        float[] fArr = this.f1262o;
        float f = i;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = i2;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = i3;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = i4;
        fArr[6] = f4;
        fArr[7] = f4;
        this.f1269v = false;
        for (int i5 = 0; i5 < 8; i5++) {
            if (this.f1262o[i5] != 0.0f) {
                this.f1269v = true;
                break;
            }
        }
        invalidate();
    }

    public CardDraweeViewOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1262o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1263p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1264q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1267t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1269v = false;
        this.f1270w = 1.0f;
        this.f1271x = 2;
        this.f1272y = t100.d(1.0f);
        m2197v();
    }

    public CardDraweeViewOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1262o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1263p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1264q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1267t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1269v = false;
        this.f1270w = 1.0f;
        this.f1271x = 2;
        this.f1272y = t100.d(1.0f);
        m2197v();
    }
}
