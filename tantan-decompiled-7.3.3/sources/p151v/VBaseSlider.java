package p151v;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.OvershootInterpolator;
import android.widget.SeekBar;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p151v.VBaseSlider;
import p153l.C15967bc;
import p153l.abc0;
import p153l.bac0;
import p153l.cml0;
import p153l.cp50;
import p153l.di40;
import p153l.dok0;
import p153l.dpf;
import p153l.eok0;
import p153l.fsf0;
import p153l.gzi0;
import p153l.hhc0;
import p153l.inl0;
import p153l.jhx;
import p153l.kkl0;
import p153l.ozk0;
import p153l.qa00;
import p153l.rvd;
import p153l.wg3;
import p153l.yjg;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
abstract class VBaseSlider<S extends VBaseSlider<S, L, T>, L extends cp50<S>, T extends dok0<S>> extends View {

    /* JADX INFO: renamed from: R */
    public static final TimeInterpolator f209914R = new yjg();

    /* JADX INFO: renamed from: S */
    public static final TimeInterpolator f209915S = new OvershootInterpolator(5.0f);

    /* JADX INFO: renamed from: A */
    public int f209916A;

    /* JADX INFO: renamed from: B */
    public int f209917B;

    /* JADX INFO: renamed from: C */
    public int f209918C;

    /* JADX INFO: renamed from: D */
    public int f209919D;

    /* JADX INFO: renamed from: E */
    public boolean f209920E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public Bitmap f209921F;

    /* JADX INFO: renamed from: G */
    public final Matrix f209922G;

    /* JADX INFO: renamed from: H */
    public float f209923H;

    /* JADX INFO: renamed from: I */
    public ValueAnimator f209924I;

    /* JADX INFO: renamed from: J */
    public final int f209925J;

    /* JADX INFO: renamed from: K */
    public float f209926K;

    /* JADX INFO: renamed from: L */
    public int f209927L;

    /* JADX INFO: renamed from: M */
    public ozk0 f209928M;

    /* JADX INFO: renamed from: N */
    public boolean f209929N;

    /* JADX INFO: renamed from: O */
    public float f209930O;

    /* JADX INFO: renamed from: P */
    public MotionEvent f209931P;

    /* JADX INFO: renamed from: Q */
    public boolean f209932Q;

    /* JADX INFO: renamed from: a */
    public final int f209933a;

    /* JADX INFO: renamed from: b */
    public final int f209934b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Paint f209935c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Paint f209936d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Paint f209937e;

    /* JADX INFO: renamed from: f */
    public int f209938f;

    /* JADX INFO: renamed from: g */
    public int f209939g;

    /* JADX INFO: renamed from: h */
    public int f209940h;

    /* JADX INFO: renamed from: i */
    public int f209941i;

    /* JADX INFO: renamed from: j */
    public int f209942j;

    /* JADX INFO: renamed from: k */
    public int f209943k;

    /* JADX INFO: renamed from: l */
    public int f209944l;

    /* JADX INFO: renamed from: m */
    public float f209945m;

    /* JADX INFO: renamed from: n */
    public float f209946n;

    /* JADX INFO: renamed from: o */
    public ArrayList<Float> f209947o;

    /* JADX INFO: renamed from: p */
    public int f209948p;

    /* JADX INFO: renamed from: q */
    public int f209949q;

    /* JADX INFO: renamed from: r */
    public float f209950r;

    /* JADX INFO: renamed from: s */
    public boolean f209951s;

    /* JADX INFO: renamed from: t */
    public boolean f209952t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final C22650b f209953u;

    /* JADX INFO: renamed from: v */
    public final AccessibilityManager f209954v;

    /* JADX INFO: renamed from: w */
    public VBaseSlider<S, L, T>.RunnableC22649a f209955w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final List<fsf0> f209956x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final List<L> f209957y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final List<T> f209958z;

    /* JADX INFO: renamed from: v.VBaseSlider$a */
    public class RunnableC22649a implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f209959a;

        public RunnableC22649a() {
            this.f209959a = -1;
        }

