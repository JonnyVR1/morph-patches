package p147v;

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
import p147v.VBaseSlider;
import p149l.C17055gc;
import p149l.b9c0;
import p149l.dqi0;
import p149l.dud;
import p149l.eel0;
import p149l.gbl0;
import p149l.ig3;
import p149l.iqk0;
import p149l.kex;
import p149l.kig;
import p149l.p940;
import p149l.t0c0;
import p149l.t100;
import p149l.u1c0;
import p149l.u2c0;
import p149l.wg50;
import p149l.wjf0;
import p149l.wnf;
import p149l.xek0;
import p149l.ycl0;
import p149l.yek0;

/* JADX INFO: loaded from: classes3.dex */
abstract class VBaseSlider<S extends VBaseSlider<S, L, T>, L extends wg50<S>, T extends xek0<S>> extends View {

    /* JADX INFO: renamed from: R */
    public static final TimeInterpolator f208992R = new kig();

    /* JADX INFO: renamed from: S */
    public static final TimeInterpolator f208993S = new OvershootInterpolator(5.0f);

    /* JADX INFO: renamed from: A */
    public int f208994A;

    /* JADX INFO: renamed from: B */
    public int f208995B;

    /* JADX INFO: renamed from: C */
    public int f208996C;

    /* JADX INFO: renamed from: D */
    public int f208997D;

    /* JADX INFO: renamed from: E */
    public boolean f208998E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public Bitmap f208999F;

    /* JADX INFO: renamed from: G */
    public final Matrix f209000G;

    /* JADX INFO: renamed from: H */
    public float f209001H;

    /* JADX INFO: renamed from: I */
    public ValueAnimator f209002I;

    /* JADX INFO: renamed from: J */
    public final int f209003J;

    /* JADX INFO: renamed from: K */
    public float f209004K;

    /* JADX INFO: renamed from: L */
    public int f209005L;

    /* JADX INFO: renamed from: M */
    public iqk0 f209006M;

    /* JADX INFO: renamed from: N */
    public boolean f209007N;

    /* JADX INFO: renamed from: O */
    public float f209008O;

    /* JADX INFO: renamed from: P */
    public MotionEvent f209009P;

    /* JADX INFO: renamed from: Q */
    public boolean f209010Q;

    /* JADX INFO: renamed from: a */
    public final int f209011a;

    /* JADX INFO: renamed from: b */
    public final int f209012b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Paint f209013c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Paint f209014d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Paint f209015e;

    /* JADX INFO: renamed from: f */
    public int f209016f;

    /* JADX INFO: renamed from: g */
    public int f209017g;

    /* JADX INFO: renamed from: h */
    public int f209018h;

    /* JADX INFO: renamed from: i */
    public int f209019i;

    /* JADX INFO: renamed from: j */
    public int f209020j;

    /* JADX INFO: renamed from: k */
    public int f209021k;

    /* JADX INFO: renamed from: l */
    public int f209022l;

    /* JADX INFO: renamed from: m */
    public float f209023m;

    /* JADX INFO: renamed from: n */
    public float f209024n;

    /* JADX INFO: renamed from: o */
    public ArrayList<Float> f209025o;

    /* JADX INFO: renamed from: p */
    public int f209026p;

    /* JADX INFO: renamed from: q */
    public int f209027q;

    /* JADX INFO: renamed from: r */
    public float f209028r;

    /* JADX INFO: renamed from: s */
    public boolean f209029s;

    /* JADX INFO: renamed from: t */
    public boolean f209030t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final C22535b f209031u;

    /* JADX INFO: renamed from: v */
    public final AccessibilityManager f209032v;

    /* JADX INFO: renamed from: w */
    public VBaseSlider<S, L, T>.RunnableC22534a f209033w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final List<wjf0> f209034x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final List<L> f209035y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final List<T> f209036z;

    /* JADX INFO: renamed from: v.VBaseSlider$a */
    public class RunnableC22534a implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f209037a;

        public RunnableC22534a() {
            this.f209037a = -1;
        }

