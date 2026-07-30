package p028v.navigationbar;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l.aac0;
import l.b6c0;
import l.b9c0;
import l.dti0;
import l.gbl0;
import l.gc;
import l.ha80;
import l.hb80;
import l.ig3;
import l.j0c0;
import l.jb80;
import l.kbe;
import l.lb80;
import l.mji0;
import l.n8c0;
import l.nu0;
import l.qkq0;
import l.quw;
import l.u1c0;
import l.w660;
import org.eclipse.jetty.http.HttpStatus;
import org.java_websocket.framing.CloseFrame;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@ViewPager.e
public class VNavigationTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: E0 */
    public static final int f13397E0 = n8c0.n;

    /* JADX INFO: renamed from: F0 */
    public static final hb80<C1416f> f13398F0 = new lb80(16);

    /* JADX INFO: renamed from: A */
    public int f13399A;

    /* JADX INFO: renamed from: B */
    public int f13400B;

    /* JADX INFO: renamed from: C */
    public final int f13401C;

    /* JADX INFO: renamed from: D */
    public final int f13402D;

    /* JADX INFO: renamed from: E */
    public final int f13403E;

    /* JADX INFO: renamed from: F */
    public int f13404F;

    /* JADX INFO: renamed from: G */
    public int f13405G;

    /* JADX INFO: renamed from: H */
    public int f13406H;

    /* JADX INFO: renamed from: I */
    public int f13407I;

    /* JADX INFO: renamed from: J */
    public int f13408J;

    /* JADX INFO: renamed from: K */
    public boolean f13409K;

    /* JADX INFO: renamed from: L */
    public boolean f13410L;

    /* JADX INFO: renamed from: M */
    public boolean f13411M;

    /* JADX INFO: renamed from: N */
    @Nullable
    public InterfaceC1413c f13412N;

    /* JADX INFO: renamed from: O */
    public final ArrayList<InterfaceC1413c> f13413O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public InterfaceC1413c f13414P;

    /* JADX INFO: renamed from: Q */
    public ValueAnimator f13415Q;

    /* JADX INFO: renamed from: R */
    @Nullable
    public ViewPager f13416R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public w660 f13417S;

    /* JADX INFO: renamed from: T */
    public DataSetObserver f13418T;

    /* JADX INFO: renamed from: U */
    public C1417g f13419U;

    /* JADX INFO: renamed from: V */
    public C1412b f13420V;

    /* JADX INFO: renamed from: W */
    public boolean f13421W;

    /* JADX INFO: renamed from: a */
    public final ArrayList<C1416f> f13422a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C1416f f13423b;

    /* JADX INFO: renamed from: c */
    public final RectF f13424c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SlidingTabIndicator f13425d;

    /* JADX INFO: renamed from: e */
    public int f13426e;

    /* JADX INFO: renamed from: f */
    public int f13427f;

    /* JADX INFO: renamed from: g */
    public int f13428g;

    /* JADX INFO: renamed from: h */
    public int f13429h;

    /* JADX INFO: renamed from: i */
    public int f13430i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f13431j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f13432k;

    /* JADX INFO: renamed from: k0 */
    public final hb80<TabView> f13433k0;

    /* JADX INFO: renamed from: l */
    public ColorStateList f13434l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Drawable f13435m;

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode f13436n;

    /* JADX INFO: renamed from: o */
    public float f13437o;

    /* JADX INFO: renamed from: p */
    public float f13438p;

    /* JADX INFO: renamed from: p0 */
    public float f13439p0;

    /* JADX INFO: renamed from: q */
    public float f13440q;

    /* JADX INFO: renamed from: r */
    public int f13441r;

    /* JADX INFO: renamed from: s */
    public int f13442s;

    /* JADX INFO: renamed from: t */
    public int f13443t;

    /* JADX INFO: renamed from: u */
    public int f13444u;

    /* JADX INFO: renamed from: v */
    public int f13445v;

    /* JADX INFO: renamed from: w */
    public int f13446w;

    /* JADX INFO: renamed from: x */
    public float f13447x;

    /* JADX INFO: renamed from: y */
    public int f13448y;

    /* JADX INFO: renamed from: z */
    public int f13449z;

    public class SlidingTabIndicator extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public int f13450a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final Paint f13451b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final GradientDrawable f13452c;

        /* JADX INFO: renamed from: d */
        public int f13453d;

        /* JADX INFO: renamed from: e */
        public float f13454e;

        /* JADX INFO: renamed from: f */
        public int f13455f;

        /* JADX INFO: renamed from: g */
        public int f13456g;

        /* JADX INFO: renamed from: h */
        public int f13457h;

        /* JADX INFO: renamed from: i */
        public ValueAnimator f13458i;

        /* JADX INFO: renamed from: j */
        public int f13459j;

        /* JADX INFO: renamed from: k */
        public int f13460k;

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$SlidingTabIndicator$a */
        public class C1406a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f13462a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f13463b;

            public C1406a(int i, int i2) {
                this.f13462a = i;
                this.f13463b = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            @SuppressLint({"RestrictedApi"})
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (this.f13462a - SlidingTabIndicator.this.f13459j > 0) {
                    SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                    if (animatedFraction >= 0.5f) {
                        SlidingTabIndicator.this.m12139f(slidingTabIndicator.f13459j + Math.round((animatedFraction - 0.5f) * 2.0f * (this.f13462a - SlidingTabIndicator.this.f13459j)), SlidingTabIndicator.this.f13460k + Math.round(this.f13463b - SlidingTabIndicator.this.f13460k));
                        return;
                    } else {
                        SlidingTabIndicator.this.m12139f(slidingTabIndicator.f13459j, SlidingTabIndicator.this.f13460k + Math.round(animatedFraction * 2.0f * (this.f13463b - SlidingTabIndicator.this.f13460k)));
                        return;
                    }
                }
                SlidingTabIndicator slidingTabIndicator2 = SlidingTabIndicator.this;
                if (animatedFraction >= 0.5f) {
                    SlidingTabIndicator.this.m12139f(slidingTabIndicator2.f13459j + Math.round(this.f13462a - SlidingTabIndicator.this.f13459j), SlidingTabIndicator.this.f13460k + Math.round((animatedFraction - 0.5f) * 2.0f * (this.f13463b - SlidingTabIndicator.this.f13460k)));
                } else {
                    SlidingTabIndicator.this.m12139f(slidingTabIndicator2.f13459j + Math.round(animatedFraction * 2.0f * (this.f13462a - SlidingTabIndicator.this.f13459j)), SlidingTabIndicator.this.f13460k);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$SlidingTabIndicator$b */
        public class C1407b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f13465a;

            public C1407b(int i) {
                this.f13465a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                slidingTabIndicator.f13453d = this.f13465a;
                slidingTabIndicator.f13454e = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SlidingTabIndicator.this.f13453d = this.f13465a;
            }
        }

        public SlidingTabIndicator(Context context) {
            super(context);
            this.f13453d = -1;
            this.f13455f = -1;
            this.f13456g = -1;
            this.f13457h = -1;
            this.f13459j = -1;
            this.f13460k = -1;
            setWillNotDraw(false);
            this.f13451b = new Paint();
            this.f13452c = new GradientDrawable();
        }

        /* JADX INFO: renamed from: c */
        public void m12136c(int i, int i2) {
            ValueAnimator valueAnimator = this.f13458i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13458i.cancel();
            }
            m12144k(true, i, i2);
        }

        /* JADX INFO: renamed from: d */
        public final void m12137d(@NonNull TabView tabView, @NonNull RectF rectF) {
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int right = (tabView.getRight() - tabView.getLeft()) / 4;
            rectF.set(left - right, 0.0f, left + right, 0.0f);
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            super.draw(canvas);
            Drawable drawable = VNavigationTabLayout.this.f13435m;
            int height = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i = this.f13450a;
            if (i >= 0) {
                intrinsicHeight = i;
            }
            int i2 = VNavigationTabLayout.this.f13407I;
            if (i2 == 0) {
                height = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i2 == 1) {
                height = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i2 != 2) {
                intrinsicHeight = i2 != 3 ? 0 : getHeight();
            }
            int i3 = this.f13456g;
            if (i3 < 0 || this.f13457h <= i3) {
                return;
            }
            Drawable drawable2 = VNavigationTabLayout.this.f13435m;
            if (drawable2 == null) {
                drawable2 = this.f13452c;
            }
            Drawable drawableMutate = kbe.r(drawable2).mutate();
            drawableMutate.setBounds(this.f13456g, height, this.f13457h, intrinsicHeight);
            Paint paint = this.f13451b;
            if (paint != null) {
                kbe.n(drawableMutate, paint.getColor());
            }
            drawableMutate.draw(canvas);
        }

        /* JADX INFO: renamed from: e */
        public boolean m12138e() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public void m12139f(int i, int i2) {
            if (i == this.f13456g && i2 == this.f13457h) {
                return;
            }
            this.f13456g = i;
            this.f13457h = i2;
            gbl0.a0(this);
        }

        /* JADX INFO: renamed from: g */
        public void m12140g(int i, float f) {
            ValueAnimator valueAnimator = this.f13458i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13458i.cancel();
            }
            this.f13453d = i;
            this.f13454e = f;
            m12143j();
        }

        /* JADX INFO: renamed from: h */
        public void m12141h(int i) {
            if (this.f13451b.getColor() != i) {
                this.f13451b.setColor(i);
                gbl0.a0(this);
            }
        }

        /* JADX INFO: renamed from: i */
        public void m12142i(int i) {
            if (this.f13450a != i) {
                this.f13450a = i;
                gbl0.a0(this);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m12143j() {
            int left;
            int right;
            View childAt = getChildAt(this.f13453d);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
                if (!vNavigationTabLayout.f13410L && (childAt instanceof TabView)) {
                    m12137d((TabView) childAt, vNavigationTabLayout.f13424c);
                    left = (int) VNavigationTabLayout.this.f13424c.left;
                    right = (int) VNavigationTabLayout.this.f13424c.right;
                }
                if (this.f13454e > 0.0f && this.f13453d < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f13453d + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    VNavigationTabLayout vNavigationTabLayout2 = VNavigationTabLayout.this;
                    if (!vNavigationTabLayout2.f13410L && (childAt2 instanceof TabView)) {
                        m12137d((TabView) childAt2, vNavigationTabLayout2.f13424c);
                        left2 = (int) VNavigationTabLayout.this.f13424c.left;
                        right2 = (int) VNavigationTabLayout.this.f13424c.right;
                    }
                    float f = this.f13454e;
                    if (f >= 0.5d) {
                        left = (int) (left + ((f - 0.5f) * 2.0f * (left2 - left)));
                        right += right2 - right;
                    } else {
                        right = (int) (right + (f * 2.0f * (right2 - right)));
                    }
                }
            }
            m12139f(left, right);
        }

        /* JADX INFO: renamed from: k */
        public final void m12144k(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m12143j();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (!vNavigationTabLayout.f13410L && (childAt instanceof TabView)) {
                m12137d((TabView) childAt, vNavigationTabLayout.f13424c);
                left = (int) VNavigationTabLayout.this.f13424c.left;
                right = (int) VNavigationTabLayout.this.f13424c.right;
            }
            int i3 = this.f13456g;
            int i4 = this.f13457h;
            if (i3 == left && i4 == right) {
                return;
            }
            if (z) {
                this.f13459j = i3;
                this.f13460k = i4;
            }
            C1406a c1406a = new C1406a(left, right);
            if (!z) {
                this.f13458i.removeAllUpdateListeners();
                this.f13458i.addUpdateListener(c1406a);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13458i = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c1406a);
            valueAnimator.addListener(new C1407b(i));
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f13458i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m12143j();
            } else {
                m12144k(false, this.f13453d, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            boolean z = true;
            if (vNavigationTabLayout.f13405G == 1 || vNavigationTabLayout.f13408J == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    VNavigationTabLayout vNavigationTabLayout2 = VNavigationTabLayout.this;
                    vNavigationTabLayout2.f13405G = 0;
                    vNavigationTabLayout2.m12110M(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    public final class TabView extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public C1416f f13467a;

        /* JADX INFO: renamed from: b */
        public TextView f13468b;

        /* JADX INFO: renamed from: c */
        public ImageView f13469c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public View f13470d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public BadgeDrawable f13471e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public View f13472f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public TextView f13473g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public ImageView f13474h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public Drawable f13475i;

        /* JADX INFO: renamed from: j */
        public int f13476j;

        /* JADX INFO: renamed from: k */
        public ValueAnimator f13477k;

        /* JADX INFO: renamed from: l */
        public ArgbEvaluator f13478l;

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$a */
        public class ViewOnLayoutChangeListenerC1408a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f13480a;

            public ViewOnLayoutChangeListenerC1408a(View view) {
                this.f13480a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f13480a.getVisibility() == 0) {
                    TabView.this.m12161H(this.f13480a);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$b */
        public class C1409b implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f13482a;

            public C1409b(boolean z) {
                this.f13482a = z;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                boolean z = this.f13482a;
                TabView tabView = TabView.this;
                if (z) {
                    tabView.m12169l(animatedFraction);
                } else {
                    tabView.m12169l(1.0f - animatedFraction);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$c */
        public class C1410c extends AnimatorListenerAdapter {
            public C1410c() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TabView.this.m12162I();
                TabView tabView = TabView.this;
                tabView.m12163J(tabView.getContext());
                if (TabView.this.f13475i == null || !TabView.this.f13475i.isStateful()) {
                    return;
                }
                TabView.this.f13475i.setState(TabView.this.getDrawableState());
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public TabView(Context context) {
            super(context);
            this.f13476j = 2;
            this.f13478l = null;
            m12163J(context);
            gbl0.z0(this, VNavigationTabLayout.this.f13426e, VNavigationTabLayout.this.f13427f, VNavigationTabLayout.this.f13428g, VNavigationTabLayout.this.f13429h);
            setGravity(17);
            setOrientation(!VNavigationTabLayout.this.f13409K ? 1 : 0);
            setClickable(true);
            gbl0.A0(this, ha80.b(getContext(), CloseFrame.PROTOCOL_ERROR));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f13471e;
        }

        private int getContentWidth() {
            View[] viewArr = {this.f13468b, this.f13469c, this.f13472f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.f13471e == null) {
                this.f13471e = BadgeDrawable.create(getContext());
            }
            m12160G();
            BadgeDrawable badgeDrawable = this.f13471e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            qkq0.a("Unable to create badge");
            return null;
        }

        /* JADX INFO: renamed from: A */
        public void m12154A() {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13469c.getLayoutParams();
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f13445v;
            if (i != 0) {
                layoutParams.width = i;
            }
            int i2 = vNavigationTabLayout.f13446w;
            if (i2 != 0) {
                layoutParams.height = i2;
            }
            this.f13469c.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: B */
        public void m12155B(String str) {
            if (VNavigationTabLayout.this.f13438p > 0.0f) {
                TextPaint paint = this.f13468b.getPaint();
                paint.setTextSize(VNavigationTabLayout.this.f13437o);
                float fMeasureText = paint.measureText(str);
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                float f = fontMetricsInt.bottom - fontMetricsInt.top;
                paint.setTextSize(VNavigationTabLayout.this.f13438p);
                float fMeasureText2 = paint.measureText(str);
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                int i = (int) (((fMeasureText2 - fMeasureText) / 2.0f) + 0.5f);
                int i2 = (int) ((((fontMetricsInt2.bottom - fontMetricsInt2.top) - f) / 2.0f) + 0.5f);
                this.f13468b.setPadding(i, i2, i, i2);
            }
        }

        /* JADX INFO: renamed from: C */
        public void m12156C() {
            setTab(null);
            setSelected(false);
        }

        /* JADX INFO: renamed from: D */
        public void m12157D(int i, float f) {
            ValueAnimator valueAnimator = this.f13477k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13477k.cancel();
            }
            if (this.f13472f != null) {
                return;
            }
            if (f != 0.0f && f != 1.0f) {
                m12169l(f);
                return;
            }
            m12162I();
            m12163J(getContext());
            Drawable drawable = this.f13475i;
            if (drawable == null || !drawable.isStateful()) {
                return;
            }
            this.f13475i.setState(getDrawableState());
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: E */
        public final void m12158E(@Nullable View view) {
            if (m12181x() && view != null) {
                m12171n(false);
                BadgeUtils.attachBadgeDrawable(this.f13471e, view, m12180w(view));
                this.f13470d = view;
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: F */
        public final void m12159F() {
            if (m12181x()) {
                m12171n(true);
                View view = this.f13470d;
                if (view != null) {
                    BadgeUtils.detachBadgeDrawable(this.f13471e, view, m12180w(view));
                    this.f13470d = null;
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m12160G() {
            C1416f c1416f;
            C1416f c1416f2;
            if (m12181x()) {
                if (this.f13472f != null) {
                    m12159F();
                    return;
                }
                if (this.f13469c != null && (c1416f2 = this.f13467a) != null && c1416f2.m12192e() != null) {
                    View view = this.f13470d;
                    ImageView imageView = this.f13469c;
                    if (view == imageView) {
                        m12161H(imageView);
                        return;
                    } else {
                        m12159F();
                        m12158E(this.f13469c);
                        return;
                    }
                }
                if (this.f13468b == null || (c1416f = this.f13467a) == null || c1416f.m12194g() != 1) {
                    m12159F();
                    return;
                }
                View view2 = this.f13470d;
                TextView textView = this.f13468b;
                if (view2 == textView) {
                    m12161H(textView);
                } else {
                    m12159F();
                    m12158E(this.f13468b);
                }
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: H */
        public final void m12161H(@NonNull View view) {
            if (m12181x() && view == this.f13470d) {
                BadgeUtils.setBadgeDrawableBounds(this.f13471e, view, m12180w(view));
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m12162I() {
            C1416f c1416f = this.f13467a;
            Drawable drawableMutate = null;
            View viewM12191d = c1416f != null ? c1416f.m12191d() : null;
            if (viewM12191d != null) {
                ViewParent parent = viewM12191d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM12191d);
                    }
                    addView(viewM12191d);
                }
                this.f13472f = viewM12191d;
                TextView textView = this.f13468b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f13469c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f13469c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewM12191d.findViewById(R.id.text1);
                this.f13473g = textView2;
                if (textView2 != null) {
                    this.f13476j = mji0.d(textView2);
                }
                this.f13474h = (ImageView) viewM12191d.findViewById(R.id.icon);
            } else {
                View view = this.f13472f;
                if (view != null) {
                    removeView(view);
                    this.f13472f = null;
                }
                this.f13473g = null;
                this.f13474h = null;
            }
            if (this.f13472f == null) {
                if (this.f13469c == null) {
                    m12182y();
                }
                if (c1416f != null && c1416f.m12192e() != null) {
                    drawableMutate = kbe.r(c1416f.m12192e()).mutate();
                }
                if (drawableMutate != null) {
                    kbe.o(drawableMutate, VNavigationTabLayout.this.f13432k);
                    PorterDuff.Mode mode = VNavigationTabLayout.this.f13436n;
                    if (mode != null) {
                        kbe.p(drawableMutate, mode);
                    }
                }
                if (this.f13468b == null) {
                    m12183z();
                    this.f13476j = mji0.d(this.f13468b);
                }
                ColorStateList colorStateList = VNavigationTabLayout.this.f13431j;
                if (colorStateList != null) {
                    this.f13468b.setTextColor(colorStateList);
                }
                m12166M(this.f13468b, this.f13469c);
                m12160G();
                m12167j(this.f13469c);
                m12167j(this.f13468b);
            } else {
                TextView textView3 = this.f13473g;
                if (textView3 != null || this.f13474h != null) {
                    m12166M(textView3, this.f13474h);
                }
            }
            if (c1416f != null && !TextUtils.isEmpty(c1416f.f13492d)) {
                setContentDescription(c1416f.f13492d);
            }
            setSelected(c1416f != null && c1416f.m12196i());
        }

        /* JADX INFO: renamed from: J */
        public final void m12163J(Context context) {
            GradientDrawable gradientDrawable;
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f13448y;
            if (i != 0) {
                Drawable drawableB = nu0.b(context, i);
                this.f13475i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f13475i.setState(getDrawableState());
                }
            } else if (vNavigationTabLayout.f13449z == 0 && vNavigationTabLayout.f13399A == 0) {
                this.f13475i = null;
            } else {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                VNavigationTabLayout vNavigationTabLayout2 = VNavigationTabLayout.this;
                int i2 = vNavigationTabLayout2.f13449z;
                if (i2 == 0) {
                    i2 = 0;
                }
                int i3 = vNavigationTabLayout2.f13399A;
                if (i3 == 0) {
                    i3 = 0;
                }
                gradientDrawable2.setColor(VNavigationTabLayout.m12097o(i2, i3));
                this.f13475i = gradientDrawable2;
            }
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(0);
            Drawable rippleDrawable = gradientDrawable3;
            if (VNavigationTabLayout.this.f13434l != null) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setCornerRadius(1.0E-5f);
                gradientDrawable4.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(VNavigationTabLayout.this.f13434l);
                boolean z = VNavigationTabLayout.this.f13411M;
                if (z) {
                    gradientDrawable = gradientDrawable3;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, z ? null : gradientDrawable4);
            }
            gbl0.m0(this, rippleDrawable);
            VNavigationTabLayout.this.invalidate();
        }

        /* JADX INFO: renamed from: K */
        public final void m12164K(boolean z, boolean z2, int i) {
            C1409b c1409b = new C1409b(z2);
            if (!z) {
                this.f13477k.removeAllUpdateListeners();
                this.f13477k.addUpdateListener(c1409b);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13477k = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f13477k.setDuration(i);
            this.f13477k.setFloatValues(0.0f, 1.0f);
            this.f13477k.addUpdateListener(c1409b);
            this.f13477k.addListener(new C1410c());
            this.f13477k.start();
        }

        /* JADX INFO: renamed from: L */
        public final void m12165L() {
            setOrientation(!VNavigationTabLayout.this.f13409K ? 1 : 0);
            TextView textView = this.f13473g;
            if (textView == null && this.f13474h == null) {
                m12166M(this.f13468b, this.f13469c);
            } else {
                m12166M(textView, this.f13474h);
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: M */
        public final void m12166M(@Nullable TextView textView, @Nullable ImageView imageView) {
            C1416f c1416f = this.f13467a;
            Drawable drawableMutate = (c1416f == null || c1416f.m12192e() == null) ? null : kbe.r(this.f13467a.m12192e()).mutate();
            C1416f c1416f2 = this.f13467a;
            CharSequence charSequenceM12195h = c1416f2 != null ? c1416f2.m12195h() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM12195h);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(charSequenceM12195h);
                    if (this.f13467a.f13495g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDpToPx = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) ViewUtils.dpToPx(getContext(), 8);
                if (VNavigationTabLayout.this.f13409K) {
                    if (iDpToPx != quw.a(marginLayoutParams)) {
                        quw.c(marginLayoutParams, iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    quw.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C1416f c1416f3 = this.f13467a;
            dti0.a(this, zIsEmpty ? c1416f3 != null ? c1416f3.f13492d : null : null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f13475i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f13475i.setState(drawableState)) {
                invalidate();
                VNavigationTabLayout.this.invalidate();
            }
        }

        @Nullable
        public ImageView getIconView() {
            return this.f13469c;
        }

        @Nullable
        public C1416f getTab() {
            return this.f13467a;
        }

        @Nullable
        public TextView getTextView() {
            return this.f13468b;
        }

        /* JADX INFO: renamed from: j */
        public final void m12167j(@Nullable View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1408a(view));
        }

        /* JADX INFO: renamed from: k */
        public void m12168k(boolean z, int i) {
            ValueAnimator valueAnimator = this.f13477k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13477k.cancel();
            }
            m12164K(true, z, i);
        }

        /* JADX INFO: renamed from: l */
        public final void m12169l(float f) {
            int iM12174q;
            TextView textView = this.f13468b;
            if (textView != null) {
                float fM12178u = m12178u(f);
                if (fM12178u >= 0.0f) {
                    textView.setScaleX(fM12178u);
                    textView.setScaleY(fM12178u);
                }
                int iM12179v = m12179v(f);
                if (iM12179v != -1) {
                    textView.setTextColor(iM12179v);
                }
            }
            ImageView imageView = this.f13469c;
            if (imageView != null) {
                int iM12176s = m12176s(f);
                if (iM12176s != -1) {
                    Drawable drawableMutate = imageView.getDrawable() != null ? kbe.r(imageView.getDrawable()).mutate() : null;
                    if (drawableMutate != null) {
                        kbe.o(drawableMutate, VNavigationTabLayout.m12097o(iM12176s, iM12176s));
                    }
                }
                float fM12177t = m12177t(f);
                if (fM12177t >= 0.0f) {
                    imageView.setScaleX(fM12177t);
                    imageView.setScaleY(fM12177t);
                }
            }
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f13449z;
            if (i == 0 || i == vNavigationTabLayout.f13399A || (iM12174q = m12174q(f)) == -1) {
                return;
            }
            Drawable background = getBackground();
            if (!(background instanceof GradientDrawable)) {
                background = new GradientDrawable();
            }
            ((GradientDrawable) background).setColor(VNavigationTabLayout.m12097o(iM12174q, iM12174q));
            gbl0.m0(this, background);
        }

        /* JADX INFO: renamed from: m */
        public final float m12170m(@NonNull Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* JADX INFO: renamed from: n */
        public final void m12171n(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: o */
        public final FrameLayout m12172o() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f13471e;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f13471e.getContentDescription()));
            }
            gc gcVarT0 = gc.T0(accessibilityNodeInfo);
            gcVarT0.r0(gc.f.a(0, 1, this.f13467a.m12193f(), 1, false, isSelected()));
            if (isSelected()) {
                gcVarT0.p0(false);
                gcVarT0.f0(gc.a.i);
            }
            gcVarT0.I0("Tab");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f13477k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            m12164K(false, false, -1);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = VNavigationTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(VNavigationTabLayout.this.f13400B, PKIFailureInfo.systemUnavail);
            }
            super.onMeasure(i, i2);
            if (this.f13468b != null) {
                float f = VNavigationTabLayout.this.f13437o;
                int i3 = this.f13476j;
                ImageView imageView = this.f13469c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f13468b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = VNavigationTabLayout.this.f13440q;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f13468b.getTextSize();
                int lineCount = this.f13468b.getLineCount();
                int iD = mji0.d(this.f13468b);
                if (f != textSize || (iD >= 0 && i3 != iD)) {
                    if (VNavigationTabLayout.this.f13408J != 1 || f <= textSize || lineCount != 1 || ((layout = this.f13468b.getLayout()) != null && m12170m(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f13468b.setTextSize(0, f);
                        this.f13468b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m12173p(@NonNull Canvas canvas) {
            Drawable drawable = this.f13475i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f13475i.draw(canvas);
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f13467a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f13467a.m12198k();
            return true;
        }

        /* JADX INFO: renamed from: q */
        public int m12174q(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m12175r(f, vNavigationTabLayout.f13399A, vNavigationTabLayout.f13449z);
        }

        /* JADX INFO: renamed from: r */
        public final int m12175r(float f, @ColorInt int i, @ColorInt int i2) {
            if (i == 0) {
                return -1;
            }
            if (this.f13478l == null) {
                this.f13478l = new ArgbEvaluator();
            }
            if (VNavigationTabLayout.this.f13431j != null) {
                return ((Integer) this.f13478l.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
            }
            return -1;
        }

        /* JADX INFO: renamed from: s */
        public int m12176s(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m12175r(f, vNavigationTabLayout.f13443t, vNavigationTabLayout.f13444u);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.f13468b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f13469c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f13472f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable C1416f c1416f) {
            if (c1416f != this.f13467a) {
                this.f13467a = c1416f;
                m12162I();
            }
        }

        /* JADX INFO: renamed from: t */
        public float m12177t(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (vNavigationTabLayout.f13446w <= 0 || vNavigationTabLayout.f13445v <= 0) {
                return -1.0f;
            }
            float f2 = vNavigationTabLayout.f13447x;
            if (f2 <= 0.0f) {
                return -1.0f;
            }
            return f2 - (f * (f2 - 1.0f));
        }

        /* JADX INFO: renamed from: u */
        public float m12178u(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            float f2 = vNavigationTabLayout.f13438p;
            if (f2 <= 0.0f) {
                return -1.0f;
            }
            float f3 = vNavigationTabLayout.f13437o;
            return (f2 / f3) - (f * ((f2 / f3) - 1.0f));
        }

        /* JADX INFO: renamed from: v */
        public int m12179v(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m12175r(f, vNavigationTabLayout.f13441r, vNavigationTabLayout.f13442s);
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        public final FrameLayout m12180w(@NonNull View view) {
            if ((view == this.f13469c || view == this.f13468b) && BadgeUtils.USE_COMPAT_PARENT) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: renamed from: x */
        public final boolean m12181x() {
            return this.f13471e != null;
        }

        /* JADX INFO: renamed from: y */
        public final void m12182y() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutM12172o = m12172o();
                addView(frameLayoutM12172o, 0);
                viewGroup = frameLayoutM12172o;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(b6c0.z, viewGroup, false);
            this.f13469c = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* JADX INFO: renamed from: z */
        public final void m12183z() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutM12172o = m12172o();
                addView(frameLayoutM12172o);
                viewGroup = frameLayoutM12172o;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(b6c0.A, viewGroup, false);
            this.f13468b = textView;
            viewGroup.addView(textView);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$a */
    public class C1411a implements ValueAnimator.AnimatorUpdateListener {
        public C1411a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            VNavigationTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$b */
    public class C1412b implements ViewPager.i {

        /* JADX INFO: renamed from: a */
        public boolean f13486a;

        public C1412b() {
        }

        /* JADX INFO: renamed from: a */
        public void m12184a(boolean z) {
            this.f13486a = z;
        }

        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable w660 w660Var, @Nullable w660 w660Var2) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (vNavigationTabLayout.f13416R == viewPager) {
                vNavigationTabLayout.m12103F(w660Var2, this.f13486a);
            }
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$c */
    @Deprecated
    public interface InterfaceC1413c<T extends C1416f> {
        /* JADX INFO: renamed from: a */
        void mo12185a(T t);

        /* JADX INFO: renamed from: b */
        void mo12186b(T t);

        /* JADX INFO: renamed from: c */
        void mo12187c(T t);
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$d */
    public interface InterfaceC1414d extends InterfaceC1413c<C1416f> {
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$e */
    public class C1415e extends DataSetObserver {
        public C1415e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VNavigationTabLayout.this.m12132y();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VNavigationTabLayout.this.m12132y();
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$f */
    public static class C1416f {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Object f13489a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Drawable f13490b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public CharSequence f13491c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public CharSequence f13492d;

        /* JADX INFO: renamed from: f */
        @Nullable
        public View f13494f;

        /* JADX INFO: renamed from: h */
        @Nullable
        public VNavigationTabLayout f13496h;

        /* JADX INFO: renamed from: i */
        @NonNull
        public TabView f13497i;

        /* JADX INFO: renamed from: e */
        public int f13493e = -1;

        /* JADX INFO: renamed from: g */
        public int f13495g = 1;

        @Nullable
        /* JADX INFO: renamed from: d */
        public View m12191d() {
            return this.f13494f;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public Drawable m12192e() {
            return this.f13490b;
        }

        /* JADX INFO: renamed from: f */
        public int m12193f() {
            return this.f13493e;
        }

        /* JADX INFO: renamed from: g */
        public int m12194g() {
            return this.f13495g;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public CharSequence m12195h() {
            return this.f13491c;
        }

        /* JADX INFO: renamed from: i */
        public boolean m12196i() {
            VNavigationTabLayout vNavigationTabLayout = this.f13496h;
            if (vNavigationTabLayout != null) {
                return vNavigationTabLayout.getSelectedTabPosition() == this.f13493e;
            }
            ig3.a("Tab not attached to a TabLayout");
            return false;
        }

        /* JADX INFO: renamed from: j */
        public void m12197j() {
            this.f13496h = null;
            this.f13497i = null;
            this.f13489a = null;
            this.f13490b = null;
            this.f13491c = null;
            this.f13492d = null;
            this.f13493e = -1;
            this.f13494f = null;
        }

        /* JADX INFO: renamed from: k */
        public void m12198k() {
            VNavigationTabLayout vNavigationTabLayout = this.f13496h;
            if (vNavigationTabLayout != null) {
                vNavigationTabLayout.m12101D(this);
            } else {
                ig3.a("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public C1416f m12199l(@Nullable CharSequence charSequence) {
            this.f13492d = charSequence;
            m12205r();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: m */
        public C1416f m12200m(@LayoutRes int i) {
            return m12201n(LayoutInflater.from(this.f13497i.getContext()).inflate(i, (ViewGroup) this.f13497i, false));
        }

        @NonNull
        /* JADX INFO: renamed from: n */
        public C1416f m12201n(@Nullable View view) {
            this.f13494f = view;
            m12205r();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: o */
        public C1416f m12202o(@Nullable Drawable drawable) {
            this.f13490b = drawable;
            VNavigationTabLayout vNavigationTabLayout = this.f13496h;
            if (vNavigationTabLayout.f13405G == 1 || vNavigationTabLayout.f13408J == 2) {
                vNavigationTabLayout.m12110M(true);
            }
            m12205r();
            if (BadgeUtils.USE_COMPAT_PARENT && this.f13497i.m12181x() && this.f13497i.f13471e.isVisible()) {
                this.f13497i.invalidate();
            }
            this.f13497i.m12154A();
            return this;
        }

        /* JADX INFO: renamed from: p */
        public void m12203p(int i) {
            this.f13493e = i;
        }

        @NonNull
        /* JADX INFO: renamed from: q */
        public C1416f m12204q(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f13492d) && !TextUtils.isEmpty(charSequence)) {
                this.f13497i.setContentDescription(charSequence);
            }
            this.f13491c = charSequence;
            if (charSequence != null && charSequence.length() > 0) {
                this.f13497i.m12155B(charSequence.toString());
            }
            m12205r();
            return this;
        }

        /* JADX INFO: renamed from: r */
        public void m12205r() {
            TabView tabView = this.f13497i;
            if (tabView != null) {
                tabView.m12162I();
            }
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$g */
    public static class C1417g implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<VNavigationTabLayout> f13498a;

        /* JADX INFO: renamed from: b */
        public int f13499b;

        /* JADX INFO: renamed from: c */
        public int f13500c;

        public C1417g(VNavigationTabLayout vNavigationTabLayout) {
            this.f13498a = new WeakReference<>(vNavigationTabLayout);
        }

        /* JADX INFO: renamed from: a */
        public void m12206a() {
            this.f13500c = 0;
            this.f13499b = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f13499b = this.f13500c;
            this.f13500c = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            VNavigationTabLayout vNavigationTabLayout = this.f13498a.get();
            if (vNavigationTabLayout != null) {
                int i3 = this.f13500c;
                vNavigationTabLayout.m12105H(i, f, i3 != 2 || this.f13499b == 1, (i3 == 2 && this.f13499b == 0) ? false : true);
            }
        }

        public void onPageSelected(int i) {
            VNavigationTabLayout vNavigationTabLayout = this.f13498a.get();
            if (vNavigationTabLayout == null || vNavigationTabLayout.getSelectedTabPosition() == i || i >= vNavigationTabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f13500c;
            vNavigationTabLayout.m12102E(vNavigationTabLayout.m12130w(i), i2 == 0 || (i2 == 2 && this.f13499b == 0));
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$h */
    public static class C1418h implements InterfaceC1414d {

        /* JADX INFO: renamed from: a */
        public final ViewPager f13501a;

        public C1418h(ViewPager viewPager) {
            this.f13501a = viewPager;
        }

        @Override // p028v.navigationbar.VNavigationTabLayout.InterfaceC1413c
        /* JADX INFO: renamed from: a */
        public void mo12185a(C1416f c1416f) {
            if (c1416f.f13497i.f13468b != null) {
                c1416f.f13497i.f13468b.setTypeface(Typeface.DEFAULT);
            }
        }

        @Override // p028v.navigationbar.VNavigationTabLayout.InterfaceC1413c
        /* JADX INFO: renamed from: b */
        public void mo12186b(C1416f c1416f) {
        }

        @Override // p028v.navigationbar.VNavigationTabLayout.InterfaceC1413c
        /* JADX INFO: renamed from: c */
        public void mo12187c(@NonNull C1416f c1416f) {
            this.f13501a.setCurrentItem(c1416f.m12193f());
            if (c1416f.f13497i.f13468b != null) {
                c1416f.f13497i.f13468b.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public VNavigationTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13422a = new ArrayList<>();
        this.f13424c = new RectF();
        this.f13438p = -1.0f;
        this.f13441r = 0;
        this.f13443t = 0;
        this.f13445v = 0;
        this.f13446w = 0;
        this.f13447x = -1.0f;
        this.f13449z = 0;
        this.f13399A = 0;
        this.f13400B = Integer.MAX_VALUE;
        this.f13413O = new ArrayList<>();
        this.f13433k0 = new jb80(12);
        this.f13439p0 = 0.0f;
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f13425d = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, b9c0.j2, i, f13397E0, new int[]{b9c0.O2});
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(gbl0.t(this));
            gbl0.m0(this, materialShapeDrawable);
        }
        slidingTabIndicator.m12142i(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.y2, -1));
        slidingTabIndicator.m12141h(typedArrayObtainStyledAttributes.getColor(b9c0.v2, 0));
        setSelectedTabIndicator(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, b9c0.t2));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(b9c0.x2, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(b9c0.w2, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.F2, 0);
        this.f13429h = dimensionPixelSize;
        this.f13428g = dimensionPixelSize;
        this.f13427f = dimensionPixelSize;
        this.f13426e = dimensionPixelSize;
        this.f13426e = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.I2, dimensionPixelSize);
        this.f13427f = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.J2, this.f13427f);
        this.f13428g = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.H2, this.f13428g);
        this.f13429h = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.G2, this.f13429h);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.O2, n8c0.h);
        this.f13430i = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, aac0.V2);
        try {
            this.f13437o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(aac0.W2, 0);
            this.f13431j = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, aac0.Z2);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.Q2)) {
                float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.Q2, 0);
                this.f13437o = dimensionPixelSize2;
                this.f13438p = dimensionPixelSize2;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.N2)) {
                this.f13438p = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.N2, 0);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.P2)) {
                ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, b9c0.P2);
                this.f13431j = colorStateList;
                this.f13442s = colorStateList != null ? colorStateList.getDefaultColor() : -7829368;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.M2)) {
                int color = typedArrayObtainStyledAttributes.getColor(b9c0.M2, 0);
                ColorStateList colorStateListM12097o = m12097o(this.f13431j.getDefaultColor(), color);
                this.f13431j = colorStateListM12097o;
                this.f13442s = colorStateListM12097o.getDefaultColor();
                this.f13441r = color;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.q2)) {
                ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, b9c0.q2);
                this.f13432k = colorStateList2;
                int defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : -7829368;
                this.f13444u = defaultColor;
                this.f13443t = defaultColor;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.L2)) {
                int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.L2, 0);
                ColorStateList colorStateListM12097o2 = m12097o(this.f13432k.getDefaultColor(), color2);
                this.f13432k = colorStateListM12097o2;
                this.f13444u = colorStateListM12097o2.getDefaultColor();
                this.f13443t = color2;
            }
            this.f13436n = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(b9c0.r2, -1), (PorterDuff.Mode) null);
            this.f13434l = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, b9c0.K2);
            this.f13406H = typedArrayObtainStyledAttributes.getInt(b9c0.u2, HttpStatus.MULTIPLE_CHOICES_300);
            this.f13401C = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.D2, -1);
            this.f13402D = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.C2, -1);
            this.f13448y = typedArrayObtainStyledAttributes.getResourceId(b9c0.k2, 0);
            this.f13404F = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.l2, 0);
            this.f13408J = typedArrayObtainStyledAttributes.getInt(b9c0.E2, 1);
            this.f13405G = typedArrayObtainStyledAttributes.getInt(b9c0.m2, 0);
            this.f13409K = typedArrayObtainStyledAttributes.getBoolean(b9c0.z2, false);
            this.f13411M = typedArrayObtainStyledAttributes.getBoolean(b9c0.R2, false);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.s2)) {
                this.f13445v = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.s2, -2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.n2)) {
                this.f13446w = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.n2, -2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.p2)) {
                int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.p2, -2);
                this.f13446w = layoutDimension;
                this.f13445v = layoutDimension;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.o2)) {
                this.f13447x = typedArrayObtainStyledAttributes.getFloat(b9c0.o2, 1.0f);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.A2)) {
                this.f13449z = typedArrayObtainStyledAttributes.getColor(b9c0.A2, 0);
                this.f13448y = 0;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.B2)) {
                this.f13399A = typedArrayObtainStyledAttributes.getColor(b9c0.B2, 0);
                this.f13448y = 0;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f13440q = getResources().getDimensionPixelSize(u1c0.n);
            this.f13403E = 0;
            m12120l();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f13422a.size();
        for (int i = 0; i < size; i++) {
            C1416f c1416f = this.f13422a.get(i);
            if (c1416f != null && c1416f.m12192e() != null && !TextUtils.isEmpty(c1416f.m12195h())) {
                return !this.f13409K ? 72 : 44;
            }
        }
        return 44;
    }

    private int getTabMinWidth() {
        int i = this.f13401C;
        if (i != -1) {
            return i;
        }
        int i2 = this.f13408J;
        if (i2 == 0 || i2 == 2) {
            return this.f13403E;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f13425d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static ColorStateList m12097o(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f13425d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f13425d.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m12098A() {
        for (int childCount = this.f13425d.getChildCount() - 1; childCount >= 0; childCount--) {
            m12100C(childCount);
        }
        Iterator<C1416f> it = this.f13422a.iterator();
        while (it.hasNext()) {
            C1416f next = it.next();
            it.remove();
            next.m12197j();
            m12133z(next);
        }
        this.f13423b = null;
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public void m12099B(@Nullable InterfaceC1413c interfaceC1413c) {
        this.f13413O.remove(interfaceC1413c);
    }

    /* JADX INFO: renamed from: C */
    public final void m12100C(int i) {
        TabView tabView = (TabView) this.f13425d.getChildAt(i);
        this.f13425d.removeViewAt(i);
        if (tabView != null) {
            tabView.m12156C();
            this.f13433k0.release(tabView);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: D */
    public void m12101D(@Nullable C1416f c1416f) {
        m12102E(c1416f, true);
    }

    /* JADX INFO: renamed from: E */
    public void m12102E(@Nullable C1416f c1416f, boolean z) {
        C1416f c1416f2 = this.f13423b;
        if (c1416f2 == c1416f) {
            if (c1416f2 != null) {
                m12126s(c1416f);
                m12118j(c1416f.m12193f());
                return;
            }
            return;
        }
        int iM12193f = c1416f != null ? c1416f.m12193f() : -1;
        if (z) {
            if ((c1416f2 == null || c1416f2.m12193f() == -1) && iM12193f != -1) {
                m12104G(iM12193f, 0.0f, true);
            } else {
                m12118j(iM12193f);
            }
            if (iM12193f != -1) {
                setSelectedTabView(iM12193f);
            }
        }
        this.f13423b = c1416f;
        if (c1416f2 != null) {
            m12128u(c1416f2);
        }
        if (c1416f != null) {
            m12127t(c1416f);
            float fM12178u = c1416f.f13497i.m12178u(0.0f);
            if (fM12178u >= 0.0f) {
                c1416f.f13497i.f13468b.setScaleY(fM12178u);
                c1416f.f13497i.f13468b.setScaleX(fM12178u);
            }
            float fM12177t = c1416f.f13497i.m12177t(0.0f);
            if (fM12177t >= 0.0f) {
                c1416f.f13497i.f13469c.setScaleX(fM12177t);
                c1416f.f13497i.f13469c.setScaleY(fM12177t);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m12103F(@Nullable w660 w660Var, boolean z) {
        DataSetObserver dataSetObserver;
        w660 w660Var2 = this.f13417S;
        if (w660Var2 != null && (dataSetObserver = this.f13418T) != null) {
            w660Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f13417S = w660Var;
        if (z && w660Var != null) {
            if (this.f13418T == null) {
                this.f13418T = new C1415e();
            }
            w660Var.registerDataSetObserver(this.f13418T);
        }
        m12132y();
    }

    /* JADX INFO: renamed from: G */
    public void m12104G(int i, float f, boolean z) {
        m12105H(i, f, z, true);
    }

    /* JADX INFO: renamed from: H */
    public void m12105H(int i, float f, boolean z, boolean z2) {
        C1416f c1416fM12130w;
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.f13425d.getChildCount()) {
            return;
        }
        if (z2) {
            this.f13425d.m12140g(i, f);
        }
        if (z2 && (c1416fM12130w = m12130w(i)) != null) {
            c1416fM12130w.f13497i.m12157D(i, f);
            int i2 = i + 1;
            if (f == 0.0f && this.f13439p0 > 0.5d) {
                i2 = i - 1;
            }
            C1416f c1416fM12130w2 = m12130w(i2);
            if (c1416fM12130w2 != null) {
                c1416fM12130w2.f13497i.m12157D(i2, 1.0f - f);
            }
            this.f13439p0 = f;
        }
        ValueAnimator valueAnimator = this.f13415Q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f13415Q.cancel();
        }
        scrollTo(m12121m(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m12106I(@Nullable ViewPager viewPager, boolean z) {
        m12107J(viewPager, z, false);
    }

    /* JADX INFO: renamed from: J */
    public final void m12107J(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f13416R;
        if (viewPager2 != null) {
            C1417g c1417g = this.f13419U;
            if (c1417g != null) {
                viewPager2.P(c1417g);
            }
            C1412b c1412b = this.f13420V;
            if (c1412b != null) {
                this.f13416R.O(c1412b);
            }
        }
        InterfaceC1413c interfaceC1413c = this.f13414P;
        if (interfaceC1413c != null) {
            m12099B(interfaceC1413c);
            this.f13414P = null;
        }
        if (viewPager != null) {
            this.f13416R = viewPager;
            if (this.f13419U == null) {
                this.f13419U = new C1417g(this);
            }
            this.f13419U.m12206a();
            viewPager.d(this.f13419U);
            C1418h c1418h = new C1418h(viewPager);
            this.f13414P = c1418h;
            m12111c(c1418h);
            w660 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m12103F(adapter, z);
            }
            if (this.f13420V == null) {
                this.f13420V = new C1412b();
            }
            this.f13420V.m12184a(z);
            viewPager.c(this.f13420V);
            m12104G(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f13416R = null;
            m12103F(null, false);
        }
        this.f13421W = z2;
    }

    /* JADX INFO: renamed from: K */
    public final void m12108K() {
        int size = this.f13422a.size();
        for (int i = 0; i < size; i++) {
            this.f13422a.get(i).m12205r();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m12109L(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f13408J == 1 && this.f13405G == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m12110M(boolean z) {
        for (int i = 0; i < this.f13425d.getChildCount(); i++) {
            View childAt = this.f13425d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m12109L((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m12117i(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m12111c(@Nullable InterfaceC1413c interfaceC1413c) {
        if (this.f13413O.contains(interfaceC1413c)) {
            return;
        }
        this.f13413O.add(interfaceC1413c);
    }

    /* JADX INFO: renamed from: d */
    public void m12112d(@NonNull C1416f c1416f) {
        m12114f(c1416f, this.f13422a.isEmpty());
    }

    /* JADX INFO: renamed from: e */
    public void m12113e(@NonNull C1416f c1416f, int i, boolean z) {
        if (c1416f.f13496h != this) {
            ig3.a("Tab belongs to a different TabLayout.");
            return;
        }
        m12122n(c1416f, i);
        m12116h(c1416f);
        if (z) {
            c1416f.m12198k();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m12114f(@NonNull C1416f c1416f, boolean z) {
        m12113e(c1416f, this.f13422a.size(), z);
    }

    /* JADX INFO: renamed from: g */
    public final void m12115g(@NonNull NavigationTabItem navigationTabItem) {
        C1416f c1416fM12131x = m12131x();
        CharSequence charSequence = navigationTabItem.f13386a;
        if (charSequence != null) {
            c1416fM12131x.m12204q(charSequence);
        }
        Drawable drawable = navigationTabItem.f13387b;
        if (drawable != null) {
            c1416fM12131x.m12202o(drawable);
        }
        int i = navigationTabItem.f13388c;
        if (i != 0) {
            c1416fM12131x.m12200m(i);
        }
        if (!TextUtils.isEmpty(navigationTabItem.getContentDescription())) {
            c1416fM12131x.m12199l(navigationTabItem.getContentDescription());
        }
        m12112d(c1416fM12131x);
    }

    public int getSelectedTabPosition() {
        C1416f c1416f = this.f13423b;
        if (c1416f != null) {
            return c1416f.m12193f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f13422a.size();
    }

    public int getTabGravity() {
        return this.f13405G;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f13432k;
    }

    public int getTabIndicatorGravity() {
        return this.f13407I;
    }

    public int getTabMaxWidth() {
        return this.f13400B;
    }

    public int getTabMode() {
        return this.f13408J;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f13434l;
    }

    @Nullable
    public Drawable getTabSelectedIndicator() {
        return this.f13435m;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f13431j;
    }

    /* JADX INFO: renamed from: h */
    public final void m12116h(@NonNull C1416f c1416f) {
        TabView tabView = c1416f.f13497i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f13425d.addView(tabView, c1416f.m12193f(), m12123p());
    }

    /* JADX INFO: renamed from: i */
    public final void m12117i(View view) {
        if (view instanceof NavigationTabItem) {
            m12115g((NavigationTabItem) view);
        } else {
            ig3.a("Only TabItem instances can be added to TabLayout");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12118j(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !gbl0.P(this) || this.f13425d.m12138e()) {
            m12104G(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM12121m = m12121m(i, 0.0f);
        if (scrollX != iM12121m) {
            m12129v();
            this.f13415Q.setIntValues(scrollX, iM12121m);
            this.f13415Q.start();
        }
        this.f13425d.m12136c(i, this.f13406H);
        if (i != getSelectedTabPosition()) {
            C1416f c1416fM12130w = m12130w(i);
            C1416f c1416fM12130w2 = m12130w(getSelectedTabPosition());
            if (c1416fM12130w == null || c1416fM12130w2 == null) {
                return;
            }
            c1416fM12130w.f13497i.m12168k(false, this.f13406H);
            c1416fM12130w2.f13497i.m12168k(true, this.f13406H);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12119k(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f13425d.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.f13425d.setGravity(8388611);
    }

    /* JADX INFO: renamed from: l */
    public final void m12120l() {
        int i = this.f13408J;
        gbl0.z0(this.f13425d, (i == 0 || i == 2) ? Math.max(0, this.f13404F - this.f13426e) : 0, 0, 0, 0);
        int i2 = this.f13408J;
        if (i2 == 0) {
            m12119k(this.f13405G);
        } else if (i2 == 1 || i2 == 2) {
            this.f13425d.setGravity(1);
        }
        m12110M(true);
    }

    /* JADX INFO: renamed from: m */
    public final int m12121m(int i, float f) {
        int i2 = this.f13408J;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f13425d.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f13425d.getChildCount() ? this.f13425d.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return gbl0.x(this) == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: n */
    public final void m12122n(@NonNull C1416f c1416f, int i) {
        c1416f.m12203p(i);
        this.f13422a.add(i, c1416f);
        int size = this.f13422a.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f13422a.get(i).m12203p(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.f13416R == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m12107J((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f13421W) {
            setupWithViewPager(null);
            this.f13421W = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < this.f13425d.getChildCount(); i++) {
            View childAt = this.f13425d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m12173p(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        gc.T0(accessibilityNodeInfo).q0(gc.e.b(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"RestrictedApi"})
    public void onMeasure(int i, int i2) {
        int iRound = Math.round(ViewUtils.dpToPx(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iDpToPx = this.f13402D;
            if (iDpToPx <= 0) {
                iDpToPx = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.f13400B = iDpToPx;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f13408J;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public final LinearLayout.LayoutParams m12123p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m12109L(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: renamed from: q */
    public C1416f m12124q() {
        C1416f c1416f = (C1416f) f13398F0.acquire();
        return c1416f == null ? new C1416f() : c1416f;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final TabView m12125r(@NonNull C1416f c1416f) {
        hb80<TabView> hb80Var = this.f13433k0;
        TabView tabView = hb80Var != null ? (TabView) hb80Var.acquire() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(c1416f);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c1416f.f13492d)) {
            tabView.setContentDescription(c1416f.f13491c);
            return tabView;
        }
        tabView.setContentDescription(c1416f.f13492d);
        return tabView;
    }

    /* JADX INFO: renamed from: s */
    public final void m12126s(@NonNull C1416f c1416f) {
        for (int size = this.f13413O.size() - 1; size >= 0; size--) {
            this.f13413O.get(size).mo12186b(c1416f);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f13409K != z) {
            this.f13409K = z;
            for (int i = 0; i < this.f13425d.getChildCount(); i++) {
                View childAt = this.f13425d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m12165L();
                }
            }
            m12120l();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable InterfaceC1413c interfaceC1413c) {
        InterfaceC1413c interfaceC1413c2 = this.f13412N;
        if (interfaceC1413c2 != null) {
            m12099B(interfaceC1413c2);
        }
        this.f13412N = interfaceC1413c;
        if (interfaceC1413c != null) {
            m12111c(interfaceC1413c);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m12129v();
        this.f13415Q.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(nu0.b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f13425d.m12141h(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f13407I != i) {
            this.f13407I = i;
            gbl0.a0(this.f13425d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f13425d.m12142i(i);
    }

    public void setTabGravity(int i) {
        if (this.f13405G != i) {
            this.f13405G = i;
            m12120l();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f13432k != colorStateList) {
            this.f13432k = colorStateList;
            m12108K();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(nu0.a(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f13410L = z;
        gbl0.a0(this.f13425d);
    }

    public void setTabMode(int i) {
        if (i != this.f13408J) {
            this.f13408J = i;
            m12120l();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f13434l != colorStateList) {
            this.f13434l = colorStateList;
            for (int i = 0; i < this.f13425d.getChildCount(); i++) {
                View childAt = this.f13425d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m12163J(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(nu0.a(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f13431j != colorStateList) {
            this.f13431j = colorStateList;
            m12108K();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable w660 w660Var) {
        m12103F(w660Var, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f13411M != z) {
            this.f13411M = z;
            for (int i = 0; i < this.f13425d.getChildCount(); i++) {
                View childAt = this.f13425d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m12163J(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        m12106I(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m12127t(@NonNull C1416f c1416f) {
        for (int size = this.f13413O.size() - 1; size >= 0; size--) {
            this.f13413O.get(size).mo12187c(c1416f);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m12128u(@NonNull C1416f c1416f) {
        for (int size = this.f13413O.size() - 1; size >= 0; size--) {
            this.f13413O.get(size).mo12185a(c1416f);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m12129v() {
        if (this.f13415Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13415Q = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f13415Q.setDuration(this.f13406H);
            this.f13415Q.addUpdateListener(new C1411a());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public C1416f m12130w(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f13422a.get(i);
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public C1416f m12131x() {
        C1416f c1416fM12124q = m12124q();
        c1416fM12124q.f13496h = this;
        c1416fM12124q.f13497i = m12125r(c1416fM12124q);
        return c1416fM12124q;
    }

    /* JADX INFO: renamed from: y */
    public void m12132y() {
        int currentItem;
        m12098A();
        w660 w660Var = this.f13417S;
        if (w660Var != null) {
            int count = w660Var.getCount();
            for (int i = 0; i < count; i++) {
                m12114f(m12131x().m12204q(this.f13417S.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f13416R;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m12101D(m12130w(currentItem));
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m12133z(C1416f c1416f) {
        return f13398F0.release(c1416f);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m12117i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m12117i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m12117i(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable InterfaceC1414d interfaceC1414d) {
        setOnTabSelectedListener((InterfaceC1413c) interfaceC1414d);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (this.f13435m != drawable) {
            this.f13435m = drawable;
            gbl0.a0(this.f13425d);
        }
    }

    public VNavigationTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j0c0.k);
    }

    public VNavigationTabLayout(@NonNull Context context) {
        this(context, null);
    }
}
