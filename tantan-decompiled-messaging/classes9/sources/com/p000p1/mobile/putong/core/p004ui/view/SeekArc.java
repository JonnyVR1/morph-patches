package com.p000p1.mobile.putong.core.p004ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import l.i9c0;
import l.l0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SeekArc extends View {

    /* JADX INFO: renamed from: B */
    public static int f6605B = -1;

    /* JADX INFO: renamed from: A */
    public ValueAnimator f6606A;

    /* JADX INFO: renamed from: a */
    public final int f6607a;

    /* JADX INFO: renamed from: b */
    public Drawable f6608b;

    /* JADX INFO: renamed from: c */
    public int f6609c;

    /* JADX INFO: renamed from: d */
    public int f6610d;

    /* JADX INFO: renamed from: e */
    public int f6611e;

    /* JADX INFO: renamed from: f */
    public int f6612f;

    /* JADX INFO: renamed from: g */
    public int f6613g;

    /* JADX INFO: renamed from: h */
    public int f6614h;

    /* JADX INFO: renamed from: i */
    public int f6615i;

    /* JADX INFO: renamed from: j */
    public boolean f6616j;

    /* JADX INFO: renamed from: k */
    public boolean f6617k;

    /* JADX INFO: renamed from: l */
    public boolean f6618l;

    /* JADX INFO: renamed from: m */
    public boolean f6619m;

    /* JADX INFO: renamed from: n */
    public int f6620n;

    /* JADX INFO: renamed from: o */
    public float f6621o;

    /* JADX INFO: renamed from: p */
    public RectF f6622p;

    /* JADX INFO: renamed from: q */
    public Paint f6623q;

    /* JADX INFO: renamed from: r */
    public Paint f6624r;

    /* JADX INFO: renamed from: s */
    public int f6625s;

    /* JADX INFO: renamed from: t */
    public int f6626t;

    /* JADX INFO: renamed from: u */
    public int f6627u;

    /* JADX INFO: renamed from: v */
    public int f6628v;

    /* JADX INFO: renamed from: w */
    public double f6629w;

    /* JADX INFO: renamed from: x */
    public float f6630x;

    /* JADX INFO: renamed from: y */
    public boolean f6631y;

    /* JADX INFO: renamed from: z */
    public boolean f6632z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.SeekArc$a */
    public interface InterfaceC0366a {
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6607a = -90;
        this.f6609c = 100;
        this.f6610d = 0;
        this.f6611e = 4;
        this.f6612f = 2;
        this.f6613g = 0;
        this.f6614h = 360;
        this.f6615i = 0;
        this.f6616j = false;
        this.f6617k = false;
        this.f6618l = true;
        this.f6619m = true;
        this.f6620n = 0;
        this.f6621o = 0.0f;
        this.f6622p = new RectF();
        this.f6632z = true;
        m9584d(context, attributeSet, l0c0.k);
    }

    /* JADX INFO: renamed from: a */
    public final int m9581a(double d) {
        int iRound = (int) Math.round(((double) m9591k()) * d);
        if (iRound < 0) {
            iRound = f6605B;
        }
        return iRound > this.f6609c ? f6605B : iRound;
    }

    /* JADX INFO: renamed from: b */
    public final double m9582b(float f, float f2) {
        float f3 = f - this.f6625s;
        float f4 = f2 - this.f6626t;
        if (!this.f6618l) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.f6615i));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        return degrees - ((double) this.f6613g);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9583c(float f, float f2) {
        float f3 = f - this.f6625s;
        float f4 = f2 - this.f6626t;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.f6630x;
    }

    /* JADX INFO: renamed from: d */
    public final void m9584d(Context context, AttributeSet attributeSet, int i) {
        getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = Color.parseColor("#66ffffff");
        this.f6611e = (int) (this.f6611e * f);
        int color2 = -65536;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.Q, i, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i9c0.c0);
            if (drawable != null) {
                this.f6608b = drawable;
                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                int intrinsicWidth = this.f6608b.getIntrinsicWidth() / 2;
                this.f6608b.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            }
            this.f6609c = typedArrayObtainStyledAttributes.getInteger(i9c0.U, this.f6609c);
            this.f6610d = typedArrayObtainStyledAttributes.getInteger(i9c0.V, this.f6610d);
            this.f6611e = (int) typedArrayObtainStyledAttributes.getDimension(i9c0.X, this.f6611e);
            this.f6612f = (int) typedArrayObtainStyledAttributes.getDimension(i9c0.e0, this.f6612f);
            this.f6613g = typedArrayObtainStyledAttributes.getInt(i9c0.a0, this.f6613g);
            this.f6614h = typedArrayObtainStyledAttributes.getInt(i9c0.b0, this.f6614h);
            this.f6615i = typedArrayObtainStyledAttributes.getInt(i9c0.Y, this.f6615i);
            this.f6616j = typedArrayObtainStyledAttributes.getBoolean(i9c0.Z, this.f6616j);
            this.f6617k = typedArrayObtainStyledAttributes.getBoolean(i9c0.d0, this.f6617k);
            this.f6618l = typedArrayObtainStyledAttributes.getBoolean(i9c0.R, this.f6618l);
            this.f6619m = typedArrayObtainStyledAttributes.getBoolean(i9c0.T, this.f6619m);
            color = typedArrayObtainStyledAttributes.getColor(i9c0.S, color);
            color2 = typedArrayObtainStyledAttributes.getColor(i9c0.W, -65536);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f6610d;
        int i3 = this.f6609c;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f6610d = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f6610d = i2;
        int i4 = this.f6614h;
        if (i4 > 360) {
            i4 = 360;
        }
        this.f6614h = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.f6614h = i4;
        this.f6621o = (i2 / i3) * i4;
        int i5 = this.f6613g;
        if (i5 > 360) {
            i5 = 0;
        }
        this.f6613g = i5;
        this.f6613g = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.f6623q = paint;
        paint.setColor(color);
        this.f6623q.setAntiAlias(true);
        Paint paint2 = this.f6623q;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f6623q.setStrokeWidth(this.f6612f);
        Paint paint3 = new Paint();
        this.f6624r = paint3;
        paint3.setColor(color2);
        this.f6624r.setAntiAlias(true);
        this.f6624r.setStyle(style);
        this.f6624r.setStrokeWidth(this.f6611e);
        if (this.f6616j) {
            Paint paint4 = this.f6623q;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint4.setStrokeCap(cap);
            this.f6624r.setStrokeCap(cap);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6608b;
        if (drawable != null && drawable.isStateful()) {
            this.f6608b.setState(getDrawableState());
        }
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m9585e(int i, boolean z) {
        m9589i(i, z);
    }

    /* JADX INFO: renamed from: f */
    public final void m9586f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m9587g() {
    }

    public int getArcColor() {
        return this.f6623q.getColor();
    }

    public int getArcRotation() {
        return this.f6615i;
    }

    public int getArcWidth() {
        return this.f6612f;
    }

    public int getMax() {
        return this.f6609c;
    }

    public int getProgress() {
        return this.f6610d;
    }

    public int getProgressColor() {
        return this.f6624r.getColor();
    }

    public int getProgressWidth() {
        return this.f6611e;
    }

    public int getStartAngle() {
        return this.f6613g;
    }

    public int getSweepAngle() {
        return this.f6614h;
    }

    /* JADX INFO: renamed from: h */
    public final void m9588h(MotionEvent motionEvent) {
        if (m9583c(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double dM9582b = m9582b(motionEvent.getX(), motionEvent.getY());
        this.f6629w = dM9582b;
        m9585e(m9581a(dM9582b), true);
    }

    /* JADX INFO: renamed from: i */
    public final void m9589i(int i, boolean z) {
        if (i == f6605B) {
            return;
        }
        int i2 = this.f6609c;
        if (i > i2) {
            i = i2;
        }
        if (i < 0) {
            i = 0;
        }
        this.f6610d = i;
        this.f6621o = (i / i2) * this.f6614h;
        m9590j();
        invalidate();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f6619m;
    }

    /* JADX INFO: renamed from: j */
    public final void m9590j() {
        double d = (int) (this.f6613g + this.f6621o + this.f6615i + 90.0f);
        this.f6627u = (int) (((double) this.f6620n) * Math.cos(Math.toRadians(d)));
        this.f6628v = (int) (((double) this.f6620n) * Math.sin(Math.toRadians(d)));
    }

    /* JADX INFO: renamed from: k */
    public final float m9591k() {
        return this.f6609c / this.f6614h;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f6606A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        if (!this.f6618l) {
            canvas.scale(-1.0f, 1.0f, this.f6622p.centerX(), this.f6622p.centerY());
        }
        float f = (this.f6613g - 90) + this.f6615i;
        canvas.drawArc(this.f6622p, f, this.f6614h, false, this.f6623q);
        canvas.drawArc(this.f6622p, f, this.f6621o, false, this.f6624r);
        if (this.f6619m || this.f6631y) {
            if (!this.f6632z || ((i = this.f6610d) < this.f6609c && i > 0)) {
                canvas.translate(this.f6625s - this.f6627u, this.f6626t - this.f6628v);
                if (NullChecker.a(this.f6608b)) {
                    this.f6608b.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int iMin = Math.min(defaultSize2, defaultSize);
        this.f6625s = (int) (defaultSize2 * 0.5f);
        this.f6626t = (int) (defaultSize * 0.5f);
        int paddingLeft = iMin - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.f6620n = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.f6622p.set(f2, f, f2 + f3, f3 + f);
        double d = ((int) this.f6621o) + this.f6613g + this.f6615i + 90;
        this.f6627u = (int) (((double) this.f6620n) * Math.cos(Math.toRadians(d)));
        this.f6628v = (int) (((double) this.f6620n) * Math.sin(Math.toRadians(d)));
        setTouchInSide(this.f6617k);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6619m) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            m9586f();
            m9588h(motionEvent);
        } else if (action == 1) {
            m9587g();
            setPressed(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            m9588h(motionEvent);
        } else if (action == 3) {
            m9587g();
            setPressed(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setArcColor(int i) {
        this.f6623q.setColor(i);
        invalidate();
    }

    public void setArcRotation(int i) {
        this.f6615i = i;
        m9590j();
    }

    public void setArcWidth(int i) {
        this.f6612f = i;
        this.f6623q.setStrokeWidth(i);
    }

    public void setClockwise(boolean z) {
        this.f6618l = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.f6619m = z;
    }

    public void setMax(int i) {
        this.f6609c = i;
    }

    public void setOnSeekArcChangeListener(InterfaceC0366a interfaceC0366a) {
    }

    public void setProgress(int i) {
        m9589i(i, false);
    }

    public void setProgressColor(int i) {
        this.f6624r.setColor(i);
        invalidate();
    }

    public void setProgressWidth(int i) {
        this.f6611e = i;
        this.f6624r.setStrokeWidth(i);
    }

    public void setRoundedEdges(boolean z) {
        this.f6616j = z;
        Paint paint = this.f6623q;
        if (z) {
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            this.f6624r.setStrokeCap(cap);
        } else {
            Paint.Cap cap2 = Paint.Cap.SQUARE;
            paint.setStrokeCap(cap2);
            this.f6624r.setStrokeCap(cap2);
        }
    }

    public void setShowThumb(boolean z) {
        this.f6631y = z;
    }

    public void setStartAngle(int i) {
        this.f6613g = i;
        m9590j();
    }

    public void setSweepAngle(int i) {
        this.f6614h = i;
        m9590j();
    }

    public void setThumbHideInEdge(boolean z) {
        this.f6632z = this.f6632z;
    }

    public void setTouchInSide(boolean z) {
        int iMax;
        int intrinsicWidth;
        if (NullChecker.a(this.f6608b)) {
            iMax = this.f6608b.getIntrinsicHeight() / 2;
            intrinsicWidth = this.f6608b.getIntrinsicWidth() / 2;
        } else {
            iMax = Math.max(this.f6611e, this.f6612f) / 2;
            intrinsicWidth = iMax;
        }
        this.f6617k = z;
        int i = this.f6620n;
        if (z) {
            this.f6630x = i / 4.0f;
        } else {
            this.f6630x = i - Math.min(intrinsicWidth, iMax);
        }
    }

    public SeekArc(Context context) {
        super(context);
        this.f6607a = -90;
        this.f6609c = 100;
        this.f6610d = 0;
        this.f6611e = 4;
        this.f6612f = 2;
        this.f6613g = 0;
        this.f6614h = 360;
        this.f6615i = 0;
        this.f6616j = false;
        this.f6617k = false;
        this.f6618l = true;
        this.f6619m = true;
        this.f6620n = 0;
        this.f6621o = 0.0f;
        this.f6622p = new RectF();
        this.f6632z = true;
        m9584d(context, null, 0);
    }

    public SeekArc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6607a = -90;
        this.f6609c = 100;
        this.f6610d = 0;
        this.f6611e = 4;
        this.f6612f = 2;
        this.f6613g = 0;
        this.f6614h = 360;
        this.f6615i = 0;
        this.f6616j = false;
        this.f6617k = false;
        this.f6618l = true;
        this.f6619m = true;
        this.f6620n = 0;
        this.f6621o = 0.0f;
        this.f6622p = new RectF();
        this.f6632z = true;
        m9584d(context, attributeSet, i);
    }
}