        /* JADX INFO: renamed from: a */
        public void m224235a(int i) {
            this.f209959a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VBaseSlider.this.f209953u.sendEventForVirtualView(this.f209959a, 4);
        }
    }

    /* JADX INFO: renamed from: v.VBaseSlider$b */
    public static class C22650b extends dpf {

        /* JADX INFO: renamed from: a */
        public final VBaseSlider<?, ?, ?> f209961a;

        /* JADX INFO: renamed from: b */
        public Rect f209962b;

        public C22650b(VBaseSlider<?, ?, ?> vBaseSlider) {
            super(vBaseSlider);
            this.f209962b = new Rect();
            this.f209961a = vBaseSlider;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final String m224236a(int i) {
            if (i == this.f209961a.getValues().size() - 1) {
                return "Range end,";
            }
            return i == 0 ? "Range start," : "";
        }

        @Override // p153l.dpf
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f209961a.getValues().size(); i++) {
                this.f209961a.m224203X(i, this.f209962b);
                if (this.f209962b.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // p153l.dpf
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.f209961a.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p153l.dpf
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f209961a.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f209961a.m224201V(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f209961a.postInvalidate();
                        invalidateVirtualView(i);
                        return true;
                    }
                }
                return false;
            }
            float fM224219k = this.f209961a.m224219k(20);
            if (i2 == 8192) {
                fM224219k = -fM224219k;
            }
            if (this.f209961a.m224184E()) {
                fM224219k = -fM224219k;
            }
            if (!this.f209961a.m224201V(i, jhx.m144941a(this.f209961a.getValues().get(i).floatValue() + fM224219k, this.f209961a.getValueFrom(), this.f209961a.getValueTo()))) {
                return false;
            }
            this.f209961a.postInvalidate();
            invalidateVirtualView(i);
            return true;
        }

        @Override // p153l.dpf
        public void onPopulateNodeForVirtualView(int i, C15967bc c15967bc) {
            c15967bc.m103407b(C15967bc.a.f76045L);
            List<Float> values = this.f209961a.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = this.f209961a.getValueFrom();
            float valueTo = this.f209961a.getValueTo();
            if (this.f209961a.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    c15967bc.m103406a(8192);
                }
                if (fFloatValue < valueTo) {
                    c15967bc.m103406a(4096);
                }
            }
            c15967bc.m103376H0(C15967bc.g.m103468a(1, valueFrom, valueTo, fFloatValue));
            c15967bc.m103431o0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f209961a.getContentDescription() != null) {
                sb.append(this.f209961a.getContentDescription());
                sb.append(Constants.SEPARATOR_COMMA);
            }
            if (values.size() > 1) {
                sb.append(m224236a(i));
                sb.append(this.f209961a.m224233y(fFloatValue));
            }
            c15967bc.m103438s0(sb.toString());
            this.f209961a.m224203X(i, this.f209962b);
            c15967bc.m103421j0(this.f209962b);
        }
    }

    public VBaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209933a = getResources().getColor(z8c0.f203357r);
        this.f209934b = getResources().getColor(z8c0.f203359t);
        this.f209947o = new ArrayList<>();
        this.f209948p = -1;
        this.f209949q = -1;
        this.f209950r = 0.0f;
        this.f209952t = false;
        this.f209956x = new ArrayList();
        this.f209957y = new ArrayList();
        this.f209958z = new ArrayList();
        this.f209920E = false;
        this.f209922G = new Matrix();
        this.f209923H = 1.0f;
        this.f209927L = 0;
        this.f209929N = false;
        this.f209932Q = false;
        Paint paint = new Paint();
        this.f209935c = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f209936d = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f209937e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        m224186G(context.getResources());
        setFocusable(true);
        setClickable(true);
        this.f209921F = BitmapFactory.decodeResource(getResources(), abc0.f69595z);
        m224195P(context, attributeSet);
        this.f209925J = ViewConfiguration.get(context).getScaledTouchSlop();
        C22650b c22650b = new C22650b(this);
        this.f209953u = c22650b;
        kkl0.m150164j0(this, c22650b);
        this.f209954v = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f209947o.size() == 1) {
            fFloatValue2 = this.f209945m;
        }
        float fM224190K = m224190K(fFloatValue2);
        float fM224190K2 = m224190K(fFloatValue);
        return m224184E() ? new float[]{fM224190K2, fM224190K} : new float[]{fM224190K, fM224190K2};
    }

    private float getValueOfTouchPosition() {
        double dM224200U = m224200U(this.f209926K);
        if (m224184E()) {
            dM224200U = 1.0d - dM224200U;
        }
        float f = this.f209946n;
        float f2 = this.f209945m;
        return (float) ((dM224200U * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f209926K;
        if (m224184E()) {
            f = 1.0f - f;
        }
        float f2 = this.f209946n;
        float f3 = this.f209945m;
        return (f * (f2 - f3)) + f3;
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            wg3.m206174a("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.f209947o.size() == arrayList.size() && this.f209947o.equals(arrayList)) {
            return;
        }
        this.f209947o = arrayList;
        this.f209951s = true;
        this.f209949q = 0;
        m224221m();
        m224226r();
        postInvalidate();
    }

    /* JADX INFO: renamed from: A */
    public boolean mo224180A() {
        return this.f209928M != null;
    }

    /* JADX INFO: renamed from: B */
    public final void m224181B() {
        this.f209935c.setStrokeWidth(this.f209939g);
        this.f209936d.setStrokeWidth(this.f209939g);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m224182C() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m224183D(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f209950r)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m224184E() {
        return kkl0.m150191x(this) == 1;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m224185F(ValueAnimator valueAnimator) {
        this.f209923H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
        Iterator<fsf0> it = this.f209956x.iterator();
        for (int i = 0; i < this.f209947o.size() && it.hasNext(); i++) {
            if (i != this.f209949q) {
                it.next().m127176i(1.0f);
            }
        }
        it.next().m127176i(this.f209923H);
    }

    /* JADX INFO: renamed from: G */
    public final void m224186G(@NonNull Resources resources) {
        this.f209938f = resources.getDimensionPixelSize(bac0.f75666e);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(bac0.f75664c);
        this.f209941i = dimensionPixelOffset;
        this.f209940h = dimensionPixelOffset;
        this.f209942j = resources.getDimensionPixelSize(bac0.f75663b);
        this.f209943k = resources.getDimensionPixelOffset(bac0.f75665d);
        this.f209944l = resources.getDimensionPixelSize(bac0.f75662a);
    }

    /* JADX INFO: renamed from: H */
    public final void m224187H() {
        this.f209940h = this.f209941i + Math.max(this.f209918C - this.f209942j, 0);
        if (kkl0.m150134P(this)) {
            m224204Y(getWidth());
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m224188I(int i) {
        int i2 = this.f209949q;
        int iM144943c = (int) jhx.m144943c(((long) i2) + ((long) i), 0L, this.f209947o.size() - 1);
        this.f209949q = iM144943c;
        if (iM144943c == i2) {
            return false;
        }
        if (this.f209948p != -1) {
            this.f209948p = iM144943c;
        }
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m224189J(int i) {
        if (m224184E()) {
            i = i == Integer.MIN_VALUE ? Api.BaseClientBuilder.API_PRIORITY_OTHER : -i;
        }
        return m224188I(i);
    }

    /* JADX INFO: renamed from: K */
    public final float m224190K(float f) {
        float f2 = this.f209945m;
        float f3 = (f - f2) / (this.f209946n - f2);
        return m224184E() ? 1.0f - f3 : f3;
    }

    /* JADX INFO: renamed from: L */
    public final Boolean m224191L(int i, @NonNull KeyEvent keyEvent) {
        if (i == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(m224188I(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(m224188I(-1)) : Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    m224188I(-1);
                    return Boolean.TRUE;
                }
                if (i != 70) {
                    switch (i) {
                        case 21:
                            m224189J(-1);
                            return Boolean.TRUE;
                        case 22:
                            m224189J(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            m224188I(1);
            return Boolean.TRUE;
        }
        this.f209948p = this.f209949q;
        postInvalidate();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: M */
    public final void m224192M() {
        Iterator<T> it = this.f209958z.iterator();
        while (it.hasNext()) {
            it.next().mo56667a(this);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m224193N() {
        Iterator<T> it = this.f209958z.iterator();
        while (it.hasNext()) {
            it.next().mo56668b(this);
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean mo224194O() {
        if (this.f209948p != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fM224214g0 = m224214g0(valueOfTouchPositionAbsolute);
        this.f209948p = 0;
        float fAbs = Math.abs(this.f209947o.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f209947o.size(); i++) {
            float fAbs2 = Math.abs(this.f209947o.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float fM224214g1 = m224214g0(this.f209947o.get(i).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z = !m224184E() ? fM224214g1 - fM224214g0 >= 0.0f : fM224214g1 - fM224214g0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f209948p = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fM224214g1 - fM224214g0) < this.f209925J) {
                        this.f209948p = -1;
                        return false;
                    }
                    if (z) {
                        this.f209948p = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f209948p != -1;
    }

    /* JADX INFO: renamed from: P */
    public final void m224195P(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109679X2);
        this.f209916A = typedArrayObtainStyledAttributes.getColor(hhc0.f109740g3, this.f209933a);
        this.f209917B = typedArrayObtainStyledAttributes.getColor(hhc0.f109733f3, this.f209934b);
        this.f209945m = typedArrayObtainStyledAttributes.getFloat(hhc0.f109698a3, 0.0f);
        this.f209946n = typedArrayObtainStyledAttributes.getFloat(hhc0.f109705b3, 1.0f);
        setValues(Float.valueOf(this.f209945m));
        this.f209950r = typedArrayObtainStyledAttributes.getFloat(hhc0.f109691Z2, 0.0f);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109726e3, 0));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109747h3, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(hhc0.f109685Y2, true)) {
            setEnabled(false);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109712c3, -1);
        if (resourceId > 0) {
            this.f209921F = BitmapFactory.decodeResource(getResources(), resourceId);
        }
        this.f209932Q = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109719d3, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: Q */
    public void mo224196Q(@NonNull T t) {
        this.f209958z.remove(t);
    }

    /* JADX INFO: renamed from: R */
    public final void m224197R(int i) {
        VBaseSlider<S, L, T>.RunnableC22649a runnableC22649a = this.f209955w;
        if (runnableC22649a == null) {
            this.f209955w = new RunnableC22649a();
        } else {
            removeCallbacks(runnableC22649a);
        }
        this.f209955w.m224235a(i);
        postDelayed(this.f209955w, 200L);
    }

    /* JADX INFO: renamed from: S */
    public final void m224198S(fsf0 fsf0Var, float f) {
        fsf0Var.m127177j(m224233y(f));
        if (this.f209932Q) {
            int iM224190K = ((int) ((m224190K(f) * this.f209919D) + (this.f209918C * 2))) - (fsf0Var.getIntrinsicWidth() / 2);
            int iM175859d = qa00.m175859d(2.0f);
            fsf0Var.setBounds(iM224190K, iM175859d, fsf0Var.getIntrinsicWidth() + iM224190K, iM175859d);
        } else {
            int iM224190K2 = (this.f209940h + ((int) (m224190K(f) * this.f209919D))) - (fsf0Var.getIntrinsicWidth() / 2);
            int i = this.f209943k - (this.f209944l + this.f209918C);
            fsf0Var.setBounds(iM224190K2 - this.f209942j, i - fsf0Var.getIntrinsicHeight(), iM224190K2 + fsf0Var.getIntrinsicWidth() + this.f209942j, i);
        }
        Rect rect = new Rect(fsf0Var.getBounds());
        rvd.m183264b(inl0.m141152a(this), this, rect);
        fsf0Var.setBounds(rect);
        inl0.m141153b(this).mo98851b(fsf0Var);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m224199T(float f) {
        return m224201V(this.f209948p, f);
    }

    /* JADX INFO: renamed from: U */
    public final double m224200U(float f) {
        float f2 = this.f209950r;
        if (f2 <= 0.0f) {
            return f;
        }
        int i = (int) ((this.f209946n - this.f209945m) / f2);
        return ((double) Math.round(f * i)) / ((double) i);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m224201V(int i, float f) {
        this.f209949q = i;
        if (Math.abs(f - this.f209947o.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f209947o.set(i, Float.valueOf(m224234z(i, f)));
        m224225q(i);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m224202W() {
        return m224199T(getValueOfTouchPosition());
    }

    /* JADX INFO: renamed from: X */
    public void m224203X(int i, Rect rect) {
        int iM224190K = this.f209940h + ((int) (m224190K(getValues().get(i).floatValue()) * this.f209919D));
        int i2 = this.f209943k;
        int i3 = this.f209918C;
        rect.set(iM224190K - i3, i2 - i3, iM224190K + i3, i2 + i3);
    }

    /* JADX INFO: renamed from: Y */
    public final void m224204Y(int i) {
        this.f209919D = Math.max(i - (this.f209940h * 2), 0);
    }

    /* JADX INFO: renamed from: Z */
    public final void m224205Z() {
        if (this.f209951s) {
            m224208c0();
            m224209d0();
            m224207b0();
            m224210e0();
            m224206a0();
            m224216h0();
            this.f209951s = false;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m224206a0() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            eok0.m121752a("minSeparation(%s) must be greater or equal to 0", new Object[]{Float.valueOf(minSeparation)});
            return;
        }
        float f = this.f209950r;
        if (f <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f209927L != 1) {
            eok0.m121752a("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f209950r)});
        } else if (minSeparation < f || !m224183D(minSeparation)) {
            eok0.m121752a("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f209950r), Float.valueOf(this.f209950r)});
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m224207b0() {
        if (this.f209950r <= 0.0f || m224212f0(this.f209946n)) {
            return;
        }
        eok0.m121752a("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(this.f209950r), Float.valueOf(this.f209945m), Float.valueOf(this.f209946n)});
    }

    /* JADX INFO: renamed from: c0 */
    public final void m224208c0() {
        float f = this.f209945m;
        if (f < this.f209946n) {
            return;
        }
        eok0.m121752a("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.valueOf(f), Float.valueOf(this.f209946n)});
    }

    /* JADX INFO: renamed from: d0 */
    public final void m224209d0() {
        float f = this.f209946n;
        if (f > this.f209945m) {
            return;
        }
        eok0.m121752a("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.valueOf(f), Float.valueOf(this.f209945m)});
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f209953u.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209935c.setColor(this.f209916A);
        this.f209936d.setColor(this.f209917B);
        for (fsf0 fsf0Var : this.f209956x) {
            if (fsf0Var.isStateful()) {
                fsf0Var.setState(getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m224210e0() {
        for (Float f : this.f209947o) {
            if (f.floatValue() < this.f209945m || f.floatValue() > this.f209946n) {
                eok0.m121752a("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{f, Float.valueOf(this.f209945m), Float.valueOf(this.f209946n)});
                return;
            } else if (this.f209950r > 0.0f && !m224212f0(f.floatValue())) {
                eok0.m121752a("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{f, Float.valueOf(this.f209945m), Float.valueOf(this.f209950r), Float.valueOf(this.f209950r)});
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo224211f(@Nullable L l2) {
        this.f209957y.add(l2);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m224212f0(float f) {
        return m224183D(f - this.f209945m);
    }

    /* JADX INFO: renamed from: g */
    public void mo224213g(@NonNull T t) {
        this.f209958z.add(t);
    }

    /* JADX INFO: renamed from: g0 */
    public final float m224214g0(float f) {
        return (m224190K(f) * this.f209919D) + this.f209940h;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f209953u.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f209948p;
    }

    public int getFocusedThumbIndex() {
        return this.f209949q;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f209950r;
    }

    @Dimension
    public int getThumbRadius() {
        return this.f209918C;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f209939g;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f209940h;
    }

    @Dimension
    public int getTrackWidth() {
        return this.f209919D;
    }

    public float getValueFrom() {
        return this.f209945m;
    }

    public float getValueTo() {
        return this.f209946n;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f209947o);
    }

    /* JADX INFO: renamed from: h */
    public final void m224215h(boolean z) {
        m224220l();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 1.0f : 1.1f, z ? 1.1f : 1.0f);
        this.f209924I = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f209924I.setInterpolator(z ? f209915S : f209914R);
        this.f209924I.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f210440a.m224185F(valueAnimator);
            }
        });
        this.f209924I.start();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m224216h0() {
        float f = this.f209950r;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f));
        }
        float f2 = this.f209945m;
        if (((int) f2) != f2) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2));
        }
        float f3 = this.f209946n;
        if (((int) f3) != f3) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3));
        }
    }

    /* JADX INFO: renamed from: i */
    public final Float m224217i(int i) {
        float fM224219k = this.f209952t ? m224219k(20) : m224218j();
        if (i == 21) {
            if (!m224184E()) {
                fM224219k = -fM224219k;
            }
            return Float.valueOf(fM224219k);
        }
        if (i == 22) {
            if (m224184E()) {
                fM224219k = -fM224219k;
            }
            return Float.valueOf(fM224219k);
        }
        if (i == 69) {
            return Float.valueOf(-fM224219k);
        }
        if (i == 70 || i == 81) {
            return Float.valueOf(fM224219k);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final float m224218j() {
        float f = this.f209950r;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: k */
    public final float m224219k(int i) {
        float fM224218j = m224218j();
        float f = (this.f209946n - this.f209945m) / fM224218j;
        float f2 = i;
        return f <= f2 ? fM224218j : Math.round(f / f2) * fM224218j;
    }

    /* JADX INFO: renamed from: l */
    public final void m224220l() {
        ValueAnimator valueAnimator = this.f209924I;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f209924I.cancel();
        this.f209924I = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m224221m() {
        if (this.f209956x.size() > this.f209947o.size()) {
            List<fsf0> listSubList = this.f209956x.subList(this.f209947o.size(), this.f209956x.size());
            for (fsf0 fsf0Var : listSubList) {
                if (kkl0.m150133O(this)) {
                    m224223o(fsf0Var);
                }
            }
            listSubList.clear();
        }
        while (this.f209956x.size() < this.f209947o.size()) {
            this.f209956x.add(mo224222n());
        }
    }

    /* JADX INFO: renamed from: n */
    public fsf0 mo224222n() {
        if (this.f209932Q) {
            di40 di40Var = new di40(getContext());
            di40Var.m127175h(this.f209917B);
            return di40Var;
        }
        fsf0 fsf0Var = new fsf0(getContext());
        fsf0Var.m127175h(this.f209917B);
        return fsf0Var;
    }

    /* JADX INFO: renamed from: o */
    public final void m224223o(fsf0 fsf0Var) {
        cml0 cml0VarM141153b = inl0.m141153b(this);
        if (cml0VarM141153b != null) {
            cml0VarM141153b.mo98850a(fsf0Var);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        VBaseSlider<S, L, T>.RunnableC22649a runnableC22649a = this.f209955w;
        if (runnableC22649a != null) {
            removeCallbacks(runnableC22649a);
        }
        this.f209920E = false;
        Iterator<fsf0> it = this.f209956x.iterator();
        while (it.hasNext()) {
            m224223o(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f209951s) {
            m224205Z();
        }
        super.onDraw(canvas);
        int i = this.f209943k;
        m224228t(canvas, this.f209919D, i);
        if (((Float) Collections.max(getValues())).floatValue() > this.f209945m) {
            m224227s(canvas, this.f209919D, i);
        }
        if ((this.f209929N || isFocused()) && isEnabled() && this.f209948p != -1) {
            m224230v();
        }
        m224229u(canvas, this.f209919D, i);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            m224232x(i);
            this.f209953u.requestKeyboardFocusForVirtualView(this.f209949q);
        } else {
            this.f209948p = -1;
            m224231w();
            this.f209953u.clearKeyboardFocusForVirtualView(this.f209949q);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f209947o.size() == 1) {
            this.f209948p = 0;
        }
        if (this.f209948p == -1) {
            Boolean boolM224191L = m224191L(i, keyEvent);
            return boolM224191L != null ? boolM224191L.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.f209952t |= keyEvent.isLongPress();
        Float fM224217i = m224217i(i);
        if (fM224217i != null) {
            if (m224199T(this.f209947o.get(this.f209948p).floatValue() + fM224217i.floatValue())) {
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m224188I(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m224188I(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f209948p = -1;
        m224231w();
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f209952t = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f209938f, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m224204Y(i);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.f209940h) / this.f209919D;
        this.f209926K = f;
        float fMax = Math.max(0.0f, f);
        this.f209926K = fMax;
        this.f209926K = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f209930O = x;
            if (!m224182C()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo224194O()) {
                    requestFocus();
                    this.f209929N = true;
                    m224202W();
                    invalidate();
                    m224192M();
                }
            }
        } else if (actionMasked == 1) {
            this.f209929N = false;
            motionEvent2 = this.f209931P;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f209931P.getX() - motionEvent.getX()) <= this.f209925J && Math.abs(this.f209931P.getY() - motionEvent.getY()) <= this.f209925J && mo224194O()) {
                m224192M();
            }
            if (this.f209948p != -1) {
                m224202W();
                this.f209948p = -1;
                m224193N();
            }
            m224231w();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f209929N) {
                if (m224182C() && Math.abs(x - this.f209930O) < this.f209925J) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m224192M();
            }
            if (mo224194O()) {
                this.f209929N = true;
                m224202W();
                invalidate();
            }
        } else if (actionMasked == 3) {
            this.f209929N = false;
            motionEvent2 = this.f209931P;
            if (motionEvent2 != null) {
                m224192M();
            }
            if (this.f209948p != -1) {
                m224202W();
                this.f209948p = -1;
                m224193N();
            }
            m224231w();
            invalidate();
        }
        setPressed(this.f209929N);
        this.f209931P = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final float m224224p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.f209940h) / this.f209919D;
        float f3 = this.f209945m;
        return (f2 * (f3 - this.f209946n)) + f3;
    }

    /* JADX INFO: renamed from: q */
    public final void m224225q(int i) {
        for (L l2 : this.f209957y) {
            l2.mo56599a(this, true, this.f209947o.get(i).floatValue());
            if (this.f209947o.size() >= 2) {
                float fFloatValue = this.f209947o.get(0).floatValue();
                ArrayList<Float> arrayList = this.f209947o;
                l2.mo56600b(this, false, fFloatValue, arrayList.get(arrayList.size() - 1).floatValue());
            }
        }
        AccessibilityManager accessibilityManager = this.f209954v;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        m224197R(i);
    }

    /* JADX INFO: renamed from: r */
    public final void m224226r() {
        for (L l2 : this.f209957y) {
            Iterator<Float> it = this.f209947o.iterator();
            while (it.hasNext()) {
                l2.mo56599a(this, false, it.next().floatValue());
            }
            if (this.f209947o.size() >= 2) {
                float fFloatValue = this.f209947o.get(0).floatValue();
                ArrayList<Float> arrayList = this.f209947o;
                l2.mo56600b(this, false, fFloatValue, arrayList.get(arrayList.size() - 1).floatValue());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m224227s(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f209940h;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (activeRange[0] * f), f2, i3 + (activeRange[1] * f), f2, this.f209936d);
    }

    public void setActiveThumbIndex(int i) {
        this.f209948p = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f209947o.size()) {
            wg3.m206174a("index out of range");
            return;
        }
        this.f209949q = i;
        this.f209953u.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setLabelFormatter(@Nullable ozk0 ozk0Var) {
        this.f209928M = ozk0Var;
    }

    public void setSeparationUnit(int i) {
        this.f209927L = i;
        this.f209951s = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            gzi0.m133102a("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(f), Float.valueOf(this.f209945m), Float.valueOf(this.f209946n)});
        } else if (this.f209950r != f) {
            this.f209950r = f;
            this.f209951s = true;
            postInvalidate();
        }
    }

    public void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        if (i == this.f209918C) {
            return;
        }
        this.f209918C = i;
        m224187H();
        postInvalidate();
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        if (this.f209939g != i) {
            this.f209939g = i;
            m224181B();
            postInvalidate();
        }
    }

    public void setValueFrom(float f) {
        this.f209945m = f;
        this.f209951s = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f209946n = f;
        this.f209951s = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public final void m224228t(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f209940h;
        float f = i;
        float f2 = i3 + (activeRange[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.f209935c);
        }
        int i4 = this.f209940h;
        float f4 = i4 + (activeRange[0] * f);
        if (f4 > i4) {
            float f5 = i4;
            float f6 = i2;
            canvas.drawLine(f5, f6, f4, f6, this.f209935c);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m224229u(@NonNull Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f209947o.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.f209940h + (m224190K(it.next().floatValue()) * i), i2, this.f209918C, this.f209937e);
            }
        }
        for (int i3 = 0; i3 < this.f209947o.size(); i3++) {
            boolean z = this.f209932Q;
            ArrayList<Float> arrayList = this.f209947o;
            if (z) {
                Float f = arrayList.get(i3);
                canvas.save();
                int iM224190K = (int) (m224190K(f.floatValue()) * i);
                int i4 = this.f209918C;
                float f2 = i4 * 4;
                float f3 = i4 * 4;
                this.f209922G.reset();
                if (i3 == this.f209948p) {
                    canvas.translate(iM224190K + (f3 * 0.2f * this.f209923H), f2 * 0.25f);
                } else {
                    canvas.translate(iM224190K + (f3 * 0.2f), f2 * 0.25f);
                }
            } else {
                Float f4 = arrayList.get(i3);
                canvas.save();
                int iM224190K2 = this.f209940h + ((int) (m224190K(f4.floatValue()) * i));
                float f5 = this.f209918C * 4;
                float f6 = 0.75f * f5;
                float width = this.f209921F.getWidth();
                float height = this.f209921F.getHeight();
                this.f209922G.reset();
                if (i3 == this.f209948p) {
                    float f7 = this.f209923H;
                    canvas.translate(iM224190K2 - ((f6 * 0.5f) * f7), (((int) (this.f209939g * 0.8f)) * f7) - ((0.5f * f5) * (f7 - 1.0f)));
                    Matrix matrix = this.f209922G;
                    float f8 = (f6 * 1.0f) / width;
                    float f9 = this.f209923H;
                    matrix.setScale(f8 * f9, ((f5 * 1.0f) / height) * f9);
                } else {
                    canvas.translate(iM224190K2 - (0.5f * f6), (int) (this.f209939g * 0.8f));
                    this.f209922G.setScale((f6 * 1.0f) / width, (f5 * 1.0f) / height);
                }
            }
            canvas.drawBitmap(this.f209921F, this.f209922G, this.f209937e);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m224230v() {
        if (!this.f209920E) {
            this.f209920E = true;
            m224215h(true);
        }
        Iterator<fsf0> it = this.f209956x.iterator();
        for (int i = 0; i < this.f209947o.size() && it.hasNext(); i++) {
            if (i != this.f209949q) {
                m224198S(it.next(), this.f209947o.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            m224198S(it.next(), this.f209947o.get(this.f209949q).floatValue());
        } else {
            eok0.m121752a("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f209956x.size()), Integer.valueOf(this.f209947o.size())});
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m224231w() {
        if (this.f209920E) {
            this.f209920E = false;
            for (fsf0 fsf0Var : this.f209956x) {
                fsf0Var.m127176i(1.0f);
                inl0.m141153b(this).mo98850a(fsf0Var);
            }
            m224215h(false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m224232x(int i) {
        if (i == 1) {
            m224188I(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        if (i == 2) {
            m224188I(Integer.MIN_VALUE);
        } else if (i == 17) {
            m224189J(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            if (i != 66) {
                return;
            }
            m224189J(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m224233y(float f) {
        if (mo224180A()) {
            return this.f209928M.mo56598a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    /* JADX INFO: renamed from: z */
    public final float m224234z(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.f209927L == 0) {
            minSeparation = m224224p(minSeparation);
        }
        if (m224184E()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return jhx.m144941a(f, i3 < 0 ? this.f209945m : this.f209947o.get(i3).floatValue() + minSeparation, i2 >= this.f209947o.size() ? this.f209946n : this.f209947o.get(i2).floatValue() - minSeparation);
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public VBaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VBaseSlider(@NonNull Context context) {
        this(context, null);
    }
}
