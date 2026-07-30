package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import p147v.VDraweeView;
import p149l.t100;
import p149l.upa;

/* JADX INFO: loaded from: classes11.dex */
public class CardDraweeViewOpt extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public float[] f22484o;

    /* JADX INFO: renamed from: p */
    public float[] f22485p;

    /* JADX INFO: renamed from: q */
    public float[] f22486q;

    /* JADX INFO: renamed from: r */
    public Paint f22487r;

    /* JADX INFO: renamed from: s */
    public Paint f22488s;

    /* JADX INFO: renamed from: t */
    public PorterDuffXfermode f22489t;

    /* JADX INFO: renamed from: u */
    public Path f22490u;

    /* JADX INFO: renamed from: v */
    public boolean f22491v;

    /* JADX INFO: renamed from: w */
    public float f22492w;

    /* JADX INFO: renamed from: x */
    public int f22493x;

    /* JADX INFO: renamed from: y */
    public final int f22494y;

    public CardDraweeViewOpt(Context context) {
        super(context);
        this.f22484o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22485p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22486q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22489t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f22491v = false;
        this.f22492w = 1.0f;
        this.f22493x = 2;
        this.f22494y = t100.m186890d(1.0f);
        m38219v();
    }

    /* JADX INFO: renamed from: v */
    private void m38219v() {
        Paint paint = new Paint();
        this.f22487r = paint;
        paint.setAntiAlias(true);
        this.f22490u = new Path();
        Paint paint2 = new Paint();
        this.f22488s = paint2;
        paint2.setColor(-65536);
        this.f22488s.setStyle(Paint.Style.FILL);
        this.f22488s.setAntiAlias(true);
    }

    @Override // p147v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        int iSaveLayer;
        if (this.f22491v) {
            canvas2 = canvas;
            iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        } else {
            canvas2 = canvas;
            iSaveLayer = -1;
        }
        super.onDraw(canvas);
        if (this.f22491v) {
            this.f22487r.setColor(-1);
            this.f22490u.reset();
            this.f22490u.setFillType(Path.FillType.EVEN_ODD);
            boolean zM194675N3 = upa.m194675N3();
            Path path = this.f22490u;
            if (zM194675N3) {
                int i = this.f22494y;
                path.addRect(-i, -i, getMeasuredWidth() + this.f22494y, getMeasuredHeight() + this.f22494y, Path.Direction.CW);
            } else {
                path.addRect(-1.0f, -1.0f, getMeasuredWidth() + 1, getMeasuredHeight() + 1, Path.Direction.CW);
            }
            int i2 = this.f22493x;
            if (i2 == 1) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Path path2 = this.f22490u;
                if (measuredHeight > measuredWidth) {
                    path2.addRoundRect(0.0f, (measuredHeight - measuredWidth) / 2.0f, getMeasuredWidth(), getMeasuredWidth(), this.f22485p, Path.Direction.CW);
                } else {
                    path2.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f22485p, Path.Direction.CW);
                }
            } else if (i2 == 3) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                if (measuredHeight2 > measuredWidth2) {
                    float f = measuredHeight2 - measuredWidth2;
                    float f2 = f / 2.0f;
                    float f3 = this.f22485p[0];
                    float f4 = (f3 - this.f22486q[0]) / (f3 - this.f22484o[0]);
                    this.f22490u.addRoundRect(0.0f, f2 - (f4 * f2), getMeasuredWidth(), getMeasuredWidth() + (f * f4), this.f22486q, Path.Direction.CW);
                } else {
                    this.f22490u.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f22486q, Path.Direction.CW);
                }
            } else {
                this.f22490u.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f22484o, Path.Direction.CW);
            }
            this.f22487r.setXfermode(this.f22489t);
            this.f22490u.close();
            canvas2.drawPath(this.f22490u, this.f22487r);
            canvas2.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        float[] fArr = this.f22485p;
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
        this.f22492w = f;
        if (f == 0.0f) {
            this.f22493x = 1;
        } else if (f == 1.0f) {
            this.f22493x = 2;
        } else {
            this.f22493x = 3;
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2;
            float[] fArr = this.f22484o;
            float f2 = fArr[0];
            float f3 = iMin;
            float f4 = 1.0f - f;
            float f5 = fArr[2];
            float f6 = fArr[4];
            float f7 = fArr[6];
            m38220u((int) (f2 + ((f3 - f2) * f4)), (int) (f5 + ((f3 - f5) * f4)), (int) (f6 + ((f3 - f6) * f4)), (int) (f7 + ((f3 - f7) * f4)));
        }
        invalidate();
    }

    public void setCurState(int i) {
        this.f22493x = i;
    }

    /* JADX INFO: renamed from: u */
    public void m38220u(int i, int i2, int i3, int i4) {
        float[] fArr = this.f22486q;
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
    public void m38221w(int i, int i2, int i3, int i4) {
        float[] fArr = this.f22484o;
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
        this.f22491v = false;
        for (int i5 = 0; i5 < 8; i5++) {
            if (this.f22484o[i5] != 0.0f) {
                this.f22491v = true;
                break;
            }
        }
        invalidate();
    }

    public CardDraweeViewOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22484o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22485p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22486q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22489t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f22491v = false;
        this.f22492w = 1.0f;
        this.f22493x = 2;
        this.f22494y = t100.m186890d(1.0f);
        m38219v();
    }

    public CardDraweeViewOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22484o = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22485p = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22486q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22489t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f22491v = false;
        this.f22492w = 1.0f;
        this.f22493x = 2;
        this.f22494y = t100.m186890d(1.0f);
        m38219v();
    }
}
