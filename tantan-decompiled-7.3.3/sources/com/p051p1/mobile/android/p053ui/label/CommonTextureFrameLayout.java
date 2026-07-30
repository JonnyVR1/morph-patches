package com.p051p1.mobile.android.p053ui.label;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.abc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes8.dex */
public class CommonTextureFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f16583a;

    /* JADX INFO: renamed from: b */
    public boolean f16584b;

    /* JADX INFO: renamed from: c */
    public Bitmap f16585c;

    /* JADX INFO: renamed from: d */
    public int f16586d;

    /* JADX INFO: renamed from: e */
    public PorterDuffXfermode f16587e;

    /* JADX INFO: renamed from: f */
    public Rect f16588f;

    /* JADX INFO: renamed from: g */
    public RectF f16589g;

    /* JADX INFO: renamed from: h */
    public Paint f16590h;

    /* JADX INFO: renamed from: i */
    public Path f16591i;

    /* JADX INFO: renamed from: j */
    public int f16592j;

    public CommonTextureFrameLayout(@NonNull Context context) {
        super(context);
        this.f16583a = qa00.m175859d(4.0f);
        this.f16584b = false;
        this.f16586d = abc0.f69498m;
        this.f16587e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f16592j = -1;
        m22090c();
    }

    /* JADX INFO: renamed from: c */
    public final void m22090c() {
        this.f16588f = new Rect(0, 0, 0, 0);
        this.f16589g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f16590h = paint;
        paint.setAntiAlias(true);
        this.f16590h.setStyle(Paint.Style.FILL);
        this.f16591i = new Path();
    }

    /* JADX INFO: renamed from: d */
    public void m22091d(boolean z, int i) {
        m22092e(z, -1, i);
    }

    /* JADX INFO: renamed from: e */
    public void m22092e(boolean z, int i, int i2) {
        this.f16584b = z;
        this.f16583a = i2;
        this.f16592j = i;
        setWillNotDraw(false);
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m22093f(@DrawableRes int i) {
        if (this.f16586d != i) {
            this.f16586d = i;
            this.f16585c = null;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16584b) {
            if (this.f16585c == null) {
                this.f16585c = BitmapFactory.decodeResource(getResources(), this.f16586d);
            }
            if (this.f16585c == null) {
                return;
            }
            int i = this.f16592j;
            if (i != -1) {
                this.f16590h.setColor(i);
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                int i2 = this.f16583a;
                canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i2, i2, this.f16590h);
            }
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            this.f16590h.setXfermode(null);
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            int iMin = Math.min((int) ((measuredWidth2 * this.f16585c.getHeight()) / measuredHeight2), this.f16585c.getWidth());
            this.f16588f.set(0, 0, iMin, this.f16585c.getHeight());
            this.f16589g.set(0.0f, 0.0f, Math.min(measuredWidth2, (int) ((iMin * measuredHeight2) / this.f16585c.getHeight())), measuredHeight2);
            canvas.drawBitmap(this.f16585c, this.f16588f, this.f16589g, this.f16590h);
            this.f16590h.setColor(-1);
            this.f16591i.reset();
            this.f16591i.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f16591i;
            float measuredWidth3 = getMeasuredWidth() + 1;
            float measuredHeight3 = getMeasuredHeight() + 1;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-1.0f, -1.0f, measuredWidth3, measuredHeight3, direction);
            Path path2 = this.f16591i;
            float measuredWidth4 = getMeasuredWidth();
            float measuredHeight4 = getMeasuredHeight();
            int i3 = this.f16583a;
            path2.addRoundRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, i3, i3, direction);
            this.f16590h.setXfermode(this.f16587e);
            this.f16591i.close();
            canvas.drawPath(this.f16591i, this.f16590h);
            this.f16590h.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16583a = qa00.m175859d(4.0f);
        this.f16584b = false;
        this.f16586d = abc0.f69498m;
        this.f16587e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f16592j = -1;
        m22090c();
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16583a = qa00.m175859d(4.0f);
        this.f16584b = false;
        this.f16586d = abc0.f69498m;
        this.f16587e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f16592j = -1;
        m22090c();
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f16583a = qa00.m175859d(4.0f);
        this.f16584b = false;
        this.f16586d = abc0.f69498m;
        this.f16587e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f16592j = -1;
        m22090c();
    }
}
