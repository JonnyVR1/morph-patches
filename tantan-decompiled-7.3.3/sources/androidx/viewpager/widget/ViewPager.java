package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p153l.C15967bc;
import p153l.C16932fb;
import p153l.cf60;
import p153l.dgq0;
import p153l.il50;
import p153l.j26;
import p153l.kkl0;
import p153l.l5j;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: I0 */
    static final int[] f3230I0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: J0 */
    private static final Comparator<C0714f> f3231J0 = new C0709a();

    /* JADX INFO: renamed from: K0 */
    private static final Interpolator f3232K0 = new InterpolatorC0710b();

    /* JADX INFO: renamed from: L0 */
    private static final C0722n f3233L0 = new C0722n();

    /* JADX INFO: renamed from: A */
    private int f3234A;

    /* JADX INFO: renamed from: B */
    private int f3235B;

    /* JADX INFO: renamed from: C */
    private float f3236C;

    /* JADX INFO: renamed from: D */
    private float f3237D;

    /* JADX INFO: renamed from: E */
    private float f3238E;

    /* JADX INFO: renamed from: E0 */
    private int f3239E0;

    /* JADX INFO: renamed from: F */
    private float f3240F;

    /* JADX INFO: renamed from: F0 */
    private ArrayList<View> f3241F0;

    /* JADX INFO: renamed from: G */
    private int f3242G;

    /* JADX INFO: renamed from: G0 */
    private final Runnable f3243G0;

    /* JADX INFO: renamed from: H */
    private VelocityTracker f3244H;

    /* JADX INFO: renamed from: H0 */
    private int f3245H0;

    /* JADX INFO: renamed from: I */
    private int f3246I;

    /* JADX INFO: renamed from: J */
    private int f3247J;

    /* JADX INFO: renamed from: K */
    private int f3248K;

    /* JADX INFO: renamed from: L */
    private int f3249L;

    /* JADX INFO: renamed from: M */
    private boolean f3250M;

    /* JADX INFO: renamed from: N */
    private long f3251N;

    /* JADX INFO: renamed from: O */
    private EdgeEffect f3252O;

    /* JADX INFO: renamed from: P */
    private EdgeEffect f3253P;

    /* JADX INFO: renamed from: Q */
    private boolean f3254Q;

    /* JADX INFO: renamed from: R */
    private boolean f3255R;

    /* JADX INFO: renamed from: S */
    private int f3256S;

    /* JADX INFO: renamed from: T */
    private List<InterfaceC0718j> f3257T;

    /* JADX INFO: renamed from: U */
    private InterfaceC0718j f3258U;

    /* JADX INFO: renamed from: V */
    private InterfaceC0718j f3259V;

    /* JADX INFO: renamed from: W */
    private List<InterfaceC0717i> f3260W;

    /* JADX INFO: renamed from: a */
    private int f3261a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<C0714f> f3262b;

    /* JADX INFO: renamed from: c */
    private final C0714f f3263c;

    /* JADX INFO: renamed from: d */
    private final Rect f3264d;

    /* JADX INFO: renamed from: e */
    cf60 f3265e;

    /* JADX INFO: renamed from: f */
    int f3266f;

    /* JADX INFO: renamed from: g */
    private int f3267g;

    /* JADX INFO: renamed from: h */
    private Parcelable f3268h;

    /* JADX INFO: renamed from: i */
    private ClassLoader f3269i;

    /* JADX INFO: renamed from: j */
    private boolean f3270j;

    /* JADX INFO: renamed from: k */
    private C0720l f3271k;

    /* JADX INFO: renamed from: k0 */
    private InterfaceC0719k f3272k0;

    /* JADX INFO: renamed from: l */
    private int f3273l;

    /* JADX INFO: renamed from: m */
    private Drawable f3274m;
    private boolean mFirstLayout;
    private Scroller mScroller;

    /* JADX INFO: renamed from: n */
    private int f3275n;

    /* JADX INFO: renamed from: o */
    private int f3276o;

    /* JADX INFO: renamed from: p */
    private float f3277p;

    /* JADX INFO: renamed from: p0 */
    private int f3278p0;

    /* JADX INFO: renamed from: q */
    private float f3279q;

    /* JADX INFO: renamed from: r */
    private int f3280r;

    /* JADX INFO: renamed from: s */
    private int f3281s;

    /* JADX INFO: renamed from: t */
    private boolean f3282t;

    /* JADX INFO: renamed from: u */
    private boolean f3283u;

    /* JADX INFO: renamed from: v */
    private boolean f3284v;

    /* JADX INFO: renamed from: w */
    private int f3285w;

    /* JADX INFO: renamed from: x */
    private boolean f3286x;

    /* JADX INFO: renamed from: y */
    private boolean f3287y;

    /* JADX INFO: renamed from: z */
    private int f3288z;

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C0709a implements Comparator<C0714f> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0714f c0714f, C0714f c0714f2) {
            return c0714f.f3293b - c0714f2.f3293b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class InterpolatorC0710b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$c */
    public class RunnableC0711c implements Runnable {
        public RunnableC0711c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m4174K();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$d */
    public class C0712d implements il50 {

        /* JADX INFO: renamed from: a */
        public final Rect f3290a = new Rect();

        public C0712d() {
        }

        @Override // p153l.il50
        public dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
            dgq0 dgq0VarM150141W = kkl0.m150141W(view, dgq0Var);
            if (dgq0VarM150141W.m115688o()) {
                return dgq0VarM150141W;
            }
            Rect rect = this.f3290a;
            rect.left = dgq0VarM150141W.m115684j();
            rect.top = dgq0VarM150141W.m115686l();
            rect.right = dgq0VarM150141W.m115685k();
            rect.bottom = dgq0VarM150141W.m115683i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                dgq0 dgq0VarM150153e = kkl0.m150153e(ViewPager.this.getChildAt(i), dgq0VarM150141W);
                rect.left = Math.min(dgq0VarM150153e.m115684j(), rect.left);
                rect.top = Math.min(dgq0VarM150153e.m115686l(), rect.top);
                rect.right = Math.min(dgq0VarM150153e.m115685k(), rect.right);
                rect.bottom = Math.min(dgq0VarM150153e.m115683i(), rect.bottom);
            }
            return dgq0VarM150141W.m115690q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$e */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC0713e {
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C0714f {

        /* JADX INFO: renamed from: a */
        public Object f3292a;

        /* JADX INFO: renamed from: b */
        public int f3293b;

        /* JADX INFO: renamed from: c */
        public boolean f3294c;

        /* JADX INFO: renamed from: d */
        public float f3295d;

        /* JADX INFO: renamed from: e */
        public float f3296e;
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$h */
    public class C0716h extends C16932fb {
        public C0716h() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m4204a() {
            cf60 cf60Var = ViewPager.this.f3265e;
            return cf60Var != null && cf60Var.getCount() > 1;
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            cf60 cf60Var;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m4204a());
            if (accessibilityEvent.getEventType() != 4096 || (cf60Var = ViewPager.this.f3265e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(cf60Var.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.f3266f);
            accessibilityEvent.setToIndex(ViewPager.this.f3266f);
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityNodeInfo(View view, C15967bc c15967bc) {
            super.onInitializeAccessibilityNodeInfo(view, c15967bc);
            c15967bc.m103431o0(ViewPager.class.getName());
            c15967bc.m103382K0(m4204a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c15967bc.m103406a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c15967bc.m103406a(8192);
            }
        }

        @Override // p153l.C16932fb
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f3266f + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f3266f - 1);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface InterfaceC0717i {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable cf60 cf60Var, @Nullable cf60 cf60Var2);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface InterfaceC0718j {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @Px int i2);

        void onPageSelected(int i);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$k */
    public interface InterfaceC0719k {
        /* JADX INFO: renamed from: a */
        void mo4205a(@NonNull View view, float f);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$l */
    public class C0720l extends DataSetObserver {
        public C0720l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m4192k();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m4192k();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C0721m implements InterfaceC0718j {
        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$n */
    public static class C0722n implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0715g c0715g = (C0715g) view.getLayoutParams();
            C0715g c0715g2 = (C0715g) view2.getLayoutParams();
            boolean z = c0715g.f3297a;
            if (z != c0715g2.f3297a) {
                return z ? 1 : -1;
            }
            return c0715g.f3301e - c0715g2.f3301e;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.f3262b = new ArrayList<>();
        this.f3263c = new C0714f();
        this.f3264d = new Rect();
        this.f3267g = -1;
        this.f3268h = null;
        this.f3269i = null;
        this.f3277p = -3.4028235E38f;
        this.f3279q = Float.MAX_VALUE;
        this.f3285w = 1;
        this.f3242G = -1;
        this.mFirstLayout = true;
        this.f3254Q = false;
        this.f3243G0 = new RunnableC0711c();
        this.f3245H0 = 0;
        m4169A();
    }

    /* JADX INFO: renamed from: B */
    private static boolean m4148B(@NonNull View view) {
        return view.getClass().getAnnotation(InterfaceC0713e.class) != null;
    }

    /* JADX INFO: renamed from: D */
    private boolean m4149D(float f, float f2) {
        if (f >= this.f3234A || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.f3234A)) && f2 < 0.0f;
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    private void m4150F(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3242G) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3236C = motionEvent.getX(i);
            this.f3242G = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3244H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    private boolean m4151I(int i) {
        if (this.f3262b.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.f3255R = false;
            m4171E(0, 0.0f, 0);
            if (this.f3255R) {
                return false;
            }
            wtq0.m207906a("onPageScrolled did not call superclass implementation");
            return false;
        }
        C0714f c0714fM4168y = m4168y();
        int clientWidth = getClientWidth();
        int i2 = this.f3273l;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = c0714fM4168y.f3293b;
        float f2 = ((i / f) - c0714fM4168y.f3296e) / (c0714fM4168y.f3295d + (i2 / f));
        this.f3255R = false;
        m4171E(i4, f2, (int) (i3 * f2));
        if (this.f3255R) {
            return true;
        }
        wtq0.m207906a("onPageScrolled did not call superclass implementation");
        return false;
    }

    /* JADX INFO: renamed from: J */
    private boolean m4152J(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f3236C - f;
        this.f3236C = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f3277p * clientWidth;
        float f4 = this.f3279q * clientWidth;
        boolean z3 = false;
        C0714f c0714f = this.f3262b.get(0);
        ArrayList<C0714f> arrayList = this.f3262b;
        C0714f c0714f2 = arrayList.get(arrayList.size() - 1);
        if (c0714f.f3293b != 0) {
            f3 = c0714f.f3296e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0714f2.f3293b != this.f3265e.getCount() - 1) {
            f4 = c0714f2.f3296e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f3252O.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f3253P.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f3236C += scrollX - i;
        scrollTo(i, getScrollY());
        m4151I(i);
        return z3;
    }

    /* JADX INFO: renamed from: M */
    private void m4153M(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f3262b.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C0714f c0714fM4199z = m4199z(this.f3266f);
        int iMin = (int) ((c0714fM4199z != null ? Math.min(c0714fM4199z.f3296e, this.f3279q) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m4160j(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX INFO: renamed from: N */
    private void m4154N() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0715g) getChildAt(i).getLayoutParams()).f3297a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m4155Q(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: R */
    private boolean m4156R() {
        this.f3242G = -1;
        m4166r();
        this.f3252O.onRelease();
        this.f3253P.onRelease();
        return this.f3252O.isFinished() || this.f3253P.isFinished();
    }

    /* JADX INFO: renamed from: S */
    private void m4157S(int i, boolean z, int i2, boolean z2) {
        C0714f c0714fM4199z = m4199z(i);
        int clientWidth = c0714fM4199z != null ? (int) (getClientWidth() * Math.max(this.f3277p, Math.min(c0714fM4199z.f3296e, this.f3279q))) : 0;
        if (z) {
            m4184Z(clientWidth, 0, i2);
            if (z2) {
                m4163n(i);
                return;
            }
            return;
        }
        if (z2) {
            m4163n(i);
        }
        m4160j(false);
        scrollTo(clientWidth, 0);
        m4151I(clientWidth);
    }

    /* JADX INFO: renamed from: a0 */
    private void m4158a0() {
        if (this.f3239E0 != 0) {
            ArrayList<View> arrayList = this.f3241F0;
            if (arrayList == null) {
                this.f3241F0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3241F0.add(getChildAt(i));
            }
            Collections.sort(this.f3241F0, f3233L0);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m4159g(C0714f c0714f, int i, C0714f c0714f2) {
        int i2;
        int i3;
        C0714f c0714f3;
        C0714f c0714f4;
        int count = this.f3265e.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f3273l / clientWidth : 0.0f;
        if (c0714f2 != null) {
            int i4 = c0714f2.f3293b;
            int i5 = c0714f.f3293b;
            if (i4 < i5) {
                float pageWidth = c0714f2.f3296e + c0714f2.f3295d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c0714f.f3293b && i7 < this.f3262b.size()) {
                    C0714f c0714f5 = this.f3262b.get(i7);
                    while (true) {
                        c0714f4 = c0714f5;
                        if (i6 <= c0714f4.f3293b || i7 >= this.f3262b.size() - 1) {
                            break;
                        }
                        i7++;
                        c0714f5 = this.f3262b.get(i7);
                    }
                    while (i6 < c0714f4.f3293b) {
                        pageWidth += this.f3265e.getPageWidth(i6) + f;
                        i6++;
                    }
                    c0714f4.f3296e = pageWidth;
                    pageWidth += c0714f4.f3295d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f3262b.size() - 1;
                float pageWidth2 = c0714f2.f3296e;
                while (true) {
                    i4--;
                    if (i4 < c0714f.f3293b || size < 0) {
                        break;
                    }
                    C0714f c0714f6 = this.f3262b.get(size);
                    while (true) {
                        c0714f3 = c0714f6;
                        if (i4 >= c0714f3.f3293b || size <= 0) {
                            break;
                        }
                        size--;
                        c0714f6 = this.f3262b.get(size);
                    }
                    while (i4 > c0714f3.f3293b) {
                        pageWidth2 -= this.f3265e.getPageWidth(i4) + f;
                        i4--;
                    }
                    pageWidth2 -= c0714f3.f3295d + f;
                    c0714f3.f3296e = pageWidth2;
                }
            }
        }
        int size2 = this.f3262b.size();
        float pageWidth3 = c0714f.f3296e;
        int i8 = c0714f.f3293b;
        int i9 = i8 - 1;
        this.f3277p = i8 == 0 ? pageWidth3 : -3.4028235E38f;
        int i10 = count - 1;
        this.f3279q = i8 == i10 ? (c0714f.f3295d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0714f c0714f7 = this.f3262b.get(i11);
            while (true) {
                i3 = c0714f7.f3293b;
                if (i9 <= i3) {
                    break;
                }
                pageWidth3 -= this.f3265e.getPageWidth(i9) + f;
                i9--;
            }
            pageWidth3 -= c0714f7.f3295d + f;
            c0714f7.f3296e = pageWidth3;
            if (i3 == 0) {
                this.f3277p = pageWidth3;
            }
            i11--;
            i9--;
        }
        float pageWidth4 = c0714f.f3296e + c0714f.f3295d + f;
        int i12 = c0714f.f3293b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0714f c0714f8 = this.f3262b.get(i13);
            while (true) {
                i2 = c0714f8.f3293b;
                if (i12 >= i2) {
                    break;
                }
                pageWidth4 += this.f3265e.getPageWidth(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f3279q = (c0714f8.f3295d + pageWidth4) - 1.0f;
            }
            c0714f8.f3296e = pageWidth4;
            pageWidth4 += c0714f8.f3295d + f;
            i13++;
            i12++;
        }
        this.f3254Q = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: j */
    private void m4160j(boolean z) {
        boolean z2 = this.f3245H0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4151I(currX);
                    }
                }
            }
        }
        this.f3284v = false;
        for (int i = 0; i < this.f3262b.size(); i++) {
            C0714f c0714f = this.f3262b.get(i);
            if (c0714f.f3294c) {
                c0714f.f3294c = false;
                z2 = true;
            }
        }
        if (z2) {
            Runnable runnable = this.f3243G0;
            if (z) {
                kkl0.m150148b0(this, runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private int m4161l(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f3248K || Math.abs(i2) <= this.f3246I) {
            i += (int) (f + (i >= this.f3266f ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f3262b.size() <= 0) {
            return i;
        }
        C0714f c0714f = this.f3262b.get(0);
        ArrayList<C0714f> arrayList = this.f3262b;
        return Math.max(c0714f.f3293b, Math.min(i, arrayList.get(arrayList.size() - 1).f3293b));
    }

    /* JADX INFO: renamed from: m */
    private void m4162m(int i, float f, int i2) {
        InterfaceC0718j interfaceC0718j = this.f3258U;
        if (interfaceC0718j != null) {
            interfaceC0718j.onPageScrolled(i, f, i2);
        }
        List<InterfaceC0718j> list = this.f3257T;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0718j interfaceC0718j2 = this.f3257T.get(i3);
                if (interfaceC0718j2 != null) {
                    interfaceC0718j2.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC0718j interfaceC0718j3 = this.f3259V;
        if (interfaceC0718j3 != null) {
            interfaceC0718j3.onPageScrolled(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m4163n(int i) {
        InterfaceC0718j interfaceC0718j = this.f3258U;
        if (interfaceC0718j != null) {
            interfaceC0718j.onPageSelected(i);
        }
        List<InterfaceC0718j> list = this.f3257T;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0718j interfaceC0718j2 = this.f3257T.get(i2);
                if (interfaceC0718j2 != null) {
                    interfaceC0718j2.onPageSelected(i);
                }
            }
        }
        InterfaceC0718j interfaceC0718j3 = this.f3259V;
        if (interfaceC0718j3 != null) {
            interfaceC0718j3.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m4164o(int i) {
        InterfaceC0718j interfaceC0718j = this.f3258U;
        if (interfaceC0718j != null) {
            interfaceC0718j.onPageScrollStateChanged(i);
        }
        List<InterfaceC0718j> list = this.f3257T;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0718j interfaceC0718j2 = this.f3257T.get(i2);
                if (interfaceC0718j2 != null) {
                    interfaceC0718j2.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC0718j interfaceC0718j3 = this.f3259V;
        if (interfaceC0718j3 != null) {
            interfaceC0718j3.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m4165q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f3278p0 : 0, null);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m4166r() {
        this.f3286x = false;
        this.f3287y = false;
        VelocityTracker velocityTracker = this.f3244H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3244H = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3283u != z) {
            this.f3283u = z;
        }
    }

    /* JADX INFO: renamed from: v */
    private Rect m4167v(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: y */
    private C0714f m4168y() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f3273l / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        C0714f c0714f = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.f3262b.size()) {
            C0714f c0714f2 = this.f3262b.get(i2);
            if (!z && c0714f2.f3293b != (i = i3 + 1)) {
                c0714f2 = this.f3263c;
                c0714f2.f3296e = f + f3 + f2;
                c0714f2.f3293b = i;
                c0714f2.f3295d = this.f3265e.getPageWidth(i);
                i2--;
            }
            C0714f c0714f3 = c0714f2;
            f = c0714f3.f3296e;
            float f4 = c0714f3.f3295d + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.f3262b.size() - 1) {
                return c0714f3;
            }
            int i4 = c0714f3.f3293b;
            float f5 = c0714f3.f3295d;
            i2++;
            i3 = i4;
            f3 = f5;
            c0714f = c0714f3;
            z = false;
        }
        return c0714f;
    }

    /* JADX INFO: renamed from: A */
    public void m4169A() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, f3232K0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3235B = viewConfiguration.getScaledPagingTouchSlop();
        this.f3246I = (int) (400.0f * f);
        this.f3247J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3252O = new EdgeEffect(context);
        this.f3253P = new EdgeEffect(context);
        this.f3248K = (int) (25.0f * f);
        this.f3249L = (int) (2.0f * f);
        this.f3288z = (int) (f * 16.0f);
        kkl0.m150164j0(this, new C0716h());
        if (kkl0.m150187v(this) == 0) {
            kkl0.m150184t0(this, 1);
        }
        kkl0.m150194y0(this, new C0712d());
    }

    /* JADX INFO: renamed from: C */
    public boolean m4170C() {
        return this.f3250M;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    @CallSuper
    /* JADX INFO: renamed from: E */
    public void m4171E(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f3256S > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0715g c0715g = (C0715g) childAt.getLayoutParams();
                if (c0715g.f3297a) {
                    int i4 = c0715g.f3298b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        m4162m(i, f, i2);
        if (this.f3272k0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((C0715g) childAt2.getLayoutParams()).f3297a) {
                    this.f3272k0.mo4205a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f3255R = true;
    }

    /* JADX INFO: renamed from: G */
    public boolean m4172G() {
        int i = this.f3266f;
        if (i <= 0) {
            return false;
        }
        m4178T(i - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public boolean m4173H() {
        cf60 cf60Var = this.f3265e;
        if (cf60Var == null || this.f3266f >= cf60Var.getCount() - 1) {
            return false;
        }
        m4178T(this.f3266f + 1, true);
        return true;
    }

    /* JADX INFO: renamed from: K */
    public void m4174K() {
        m4175L(this.f3266f);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[PHI: r7 r10 r15
      0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: L */
    public void m4175L(int i) {
        C0714f c0714fM4199z;
        String hexString;
        C0714f c0714fM4185b;
        C0714f c0714fM4198x;
        C0714f c0714f;
        int i2 = this.f3266f;
        if (i2 != i) {
            c0714fM4199z = m4199z(i2);
            this.f3266f = i;
        } else {
            c0714fM4199z = null;
        }
        if (this.f3265e == null) {
            m4158a0();
            return;
        }
        if (this.f3284v) {
            m4158a0();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f3265e.startUpdate((ViewGroup) this);
        int i3 = this.f3285w;
        int iMax = Math.max(0, this.f3266f - i3);
        int count = this.f3265e.getCount();
        int iMin = Math.min(count - 1, this.f3266f + i3);
        if (count != this.f3261a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            sb.append(this.f3261a);
            sb.append(", found: ");
            sb.append(count);
            sb.append(" Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            l5j.m152955a(sb, " Problematic adapter: ", this.f3265e.getClass());
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.f3262b.size()) {
                c0714fM4185b = this.f3262b.get(i4);
                int i5 = c0714fM4185b.f3293b;
                int i6 = this.f3266f;
                if (i5 >= i6) {
                    if (i5 != i6) {
                        break;
                    } else {
                        break;
                    }
                }
                i4++;
            }
            c0714fM4185b = null;
            break;
        }
        if (c0714fM4185b == null && count > 0) {
            c0714fM4185b = m4185b(this.f3266f, i4);
        }
        if (c0714fM4185b != null) {
            int i7 = i4 - 1;
            C0714f c0714f2 = i7 >= 0 ? this.f3262b.get(i7) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c0714fM4185b.f3295d) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i8 = this.f3266f - 1; i8 >= 0; i8--) {
                if (f < paddingLeft || i8 >= iMax) {
                    if (c0714f2 == null || i8 != c0714f2.f3293b) {
                        f += m4185b(i8, i7 + 1).f3295d;
                        i4++;
                        if (i7 >= 0) {
                            c0714f = this.f3262b.get(i7);
                        } else {
                            c0714f = null;
                        }
                    } else {
                        f += c0714f2.f3295d;
                        i7--;
                        if (i7 >= 0) {
                            c0714f = this.f3262b.get(i7);
                        } else {
                            c0714f = null;
                        }
                    }
                    c0714f2 = c0714f;
                } else {
                    if (c0714f2 == null) {
                        break;
                    }
                    if (i8 == c0714f2.f3293b && !c0714f2.f3294c) {
                        this.f3262b.remove(i7);
                        this.f3265e.destroyItem((ViewGroup) this, i8, c0714f2.f3292a);
                        i7--;
                        i4--;
                        if (i7 >= 0) {
                            c0714f = this.f3262b.get(i7);
                        } else {
                            c0714f = null;
                        }
                        c0714f2 = c0714f;
                    }
                }
            }
            float f2 = c0714fM4185b.f3295d;
            int i9 = i4 + 1;
            if (f2 < 2.0f) {
                C0714f c0714f3 = i9 < this.f3262b.size() ? this.f3262b.get(i9) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i10 = this.f3266f;
                while (true) {
                    i10++;
                    if (i10 >= count) {
                        break;
                    }
                    if (f2 >= paddingRight && i10 > iMin) {
                        if (c0714f3 == null) {
                            break;
                        }
                        if (i10 == c0714f3.f3293b && !c0714f3.f3294c) {
                            this.f3262b.remove(i9);
                            this.f3265e.destroyItem((ViewGroup) this, i10, c0714f3.f3292a);
                            if (i9 < this.f3262b.size()) {
                                c0714f3 = this.f3262b.get(i9);
                            }
                        }
                    } else if (c0714f3 == null || i10 != c0714f3.f3293b) {
                        C0714f c0714fM4185b2 = m4185b(i10, i9);
                        i9++;
                        f2 += c0714fM4185b2.f3295d;
                        c0714f3 = i9 < this.f3262b.size() ? this.f3262b.get(i9) : null;
                    } else {
                        f2 += c0714f3.f3295d;
                        i9++;
                        if (i9 < this.f3262b.size()) {
                            c0714f3 = this.f3262b.get(i9);
                        }
                    }
                }
            }
            m4159g(c0714fM4185b, i4, c0714fM4199z);
            this.f3265e.setPrimaryItem((ViewGroup) this, this.f3266f, c0714fM4185b.f3292a);
        }
        this.f3265e.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0715g c0715g = (C0715g) childAt.getLayoutParams();
            c0715g.f3302f = i11;
            if (!c0715g.f3297a && c0715g.f3299c == 0.0f && (c0714fM4198x = m4198x(childAt)) != null) {
                c0715g.f3299c = c0714fM4198x.f3295d;
                c0715g.f3301e = c0714fM4198x.f3293b;
            }
        }
        m4158a0();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            C0714f c0714fM4197w = viewFindFocus != null ? m4197w(viewFindFocus) : null;
            if (c0714fM4197w == null || c0714fM4197w.f3293b != this.f3266f) {
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    C0714f c0714fM4198x2 = m4198x(childAt2);
                    if (c0714fM4198x2 != null && c0714fM4198x2.f3293b == this.f3266f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m4176O(@NonNull InterfaceC0717i interfaceC0717i) {
        List<InterfaceC0717i> list = this.f3260W;
        if (list != null) {
            list.remove(interfaceC0717i);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m4177P(@NonNull InterfaceC0718j interfaceC0718j) {
        List<InterfaceC0718j> list = this.f3257T;
        if (list != null) {
            list.remove(interfaceC0718j);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m4178T(int i, boolean z) {
        this.f3284v = false;
        m4179U(i, z, false);
    }

    /* JADX INFO: renamed from: U */
    public void m4179U(int i, boolean z, boolean z2) {
        m4180V(i, z, z2, 0);
    }

    /* JADX INFO: renamed from: V */
    public void m4180V(int i, boolean z, boolean z2, int i2) {
        cf60 cf60Var = this.f3265e;
        if (cf60Var == null || cf60Var.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f3266f == i && this.f3262b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f3265e.getCount()) {
            i = this.f3265e.getCount() - 1;
        }
        int i3 = this.f3285w;
        int i4 = this.f3266f;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f3262b.size(); i5++) {
                this.f3262b.get(i5).f3294c = true;
            }
        }
        boolean z3 = this.f3266f != i;
        if (!this.mFirstLayout) {
            m4175L(i);
            m4157S(i, z, i2, z3);
        } else {
            this.f3266f = i;
            if (z3) {
                m4163n(i);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: W */
    public InterfaceC0718j m4181W(InterfaceC0718j interfaceC0718j) {
        InterfaceC0718j interfaceC0718j2 = this.f3259V;
        this.f3259V = interfaceC0718j;
        return interfaceC0718j2;
    }

    /* JADX INFO: renamed from: X */
    public void mo4182X(boolean z, @Nullable InterfaceC0719k interfaceC0719k) {
        m4183Y(z, interfaceC0719k, 2);
    }

    /* JADX INFO: renamed from: Y */
    public void m4183Y(boolean z, @Nullable InterfaceC0719k interfaceC0719k, int i) {
        boolean z2 = interfaceC0719k != null;
        boolean z3 = z2 != (this.f3272k0 != null);
        this.f3272k0 = interfaceC0719k;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.f3239E0 = z ? 2 : 1;
            this.f3278p0 = i;
        } else {
            this.f3239E0 = 0;
        }
        if (z3) {
            m4174K();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m4184Z(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            boolean z = this.f3270j;
            Scroller scroller2 = this.mScroller;
            scrollX = z ? scroller2.getCurrX() : scroller2.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m4160j(false);
            m4174K();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fM4193p = f2 + (m4193p(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fM4193p / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i5) / ((f * this.f3265e.getPageWidth(this.f3266f)) + this.f3273l)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f3270j = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, iMin);
        kkl0.m150146a0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0714f c0714fM4198x;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c0714fM4198x = m4198x(childAt)) != null && c0714fM4198x.f3293b == this.f3266f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0714f c0714fM4198x;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0714fM4198x = m4198x(childAt)) != null && c0714fM4198x.f3293b == this.f3266f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0715g c0715g = (C0715g) layoutParams;
        boolean zM4148B = c0715g.f3297a | m4148B(view);
        c0715g.f3297a = zM4148B;
        if (!this.f3282t) {
            super.addView(view, i, layoutParams);
        } else if (zM4148B) {
            wtq0.m207906a("Cannot add pager decor view during layout");
        } else {
            c0715g.f3300d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public C0714f m4185b(int i, int i2) {
        C0714f c0714f = new C0714f();
        c0714f.f3293b = i;
        c0714f.f3292a = this.f3265e.instantiateItem((ViewGroup) this, i);
        c0714f.f3295d = this.f3265e.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f3262b.size()) {
            this.f3262b.add(c0714f);
            return c0714f;
        }
        this.f3262b.add(i2, c0714f);
        return c0714f;
    }

    /* JADX INFO: renamed from: c */
    public void m4186c(@NonNull InterfaceC0717i interfaceC0717i) {
        if (this.f3260W == null) {
            this.f3260W = new ArrayList();
        }
        this.f3260W.add(interfaceC0717i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f3265e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f3277p));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.f3279q));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0715g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f3270j = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            m4160j(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m4151I(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        kkl0.m150146a0(this);
    }

    /* JADX INFO: renamed from: d */
    public void m4187d(@NonNull InterfaceC0718j interfaceC0718j) {
        if (this.f3257T == null) {
            this.f3257T = new ArrayList();
        }
        this.f3257T.add(interfaceC0718j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m4195t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0714f c0714fM4198x;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0714fM4198x = m4198x(childAt)) != null && c0714fM4198x.f3293b == this.f3266f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        cf60 cf60Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (cf60Var = this.f3265e) != null && cf60Var.getCount() > 1)) {
            if (!this.f3252O.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f3277p * width);
                this.f3252O.setSize(height, width);
                zDraw = this.f3252O.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f3253P.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f3279q + 1.0f)) * width2);
                this.f3253P.setSize(height2, width2);
                zDraw |= this.f3253P.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f3252O.finish();
            this.f3253P.finish();
        }
        if (zDraw) {
            kkl0.m150146a0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3274m;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX INFO: renamed from: e */
    public boolean m4188e(int i) {
        boolean zM4172G;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zM4172G = m4172G();
            } else if (i == 66 || i == 2) {
                zM4172G = m4173H();
            } else {
                zM4172G = false;
            }
        } else if (i == 17) {
            zM4172G = (viewFindFocus == null || m4167v(this.f3264d, viewFindNextFocus).left < m4167v(this.f3264d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m4172G();
        } else if (i == 66) {
            zM4172G = (viewFindFocus == null || m4167v(this.f3264d, viewFindNextFocus).left > m4167v(this.f3264d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m4173H();
        } else {
            zM4172G = false;
        }
        if (zM4172G) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM4172G;
    }

    /* JADX INFO: renamed from: f */
    public boolean m4189f() {
        if (this.f3286x) {
            return false;
        }
        this.f3250M = true;
        setScrollState(1);
        this.f3236C = 0.0f;
        this.f3238E = 0.0f;
        VelocityTracker velocityTracker = this.f3244H;
        if (velocityTracker == null) {
            this.f3244H = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f3244H.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.f3251N = jUptimeMillis;
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0715g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0715g(getContext(), attributeSet);
    }

    @Nullable
    public cf60 getAdapter() {
        return this.f3265e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3239E0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0715g) this.f3241F0.get(i2).getLayoutParams()).f3302f;
    }

    public int getCurrentItem() {
        return this.f3266f;
    }

    public int getOffscreenPageLimit() {
        return this.f3285w;
    }

    public int getPageMargin() {
        return this.f3273l;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4190h(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m4190h(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX INFO: renamed from: i */
    public void m4191i() {
        List<InterfaceC0718j> list = this.f3257T;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4192k() {
        int count = this.f3265e.getCount();
        this.f3261a = count;
        boolean z = this.f3262b.size() < (this.f3285w * 2) + 1 && this.f3262b.size() < count;
        int iMax = this.f3266f;
        int i = 0;
        boolean z2 = false;
        while (i < this.f3262b.size()) {
            C0714f c0714f = this.f3262b.get(i);
            int itemPosition = this.f3265e.getItemPosition(c0714f.f3292a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f3262b.remove(i);
                    i--;
                    if (!z2) {
                        this.f3265e.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f3265e.destroyItem((ViewGroup) this, c0714f.f3293b, c0714f.f3292a);
                    int i2 = this.f3266f;
                    if (i2 == c0714f.f3293b) {
                        iMax = Math.max(0, Math.min(i2, count - 1));
                    }
                } else {
                    int i3 = c0714f.f3293b;
                    if (i3 != itemPosition) {
                        if (i3 == this.f3266f) {
                            iMax = itemPosition;
                        }
                        c0714f.f3293b = itemPosition;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.f3265e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f3262b, f3231J0);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C0715g c0715g = (C0715g) getChildAt(i4).getLayoutParams();
                if (!c0715g.f3297a) {
                    c0715g.f3299c = 0.0f;
                }
            }
            m4179U(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3243G0);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.f3273l <= 0 || this.f3274m == null || this.f3262b.size() <= 0 || this.f3265e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.f3273l / f2;
        int i2 = 0;
        C0714f c0714f = this.f3262b.get(0);
        float f4 = c0714f.f3296e;
        int size = this.f3262b.size();
        int i3 = c0714f.f3293b;
        int i4 = this.f3262b.get(size - 1).f3293b;
        while (i3 < i4) {
            while (true) {
                i = c0714f.f3293b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c0714f = this.f3262b.get(i2);
            }
            if (i3 == i) {
                float f5 = c0714f.f3296e;
                float f6 = c0714f.f3295d;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float pageWidth = this.f3265e.getPageWidth(i3);
                f = (f4 + pageWidth) * f2;
                f4 += pageWidth + f3;
            }
            if (this.f3273l + f > scrollX) {
                this.f3274m.setBounds(Math.round(f), this.f3275n, Math.round(this.f3273l + f), this.f3276o);
                this.f3274m.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m4156R();
            return false;
        }
        if (action != 0) {
            if (this.f3286x) {
                return true;
            }
            if (this.f3287y) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f3238E = x;
            this.f3236C = x;
            float y = motionEvent.getY();
            this.f3240F = y;
            this.f3237D = y;
            this.f3242G = motionEvent.getPointerId(0);
            this.f3287y = false;
            this.f3270j = true;
            this.mScroller.computeScrollOffset();
            if (this.f3245H0 != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.f3249L) {
                m4160j(false);
                this.f3286x = false;
            } else {
                this.mScroller.abortAnimation();
                this.f3284v = false;
                m4174K();
                this.f3286x = true;
                m4155Q(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f3242G;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f3236C;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f3240F);
                if (f != 0.0f && !m4149D(this.f3236C, f) && m4190h(this, false, (int) f, (int) x2, (int) y2)) {
                    this.f3236C = x2;
                    this.f3237D = y2;
                    this.f3287y = true;
                    return false;
                }
                int i2 = this.f3235B;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.f3286x = true;
                    m4155Q(true);
                    setScrollState(1);
                    float f2 = this.f3238E;
                    float f3 = this.f3235B;
                    this.f3236C = f > 0.0f ? f2 + f3 : f2 - f3;
                    this.f3237D = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.f3287y = true;
                }
                if (this.f3286x && m4152J(x2)) {
                    kkl0.m150146a0(this);
                }
            }
        } else if (action == 6) {
            m4150F(motionEvent);
        }
        if (this.f3244H == null) {
            this.f3244H = VelocityTracker.obtain();
        }
        this.f3244H.addMovement(motionEvent);
        return this.f3286x;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0714f c0714fM4198x;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0715g c0715g = (C0715g) childAt.getLayoutParams();
                if (c0715g.f3297a) {
                    int i9 = c0715g.f3298b;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, paddingTop + childAt.getMeasuredHeight());
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, paddingTop + childAt.getMeasuredHeight());
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C0715g c0715g2 = (C0715g) childAt2.getLayoutParams();
                if (!c0715g2.f3297a && (c0714fM4198x = m4198x(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c0714fM4198x.f3296e * f)) + paddingLeft;
                    if (c0715g2.f3300d) {
                        c0715g2.f3300d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0715g2.f3299c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f3275n = paddingTop;
        this.f3276o = i6 - paddingBottom;
        this.f3256S = i7;
        if (this.mFirstLayout) {
            z2 = false;
            m4157S(this.f3266f, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0715g c0715g;
        C0715g c0715g2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f3234A = Math.min(measuredWidth / 10, this.f3288z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c0715g2 = (C0715g) childAt.getLayoutParams()) != null && c0715g2.f3297a) {
                int i6 = c0715g2.f3298b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c0715g2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c0715g2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.f3280r = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f3281s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f3282t = true;
        m4174K();
        this.f3282t = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0715g = (C0715g) childAt2.getLayoutParams()) == null || !c0715g.f3297a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0715g.f3299c), 1073741824), this.f3281s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C0714f c0714fM4198x;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0714fM4198x = m4198x(childAt)) != null && c0714fM4198x.f3293b == this.f3266f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        cf60 cf60Var = this.f3265e;
        if (cf60Var != null) {
            cf60Var.restoreState(savedState.adapterState, savedState.loader);
            m4179U(savedState.position, false, true);
        } else {
            this.f3267g = savedState.position;
            this.f3268h = savedState.adapterState;
            this.f3269i = savedState.loader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.f3266f;
        cf60 cf60Var = this.f3265e;
        if (cf60Var != null) {
            savedState.adapterState = cf60Var.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f3273l;
            m4153M(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        cf60 cf60Var;
        if (this.f3250M) {
            return true;
        }
        boolean zM4156R = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (cf60Var = this.f3265e) == null || cf60Var.getCount() == 0) {
            return false;
        }
        if (this.f3244H == null) {
            this.f3244H = VelocityTracker.obtain();
        }
        this.f3244H.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.f3284v = false;
            m4174K();
            float x = motionEvent.getX();
            this.f3238E = x;
            this.f3236C = x;
            float y = motionEvent.getY();
            this.f3240F = y;
            this.f3237D = y;
            this.f3242G = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f3236C = motionEvent.getX(actionIndex);
                        this.f3242G = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m4150F(motionEvent);
                        this.f3236C = motionEvent.getX(motionEvent.findPointerIndex(this.f3242G));
                    }
                } else if (this.f3286x) {
                    m4157S(this.f3266f, true, 0, false);
                    zM4156R = m4156R();
                }
            } else if (!this.f3286x) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3242G);
                if (iFindPointerIndex == -1) {
                    zM4156R = m4156R();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f3236C);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f3237D);
                    if (fAbs > this.f3235B && fAbs > fAbs2) {
                        this.f3286x = true;
                        m4155Q(true);
                        float f = this.f3238E;
                        float f2 = x2 - f;
                        int i = this.f3235B;
                        this.f3236C = f2 > 0.0f ? f + i : f - i;
                        this.f3237D = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f3286x) {
                        zM4156R = m4152J(motionEvent.getX(motionEvent.findPointerIndex(this.f3242G)));
                    }
                }
            } else if (this.f3286x) {
                zM4156R = m4152J(motionEvent.getX(motionEvent.findPointerIndex(this.f3242G)));
            }
        } else if (this.f3286x) {
            VelocityTracker velocityTracker = this.f3244H;
            velocityTracker.computeCurrentVelocity(1000, this.f3247J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f3242G);
            this.f3284v = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0714f c0714fM4168y = m4168y();
            float f3 = clientWidth;
            m4180V(m4161l(c0714fM4168y.f3293b, ((scrollX / f3) - c0714fM4168y.f3296e) / (c0714fM4168y.f3295d + (this.f3273l / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3242G)) - this.f3238E)), true, true, xVelocity);
            zM4156R = m4156R();
        }
        if (zM4156R) {
            kkl0.m150146a0(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public float m4193p(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f3282t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m4194s() {
        if (!this.f3250M) {
            wtq0.m207906a("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.f3265e != null) {
            VelocityTracker velocityTracker = this.f3244H;
            velocityTracker.computeCurrentVelocity(1000, this.f3247J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f3242G);
            this.f3284v = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0714f c0714fM4168y = m4168y();
            m4180V(m4161l(c0714fM4168y.f3293b, ((scrollX / clientWidth) - c0714fM4168y.f3296e) / c0714fM4168y.f3295d, xVelocity, (int) (this.f3236C - this.f3238E)), true, true, xVelocity);
        }
        m4166r();
        this.f3250M = false;
    }

    public void setAdapter(@Nullable cf60 cf60Var) {
        cf60 cf60Var2 = this.f3265e;
        if (cf60Var2 != null) {
            cf60Var2.setViewPagerObserver(null);
            this.f3265e.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f3262b.size(); i++) {
                C0714f c0714f = this.f3262b.get(i);
                this.f3265e.destroyItem((ViewGroup) this, c0714f.f3293b, c0714f.f3292a);
            }
            this.f3265e.finishUpdate((ViewGroup) this);
            this.f3262b.clear();
            m4154N();
            this.f3266f = 0;
            scrollTo(0, 0);
        }
        cf60 cf60Var3 = this.f3265e;
        this.f3265e = cf60Var;
        this.f3261a = 0;
        if (cf60Var != null) {
            if (this.f3271k == null) {
                this.f3271k = new C0720l();
            }
            this.f3265e.setViewPagerObserver(this.f3271k);
            this.f3284v = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.f3261a = this.f3265e.getCount();
            if (this.f3267g >= 0) {
                this.f3265e.restoreState(this.f3268h, this.f3269i);
                m4179U(this.f3267g, false, true);
                this.f3267g = -1;
                this.f3268h = null;
                this.f3269i = null;
            } else if (z) {
                requestLayout();
            } else {
                m4174K();
            }
        }
        List<InterfaceC0717i> list = this.f3260W;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f3260W.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3260W.get(i2).onAdapterChanged(this, cf60Var3, cf60Var);
        }
    }

    public void setCurrentItem(int i) {
        this.f3284v = false;
        m4179U(i, !this.mFirstLayout, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.f3285w) {
            this.f3285w = i;
            m4174K();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0718j interfaceC0718j) {
        this.f3258U = interfaceC0718j;
    }

    public void setPageMargin(int i) {
        int i2 = this.f3273l;
        this.f3273l = i;
        int width = getWidth();
        m4153M(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.f3274m = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f3245H0 == i) {
            return;
        }
        this.f3245H0 = i;
        if (this.f3272k0 != null) {
            m4165q(i != 0);
        }
        m4164o(i);
    }

    /* JADX INFO: renamed from: t */
    public boolean m4195t(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? m4172G() : m4188e(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? m4173H() : m4188e(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return m4188e(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return m4188e(1);
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m4196u(float f) {
        if (!this.f3250M) {
            wtq0.m207906a("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.f3265e == null) {
            return;
        }
        this.f3236C += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.f3277p * clientWidth;
        float f3 = this.f3279q * clientWidth;
        C0714f c0714f = this.f3262b.get(0);
        ArrayList<C0714f> arrayList = this.f3262b;
        C0714f c0714f2 = arrayList.get(arrayList.size() - 1);
        if (c0714f.f3293b != 0) {
            f2 = c0714f.f3296e * clientWidth;
        }
        if (c0714f2.f3293b != this.f3265e.getCount() - 1) {
            f3 = c0714f2.f3296e * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.f3236C += scrollX - i;
        scrollTo(i, getScrollY());
        m4151I(i);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f3251N, SystemClock.uptimeMillis(), 2, this.f3236C, 0.0f, 0);
        this.f3244H.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3274m;
    }

    /* JADX INFO: renamed from: w */
    public C0714f m4197w(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m4198x(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* JADX INFO: renamed from: x */
    public C0714f m4198x(View view) {
        for (int i = 0; i < this.f3262b.size(); i++) {
            C0714f c0714f = this.f3262b.get(i);
            if (this.f3265e.isViewFromObject(view, c0714f.f3292a)) {
                return c0714f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public C0714f m4199z(int i) {
        for (int i2 = 0; i2 < this.f3262b.size(); i2++) {
            C0714f c0714f = this.f3262b.get(i2);
            if (c0714f.f3293b == i) {
                return c0714f;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(j26.m143192e(getContext(), i));
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C0715g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a */
        public boolean f3297a;

        /* JADX INFO: renamed from: b */
        public int f3298b;

        /* JADX INFO: renamed from: c */
        public float f3299c;

        /* JADX INFO: renamed from: d */
        public boolean f3300d;

        /* JADX INFO: renamed from: e */
        public int f3301e;

        /* JADX INFO: renamed from: f */
        public int f3302f;

        public C0715g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3299c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3230I0);
            this.f3298b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0715g() {
            super(-1, -1);
            this.f3299c = 0.0f;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0708a();
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        public static class C0708a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3262b = new ArrayList<>();
        this.f3263c = new C0714f();
        this.f3264d = new Rect();
        this.f3267g = -1;
        this.f3268h = null;
        this.f3269i = null;
        this.f3277p = -3.4028235E38f;
        this.f3279q = Float.MAX_VALUE;
        this.f3285w = 1;
        this.f3242G = -1;
        this.mFirstLayout = true;
        this.f3254Q = false;
        this.f3243G0 = new RunnableC0711c();
        this.f3245H0 = 0;
        m4169A();
    }
}
