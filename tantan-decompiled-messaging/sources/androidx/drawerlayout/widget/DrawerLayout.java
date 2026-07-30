package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.customview.view.AbsSavedState;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import java.util.ArrayList;
import java.util.List;
import p149l.C17055gc;
import p149l.C17974kb;
import p149l.e16;
import p149l.gbl0;
import p149l.ig3;
import p149l.kbe;
import p149l.kg3;
import p149l.qtc0;
import p149l.r2j;
import p149l.u6k;
import p149l.ubl0;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: L */
    public static final int[] f1766L = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: M */
    public static final int[] f1767M = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: N */
    public static final boolean f1768N = true;

    /* JADX INFO: renamed from: O */
    public static final boolean f1769O = true;

    /* JADX INFO: renamed from: A */
    public CharSequence f1770A;

    /* JADX INFO: renamed from: B */
    public CharSequence f1771B;

    /* JADX INFO: renamed from: C */
    public Object f1772C;

    /* JADX INFO: renamed from: D */
    public boolean f1773D;

    /* JADX INFO: renamed from: E */
    public Drawable f1774E;

    /* JADX INFO: renamed from: F */
    public Drawable f1775F;

    /* JADX INFO: renamed from: G */
    public Drawable f1776G;

    /* JADX INFO: renamed from: H */
    public Drawable f1777H;

    /* JADX INFO: renamed from: I */
    public final ArrayList<View> f1778I;

    /* JADX INFO: renamed from: J */
    public Rect f1779J;

    /* JADX INFO: renamed from: K */
    public Matrix f1780K;

    /* JADX INFO: renamed from: a */
    public final C0361c f1781a;

    /* JADX INFO: renamed from: b */
    public float f1782b;

    /* JADX INFO: renamed from: c */
    public int f1783c;

    /* JADX INFO: renamed from: d */
    public int f1784d;

    /* JADX INFO: renamed from: e */
    public float f1785e;

    /* JADX INFO: renamed from: f */
    public Paint f1786f;

    /* JADX INFO: renamed from: g */
    public final ubl0 f1787g;

    /* JADX INFO: renamed from: h */
    public final ubl0 f1788h;

    /* JADX INFO: renamed from: i */
    public final C0364f f1789i;

    /* JADX INFO: renamed from: j */
    public final C0364f f1790j;

    /* JADX INFO: renamed from: k */
    public int f1791k;

    /* JADX INFO: renamed from: l */
    public boolean f1792l;

    /* JADX INFO: renamed from: m */
    public boolean f1793m;

    /* JADX INFO: renamed from: n */
    public int f1794n;

    /* JADX INFO: renamed from: o */
    public int f1795o;

    /* JADX INFO: renamed from: p */
    public int f1796p;

    /* JADX INFO: renamed from: q */
    public int f1797q;

    /* JADX INFO: renamed from: r */
    public boolean f1798r;

    /* JADX INFO: renamed from: s */
    public boolean f1799s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public InterfaceC0362d f1800t;

    /* JADX INFO: renamed from: u */
    public List<InterfaceC0362d> f1801u;

    /* JADX INFO: renamed from: v */
    public float f1802v;

    /* JADX INFO: renamed from: w */
    public float f1803w;

    /* JADX INFO: renamed from: x */
    public Drawable f1804x;

    /* JADX INFO: renamed from: y */
    public Drawable f1805y;

    /* JADX INFO: renamed from: z */
    public Drawable f1806z;

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class ViewOnApplyWindowInsetsListenerC0359a implements View.OnApplyWindowInsetsListener {
        public ViewOnApplyWindowInsetsListenerC0359a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).m2407Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C0360b extends C17974kb {

        /* JADX INFO: renamed from: a */
        public final Rect f1808a = new Rect();

        public C0360b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m2439a(C17055gc c17055gc, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2389A(childAt)) {
                    c17055gc.m125404c(childAt);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2440b(C17055gc c17055gc, C17055gc c17055gc2) {
            Rect rect = this.f1808a;
            c17055gc2.m125422m(rect);
            c17055gc.m125417j0(rect);
            c17055gc2.m125424n(rect);
            c17055gc.m125419k0(rect);
            c17055gc.m125392R0(c17055gc2.m125401Z());
            c17055gc.m125364D0(c17055gc2.m125447z());
            c17055gc.m125427o0(c17055gc2.m125430q());
            c17055gc.m125434s0(c17055gc2.m125435t());
            c17055gc.m125440v0(c17055gc2.m125385O());
            c17055gc.m125429p0(c17055gc2.m125381M());
            c17055gc.m125444x0(c17055gc2.m125387P());
            c17055gc.m125446y0(c17055gc2.m125389Q());
            c17055gc.m125414h0(c17055gc2.m125375J());
            c17055gc.m125380L0(c17055gc2.m125398W());
            c17055gc.m125360B0(c17055gc2.m125395T());
            c17055gc.m125402a(c17055gc2.m125418k());
        }

        @Override // p149l.C17974kb
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM2427p = DrawerLayout.this.m2427p();
            if (viewM2427p == null) {
                return true;
            }
            CharSequence charSequenceM2430s = DrawerLayout.this.m2430s(DrawerLayout.this.m2431t(viewM2427p));
            if (charSequenceM2430s == null) {
                return true;
            }
            text.add(charSequenceM2430s);
            return true;
        }

        @Override // p149l.C17974kb
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // p149l.C17974kb
        public void onInitializeAccessibilityNodeInfo(View view, C17055gc c17055gc) {
            if (DrawerLayout.f1768N) {
                super.onInitializeAccessibilityNodeInfo(view, c17055gc);
            } else {
                C17055gc c17055gcM125354c0 = C17055gc.m125354c0(c17055gc);
                super.onInitializeAccessibilityNodeInfo(view, c17055gcM125354c0);
                c17055gc.m125384N0(view);
                Object objM125151C = gbl0.m125151C(view);
                if (objM125151C instanceof View) {
                    c17055gc.m125368F0((View) objM125151C);
                }
                m2440b(c17055gc, c17055gcM125354c0);
                c17055gcM125354c0.m125408e0();
                m2439a(c17055gc, (ViewGroup) view);
            }
            c17055gc.m125427o0(DrawerLayout.class.getName());
            c17055gc.m125444x0(false);
            c17055gc.m125446y0(false);
            c17055gc.m125410f0(C17055gc.a.f101950e);
            c17055gc.m125410f0(C17055gc.a.f101951f);
        }

        @Override // p149l.C17974kb
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1768N || DrawerLayout.m2389A(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public static final class C0361c extends C17974kb {
        @Override // p149l.C17974kb
        public void onInitializeAccessibilityNodeInfo(View view, C17055gc c17055gc) {
            super.onInitializeAccessibilityNodeInfo(view, c17055gc);
            if (DrawerLayout.m2389A(view)) {
                return;
            }
            c17055gc.m125368F0(null);
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface InterfaceC0362d {
        /* JADX INFO: renamed from: a */
        void mo2441a(@NonNull View view);

        /* JADX INFO: renamed from: b */
        void mo2442b(@NonNull View view);

        /* JADX INFO: renamed from: c */
        void mo2443c(int i);

        /* JADX INFO: renamed from: d */
        void mo2444d(@NonNull View view, float f);
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public class C0364f extends ubl0.AbstractC20403c {

        /* JADX INFO: renamed from: a */
        public final int f1814a;

        /* JADX INFO: renamed from: b */
        public ubl0 f1815b;

        /* JADX INFO: renamed from: c */
        public final Runnable f1816c = new a();

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0364f.this.m2446b();
            }
        }

        public C0364f(int i) {
            this.f1814a = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m2445a() {
            View viewM2425n = DrawerLayout.this.m2425n(this.f1814a == 3 ? 5 : 3);
            if (viewM2425n != null) {
                DrawerLayout.this.m2417f(viewM2425n);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m2446b() {
            View viewM2425n;
            int width;
            int iM192876x = this.f1815b.m192876x();
            boolean z = this.f1814a == 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (z) {
                viewM2425n = drawerLayout.m2425n(3);
                width = (viewM2425n != null ? -viewM2425n.getWidth() : 0) + iM192876x;
            } else {
                viewM2425n = drawerLayout.m2425n(5);
                width = DrawerLayout.this.getWidth() - iM192876x;
            }
            if (viewM2425n != null) {
                if (((!z || viewM2425n.getLeft() >= width) && (z || viewM2425n.getLeft() <= width)) || DrawerLayout.this.m2429r(viewM2425n) != 0) {
                    return;
                }
                C0363e c0363e = (C0363e) viewM2425n.getLayoutParams();
                this.f1815b.m192853Q(viewM2425n, width, viewM2425n.getTop());
                c0363e.f1812c = true;
                DrawerLayout.this.invalidate();
                m2445a();
                DrawerLayout.this.m2413b();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m2447c() {
            DrawerLayout.this.removeCallbacks(this.f1816c);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (DrawerLayout.this.m2414c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        /* JADX INFO: renamed from: d */
        public void m2448d(ubl0 ubl0Var) {
            this.f1815b = ubl0Var;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.m2394D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onEdgeDragStarted(int i, int i2) {
            int i3 = i & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewM2425n = i3 == 1 ? drawerLayout.m2425n(3) : drawerLayout.m2425n(5);
            if (viewM2425n == null || DrawerLayout.this.m2429r(viewM2425n) != 0) {
                return;
            }
            this.f1815b.m192857c(viewM2425n, i2);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public boolean onEdgeLock(int i) {
            return false;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1816c, 160L);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewCaptured(View view, int i) {
            ((C0363e) view.getLayoutParams()).f1812c = false;
            m2445a();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewDragStateChanged(int i) {
            DrawerLayout.this.m2411U(this.f1814a, i, this.f1815b.m192875w());
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.m2414c(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.m2409S(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewReleased(View view, float f, float f2) {
            int i;
            float fM2432u = DrawerLayout.this.m2432u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m2414c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && fM2432u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fM2432u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1815b.m192851O(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public boolean tryCaptureView(View view, int i) {
            return DrawerLayout.this.m2394D(view) && DrawerLayout.this.m2414c(view, this.f1814a) && DrawerLayout.this.m2429r(view) == 0;
        }
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1781a = new C0361c();
        this.f1784d = -1728053248;
        this.f1786f = new Paint();
        this.f1793m = true;
        this.f1794n = 3;
        this.f1795o = 3;
        this.f1796p = 3;
        this.f1797q = 3;
        this.f1774E = null;
        this.f1775F = null;
        this.f1776G = null;
        this.f1777H = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1783c = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0364f c0364f = new C0364f(3);
        this.f1789i = c0364f;
        C0364f c0364f2 = new C0364f(5);
        this.f1790j = c0364f2;
        ubl0 ubl0VarM192835o = ubl0.m192835o(this, 1.0f, c0364f);
        this.f1787g = ubl0VarM192835o;
        ubl0VarM192835o.m192849M(1);
        ubl0VarM192835o.m192850N(f2);
        c0364f.m2448d(ubl0VarM192835o);
        ubl0 ubl0VarM192835o2 = ubl0.m192835o(this, 1.0f, c0364f2);
        this.f1788h = ubl0VarM192835o2;
        ubl0VarM192835o2.m192849M(2);
        ubl0VarM192835o2.m192850N(f2);
        c0364f2.m2448d(ubl0VarM192835o2);
        setFocusableInTouchMode(true);
        gbl0.m125221t0(this, 1);
        gbl0.m125201j0(this, new C0360b());
        setMotionEventSplittingEnabled(false);
        if (gbl0.m125222u(this)) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0359a());
            setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f1766L);
            try {
                this.f1804x = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f1782b = f * 10.0f;
        this.f1778I = new ArrayList<>();
    }

    /* JADX INFO: renamed from: A */
    public static boolean m2389A(View view) {
        return (gbl0.m125224v(view) == 4 || gbl0.m125224v(view) == 2) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public static String m2390w(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m2391x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* JADX INFO: renamed from: B */
    public boolean m2392B(View view) {
        return ((C0363e) view.getLayoutParams()).f1810a == 0;
    }

    /* JADX INFO: renamed from: C */
    public boolean m2393C(@NonNull View view) {
        if (m2394D(view)) {
            return (((C0363e) view.getLayoutParams()).f1813d & 1) == 1;
        }
        qtc0.m176411a("View ", view, " is not a drawer");
        return false;
    }

    /* JADX INFO: renamed from: D */
    public boolean m2394D(View view) {
        int iM191981b = u6k.m191981b(((C0363e) view.getLayoutParams()).f1810a, gbl0.m125228x(view));
        return ((iM191981b & 3) == 0 && (iM191981b & 5) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public boolean m2395E(@NonNull View view) {
        if (m2394D(view)) {
            return ((C0363e) view.getLayoutParams()).f1811b > 0.0f;
        }
        qtc0.m176411a("View ", view, " is not a drawer");
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m2396F(float f, float f2, View view) {
        if (this.f1779J == null) {
            this.f1779J = new Rect();
        }
        view.getHitRect(this.f1779J);
        return this.f1779J.contains((int) f, (int) f2);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m2397G(Drawable drawable, int i) {
        if (drawable == null || !kbe.m145274h(drawable)) {
            return false;
        }
        kbe.m145279m(drawable, i);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public void m2398H(View view, float f) {
        float fM2432u = m2432u(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (fM2432u * width));
        if (!m2414c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m2409S(view, f);
    }

    /* JADX INFO: renamed from: I */
    public void m2399I(int i) {
        m2400J(i, true);
    }

    /* JADX INFO: renamed from: J */
    public void m2400J(int i, boolean z) {
        View viewM2425n = m2425n(i);
        if (viewM2425n != null) {
            m2402L(viewM2425n, z);
        } else {
            kg3.m145878a("No drawer view found with gravity ", m2390w(i));
        }
    }

    /* JADX INFO: renamed from: K */
    public void m2401K(@NonNull View view) {
        m2402L(view, true);
    }

    /* JADX INFO: renamed from: L */
    public void m2402L(@NonNull View view, boolean z) {
        if (!m2394D(view)) {
            qtc0.m176411a("View ", view, " is not a sliding drawer");
            return;
        }
        C0363e c0363e = (C0363e) view.getLayoutParams();
        if (this.f1793m) {
            c0363e.f1811b = 1.0f;
            c0363e.f1813d = 1;
            m2410T(view, true);
        } else if (z) {
            c0363e.f1813d |= 2;
            if (m2414c(view, 3)) {
                this.f1787g.m192853Q(view, 0, view.getTop());
            } else {
                this.f1788h.m192853Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m2398H(view, 1.0f);
            m2411U(c0363e.f1810a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: M */
    public void m2403M(@NonNull InterfaceC0362d interfaceC0362d) {
        List<InterfaceC0362d> list;
        if (interfaceC0362d == null || (list = this.f1801u) == null) {
            return;
        }
        list.remove(interfaceC0362d);
    }

    /* JADX INFO: renamed from: N */
    public final Drawable m2404N() {
        int iM125228x = gbl0.m125228x(this);
        if (iM125228x == 0) {
            Drawable drawable = this.f1774E;
            if (drawable != null) {
                m2397G(drawable, iM125228x);
                return this.f1774E;
            }
        } else {
            Drawable drawable2 = this.f1775F;
            if (drawable2 != null) {
                m2397G(drawable2, iM125228x);
                return this.f1775F;
            }
        }
        return this.f1776G;
    }

    /* JADX INFO: renamed from: O */
    public final Drawable m2405O() {
        int iM125228x = gbl0.m125228x(this);
        if (iM125228x == 0) {
            Drawable drawable = this.f1775F;
            if (drawable != null) {
                m2397G(drawable, iM125228x);
                return this.f1775F;
            }
        } else {
            Drawable drawable2 = this.f1774E;
            if (drawable2 != null) {
                m2397G(drawable2, iM125228x);
                return this.f1774E;
            }
        }
        return this.f1777H;
    }

    /* JADX INFO: renamed from: P */
    public final void m2406P() {
        if (f1769O) {
            return;
        }
        this.f1805y = m2404N();
        this.f1806z = m2405O();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: Q */
    public void m2407Q(Object obj, boolean z) {
        this.f1772C = obj;
        this.f1773D = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: R */
    public void m2408R(int i, int i2) {
        View viewM2425n;
        int iM191981b = u6k.m191981b(i2, gbl0.m125228x(this));
        if (i2 == 3) {
            this.f1794n = i;
        } else if (i2 == 5) {
            this.f1795o = i;
        } else if (i2 == 8388611) {
            this.f1796p = i;
        } else if (i2 == 8388613) {
            this.f1797q = i;
        }
        if (i != 0) {
            (iM191981b == 3 ? this.f1787g : this.f1788h).m192856b();
        }
        if (i != 1) {
            if (i == 2 && (viewM2425n = m2425n(iM191981b)) != null) {
                m2401K(viewM2425n);
                return;
            }
            return;
        }
        View viewM2425n2 = m2425n(iM191981b);
        if (viewM2425n2 != null) {
            m2417f(viewM2425n2);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m2409S(View view, float f) {
        C0363e c0363e = (C0363e) view.getLayoutParams();
        if (f == c0363e.f1811b) {
            return;
        }
        c0363e.f1811b = f;
        m2423l(view, f);
    }

    /* JADX INFO: renamed from: T */
    public final void m2410T(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2394D(childAt)) && !(z && childAt == view)) {
                gbl0.m125221t0(childAt, 4);
            } else {
                gbl0.m125221t0(childAt, 1);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m2411U(int i, int i2, View view) {
        int i3;
        int iM192837A = this.f1787g.m192837A();
        int iM192837A2 = this.f1788h.m192837A();
        if (iM192837A == 1 || iM192837A2 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (iM192837A != 2 && iM192837A2 != 2) {
                i3 = 0;
            }
        }
        if (view != null && i2 == 0) {
            float f = ((C0363e) view.getLayoutParams()).f1811b;
            if (f == 0.0f) {
                m2421j(view);
            } else if (f == 1.0f) {
                m2422k(view);
            }
        }
        if (i3 != this.f1791k) {
            this.f1791k = i3;
            List<InterfaceC0362d> list = this.f1801u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1801u.get(size).mo2443c(i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2412a(@NonNull InterfaceC0362d interfaceC0362d) {
        if (interfaceC0362d == null) {
            return;
        }
        if (this.f1801u == null) {
            this.f1801u = new ArrayList();
        }
        this.f1801u.add(interfaceC0362d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m2394D(childAt)) {
                this.f1778I.add(childAt);
            } else if (m2393C(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.f1778I.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f1778I.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f1778I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m2426o() != null || m2394D(view)) {
            gbl0.m125221t0(view, 4);
        } else {
            gbl0.m125221t0(view, 1);
        }
        if (f1768N) {
            return;
        }
        gbl0.m125201j0(view, this.f1781a);
    }

    /* JADX INFO: renamed from: b */
    public void m2413b() {
        if (this.f1799s) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f1799s = true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2414c(View view, int i) {
        return (m2431t(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0363e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C0363e) getChildAt(i).getLayoutParams()).f1811b);
        }
        this.f1785e = fMax;
        boolean zM192868n = this.f1787g.m192868n(true);
        boolean zM192868n2 = this.f1788h.m192868n(true);
        if (zM192868n || zM192868n2) {
            gbl0.m125183a0(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2415d(int i) {
        m2416e(i, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1785e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m2396F(x, y, childAt) && !m2392B(childAt) && m2424m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zM2392B = m2392B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM2392B) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m2391x(childAt) && m2394D(childAt) && childAt.getHeight() >= height) {
                    if (m2414c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f1785e;
        if (f > 0.0f && zM2392B) {
            int i4 = this.f1784d;
            this.f1786f.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f1786f);
            return zDrawChild;
        }
        if (this.f1805y != null && m2414c(view, 3)) {
            int intrinsicWidth = this.f1805y.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f1787g.m192876x(), 1.0f));
            this.f1805y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f1805y.setAlpha((int) (fMax * 255.0f));
            this.f1805y.draw(canvas);
            return zDrawChild;
        }
        if (this.f1806z != null && m2414c(view, 5)) {
            int intrinsicWidth2 = this.f1806z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f1788h.m192876x(), 1.0f));
            this.f1806z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f1806z.setAlpha((int) (fMax2 * 255.0f));
            this.f1806z.draw(canvas);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    public void m2416e(int i, boolean z) {
        View viewM2425n = m2425n(i);
        if (viewM2425n != null) {
            m2418g(viewM2425n, z);
        } else {
            kg3.m145878a("No drawer view found with gravity ", m2390w(i));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2417f(@NonNull View view) {
        m2418g(view, true);
    }

    /* JADX INFO: renamed from: g */
    public void m2418g(@NonNull View view, boolean z) {
        if (!m2394D(view)) {
            qtc0.m176411a("View ", view, " is not a sliding drawer");
            return;
        }
        C0363e c0363e = (C0363e) view.getLayoutParams();
        if (this.f1793m) {
            c0363e.f1811b = 0.0f;
            c0363e.f1813d = 0;
        } else if (z) {
            c0363e.f1813d |= 4;
            if (m2414c(view, 3)) {
                this.f1787g.m192853Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f1788h.m192853Q(view, getWidth(), view.getTop());
            }
        } else {
            m2398H(view, 0.0f);
            m2411U(c0363e.f1810a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0363e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0363e) {
            return new C0363e((C0363e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0363e((ViewGroup.MarginLayoutParams) layoutParams) : new C0363e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1769O) {
            return this.f1782b;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1804x;
    }

    /* JADX INFO: renamed from: h */
    public void m2419h() {
        m2420i(false);
    }

    /* JADX INFO: renamed from: i */
    public void m2420i(boolean z) {
        int childCount = getChildCount();
        boolean zM192853Q = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0363e c0363e = (C0363e) childAt.getLayoutParams();
            if (m2394D(childAt) && (!z || c0363e.f1812c)) {
                zM192853Q |= m2414c(childAt, 3) ? this.f1787g.m192853Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1788h.m192853Q(childAt, getWidth(), childAt.getTop());
                c0363e.f1812c = false;
            }
        }
        this.f1789i.m2447c();
        this.f1790j.m2447c();
        if (zM192853Q) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2421j(View view) {
        View rootView;
        C0363e c0363e = (C0363e) view.getLayoutParams();
        if ((c0363e.f1813d & 1) == 1) {
            c0363e.f1813d = 0;
            List<InterfaceC0362d> list = this.f1801u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1801u.get(size).mo2442b(view);
                }
            }
            m2410T(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2422k(View view) {
        C0363e c0363e = (C0363e) view.getLayoutParams();
        if ((c0363e.f1813d & 1) == 0) {
            c0363e.f1813d = 1;
            List<InterfaceC0362d> list = this.f1801u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1801u.get(size).mo2441a(view);
                }
            }
            m2410T(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2423l(View view, float f) {
        List<InterfaceC0362d> list = this.f1801u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1801u.get(size).mo2444d(view, f);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2424m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventM2433v = m2433v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventM2433v);
            motionEventM2433v.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    /* JADX INFO: renamed from: n */
    public View m2425n(int i) {
        int iM191981b = u6k.m191981b(i, gbl0.m125228x(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2431t(childAt) & 7) == iM191981b) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public View m2426o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0363e) childAt.getLayoutParams()).f1813d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1793m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1793m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1773D || this.f1804x == null) {
            return;
        }
        Object obj = this.f1772C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1804x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1804x.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM192873u;
        int actionMasked = motionEvent.getActionMasked();
        boolean zM192852P = this.f1787g.m192852P(motionEvent) | this.f1788h.m192852P(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m2420i(true);
                this.f1798r = false;
                this.f1799s = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m2420i(true);
                    this.f1798r = false;
                    this.f1799s = false;
                }
            } else if (this.f1787g.m192859e(3)) {
                this.f1789i.m2447c();
                this.f1790j.m2447c();
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f1802v = x;
            this.f1803w = y;
            z = this.f1785e > 0.0f && (viewM192873u = this.f1787g.m192873u((int) x, (int) y)) != null && m2392B(viewM192873u);
            this.f1798r = false;
            this.f1799s = false;
        }
        return zM192852P || z || m2434y() || this.f1799s;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2435z()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM2427p = m2427p();
        if (viewM2427p != null && m2429r(viewM2427p) == 0) {
            m2419h();
        }
        return viewM2427p != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        boolean z2 = true;
        this.f1792l = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0363e c0363e = (C0363e) childAt.getLayoutParams();
                if (m2392B(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c0363e).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c0363e).topMargin, childAt.getMeasuredWidth() + i8, ((ViewGroup.MarginLayoutParams) c0363e).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2414c(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c0363e.f1811b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (c0363e.f1811b * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z3 = f != c0363e.f1811b ? z2 : false;
                    int i10 = c0363e.f1810a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c0363e).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) c0363e).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c0363e).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) c0363e).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) c0363e).bottomMargin);
                    }
                    if (z3) {
                        m2409S(childAt, f);
                    }
                    int i18 = c0363e.f1811b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        this.f1792l = false;
        this.f1793m = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                ig3.m135964a("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.f1772C != null && gbl0.m125222u(this);
        int iM125228x = gbl0.m125228x(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0363e c0363e = (C0363e) childAt.getLayoutParams();
                if (z) {
                    int iM191981b = u6k.m191981b(c0363e.f1810a, iM125228x);
                    boolean zM125222u = gbl0.m125222u(childAt);
                    Object obj = this.f1772C;
                    if (zM125222u) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) obj;
                        if (iM191981b == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iM191981b == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) obj;
                        if (iM191981b == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iM191981b == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c0363e).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c0363e).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c0363e).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c0363e).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m2392B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c0363e).leftMargin) - ((ViewGroup.MarginLayoutParams) c0363e).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c0363e).topMargin) - ((ViewGroup.MarginLayoutParams) c0363e).bottomMargin, 1073741824));
                } else {
                    if (!m2394D(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f1769O) {
                        float fM125220t = gbl0.m125220t(childAt);
                        float f = this.f1782b;
                        if (fM125220t != f) {
                            gbl0.m125215q0(childAt, f);
                        }
                    }
                    int iM2431t = m2431t(childAt) & 7;
                    boolean z4 = iM2431t == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        r2j.m177608a("Child drawer has absolute gravity ", m2390w(iM2431t), " but this DrawerLayout already has a drawer view along that edge");
                        return;
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1783c + ((ViewGroup.MarginLayoutParams) c0363e).leftMargin + ((ViewGroup.MarginLayoutParams) c0363e).rightMargin, ((ViewGroup.MarginLayoutParams) c0363e).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c0363e).topMargin + ((ViewGroup.MarginLayoutParams) c0363e).bottomMargin, ((ViewGroup.MarginLayoutParams) c0363e).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewM2425n;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.openDrawerGravity;
        if (i != 0 && (viewM2425n = m2425n(i)) != null) {
            m2401K(viewM2425n);
        }
        int i2 = savedState.lockModeLeft;
        if (i2 != 3) {
            m2408R(i2, 3);
        }
        int i3 = savedState.lockModeRight;
        if (i3 != 3) {
            m2408R(i3, 5);
        }
        int i4 = savedState.lockModeStart;
        if (i4 != 3) {
            m2408R(i4, 8388611);
        }
        int i5 = savedState.lockModeEnd;
        if (i5 != 3) {
            m2408R(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m2406P();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0363e c0363e = (C0363e) getChildAt(i).getLayoutParams();
            int i2 = c0363e.f1813d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.openDrawerGravity = c0363e.f1810a;
                break;
            }
        }
        savedState.lockModeLeft = this.f1794n;
        savedState.lockModeRight = this.f1795o;
        savedState.lockModeStart = this.f1796p;
        savedState.lockModeEnd = this.f1797q;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM2426o;
        this.f1787g.m192843G(motionEvent);
        this.f1788h.m192843G(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f1802v = x;
            this.f1803w = y;
            this.f1798r = false;
            this.f1799s = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            m2420i(true);
            this.f1798r = false;
            this.f1799s = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewM192873u = this.f1787g.m192873u((int) x2, (int) y2);
        if (viewM192873u == null || !m2392B(viewM192873u)) {
            z = true;
        } else {
            float f = x2 - this.f1802v;
            float f2 = y2 - this.f1803w;
            int iM192878z = this.f1787g.m192878z();
            if ((f * f) + (f2 * f2) >= iM192878z * iM192878z || (viewM2426o = m2426o()) == null || m2429r(viewM2426o) == 2) {
                z = true;
            } else {
                z = false;
            }
        }
        m2420i(z);
        this.f1798r = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public View m2427p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2394D(childAt) && m2395E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public int m2428q(int i) {
        int iM125228x = gbl0.m125228x(this);
        if (i == 3) {
            int i2 = this.f1794n;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iM125228x == 0 ? this.f1796p : this.f1797q;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.f1795o;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iM125228x == 0 ? this.f1797q : this.f1796p;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.f1796p;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iM125228x == 0 ? this.f1794n : this.f1795o;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.f1797q;
        if (i8 != 3) {
            return i8;
        }
        int i9 = iM125228x == 0 ? this.f1795o : this.f1794n;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public int m2429r(@NonNull View view) {
        if (m2394D(view)) {
            return m2428q(((C0363e) view.getLayoutParams()).f1810a);
        }
        qtc0.m176411a("View ", view, " is not a drawer");
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1798r = z;
        if (z) {
            m2420i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1792l) {
            return;
        }
        super.requestLayout();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public CharSequence m2430s(int i) {
        int iM191981b = u6k.m191981b(i, gbl0.m125228x(this));
        if (iM191981b == 3) {
            return this.f1770A;
        }
        if (iM191981b == 5) {
            return this.f1771B;
        }
        return null;
    }

    public void setDrawerElevation(float f) {
        this.f1782b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2394D(childAt)) {
                gbl0.m125215q0(childAt, this.f1782b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0362d interfaceC0362d) {
        InterfaceC0362d interfaceC0362d2 = this.f1800t;
        if (interfaceC0362d2 != null) {
            m2403M(interfaceC0362d2);
        }
        if (interfaceC0362d != null) {
            m2412a(interfaceC0362d);
        }
        this.f1800t = interfaceC0362d;
    }

    public void setDrawerLockMode(int i) {
        m2408R(i, 3);
        m2408R(i, 5);
    }

    public void setScrimColor(@ColorInt int i) {
        this.f1784d = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1804x = i != 0 ? e16.m114377e(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.f1804x = new ColorDrawable(i);
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public int m2431t(View view) {
        return u6k.m191981b(((C0363e) view.getLayoutParams()).f1810a, gbl0.m125228x(this));
    }

    /* JADX INFO: renamed from: u */
    public float m2432u(View view) {
        return ((C0363e) view.getLayoutParams()).f1811b;
    }

    /* JADX INFO: renamed from: v */
    public final MotionEvent m2433v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f1780K == null) {
                this.f1780K = new Matrix();
            }
            matrix.invert(this.f1780K);
            motionEventObtain.transform(this.f1780K);
        }
        return motionEventObtain;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m2434y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0363e) getChildAt(i).getLayoutParams()).f1812c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2435z() {
        return m2427p() != null;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f1804x = drawable;
        invalidate();
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public static class C0363e extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f1810a;

        /* JADX INFO: renamed from: b */
        public float f1811b;

        /* JADX INFO: renamed from: c */
        public boolean f1812c;

        /* JADX INFO: renamed from: d */
        public int f1813d;

        public C0363e(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1810a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1767M);
            this.f1810a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0363e(int i, int i2) {
            super(i, i2);
            this.f1810a = 0;
        }

        public C0363e(@NonNull C0363e c0363e) {
            super((ViewGroup.MarginLayoutParams) c0363e);
            this.f1810a = 0;
            this.f1810a = c0363e.f1810a;
        }

        public C0363e(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1810a = 0;
        }

        public C0363e(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1810a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0363e(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0358a();
        int lockModeEnd;
        int lockModeLeft;
        int lockModeRight;
        int lockModeStart;
        int openDrawerGravity;

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        public static class C0358a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = 0;
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.openDrawerGravity = 0;
        }
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }
}
