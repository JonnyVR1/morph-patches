package com.p003p1.mobile.android.p005ui.label;

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
import l.t100;
import p007l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CommonTextureFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f1563a;

    /* JADX INFO: renamed from: b */
    public boolean f1564b;

    /* JADX INFO: renamed from: c */
    public Bitmap f1565c;

    /* JADX INFO: renamed from: d */
    public int f1566d;

    /* JADX INFO: renamed from: e */
    public PorterDuffXfermode f1567e;

    /* JADX INFO: renamed from: f */
    public Rect f1568f;

    /* JADX INFO: renamed from: g */
    public RectF f1569g;

    /* JADX INFO: renamed from: h */
    public Paint f1570h;

    /* JADX INFO: renamed from: i */
    public Path f1571i;

    /* JADX INFO: renamed from: j */
    public int f1572j;

    public CommonTextureFrameLayout(@NonNull Context context) {
        super(context);
        this.f1563a = t100.d(4.0f);
        this.f1564b = false;
        this.f1566d = u2c0.f4746m;
        this.f1567e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1572j = -1;
        m1363c();
    }

    /* JADX INFO: renamed from: c */
    public final void m1363c() {
        this.f1568f = new Rect(0, 0, 0, 0);
        this.f1569g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f1570h = paint;
        paint.setAntiAlias(true);
        this.f1570h.setStyle(Paint.Style.FILL);
        this.f1571i = new Path();
    }

    /* JADX INFO: renamed from: d */
    public void m1364d(boolean z, int i) {
        m1365e(z, -1, i);
    }

    /* JADX INFO: renamed from: e */
    public void m1365e(boolean z, int i, int i2) {
        this.f1564b = z;
        this.f1563a = i2;
        this.f1572j = i;
        setWillNotDraw(false);
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m1366f(@DrawableRes int i) {
        if (this.f1566d != i) {
            this.f1566d = i;
            this.f1565c = null;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1564b) {
            if (this.f1565c == null) {
                this.f1565c = BitmapFactory.decodeResource(getResources(), this.f1566d);
            }
            if (this.f1565c == null) {
                return;
            }
            int i = this.f1572j;
            if (i != -1) {
                this.f1570h.setColor(i);
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                int i2 = this.f1563a;
                canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i2, i2, this.f1570h);
            }
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            this.f1570h.setXfermode(null);
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            int iMin = Math.min((int) ((measuredWidth2 * this.f1565c.getHeight()) / measuredHeight2), this.f1565c.getWidth());
            this.f1568f.set(0, 0, iMin, this.f1565c.getHeight());
            this.f1569g.set(0.0f, 0.0f, Math.min(measuredWidth2, (int) ((iMin * measuredHeight2) / this.f1565c.getHeight())), measuredHeight2);
            canvas.drawBitmap(this.f1565c, this.f1568f, this.f1569g, this.f1570h);
            this.f1570h.setColor(-1);
            this.f1571i.reset();
            this.f1571i.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f1571i;
            float measuredWidth3 = getMeasuredWidth() + 1;
            float measuredHeight3 = getMeasuredHeight() + 1;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-1.0f, -1.0f, measuredWidth3, measuredHeight3, direction);
            Path path2 = this.f1571i;
            float measuredWidth4 = getMeasuredWidth();
            float measuredHeight4 = getMeasuredHeight();
            int i3 = this.f1563a;
            path2.addRoundRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, i3, i3, direction);
            this.f1570h.setXfermode(this.f1567e);
            this.f1571i.close();
            canvas.drawPath(this.f1571i, this.f1570h);
            this.f1570h.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1563a = t100.d(4.0f);
        this.f1564b = false;
        this.f1566d = u2c0.f4746m;
        this.f1567e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1572j = -1;
        m1363c();
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1563a = t100.d(4.0f);
        this.f1564b = false;
        this.f1566d = u2c0.f4746m;
        this.f1567e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1572j = -1;
        m1363c();
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1563a = t100.d(4.0f);
        this.f1564b = false;
        this.f1566d = u2c0.f4746m;
        this.f1567e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1572j = -1;
        m1363c();
    }
}
