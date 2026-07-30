package p028v;

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
import java.lang.Number;
import java.math.BigDecimal;
import l.all;
import l.b9c0;
import l.t0c0;
import l.t100;
import l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VRangeSeekBar<T extends Number> extends ImageView {

    /* JADX INFO: renamed from: A */
    public T f12915A;

    /* JADX INFO: renamed from: B */
    public boolean f12916B;

    /* JADX INFO: renamed from: a */
    public final Paint f12917a;

    /* JADX INFO: renamed from: b */
    public Bitmap f12918b;

    /* JADX INFO: renamed from: c */
    public Bitmap f12919c;

    /* JADX INFO: renamed from: d */
    public float f12920d;

    /* JADX INFO: renamed from: e */
    public float f12921e;

    /* JADX INFO: renamed from: f */
    public float f12922f;

    /* JADX INFO: renamed from: g */
    public float f12923g;

    /* JADX INFO: renamed from: h */
    public float f12924h;

    /* JADX INFO: renamed from: i */
    public T f12925i;

    /* JADX INFO: renamed from: j */
    public T f12926j;

    /* JADX INFO: renamed from: k */
    public NumberType f12927k;

    /* JADX INFO: renamed from: l */
    public double f12928l;

    /* JADX INFO: renamed from: m */
    public double f12929m;

    /* JADX INFO: renamed from: n */
    public double f12930n;

    /* JADX INFO: renamed from: o */
    public double f12931o;

    /* JADX INFO: renamed from: p */
    public Thumb f12932p;

    /* JADX INFO: renamed from: q */
    public boolean f12933q;

    /* JADX INFO: renamed from: r */
    public InterfaceC1356b<T> f12934r;

    /* JADX INFO: renamed from: s */
    public int f12935s;

    /* JADX INFO: renamed from: t */
    public int f12936t;

    /* JADX INFO: renamed from: u */
    public float f12937u;

    /* JADX INFO: renamed from: v */
    public int f12938v;

    /* JADX INFO: renamed from: w */
    public int f12939w;

    /* JADX INFO: renamed from: x */
    public int f12940x;

    /* JADX INFO: renamed from: y */
    public int f12941y;

    /* JADX INFO: renamed from: z */
    public boolean f12942z;

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
            all.a("Number class '", e.getClass().getName(), "' is not supported");
            return null;
        }

        public Number toNumber(double d) {
            switch (C1355a.f12943a[ordinal()]) {
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
    public static /* synthetic */ class C1355a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12943a;

        static {
            int[] iArr = new int[NumberType.values().length];
            f12943a = iArr;
            try {
                iArr[NumberType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12943a[NumberType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12943a[NumberType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12943a[NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12943a[NumberType.SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12943a[NumberType.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12943a[NumberType.BIG_DECIMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: v.VRangeSeekBar$b */
    public interface InterfaceC1356b<T> {
        /* JADX INFO: renamed from: a */
        void m11663a(VRangeSeekBar<?> vRangeSeekBar, T t, T t2, boolean z);
    }

    public VRangeSeekBar(Context context) throws IllegalArgumentException {
        super(context);
        this.f12917a = new Paint(1);
        this.f12923g = t100.d(3.0f);
        this.f12930n = 0.0d;
        this.f12931o = 1.0d;
        this.f12932p = null;
        this.f12933q = false;
        this.f12936t = -3355444;
        this.f12938v = 255;
        this.f12916B = false;
        m11649a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m11649a(AttributeSet attributeSet) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f12939w = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.A4);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.C4)) {
                this.f12940x = typedArrayObtainStyledAttributes.getResourceId(b9c0.C4, u2c0.n6);
            } else {
                this.f12940x = u2c0.n6;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.D4)) {
                this.f12941y = typedArrayObtainStyledAttributes.getResourceId(b9c0.D4, u2c0.o6);
            } else {
                this.f12941y = u2c0.o6;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.B4)) {
                this.f12935s = typedArrayObtainStyledAttributes.getColor(b9c0.B4, getResources().getColor(t0c0.D));
            } else {
                this.f12935s = getRangeColor();
            }
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f12940x = u2c0.n6;
            this.f12941y = u2c0.o6;
            this.f12935s = getRangeColor();
        }
        this.f12918b = getThumbImage();
        this.f12919c = getThumbPressedImage();
        float width = this.f12918b.getWidth();
        this.f12920d = width;
        this.f12921e = width * 0.5f;
        this.f12922f = this.f12918b.getHeight() * 0.5f;
        this.f12924h = this.f12921e;
    }

    /* JADX INFO: renamed from: b */
    public final void m11650b() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11651c(float f, boolean z, Canvas canvas) {
        canvas.drawBitmap(z ? this.f12919c : this.f12918b, f - this.f12921e, (getHeight() * 0.5f) - this.f12922f, this.f12917a);
    }

    /* JADX INFO: renamed from: d */
    public final Thumb m11652d(float f) {
        boolean zM11654f = m11654f(f, this.f12930n);
        boolean zM11654f2 = m11654f(f, this.f12931o);
        if (zM11654f && zM11654f2) {
            return Thumb.BOTH;
        }
        if (zM11654f) {
            return Thumb.MIN;
        }
        if (zM11654f2) {
            return Thumb.MAX;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m11653e(T t, T t2) {
        this.f12926j = t2;
        this.f12925i = t;
        this.f12928l = t.doubleValue();
        this.f12929m = t2.doubleValue();
        this.f12927k = NumberType.fromNumber(this.f12925i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11654f(float f, double d) {
        return Math.abs(f - m11655g(d)) <= this.f12921e;
    }

    /* JADX INFO: renamed from: g */
    public final float m11655g(double d) {
        return (float) (((double) this.f12924h) + (d * ((double) (getWidth() - (this.f12924h * 2.0f)))));
    }

    public T getAbsoluteMaxValue() {
        return this.f12926j;
    }

    public T getAbsoluteMinValue() {
        return this.f12925i;
    }

    public int getRangeColor() {
        return getResources().getColor(t0c0.D);
    }

    public T getSelectedMaxValue() {
        return (T) m11656h(this.f12931o);
    }

    public T getSelectedMinValue() {
        return (T) m11656h(this.f12930n);
    }

    public Bitmap getThumbImage() {
        return BitmapFactory.decodeResource(getResources(), this.f12940x);
    }

    public Bitmap getThumbPressedImage() {
        return BitmapFactory.decodeResource(getResources(), this.f12941y);
    }

    /* JADX INFO: renamed from: h */
    public final T m11656h(double d) {
        NumberType numberType = this.f12927k;
        double d2 = this.f12928l;
        return (T) numberType.toNumber(d2 + (d * (this.f12929m - d2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m11657i(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f12938v) {
            int i = action == 0 ? 1 : 0;
            this.f12937u = motionEvent.getX(i);
            this.f12938v = motionEvent.getPointerId(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m11658j() {
        this.f12942z = true;
    }

    /* JADX INFO: renamed from: k */
    public void m11659k() {
        this.f12942z = false;
    }

    /* JADX INFO: renamed from: l */
    public final double m11660l(float f) {
        float width = getWidth();
        float f2 = this.f12924h;
        if (width <= f2 * 2.0f) {
            return 0.0d;
        }
        return Math.min(1.0d, Math.max(0.0d, (f - f2) / (width - (f2 * 2.0f))));
    }

    /* JADX INFO: renamed from: m */
    public final void m11661m(MotionEvent motionEvent) {
        float x = motionEvent.getX(motionEvent.findPointerIndex(this.f12938v));
        if (Thumb.MIN.equals(this.f12932p)) {
            setNormalizedMinValue(m11660l(x));
        } else if (Thumb.MAX.equals(this.f12932p)) {
            setNormalizedMaxValue(m11660l(x));
        }
    }

    /* JADX INFO: renamed from: n */
    public final double m11662n(T t) {
        if (0.0d == this.f12929m - this.f12928l) {
            return 0.0d;
        }
        double dDoubleValue = t.doubleValue();
        double d = this.f12928l;
        return (dDoubleValue - d) / (this.f12929m - d);
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(this.f12924h, (getHeight() - this.f12923g) * 0.5f, getWidth() - this.f12924h, (getHeight() + this.f12923g) * 0.5f);
        this.f12917a.setStyle(Paint.Style.FILL);
        this.f12917a.setColor(this.f12936t);
        this.f12917a.setAntiAlias(true);
        canvas.drawRect(rectF, this.f12917a);
        rectF.left = m11655g(this.f12930n);
        rectF.right = m11655g(this.f12931o);
        this.f12917a.setColor(this.f12935s);
        canvas.drawRect(rectF, this.f12917a);
        m11651c(m11655g(this.f12930n), Thumb.MIN.equals(this.f12932p), canvas);
        m11651c(m11655g(this.f12931o), Thumb.MAX.equals(this.f12932p), canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        try {
            int size = View.MeasureSpec.getMode(i) != 0 ? View.MeasureSpec.getSize(i) : 200;
            int height = this.f12918b.getHeight();
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
        this.f12930n = bundle.getDouble("MIN");
        this.f12931o = bundle.getDouble("MAX");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", this.f12930n);
        bundle.putDouble("MAX", this.f12931o);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1356b<T> interfaceC1356b;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            this.f12938v = pointerId;
            float x = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
            this.f12937u = x;
            Thumb thumbM11652d = m11652d(x);
            this.f12932p = thumbM11652d;
            if (thumbM11652d == null) {
                return super.onTouchEvent(motionEvent);
            }
            setPressed(true);
            if (this.f12932p != Thumb.BOTH) {
                invalidate();
                m11658j();
                m11661m(motionEvent);
            }
            m11650b();
        } else if (action == 1) {
            if (this.f12942z) {
                m11661m(motionEvent);
                m11659k();
                setPressed(false);
            } else {
                m11658j();
                m11661m(motionEvent);
                m11659k();
            }
            this.f12932p = null;
            invalidate();
            InterfaceC1356b<T> interfaceC1356b2 = this.f12934r;
            if (interfaceC1356b2 != null) {
                interfaceC1356b2.m11663a((VRangeSeekBar<?>) this, (T) getSelectedMinValue(), (T) getSelectedMaxValue(), false);
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.f12942z) {
                    m11659k();
                    setPressed(false);
                }
                invalidate();
            } else if (action == 5) {
                int pointerCount = motionEvent.getPointerCount() - 1;
                this.f12937u = motionEvent.getX(pointerCount);
                this.f12938v = motionEvent.getPointerId(pointerCount);
                invalidate();
            } else if (action == 6) {
                m11657i(motionEvent);
                invalidate();
            }
        } else if (this.f12932p != null) {
            if (this.f12942z) {
                m11661m(motionEvent);
            } else {
                float x2 = motionEvent.getX(motionEvent.findPointerIndex(this.f12938v));
                if (Math.abs(x2 - this.f12937u) > this.f12939w) {
                    if (x2 - this.f12937u > 0.0f) {
                        this.f12932p = Thumb.MAX;
                    } else {
                        this.f12932p = Thumb.MIN;
                    }
                    setPressed(true);
                    invalidate();
                    m11658j();
                    m11661m(motionEvent);
                    m11650b();
                }
            }
            if (this.f12933q && (interfaceC1356b = this.f12934r) != null && this.f12932p != Thumb.BOTH) {
                interfaceC1356b.m11663a((VRangeSeekBar<?>) this, (T) getSelectedMinValue(), (T) getSelectedMaxValue(), true);
            }
        }
        return true;
    }

    public void setLineHeight(float f) {
        this.f12923g = t100.d(f);
    }

    public void setMinSpace(T t) {
        this.f12915A = t;
        this.f12916B = true;
    }

    public void setNormalizedMaxValue(double d) {
        this.f12931o = Math.max(0.0d, Math.min(1.0d, Math.max(d, this.f12930n)));
        if (this.f12916B && getSelectedMaxValue().intValue() - getSelectedMinValue().intValue() < this.f12915A.intValue()) {
            this.f12931o = Math.max(0.0d, Math.min(1.0d, Math.max(m11662n(this.f12927k.toNumber(getSelectedMinValue().doubleValue() + this.f12915A.doubleValue())), this.f12930n)));
        }
        invalidate();
    }

    public void setNormalizedMinValue(double d) {
        this.f12930n = Math.max(0.0d, Math.min(1.0d, Math.min(d, this.f12931o)));
        if (this.f12916B && getSelectedMaxValue().intValue() - getSelectedMinValue().intValue() < this.f12915A.intValue()) {
            this.f12930n = Math.max(0.0d, Math.min(1.0d, Math.min(m11662n(this.f12927k.toNumber(getSelectedMaxValue().doubleValue() - this.f12915A.doubleValue())), this.f12931o)));
        }
        invalidate();
    }

    public void setNotifyWhileDragging(boolean z) {
        this.f12933q = z;
    }

    public void setOnRangeSeekBarChangeListener(InterfaceC1356b<T> interfaceC1356b) {
        this.f12934r = interfaceC1356b;
    }

    public void setSelectedMaxValue(T t) {
        if (0.0d == this.f12929m - this.f12928l) {
            setNormalizedMaxValue(1.0d);
        } else {
            setNormalizedMaxValue(m11662n(t));
        }
    }

    public void setSelectedMinValue(T t) {
        if (0.0d == this.f12929m - this.f12928l) {
            setNormalizedMinValue(0.0d);
        } else {
            setNormalizedMinValue(m11662n(t));
        }
    }

    public VRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12917a = new Paint(1);
        this.f12923g = t100.d(3.0f);
        this.f12930n = 0.0d;
        this.f12931o = 1.0d;
        this.f12932p = null;
        this.f12933q = false;
        this.f12936t = -3355444;
        this.f12938v = 255;
        this.f12916B = false;
        m11649a(attributeSet);
    }

    public VRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12917a = new Paint(1);
        this.f12923g = t100.d(3.0f);
        this.f12930n = 0.0d;
        this.f12931o = 1.0d;
        this.f12932p = null;
        this.f12933q = false;
        this.f12936t = -3355444;
        this.f12938v = 255;
        this.f12916B = false;
        m11649a(attributeSet);
    }
}
