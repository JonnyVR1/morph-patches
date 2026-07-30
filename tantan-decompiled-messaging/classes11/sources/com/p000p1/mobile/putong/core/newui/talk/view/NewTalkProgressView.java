package com.p000p1.mobile.putong.core.newui.talk.view;

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
import l.a1c0;
import l.c3c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewTalkProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f5646a;

    /* JADX INFO: renamed from: b */
    public RectF f5647b;

    /* JADX INFO: renamed from: c */
    public RectF f5648c;

    /* JADX INFO: renamed from: d */
    public RectF f5649d;

    /* JADX INFO: renamed from: e */
    public int f5650e;

    /* JADX INFO: renamed from: f */
    public float f5651f;

    /* JADX INFO: renamed from: g */
    public float f5652g;

    /* JADX INFO: renamed from: h */
    public float f5653h;

    /* JADX INFO: renamed from: i */
    public int f5654i;

    /* JADX INFO: renamed from: j */
    public ProgressStyle f5655j;

    /* JADX INFO: renamed from: k */
    public Bitmap f5656k;

    /* JADX INFO: renamed from: l */
    public float f5657l;

    /* JADX INFO: renamed from: m */
    public int f5658m;

    /* JADX INFO: renamed from: n */
    public int f5659n;

    /* JADX INFO: renamed from: o */
    public boolean f5660o;

    public enum ProgressStyle {
        DEFAULT,
        HEART_BEAT,
        NEW_UI
    }

    public NewTalkProgressView(Context context) {
        super(context);
        this.f5650e = 0;
        this.f5651f = t100.d(1.0f);
        this.f5652g = t100.d(2.5f);
        this.f5653h = t100.d(3.0f);
        this.f5654i = c3c0.w;
        this.f5655j = ProgressStyle.DEFAULT;
        this.f5656k = null;
        this.f5657l = this.f5651f;
        this.f5660o = true;
        m7950a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7950a() {
        Paint paint = new Paint();
        this.f5646a = paint;
        paint.setAntiAlias(true);
        this.f5646a.setStyle(Paint.Style.STROKE);
        this.f5648c = new RectF();
        this.f5647b = new RectF();
        this.f5649d = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public void m7951b() {
        if (this.f5655j == ProgressStyle.NEW_UI) {
            return;
        }
        this.f5657l = 0.0f;
        this.f5653h = t100.d(3.0f);
        float fD = t100.d(1.5f);
        this.f5652g = fD;
        this.f5651f = 0.0f;
        int i = this.f5659n;
        if (i < 0) {
            return;
        }
        this.f5655j = ProgressStyle.DEFAULT;
        float f = ((this.f5653h + fD) + 0.0f) / 2.0f;
        this.f5648c.set(f, f, this.f5658m - f, i - f);
        RectF rectF = this.f5647b;
        float f2 = this.f5657l;
        rectF.set(f2, f2, this.f5658m - f2, this.f5659n - f2);
        float f3 = this.f5652g;
        this.f5649d.set(f3, f3, this.f5658m - f3, this.f5659n - f3);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m7952c(int i, boolean z) {
        int i2 = (i * 360) / 100;
        this.f5650e = i2;
        this.f5650e = Math.min(360, i2);
        this.f5660o = z;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!NullChecker.a(this.f5656k)) {
            this.f5656k = BitmapFactory.decodeResource(getResources(), this.f5654i);
        }
        this.f5646a.setColor(-1);
        this.f5646a.setStrokeWidth(this.f5653h + this.f5652g + this.f5651f);
        canvas.drawArc(this.f5648c, 0.0f, 360.0f, false, this.f5646a);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        this.f5646a.setColor(-1);
        if (NullChecker.a(this.f5656k)) {
            canvas.drawBitmap(this.f5656k, (Rect) null, this.f5647b, this.f5646a);
        }
        this.f5646a.setColor(-1);
        this.f5646a.setStrokeWidth(this.f5653h + this.f5652g + this.f5651f);
        boolean z = this.f5660o;
        RectF rectF = this.f5648c;
        if (z) {
            int i = this.f5650e;
            canvas.drawArc(rectF, i - 90.0f, 360 - i, false, this.f5646a);
        } else {
            canvas.drawArc(rectF, -90.0f, this.f5650e, false, this.f5646a);
        }
        this.f5646a.setStrokeWidth(this.f5653h);
        this.f5646a.setColor(getResources().getColor(a1c0.n));
        boolean z2 = this.f5660o;
        RectF rectF2 = this.f5649d;
        if (!z2) {
            canvas.drawArc(rectF2, -90.0f, this.f5650e, false, this.f5646a);
        } else {
            int i2 = this.f5650e;
            canvas.drawArc(rectF2, i2 - 90.0f, 360 - i2, false, this.f5646a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f5658m = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f5659n = size;
        float f = ((this.f5653h + this.f5652g) + this.f5651f) / 2.0f;
        this.f5648c.set(f, f, this.f5658m - f, size - f);
        RectF rectF = this.f5647b;
        float f2 = this.f5657l;
        rectF.set(f2, f2, this.f5658m - f2, this.f5659n - f2);
        float f3 = this.f5652g;
        this.f5649d.set(f3, f3, this.f5658m - f3, this.f5659n - f3);
    }

    public void setBitmapRes(@DrawableRes int i) {
        this.f5654i = i;
        this.f5656k = null;
        invalidate();
    }

    public void setProgress(int i) {
        m7952c(i, true);
    }

    public void setThreeDp(float f) {
        this.f5653h = f;
        invalidate();
    }

    public NewTalkProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5650e = 0;
        this.f5651f = t100.d(1.0f);
        this.f5652g = t100.d(2.5f);
        this.f5653h = t100.d(3.0f);
        this.f5654i = c3c0.w;
        this.f5655j = ProgressStyle.DEFAULT;
        this.f5656k = null;
        this.f5657l = this.f5651f;
        this.f5660o = true;
        m7950a();
    }

    public NewTalkProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5650e = 0;
        this.f5651f = t100.d(1.0f);
        this.f5652g = t100.d(2.5f);
        this.f5653h = t100.d(3.0f);
        this.f5654i = c3c0.w;
        this.f5655j = ProgressStyle.DEFAULT;
        this.f5656k = null;
        this.f5657l = this.f5651f;
        this.f5660o = true;
        m7950a();
    }
}
