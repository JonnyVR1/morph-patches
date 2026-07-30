package p028v;

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
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.b9c0;
import l.gbl0;
import l.gc;
import l.ig3;
import l.kex;
import l.kig;
import l.t0c0;
import l.t100;
import l.u1c0;
import l.u2c0;
import l.wnf;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p003l.dqi0;
import p003l.dud;
import p003l.eel0;
import p003l.iqk0;
import p003l.p940;
import p003l.wg50;
import p003l.wjf0;
import p003l.xek0;
import p003l.ycl0;
import p003l.yek0;
import p028v.VBaseSlider;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
abstract class VBaseSlider<S extends VBaseSlider<S, L, T>, L extends wg50<S>, T extends xek0<S>> extends View {

    /* JADX INFO: renamed from: R */
    public static final TimeInterpolator f12617R = new kig();

    /* JADX INFO: renamed from: S */
    public static final TimeInterpolator f12618S = new OvershootInterpolator(5.0f);

    /* JADX INFO: renamed from: A */
    public int f12619A;

    /* JADX INFO: renamed from: B */
    public int f12620B;

    /* JADX INFO: renamed from: C */
    public int f12621C;

    /* JADX INFO: renamed from: D */
    public int f12622D;

    /* JADX INFO: renamed from: E */
    public boolean f12623E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public Bitmap f12624F;

    /* JADX INFO: renamed from: G */
    public final Matrix f12625G;

    /* JADX INFO: renamed from: H */
    public float f12626H;

    /* JADX INFO: renamed from: I */
    public ValueAnimator f12627I;

    /* JADX INFO: renamed from: J */
    public final int f12628J;

    /* JADX INFO: renamed from: K */
    public float f12629K;

    /* JADX INFO: renamed from: L */
    public int f12630L;

    /* JADX INFO: renamed from: M */
    public iqk0 f12631M;

    /* JADX INFO: renamed from: N */
    public boolean f12632N;

    /* JADX INFO: renamed from: O */
    public float f12633O;

    /* JADX INFO: renamed from: P */
    public MotionEvent f12634P;

    /* JADX INFO: renamed from: Q */
    public boolean f12635Q;

    /* JADX INFO: renamed from: a */
    public final int f12636a;

    /* JADX INFO: renamed from: b */
    public final int f12637b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Paint f12638c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Paint f12639d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Paint f12640e;

    /* JADX INFO: renamed from: f */
    public int f12641f;

    /* JADX INFO: renamed from: g */
    public int f12642g;

    /* JADX INFO: renamed from: h */
    public int f12643h;

    /* JADX INFO: renamed from: i */
    public int f12644i;

    /* JADX INFO: renamed from: j */
    public int f12645j;

    /* JADX INFO: renamed from: k */
    public int f12646k;

    /* JADX INFO: renamed from: l */
    public int f12647l;

    /* JADX INFO: renamed from: m */
    public float f12648m;

    /* JADX INFO: renamed from: n */
    public float f12649n;

    /* JADX INFO: renamed from: o */
    public ArrayList<Float> f12650o;

    /* JADX INFO: renamed from: p */
    public int f12651p;

    /* JADX INFO: renamed from: q */
    public int f12652q;

    /* JADX INFO: renamed from: r */
    public float f12653r;

    /* JADX INFO: renamed from: s */
    public boolean f12654s;

    /* JADX INFO: renamed from: t */
    public boolean f12655t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final C1328b f12656u;

    /* JADX INFO: renamed from: v */
    public final AccessibilityManager f12657v;

    /* JADX INFO: renamed from: w */
    public VBaseSlider<S, L, T>.RunnableC1327a f12658w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final List<wjf0> f12659x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final List<L> f12660y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final List<T> f12661z;

    /* JADX INFO: renamed from: v.VBaseSlider$a */
    public class RunnableC1327a implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f12662a;

        public RunnableC1327a() {
            this.f12662a = -1;
        }

