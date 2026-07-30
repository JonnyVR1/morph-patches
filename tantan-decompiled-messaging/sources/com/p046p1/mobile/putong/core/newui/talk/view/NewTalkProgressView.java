package com.p046p1.mobile.putong.core.newui.talk.view;

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
import p149l.a1c0;
import p149l.c3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class NewTalkProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f26868a;

    /* JADX INFO: renamed from: b */
    public RectF f26869b;

    /* JADX INFO: renamed from: c */
    public RectF f26870c;

    /* JADX INFO: renamed from: d */
    public RectF f26871d;

    /* JADX INFO: renamed from: e */
    public int f26872e;

    /* JADX INFO: renamed from: f */
    public float f26873f;

    /* JADX INFO: renamed from: g */
    public float f26874g;

    /* JADX INFO: renamed from: h */
    public float f26875h;

    /* JADX INFO: renamed from: i */
    public int f26876i;

    /* JADX INFO: renamed from: j */
    public ProgressStyle f26877j;

    /* JADX INFO: renamed from: k */
    public Bitmap f26878k;

    /* JADX INFO: renamed from: l */
    public float f26879l;

    /* JADX INFO: renamed from: m */
    public int f26880m;

    /* JADX INFO: renamed from: n */
    public int f26881n;

    /* JADX INFO: renamed from: o */
    public boolean f26882o;

    public enum ProgressStyle {
        DEFAULT,
        HEART_BEAT,
        NEW_UI
    }

    public NewTalkProgressView(Context context) {
        super(context);
        this.f26872e = 0;
        this.f26873f = t100.m186890d(1.0f);
        this.f26874g = t100.m186890d(2.5f);
        this.f26875h = t100.m186890d(3.0f);
        this.f26876i = c3c0.f78890w;
        this.f26877j = ProgressStyle.DEFAULT;
        this.f26878k = null;
        this.f26879l = this.f26873f;
        this.f26882o = true;
        m43686a();
    }

    /* JADX INFO: renamed from: a */
    public final void m43686a() {
        Paint paint = new Paint();
        this.f26868a = paint;
        paint.setAntiAlias(true);
        this.f26868a.setStyle(Paint.Style.STROKE);
        this.f26870c = new RectF();
        this.f26869b = new RectF();
        this.f26871d = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public void m43687b() {
        if (this.f26877j == ProgressStyle.NEW_UI) {
            return;
        }
        this.f26879l = 0.0f;
        this.f26875h = t100.m186890d(3.0f);
        float fM186890d = t100.m186890d(1.5f);
        this.f26874g = fM186890d;
        this.f26873f = 0.0f;
        int i = this.f26881n;
        if (i < 0) {
            return;
        }
        this.f26877j = ProgressStyle.DEFAULT;
        float f = ((this.f26875h + fM186890d) + 0.0f) / 2.0f;
        this.f26870c.set(f, f, this.f26880m - f, i - f);
        RectF rectF = this.f26869b;
        float f2 = this.f26879l;
        rectF.set(f2, f2, this.f26880m - f2, this.f26881n - f2);
        float f3 = this.f26874g;
        this.f26871d.set(f3, f3, this.f26880m - f3, this.f26881n - f3);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m43688c(int i, boolean z) {
        int i2 = (i * 360) / 100;
        this.f26872e = i2;
        this.f26872e = Math.min(360, i2);
        this.f26882o = z;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!NullChecker.m81303a(this.f26878k)) {
            this.f26878k = BitmapFactory.decodeResource(getResources(), this.f26876i);
        }
        this.f26868a.setColor(-1);
        this.f26868a.setStrokeWidth(this.f26875h + this.f26874g + this.f26873f);
        canvas.drawArc(this.f26870c, 0.0f, 360.0f, false, this.f26868a);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        this.f26868a.setColor(-1);
        if (NullChecker.m81303a(this.f26878k)) {
            canvas.drawBitmap(this.f26878k, (Rect) null, this.f26869b, this.f26868a);
        }
        this.f26868a.setColor(-1);
        this.f26868a.setStrokeWidth(this.f26875h + this.f26874g + this.f26873f);
        boolean z = this.f26882o;
        RectF rectF = this.f26870c;
        if (z) {
            int i = this.f26872e;
            canvas.drawArc(rectF, i - 90.0f, 360 - i, false, this.f26868a);
        } else {
            canvas.drawArc(rectF, -90.0f, this.f26872e, false, this.f26868a);
        }
        this.f26868a.setStrokeWidth(this.f26875h);
        this.f26868a.setColor(getResources().getColor(a1c0.f67160n));
        boolean z2 = this.f26882o;
        RectF rectF2 = this.f26871d;
        if (!z2) {
            canvas.drawArc(rectF2, -90.0f, this.f26872e, false, this.f26868a);
        } else {
            int i2 = this.f26872e;
            canvas.drawArc(rectF2, i2 - 90.0f, 360 - i2, false, this.f26868a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f26880m = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f26881n = size;
        float f = ((this.f26875h + this.f26874g) + this.f26873f) / 2.0f;
        this.f26870c.set(f, f, this.f26880m - f, size - f);
        RectF rectF = this.f26869b;
        float f2 = this.f26879l;
        rectF.set(f2, f2, this.f26880m - f2, this.f26881n - f2);
        float f3 = this.f26874g;
        this.f26871d.set(f3, f3, this.f26880m - f3, this.f26881n - f3);
    }

    public void setBitmapRes(@DrawableRes int i) {
        this.f26876i = i;
        this.f26878k = null;
        invalidate();
    }

    public void setProgress(int i) {
        m43688c(i, true);
    }

    public void setThreeDp(float f) {
        this.f26875h = f;
        invalidate();
    }

    public NewTalkProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26872e = 0;
        this.f26873f = t100.m186890d(1.0f);
        this.f26874g = t100.m186890d(2.5f);
        this.f26875h = t100.m186890d(3.0f);
        this.f26876i = c3c0.f78890w;
        this.f26877j = ProgressStyle.DEFAULT;
        this.f26878k = null;
        this.f26879l = this.f26873f;
        this.f26882o = true;
        m43686a();
    }

    public NewTalkProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26872e = 0;
        this.f26873f = t100.m186890d(1.0f);
        this.f26874g = t100.m186890d(2.5f);
        this.f26875h = t100.m186890d(3.0f);
        this.f26876i = c3c0.f78890w;
        this.f26877j = ProgressStyle.DEFAULT;
        this.f26878k = null;
        this.f26879l = this.f26873f;
        this.f26882o = true;
        m43686a();
    }
}
