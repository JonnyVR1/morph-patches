package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.layout.expanded.view;

import android.content.Context;
import android.content.res.TypedArray;
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
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import p151v.VLinear;
import p153l.dbc0;
import p153l.khc0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileOpButtonLinearRoot extends VLinear {

    /* JADX INFO: renamed from: j */
    public static Bitmap f34720j;

    /* JADX INFO: renamed from: c */
    public Paint f34721c;

    /* JADX INFO: renamed from: d */
    public Path f34722d;

    /* JADX INFO: renamed from: e */
    public Rect f34723e;

    /* JADX INFO: renamed from: f */
    public RectF f34724f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f34725g;

    /* JADX INFO: renamed from: h */
    public boolean f34726h;

    /* JADX INFO: renamed from: i */
    public int f34727i;

    public ExpProfileOpButtonLinearRoot(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34725g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f34726h = true;
        this.f34727i = -36854;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126826o0, i, 0);
            this.f34726h = typedArrayObtainStyledAttributes.getBoolean(khc0.f126832q0, true);
            this.f34727i = typedArrayObtainStyledAttributes.getColor(khc0.f126829p0, -36854);
            typedArrayObtainStyledAttributes.recycle();
        }
        m53583r();
    }

    /* JADX INFO: renamed from: r */
    private void m53583r() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f34721c = paint;
        paint.setAntiAlias(true);
        this.f34723e = new Rect(0, 0, 0, 0);
        this.f34724f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f34722d = new Path();
    }

    /* JADX INFO: renamed from: P */
    public final void m53584P() {
        if (f34720j == null) {
            f34720j = BitmapFactory.decodeResource(getResources(), dbc0.f87257nm);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m53585Q(boolean z) {
        this.f34726h = z;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34721c.setXfermode(null);
        this.f34721c.setColor(this.f34727i);
        this.f34721c.setShadowLayer(10.0f, 0.0f, 0.0f, -2040358);
        canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.f34721c);
        if (this.f34726h) {
            return;
        }
        m53584P();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int iMin = Math.min(f34720j.getWidth(), (getMeasuredWidth() * f34720j.getHeight()) / getMeasuredHeight());
        this.f34723e.set(0, 0, iMin, f34720j.getHeight());
        this.f34724f.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f34720j.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f34720j, this.f34723e, this.f34724f, this.f34721c);
        this.f34721c.setColor(-1);
        this.f34722d.reset();
        this.f34722d.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f34722d;
        float measuredWidth = getMeasuredWidth() + 1;
        float measuredHeight = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth, measuredHeight, direction);
        this.f34722d.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, direction);
        this.f34721c.setXfermode(this.f34725g);
        this.f34722d.close();
        canvas.drawPath(this.f34722d, this.f34721c);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // p151v.VLinear, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ExpProfileOpButtonLinearRoot(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpProfileOpButtonLinearRoot(Context context) {
        this(context, null);
    }
}
