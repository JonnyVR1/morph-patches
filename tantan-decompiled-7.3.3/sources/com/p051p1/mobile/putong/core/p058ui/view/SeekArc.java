package com.p051p1.mobile.putong.core.p058ui.view;

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
import p153l.ohc0;
import p153l.q8c0;

/* JADX INFO: loaded from: classes12.dex */
public class SeekArc extends View {

    /* JADX INFO: renamed from: B */
    public static int f37672B = -1;

    /* JADX INFO: renamed from: A */
    public ValueAnimator f37673A;

    /* JADX INFO: renamed from: a */
    public final int f37674a;

    /* JADX INFO: renamed from: b */
    public Drawable f37675b;

    /* JADX INFO: renamed from: c */
    public int f37676c;

    /* JADX INFO: renamed from: d */
    public int f37677d;

    /* JADX INFO: renamed from: e */
    public int f37678e;

    /* JADX INFO: renamed from: f */
    public int f37679f;

    /* JADX INFO: renamed from: g */
    public int f37680g;

    /* JADX INFO: renamed from: h */
    public int f37681h;

    /* JADX INFO: renamed from: i */
    public int f37682i;

    /* JADX INFO: renamed from: j */
    public boolean f37683j;

    /* JADX INFO: renamed from: k */
    public boolean f37684k;

    /* JADX INFO: renamed from: l */
    public boolean f37685l;

    /* JADX INFO: renamed from: m */
    public boolean f37686m;

    /* JADX INFO: renamed from: n */
    public int f37687n;

    /* JADX INFO: renamed from: o */
    public float f37688o;

    /* JADX INFO: renamed from: p */
    public RectF f37689p;

    /* JADX INFO: renamed from: q */
    public Paint f37690q;

    /* JADX INFO: renamed from: r */
    public Paint f37691r;

    /* JADX INFO: renamed from: s */
    public int f37692s;

    /* JADX INFO: renamed from: t */
    public int f37693t;

    /* JADX INFO: renamed from: u */
    public int f37694u;

    /* JADX INFO: renamed from: v */
    public int f37695v;

    /* JADX INFO: renamed from: w */
    public double f37696w;

    /* JADX INFO: renamed from: x */
    public float f37697x;

    /* JADX INFO: renamed from: y */
    public boolean f37698y;

    /* JADX INFO: renamed from: z */
    public boolean f37699z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.SeekArc$a */
    public interface InterfaceC9093a {
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37674a = -90;
        this.f37676c = 100;
        this.f37677d = 0;
        this.f37678e = 4;
        this.f37679f = 2;
        this.f37680g = 0;
        this.f37681h = 360;
        this.f37682i = 0;
        this.f37683j = false;
        this.f37684k = false;
        this.f37685l = true;
        this.f37686m = true;
        this.f37687n = 0;
        this.f37688o = 0.0f;
        this.f37689p = new RectF();
        this.f37699z = true;
        m57340d(context, attributeSet, q8c0.f156101k);
    }

    /* JADX INFO: renamed from: a */
    public final int m57337a(double d) {
        int iRound = (int) Math.round(((double) m57347k()) * d);
        if (iRound < 0) {
            iRound = f37672B;
        }
        return iRound > this.f37676c ? f37672B : iRound;
    }

