package p147v.navigationbar;

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
import com.google.android.gms.common.api.Api;
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
import p149l.C17055gc;
import p149l.aac0;
import p149l.b6c0;
import p149l.b9c0;
import p149l.dti0;
import p149l.gbl0;
import p149l.ha80;
import p149l.hb80;
import p149l.ig3;
import p149l.j0c0;
import p149l.jb80;
import p149l.kbe;
import p149l.lb80;
import p149l.mji0;
import p149l.n8c0;
import p149l.nu0;
import p149l.qkq0;
import p149l.quw;
import p149l.u1c0;
import p149l.w660;

/* JADX INFO: loaded from: classes3.dex */
@ViewPager.InterfaceC0711e
public class VNavigationTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: E0 */
    public static final int f209772E0 = n8c0.f137630n;

    /* JADX INFO: renamed from: F0 */
    public static final hb80<C22623f> f209773F0 = new lb80(16);

    /* JADX INFO: renamed from: A */
    public int f209774A;

    /* JADX INFO: renamed from: B */
    public int f209775B;

    /* JADX INFO: renamed from: C */
    public final int f209776C;

    /* JADX INFO: renamed from: D */
    public final int f209777D;

    /* JADX INFO: renamed from: E */
    public final int f209778E;

    /* JADX INFO: renamed from: F */
    public int f209779F;

    /* JADX INFO: renamed from: G */
    public int f209780G;

    /* JADX INFO: renamed from: H */
    public int f209781H;

    /* JADX INFO: renamed from: I */
    public int f209782I;

    /* JADX INFO: renamed from: J */
    public int f209783J;

    /* JADX INFO: renamed from: K */
    public boolean f209784K;

    /* JADX INFO: renamed from: L */
    public boolean f209785L;

    /* JADX INFO: renamed from: M */
    public boolean f209786M;

    /* JADX INFO: renamed from: N */
    @Nullable
    public InterfaceC22620c f209787N;

    /* JADX INFO: renamed from: O */
    public final ArrayList<InterfaceC22620c> f209788O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public InterfaceC22620c f209789P;

    /* JADX INFO: renamed from: Q */
    public ValueAnimator f209790Q;

    /* JADX INFO: renamed from: R */
    @Nullable
    public ViewPager f209791R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public w660 f209792S;

    /* JADX INFO: renamed from: T */
    public DataSetObserver f209793T;

    /* JADX INFO: renamed from: U */
    public C22624g f209794U;

    /* JADX INFO: renamed from: V */
    public C22619b f209795V;

    /* JADX INFO: renamed from: W */
    public boolean f209796W;

    /* JADX INFO: renamed from: a */
    public final ArrayList<C22623f> f209797a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C22623f f209798b;

    /* JADX INFO: renamed from: c */
    public final RectF f209799c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SlidingTabIndicator f209800d;

    /* JADX INFO: renamed from: e */
    public int f209801e;

    /* JADX INFO: renamed from: f */
    public int f209802f;

    /* JADX INFO: renamed from: g */
    public int f209803g;

    /* JADX INFO: renamed from: h */
    public int f209804h;

    /* JADX INFO: renamed from: i */
    public int f209805i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f209806j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f209807k;

    /* JADX INFO: renamed from: k0 */
    public final hb80<TabView> f209808k0;

    /* JADX INFO: renamed from: l */
    public ColorStateList f209809l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Drawable f209810m;

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode f209811n;

    /* JADX INFO: renamed from: o */
    public float f209812o;

    /* JADX INFO: renamed from: p */
    public float f209813p;

    /* JADX INFO: renamed from: p0 */
    public float f209814p0;

    /* JADX INFO: renamed from: q */
    public float f209815q;

    /* JADX INFO: renamed from: r */
    public int f209816r;

    /* JADX INFO: renamed from: s */
    public int f209817s;

    /* JADX INFO: renamed from: t */
    public int f209818t;

    /* JADX INFO: renamed from: u */
    public int f209819u;

    /* JADX INFO: renamed from: v */
    public int f209820v;

    /* JADX INFO: renamed from: w */
    public int f209821w;

    /* JADX INFO: renamed from: x */
    public float f209822x;

    /* JADX INFO: renamed from: y */
    public int f209823y;

    /* JADX INFO: renamed from: z */
    public int f209824z;

    public class SlidingTabIndicator extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public int f209825a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final Paint f209826b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final GradientDrawable f209827c;

        /* JADX INFO: renamed from: d */
        public int f209828d;

        /* JADX INFO: renamed from: e */
        public float f209829e;

        /* JADX INFO: renamed from: f */
        public int f209830f;

        /* JADX INFO: renamed from: g */
        public int f209831g;

        /* JADX INFO: renamed from: h */
        public int f209832h;

        /* JADX INFO: renamed from: i */
        public ValueAnimator f209833i;

        /* JADX INFO: renamed from: j */
        public int f209834j;

        /* JADX INFO: renamed from: k */
        public int f209835k;

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$SlidingTabIndicator$a */
        public class C22613a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f209837a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f209838b;

            public C22613a(int i, int i2) {
                this.f209837a = i;
                this.f209838b = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            @SuppressLint({"RestrictedApi"})
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (this.f209837a - SlidingTabIndicator.this.f209834j > 0) {
                    SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                    if (animatedFraction >= 0.5f) {
                        SlidingTabIndicator.this.m223636f(slidingTabIndicator.f209834j + Math.round((animatedFraction - 0.5f) * 2.0f * (this.f209837a - SlidingTabIndicator.this.f209834j)), SlidingTabIndicator.this.f209835k + Math.round(this.f209838b - SlidingTabIndicator.this.f209835k));
                        return;
                    } else {
                        SlidingTabIndicator.this.m223636f(slidingTabIndicator.f209834j, SlidingTabIndicator.this.f209835k + Math.round(animatedFraction * 2.0f * (this.f209838b - SlidingTabIndicator.this.f209835k)));
                        return;
                    }
                }
                SlidingTabIndicator slidingTabIndicator2 = SlidingTabIndicator.this;
                if (animatedFraction >= 0.5f) {
                    SlidingTabIndicator.this.m223636f(slidingTabIndicator2.f209834j + Math.round(this.f209837a - SlidingTabIndicator.this.f209834j), SlidingTabIndicator.this.f209835k + Math.round((animatedFraction - 0.5f) * 2.0f * (this.f209838b - SlidingTabIndicator.this.f209835k)));
                } else {
                    SlidingTabIndicator.this.m223636f(slidingTabIndicator2.f209834j + Math.round(animatedFraction * 2.0f * (this.f209837a - SlidingTabIndicator.this.f209834j)), SlidingTabIndicator.this.f209835k);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$SlidingTabIndicator$b */
        public class C22614b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f209840a;

            public C22614b(int i) {
                this.f209840a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                slidingTabIndicator.f209828d = this.f209840a;
                slidingTabIndicator.f209829e = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SlidingTabIndicator.this.f209828d = this.f209840a;
            }
        }

        public SlidingTabIndicator(Context context) {
            super(context);
            this.f209828d = -1;
            this.f209830f = -1;
            this.f209831g = -1;
            this.f209832h = -1;
            this.f209834j = -1;
            this.f209835k = -1;
            setWillNotDraw(false);
            this.f209826b = new Paint();
            this.f209827c = new GradientDrawable();
        }

        /* JADX INFO: renamed from: c */
        public void m223633c(int i, int i2) {
            ValueAnimator valueAnimator = this.f209833i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f209833i.cancel();
            }
            m223641k(true, i, i2);
        }

        /* JADX INFO: renamed from: d */
        public final void m223634d(@NonNull TabView tabView, @NonNull RectF rectF) {
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int right = (tabView.getRight() - tabView.getLeft()) / 4;
            rectF.set(left - right, 0.0f, left + right, 0.0f);
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            super.draw(canvas);
            Drawable drawable = VNavigationTabLayout.this.f209810m;
            int height = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i = this.f209825a;
            if (i >= 0) {
                intrinsicHeight = i;
            }
            int i2 = VNavigationTabLayout.this.f209782I;
            if (i2 == 0) {
                height = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i2 == 1) {
                height = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i2 != 2) {
                intrinsicHeight = i2 != 3 ? 0 : getHeight();
            }
            int i3 = this.f209831g;
            if (i3 < 0 || this.f209832h <= i3) {
                return;
            }
            Drawable drawable2 = VNavigationTabLayout.this.f209810m;
            if (drawable2 == null) {
                drawable2 = this.f209827c;
            }
            Drawable drawableMutate = kbe.m145284r(drawable2).mutate();
            drawableMutate.setBounds(this.f209831g, height, this.f209832h, intrinsicHeight);
            Paint paint = this.f209826b;
            if (paint != null) {
                kbe.m145280n(drawableMutate, paint.getColor());
            }
            drawableMutate.draw(canvas);
        }

        /* JADX INFO: renamed from: e */
        public boolean m223635e() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public void m223636f(int i, int i2) {
            if (i == this.f209831g && i2 == this.f209832h) {
                return;
            }
            this.f209831g = i;
            this.f209832h = i2;
            gbl0.m125183a0(this);
        }

        /* JADX INFO: renamed from: g */
        public void m223637g(int i, float f) {
            ValueAnimator valueAnimator = this.f209833i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f209833i.cancel();
            }
            this.f209828d = i;
            this.f209829e = f;
            m223640j();
        }

        /* JADX INFO: renamed from: h */
        public void m223638h(int i) {
            if (this.f209826b.getColor() != i) {
                this.f209826b.setColor(i);
                gbl0.m125183a0(this);
            }
        }

        /* JADX INFO: renamed from: i */
        public void m223639i(int i) {
            if (this.f209825a != i) {
                this.f209825a = i;
                gbl0.m125183a0(this);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m223640j() {
            int left;
            int right;
            View childAt = getChildAt(this.f209828d);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
                if (!vNavigationTabLayout.f209785L && (childAt instanceof TabView)) {
                    m223634d((TabView) childAt, vNavigationTabLayout.f209799c);
                    left = (int) VNavigationTabLayout.this.f209799c.left;
                    right = (int) VNavigationTabLayout.this.f209799c.right;
                }
                if (this.f209829e > 0.0f && this.f209828d < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f209828d + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    VNavigationTabLayout vNavigationTabLayout2 = VNavigationTabLayout.this;
                    if (!vNavigationTabLayout2.f209785L && (childAt2 instanceof TabView)) {
                        m223634d((TabView) childAt2, vNavigationTabLayout2.f209799c);
                        left2 = (int) VNavigationTabLayout.this.f209799c.left;
                        right2 = (int) VNavigationTabLayout.this.f209799c.right;
                    }
                    float f = this.f209829e;
                    if (f >= 0.5d) {
                        left = (int) (left + ((f - 0.5f) * 2.0f * (left2 - left)));
                        right += right2 - right;
                    } else {
                        right = (int) (right + (f * 2.0f * (right2 - right)));
                    }
                }
            }
            m223636f(left, right);
        }

        /* JADX INFO: renamed from: k */
        public final void m223641k(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m223640j();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (!vNavigationTabLayout.f209785L && (childAt instanceof TabView)) {
                m223634d((TabView) childAt, vNavigationTabLayout.f209799c);
                left = (int) VNavigationTabLayout.this.f209799c.left;
                right = (int) VNavigationTabLayout.this.f209799c.right;
            }
            int i3 = this.f209831g;
            int i4 = this.f209832h;
            if (i3 == left && i4 == right) {
                return;
            }
            if (z) {
                this.f209834j = i3;
                this.f209835k = i4;
            }
            C22613a c22613a = new C22613a(left, right);
            if (!z) {
                this.f209833i.removeAllUpdateListeners();
                this.f209833i.addUpdateListener(c22613a);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f209833i = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c22613a);
            valueAnimator.addListener(new C22614b(i));
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f209833i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m223640j();
            } else {
                m223641k(false, this.f209828d, -1);
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
            if (vNavigationTabLayout.f209780G == 1 || vNavigationTabLayout.f209783J == 2) {
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
                    vNavigationTabLayout2.f209780G = 0;
                    vNavigationTabLayout2.m223607M(false);
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
        public C22623f f209842a;

        /* JADX INFO: renamed from: b */
        public TextView f209843b;

        /* JADX INFO: renamed from: c */
        public ImageView f209844c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public View f209845d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public BadgeDrawable f209846e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public View f209847f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public TextView f209848g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public ImageView f209849h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public Drawable f209850i;

        /* JADX INFO: renamed from: j */
        public int f209851j;

        /* JADX INFO: renamed from: k */
        public ValueAnimator f209852k;

        /* JADX INFO: renamed from: l */
        public ArgbEvaluator f209853l;

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$a */
        public class ViewOnLayoutChangeListenerC22615a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f209855a;

            public ViewOnLayoutChangeListenerC22615a(View view) {
                this.f209855a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f209855a.getVisibility() == 0) {
                    TabView.this.m223658H(this.f209855a);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$b */
        public class C22616b implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f209857a;

            public C22616b(boolean z) {
                this.f209857a = z;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                boolean z = this.f209857a;
                TabView tabView = TabView.this;
                if (z) {
                    tabView.m223666l(animatedFraction);
                } else {
                    tabView.m223666l(1.0f - animatedFraction);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$c */
        public class C22617c extends AnimatorListenerAdapter {
            public C22617c() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TabView.this.m223659I();
                TabView tabView = TabView.this;
                tabView.m223660J(tabView.getContext());
                if (TabView.this.f209850i == null || !TabView.this.f209850i.isStateful()) {
                    return;
                }
                TabView.this.f209850i.setState(TabView.this.getDrawableState());
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public TabView(Context context) {
            super(context);
            this.f209851j = 2;
            this.f209853l = null;
            m223660J(context);
            gbl0.m125233z0(this, VNavigationTabLayout.this.f209801e, VNavigationTabLayout.this.f209802f, VNavigationTabLayout.this.f209803g, VNavigationTabLayout.this.f209804h);
            setGravity(17);
            setOrientation(!VNavigationTabLayout.this.f209784K ? 1 : 0);
            setClickable(true);
            gbl0.m125148A0(this, ha80.m130070b(getContext(), 1002));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f209846e;
        }

        private int getContentWidth() {
            View[] viewArr = {this.f209843b, this.f209844c, this.f209847f};
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
            if (this.f209846e == null) {
                this.f209846e = BadgeDrawable.create(getContext());
            }
            m223657G();
            BadgeDrawable badgeDrawable = this.f209846e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            qkq0.m175383a("Unable to create badge");
            return null;
        }

        /* JADX INFO: renamed from: A */
        public void m223651A() {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f209844c.getLayoutParams();
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f209820v;
            if (i != 0) {
                layoutParams.width = i;
            }
            int i2 = vNavigationTabLayout.f209821w;
            if (i2 != 0) {
                layoutParams.height = i2;
            }
            this.f209844c.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: B */
        public void m223652B(String str) {
            if (VNavigationTabLayout.this.f209813p > 0.0f) {
                TextPaint paint = this.f209843b.getPaint();
                paint.setTextSize(VNavigationTabLayout.this.f209812o);
                float fMeasureText = paint.measureText(str);
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                float f = fontMetricsInt.bottom - fontMetricsInt.top;
                paint.setTextSize(VNavigationTabLayout.this.f209813p);
                float fMeasureText2 = paint.measureText(str);
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                int i = (int) (((fMeasureText2 - fMeasureText) / 2.0f) + 0.5f);
                int i2 = (int) ((((fontMetricsInt2.bottom - fontMetricsInt2.top) - f) / 2.0f) + 0.5f);
                this.f209843b.setPadding(i, i2, i, i2);
            }
        }

        /* JADX INFO: renamed from: C */
        public void m223653C() {
            setTab(null);
            setSelected(false);
        }

        /* JADX INFO: renamed from: D */
        public void m223654D(int i, float f) {
            ValueAnimator valueAnimator = this.f209852k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f209852k.cancel();
            }
            if (this.f209847f != null) {
                return;
            }
            if (f != 0.0f && f != 1.0f) {
                m223666l(f);
                return;
            }
            m223659I();
            m223660J(getContext());
            Drawable drawable = this.f209850i;
            if (drawable == null || !drawable.isStateful()) {
                return;
            }
            this.f209850i.setState(getDrawableState());
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: E */
        public final void m223655E(@Nullable View view) {
            if (m223678x() && view != null) {
                m223668n(false);
                BadgeUtils.attachBadgeDrawable(this.f209846e, view, m223677w(view));
                this.f209845d = view;
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: F */
        public final void m223656F() {
            if (m223678x()) {
                m223668n(true);
                View view = this.f209845d;
                if (view != null) {
                    BadgeUtils.detachBadgeDrawable(this.f209846e, view, m223677w(view));
                    this.f209845d = null;
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m223657G() {
            C22623f c22623f;
            C22623f c22623f2;
            if (m223678x()) {
                if (this.f209847f != null) {
                    m223656F();
                    return;
                }
                if (this.f209844c != null && (c22623f2 = this.f209842a) != null && c22623f2.m223686e() != null) {
                    View view = this.f209845d;
                    ImageView imageView = this.f209844c;
                    if (view == imageView) {
                        m223658H(imageView);
                        return;
                    } else {
                        m223656F();
                        m223655E(this.f209844c);
                        return;
                    }
                }
                if (this.f209843b == null || (c22623f = this.f209842a) == null || c22623f.m223688g() != 1) {
                    m223656F();
                    return;
                }
                View view2 = this.f209845d;
                TextView textView = this.f209843b;
                if (view2 == textView) {
                    m223658H(textView);
                } else {
                    m223656F();
                    m223655E(this.f209843b);
                }
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: H */
        public final void m223658H(@NonNull View view) {
            if (m223678x() && view == this.f209845d) {
                BadgeUtils.setBadgeDrawableBounds(this.f209846e, view, m223677w(view));
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m223659I() {
            C22623f c22623f = this.f209842a;
            Drawable drawableMutate = null;
            View viewM223685d = c22623f != null ? c22623f.m223685d() : null;
            if (viewM223685d != null) {
                ViewParent parent = viewM223685d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM223685d);
                    }
                    addView(viewM223685d);
                }
                this.f209847f = viewM223685d;
                TextView textView = this.f209843b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f209844c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f209844c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewM223685d.findViewById(R.id.text1);
                this.f209848g = textView2;
                if (textView2 != null) {
                    this.f209851j = mji0.m154810d(textView2);
                }
                this.f209849h = (ImageView) viewM223685d.findViewById(R.id.icon);
            } else {
                View view = this.f209847f;
                if (view != null) {
                    removeView(view);
                    this.f209847f = null;
                }
                this.f209848g = null;
                this.f209849h = null;
            }
            if (this.f209847f == null) {
                if (this.f209844c == null) {
                    m223679y();
                }
                if (c22623f != null && c22623f.m223686e() != null) {
                    drawableMutate = kbe.m145284r(c22623f.m223686e()).mutate();
                }
                if (drawableMutate != null) {
                    kbe.m145281o(drawableMutate, VNavigationTabLayout.this.f209807k);
                    PorterDuff.Mode mode = VNavigationTabLayout.this.f209811n;
                    if (mode != null) {
                        kbe.m145282p(drawableMutate, mode);
                    }
                }
                if (this.f209843b == null) {
                    m223680z();
                    this.f209851j = mji0.m154810d(this.f209843b);
                }
                ColorStateList colorStateList = VNavigationTabLayout.this.f209806j;
                if (colorStateList != null) {
                    this.f209843b.setTextColor(colorStateList);
                }
                m223663M(this.f209843b, this.f209844c);
                m223657G();
                m223664j(this.f209844c);
                m223664j(this.f209843b);
            } else {
                TextView textView3 = this.f209848g;
                if (textView3 != null || this.f209849h != null) {
                    m223663M(textView3, this.f209849h);
                }
            }
            if (c22623f != null && !TextUtils.isEmpty(c22623f.f209867d)) {
                setContentDescription(c22623f.f209867d);
            }
            setSelected(c22623f != null && c22623f.m223690i());
        }

        /* JADX INFO: renamed from: J */
        public final void m223660J(Context context) {
            GradientDrawable gradientDrawable;
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f209823y;
            if (i != 0) {
                Drawable drawableM161424b = nu0.m161424b(context, i);
                this.f209850i = drawableM161424b;
                if (drawableM161424b != null && drawableM161424b.isStateful()) {
                    this.f209850i.setState(getDrawableState());
                }
            } else if (vNavigationTabLayout.f209824z == 0 && vNavigationTabLayout.f209774A == 0) {
                this.f209850i = null;
            } else {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                VNavigationTabLayout vNavigationTabLayout2 = VNavigationTabLayout.this;
                int i2 = vNavigationTabLayout2.f209824z;
                if (i2 == 0) {
                    i2 = 0;
                }
                int i3 = vNavigationTabLayout2.f209774A;
                if (i3 == 0) {
                    i3 = 0;
                }
                gradientDrawable2.setColor(VNavigationTabLayout.m223594o(i2, i3));
                this.f209850i = gradientDrawable2;
            }
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(0);
            Drawable rippleDrawable = gradientDrawable3;
            if (VNavigationTabLayout.this.f209809l != null) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setCornerRadius(1.0E-5f);
                gradientDrawable4.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(VNavigationTabLayout.this.f209809l);
                boolean z = VNavigationTabLayout.this.f209786M;
                if (z) {
                    gradientDrawable = gradientDrawable3;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, z ? null : gradientDrawable4);
            }
            gbl0.m125207m0(this, rippleDrawable);
            VNavigationTabLayout.this.invalidate();
        }

        /* JADX INFO: renamed from: K */
        public final void m223661K(boolean z, boolean z2, int i) {
            C22616b c22616b = new C22616b(z2);
            if (!z) {
                this.f209852k.removeAllUpdateListeners();
                this.f209852k.addUpdateListener(c22616b);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f209852k = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f209852k.setDuration(i);
            this.f209852k.setFloatValues(0.0f, 1.0f);
            this.f209852k.addUpdateListener(c22616b);
            this.f209852k.addListener(new C22617c());
            this.f209852k.start();
        }

        /* JADX INFO: renamed from: L */
        public final void m223662L() {
            setOrientation(!VNavigationTabLayout.this.f209784K ? 1 : 0);
            TextView textView = this.f209848g;
            if (textView == null && this.f209849h == null) {
                m223663M(this.f209843b, this.f209844c);
            } else {
                m223663M(textView, this.f209849h);
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: M */
        public final void m223663M(@Nullable TextView textView, @Nullable ImageView imageView) {
            C22623f c22623f = this.f209842a;
            Drawable drawableMutate = (c22623f == null || c22623f.m223686e() == null) ? null : kbe.m145284r(this.f209842a.m223686e()).mutate();
            C22623f c22623f2 = this.f209842a;
            CharSequence charSequenceM223689h = c22623f2 != null ? c22623f2.m223689h() : null;
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
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM223689h);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(charSequenceM223689h);
                    if (this.f209842a.f209870g == 1) {
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
                if (VNavigationTabLayout.this.f209784K) {
                    if (iDpToPx != quw.m176654a(marginLayoutParams)) {
                        quw.m176656c(marginLayoutParams, iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    quw.m176656c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C22623f c22623f3 = this.f209842a;
            dti0.m113570a(this, zIsEmpty ? c22623f3 != null ? c22623f3.f209867d : null : null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f209850i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f209850i.setState(drawableState)) {
                invalidate();
                VNavigationTabLayout.this.invalidate();
            }
        }

        @Nullable
        public ImageView getIconView() {
            return this.f209844c;
        }

        @Nullable
        public C22623f getTab() {
            return this.f209842a;
        }

        @Nullable
        public TextView getTextView() {
            return this.f209843b;
        }

        /* JADX INFO: renamed from: j */
        public final void m223664j(@Nullable View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC22615a(view));
        }

        /* JADX INFO: renamed from: k */
        public void m223665k(boolean z, int i) {
            ValueAnimator valueAnimator = this.f209852k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f209852k.cancel();
            }
            m223661K(true, z, i);
        }

        /* JADX INFO: renamed from: l */
        public final void m223666l(float f) {
            int iM223671q;
            TextView textView = this.f209843b;
            if (textView != null) {
                float fM223675u = m223675u(f);
                if (fM223675u >= 0.0f) {
                    textView.setScaleX(fM223675u);
                    textView.setScaleY(fM223675u);
                }
                int iM223676v = m223676v(f);
                if (iM223676v != -1) {
                    textView.setTextColor(iM223676v);
                }
            }
            ImageView imageView = this.f209844c;
            if (imageView != null) {
                int iM223673s = m223673s(f);
                if (iM223673s != -1) {
                    Drawable drawableMutate = imageView.getDrawable() != null ? kbe.m145284r(imageView.getDrawable()).mutate() : null;
                    if (drawableMutate != null) {
                        kbe.m145281o(drawableMutate, VNavigationTabLayout.m223594o(iM223673s, iM223673s));
                    }
                }
                float fM223674t = m223674t(f);
                if (fM223674t >= 0.0f) {
                    imageView.setScaleX(fM223674t);
                    imageView.setScaleY(fM223674t);
                }
            }
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f209824z;
            if (i == 0 || i == vNavigationTabLayout.f209774A || (iM223671q = m223671q(f)) == -1) {
                return;
            }
            Drawable background = getBackground();
            if (!(background instanceof GradientDrawable)) {
                background = new GradientDrawable();
            }
            ((GradientDrawable) background).setColor(VNavigationTabLayout.m223594o(iM223671q, iM223671q));
            gbl0.m125207m0(this, background);
        }

        /* JADX INFO: renamed from: m */
        public final float m223667m(@NonNull Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* JADX INFO: renamed from: n */
        public final void m223668n(boolean z) {
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
        public final FrameLayout m223669o() {
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
            BadgeDrawable badgeDrawable = this.f209846e;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f209846e.getContentDescription()));
            }
            C17055gc c17055gcM125351T0 = C17055gc.m125351T0(accessibilityNodeInfo);
            c17055gcM125351T0.m125432r0(C17055gc.f.m125463a(0, 1, this.f209842a.m223687f(), 1, false, isSelected()));
            if (isSelected()) {
                c17055gcM125351T0.m125429p0(false);
                c17055gcM125351T0.m125410f0(C17055gc.a.f101954i);
            }
            c17055gcM125351T0.m125374I0("Tab");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f209852k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            m223661K(false, false, -1);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = VNavigationTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(VNavigationTabLayout.this.f209775B, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f209843b != null) {
                float f = VNavigationTabLayout.this.f209812o;
                int i3 = this.f209851j;
                ImageView imageView = this.f209844c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f209843b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = VNavigationTabLayout.this.f209815q;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f209843b.getTextSize();
                int lineCount = this.f209843b.getLineCount();
                int iM154810d = mji0.m154810d(this.f209843b);
                if (f != textSize || (iM154810d >= 0 && i3 != iM154810d)) {
                    if (VNavigationTabLayout.this.f209783J != 1 || f <= textSize || lineCount != 1 || ((layout = this.f209843b.getLayout()) != null && m223667m(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f209843b.setTextSize(0, f);
                        this.f209843b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m223670p(@NonNull Canvas canvas) {
            Drawable drawable = this.f209850i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f209850i.draw(canvas);
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f209842a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f209842a.m223692k();
            return true;
        }

        /* JADX INFO: renamed from: q */
        public int m223671q(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m223672r(f, vNavigationTabLayout.f209774A, vNavigationTabLayout.f209824z);
        }

        /* JADX INFO: renamed from: r */
        public final int m223672r(float f, @ColorInt int i, @ColorInt int i2) {
            if (i == 0) {
                return -1;
            }
            if (this.f209853l == null) {
                this.f209853l = new ArgbEvaluator();
            }
            if (VNavigationTabLayout.this.f209806j != null) {
                return ((Integer) this.f209853l.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
            }
            return -1;
        }

        /* JADX INFO: renamed from: s */
        public int m223673s(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m223672r(f, vNavigationTabLayout.f209818t, vNavigationTabLayout.f209819u);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.f209843b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f209844c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f209847f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable C22623f c22623f) {
            if (c22623f != this.f209842a) {
                this.f209842a = c22623f;
                m223659I();
            }
        }

        /* JADX INFO: renamed from: t */
        public float m223674t(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (vNavigationTabLayout.f209821w <= 0 || vNavigationTabLayout.f209820v <= 0) {
                return -1.0f;
            }
            float f2 = vNavigationTabLayout.f209822x;
            if (f2 <= 0.0f) {
                return -1.0f;
            }
            return f2 - (f * (f2 - 1.0f));
        }

        /* JADX INFO: renamed from: u */
        public float m223675u(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            float f2 = vNavigationTabLayout.f209813p;
            if (f2 <= 0.0f) {
                return -1.0f;
            }
            float f3 = vNavigationTabLayout.f209812o;
            return (f2 / f3) - (f * ((f2 / f3) - 1.0f));
        }

        /* JADX INFO: renamed from: v */
        public int m223676v(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m223672r(f, vNavigationTabLayout.f209816r, vNavigationTabLayout.f209817s);
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        public final FrameLayout m223677w(@NonNull View view) {
            if ((view == this.f209844c || view == this.f209843b) && BadgeUtils.USE_COMPAT_PARENT) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: renamed from: x */
        public final boolean m223678x() {
            return this.f209846e != null;
        }

        /* JADX INFO: renamed from: y */
        public final void m223679y() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutM223669o = m223669o();
                addView(frameLayoutM223669o, 0);
                viewGroup = frameLayoutM223669o;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(b6c0.f73800z, viewGroup, false);
            this.f209844c = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* JADX INFO: renamed from: z */
        public final void m223680z() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutM223669o = m223669o();
                addView(frameLayoutM223669o);
                viewGroup = frameLayoutM223669o;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(b6c0.f73769A, viewGroup, false);
            this.f209843b = textView;
            viewGroup.addView(textView);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$a */
    public class C22618a implements ValueAnimator.AnimatorUpdateListener {
        public C22618a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            VNavigationTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$b */
    public class C22619b implements ViewPager.InterfaceC0715i {

        /* JADX INFO: renamed from: a */
        public boolean f209861a;

        public C22619b() {
        }

        /* JADX INFO: renamed from: a */
        public void m223681a(boolean z) {
            this.f209861a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0715i
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable w660 w660Var, @Nullable w660 w660Var2) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (vNavigationTabLayout.f209791R == viewPager) {
                vNavigationTabLayout.m223600F(w660Var2, this.f209861a);
            }
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$c */
    @Deprecated
    public interface InterfaceC22620c<T extends C22623f> {
        /* JADX INFO: renamed from: a */
        void mo63839a(T t);

        /* JADX INFO: renamed from: b */
        void mo63840b(T t);

        /* JADX INFO: renamed from: c */
        void mo63841c(T t);
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$d */
    public interface InterfaceC22621d extends InterfaceC22620c<C22623f> {
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$e */
    public class C22622e extends DataSetObserver {
        public C22622e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VNavigationTabLayout.this.m223629y();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VNavigationTabLayout.this.m223629y();
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$f */
    public static class C22623f {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Object f209864a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Drawable f209865b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public CharSequence f209866c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public CharSequence f209867d;

        /* JADX INFO: renamed from: f */
        @Nullable
        public View f209869f;

        /* JADX INFO: renamed from: h */
        @Nullable
        public VNavigationTabLayout f209871h;

        /* JADX INFO: renamed from: i */
        @NonNull
        public TabView f209872i;

        /* JADX INFO: renamed from: e */
        public int f209868e = -1;

        /* JADX INFO: renamed from: g */
        public int f209870g = 1;

        @Nullable
        /* JADX INFO: renamed from: d */
        public View m223685d() {
            return this.f209869f;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public Drawable m223686e() {
            return this.f209865b;
        }

        /* JADX INFO: renamed from: f */
        public int m223687f() {
            return this.f209868e;
        }

        /* JADX INFO: renamed from: g */
        public int m223688g() {
            return this.f209870g;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public CharSequence m223689h() {
            return this.f209866c;
        }

        /* JADX INFO: renamed from: i */
        public boolean m223690i() {
            VNavigationTabLayout vNavigationTabLayout = this.f209871h;
            if (vNavigationTabLayout != null) {
                return vNavigationTabLayout.getSelectedTabPosition() == this.f209868e;
            }
            ig3.m135964a("Tab not attached to a TabLayout");
            return false;
        }

        /* JADX INFO: renamed from: j */
        public void m223691j() {
            this.f209871h = null;
            this.f209872i = null;
            this.f209864a = null;
            this.f209865b = null;
            this.f209866c = null;
            this.f209867d = null;
            this.f209868e = -1;
            this.f209869f = null;
        }

        /* JADX INFO: renamed from: k */
        public void m223692k() {
            VNavigationTabLayout vNavigationTabLayout = this.f209871h;
            if (vNavigationTabLayout != null) {
                vNavigationTabLayout.m223598D(this);
            } else {
                ig3.m135964a("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public C22623f m223693l(@Nullable CharSequence charSequence) {
            this.f209867d = charSequence;
            m223699r();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: m */
        public C22623f m223694m(@LayoutRes int i) {
            return m223695n(LayoutInflater.from(this.f209872i.getContext()).inflate(i, (ViewGroup) this.f209872i, false));
        }

        @NonNull
        /* JADX INFO: renamed from: n */
        public C22623f m223695n(@Nullable View view) {
            this.f209869f = view;
            m223699r();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: o */
        public C22623f m223696o(@Nullable Drawable drawable) {
            this.f209865b = drawable;
            VNavigationTabLayout vNavigationTabLayout = this.f209871h;
            if (vNavigationTabLayout.f209780G == 1 || vNavigationTabLayout.f209783J == 2) {
                vNavigationTabLayout.m223607M(true);
            }
            m223699r();
            if (BadgeUtils.USE_COMPAT_PARENT && this.f209872i.m223678x() && this.f209872i.f209846e.isVisible()) {
                this.f209872i.invalidate();
            }
            this.f209872i.m223651A();
            return this;
        }

        /* JADX INFO: renamed from: p */
        public void m223697p(int i) {
            this.f209868e = i;
        }

        @NonNull
        /* JADX INFO: renamed from: q */
        public C22623f m223698q(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f209867d) && !TextUtils.isEmpty(charSequence)) {
                this.f209872i.setContentDescription(charSequence);
            }
            this.f209866c = charSequence;
            if (charSequence != null && charSequence.length() > 0) {
                this.f209872i.m223652B(charSequence.toString());
            }
            m223699r();
            return this;
        }

        /* JADX INFO: renamed from: r */
        public void m223699r() {
            TabView tabView = this.f209872i;
            if (tabView != null) {
                tabView.m223659I();
            }
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$g */
    public static class C22624g implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<VNavigationTabLayout> f209873a;

        /* JADX INFO: renamed from: b */
        public int f209874b;

        /* JADX INFO: renamed from: c */
        public int f209875c;

        public C22624g(VNavigationTabLayout vNavigationTabLayout) {
            this.f209873a = new WeakReference<>(vNavigationTabLayout);
        }

        /* JADX INFO: renamed from: a */
        public void m223700a() {
            this.f209875c = 0;
            this.f209874b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            this.f209874b = this.f209875c;
            this.f209875c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            VNavigationTabLayout vNavigationTabLayout = this.f209873a.get();
            if (vNavigationTabLayout != null) {
                int i3 = this.f209875c;
                vNavigationTabLayout.m223602H(i, f, i3 != 2 || this.f209874b == 1, (i3 == 2 && this.f209874b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            VNavigationTabLayout vNavigationTabLayout = this.f209873a.get();
            if (vNavigationTabLayout == null || vNavigationTabLayout.getSelectedTabPosition() == i || i >= vNavigationTabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f209875c;
            vNavigationTabLayout.m223599E(vNavigationTabLayout.m223627w(i), i2 == 0 || (i2 == 2 && this.f209874b == 0));
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$h */
    public static class C22625h implements InterfaceC22621d {

        /* JADX INFO: renamed from: a */
        public final ViewPager f209876a;

        public C22625h(ViewPager viewPager) {
            this.f209876a = viewPager;
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: a */
        public void mo63839a(C22623f c22623f) {
            if (c22623f.f209872i.f209843b != null) {
                c22623f.f209872i.f209843b.setTypeface(Typeface.DEFAULT);
            }
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: b */
        public void mo63840b(C22623f c22623f) {
        }

        @Override // p147v.navigationbar.VNavigationTabLayout.InterfaceC22620c
        /* JADX INFO: renamed from: c */
        public void mo63841c(@NonNull C22623f c22623f) {
            this.f209876a.setCurrentItem(c22623f.m223687f());
            if (c22623f.f209872i.f209843b != null) {
                c22623f.f209872i.f209843b.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public VNavigationTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209797a = new ArrayList<>();
        this.f209799c = new RectF();
        this.f209813p = -1.0f;
        this.f209816r = 0;
        this.f209818t = 0;
        this.f209820v = 0;
        this.f209821w = 0;
        this.f209822x = -1.0f;
        this.f209824z = 0;
        this.f209774A = 0;
        this.f209775B = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f209788O = new ArrayList<>();
        this.f209808k0 = new jb80(12);
        this.f209814p0 = 0.0f;
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f209800d = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, b9c0.f74451j2, i, f209772E0, b9c0.f74316O2);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(gbl0.m125220t(this));
            gbl0.m125207m0(this, materialShapeDrawable);
        }
        slidingTabIndicator.m223639i(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74556y2, -1));
        slidingTabIndicator.m223638h(typedArrayObtainStyledAttributes.getColor(b9c0.f74535v2, 0));
        setSelectedTabIndicator(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, b9c0.f74521t2));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(b9c0.f74549x2, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74542w2, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74257F2, 0);
        this.f209804h = dimensionPixelSize;
        this.f209803g = dimensionPixelSize;
        this.f209802f = dimensionPixelSize;
        this.f209801e = dimensionPixelSize;
        this.f209801e = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74278I2, dimensionPixelSize);
        this.f209802f = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74285J2, this.f209802f);
        this.f209803g = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74271H2, this.f209803g);
        this.f209804h = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74264G2, this.f209804h);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74316O2, n8c0.f137624h);
        this.f209805i = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, aac0.f68401V2);
        try {
            this.f209812o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(aac0.f68405W2, 0);
            this.f209806j = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, aac0.f68417Z2);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74328Q2)) {
                float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74328Q2, 0);
                this.f209812o = dimensionPixelSize2;
                this.f209813p = dimensionPixelSize2;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74310N2)) {
                this.f209813p = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74310N2, 0);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74322P2)) {
                ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, b9c0.f74322P2);
                this.f209806j = colorStateList;
                this.f209817s = colorStateList != null ? colorStateList.getDefaultColor() : -7829368;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74304M2)) {
                int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74304M2, 0);
                ColorStateList colorStateListM223594o = m223594o(this.f209806j.getDefaultColor(), color);
                this.f209806j = colorStateListM223594o;
                this.f209817s = colorStateListM223594o.getDefaultColor();
                this.f209816r = color;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74500q2)) {
                ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, b9c0.f74500q2);
                this.f209807k = colorStateList2;
                int defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : -7829368;
                this.f209819u = defaultColor;
                this.f209818t = defaultColor;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74298L2)) {
                int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.f74298L2, 0);
                ColorStateList colorStateListM223594o2 = m223594o(this.f209807k.getDefaultColor(), color2);
                this.f209807k = colorStateListM223594o2;
                this.f209819u = colorStateListM223594o2.getDefaultColor();
                this.f209818t = color2;
            }
            this.f209811n = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(b9c0.f74507r2, -1), null);
            this.f209809l = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, b9c0.f74292K2);
            this.f209781H = typedArrayObtainStyledAttributes.getInt(b9c0.f74528u2, 300);
            this.f209776C = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74243D2, -1);
            this.f209777D = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74236C2, -1);
            this.f209823y = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74458k2, 0);
            this.f209779F = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74465l2, 0);
            this.f209783J = typedArrayObtainStyledAttributes.getInt(b9c0.f74250E2, 1);
            this.f209780G = typedArrayObtainStyledAttributes.getInt(b9c0.f74472m2, 0);
            this.f209784K = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74563z2, false);
            this.f209786M = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74334R2, false);
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74514s2)) {
                this.f209820v = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.f74514s2, -2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74479n2)) {
                this.f209821w = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.f74479n2, -2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74493p2)) {
                int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.f74493p2, -2);
                this.f209821w = layoutDimension;
                this.f209820v = layoutDimension;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74486o2)) {
                this.f209822x = typedArrayObtainStyledAttributes.getFloat(b9c0.f74486o2, 1.0f);
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74222A2)) {
                this.f209824z = typedArrayObtainStyledAttributes.getColor(b9c0.f74222A2, 0);
                this.f209823y = 0;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74229B2)) {
                this.f209774A = typedArrayObtainStyledAttributes.getColor(b9c0.f74229B2, 0);
                this.f209823y = 0;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f209815q = getResources().getDimensionPixelSize(u1c0.f173000n);
            this.f209778E = 0;
            m223617l();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f209797a.size();
        for (int i = 0; i < size; i++) {
            C22623f c22623f = this.f209797a.get(i);
            if (c22623f != null && c22623f.m223686e() != null && !TextUtils.isEmpty(c22623f.m223689h())) {
                return !this.f209784K ? 72 : 44;
            }
        }
        return 44;
    }

    private int getTabMinWidth() {
        int i = this.f209776C;
        if (i != -1) {
            return i;
        }
        int i2 = this.f209783J;
        if (i2 == 0 || i2 == 2) {
            return this.f209778E;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f209800d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static ColorStateList m223594o(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f209800d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f209800d.getChildAt(i2);
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
    public void m223595A() {
        for (int childCount = this.f209800d.getChildCount() - 1; childCount >= 0; childCount--) {
            m223597C(childCount);
        }
        Iterator<C22623f> it = this.f209797a.iterator();
        while (it.hasNext()) {
            C22623f next = it.next();
            it.remove();
            next.m223691j();
            m223630z(next);
        }
        this.f209798b = null;
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public void m223596B(@Nullable InterfaceC22620c interfaceC22620c) {
        this.f209788O.remove(interfaceC22620c);
    }

    /* JADX INFO: renamed from: C */
    public final void m223597C(int i) {
        TabView tabView = (TabView) this.f209800d.getChildAt(i);
        this.f209800d.removeViewAt(i);
        if (tabView != null) {
            tabView.m223653C();
            this.f209808k0.release(tabView);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: D */
    public void m223598D(@Nullable C22623f c22623f) {
        m223599E(c22623f, true);
    }

    /* JADX INFO: renamed from: E */
    public void m223599E(@Nullable C22623f c22623f, boolean z) {
        C22623f c22623f2 = this.f209798b;
        if (c22623f2 == c22623f) {
            if (c22623f2 != null) {
                m223623s(c22623f);
                m223615j(c22623f.m223687f());
                return;
            }
            return;
        }
        int iM223687f = c22623f != null ? c22623f.m223687f() : -1;
        if (z) {
            if ((c22623f2 == null || c22623f2.m223687f() == -1) && iM223687f != -1) {
                m223601G(iM223687f, 0.0f, true);
            } else {
                m223615j(iM223687f);
            }
            if (iM223687f != -1) {
                setSelectedTabView(iM223687f);
            }
        }
        this.f209798b = c22623f;
        if (c22623f2 != null) {
            m223625u(c22623f2);
        }
        if (c22623f != null) {
            m223624t(c22623f);
            float fM223675u = c22623f.f209872i.m223675u(0.0f);
            if (fM223675u >= 0.0f) {
                c22623f.f209872i.f209843b.setScaleY(fM223675u);
                c22623f.f209872i.f209843b.setScaleX(fM223675u);
            }
            float fM223674t = c22623f.f209872i.m223674t(0.0f);
            if (fM223674t >= 0.0f) {
                c22623f.f209872i.f209844c.setScaleX(fM223674t);
                c22623f.f209872i.f209844c.setScaleY(fM223674t);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m223600F(@Nullable w660 w660Var, boolean z) {
        DataSetObserver dataSetObserver;
        w660 w660Var2 = this.f209792S;
        if (w660Var2 != null && (dataSetObserver = this.f209793T) != null) {
            w660Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f209792S = w660Var;
        if (z && w660Var != null) {
            if (this.f209793T == null) {
                this.f209793T = new C22622e();
            }
            w660Var.registerDataSetObserver(this.f209793T);
        }
        m223629y();
    }

    /* JADX INFO: renamed from: G */
    public void m223601G(int i, float f, boolean z) {
        m223602H(i, f, z, true);
    }

    /* JADX INFO: renamed from: H */
    public void m223602H(int i, float f, boolean z, boolean z2) {
        C22623f c22623fM223627w;
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.f209800d.getChildCount()) {
            return;
        }
        if (z2) {
            this.f209800d.m223637g(i, f);
        }
        if (z2 && (c22623fM223627w = m223627w(i)) != null) {
            c22623fM223627w.f209872i.m223654D(i, f);
            int i2 = i + 1;
            if (f == 0.0f && this.f209814p0 > 0.5d) {
                i2 = i - 1;
            }
            C22623f c22623fM223627w2 = m223627w(i2);
            if (c22623fM223627w2 != null) {
                c22623fM223627w2.f209872i.m223654D(i2, 1.0f - f);
            }
            this.f209814p0 = f;
        }
        ValueAnimator valueAnimator = this.f209790Q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f209790Q.cancel();
        }
        scrollTo(m223618m(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m223603I(@Nullable ViewPager viewPager, boolean z) {
        m223604J(viewPager, z, false);
    }

    /* JADX INFO: renamed from: J */
    public final void m223604J(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f209791R;
        if (viewPager2 != null) {
            C22624g c22624g = this.f209794U;
            if (c22624g != null) {
                viewPager2.m4175P(c22624g);
            }
            C22619b c22619b = this.f209795V;
            if (c22619b != null) {
                this.f209791R.m4174O(c22619b);
            }
        }
        InterfaceC22620c interfaceC22620c = this.f209789P;
        if (interfaceC22620c != null) {
            m223596B(interfaceC22620c);
            this.f209789P = null;
        }
        if (viewPager != null) {
            this.f209791R = viewPager;
            if (this.f209794U == null) {
                this.f209794U = new C22624g(this);
            }
            this.f209794U.m223700a();
            viewPager.m4185d(this.f209794U);
            C22625h c22625h = new C22625h(viewPager);
            this.f209789P = c22625h;
            m223608c(c22625h);
            w660 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m223600F(adapter, z);
            }
            if (this.f209795V == null) {
                this.f209795V = new C22619b();
            }
            this.f209795V.m223681a(z);
            viewPager.m4184c(this.f209795V);
            m223601G(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f209791R = null;
            m223600F(null, false);
        }
        this.f209796W = z2;
    }

    /* JADX INFO: renamed from: K */
    public final void m223605K() {
        int size = this.f209797a.size();
        for (int i = 0; i < size; i++) {
            this.f209797a.get(i).m223699r();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m223606L(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f209783J == 1 && this.f209780G == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m223607M(boolean z) {
        for (int i = 0; i < this.f209800d.getChildCount(); i++) {
            View childAt = this.f209800d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m223606L((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m223614i(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m223608c(@Nullable InterfaceC22620c interfaceC22620c) {
        if (this.f209788O.contains(interfaceC22620c)) {
            return;
        }
        this.f209788O.add(interfaceC22620c);
    }

    /* JADX INFO: renamed from: d */
    public void m223609d(@NonNull C22623f c22623f) {
        m223611f(c22623f, this.f209797a.isEmpty());
    }

    /* JADX INFO: renamed from: e */
    public void m223610e(@NonNull C22623f c22623f, int i, boolean z) {
        if (c22623f.f209871h != this) {
            ig3.m135964a("Tab belongs to a different TabLayout.");
            return;
        }
        m223619n(c22623f, i);
        m223613h(c22623f);
        if (z) {
            c22623f.m223692k();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m223611f(@NonNull C22623f c22623f, boolean z) {
        m223610e(c22623f, this.f209797a.size(), z);
    }

    /* JADX INFO: renamed from: g */
    public final void m223612g(@NonNull NavigationTabItem navigationTabItem) {
        C22623f c22623fM223628x = m223628x();
        CharSequence charSequence = navigationTabItem.f209761a;
        if (charSequence != null) {
            c22623fM223628x.m223698q(charSequence);
        }
        Drawable drawable = navigationTabItem.f209762b;
        if (drawable != null) {
            c22623fM223628x.m223696o(drawable);
        }
        int i = navigationTabItem.f209763c;
        if (i != 0) {
            c22623fM223628x.m223694m(i);
        }
        if (!TextUtils.isEmpty(navigationTabItem.getContentDescription())) {
            c22623fM223628x.m223693l(navigationTabItem.getContentDescription());
        }
        m223609d(c22623fM223628x);
    }

    public int getSelectedTabPosition() {
        C22623f c22623f = this.f209798b;
        if (c22623f != null) {
            return c22623f.m223687f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f209797a.size();
    }

    public int getTabGravity() {
        return this.f209780G;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f209807k;
    }

    public int getTabIndicatorGravity() {
        return this.f209782I;
    }

    public int getTabMaxWidth() {
        return this.f209775B;
    }

    public int getTabMode() {
        return this.f209783J;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f209809l;
    }

    @Nullable
    public Drawable getTabSelectedIndicator() {
        return this.f209810m;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f209806j;
    }

    /* JADX INFO: renamed from: h */
    public final void m223613h(@NonNull C22623f c22623f) {
        TabView tabView = c22623f.f209872i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f209800d.addView(tabView, c22623f.m223687f(), m223620p());
    }

    /* JADX INFO: renamed from: i */
    public final void m223614i(View view) {
        if (view instanceof NavigationTabItem) {
            m223612g((NavigationTabItem) view);
        } else {
            ig3.m135964a("Only TabItem instances can be added to TabLayout");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m223615j(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !gbl0.m125171P(this) || this.f209800d.m223635e()) {
            m223601G(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM223618m = m223618m(i, 0.0f);
        if (scrollX != iM223618m) {
            m223626v();
            this.f209790Q.setIntValues(scrollX, iM223618m);
            this.f209790Q.start();
        }
        this.f209800d.m223633c(i, this.f209781H);
        if (i != getSelectedTabPosition()) {
            C22623f c22623fM223627w = m223627w(i);
            C22623f c22623fM223627w2 = m223627w(getSelectedTabPosition());
            if (c22623fM223627w == null || c22623fM223627w2 == null) {
                return;
            }
            c22623fM223627w.f209872i.m223665k(false, this.f209781H);
            c22623fM223627w2.f209872i.m223665k(true, this.f209781H);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m223616k(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f209800d.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.f209800d.setGravity(8388611);
    }

    /* JADX INFO: renamed from: l */
    public final void m223617l() {
        int i = this.f209783J;
        gbl0.m125233z0(this.f209800d, (i == 0 || i == 2) ? Math.max(0, this.f209779F - this.f209801e) : 0, 0, 0, 0);
        int i2 = this.f209783J;
        if (i2 == 0) {
            m223616k(this.f209780G);
        } else if (i2 == 1 || i2 == 2) {
            this.f209800d.setGravity(1);
        }
        m223607M(true);
    }

    /* JADX INFO: renamed from: m */
    public final int m223618m(int i, float f) {
        int i2 = this.f209783J;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f209800d.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f209800d.getChildCount() ? this.f209800d.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return gbl0.m125228x(this) == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: n */
    public final void m223619n(@NonNull C22623f c22623f, int i) {
        c22623f.m223697p(i);
        this.f209797a.add(i, c22623f);
        int size = this.f209797a.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f209797a.get(i).m223697p(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.f209791R == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m223604J((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f209796W) {
            setupWithViewPager(null);
            this.f209796W = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < this.f209800d.getChildCount(); i++) {
            View childAt = this.f209800d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m223670p(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C17055gc.m125351T0(accessibilityNodeInfo).m125431q0(C17055gc.e.m125462b(1, getTabCount(), false, 1));
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
            int iDpToPx = this.f209777D;
            if (iDpToPx <= 0) {
                iDpToPx = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.f209775B = iDpToPx;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f209783J;
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
    public final LinearLayout.LayoutParams m223620p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m223606L(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: renamed from: q */
    public C22623f m223621q() {
        C22623f c22623fAcquire = f209773F0.acquire();
        return c22623fAcquire == null ? new C22623f() : c22623fAcquire;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final TabView m223622r(@NonNull C22623f c22623f) {
        hb80<TabView> hb80Var = this.f209808k0;
        TabView tabViewAcquire = hb80Var != null ? hb80Var.acquire() : null;
        if (tabViewAcquire == null) {
            tabViewAcquire = new TabView(getContext());
        }
        tabViewAcquire.setTab(c22623f);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c22623f.f209867d)) {
            tabViewAcquire.setContentDescription(c22623f.f209866c);
            return tabViewAcquire;
        }
        tabViewAcquire.setContentDescription(c22623f.f209867d);
        return tabViewAcquire;
    }

    /* JADX INFO: renamed from: s */
    public final void m223623s(@NonNull C22623f c22623f) {
        for (int size = this.f209788O.size() - 1; size >= 0; size--) {
            this.f209788O.get(size).mo63840b(c22623f);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f209784K != z) {
            this.f209784K = z;
            for (int i = 0; i < this.f209800d.getChildCount(); i++) {
                View childAt = this.f209800d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m223662L();
                }
            }
            m223617l();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable InterfaceC22620c interfaceC22620c) {
        InterfaceC22620c interfaceC22620c2 = this.f209787N;
        if (interfaceC22620c2 != null) {
            m223596B(interfaceC22620c2);
        }
        this.f209787N = interfaceC22620c;
        if (interfaceC22620c != null) {
            m223608c(interfaceC22620c);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m223626v();
        this.f209790Q.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(nu0.m161424b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f209800d.m223638h(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f209782I != i) {
            this.f209782I = i;
            gbl0.m125183a0(this.f209800d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f209800d.m223639i(i);
    }

    public void setTabGravity(int i) {
        if (this.f209780G != i) {
            this.f209780G = i;
            m223617l();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f209807k != colorStateList) {
            this.f209807k = colorStateList;
            m223605K();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(nu0.m161423a(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f209785L = z;
        gbl0.m125183a0(this.f209800d);
    }

    public void setTabMode(int i) {
        if (i != this.f209783J) {
            this.f209783J = i;
            m223617l();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f209809l != colorStateList) {
            this.f209809l = colorStateList;
            for (int i = 0; i < this.f209800d.getChildCount(); i++) {
                View childAt = this.f209800d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m223660J(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(nu0.m161423a(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f209806j != colorStateList) {
            this.f209806j = colorStateList;
            m223605K();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable w660 w660Var) {
        m223600F(w660Var, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f209786M != z) {
            this.f209786M = z;
            for (int i = 0; i < this.f209800d.getChildCount(); i++) {
                View childAt = this.f209800d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m223660J(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        m223603I(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m223624t(@NonNull C22623f c22623f) {
        for (int size = this.f209788O.size() - 1; size >= 0; size--) {
            this.f209788O.get(size).mo63841c(c22623f);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m223625u(@NonNull C22623f c22623f) {
        for (int size = this.f209788O.size() - 1; size >= 0; size--) {
            this.f209788O.get(size).mo63839a(c22623f);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m223626v() {
        if (this.f209790Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f209790Q = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f209790Q.setDuration(this.f209781H);
            this.f209790Q.addUpdateListener(new C22618a());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public C22623f m223627w(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f209797a.get(i);
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public C22623f m223628x() {
        C22623f c22623fM223621q = m223621q();
        c22623fM223621q.f209871h = this;
        c22623fM223621q.f209872i = m223622r(c22623fM223621q);
        return c22623fM223621q;
    }

    /* JADX INFO: renamed from: y */
    public void m223629y() {
        int currentItem;
        m223595A();
        w660 w660Var = this.f209792S;
        if (w660Var != null) {
            int count = w660Var.getCount();
            for (int i = 0; i < count; i++) {
                m223611f(m223628x().m223698q(this.f209792S.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f209791R;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m223598D(m223627w(currentItem));
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m223630z(C22623f c22623f) {
        return f209773F0.release(c22623f);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m223614i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m223614i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m223614i(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable InterfaceC22621d interfaceC22621d) {
        setOnTabSelectedListener((InterfaceC22620c) interfaceC22621d);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (this.f209810m != drawable) {
            this.f209810m = drawable;
            gbl0.m125183a0(this.f209800d);
        }
    }

    public VNavigationTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j0c0.f115667k);
    }

    public VNavigationTabLayout(@NonNull Context context) {
        this(context, null);
    }
}
