package com.p046p1.mobile.putong.core.p053ui.view;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import p149l.i9c0;
import p149l.l0c0;

/* JADX INFO: loaded from: classes9.dex */
public class SeekArc extends View {

    /* JADX INFO: renamed from: B */
    public static int f36824B = -1;

    /* JADX INFO: renamed from: A */
    public ValueAnimator f36825A;

    /* JADX INFO: renamed from: a */
    public final int f36826a;

    /* JADX INFO: renamed from: b */
    public Drawable f36827b;

    /* JADX INFO: renamed from: c */
    public int f36828c;

    /* JADX INFO: renamed from: d */
    public int f36829d;

    /* JADX INFO: renamed from: e */
    public int f36830e;

    /* JADX INFO: renamed from: f */
    public int f36831f;

    /* JADX INFO: renamed from: g */
    public int f36832g;

    /* JADX INFO: renamed from: h */
    public int f36833h;

    /* JADX INFO: renamed from: i */
    public int f36834i;

    /* JADX INFO: renamed from: j */
    public boolean f36835j;

    /* JADX INFO: renamed from: k */
    public boolean f36836k;

    /* JADX INFO: renamed from: l */
    public boolean f36837l;

    /* JADX INFO: renamed from: m */
    public boolean f36838m;

    /* JADX INFO: renamed from: n */
    public int f36839n;

    /* JADX INFO: renamed from: o */
    public float f36840o;

    /* JADX INFO: renamed from: p */
    public RectF f36841p;

    /* JADX INFO: renamed from: q */
    public Paint f36842q;

    /* JADX INFO: renamed from: r */
    public Paint f36843r;

    /* JADX INFO: renamed from: s */
    public int f36844s;

    /* JADX INFO: renamed from: t */
    public int f36845t;

    /* JADX INFO: renamed from: u */
    public int f36846u;

    /* JADX INFO: renamed from: v */
    public int f36847v;

    /* JADX INFO: renamed from: w */
    public double f36848w;

    /* JADX INFO: renamed from: x */
    public float f36849x;

    /* JADX INFO: renamed from: y */
    public boolean f36850y;

    /* JADX INFO: renamed from: z */
    public boolean f36851z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.SeekArc$a */
    public interface InterfaceC8930a {
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36826a = -90;
        this.f36828c = 100;
        this.f36829d = 0;
        this.f36830e = 4;
        this.f36831f = 2;
        this.f36832g = 0;
        this.f36833h = 360;
        this.f36834i = 0;
        this.f36835j = false;
        this.f36836k = false;
        this.f36837l = true;
        this.f36838m = true;
        this.f36839n = 0;
        this.f36840o = 0.0f;
        this.f36841p = new RectF();
        this.f36851z = true;
        m56157d(context, attributeSet, l0c0.f125496k);
    }

    /* JADX INFO: renamed from: a */
    public final int m56154a(double d) {
        int iRound = (int) Math.round(((double) m56164k()) * d);
        if (iRound < 0) {
            iRound = f36824B;
        }
        return iRound > this.f36828c ? f36824B : iRound;
    }

