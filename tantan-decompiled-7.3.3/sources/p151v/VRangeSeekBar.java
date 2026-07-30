package p151v;

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
import p153l.abc0;
import p153l.hhc0;
import p153l.pnl;
import p153l.qa00;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VRangeSeekBar<T extends Number> extends ImageView {

    /* JADX INFO: renamed from: A */
    public T f210212A;

    /* JADX INFO: renamed from: B */
    public boolean f210213B;

    /* JADX INFO: renamed from: a */
    public final Paint f210214a;

    /* JADX INFO: renamed from: b */
    public Bitmap f210215b;

    /* JADX INFO: renamed from: c */
    public Bitmap f210216c;

    /* JADX INFO: renamed from: d */
    public float f210217d;

    /* JADX INFO: renamed from: e */
    public float f210218e;

    /* JADX INFO: renamed from: f */
    public float f210219f;

    /* JADX INFO: renamed from: g */
    public float f210220g;

    /* JADX INFO: renamed from: h */
    public float f210221h;

    /* JADX INFO: renamed from: i */
    public T f210222i;

    /* JADX INFO: renamed from: j */
    public T f210223j;

    /* JADX INFO: renamed from: k */
    public NumberType f210224k;

    /* JADX INFO: renamed from: l */
    public double f210225l;

    /* JADX INFO: renamed from: m */
    public double f210226m;

    /* JADX INFO: renamed from: n */
    public double f210227n;

    /* JADX INFO: renamed from: o */
    public double f210228o;

    /* JADX INFO: renamed from: p */
    public Thumb f210229p;

    /* JADX INFO: renamed from: q */
    public boolean f210230q;

    /* JADX INFO: renamed from: r */
    public InterfaceC22678b<T> f210231r;

    /* JADX INFO: renamed from: s */
    public int f210232s;

    /* JADX INFO: renamed from: t */
    public int f210233t;

    /* JADX INFO: renamed from: u */
    public float f210234u;

    /* JADX INFO: renamed from: v */
    public int f210235v;

    /* JADX INFO: renamed from: w */
    public int f210236w;

    /* JADX INFO: renamed from: x */
    public int f210237x;

    /* JADX INFO: renamed from: y */
    public int f210238y;

    /* JADX INFO: renamed from: z */
    public boolean f210239z;

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
            pnl.m173070a("Number class '", e.getClass().getName(), "' is not supported");
            return null;
        }

        public Number toNumber(double d) {
            switch (C22677a.f210240a[ordinal()]) {
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
    public static /* synthetic */ class C22677a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f210240a;

        static {
            int[] iArr = new int[NumberType.values().length];
            f210240a = iArr;
            try {
                iArr[NumberType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f210240a[NumberType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f210240a[NumberType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f210240a[NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f210240a[NumberType.SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f210240a[NumberType.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f210240a[NumberType.BIG_DECIMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: v.VRangeSeekBar$b */
    public interface InterfaceC22678b<T> {
        /* JADX INFO: renamed from: a */
        void mo107161a(VRangeSeekBar<?> vRangeSeekBar, T t, T t2, boolean z);
    }

    public VRangeSeekBar(Context context) throws IllegalArgumentException {
        super(context);
        this.f210214a = new Paint(1);
        this.f210220g = qa00.m175859d(3.0f);
        this.f210227n = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f210228o = 1.0d;
        this.f210229p = null;
        this.f210230q = false;
        this.f210233t = -3355444;
        this.f210235v = 255;
        this.f210213B = false;
        m224413a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m224413a(AttributeSet attributeSet) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f210236w = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hhc0.f109533A4);
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109547C4)) {
                this.f210237x = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109547C4, abc0.f69513n6);
            } else {
                this.f210237x = abc0.f69513n6;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109554D4)) {
                this.f210238y = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109554D4, abc0.f69521o6);
            } else {
                this.f210238y = abc0.f69521o6;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109540B4)) {
                this.f210232s = typedArrayObtainStyledAttributes.getColor(hhc0.f109540B4, getResources().getColor(z8c0.f203337D));
            } else {
                this.f210232s = getRangeColor();
            }
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f210237x = abc0.f69513n6;
            this.f210238y = abc0.f69521o6;
            this.f210232s = getRangeColor();
        }
        this.f210215b = getThumbImage();
        this.f210216c = getThumbPressedImage();
        float width = this.f210215b.getWidth();
        this.f210217d = width;
        this.f210218e = width * 0.5f;
        this.f210219f = this.f210215b.getHeight() * 0.5f;
        this.f210221h = this.f210218e;
    }

    /* JADX INFO: renamed from: b */
    public final void m224414b() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m224415c(float f, boolean z, Canvas canvas) {
        canvas.drawBitmap(z ? this.f210216c : this.f210215b, f - this.f210218e, (getHeight() * 0.5f) - this.f210219f, this.f210214a);
    }

    /* JADX INFO: renamed from: d */
    public final Thumb m224416d(float f) {
        boolean zM224418f = m224418f(f, this.f210227n);
        boolean zM224418f2 = m224418f(f, this.f210228o);
        if (zM224418f && zM224418f2) {
            return Thumb.BOTH;
        }
        if (zM224418f) {
            return Thumb.MIN;
        }
        if (zM224418f2) {
            return Thumb.MAX;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m224417e(T t, T t2) {
        this.f210223j = t2;
        this.f210222i = t;
        this.f210225l = t.doubleValue();
        this.f210226m = t2.doubleValue();
        this.f210224k = NumberType.fromNumber(this.f210222i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m224418f(float f, double d) {
        return Math.abs(f - m224419g(d)) <= this.f210218e;
    }

    /* JADX INFO: renamed from: g */
    public final float m224419g(double d) {
        return (float) (((double) this.f210221h) + (d * ((double) (getWidth() - (this.f210221h * 2.0f)))));
    }

    public T getAbsoluteMaxValue() {
        return this.f210223j;
    }

    public T getAbsoluteMinValue() {
        return this.f210222i;
    }

    public int getRangeColor() {
        return getResources().getColor(z8c0.f203337D);
    }

    public T getSelectedMaxValue() {
        return (T) m224420h(this.f210228o);
    }

    public T getSelectedMinValue() {
        return (T) m224420h(this.f210227n);
    }

    public Bitmap getThumbImage() {
        return BitmapFactory.decodeResource(getResources(), this.f210237x);
    }

    public Bitmap getThumbPressedImage() {
        return BitmapFactory.decodeResource(getResources(), this.f210238y);
    }

    /* JADX INFO: renamed from: h */
    public final T m224420h(double d) {
        NumberType numberType = this.f210224k;
        double d2 = this.f210225l;
        return (T) numberType.toNumber(d2 + (d * (this.f210226m - d2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m224421i(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f210235v) {
            int i = action == 0 ? 1 : 0;
            this.f210234u = motionEvent.getX(i);
            this.f210235v = motionEvent.getPointerId(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m224422j() {
        this.f210239z = true;
    }

    /* JADX INFO: renamed from: k */
    public void m224423k() {
        this.f210239z = false;
    }

    /* JADX INFO: renamed from: l */
    public final double m224424l(float f) {
        float width = getWidth();
        float f2 = this.f210221h;
        return width <= f2 * 2.0f ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : Math.min(1.0d, Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (f - f2) / (width - (f2 * 2.0f))));
    }

    /* JADX INFO: renamed from: m */
    public final void m224425m(MotionEvent motionEvent) {
        float x = motionEvent.getX(motionEvent.findPointerIndex(this.f210235v));
        if (Thumb.MIN.equals(this.f210229p)) {
            setNormalizedMinValue(m224424l(x));
        } else if (Thumb.MAX.equals(this.f210229p)) {
            setNormalizedMaxValue(m224424l(x));
        }
    }

    /* JADX INFO: renamed from: n */
    public final double m224426n(T t) {
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == this.f210226m - this.f210225l) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        double dDoubleValue = t.doubleValue();
        double d = this.f210225l;
        return (dDoubleValue - d) / (this.f210226m - d);
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(this.f210221h, (getHeight() - this.f210220g) * 0.5f, getWidth() - this.f210221h, (getHeight() + this.f210220g) * 0.5f);
        this.f210214a.setStyle(Paint.Style.FILL);
        this.f210214a.setColor(this.f210233t);
        this.f210214a.setAntiAlias(true);
        canvas.drawRect(rectF, this.f210214a);
        rectF.left = m224419g(this.f210227n);
        rectF.right = m224419g(this.f210228o);
        this.f210214a.setColor(this.f210232s);
        canvas.drawRect(rectF, this.f210214a);
        m224415c(m224419g(this.f210227n), Thumb.MIN.equals(this.f210229p), canvas);
        m224415c(m224419g(this.f210228o), Thumb.MAX.equals(this.f210229p), canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        try {
            int size = View.MeasureSpec.getMode(i) != 0 ? View.MeasureSpec.getSize(i) : 200;
            int height = this.f210215b.getHeight();
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
        this.f210227n = bundle.getDouble("MIN");
        this.f210228o = bundle.getDouble("MAX");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", this.f210227n);
        bundle.putDouble("MAX", this.f210228o);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC22678b<T> interfaceC22678b;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            this.f210235v = pointerId;
            float x = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
            this.f210234u = x;
            Thumb thumbM224416d = m224416d(x);
            this.f210229p = thumbM224416d;
            if (thumbM224416d == null) {
                return super.onTouchEvent(motionEvent);
            }
            setPressed(true);
            if (this.f210229p != Thumb.BOTH) {
                invalidate();
                m224422j();
                m224425m(motionEvent);
            }
            m224414b();
        } else if (action == 1) {
            if (this.f210239z) {
                m224425m(motionEvent);
                m224423k();
                setPressed(false);
            } else {
                m224422j();
                m224425m(motionEvent);
                m224423k();
            }
            this.f210229p = null;
            invalidate();
            InterfaceC22678b<T> interfaceC22678b2 = this.f210231r;
            if (interfaceC22678b2 != null) {
                interfaceC22678b2.mo107161a((VRangeSeekBar<?>) this, (T) getSelectedMinValue(), (T) getSelectedMaxValue(), false);
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.f210239z) {
                    m224423k();
                    setPressed(false);
                }
                invalidate();
            } else if (action == 5) {
                int pointerCount = motionEvent.getPointerCount() - 1;
                this.f210234u = motionEvent.getX(pointerCount);
                this.f210235v = motionEvent.getPointerId(pointerCount);
                invalidate();
            } else if (action == 6) {
                m224421i(motionEvent);
                invalidate();
            }
        } else if (this.f210229p != null) {
            if (this.f210239z) {
                m224425m(motionEvent);
            } else {
                float x2 = motionEvent.getX(motionEvent.findPointerIndex(this.f210235v));
                if (Math.abs(x2 - this.f210234u) > this.f210236w) {
                    if (x2 - this.f210234u > 0.0f) {
                        this.f210229p = Thumb.MAX;
                    } else {
                        this.f210229p = Thumb.MIN;
                    }
                    setPressed(true);
                    invalidate();
                    m224422j();
                    m224425m(motionEvent);
                    m224414b();
                }
            }
            if (this.f210230q && (interfaceC22678b = this.f210231r) != null && this.f210229p != Thumb.BOTH) {
                interfaceC22678b.mo107161a((VRangeSeekBar<?>) this, (T) getSelectedMinValue(), (T) getSelectedMaxValue(), true);
            }
        }
        return true;
    }

    public void setLineHeight(float f) {
        this.f210220g = qa00.m175859d(f);
    }

    public void setMinSpace(T t) {
        this.f210212A = t;
        this.f210213B = true;
    }

    public void setNormalizedMaxValue(double d) {
        this.f210228o = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.max(d, this.f210227n)));
        if (this.f210213B && getSelectedMaxValue().intValue() - getSelectedMinValue().intValue() < this.f210212A.intValue()) {
            this.f210228o = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.max(m224426n(this.f210224k.toNumber(getSelectedMinValue().doubleValue() + this.f210212A.doubleValue())), this.f210227n)));
        }
        invalidate();
    }

    public void setNormalizedMinValue(double d) {
        this.f210227n = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.min(d, this.f210228o)));
        if (this.f210213B && getSelectedMaxValue().intValue() - getSelectedMinValue().intValue() < this.f210212A.intValue()) {
            this.f210227n = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, Math.min(m224426n(this.f210224k.toNumber(getSelectedMaxValue().doubleValue() - this.f210212A.doubleValue())), this.f210228o)));
        }
        invalidate();
    }

    public void setNotifyWhileDragging(boolean z) {
        this.f210230q = z;
    }

    public void setOnRangeSeekBarChangeListener(InterfaceC22678b<T> interfaceC22678b) {
        this.f210231r = interfaceC22678b;
    }

    public void setSelectedMaxValue(T t) {
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == this.f210226m - this.f210225l) {
            setNormalizedMaxValue(1.0d);
        } else {
            setNormalizedMaxValue(m224426n(t));
        }
    }

    public void setSelectedMinValue(T t) {
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == this.f210226m - this.f210225l) {
            setNormalizedMinValue(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        } else {
            setNormalizedMinValue(m224426n(t));
        }
    }

    public VRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210214a = new Paint(1);
        this.f210220g = qa00.m175859d(3.0f);
        this.f210227n = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f210228o = 1.0d;
        this.f210229p = null;
        this.f210230q = false;
        this.f210233t = -3355444;
        this.f210235v = 255;
        this.f210213B = false;
        m224413a(attributeSet);
    }

    public VRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210214a = new Paint(1);
        this.f210220g = qa00.m175859d(3.0f);
        this.f210227n = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f210228o = 1.0d;
        this.f210229p = null;
        this.f210230q = false;
        this.f210233t = -3355444;
        this.f210235v = 255;
        this.f210213B = false;
        m224413a(attributeSet);
    }
}