        /* JADX INFO: renamed from: a */
        public void m222989a(int i) {
            this.f209037a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VBaseSlider.this.f209031u.sendEventForVirtualView(this.f209037a, 4);
        }
    }

    /* JADX INFO: renamed from: v.VBaseSlider$b */
    public static class C22535b extends wnf {

        /* JADX INFO: renamed from: a */
        public final VBaseSlider<?, ?, ?> f209039a;

        /* JADX INFO: renamed from: b */
        public Rect f209040b;

        public C22535b(VBaseSlider<?, ?, ?> vBaseSlider) {
            super(vBaseSlider);
            this.f209040b = new Rect();
            this.f209039a = vBaseSlider;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final String m222990a(int i) {
            if (i == this.f209039a.getValues().size() - 1) {
                return "Range end,";
            }
            return i == 0 ? "Range start," : "";
        }

        @Override // p149l.wnf
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f209039a.getValues().size(); i++) {
                this.f209039a.m222957X(i, this.f209040b);
                if (this.f209040b.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // p149l.wnf
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.f209039a.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p149l.wnf
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f209039a.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f209039a.m222955V(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f209039a.postInvalidate();
                        invalidateVirtualView(i);
                        return true;
                    }
                }
                return false;
            }
            float fM222973k = this.f209039a.m222973k(20);
            if (i2 == 8192) {
                fM222973k = -fM222973k;
            }
            if (this.f209039a.m222938E()) {
                fM222973k = -fM222973k;
            }
            if (!this.f209039a.m222955V(i, kex.m145806a(this.f209039a.getValues().get(i).floatValue() + fM222973k, this.f209039a.getValueFrom(), this.f209039a.getValueTo()))) {
                return false;
            }
            this.f209039a.postInvalidate();
            invalidateVirtualView(i);
            return true;
        }

        @Override // p149l.wnf
        public void onPopulateNodeForVirtualView(int i, C17055gc c17055gc) {
            c17055gc.m125403b(C17055gc.a.f101939L);
            List<Float> values = this.f209039a.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = this.f209039a.getValueFrom();
            float valueTo = this.f209039a.getValueTo();
            if (this.f209039a.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    c17055gc.m125402a(8192);
                }
                if (fFloatValue < valueTo) {
                    c17055gc.m125402a(4096);
                }
            }
            c17055gc.m125372H0(C17055gc.g.m125464a(1, valueFrom, valueTo, fFloatValue));
            c17055gc.m125427o0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f209039a.getContentDescription() != null) {
                sb.append(this.f209039a.getContentDescription());
                sb.append(Constants.SEPARATOR_COMMA);
            }
            if (values.size() > 1) {
                sb.append(m222990a(i));
                sb.append(this.f209039a.m222987y(fFloatValue));
            }
            c17055gc.m125434s0(sb.toString());
            this.f209039a.m222957X(i, this.f209040b);
            c17055gc.m125417j0(this.f209040b);
        }
    }

    public VBaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209011a = getResources().getColor(t0c0.f167166r);
        this.f209012b = getResources().getColor(t0c0.f167168t);
        this.f209025o = new ArrayList<>();
        this.f209026p = -1;
        this.f209027q = -1;
        this.f209028r = 0.0f;
        this.f209030t = false;
        this.f209034x = new ArrayList();
        this.f209035y = new ArrayList();
        this.f209036z = new ArrayList();
        this.f208998E = false;
        this.f209000G = new Matrix();
        this.f209001H = 1.0f;
        this.f209005L = 0;
        this.f209007N = false;
        this.f209010Q = false;
        Paint paint = new Paint();
        this.f209013c = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f209014d = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f209015e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        m222940G(context.getResources());
        setFocusable(true);
        setClickable(true);
        this.f208999F = BitmapFactory.decodeResource(getResources(), u2c0.f173475z);
        m222949P(context, attributeSet);
        this.f209003J = ViewConfiguration.get(context).getScaledTouchSlop();
        C22535b c22535b = new C22535b(this);
        this.f209031u = c22535b;
        gbl0.m125201j0(this, c22535b);
        this.f209032v = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f209025o.size() == 1) {
            fFloatValue2 = this.f209023m;
        }
        float fM222944K = m222944K(fFloatValue2);
        float fM222944K2 = m222944K(fFloatValue);
        return m222938E() ? new float[]{fM222944K2, fM222944K} : new float[]{fM222944K, fM222944K2};
    }

    private float getValueOfTouchPosition() {
        double dM222954U = m222954U(this.f209004K);
        if (m222938E()) {
            dM222954U = 1.0d - dM222954U;
        }
        float f = this.f209024n;
        float f2 = this.f209023m;
        return (float) ((dM222954U * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f209004K;
        if (m222938E()) {
            f = 1.0f - f;
        }
        float f2 = this.f209024n;
        float f3 = this.f209023m;
        return (f * (f2 - f3)) + f3;
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            ig3.m135964a("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.f209025o.size() == arrayList.size() && this.f209025o.equals(arrayList)) {
            return;
        }
        this.f209025o = arrayList;
        this.f209029s = true;
        this.f209027q = 0;
        m222975m();
        m222980r();
        postInvalidate();
    }

    /* JADX INFO: renamed from: A */
    public boolean mo222934A() {
        return this.f209006M != null;
    }

    /* JADX INFO: renamed from: B */
    public final void m222935B() {
        this.f209013c.setStrokeWidth(this.f209017g);
        this.f209014d.setStrokeWidth(this.f209017g);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m222936C() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m222937D(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f209028r)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m222938E() {
        return gbl0.m125228x(this) == 1;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m222939F(ValueAnimator valueAnimator) {
        this.f209001H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
        Iterator<wjf0> it = this.f209034x.iterator();
        for (int i = 0; i < this.f209025o.size() && it.hasNext(); i++) {
            if (i != this.f209027q) {
                it.next().m203443i(1.0f);
            }
        }
        it.next().m203443i(this.f209001H);
    }

    /* JADX INFO: renamed from: G */
    public final void m222940G(@NonNull Resources resources) {
        this.f209016f = resources.getDimensionPixelSize(u1c0.f172991e);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(u1c0.f172989c);
        this.f209019i = dimensionPixelOffset;
        this.f209018h = dimensionPixelOffset;
        this.f209020j = resources.getDimensionPixelSize(u1c0.f172988b);
        this.f209021k = resources.getDimensionPixelOffset(u1c0.f172990d);
        this.f209022l = resources.getDimensionPixelSize(u1c0.f172987a);
    }

    /* JADX INFO: renamed from: H */
    public final void m222941H() {
        this.f209018h = this.f209019i + Math.max(this.f208996C - this.f209020j, 0);
        if (gbl0.m125171P(this)) {
            m222958Y(getWidth());
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m222942I(int i) {
        int i2 = this.f209027q;
        int iM145808c = (int) kex.m145808c(((long) i2) + ((long) i), 0L, this.f209025o.size() - 1);
        this.f209027q = iM145808c;
        if (iM145808c == i2) {
            return false;
        }
        if (this.f209026p != -1) {
            this.f209026p = iM145808c;
        }
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m222943J(int i) {
        if (m222938E()) {
            i = i == Integer.MIN_VALUE ? Api.BaseClientBuilder.API_PRIORITY_OTHER : -i;
        }
        return m222942I(i);
    }

    /* JADX INFO: renamed from: K */
    public final float m222944K(float f) {
        float f2 = this.f209023m;
        float f3 = (f - f2) / (this.f209024n - f2);
        return m222938E() ? 1.0f - f3 : f3;
    }

    /* JADX INFO: renamed from: L */
    public final Boolean m222945L(int i, @NonNull KeyEvent keyEvent) {
        if (i == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(m222942I(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(m222942I(-1)) : Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    m222942I(-1);
                    return Boolean.TRUE;
                }
                if (i != 70) {
                    switch (i) {
                        case 21:
                            m222943J(-1);
                            return Boolean.TRUE;
                        case 22:
                            m222943J(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            m222942I(1);
            return Boolean.TRUE;
        }
        this.f209026p = this.f209027q;
        postInvalidate();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: M */
    public final void m222946M() {
        Iterator<T> it = this.f209036z.iterator();
        while (it.hasNext()) {
            it.next().mo55484a(this);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m222947N() {
        Iterator<T> it = this.f209036z.iterator();
        while (it.hasNext()) {
            it.next().mo55485b(this);
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean mo222948O() {
        if (this.f209026p != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fM222968g0 = m222968g0(valueOfTouchPositionAbsolute);
        this.f209026p = 0;
        float fAbs = Math.abs(this.f209025o.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f209025o.size(); i++) {
            float fAbs2 = Math.abs(this.f209025o.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float fM222968g1 = m222968g0(this.f209025o.get(i).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z = !m222938E() ? fM222968g1 - fM222968g0 >= 0.0f : fM222968g1 - fM222968g0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f209026p = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fM222968g1 - fM222968g0) < this.f209003J) {
                        this.f209026p = -1;
                        return false;
                    }
                    if (z) {
                        this.f209026p = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f209026p != -1;
    }

    /* JADX INFO: renamed from: P */
    public final void m222949P(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74370X2);
        this.f208994A = typedArrayObtainStyledAttributes.getColor(b9c0.f74431g3, this.f209011a);
        this.f208995B = typedArrayObtainStyledAttributes.getColor(b9c0.f74424f3, this.f209012b);
        this.f209023m = typedArrayObtainStyledAttributes.getFloat(b9c0.f74389a3, 0.0f);
        this.f209024n = typedArrayObtainStyledAttributes.getFloat(b9c0.f74396b3, 1.0f);
        setValues(Float.valueOf(this.f209023m));
        this.f209028r = typedArrayObtainStyledAttributes.getFloat(b9c0.f74382Z2, 0.0f);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74417e3, 0));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74438h3, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(b9c0.f74376Y2, true)) {
            setEnabled(false);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74403c3, -1);
        if (resourceId > 0) {
            this.f208999F = BitmapFactory.decodeResource(getResources(), resourceId);
        }
        this.f209010Q = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74410d3, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: Q */
    public void mo222950Q(@NonNull T t) {
        this.f209036z.remove(t);
    }

    /* JADX INFO: renamed from: R */
    public final void m222951R(int i) {
        VBaseSlider<S, L, T>.RunnableC22534a runnableC22534a = this.f209033w;
        if (runnableC22534a == null) {
            this.f209033w = new RunnableC22534a();
        } else {
            removeCallbacks(runnableC22534a);
        }
        this.f209033w.m222989a(i);
        postDelayed(this.f209033w, 200L);
    }

    /* JADX INFO: renamed from: S */
    public final void m222952S(wjf0 wjf0Var, float f) {
        wjf0Var.m203444j(m222987y(f));
        if (this.f209010Q) {
            int iM222944K = ((int) ((m222944K(f) * this.f208997D) + (this.f208996C * 2))) - (wjf0Var.getIntrinsicWidth() / 2);
            int iM186890d = t100.m186890d(2.0f);
            wjf0Var.setBounds(iM222944K, iM186890d, wjf0Var.getIntrinsicWidth() + iM222944K, iM186890d);
        } else {
            int iM222944K2 = (this.f209018h + ((int) (m222944K(f) * this.f208997D))) - (wjf0Var.getIntrinsicWidth() / 2);
            int i = this.f209021k - (this.f209022l + this.f208996C);
            wjf0Var.setBounds(iM222944K2 - this.f209020j, i - wjf0Var.getIntrinsicHeight(), iM222944K2 + wjf0Var.getIntrinsicWidth() + this.f209020j, i);
        }
        Rect rect = new Rect(wjf0Var.getBounds());
        dud.m113681b(eel0.m115983a(this), this, rect);
        wjf0Var.setBounds(rect);
        eel0.m115984b(this).mo202667b(wjf0Var);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m222953T(float f) {
        return m222955V(this.f209026p, f);
    }

    /* JADX INFO: renamed from: U */
    public final double m222954U(float f) {
        float f2 = this.f209028r;
        if (f2 <= 0.0f) {
            return f;
        }
        int i = (int) ((this.f209024n - this.f209023m) / f2);
        return ((double) Math.round(f * i)) / ((double) i);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m222955V(int i, float f) {
        this.f209027q = i;
        if (Math.abs(f - this.f209025o.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f209025o.set(i, Float.valueOf(m222988z(i, f)));
        m222979q(i);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m222956W() {
        return m222953T(getValueOfTouchPosition());
    }

    /* JADX INFO: renamed from: X */
    public void m222957X(int i, Rect rect) {
        int iM222944K = this.f209018h + ((int) (m222944K(getValues().get(i).floatValue()) * this.f208997D));
        int i2 = this.f209021k;
        int i3 = this.f208996C;
        rect.set(iM222944K - i3, i2 - i3, iM222944K + i3, i2 + i3);
    }

    /* JADX INFO: renamed from: Y */
    public final void m222958Y(int i) {
        this.f208997D = Math.max(i - (this.f209018h * 2), 0);
    }

    /* JADX INFO: renamed from: Z */
    public final void m222959Z() {
        if (this.f209029s) {
            m222962c0();
            m222963d0();
            m222961b0();
            m222964e0();
            m222960a0();
            m222970h0();
            this.f209029s = false;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m222960a0() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            yek0.m214351a("minSeparation(%s) must be greater or equal to 0", new Object[]{Float.valueOf(minSeparation)});
            return;
        }
        float f = this.f209028r;
        if (f <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f209005L != 1) {
            yek0.m214351a("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f209028r)});
        } else if (minSeparation < f || !m222937D(minSeparation)) {
            yek0.m214351a("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f209028r), Float.valueOf(this.f209028r)});
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m222961b0() {
        if (this.f209028r <= 0.0f || m222966f0(this.f209024n)) {
            return;
        }
        yek0.m214351a("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(this.f209028r), Float.valueOf(this.f209023m), Float.valueOf(this.f209024n)});
    }

    /* JADX INFO: renamed from: c0 */
    public final void m222962c0() {
        float f = this.f209023m;
        if (f < this.f209024n) {
            return;
        }
        yek0.m214351a("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.valueOf(f), Float.valueOf(this.f209024n)});
    }

    /* JADX INFO: renamed from: d0 */
    public final void m222963d0() {
        float f = this.f209024n;
        if (f > this.f209023m) {
            return;
        }
        yek0.m214351a("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.valueOf(f), Float.valueOf(this.f209023m)});
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f209031u.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209013c.setColor(this.f208994A);
        this.f209014d.setColor(this.f208995B);
        for (wjf0 wjf0Var : this.f209034x) {
            if (wjf0Var.isStateful()) {
                wjf0Var.setState(getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m222964e0() {
        for (Float f : this.f209025o) {
            if (f.floatValue() < this.f209023m || f.floatValue() > this.f209024n) {
                yek0.m214351a("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{f, Float.valueOf(this.f209023m), Float.valueOf(this.f209024n)});
                return;
            } else if (this.f209028r > 0.0f && !m222966f0(f.floatValue())) {
                yek0.m214351a("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{f, Float.valueOf(this.f209023m), Float.valueOf(this.f209028r), Float.valueOf(this.f209028r)});
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo222965f(@Nullable L l2) {
        this.f209035y.add(l2);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m222966f0(float f) {
        return m222937D(f - this.f209023m);
    }

    /* JADX INFO: renamed from: g */
    public void mo222967g(@NonNull T t) {
        this.f209036z.add(t);
    }

    /* JADX INFO: renamed from: g0 */
    public final float m222968g0(float f) {
        return (m222944K(f) * this.f208997D) + this.f209018h;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f209031u.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f209026p;
    }

    public int getFocusedThumbIndex() {
        return this.f209027q;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f209028r;
    }

    @Dimension
    public int getThumbRadius() {
        return this.f208996C;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f209017g;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f209018h;
    }

    @Dimension
    public int getTrackWidth() {
        return this.f208997D;
    }

    public float getValueFrom() {
        return this.f209023m;
    }

    public float getValueTo() {
        return this.f209024n;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f209025o);
    }

    /* JADX INFO: renamed from: h */
    public final void m222969h(boolean z) {
        m222974l();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 1.0f : 1.1f, z ? 1.1f : 1.0f);
        this.f209002I = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f209002I.setInterpolator(z ? f208993S : f208992R);
        this.f209002I.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f209518a.m222939F(valueAnimator);
            }
        });
        this.f209002I.start();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m222970h0() {
        float f = this.f209028r;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f));
        }
        float f2 = this.f209023m;
        if (((int) f2) != f2) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2));
        }
        float f3 = this.f209024n;
        if (((int) f3) != f3) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3));
        }
    }

    /* JADX INFO: renamed from: i */
    public final Float m222971i(int i) {
        float fM222973k = this.f209030t ? m222973k(20) : m222972j();
        if (i == 21) {
            if (!m222938E()) {
                fM222973k = -fM222973k;
            }
            return Float.valueOf(fM222973k);
        }
        if (i == 22) {
            if (m222938E()) {
                fM222973k = -fM222973k;
            }
            return Float.valueOf(fM222973k);
        }
        if (i == 69) {
            return Float.valueOf(-fM222973k);
        }
        if (i == 70 || i == 81) {
            return Float.valueOf(fM222973k);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final float m222972j() {
        float f = this.f209028r;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: k */
    public final float m222973k(int i) {
        float fM222972j = m222972j();
        float f = (this.f209024n - this.f209023m) / fM222972j;
        float f2 = i;
        return f <= f2 ? fM222972j : Math.round(f / f2) * fM222972j;
    }

    /* JADX INFO: renamed from: l */
    public final void m222974l() {
        ValueAnimator valueAnimator = this.f209002I;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f209002I.cancel();
        this.f209002I = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m222975m() {
        if (this.f209034x.size() > this.f209025o.size()) {
            List<wjf0> listSubList = this.f209034x.subList(this.f209025o.size(), this.f209034x.size());
            for (wjf0 wjf0Var : listSubList) {
                if (gbl0.m125170O(this)) {
                    m222977o(wjf0Var);
                }
            }
            listSubList.clear();
        }
        while (this.f209034x.size() < this.f209025o.size()) {
            this.f209034x.add(mo222976n());
        }
    }

    /* JADX INFO: renamed from: n */
    public wjf0 mo222976n() {
        if (this.f209010Q) {
            p940 p940Var = new p940(getContext());
            p940Var.m203442h(this.f208995B);
            return p940Var;
        }
        wjf0 wjf0Var = new wjf0(getContext());
        wjf0Var.m203442h(this.f208995B);
        return wjf0Var;
    }

    /* JADX INFO: renamed from: o */
    public final void m222977o(wjf0 wjf0Var) {
        ycl0 ycl0VarM115984b = eel0.m115984b(this);
        if (ycl0VarM115984b != null) {
            ycl0VarM115984b.mo202666a(wjf0Var);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        VBaseSlider<S, L, T>.RunnableC22534a runnableC22534a = this.f209033w;
        if (runnableC22534a != null) {
            removeCallbacks(runnableC22534a);
        }
        this.f208998E = false;
        Iterator<wjf0> it = this.f209034x.iterator();
        while (it.hasNext()) {
            m222977o(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f209029s) {
            m222959Z();
        }
        super.onDraw(canvas);
        int i = this.f209021k;
        m222982t(canvas, this.f208997D, i);
        if (((Float) Collections.max(getValues())).floatValue() > this.f209023m) {
            m222981s(canvas, this.f208997D, i);
        }
        if ((this.f209007N || isFocused()) && isEnabled() && this.f209026p != -1) {
            m222984v();
        }
        m222983u(canvas, this.f208997D, i);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            m222986x(i);
            this.f209031u.requestKeyboardFocusForVirtualView(this.f209027q);
        } else {
            this.f209026p = -1;
            m222985w();
            this.f209031u.clearKeyboardFocusForVirtualView(this.f209027q);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f209025o.size() == 1) {
            this.f209026p = 0;
        }
        if (this.f209026p == -1) {
            Boolean boolM222945L = m222945L(i, keyEvent);
            return boolM222945L != null ? boolM222945L.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.f209030t |= keyEvent.isLongPress();
        Float fM222971i = m222971i(i);
        if (fM222971i != null) {
            if (m222953T(this.f209025o.get(this.f209026p).floatValue() + fM222971i.floatValue())) {
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m222942I(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m222942I(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f209026p = -1;
        m222985w();
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f209030t = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f209016f, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m222958Y(i);
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
        float f = (x - this.f209018h) / this.f208997D;
        this.f209004K = f;
        float fMax = Math.max(0.0f, f);
        this.f209004K = fMax;
        this.f209004K = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f209008O = x;
            if (!m222936C()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo222948O()) {
                    requestFocus();
                    this.f209007N = true;
                    m222956W();
                    invalidate();
                    m222946M();
                }
            }
        } else if (actionMasked == 1) {
            this.f209007N = false;
            motionEvent2 = this.f209009P;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f209009P.getX() - motionEvent.getX()) <= this.f209003J && Math.abs(this.f209009P.getY() - motionEvent.getY()) <= this.f209003J && mo222948O()) {
                m222946M();
            }
            if (this.f209026p != -1) {
                m222956W();
                this.f209026p = -1;
                m222947N();
            }
            m222985w();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f209007N) {
                if (m222936C() && Math.abs(x - this.f209008O) < this.f209003J) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m222946M();
            }
            if (mo222948O()) {
                this.f209007N = true;
                m222956W();
                invalidate();
            }
        } else if (actionMasked == 3) {
            this.f209007N = false;
            motionEvent2 = this.f209009P;
            if (motionEvent2 != null) {
                m222946M();
            }
            if (this.f209026p != -1) {
                m222956W();
                this.f209026p = -1;
                m222947N();
            }
            m222985w();
            invalidate();
        }
        setPressed(this.f209007N);
        this.f209009P = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final float m222978p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.f209018h) / this.f208997D;
        float f3 = this.f209023m;
        return (f2 * (f3 - this.f209024n)) + f3;
    }

    /* JADX INFO: renamed from: q */
    public final void m222979q(int i) {
        for (L l2 : this.f209035y) {
            l2.mo55416a(this, true, this.f209025o.get(i).floatValue());
            if (this.f209025o.size() >= 2) {
                float fFloatValue = this.f209025o.get(0).floatValue();
                ArrayList<Float> arrayList = this.f209025o;
                l2.mo55417b(this, false, fFloatValue, arrayList.get(arrayList.size() - 1).floatValue());
            }
        }
        AccessibilityManager accessibilityManager = this.f209032v;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        m222951R(i);
    }

    /* JADX INFO: renamed from: r */
    public final void m222980r() {
        for (L l2 : this.f209035y) {
            Iterator<Float> it = this.f209025o.iterator();
            while (it.hasNext()) {
                l2.mo55416a(this, false, it.next().floatValue());
            }
            if (this.f209025o.size() >= 2) {
                float fFloatValue = this.f209025o.get(0).floatValue();
                ArrayList<Float> arrayList = this.f209025o;
                l2.mo55417b(this, false, fFloatValue, arrayList.get(arrayList.size() - 1).floatValue());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m222981s(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f209018h;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (activeRange[0] * f), f2, i3 + (activeRange[1] * f), f2, this.f209014d);
    }

    public void setActiveThumbIndex(int i) {
        this.f209026p = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f209025o.size()) {
            ig3.m135964a("index out of range");
            return;
        }
        this.f209027q = i;
        this.f209031u.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setLabelFormatter(@Nullable iqk0 iqk0Var) {
        this.f209006M = iqk0Var;
    }

    public void setSeparationUnit(int i) {
        this.f209005L = i;
        this.f209029s = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            dqi0.m113073a("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(f), Float.valueOf(this.f209023m), Float.valueOf(this.f209024n)});
        } else if (this.f209028r != f) {
            this.f209028r = f;
            this.f209029s = true;
            postInvalidate();
        }
    }

    public void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        if (i == this.f208996C) {
            return;
        }
        this.f208996C = i;
        m222941H();
        postInvalidate();
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        if (this.f209017g != i) {
            this.f209017g = i;
            m222935B();
            postInvalidate();
        }
    }

    public void setValueFrom(float f) {
        this.f209023m = f;
        this.f209029s = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f209024n = f;
        this.f209029s = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public final void m222982t(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f209018h;
        float f = i;
        float f2 = i3 + (activeRange[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.f209013c);
        }
        int i4 = this.f209018h;
        float f4 = i4 + (activeRange[0] * f);
        if (f4 > i4) {
            float f5 = i4;
            float f6 = i2;
            canvas.drawLine(f5, f6, f4, f6, this.f209013c);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m222983u(@NonNull Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f209025o.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.f209018h + (m222944K(it.next().floatValue()) * i), i2, this.f208996C, this.f209015e);
            }
        }
        for (int i3 = 0; i3 < this.f209025o.size(); i3++) {
            boolean z = this.f209010Q;
            ArrayList<Float> arrayList = this.f209025o;
            if (z) {
                Float f = arrayList.get(i3);
                canvas.save();
                int iM222944K = (int) (m222944K(f.floatValue()) * i);
                int i4 = this.f208996C;
                float f2 = i4 * 4;
                float f3 = i4 * 4;
                this.f209000G.reset();
                if (i3 == this.f209026p) {
                    canvas.translate(iM222944K + (f3 * 0.2f * this.f209001H), f2 * 0.25f);
                } else {
                    canvas.translate(iM222944K + (f3 * 0.2f), f2 * 0.25f);
                }
            } else {
                Float f4 = arrayList.get(i3);
                canvas.save();
                int iM222944K2 = this.f209018h + ((int) (m222944K(f4.floatValue()) * i));
                float f5 = this.f208996C * 4;
                float f6 = 0.75f * f5;
                float width = this.f208999F.getWidth();
                float height = this.f208999F.getHeight();
                this.f209000G.reset();
                if (i3 == this.f209026p) {
                    float f7 = this.f209001H;
                    canvas.translate(iM222944K2 - ((f6 * 0.5f) * f7), (((int) (this.f209017g * 0.8f)) * f7) - ((0.5f * f5) * (f7 - 1.0f)));
                    Matrix matrix = this.f209000G;
                    float f8 = (f6 * 1.0f) / width;
                    float f9 = this.f209001H;
                    matrix.setScale(f8 * f9, ((f5 * 1.0f) / height) * f9);
                } else {
                    canvas.translate(iM222944K2 - (0.5f * f6), (int) (this.f209017g * 0.8f));
                    this.f209000G.setScale((f6 * 1.0f) / width, (f5 * 1.0f) / height);
                }
            }
            canvas.drawBitmap(this.f208999F, this.f209000G, this.f209015e);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m222984v() {
        if (!this.f208998E) {
            this.f208998E = true;
            m222969h(true);
        }
        Iterator<wjf0> it = this.f209034x.iterator();
        for (int i = 0; i < this.f209025o.size() && it.hasNext(); i++) {
            if (i != this.f209027q) {
                m222952S(it.next(), this.f209025o.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            m222952S(it.next(), this.f209025o.get(this.f209027q).floatValue());
        } else {
            yek0.m214351a("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f209034x.size()), Integer.valueOf(this.f209025o.size())});
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m222985w() {
        if (this.f208998E) {
            this.f208998E = false;
            for (wjf0 wjf0Var : this.f209034x) {
                wjf0Var.m203443i(1.0f);
                eel0.m115984b(this).mo202666a(wjf0Var);
            }
            m222969h(false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m222986x(int i) {
        if (i == 1) {
            m222942I(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        if (i == 2) {
            m222942I(Integer.MIN_VALUE);
        } else if (i == 17) {
            m222943J(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            if (i != 66) {
                return;
            }
            m222943J(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m222987y(float f) {
        if (mo222934A()) {
            return this.f209006M.mo55415a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    /* JADX INFO: renamed from: z */
    public final float m222988z(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.f209005L == 0) {
            minSeparation = m222978p(minSeparation);
        }
        if (m222938E()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return kex.m145806a(f, i3 < 0 ? this.f209023m : this.f209025o.get(i3).floatValue() + minSeparation, i2 >= this.f209025o.size() ? this.f209024n : this.f209025o.get(i2).floatValue() - minSeparation);
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