    /* JADX INFO: renamed from: b */
    public final double m57338b(float f, float f2) {
        float f3 = f - this.f37692s;
        float f4 = f2 - this.f37693t;
        if (!this.f37685l) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.f37682i));
        if (degrees < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            degrees += 360.0d;
        }
        return degrees - ((double) this.f37680g);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57339c(float f, float f2) {
        float f3 = f - this.f37692s;
        float f4 = f2 - this.f37693t;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.f37697x;
    }

    /* JADX INFO: renamed from: d */
    public final void m57340d(Context context, AttributeSet attributeSet, int i) {
        getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = Color.parseColor("#66ffffff");
        this.f37678e = (int) (this.f37678e * f);
        int color2 = -65536;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147373Q, i, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(ohc0.f147388c0);
            if (drawable != null) {
                this.f37675b = drawable;
                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                int intrinsicWidth = this.f37675b.getIntrinsicWidth() / 2;
                this.f37675b.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            }
            this.f37676c = typedArrayObtainStyledAttributes.getInteger(ohc0.f147377U, this.f37676c);
            this.f37677d = typedArrayObtainStyledAttributes.getInteger(ohc0.f147378V, this.f37677d);
            this.f37678e = (int) typedArrayObtainStyledAttributes.getDimension(ohc0.f147380X, this.f37678e);
            this.f37679f = (int) typedArrayObtainStyledAttributes.getDimension(ohc0.f147392e0, this.f37679f);
            this.f37680g = typedArrayObtainStyledAttributes.getInt(ohc0.f147384a0, this.f37680g);
            this.f37681h = typedArrayObtainStyledAttributes.getInt(ohc0.f147386b0, this.f37681h);
            this.f37682i = typedArrayObtainStyledAttributes.getInt(ohc0.f147381Y, this.f37682i);
            this.f37683j = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147382Z, this.f37683j);
            this.f37684k = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147390d0, this.f37684k);
            this.f37685l = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147374R, this.f37685l);
            this.f37686m = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147376T, this.f37686m);
            color = typedArrayObtainStyledAttributes.getColor(ohc0.f147375S, color);
            color2 = typedArrayObtainStyledAttributes.getColor(ohc0.f147379W, -65536);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f37677d;
        int i3 = this.f37676c;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f37677d = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f37677d = i2;
        int i4 = this.f37681h;
        if (i4 > 360) {
            i4 = 360;
        }
        this.f37681h = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.f37681h = i4;
        this.f37688o = (i2 / i3) * i4;
        int i5 = this.f37680g;
        if (i5 > 360) {
            i5 = 0;
        }
        this.f37680g = i5;
        this.f37680g = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.f37690q = paint;
        paint.setColor(color);
        this.f37690q.setAntiAlias(true);
        Paint paint2 = this.f37690q;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f37690q.setStrokeWidth(this.f37679f);
        Paint paint3 = new Paint();
        this.f37691r = paint3;
        paint3.setColor(color2);
        this.f37691r.setAntiAlias(true);
        this.f37691r.setStyle(style);
        this.f37691r.setStrokeWidth(this.f37678e);
        if (this.f37683j) {
            Paint paint4 = this.f37690q;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint4.setStrokeCap(cap);
            this.f37691r.setStrokeCap(cap);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f37675b;
        if (drawable != null && drawable.isStateful()) {
            this.f37675b.setState(getDrawableState());
        }
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m57341e(int i, boolean z) {
        m57345i(i, z);
    }

    /* JADX INFO: renamed from: f */
    public final void m57342f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m57343g() {
    }

    public int getArcColor() {
        return this.f37690q.getColor();
    }

    public int getArcRotation() {
        return this.f37682i;
    }

    public int getArcWidth() {
        return this.f37679f;
    }

    public int getMax() {
        return this.f37676c;
    }

    public int getProgress() {
        return this.f37677d;
    }

    public int getProgressColor() {
        return this.f37691r.getColor();
    }

    public int getProgressWidth() {
        return this.f37678e;
    }

    public int getStartAngle() {
        return this.f37680g;
    }

    public int getSweepAngle() {
        return this.f37681h;
    }

    /* JADX INFO: renamed from: h */
    public final void m57344h(MotionEvent motionEvent) {
        if (m57339c(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double dM57338b = m57338b(motionEvent.getX(), motionEvent.getY());
        this.f37696w = dM57338b;
        m57341e(m57337a(dM57338b), true);
    }

    /* JADX INFO: renamed from: i */
    public final void m57345i(int i, boolean z) {
        if (i == f37672B) {
            return;
        }
        int i2 = this.f37676c;
        if (i > i2) {
            i = i2;
        }
        if (i < 0) {
            i = 0;
        }
        this.f37677d = i;
        this.f37688o = (i / i2) * this.f37681h;
        m57346j();
        invalidate();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f37686m;
    }

    /* JADX INFO: renamed from: j */
    public final void m57346j() {
        double d = (int) (this.f37680g + this.f37688o + this.f37682i + 90.0f);
        this.f37694u = (int) (((double) this.f37687n) * Math.cos(Math.toRadians(d)));
        this.f37695v = (int) (((double) this.f37687n) * Math.sin(Math.toRadians(d)));
    }

    /* JADX INFO: renamed from: k */
    public final float m57347k() {
        return this.f37676c / this.f37681h;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f37673A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        if (!this.f37685l) {
            canvas.scale(-1.0f, 1.0f, this.f37689p.centerX(), this.f37689p.centerY());
        }
        float f = (this.f37680g - 90) + this.f37682i;
        canvas.drawArc(this.f37689p, f, this.f37681h, false, this.f37690q);
        canvas.drawArc(this.f37689p, f, this.f37688o, false, this.f37691r);
        if (this.f37686m || this.f37698y) {
            if (!this.f37699z || ((i = this.f37677d) < this.f37676c && i > 0)) {
                canvas.translate(this.f37692s - this.f37694u, this.f37693t - this.f37695v);
                if (NullChecker.m82486a(this.f37675b)) {
                    this.f37675b.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int iMin = Math.min(defaultSize2, defaultSize);
        this.f37692s = (int) (defaultSize2 * 0.5f);
        this.f37693t = (int) (defaultSize * 0.5f);
        int paddingLeft = iMin - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.f37687n = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.f37689p.set(f2, f, f2 + f3, f3 + f);
        double d = ((int) this.f37688o) + this.f37680g + this.f37682i + 90;
        this.f37694u = (int) (((double) this.f37687n) * Math.cos(Math.toRadians(d)));
        this.f37695v = (int) (((double) this.f37687n) * Math.sin(Math.toRadians(d)));
        setTouchInSide(this.f37684k);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37686m) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            m57342f();
            m57344h(motionEvent);
        } else if (action == 1) {
            m57343g();
            setPressed(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            m57344h(motionEvent);
        } else if (action == 3) {
            m57343g();
            setPressed(false);
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setArcColor(int i) {
        this.f37690q.setColor(i);
        invalidate();
    }

    public void setArcRotation(int i) {
        this.f37682i = i;
        m57346j();
    }

    public void setArcWidth(int i) {
        this.f37679f = i;
        this.f37690q.setStrokeWidth(i);
    }

    public void setClockwise(boolean z) {
        this.f37685l = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.f37686m = z;
    }

    public void setMax(int i) {
        this.f37676c = i;
    }

    public void setOnSeekArcChangeListener(InterfaceC9093a interfaceC9093a) {
    }

    public void setProgress(int i) {
        m57345i(i, false);
    }

    public void setProgressColor(int i) {
        this.f37691r.setColor(i);
        invalidate();
    }

    public void setProgressWidth(int i) {
        this.f37678e = i;
        this.f37691r.setStrokeWidth(i);
    }

    public void setRoundedEdges(boolean z) {
        this.f37683j = z;
        Paint paint = this.f37690q;
        if (z) {
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            this.f37691r.setStrokeCap(cap);
        } else {
            Paint.Cap cap2 = Paint.Cap.SQUARE;
            paint.setStrokeCap(cap2);
            this.f37691r.setStrokeCap(cap2);
        }
    }

    public void setShowThumb(boolean z) {
        this.f37698y = z;
    }

    public void setStartAngle(int i) {
        this.f37680g = i;
        m57346j();
    }

    public void setSweepAngle(int i) {
        this.f37681h = i;
        m57346j();
    }

    public void setThumbHideInEdge(boolean z) {
        this.f37699z = this.f37699z;
    }

    public void setTouchInSide(boolean z) {
        int iMax;
        int intrinsicWidth;
        if (NullChecker.m82486a(this.f37675b)) {
            iMax = this.f37675b.getIntrinsicHeight() / 2;
            intrinsicWidth = this.f37675b.getIntrinsicWidth() / 2;
        } else {
            iMax = Math.max(this.f37678e, this.f37679f) / 2;
            intrinsicWidth = iMax;
        }
        this.f37684k = z;
        int i = this.f37687n;
        if (z) {
            this.f37697x = i / 4.0f;
        } else {
            this.f37697x = i - Math.min(intrinsicWidth, iMax);
        }
    }

    public SeekArc(Context context) {
        super(context);
        this.f37674a = -90;
        this.f37676c = 100;
        this.f37677d = 0;
        this.f37678e = 4;
        this.f37679f = 2;
        this.f37680g = 0;
        this.f37681h = 360;
        this.f37682i = 0;
        this.f37683j = false;
        this.f37684k = false;
        this.f37685l = true;
        this.f37686m = true;
        this.f37687n = 0;
        this.f37688o = 0.0f;
        this.f37689p = new RectF();
        this.f37699z = true;
        m57340d(context, null, 0);
    }

    public SeekArc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37674a = -90;
        this.f37676c = 100;
        this.f37677d = 0;
        this.f37678e = 4;
        this.f37679f = 2;
        this.f37680g = 0;
        this.f37681h = 360;
        this.f37682i = 0;
        this.f37683j = false;
        this.f37684k = false;
        this.f37685l = true;
        this.f37686m = true;
        this.f37687n = 0;
        this.f37688o = 0.0f;
        this.f37689p = new RectF();
        this.f37699z = true;
        m57340d(context, attributeSet, i);
    }
}
