package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.layout.expanded.view;

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
import l.e9c0;
import l.x2c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileOpButtonLinearRoot extends VLinear {

    /* JADX INFO: renamed from: j */
    public static Bitmap f1694j;

    /* JADX INFO: renamed from: c */
    public Paint f1695c;

    /* JADX INFO: renamed from: d */
    public Path f1696d;

    /* JADX INFO: renamed from: e */
    public Rect f1697e;

    /* JADX INFO: renamed from: f */
    public RectF f1698f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f1699g;

    /* JADX INFO: renamed from: h */
    public boolean f1700h;

    /* JADX INFO: renamed from: i */
    public int f1701i;

    public ExpProfileOpButtonLinearRoot(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1699g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1700h = true;
        this.f1701i = -36854;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.o0, i, 0);
            this.f1700h = typedArrayObtainStyledAttributes.getBoolean(e9c0.q0, true);
            this.f1701i = typedArrayObtainStyledAttributes.getColor(e9c0.p0, -36854);
            typedArrayObtainStyledAttributes.recycle();
        }
        m2934r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m2934r() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f1695c = paint;
        paint.setAntiAlias(true);
        this.f1697e = new Rect(0, 0, 0, 0);
        this.f1698f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f1696d = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final void m2935P() {
        if (f1694j == null) {
            f1694j = BitmapFactory.decodeResource(getResources(), x2c0.zl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m2936Q(boolean z) {
        this.f1700h = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        this.f1695c.setXfermode(null);
        this.f1695c.setColor(this.f1701i);
        this.f1695c.setShadowLayer(10.0f, 0.0f, 0.0f, -2040358);
        canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.f1695c);
        if (this.f1700h) {
            return;
        }
        m2935P();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int iMin = Math.min(f1694j.getWidth(), (getMeasuredWidth() * f1694j.getHeight()) / getMeasuredHeight());
        this.f1697e.set(0, 0, iMin, f1694j.getHeight());
        this.f1698f.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f1694j.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f1694j, this.f1697e, this.f1698f, this.f1695c);
        this.f1695c.setColor(-1);
        this.f1696d.reset();
        this.f1696d.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f1696d;
        float measuredWidth = getMeasuredWidth() + 1;
        float measuredHeight = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth, measuredHeight, direction);
        this.f1696d.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, direction);
        this.f1695c.setXfermode(this.f1699g);
        this.f1696d.close();
        canvas.drawPath(this.f1696d, this.f1695c);
        canvas.restoreToCount(iSaveLayer);
    }

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