    /* JADX INFO: renamed from: b */
    public final double m56155b(float f, float f2) {
        float f3 = f - this.f36844s;
        float f4 = f2 - this.f36845t;
        if (!this.f36837l) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.f36834i));
        if (degrees < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            degrees += 360.0d;
        }
        return degrees - ((double) this.f36832g);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56156c(float f, float f2) {
        float f3 = f - this.f36844s;
        float f4 = f2 - this.f36845t;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.f36849x;
    }

    /* JADX INFO: renamed from: d */
    public final void m56157d(Context context, AttributeSet attributeSet, int i) {
        getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = Color.parseColor("#66ffffff");
        this.f36830e = (int) (this.f36830e * f);
        int color2 = -65536;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f112148Q, i, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i9c0.f112163c0);
            if (drawable != null) {
                this.f36827b = drawable;
                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                int intrinsicWidth = this.f36827b.getIntrinsicWidth() / 2;
                this.f36827b.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            }
            this.f36828c = typedArrayObtainStyledAttributes.getInteger(i9c0.f112152U, this.f36828c);
            this.f36829d = typedArrayObtainStyledAttributes.getInteger(i9c0.f112153V, this.f36829d);
            this.f36830e = (int) typedArrayObtainStyledAttributes.getDimension(i9c0.f112155X, this.f36830e);
            this.f36831f = (int) typedArrayObtainStyledAttributes.getDimension(i9c0.f112167e0, this.f36831f);
            this.f36832g = typedArrayObtainStyledAttributes.getInt(i9c0.f112159a0, this.f36832g);
            this.f36833h = typedArrayObtainStyledAttributes.getInt(i9c0.f112161b0, this.f36833h);
            this.f36834i = typedArrayObtainStyledAttributes.getInt(i9c0.f112156Y, this.f36834i);
            this.f36835j = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112157Z, this.f36835j);
            this.f36836k = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112165d0, this.f36836k);
            this.f36837l = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112149R, this.f36837l);
            this.f36838m = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112151T, this.f36838m);
            color = typedArrayObtainStyledAttributes.getColor(i9c0.f112150S, color);
            color2 = typedArrayObtainStyledAttributes.getColor(i9c0.f112154W, -65536);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f36829d;
        int i3 = this.f36828c;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f36829d = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f36829d = i2;
        int i4 = this.f36833h;
        if (i4 > 360) {
            i4 = 360;
        }
        this.f36833h = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.f36833h = i4;
        this.f36840o = (i2 / i3) * i4;
        int i5 = this.f36832g;
        if (i5 > 360) {
            i5 = 0;
        }
        this.f36832g = i5;
        this.f36832g = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.f36842q = paint;
        paint.setColor(color);
        this.f36842q.setAntiAlias(true);
        Paint paint2 = this.f36842q;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f36842q.setStrokeWidth(this.f36831f);
        Paint paint3 = new Paint();
        this.f36843r = paint3;
        paint3.setColor(color2);
        this.f36843r.setAntiAlias(true);
        this.f36843r.setStyle(style);
        this.f36843r.setStrokeWidth(this.f36830e);
        if (this.f36835j) {
            Paint paint4 = this.f36842q;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint4.setStrokeCap(cap);
            this.f36843r.setStrokeCap(cap);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f36827b;
        if (drawable != null && drawable.isStateful()) {
            this.f36827b.setState(getDrawableState());
        }
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m56158e(int i, boolean z) {
        m56162i(i, z);
    }

    /* JADX INFO: renamed from: f */
    public final void m56159f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m56160g() {
    }

    public int getArcColor() {
        return this.f36842q.getColor();
    }

    public int getArcRotation() {
        return this.f36834i;
    }

    public int getArcWidth() {
        return this.f36831f;
    }

    public int getMax() {
        return this.f36828c;
    }

    public int getProgress() {
        return this.f36829d;
    }

    public int getProgressColor() {
        return this.f36843r.getColor();
    }

    public int getProgressWidth() {
        return this.f36830e;
    }

    public int getStartAngle() {
        return this.f36832g;
    }

    public int getSweepAngle() {
        return this.f36833h;
    }

    /* JADX INFO: renamed from: h */
    public final void m56161h(MotionEvent motionEvent) {
        if (m56156c(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double dM56155b = m56155b(motionEvent.getX(), motionEvent.getY());
        this.f36848w = dM56155b;
        m56158e(m56154a(dM56155b), true);
    }

    /* JADX INFO: renamed from: i */
    public final void m56162i(int i, boolean z) {
        if (i == f36824B) {
            return;
        }
        int i2 = this.f36828c;
        if (i > i2) {
            i = i2;
        }
        if (i < 0) {
            i = 0;
        }
        this.f36829d = i;
        this.f36840o = (i / i2) * this.f36833h;
        m56163j();
        invalidate();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f36838m;
    }

    /* JADX INFO: renamed from: j */
    public final void m56163j() {
        double d = (int) (this.f36832g + this.f36840o + this.f36834i + 90.0f);
        this.f36846u = (int) (((double) this.f36839n) * Math.cos(Math.toRadians(d)));
        this.f36847v = (int) (((double) this.f36839n) * Math.sin(Math.toRadians(d)));
    }

    /* JADX INFO: renamed from: k */
    public final float m56164k() {
        return this.f36828c / this.f36833h;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f36825A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        if (!this.f36837l) {
            canvas.scale(-1.0f, 1.0f, this.f36841p.centerX(), this.f36841p.centerY());
        }
        float f = (this.f36832g - 90) + this.f36834i;
        canvas.drawArc(this.f36841p, f, this.f36833h, false, this.f36842q);
        canvas.drawArc(this.f36841p, f, this.f36840o, false, this.f36843r);
        if (this.f36838m || this.f36850y) {
            if (!this.f36851z || ((i = this.f36829d) < this.f36828c && i > 0)) {
                canvas.translate(this.f36844s - this.f36846u, this.f36845t - this.f36847v);
                if (NullChecker.m81303a(this.f36827b)) {
                    this.f36827b.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int iMin = Math.min(defaultSize2, defaultSize);
        this.f36844s = (int) (defaultSize2 * 0.5f);
        this.f36845t = (int) (defaultSize * 0.5f);
        int paddingLeft = iMin - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.f36839n = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.f36841p.set(f2, f, f2 + f3, f3 + f);
        double d = ((int) this.f36840o) + this.f36832g + this.f36834i + 90;
        this.f36846u = (int) (((double) this.f36839n) * Math.cos(Math.toRadians(d)));
        this.f36847v = (int) (((double) this.f36839n) * Math.sin(Math.toRadians(d)));
        setTouchInSide(this.f36836k);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f36838m) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            m56159f();
            m56161h(motionEvent);
        } else if (action == 1) {
            m56160g();
            setPressed(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            m56161h(motionEvent);
        } else if (action == 3) {
            m56160g();
            setPressed(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setArcColor(int i) {
        this.f36842q.setColor(i);
        invalidate();
    }

    public void setArcRotation(int i) {
        this.f36834i = i;
        m56163j();
    }

    public void setArcWidth(int i) {
        this.f36831f = i;
        this.f36842q.setStrokeWidth(i);
    }

    public void setClockwise(boolean z) {
        this.f36837l = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.f36838m = z;
    }

    public void setMax(int i) {
        this.f36828c = i;
    }

    public void setOnSeekArcChangeListener(InterfaceC8930a interfaceC8930a) {
    }

    public void setProgress(int i) {
        m56162i(i, false);
    }

    public void setProgressColor(int i) {
        this.f36843r.setColor(i);
        invalidate();
    }

    public void setProgressWidth(int i) {
        this.f36830e = i;
        this.f36843r.setStrokeWidth(i);
    }

    public void setRoundedEdges(boolean z) {
        this.f36835j = z;
        Paint paint = this.f36842q;
        if (z) {
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            this.f36843r.setStrokeCap(cap);
        } else {
            Paint.Cap cap2 = Paint.Cap.SQUARE;
            paint.setStrokeCap(cap2);
            this.f36843r.setStrokeCap(cap2);
        }
    }

    public void setShowThumb(boolean z) {
        this.f36850y = z;
    }

    public void setStartAngle(int i) {
        this.f36832g = i;
        m56163j();
    }

    public void setSweepAngle(int i) {
        this.f36833h = i;
        m56163j();
    }

    public void setThumbHideInEdge(boolean z) {
        this.f36851z = this.f36851z;
    }

    public void setTouchInSide(boolean z) {
        int iMax;
        int intrinsicWidth;
        if (NullChecker.m81303a(this.f36827b)) {
            iMax = this.f36827b.getIntrinsicHeight() / 2;
            intrinsicWidth = this.f36827b.getIntrinsicWidth() / 2;
        } else {
            iMax = Math.max(this.f36830e, this.f36831f) / 2;
            intrinsicWidth = iMax;
        }
        this.f36836k = z;
        int i = this.f36839n;
        if (z) {
            this.f36849x = i / 4.0f;
        } else {
            this.f36849x = i - Math.min(intrinsicWidth, iMax);
        }
    }

    public SeekArc(Context context) {
        super(context);
        this.f36826a = -90;
        this.f36828c = 100;
        this.f36829d = 0;
        this.f36830e = 4;
        this.f36831f = 2;
        this.f36832g = 0;
        this.f36833h = 360;
        this.f36834i = 0;
        this.f36835j = false;
        this.f36836k = false;
        this.f36837l = true;
        this.f36838m = true;
        this.f36839n = 0;
        this.f36840o = 0.0f;
        this.f36841p = new RectF();
        this.f36851z = true;
        m56157d(context, null, 0);
    }

    public SeekArc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36826a = -90;
        this.f36828c = 100;
        this.f36829d = 0;
        this.f36830e = 4;
        this.f36831f = 2;
        this.f36832g = 0;
        this.f36833h = 360;
        this.f36834i = 0;
        this.f36835j = false;
        this.f36836k = false;
        this.f36837l = true;
        this.f36838m = true;
        this.f36839n = 0;
        this.f36840o = 0.0f;
        this.f36841p = new RectF();
        this.f36851z = true;
        m56157d(context, attributeSet, i);
    }
}
