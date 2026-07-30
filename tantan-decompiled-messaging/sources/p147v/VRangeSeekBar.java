package p147v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.Number;
import java.math.BigDecimal;
import p149l.all;
import p149l.b9c0;
import p149l.t0c0;
import p149l.t100;
import p149l.u2c0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VRangeSeekBar<T extends Number> extends ImageView {

    /* JADX INFO: renamed from: A */
    public T f209290A;

    /* JADX INFO: renamed from: B */
    public boolean f209291B;

    /* JADX INFO: renamed from: a */
    public final Paint f209292a;

    /* JADX INFO: renamed from: b */
    public Bitmap f209293b;

    /* JADX INFO: renamed from: c */
    public Bitmap f209294c;

    /* JADX INFO: renamed from: d */
    public float f209295d;

    /* JADX INFO: renamed from: e */
    public float f209296e;

    /* JADX INFO: renamed from: f */
    public float f209297f;

    /* JADX INFO: renamed from: g */
    public float f209298g;

    /* JADX INFO: renamed from: h */
    public float f209299h;

    /* JADX INFO: renamed from: i */
    public T f209300i;

    /* JADX INFO: renamed from: j */
    public T f209301j;

    /* JADX INFO: renamed from: k */
    public NumberType f209302k;

    /* JADX INFO: renamed from: l */
    public double f209303l;

    /* JADX INFO: renamed from: m */
    public double f209304m;

    /* JADX INFO: renamed from: n */
    public double f209305n;

    /* JADX INFO: renamed from: o */
    public double f209306o;

    /* JADX INFO: renamed from: p */
    public Thumb f209307p;

    /* JADX INFO: renamed from: q */
    public boolean f209308q;

    /* JADX INFO: renamed from: r */
    public InterfaceC22563b<T> f209309r;

    /* JADX INFO: renamed from: s */
    public int f209310s;

    /* JADX INFO: renamed from: t */
    public int f209311t;

    /* JADX INFO: renamed from: u */
    public float f209312u;

    /* JADX INFO: renamed from: v */
    public int f209313v;

    /* JADX INFO: renamed from: w */
    public int f209314w;

    /* JADX INFO: renamed from: x */
    public int f209315x;

    /* JADX INFO: renamed from: y */
    public int f209316y;

    /* JADX INFO: renamed from: z */
    public boolean f209317z;

    public enum NumberType {
        LONG,
        DOUBLE,
        INTEGER,
        FLOAT,
        SHORT,
        BYTE,
        BIG_DECIMAL;

        public static <E extends Number> NumberType fromNumber(E e) throws IllegalArgumentException {
            if (e instanceof Long) {
                return LONG;
            }
            if (e instanceof Double) {
                return DOUBLE;
            }
            if (e instanceof Integer) {
                return INTEGER;
            }
            if (e instanceof Float) {
                return FLOAT;
            }
            if (e instanceof Short) {
                return SHORT;
            }
            if (e instanceof Byte) {
                return BYTE;
            }
            if (e instanceof BigDecimal) {
                return BIG_DECIMAL;
            }
            all.m97315a("Number class '", e.getClass().getName(), "' is not supported");
            return null;
        }

        public Number toNumber(double d) {
            switch (C22562a.f209318a[ordinal()]) {
                case 1:
                    return new Long((long) d);
                case 2:
                    return Double.valueOf(d);
                case 3:
                    return new Integer((int) d);
                case 4:
                    return new Float(d);
                case 5:
                    return new Short((short) d);
                case 6:
                    return new Byte((byte) d);
                case 7:
                    return new BigDecimal(d);
                default:
                    throw new InstantiationError("can't convert " + this + " to a Number object");
            }
        }
    }

    public enum Thumb {
        MIN,
        MAX,
        BOTH
    }

    /* JADX INFO: renamed from: v.VRangeSeekBar$a */
    public static /* synthetic */ class C22562a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f209318a;

        static {
            int[] iArr = new int[NumberType.values().length];
            f209318a = iArr;
            try {
                iArr[NumberType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f209318a[NumberType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f209318a[NumberType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f209318a[NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f209318a[NumberType.SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f209318a[NumberType.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f209318a[NumberType.BIG_DECIMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: v.VRangeSeekBar$b */
    public interface InterfaceC22563b<T> {
        /* JADX INFO: renamed from: a */
        void mo194990a(VRangeSeekBar<?> vRangeSeekBar, T t, T t2, boolean z);
    }

    public VRangeSeekBar(Context context) throws IllegalArgumentException {
        super(context);
        this.f209292a = new Paint(1);
        this.f209298g = t100.m186890d(3.0f);
        this.f209305n = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f209306o = 1.0d;
        this.f209307p = null;
        this.f209308q = false;
        this.f209311t = -3355444;
        this.f209313v = 255;
        this.f209291B = false;
        m223167a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m223167a(AttributeSet attributeSet) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f209314w = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f74224A4);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74238C4)) {
                this.f209315x = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74238C4, u2c0.f173393n6);
            } else {
                this.f209315x = u2c0.f173393n6;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74245D4)) {
                this.f209316y = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74245D4, u2c0.f173401o6);
            } else {
                this.f209316y = u2c0.f173401o6;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74231B4)) {
                this.f209310s = typedArrayObtainStyledAttributes.getColor(b9c0.f74231B4, getResources().getColor(t0c0.f167146D));
            } else {
                this.f209310s = getRangeColor();
            }
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f209315x = u2c0.f173393n6;
            this.f209316y = u2c0.f173401o6;
            this.f209310s = getRangeColor();
        }
        this.f209293b = getThumbImage();
        this.f209294c = getThumbPressedImage();
        float width = this.f209293b.getWidth();
        this.f209295d = width;
        this.f209296e = width * 0.5f;
        this.f209297f = this.f209293b.getHeight() * 0.5f;
        this.f209299h = this.f209296e;
    }

    /* JADX INFO: renamed from: b */
    public final void m223168b() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m223169c(float f, boolean z, Canvas canvas) {
        canvas.drawBitmap(z ? this.f209294c : this.f209293b, f - this.f209296e, (getHeight() * 0.5f) - this.f209297f, this.f209292a);
    }

    /* JADX INFO: renamed from: d */
    public final Thumb m223170d(float f) {
        boolean zM223172f = m223172f(f, this.f209305n);
        boolean zM223172f2 = m223172f(f, this.f209306o);
        if (zM223172f && zM223172f2) {
            return Thumb.BOTH;
        }
        if (zM223172f) {
            return Thumb.MIN;
        }
        if (zM223172f2) {
            return Thumb.MAX;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m223171e(T t, T t2) {
        this.f209301j = t2;
        this.f209300i = t;
        this.f209303l = t.doubleValue();
        this.f209304m = t2.doubleValue();
        this.f209302k = NumberType.fromNumber(this.f209300i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m223172f(float f, double d) {
        return Math.abs(f - m223173g(d)) <= this.f209296e;
    }

    /* JADX INFO: renamed from: g */
    public final float m223173g(double d) {
        return (float) (((double) this.f209299h) + (d * ((double) (getWidth() - (this.f209299h * 2.0f)))));
    }

    public T getAbsoluteMaxValue() {
        return this.f209301j;
    }

    public T getAbsoluteMinValue() {
        return this.f209300i;
    }

    public int getRangeColor() {
        return getResources().getColor(t0c0.f167146D);
    }

    public T getSelectedMaxValue() {
        return (T) m223174h(this.f209306o);
    }

    public T getSelectedMinValue() {
        return (T) m223174h(this.f209305n);
    }

    public Bitmap getThumbImage() {
        return BitmapFactory.decodeResource(getResources(), this.f209315x);
    }

    public Bitmap getThumbPressedImage() {
        return BitmapFactory.decodeResource(getResources(), this.f209316y);
    }

    /* JADX INFO: renamed from: h */
    public final T m223174h(double d) {
        NumberType numberType = this.f209302k;
        double d2 = this.f209303l;
        return (T) numberType.toNumber(d2 + (d * (this.f209304m - d2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m223175i(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f209313v) {
            int i = action == 0 ? 1 : 0;
            this.f209312u = motionEvent.getX(i);
            this.f209313v = motionEvent.getPointerId(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m223176j() {
        this.f209317z = true;
    }

    /* JADX INFO: renamed from: k */
    public void m223177k() {
        this.f209317z = false;
    }

    /* JADX INFO: renamed from: l */
    public final double m223178l(float f) {
        float width = getWidth();
        float f2 = this.f209299h;
        return width <= f2 * 2.0f ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : Math.min(1.0d, Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (f - f2) / (width - (f2 * 2.0f))));
    }

    /* JADX INFO: renamed from: m */
    public final void m223179m(MotionEvent motionEvent) {
        float x = motionEvent.getX(motionEvent.findPointerIndex(this.f209313v));
        if (Thumb.MIN.equals(this.f209307p)) {
            setNormalizedMinValue(m223178l(x));
        } else if (Thumb.MAX.equals(this.f209307p)) {
            setNormalizedMaxValue(m223178l(x));
        }
    }

    /* JADX INFO: renamed from: n */
    public final double m223180n(T t) {
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == this.f209304m - this.f209303l) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        double dDoubleValue = t.doubleValue();
        double d = this.f209303l;
        return (dDoubleValue - d) / (this.f209304m - d);
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(this.f209299h, (getHeight() - this.f209298g) * 0.5f, getWidth() - this.f209299h, (getHeight() + this.f209298g) * 0.5f);
        this.f209292a.setStyle(Paint.Style.FILL);
        this.f209292a.setColor(this.f209311t);
        this.f209292a.setAntiAlias(true);
        canvas.drawRect(rectF, this.f209292a);
        rectF.left = m223173g(this.f209305n);
        rectF.right = m223173g(this.f209306o);
        this.f209292a.setColor(this.f209310s);
        canvas.drawRect(rectF, this.f209292a);
        m223169c(m223173g(this.f209305n), Thumb.MIN.equals(this.f209307p), canvas);
        m223169c(m223173g(this.f209306o), Thumb.MAX.equals(this.f209307p), canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        try {
            int size = View.MeasureSpec.getMode(i) != 0 ? View.MeasureSpec.getSize(i) : 200;
            int height = this.f209293b.getHeight();
            if (View.MeasureSpec.getMode(i2) != 0) {
                height = Math.min(height, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(size, height);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER"));
        this.f209305n = bundle.getDouble("MIN");
        this.f209306o = bundle.getDouble("MAX");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", this.f209305n);
        bundle.putDouble("MAX", this.f209306o);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC22563b<T> interfaceC22563b;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            this.f209313v = pointerId;
            float x = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
            this.f209312u = x;
            Thumb thumbM223170d = m223170d(x);
            this.f209307p = thumbM223170d;
            if (thumbM223170d == null) {
                return super.onTouchEvent(motionEvent);
            }
            setPressed(true);
            if (this.f209307p != Thumb.BOTH) {
                invalidate();
                m223176j();
                m223179m(motionEvent);
            }
            m223168b();
        } else if (action == 1) {
            if (this.f209317z) {
                m223179m(motionEvent);
                m223177k();
                setPressed(false);
            } else {
                m223176j();
                m223179m(motionEvent);
                m223177k();
            }
            this.f209307p = null;
            invalidate();
            InterfaceC22563b<T> interfaceC22563b2 = this.f209309r;
            if (interfaceC22563b2 != null) {
                interfaceC22563b2.mo194990a((VRangeSeekBar<?>) this, (T) getSelectedMinValue(), (T) getSelectedMaxValue(), false);
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.f209317z) {
                    m223177k();
                    setPressed(false);
                }
                invalidate();
            } else if (action == 5) {
                int pointerCount = motionEvent.getPointerCount() - 1;
                this.f209312u = motionEvent.getX(pointerCount);
                this.f209313v = motionEvent.getPointerId(pointerCount);
                invalidate();
            } else if (action == 6) {
                m223175i(motionEvent);
                invalidate();
            }
        } else if (this.f209307p != null) {
            if (this.f209317z) {
                m223179m(motionEvent);
            } else {
                float x2 = motionEvent.getX(motionEvent.findPointerIndex(this.f209313v));
                if (Math.abs(x2 - this.f209312u) > this.f209314w) {
                    if (x2 - this.f209312u > 0.0f) {
                        this.f209307p = Thumb.MAX;
                    } else {
                        this.f209307p = Thumb.MIN;
                    }
                    setPressed(true);
                    invalidate();
                    m223176j();
                    m223179m(motionEvent);
                    m223168b();
                }
            }
            if (this.f209308q && (interfaceC22563b = this.f209309r) != null && this.f209307p != Thumb.BOTH) {
                interfaceC22563b.mo194990a((VRangeSeekBar<?>) this, (T) getSelectedMinValue(), (T) getSelectedMaxValue(), true);
            }
        }
        return true;
    }

    public void setLineHeight(float f) {
        this.f209298g = t100.m186890d(f);
    }

    public void setMinSpace(T t) {
        this.f209290A = t;
        this.f209291B = true;
    }

    public void setNormalizedMaxValue(double d) {
        this.f209306o = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.max(d, this.f209305n)));
        if (this.f209291B && getSelectedMaxValue().intValue() - getSelectedMinValue().intValue() < this.f209290A.intValue()) {
            this.f209306o = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.max(m223180n(this.f209302k.toNumber(getSelectedMinValue().doubleValue() + this.f209290A.doubleValue())), this.f209305n)));
        }
        invalidate();
    }

    public void setNormalizedMinValue(double d) {
        this.f209305n = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.min(d, this.f209306o)));
        if (this.f209291B && getSelectedMaxValue().intValue() - getSelectedMinValue().intValue() < this.f209290A.intValue()) {
            this.f209305n = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.min(m223180n(this.f209302k.toNumber(getSelectedMaxValue().doubleValue() - this.f209290A.doubleValue())), this.f209306o)));
        }
        invalidate();
    }

    public void setNotifyWhileDragging(boolean z) {
        this.f209308q = z;
    }

    public void setOnRangeSeekBarChangeListener(InterfaceC22563b<T> interfaceC22563b) {
        this.f209309r = interfaceC22563b;
    }

    public void setSelectedMaxValue(T t) {
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == this.f209304m - this.f209303l) {
            setNormalizedMaxValue(1.0d);
        } else {
            setNormalizedMaxValue(m223180n(t));
        }
    }

    public void setSelectedMinValue(T t) {
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == this.f209304m - this.f209303l) {
            setNormalizedMinValue(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } else {
            setNormalizedMinValue(m223180n(t));
        }
    }

    public VRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209292a = new Paint(1);
        this.f209298g = t100.m186890d(3.0f);
        this.f209305n = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f209306o = 1.0d;
        this.f209307p = null;
        this.f209308q = false;
        this.f209311t = -3355444;
        this.f209313v = 255;
        this.f209291B = false;
        m223167a(attributeSet);
    }

    public VRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209292a = new Paint(1);
        this.f209298g = t100.m186890d(3.0f);
        this.f209305n = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f209306o = 1.0d;
        this.f209307p = null;
        this.f209308q = false;
        this.f209311t = -3355444;
        this.f209313v = 255;
        this.f209291B = false;
        m223167a(attributeSet);
    }
}
