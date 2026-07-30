package com.p046p1.mobile.android.p048ui.label;

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
import p149l.t100;
import p149l.u2c0;

/* JADX INFO: loaded from: classes8.dex */
public class CommonTextureFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f15864a;

    /* JADX INFO: renamed from: b */
    public boolean f15865b;

    /* JADX INFO: renamed from: c */
    public Bitmap f15866c;

    /* JADX INFO: renamed from: d */
    public int f15867d;

    /* JADX INFO: renamed from: e */
    public PorterDuffXfermode f15868e;

    /* JADX INFO: renamed from: f */
    public Rect f15869f;

    /* JADX INFO: renamed from: g */
    public RectF f15870g;

    /* JADX INFO: renamed from: h */
    public Paint f15871h;

    /* JADX INFO: renamed from: i */
    public Path f15872i;

    /* JADX INFO: renamed from: j */
    public int f15873j;

    public CommonTextureFrameLayout(@NonNull Context context) {
        super(context);
        this.f15864a = t100.m186890d(4.0f);
        this.f15865b = false;
        this.f15867d = u2c0.f173378m;
        this.f15868e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f15873j = -1;
        m21091c();
    }

    /* JADX INFO: renamed from: c */
    public final void m21091c() {
        this.f15869f = new Rect(0, 0, 0, 0);
        this.f15870g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f15871h = paint;
        paint.setAntiAlias(true);
        this.f15871h.setStyle(Paint.Style.FILL);
        this.f15872i = new Path();
    }

    /* JADX INFO: renamed from: d */
    public void m21092d(boolean z, int i) {
        m21093e(z, -1, i);
    }

    /* JADX INFO: renamed from: e */
    public void m21093e(boolean z, int i, int i2) {
        this.f15865b = z;
        this.f15864a = i2;
        this.f15873j = i;
        setWillNotDraw(false);
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m21094f(@DrawableRes int i) {
        if (this.f15867d != i) {
            this.f15867d = i;
            this.f15866c = null;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15865b) {
            if (this.f15866c == null) {
                this.f15866c = BitmapFactory.decodeResource(getResources(), this.f15867d);
            }
            if (this.f15866c == null) {
                return;
            }
            int i = this.f15873j;
            if (i != -1) {
                this.f15871h.setColor(i);
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                int i2 = this.f15864a;
                canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i2, i2, this.f15871h);
            }
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            this.f15871h.setXfermode(null);
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            int iMin = Math.min((int) ((measuredWidth2 * this.f15866c.getHeight()) / measuredHeight2), this.f15866c.getWidth());
            this.f15869f.set(0, 0, iMin, this.f15866c.getHeight());
            this.f15870g.set(0.0f, 0.0f, Math.min(measuredWidth2, (int) ((iMin * measuredHeight2) / this.f15866c.getHeight())), measuredHeight2);
            canvas.drawBitmap(this.f15866c, this.f15869f, this.f15870g, this.f15871h);
            this.f15871h.setColor(-1);
            this.f15872i.reset();
            this.f15872i.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f15872i;
            float measuredWidth3 = getMeasuredWidth() + 1;
            float measuredHeight3 = getMeasuredHeight() + 1;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-1.0f, -1.0f, measuredWidth3, measuredHeight3, direction);
            Path path2 = this.f15872i;
            float measuredWidth4 = getMeasuredWidth();
            float measuredHeight4 = getMeasuredHeight();
            int i3 = this.f15864a;
            path2.addRoundRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, i3, i3, direction);
            this.f15871h.setXfermode(this.f15868e);
            this.f15872i.close();
            canvas.drawPath(this.f15872i, this.f15871h);
            this.f15871h.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15864a = t100.m186890d(4.0f);
        this.f15865b = false;
        this.f15867d = u2c0.f173378m;
        this.f15868e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f15873j = -1;
        m21091c();
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15864a = t100.m186890d(4.0f);
        this.f15865b = false;
        this.f15867d = u2c0.f173378m;
        this.f15868e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f15873j = -1;
        m21091c();
    }

    public CommonTextureFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f15864a = t100.m186890d(4.0f);
        this.f15865b = false;
        this.f15867d = u2c0.f173378m;
        this.f15868e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f15873j = -1;
        m21091c();
    }
}