        /* JADX INFO: renamed from: a */
        public void m11462a(int i) {
            this.f12662a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VBaseSlider.this.f12656u.sendEventForVirtualView(this.f12662a, 4);
        }
    }

    /* JADX INFO: renamed from: v.VBaseSlider$b */
    public static class C1328b extends wnf {

        /* JADX INFO: renamed from: a */
        public final VBaseSlider<?, ?, ?> f12664a;

        /* JADX INFO: renamed from: b */
        public Rect f12665b;

        public C1328b(VBaseSlider<?, ?, ?> vBaseSlider) {
            super(vBaseSlider);
            this.f12665b = new Rect();
            this.f12664a = vBaseSlider;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final String m11463a(int i) {
            if (i == this.f12664a.getValues().size() - 1) {
                return "Range end,";
            }
            return i == 0 ? "Range start," : "";
        }

        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f12664a.getValues().size(); i++) {
                this.f12664a.m11430X(i, this.f12665b);
                if (this.f12665b.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.f12664a.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f12664a.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f12664a.m11428V(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f12664a.postInvalidate();
                        invalidateVirtualView(i);
                        return true;
                    }
                }
                return false;
            }
            float fM11446k = this.f12664a.m11446k(20);
            if (i2 == 8192) {
                fM11446k = -fM11446k;
            }
            if (this.f12664a.m11411E()) {
                fM11446k = -fM11446k;
            }
            if (!this.f12664a.m11428V(i, kex.a(this.f12664a.getValues().get(i).floatValue() + fM11446k, this.f12664a.getValueFrom(), this.f12664a.getValueTo()))) {
                return false;
            }
            this.f12664a.postInvalidate();
            invalidateVirtualView(i);
            return true;
        }

        public void onPopulateNodeForVirtualView(int i, gc gcVar) {
            gcVar.b(gc.a.L);
            List<Float> values = this.f12664a.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = this.f12664a.getValueFrom();
            float valueTo = this.f12664a.getValueTo();
            if (this.f12664a.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    gcVar.a(8192);
                }
                if (fFloatValue < valueTo) {
                    gcVar.a(PKIFailureInfo.certConfirmed);
                }
            }
            gcVar.H0(gc.g.a(1, valueFrom, valueTo, fFloatValue));
            gcVar.o0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f12664a.getContentDescription() != null) {
                sb.append(this.f12664a.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(m11463a(i));
                sb.append(this.f12664a.m11460y(fFloatValue));
            }
            gcVar.s0(sb.toString());
            this.f12664a.m11430X(i, this.f12665b);
            gcVar.j0(this.f12665b);
        }
    }

    public VBaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12636a = getResources().getColor(t0c0.r);
        this.f12637b = getResources().getColor(t0c0.t);
        this.f12650o = new ArrayList<>();
        this.f12651p = -1;
        this.f12652q = -1;
        this.f12653r = 0.0f;
        this.f12655t = false;
        this.f12659x = new ArrayList();
        this.f12660y = new ArrayList();
        this.f12661z = new ArrayList();
        this.f12623E = false;
        this.f12625G = new Matrix();
        this.f12626H = 1.0f;
        this.f12630L = 0;
        this.f12632N = false;
        this.f12635Q = false;
        Paint paint = new Paint();
        this.f12638c = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f12639d = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f12640e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        m11413G(context.getResources());
        setFocusable(true);
        setClickable(true);
        this.f12624F = BitmapFactory.decodeResource(getResources(), u2c0.z);
        m11422P(context, attributeSet);
        this.f12628J = ViewConfiguration.get(context).getScaledTouchSlop();
        C1328b c1328b = new C1328b(this);
        this.f12656u = c1328b;
        gbl0.j0(this, c1328b);
        this.f12657v = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f12650o.size() == 1) {
            fFloatValue2 = this.f12648m;
        }
        float fM11417K = m11417K(fFloatValue2);
        float fM11417K2 = m11417K(fFloatValue);
        return m11411E() ? new float[]{fM11417K2, fM11417K} : new float[]{fM11417K, fM11417K2};
    }

    private float getValueOfTouchPosition() {
        double dM11427U = m11427U(this.f12629K);
        if (m11411E()) {
            dM11427U = 1.0d - dM11427U;
        }
        float f = this.f12649n;
        float f2 = this.f12648m;
        return (float) ((dM11427U * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f12629K;
        if (m11411E()) {
            f = 1.0f - f;
        }
        float f2 = this.f12649n;
        float f3 = this.f12648m;
        return (f * (f2 - f3)) + f3;
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            ig3.a("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.f12650o.size() == arrayList.size() && this.f12650o.equals(arrayList)) {
            return;
        }
        this.f12650o = arrayList;
        this.f12654s = true;
        this.f12652q = 0;
        m11448m();
        m11453r();
        postInvalidate();
    }

    /* JADX INFO: renamed from: A */
    public boolean mo11407A() {
        return this.f12631M != null;
    }

    /* JADX INFO: renamed from: B */
    public final void m11408B() {
        this.f12638c.setStrokeWidth(this.f12642g);
        this.f12639d.setStrokeWidth(this.f12642g);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m11409C() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m11410D(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f12653r)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m11411E() {
        return gbl0.x(this) == 1;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m11412F(ValueAnimator valueAnimator) {
        this.f12626H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
        Iterator<wjf0> it = this.f12659x.iterator();
        for (int i = 0; i < this.f12650o.size() && it.hasNext(); i++) {
            if (i != this.f12652q) {
                it.next().m8570i(1.0f);
            }
        }
        it.next().m8570i(this.f12626H);
    }

    /* JADX INFO: renamed from: G */
    public final void m11413G(@NonNull Resources resources) {
        this.f12641f = resources.getDimensionPixelSize(u1c0.e);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(u1c0.c);
        this.f12644i = dimensionPixelOffset;
        this.f12643h = dimensionPixelOffset;
        this.f12645j = resources.getDimensionPixelSize(u1c0.b);
        this.f12646k = resources.getDimensionPixelOffset(u1c0.d);
        this.f12647l = resources.getDimensionPixelSize(u1c0.a);
    }

    /* JADX INFO: renamed from: H */
    public final void m11414H() {
        this.f12643h = this.f12644i + Math.max(this.f12621C - this.f12645j, 0);
        if (gbl0.P(this)) {
            m11431Y(getWidth());
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m11415I(int i) {
        int i2 = this.f12652q;
        int iC = (int) kex.c(((long) i2) + ((long) i), 0L, this.f12650o.size() - 1);
        this.f12652q = iC;
        if (iC == i2) {
            return false;
        }
        if (this.f12651p != -1) {
            this.f12651p = iC;
        }
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m11416J(int i) {
        if (m11411E()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return m11415I(i);
    }

    /* JADX INFO: renamed from: K */
    public final float m11417K(float f) {
        float f2 = this.f12648m;
        float f3 = (f - f2) / (this.f12649n - f2);
        return m11411E() ? 1.0f - f3 : f3;
    }

    /* JADX INFO: renamed from: L */
    public final Boolean m11418L(int i, @NonNull KeyEvent keyEvent) {
        if (i == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(m11415I(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(m11415I(-1)) : Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    m11415I(-1);
                    return Boolean.TRUE;
                }
                if (i != 70) {
                    switch (i) {
                        case 21:
                            m11416J(-1);
                            return Boolean.TRUE;
                        case 22:
                            m11416J(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            m11415I(1);
            return Boolean.TRUE;
        }
        this.f12651p = this.f12652q;
        postInvalidate();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: M */
    public final void m11419M() {
        Iterator<T> it = this.f12661z.iterator();
        while (it.hasNext()) {
            it.next().m8699a(this);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m11420N() {
        Iterator<T> it = this.f12661z.iterator();
        while (it.hasNext()) {
            it.next().m8700b(this);
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean mo11421O() {
        if (this.f12651p != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fM11441g0 = m11441g0(valueOfTouchPositionAbsolute);
        this.f12651p = 0;
        float fAbs = Math.abs(this.f12650o.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f12650o.size(); i++) {
            float fAbs2 = Math.abs(this.f12650o.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float fM11441g1 = m11441g0(this.f12650o.get(i).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z = !m11411E() ? fM11441g1 - fM11441g0 >= 0.0f : fM11441g1 - fM11441g0 <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f12651p = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fM11441g1 - fM11441g0) < this.f12628J) {
                        this.f12651p = -1;
                        return false;
                    }
                    if (z) {
                        this.f12651p = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f12651p != -1;
    }

    /* JADX INFO: renamed from: P */
    public final void m11422P(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.X2);
        this.f12619A = typedArrayObtainStyledAttributes.getColor(b9c0.g3, this.f12636a);
        this.f12620B = typedArrayObtainStyledAttributes.getColor(b9c0.f3, this.f12637b);
        this.f12648m = typedArrayObtainStyledAttributes.getFloat(b9c0.a3, 0.0f);
        this.f12649n = typedArrayObtainStyledAttributes.getFloat(b9c0.b3, 1.0f);
        setValues(Float.valueOf(this.f12648m));
        this.f12653r = typedArrayObtainStyledAttributes.getFloat(b9c0.Z2, 0.0f);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.e3, 0));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.h3, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(b9c0.Y2, true)) {
            setEnabled(false);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.c3, -1);
        if (resourceId > 0) {
            this.f12624F = BitmapFactory.decodeResource(getResources(), resourceId);
        }
        this.f12635Q = typedArrayObtainStyledAttributes.getBoolean(b9c0.d3, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: Q */
    public void mo11423Q(@NonNull T t) {
        this.f12661z.remove(t);
    }

    /* JADX INFO: renamed from: R */
    public final void m11424R(int i) {
        VBaseSlider<S, L, T>.RunnableC1327a runnableC1327a = this.f12658w;
        if (runnableC1327a == null) {
            this.f12658w = new RunnableC1327a();
        } else {
            removeCallbacks(runnableC1327a);
        }
        this.f12658w.m11462a(i);
        postDelayed(this.f12658w, 200L);
    }

    /* JADX INFO: renamed from: S */
    public final void m11425S(wjf0 wjf0Var, float f) {
        wjf0Var.m8571j(m11460y(f));
        if (this.f12635Q) {
            int iM11417K = ((int) ((m11417K(f) * this.f12622D) + (this.f12621C * 2))) - (wjf0Var.getIntrinsicWidth() / 2);
            int iD = t100.d(2.0f);
            wjf0Var.setBounds(iM11417K, iD, wjf0Var.getIntrinsicWidth() + iM11417K, iD);
        } else {
            int iM11417K2 = (this.f12643h + ((int) (m11417K(f) * this.f12622D))) - (wjf0Var.getIntrinsicWidth() / 2);
            int i = this.f12646k - (this.f12647l + this.f12621C);
            wjf0Var.setBounds(iM11417K2 - this.f12645j, i - wjf0Var.getIntrinsicHeight(), iM11417K2 + wjf0Var.getIntrinsicWidth() + this.f12645j, i);
        }
        Rect rect = new Rect(wjf0Var.getBounds());
        dud.m3738b(eel0.m3820a(this), this, rect);
        wjf0Var.setBounds(rect);
        eel0.m3821b(this).mo8547b(wjf0Var);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m11426T(float f) {
        return m11428V(this.f12651p, f);
    }

    /* JADX INFO: renamed from: U */
    public final double m11427U(float f) {
        float f2 = this.f12653r;
        if (f2 <= 0.0f) {
            return f;
        }
        int i = (int) ((this.f12649n - this.f12648m) / f2);
        return ((double) Math.round(f * i)) / ((double) i);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m11428V(int i, float f) {
        this.f12652q = i;
        if (Math.abs(f - this.f12650o.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f12650o.set(i, Float.valueOf(m11461z(i, f)));
        m11452q(i);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m11429W() {
        return m11426T(getValueOfTouchPosition());
    }

    /* JADX INFO: renamed from: X */
    public void m11430X(int i, Rect rect) {
        int iM11417K = this.f12643h + ((int) (m11417K(getValues().get(i).floatValue()) * this.f12622D));
        int i2 = this.f12646k;
        int i3 = this.f12621C;
        rect.set(iM11417K - i3, i2 - i3, iM11417K + i3, i2 + i3);
    }

    /* JADX INFO: renamed from: Y */
    public final void m11431Y(int i) {
        this.f12622D = Math.max(i - (this.f12643h * 2), 0);
    }

    /* JADX INFO: renamed from: Z */
    public final void m11432Z() {
        if (this.f12654s) {
            m11435c0();
            m11436d0();
            m11434b0();
            m11437e0();
            m11433a0();
            m11443h0();
            this.f12654s = false;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11433a0() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            yek0.m9187a("minSeparation(%s) must be greater or equal to 0", new Object[]{Float.valueOf(minSeparation)});
            return;
        }
        float f = this.f12653r;
        if (f <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f12630L != 1) {
            yek0.m9187a("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f12653r)});
        } else if (minSeparation < f || !m11410D(minSeparation)) {
            yek0.m9187a("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f12653r), Float.valueOf(this.f12653r)});
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11434b0() {
        if (this.f12653r <= 0.0f || m11439f0(this.f12649n)) {
            return;
        }
        yek0.m9187a("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(this.f12653r), Float.valueOf(this.f12648m), Float.valueOf(this.f12649n)});
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11435c0() {
        float f = this.f12648m;
        if (f < this.f12649n) {
            return;
        }
        yek0.m9187a("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.valueOf(f), Float.valueOf(this.f12649n)});
    }

    /* JADX INFO: renamed from: d0 */
    public final void m11436d0() {
        float f = this.f12649n;
        if (f > this.f12648m) {
            return;
        }
        yek0.m9187a("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.valueOf(f), Float.valueOf(this.f12648m)});
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f12656u.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12638c.setColor(this.f12619A);
        this.f12639d.setColor(this.f12620B);
        for (wjf0 wjf0Var : this.f12659x) {
            if (wjf0Var.isStateful()) {
                wjf0Var.setState(getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11437e0() {
        for (Float f : this.f12650o) {
            if (f.floatValue() < this.f12648m || f.floatValue() > this.f12649n) {
                yek0.m9187a("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{f, Float.valueOf(this.f12648m), Float.valueOf(this.f12649n)});
                return;
            } else if (this.f12653r > 0.0f && !m11439f0(f.floatValue())) {
                yek0.m9187a("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{f, Float.valueOf(this.f12648m), Float.valueOf(this.f12653r), Float.valueOf(this.f12653r)});
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo11438f(@Nullable L l2) {
        this.f12660y.add(l2);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m11439f0(float f) {
        return m11410D(f - this.f12648m);
    }

    /* JADX INFO: renamed from: g */
    public void mo11440g(@NonNull T t) {
        this.f12661z.add(t);
    }

    /* JADX INFO: renamed from: g0 */
    public final float m11441g0(float f) {
        return (m11417K(f) * this.f12622D) + this.f12643h;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f12656u.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f12651p;
    }

    public int getFocusedThumbIndex() {
        return this.f12652q;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f12653r;
    }

    @Dimension
    public int getThumbRadius() {
        return this.f12621C;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f12642g;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f12643h;
    }

    @Dimension
    public int getTrackWidth() {
        return this.f12622D;
    }

    public float getValueFrom() {
        return this.f12648m;
    }

    public float getValueTo() {
        return this.f12649n;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f12650o);
    }

    /* JADX INFO: renamed from: h */
    public final void m11442h(boolean z) {
        m11447l();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 1.0f : 1.1f, z ? 1.1f : 1.0f);
        this.f12627I = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f12627I.setInterpolator(z ? f12618S : f12617R);
        this.f12627I.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13143a.m11412F(valueAnimator);
            }
        });
        this.f12627I.start();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11443h0() {
        float f = this.f12653r;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f));
        }
        float f2 = this.f12648m;
        if (((int) f2) != f2) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2));
        }
        float f3 = this.f12649n;
        if (((int) f3) != f3) {
            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3));
        }
    }

    /* JADX INFO: renamed from: i */
    public final Float m11444i(int i) {
        float fM11446k = this.f12655t ? m11446k(20) : m11445j();
        if (i == 21) {
            if (!m11411E()) {
                fM11446k = -fM11446k;
            }
            return Float.valueOf(fM11446k);
        }
        if (i == 22) {
            if (m11411E()) {
                fM11446k = -fM11446k;
            }
            return Float.valueOf(fM11446k);
        }
        if (i == 69) {
            return Float.valueOf(-fM11446k);
        }
        if (i == 70 || i == 81) {
            return Float.valueOf(fM11446k);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final float m11445j() {
        float f = this.f12653r;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: k */
    public final float m11446k(int i) {
        float fM11445j = m11445j();
        float f = (this.f12649n - this.f12648m) / fM11445j;
        float f2 = i;
        return f <= f2 ? fM11445j : Math.round(f / f2) * fM11445j;
    }

    /* JADX INFO: renamed from: l */
    public final void m11447l() {
        ValueAnimator valueAnimator = this.f12627I;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f12627I.cancel();
        this.f12627I = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m11448m() {
        if (this.f12659x.size() > this.f12650o.size()) {
            List<wjf0> listSubList = this.f12659x.subList(this.f12650o.size(), this.f12659x.size());
            for (wjf0 wjf0Var : listSubList) {
                if (gbl0.O(this)) {
                    m11450o(wjf0Var);
                }
            }
            listSubList.clear();
        }
        while (this.f12659x.size() < this.f12650o.size()) {
            this.f12659x.add(mo11449n());
        }
    }

    /* JADX INFO: renamed from: n */
    public wjf0 mo11449n() {
        if (this.f12635Q) {
            p940 p940Var = new p940(getContext());
            p940Var.m8569h(this.f12620B);
            return p940Var;
        }
        wjf0 wjf0Var = new wjf0(getContext());
        wjf0Var.m8569h(this.f12620B);
        return wjf0Var;
    }

    /* JADX INFO: renamed from: o */
    public final void m11450o(wjf0 wjf0Var) {
        ycl0 ycl0VarM3821b = eel0.m3821b(this);
        if (ycl0VarM3821b != null) {
            ycl0VarM3821b.mo8546a(wjf0Var);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        VBaseSlider<S, L, T>.RunnableC1327a runnableC1327a = this.f12658w;
        if (runnableC1327a != null) {
            removeCallbacks(runnableC1327a);
        }
        this.f12623E = false;
        Iterator<wjf0> it = this.f12659x.iterator();
        while (it.hasNext()) {
            m11450o(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f12654s) {
            m11432Z();
        }
        super.onDraw(canvas);
        int i = this.f12646k;
        m11455t(canvas, this.f12622D, i);
        if (((Float) Collections.max(getValues())).floatValue() > this.f12648m) {
            m11454s(canvas, this.f12622D, i);
        }
        if ((this.f12632N || isFocused()) && isEnabled() && this.f12651p != -1) {
            m11457v();
        }
        m11456u(canvas, this.f12622D, i);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            m11459x(i);
            this.f12656u.requestKeyboardFocusForVirtualView(this.f12652q);
        } else {
            this.f12651p = -1;
            m11458w();
            this.f12656u.clearKeyboardFocusForVirtualView(this.f12652q);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f12650o.size() == 1) {
            this.f12651p = 0;
        }
        if (this.f12651p == -1) {
            Boolean boolM11418L = m11418L(i, keyEvent);
            return boolM11418L != null ? boolM11418L.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.f12655t |= keyEvent.isLongPress();
        Float fM11444i = m11444i(i);
        if (fM11444i != null) {
            if (m11426T(this.f12650o.get(this.f12651p).floatValue() + fM11444i.floatValue())) {
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m11415I(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m11415I(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f12651p = -1;
        m11458w();
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f12655t = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f12641f, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m11431Y(i);
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
        float f = (x - this.f12643h) / this.f12622D;
        this.f12629K = f;
        float fMax = Math.max(0.0f, f);
        this.f12629K = fMax;
        this.f12629K = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12633O = x;
            if (!m11409C()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo11421O()) {
                    requestFocus();
                    this.f12632N = true;
                    m11429W();
                    invalidate();
                    m11419M();
                }
            }
        } else if (actionMasked == 1) {
            this.f12632N = false;
            motionEvent2 = this.f12634P;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f12634P.getX() - motionEvent.getX()) <= this.f12628J && Math.abs(this.f12634P.getY() - motionEvent.getY()) <= this.f12628J && mo11421O()) {
                m11419M();
            }
            if (this.f12651p != -1) {
                m11429W();
                this.f12651p = -1;
                m11420N();
            }
            m11458w();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f12632N) {
                if (m11409C() && Math.abs(x - this.f12633O) < this.f12628J) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m11419M();
            }
            if (mo11421O()) {
                this.f12632N = true;
                m11429W();
                invalidate();
            }
        } else if (actionMasked == 3) {
            this.f12632N = false;
            motionEvent2 = this.f12634P;
            if (motionEvent2 != null) {
                m11419M();
            }
            if (this.f12651p != -1) {
                m11429W();
                this.f12651p = -1;
                m11420N();
            }
            m11458w();
            invalidate();
        }
        setPressed(this.f12632N);
        this.f12634P = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final float m11451p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.f12643h) / this.f12622D;
        float f3 = this.f12648m;
        return (f2 * (f3 - this.f12649n)) + f3;
    }

    /* JADX INFO: renamed from: q */
    public final void m11452q(int i) {
        for (L l2 : this.f12660y) {
            l2.mo8558a(this, true, this.f12650o.get(i).floatValue());
            if (this.f12650o.size() >= 2) {
                float fFloatValue = this.f12650o.get(0).floatValue();
                ArrayList<Float> arrayList = this.f12650o;
                l2.mo8559b(this, false, fFloatValue, arrayList.get(arrayList.size() - 1).floatValue());
            }
        }
        AccessibilityManager accessibilityManager = this.f12657v;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        m11424R(i);
    }

    /* JADX INFO: renamed from: r */
    public final void m11453r() {
        for (L l2 : this.f12660y) {
            Iterator<Float> it = this.f12650o.iterator();
            while (it.hasNext()) {
                l2.mo8558a(this, false, it.next().floatValue());
            }
            if (this.f12650o.size() >= 2) {
                float fFloatValue = this.f12650o.get(0).floatValue();
                ArrayList<Float> arrayList = this.f12650o;
                l2.mo8559b(this, false, fFloatValue, arrayList.get(arrayList.size() - 1).floatValue());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m11454s(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f12643h;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (activeRange[0] * f), f2, i3 + (activeRange[1] * f), f2, this.f12639d);
    }

    public void setActiveThumbIndex(int i) {
        this.f12651p = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f12650o.size()) {
            ig3.a("index out of range");
            return;
        }
        this.f12652q = i;
        this.f12656u.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setLabelFormatter(@Nullable iqk0 iqk0Var) {
        this.f12631M = iqk0Var;
    }

    public void setSeparationUnit(int i) {
        this.f12630L = i;
        this.f12654s = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            dqi0.m3632a("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(f), Float.valueOf(this.f12648m), Float.valueOf(this.f12649n)});
        } else if (this.f12653r != f) {
            this.f12653r = f;
            this.f12654s = true;
            postInvalidate();
        }
    }

    public void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        if (i == this.f12621C) {
            return;
        }
        this.f12621C = i;
        m11414H();
        postInvalidate();
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        if (this.f12642g != i) {
            this.f12642g = i;
            m11408B();
            postInvalidate();
        }
    }

    public void setValueFrom(float f) {
        this.f12648m = f;
        this.f12654s = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f12649n = f;
        this.f12654s = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public final void m11455t(@NonNull Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f12643h;
        float f = i;
        float f2 = i3 + (activeRange[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.f12638c);
        }
        int i4 = this.f12643h;
        float f4 = i4 + (activeRange[0] * f);
        if (f4 > i4) {
            float f5 = i4;
            float f6 = i2;
            canvas.drawLine(f5, f6, f4, f6, this.f12638c);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11456u(@NonNull Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f12650o.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.f12643h + (m11417K(it.next().floatValue()) * i), i2, this.f12621C, this.f12640e);
            }
        }
        for (int i3 = 0; i3 < this.f12650o.size(); i3++) {
            boolean z = this.f12635Q;
            ArrayList<Float> arrayList = this.f12650o;
            if (z) {
                Float f = arrayList.get(i3);
                canvas.save();
                int iM11417K = (int) (m11417K(f.floatValue()) * i);
                int i4 = this.f12621C;
                float f2 = i4 * 4;
                float f3 = i4 * 4;
                this.f12625G.reset();
                if (i3 == this.f12651p) {
                    canvas.translate(iM11417K + (f3 * 0.2f * this.f12626H), f2 * 0.25f);
                } else {
                    canvas.translate(iM11417K + (f3 * 0.2f), f2 * 0.25f);
                }
            } else {
                Float f4 = arrayList.get(i3);
                canvas.save();
                int iM11417K2 = this.f12643h + ((int) (m11417K(f4.floatValue()) * i));
                float f5 = this.f12621C * 4;
                float f6 = 0.75f * f5;
                float width = this.f12624F.getWidth();
                float height = this.f12624F.getHeight();
                this.f12625G.reset();
                if (i3 == this.f12651p) {
                    float f7 = this.f12626H;
                    canvas.translate(iM11417K2 - ((f6 * 0.5f) * f7), (((int) (this.f12642g * 0.8f)) * f7) - ((0.5f * f5) * (f7 - 1.0f)));
                    Matrix matrix = this.f12625G;
                    float f8 = (f6 * 1.0f) / width;
                    float f9 = this.f12626H;
                    matrix.setScale(f8 * f9, ((f5 * 1.0f) / height) * f9);
                } else {
                    canvas.translate(iM11417K2 - (0.5f * f6), (int) (this.f12642g * 0.8f));
                    this.f12625G.setScale((f6 * 1.0f) / width, (f5 * 1.0f) / height);
                }
            }
            canvas.drawBitmap(this.f12624F, this.f12625G, this.f12640e);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m11457v() {
        if (!this.f12623E) {
            this.f12623E = true;
            m11442h(true);
        }
        Iterator<wjf0> it = this.f12659x.iterator();
        for (int i = 0; i < this.f12650o.size() && it.hasNext(); i++) {
            if (i != this.f12652q) {
                m11425S(it.next(), this.f12650o.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            m11425S(it.next(), this.f12650o.get(this.f12652q).floatValue());
        } else {
            yek0.m9187a("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f12659x.size()), Integer.valueOf(this.f12650o.size())});
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11458w() {
        if (this.f12623E) {
            this.f12623E = false;
            for (wjf0 wjf0Var : this.f12659x) {
                wjf0Var.m8570i(1.0f);
                eel0.m3821b(this).mo8546a(wjf0Var);
            }
            m11442h(false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11459x(int i) {
        if (i == 1) {
            m11415I(Integer.MAX_VALUE);
            return;
        }
        if (i == 2) {
            m11415I(PKIFailureInfo.systemUnavail);
        } else if (i == 17) {
            m11416J(Integer.MAX_VALUE);
        } else {
            if (i != 66) {
                return;
            }
            m11416J(PKIFailureInfo.systemUnavail);
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m11460y(float f) {
        if (mo11407A()) {
            return this.f12631M.m5227a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    /* JADX INFO: renamed from: z */
    public final float m11461z(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.f12630L == 0) {
            minSeparation = m11451p(minSeparation);
        }
        if (m11411E()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return kex.a(f, i3 < 0 ? this.f12648m : this.f12650o.get(i3).floatValue() + minSeparation, i2 >= this.f12650o.size() ? this.f12649n : this.f12650o.get(i2).floatValue() - minSeparation);
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
