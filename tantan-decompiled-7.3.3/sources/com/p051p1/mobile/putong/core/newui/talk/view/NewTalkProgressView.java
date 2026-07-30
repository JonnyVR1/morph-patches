package com.p051p1.mobile.putong.core.newui.talk.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;
import p153l.g9c0;
import p153l.ibc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class NewTalkProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f27716a;

    /* JADX INFO: renamed from: b */
    public RectF f27717b;

    /* JADX INFO: renamed from: c */
    public RectF f27718c;

    /* JADX INFO: renamed from: d */
    public RectF f27719d;

    /* JADX INFO: renamed from: e */
    public int f27720e;

    /* JADX INFO: renamed from: f */
    public float f27721f;

    /* JADX INFO: renamed from: g */
    public float f27722g;

    /* JADX INFO: renamed from: h */
    public float f27723h;

    /* JADX INFO: renamed from: i */
    public int f27724i;

    /* JADX INFO: renamed from: j */
    public ProgressStyle f27725j;

    /* JADX INFO: renamed from: k */
    public Bitmap f27726k;

    /* JADX INFO: renamed from: l */
    public float f27727l;

    /* JADX INFO: renamed from: m */
    public int f27728m;

    /* JADX INFO: renamed from: n */
    public int f27729n;

    /* JADX INFO: renamed from: o */
    public boolean f27730o;

    public enum ProgressStyle {
        DEFAULT,
        HEART_BEAT,
        NEW_UI
    }

    public NewTalkProgressView(Context context) {
        super(context);
        this.f27720e = 0;
        this.f27721f = qa00.m175859d(1.0f);
        this.f27722g = qa00.m175859d(2.5f);
        this.f27723h = qa00.m175859d(3.0f);
        this.f27724i = ibc0.f114165w;
        this.f27725j = ProgressStyle.DEFAULT;
        this.f27726k = null;
        this.f27727l = this.f27721f;
        this.f27730o = true;
        m44872a();
    }

    /* JADX INFO: renamed from: a */
    public final void m44872a() {
        Paint paint = new Paint();
        this.f27716a = paint;
        paint.setAntiAlias(true);
        this.f27716a.setStyle(Paint.Style.STROKE);
        this.f27718c = new RectF();
        this.f27717b = new RectF();
        this.f27719d = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public void m44873b() {
        if (this.f27725j == ProgressStyle.NEW_UI) {
            return;
        }
        this.f27727l = 0.0f;
        this.f27723h = qa00.m175859d(3.0f);
        float fM175859d = qa00.m175859d(1.5f);
        this.f27722g = fM175859d;
        this.f27721f = 0.0f;
        int i = this.f27729n;
        if (i < 0) {
            return;
        }
        this.f27725j = ProgressStyle.DEFAULT;
        float f = ((this.f27723h + fM175859d) + 0.0f) / 2.0f;
        this.f27718c.set(f, f, this.f27728m - f, i - f);
        RectF rectF = this.f27717b;
        float f2 = this.f27727l;
        rectF.set(f2, f2, this.f27728m - f2, this.f27729n - f2);
        float f3 = this.f27722g;
        this.f27719d.set(f3, f3, this.f27728m - f3, this.f27729n - f3);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m44874c(int i, boolean z) {
        int i2 = (i * 360) / 100;
        this.f27720e = i2;
        this.f27720e = Math.min(360, i2);
        this.f27730o = z;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!NullChecker.m82486a(this.f27726k)) {
            this.f27726k = BitmapFactory.decodeResource(getResources(), this.f27724i);
        }
        this.f27716a.setColor(-1);
        this.f27716a.setStrokeWidth(this.f27723h + this.f27722g + this.f27721f);
        canvas.drawArc(this.f27718c, 0.0f, 360.0f, false, this.f27716a);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        this.f27716a.setColor(-1);
        if (NullChecker.m82486a(this.f27726k)) {
            canvas.drawBitmap(this.f27726k, (Rect) null, this.f27717b, this.f27716a);
        }
        this.f27716a.setColor(-1);
        this.f27716a.setStrokeWidth(this.f27723h + this.f27722g + this.f27721f);
        boolean z = this.f27730o;
        RectF rectF = this.f27718c;
        if (z) {
            int i = this.f27720e;
            canvas.drawArc(rectF, i - 90.0f, 360 - i, false, this.f27716a);
        } else {
            canvas.drawArc(rectF, -90.0f, this.f27720e, false, this.f27716a);
        }
        this.f27716a.setStrokeWidth(this.f27723h);
        this.f27716a.setColor(getResources().getColor(g9c0.f102824n));
        boolean z2 = this.f27730o;
        RectF rectF2 = this.f27719d;
        if (!z2) {
            canvas.drawArc(rectF2, -90.0f, this.f27720e, false, this.f27716a);
        } else {
            int i2 = this.f27720e;
            canvas.drawArc(rectF2, i2 - 90.0f, 360 - i2, false, this.f27716a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f27728m = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f27729n = size;
        float f = ((this.f27723h + this.f27722g) + this.f27721f) / 2.0f;
        this.f27718c.set(f, f, this.f27728m - f, size - f);
        RectF rectF = this.f27717b;
        float f2 = this.f27727l;
        rectF.set(f2, f2, this.f27728m - f2, this.f27729n - f2);
        float f3 = this.f27722g;
        this.f27719d.set(f3, f3, this.f27728m - f3, this.f27729n - f3);
    }

    public void setBitmapRes(@DrawableRes int i) {
        this.f27724i = i;
        this.f27726k = null;
        invalidate();
    }

    public void setProgress(int i) {
        m44874c(i, true);
    }

    public void setThreeDp(float f) {
        this.f27723h = f;
        invalidate();
    }

    public NewTalkProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27720e = 0;
        this.f27721f = qa00.m175859d(1.0f);
        this.f27722g = qa00.m175859d(2.5f);
        this.f27723h = qa00.m175859d(3.0f);
        this.f27724i = ibc0.f114165w;
        this.f27725j = ProgressStyle.DEFAULT;
        this.f27726k = null;
        this.f27727l = this.f27721f;
        this.f27730o = true;
        m44872a();
    }

    public NewTalkProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27720e = 0;
        this.f27721f = qa00.m175859d(1.0f);
        this.f27722g = qa00.m175859d(2.5f);
        this.f27723h = qa00.m175859d(3.0f);
        this.f27724i = ibc0.f114165w;
        this.f27725j = ProgressStyle.DEFAULT;
        this.f27726k = null;
        this.f27727l = this.f27721f;
        this.f27730o = true;
        m44872a();
    }
}
