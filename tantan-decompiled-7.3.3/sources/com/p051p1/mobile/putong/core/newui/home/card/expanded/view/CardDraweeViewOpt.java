package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import p151v.VDraweeView;
import p153l.gra;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class CardDraweeViewOpt extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public float[] f23226o;

    /* JADX INFO: renamed from: p */
    public float[] f23227p;

    /* JADX INFO: renamed from: q */
    public float[] f23228q;

    /* JADX INFO: renamed from: r */
    public Paint f23229r;

    /* JADX INFO: renamed from: s */
    public Paint f23230s;

    /* JADX INFO: renamed from: t */
    public PorterDuffXfermode f23231t;

    /* JADX INFO: renamed from: u */
    public Path f23232u;

    /* JADX INFO: renamed from: v */
    public boolean f23233v;

    /* JADX INFO: renamed from: w */
    public float f23234w;

    /* JADX INFO: renamed from: x */
    public int f23235x;

    /* JADX INFO: renamed from: y */
    public final int f23236y;

    public CardDraweeViewOpt(Context context) {
        super(context);
        this.f23226o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23227p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23228q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23231t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23233v = false;
        this.f23234w = 1.0f;
        this.f23235x = 2;
        this.f23236y = qa00.m175859d(1.0f);
        m39222v();
    }

    /* JADX INFO: renamed from: v */
    private void m39222v() {
        Paint paint = new Paint();
        this.f23229r = paint;
        paint.setAntiAlias(true);
        this.f23232u = new Path();
        Paint paint2 = new Paint();
        this.f23230s = paint2;
        paint2.setColor(-65536);
        this.f23230s.setStyle(Paint.Style.FILL);
        this.f23230s.setAntiAlias(true);
    }

    @Override // p151v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        int iSaveLayer;
        if (this.f23233v) {
            canvas2 = canvas;
            iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        } else {
            canvas2 = canvas;
            iSaveLayer = -1;
        }
        super.onDraw(canvas);
        if (this.f23233v) {
            this.f23229r.setColor(-1);
            this.f23232u.reset();
            this.f23232u.setFillType(Path.FillType.EVEN_ODD);
            boolean zM131606N3 = gra.m131606N3();
            Path path = this.f23232u;
            if (zM131606N3) {
                int i = this.f23236y;
                path.addRect(-i, -i, getMeasuredWidth() + this.f23236y, getMeasuredHeight() + this.f23236y, Path.Direction.CW);
            } else {
                path.addRect(-1.0f, -1.0f, getMeasuredWidth() + 1, getMeasuredHeight() + 1, Path.Direction.CW);
            }
            int i2 = this.f23235x;
            if (i2 == 1) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Path path2 = this.f23232u;
                if (measuredHeight > measuredWidth) {
                    path2.addRoundRect(0.0f, (measuredHeight - measuredWidth) / 2.0f, getMeasuredWidth(), getMeasuredWidth(), this.f23227p, Path.Direction.CW);
                } else {
                    path2.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f23227p, Path.Direction.CW);
                }
            } else if (i2 == 3) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                if (measuredHeight2 > measuredWidth2) {
                    float f = measuredHeight2 - measuredWidth2;
                    float f2 = f / 2.0f;
                    float f3 = this.f23227p[0];
                    float f4 = (f3 - this.f23228q[0]) / (f3 - this.f23226o[0]);
                    this.f23232u.addRoundRect(0.0f, f2 - (f4 * f2), getMeasuredWidth(), getMeasuredWidth() + (f * f4), this.f23228q, Path.Direction.CW);
                } else {
                    this.f23232u.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f23228q, Path.Direction.CW);
                }
            } else {
                this.f23232u.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f23226o, Path.Direction.CW);
            }
            this.f23229r.setXfermode(this.f23231t);
            this.f23232u.close();
            canvas2.drawPath(this.f23232u, this.f23229r);
            canvas2.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        float[] fArr = this.f23227p;
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

    public void setCircleToRoundTransition(float f) {
        this.f23234w = f;
        if (f == 0.0f) {
            this.f23235x = 1;
        } else if (f == 1.0f) {
            this.f23235x = 2;
        } else {
            this.f23235x = 3;
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2;
            float[] fArr = this.f23226o;
            float f2 = fArr[0];
            float f3 = iMin;
            float f4 = 1.0f - f;
            float f5 = fArr[2];
            float f6 = fArr[4];
            float f7 = fArr[6];
            m39223u((int) (f2 + ((f3 - f2) * f4)), (int) (f5 + ((f3 - f5) * f4)), (int) (f6 + ((f3 - f6) * f4)), (int) (f7 + ((f3 - f7) * f4)));
        }
        invalidate();
    }

    public void setCurState(int i) {
        this.f23235x = i;
    }

    /* JADX INFO: renamed from: u */
    public void m39223u(int i, int i2, int i3, int i4) {
        float[] fArr = this.f23228q;
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

    /* JADX INFO: renamed from: w */
    public void m39224w(int i, int i2, int i3, int i4) {
        float[] fArr = this.f23226o;
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
        this.f23233v = false;
        for (int i5 = 0; i5 < 8; i5++) {
            if (this.f23226o[i5] != 0.0f) {
                this.f23233v = true;
                break;
            }
        }
        invalidate();
    }

    public CardDraweeViewOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23226o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23227p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23228q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23231t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23233v = false;
        this.f23234w = 1.0f;
        this.f23235x = 2;
        this.f23236y = qa00.m175859d(1.0f);
        m39222v();
    }

    public CardDraweeViewOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23226o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23227p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23228q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23231t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23233v = false;
        this.f23234w = 1.0f;
        this.f23235x = 2;
        this.f23236y = qa00.m175859d(1.0f);
        m39222v();
    }
}
