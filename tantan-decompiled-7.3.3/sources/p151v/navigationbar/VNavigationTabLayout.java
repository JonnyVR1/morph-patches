package p151v.navigationbar;

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
import p153l.C15967bc;
import p153l.bac0;
import p153l.cf60;
import p153l.gec0;
import p153l.gic0;
import p153l.h2j0;
import p153l.hhc0;
import p153l.kkl0;
import p153l.msi0;
import p153l.ni80;
import p153l.nj80;
import p153l.o8c0;
import p153l.oce;
import p153l.pj80;
import p153l.pxw;
import p153l.rj80;
import p153l.tgc0;
import p153l.tu0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
@ViewPager.InterfaceC0713e
public class VNavigationTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: E0 */
    public static final int f210694E0 = tgc0.f174068n;

    /* JADX INFO: renamed from: F0 */
    public static final nj80<C22738f> f210695F0 = new rj80(16);

    /* JADX INFO: renamed from: A */
    public int f210696A;

    /* JADX INFO: renamed from: B */
    public int f210697B;

    /* JADX INFO: renamed from: C */
    public final int f210698C;

    /* JADX INFO: renamed from: D */
    public final int f210699D;

    /* JADX INFO: renamed from: E */
    public final int f210700E;

    /* JADX INFO: renamed from: F */
    public int f210701F;

    /* JADX INFO: renamed from: G */
    public int f210702G;

    /* JADX INFO: renamed from: H */
    public int f210703H;

    /* JADX INFO: renamed from: I */
    public int f210704I;

    /* JADX INFO: renamed from: J */
    public int f210705J;

    /* JADX INFO: renamed from: K */
    public boolean f210706K;

    /* JADX INFO: renamed from: L */
    public boolean f210707L;

    /* JADX INFO: renamed from: M */
    public boolean f210708M;

    /* JADX INFO: renamed from: N */
    @Nullable
    public InterfaceC22735c f210709N;

    /* JADX INFO: renamed from: O */
    public final ArrayList<InterfaceC22735c> f210710O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public InterfaceC22735c f210711P;

    /* JADX INFO: renamed from: Q */
    public ValueAnimator f210712Q;

    /* JADX INFO: renamed from: R */
    @Nullable
    public ViewPager f210713R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public cf60 f210714S;

    /* JADX INFO: renamed from: T */
    public DataSetObserver f210715T;

    /* JADX INFO: renamed from: U */
    public C22739g f210716U;

    /* JADX INFO: renamed from: V */
    public C22734b f210717V;

    /* JADX INFO: renamed from: W */
    public boolean f210718W;

    /* JADX INFO: renamed from: a */
    public final ArrayList<C22738f> f210719a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C22738f f210720b;

    /* JADX INFO: renamed from: c */
    public final RectF f210721c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SlidingTabIndicator f210722d;

    /* JADX INFO: renamed from: e */
    public int f210723e;

    /* JADX INFO: renamed from: f */
    public int f210724f;

    /* JADX INFO: renamed from: g */
    public int f210725g;

    /* JADX INFO: renamed from: h */
    public int f210726h;

    /* JADX INFO: renamed from: i */
    public int f210727i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f210728j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f210729k;

    /* JADX INFO: renamed from: k0 */
    public final nj80<TabView> f210730k0;

    /* JADX INFO: renamed from: l */
    public ColorStateList f210731l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Drawable f210732m;

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode f210733n;

    /* JADX INFO: renamed from: o */
    public float f210734o;

    /* JADX INFO: renamed from: p */
    public float f210735p;

    /* JADX INFO: renamed from: p0 */
    public float f210736p0;

    /* JADX INFO: renamed from: q */
    public float f210737q;

    /* JADX INFO: renamed from: r */
    public int f210738r;

    /* JADX INFO: renamed from: s */
    public int f210739s;

    /* JADX INFO: renamed from: t */
    public int f210740t;

    /* JADX INFO: renamed from: u */
    public int f210741u;

    /* JADX INFO: renamed from: v */
    public int f210742v;

    /* JADX INFO: renamed from: w */
    public int f210743w;

    /* JADX INFO: renamed from: x */
    public float f210744x;

    /* JADX INFO: renamed from: y */
    public int f210745y;

    /* JADX INFO: renamed from: z */
    public int f210746z;

    public class SlidingTabIndicator extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public int f210747a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final Paint f210748b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final GradientDrawable f210749c;

        /* JADX INFO: renamed from: d */
        public int f210750d;

        /* JADX INFO: renamed from: e */
        public float f210751e;

        /* JADX INFO: renamed from: f */
        public int f210752f;

        /* JADX INFO: renamed from: g */
        public int f210753g;

        /* JADX INFO: renamed from: h */
        public int f210754h;

        /* JADX INFO: renamed from: i */
        public ValueAnimator f210755i;

        /* JADX INFO: renamed from: j */
        public int f210756j;

        /* JADX INFO: renamed from: k */
        public int f210757k;

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$SlidingTabIndicator$a */
        public class C22728a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f210759a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f210760b;

            public C22728a(int i, int i2) {
                this.f210759a = i;
                this.f210760b = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            @SuppressLint({"RestrictedApi"})
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (this.f210759a - SlidingTabIndicator.this.f210756j > 0) {
                    SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                    if (animatedFraction >= 0.5f) {
                        SlidingTabIndicator.this.m224882f(slidingTabIndicator.f210756j + Math.round((animatedFraction - 0.5f) * 2.0f * (this.f210759a - SlidingTabIndicator.this.f210756j)), SlidingTabIndicator.this.f210757k + Math.round(this.f210760b - SlidingTabIndicator.this.f210757k));
                        return;
                    } else {
                        SlidingTabIndicator.this.m224882f(slidingTabIndicator.f210756j, SlidingTabIndicator.this.f210757k + Math.round(animatedFraction * 2.0f * (this.f210760b - SlidingTabIndicator.this.f210757k)));
                        return;
                    }
                }
                SlidingTabIndicator slidingTabIndicator2 = SlidingTabIndicator.this;
                if (animatedFraction >= 0.5f) {
                    SlidingTabIndicator.this.m224882f(slidingTabIndicator2.f210756j + Math.round(this.f210759a - SlidingTabIndicator.this.f210756j), SlidingTabIndicator.this.f210757k + Math.round((animatedFraction - 0.5f) * 2.0f * (this.f210760b - SlidingTabIndicator.this.f210757k)));
                } else {
                    SlidingTabIndicator.this.m224882f(slidingTabIndicator2.f210756j + Math.round(animatedFraction * 2.0f * (this.f210759a - SlidingTabIndicator.this.f210756j)), SlidingTabIndicator.this.f210757k);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$SlidingTabIndicator$b */
        public class C22729b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f210762a;

            public C22729b(int i) {
                this.f210762a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SlidingTabIndicator slidingTabIndicator = SlidingTabIndicator.this;
                slidingTabIndicator.f210750d = this.f210762a;
                slidingTabIndicator.f210751e = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SlidingTabIndicator.this.f210750d = this.f210762a;
            }
        }

        public SlidingTabIndicator(Context context) {
            super(context);
            this.f210750d = -1;
            this.f210752f = -1;
            this.f210753g = -1;
            this.f210754h = -1;
            this.f210756j = -1;
            this.f210757k = -1;
            setWillNotDraw(false);
            this.f210748b = new Paint();
            this.f210749c = new GradientDrawable();
        }

        /* JADX INFO: renamed from: c */
        public void m224879c(int i, int i2) {
            ValueAnimator valueAnimator = this.f210755i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f210755i.cancel();
            }
            m224887k(true, i, i2);
        }

        /* JADX INFO: renamed from: d */
        public final void m224880d(@NonNull TabView tabView, @NonNull RectF rectF) {
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int right = (tabView.getRight() - tabView.getLeft()) / 4;
            rectF.set(left - right, 0.0f, left + right, 0.0f);
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            super.draw(canvas);
            Drawable drawable = VNavigationTabLayout.this.f210732m;
            int height = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i = this.f210747a;
            if (i >= 0) {
                intrinsicHeight = i;
            }
            int i2 = VNavigationTabLayout.this.f210704I;
            if (i2 == 0) {
                height = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i2 == 1) {
                height = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i2 != 2) {
                intrinsicHeight = i2 != 3 ? 0 : getHeight();
            }
            int i3 = this.f210753g;
            if (i3 < 0 || this.f210754h <= i3) {
                return;
            }
            Drawable drawable2 = VNavigationTabLayout.this.f210732m;
            if (drawable2 == null) {
                drawable2 = this.f210749c;
            }
            Drawable drawableMutate = oce.m167178r(drawable2).mutate();
            drawableMutate.setBounds(this.f210753g, height, this.f210754h, intrinsicHeight);
            Paint paint = this.f210748b;
            if (paint != null) {
                oce.m167174n(drawableMutate, paint.getColor());
            }
            drawableMutate.draw(canvas);
        }

        /* JADX INFO: renamed from: e */
        public boolean m224881e() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public void m224882f(int i, int i2) {
            if (i == this.f210753g && i2 == this.f210754h) {
                return;
            }
            this.f210753g = i;
            this.f210754h = i2;
            kkl0.m150146a0(this);
        }

        /* JADX INFO: renamed from: g */
        public void m224883g(int i, float f) {
            ValueAnimator valueAnimator = this.f210755i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f210755i.cancel();
            }
            this.f210750d = i;
            this.f210751e = f;
            m224886j();
        }

        /* JADX INFO: renamed from: h */
        public void m224884h(int i) {
            if (this.f210748b.getColor() != i) {
                this.f210748b.setColor(i);
                kkl0.m150146a0(this);
            }
        }

        /* JADX INFO: renamed from: i */
        public void m224885i(int i) {
            if (this.f210747a != i) {
                this.f210747a = i;
                kkl0.m150146a0(this);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m224886j() {
            int left;
            int right;
            View childAt = getChildAt(this.f210750d);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
                if (!vNavigationTabLayout.f210707L && (childAt instanceof TabView)) {
                    m224880d((TabView) childAt, vNavigationTabLayout.f210721c);
                    left = (int) VNavigationTabLayout.this.f210721c.left;
                    right = (int) VNavigationTabLayout.this.f210721c.right;
                }
                if (this.f210751e > 0.0f && this.f210750d < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f210750d + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    VNavigationTabLayout vNavigationTabLayout2 = VNavigationTabLayout.this;
                    if (!vNavigationTabLayout2.f210707L && (childAt2 instanceof TabView)) {
                        m224880d((TabView) childAt2, vNavigationTabLayout2.f210721c);
                        left2 = (int) VNavigationTabLayout.this.f210721c.left;
                        right2 = (int) VNavigationTabLayout.this.f210721c.right;
                    }
                    float f = this.f210751e;
                    if (f >= 0.5d) {
                        left = (int) (left + ((f - 0.5f) * 2.0f * (left2 - left)));
                        right += right2 - right;
                    } else {
                        right = (int) (right + (f * 2.0f * (right2 - right)));
                    }
                }
            }
            m224882f(left, right);
        }

        /* JADX INFO: renamed from: k */
        public final void m224887k(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m224886j();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (!vNavigationTabLayout.f210707L && (childAt instanceof TabView)) {
                m224880d((TabView) childAt, vNavigationTabLayout.f210721c);
                left = (int) VNavigationTabLayout.this.f210721c.left;
                right = (int) VNavigationTabLayout.this.f210721c.right;
            }
            int i3 = this.f210753g;
            int i4 = this.f210754h;
            if (i3 == left && i4 == right) {
                return;
            }
            if (z) {
                this.f210756j = i3;
                this.f210757k = i4;
            }
            C22728a c22728a = new C22728a(left, right);
            if (!z) {
                this.f210755i.removeAllUpdateListeners();
                this.f210755i.addUpdateListener(c22728a);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f210755i = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c22728a);
            valueAnimator.addListener(new C22729b(i));
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f210755i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m224886j();
            } else {
                m224887k(false, this.f210750d, -1);
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
            if (vNavigationTabLayout.f210702G == 1 || vNavigationTabLayout.f210705J == 2) {
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
                    vNavigationTabLayout2.f210702G = 0;
                    vNavigationTabLayout2.m224853M(false);
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
        public C22738f f210764a;

        /* JADX INFO: renamed from: b */
        public TextView f210765b;

        /* JADX INFO: renamed from: c */
        public ImageView f210766c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public View f210767d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public BadgeDrawable f210768e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public View f210769f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public TextView f210770g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public ImageView f210771h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public Drawable f210772i;

        /* JADX INFO: renamed from: j */
        public int f210773j;

        /* JADX INFO: renamed from: k */
        public ValueAnimator f210774k;

        /* JADX INFO: renamed from: l */
        public ArgbEvaluator f210775l;

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$a */
        public class ViewOnLayoutChangeListenerC22730a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f210777a;

            public ViewOnLayoutChangeListenerC22730a(View view) {
                this.f210777a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f210777a.getVisibility() == 0) {
                    TabView.this.m224904H(this.f210777a);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$b */
        public class C22731b implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f210779a;

            public C22731b(boolean z) {
                this.f210779a = z;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                boolean z = this.f210779a;
                TabView tabView = TabView.this;
                if (z) {
                    tabView.m224912l(animatedFraction);
                } else {
                    tabView.m224912l(1.0f - animatedFraction);
                }
            }
        }

        /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$TabView$c */
        public class C22732c extends AnimatorListenerAdapter {
            public C22732c() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TabView.this.m224905I();
                TabView tabView = TabView.this;
                tabView.m224906J(tabView.getContext());
                if (TabView.this.f210772i == null || !TabView.this.f210772i.isStateful()) {
                    return;
                }
                TabView.this.f210772i.setState(TabView.this.getDrawableState());
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public TabView(Context context) {
            super(context);
            this.f210773j = 2;
            this.f210775l = null;
            m224906J(context);
            kkl0.m150196z0(this, VNavigationTabLayout.this.f210723e, VNavigationTabLayout.this.f210724f, VNavigationTabLayout.this.f210725g, VNavigationTabLayout.this.f210726h);
            setGravity(17);
            setOrientation(!VNavigationTabLayout.this.f210706K ? 1 : 0);
            setClickable(true);
            kkl0.m150111A0(this, ni80.m163268b(getContext(), 1002));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f210768e;
        }

        private int getContentWidth() {
            View[] viewArr = {this.f210765b, this.f210766c, this.f210769f};
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
            if (this.f210768e == null) {
                this.f210768e = BadgeDrawable.create(getContext());
            }
            m224903G();
            BadgeDrawable badgeDrawable = this.f210768e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            wtq0.m207906a("Unable to create badge");
            return null;
        }

        /* JADX INFO: renamed from: A */
        public void m224897A() {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f210766c.getLayoutParams();
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f210742v;
            if (i != 0) {
                layoutParams.width = i;
            }
            int i2 = vNavigationTabLayout.f210743w;
            if (i2 != 0) {
                layoutParams.height = i2;
            }
            this.f210766c.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: B */
        public void m224898B(String str) {
            if (VNavigationTabLayout.this.f210735p > 0.0f) {
                TextPaint paint = this.f210765b.getPaint();
                paint.setTextSize(VNavigationTabLayout.this.f210734o);
                float fMeasureText = paint.measureText(str);
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                float f = fontMetricsInt.bottom - fontMetricsInt.top;
                paint.setTextSize(VNavigationTabLayout.this.f210735p);
                float fMeasureText2 = paint.measureText(str);
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                int i = (int) (((fMeasureText2 - fMeasureText) / 2.0f) + 0.5f);
                int i2 = (int) ((((fontMetricsInt2.bottom - fontMetricsInt2.top) - f) / 2.0f) + 0.5f);
                this.f210765b.setPadding(i, i2, i, i2);
            }
        }

        /* JADX INFO: renamed from: C */
        public void m224899C() {
            setTab(null);
            setSelected(false);
        }

        /* JADX INFO: renamed from: D */
        public void m224900D(int i, float f) {
            ValueAnimator valueAnimator = this.f210774k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f210774k.cancel();
            }
            if (this.f210769f != null) {
                return;
            }
            if (f != 0.0f && f != 1.0f) {
                m224912l(f);
                return;
            }
            m224905I();
            m224906J(getContext());
            Drawable drawable = this.f210772i;
            if (drawable == null || !drawable.isStateful()) {
                return;
            }
            this.f210772i.setState(getDrawableState());
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: E */
        public final void m224901E(@Nullable View view) {
            if (m224924x() && view != null) {
                m224914n(false);
                BadgeUtils.attachBadgeDrawable(this.f210768e, view, m224923w(view));
                this.f210767d = view;
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: F */
        public final void m224902F() {
            if (m224924x()) {
                m224914n(true);
                View view = this.f210767d;
                if (view != null) {
                    BadgeUtils.detachBadgeDrawable(this.f210768e, view, m224923w(view));
                    this.f210767d = null;
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m224903G() {
            C22738f c22738f;
            C22738f c22738f2;
            if (m224924x()) {
                if (this.f210769f != null) {
                    m224902F();
                    return;
                }
                if (this.f210766c != null && (c22738f2 = this.f210764a) != null && c22738f2.m224932e() != null) {
                    View view = this.f210767d;
                    ImageView imageView = this.f210766c;
                    if (view == imageView) {
                        m224904H(imageView);
                        return;
                    } else {
                        m224902F();
                        m224901E(this.f210766c);
                        return;
                    }
                }
                if (this.f210765b == null || (c22738f = this.f210764a) == null || c22738f.m224934g() != 1) {
                    m224902F();
                    return;
                }
                View view2 = this.f210767d;
                TextView textView = this.f210765b;
                if (view2 == textView) {
                    m224904H(textView);
                } else {
                    m224902F();
                    m224901E(this.f210765b);
                }
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: H */
        public final void m224904H(@NonNull View view) {
            if (m224924x() && view == this.f210767d) {
                BadgeUtils.setBadgeDrawableBounds(this.f210768e, view, m224923w(view));
            }
        }

        /* JADX INFO: renamed from: I */
        public final void m224905I() {
            C22738f c22738f = this.f210764a;
            Drawable drawableMutate = null;
            View viewM224931d = c22738f != null ? c22738f.m224931d() : null;
            if (viewM224931d != null) {
                ViewParent parent = viewM224931d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM224931d);
                    }
                    addView(viewM224931d);
                }
                this.f210769f = viewM224931d;
                TextView textView = this.f210765b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f210766c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f210766c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewM224931d.findViewById(R.id.text1);
                this.f210770g = textView2;
                if (textView2 != null) {
                    this.f210773j = msi0.m159806d(textView2);
                }
                this.f210771h = (ImageView) viewM224931d.findViewById(R.id.icon);
            } else {
                View view = this.f210769f;
                if (view != null) {
                    removeView(view);
                    this.f210769f = null;
                }
                this.f210770g = null;
                this.f210771h = null;
            }
            if (this.f210769f == null) {
                if (this.f210766c == null) {
                    m224925y();
                }
                if (c22738f != null && c22738f.m224932e() != null) {
                    drawableMutate = oce.m167178r(c22738f.m224932e()).mutate();
                }
                if (drawableMutate != null) {
                    oce.m167175o(drawableMutate, VNavigationTabLayout.this.f210729k);
                    PorterDuff.Mode mode = VNavigationTabLayout.this.f210733n;
                    if (mode != null) {
                        oce.m167176p(drawableMutate, mode);
                    }
                }
                if (this.f210765b == null) {
                    m224926z();
                    this.f210773j = msi0.m159806d(this.f210765b);
                }
                ColorStateList colorStateList = VNavigationTabLayout.this.f210728j;
                if (colorStateList != null) {
                    this.f210765b.setTextColor(colorStateList);
                }
                m224909M(this.f210765b, this.f210766c);
                m224903G();
                m224910j(this.f210766c);
                m224910j(this.f210765b);
            } else {
                TextView textView3 = this.f210770g;
                if (textView3 != null || this.f210771h != null) {
                    m224909M(textView3, this.f210771h);
                }
            }
            if (c22738f != null && !TextUtils.isEmpty(c22738f.f210789d)) {
                setContentDescription(c22738f.f210789d);
            }
            setSelected(c22738f != null && c22738f.m224936i());
        }

        /* JADX INFO: renamed from: J */
        public final void m224906J(Context context) {
            GradientDrawable gradientDrawable;
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f210745y;
            if (i != 0) {
                Drawable drawableM192702b = tu0.m192702b(context, i);
                this.f210772i = drawableM192702b;
                if (drawableM192702b != null && drawableM192702b.isStateful()) {
                    this.f210772i.setState(getDrawableState());
                }
            } else if (vNavigationTabLayout.f210746z == 0 && vNavigationTabLayout.f210696A == 0) {
                this.f210772i = null;
            } else {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                VNavigationTabLayout vNavigationTabLayout2 = VNavigationTabLayout.this;
                int i2 = vNavigationTabLayout2.f210746z;
                if (i2 == 0) {
                    i2 = 0;
                }
                int i3 = vNavigationTabLayout2.f210696A;
                if (i3 == 0) {
                    i3 = 0;
                }
                gradientDrawable2.setColor(VNavigationTabLayout.m224840o(i2, i3));
                this.f210772i = gradientDrawable2;
            }
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(0);
            Drawable rippleDrawable = gradientDrawable3;
            if (VNavigationTabLayout.this.f210731l != null) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setCornerRadius(1.0E-5f);
                gradientDrawable4.setColor(-1);
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(VNavigationTabLayout.this.f210731l);
                boolean z = VNavigationTabLayout.this.f210708M;
                if (z) {
                    gradientDrawable = gradientDrawable3;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable, z ? null : gradientDrawable4);
            }
            kkl0.m150170m0(this, rippleDrawable);
            VNavigationTabLayout.this.invalidate();
        }

        /* JADX INFO: renamed from: K */
        public final void m224907K(boolean z, boolean z2, int i) {
            C22731b c22731b = new C22731b(z2);
            if (!z) {
                this.f210774k.removeAllUpdateListeners();
                this.f210774k.addUpdateListener(c22731b);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f210774k = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f210774k.setDuration(i);
            this.f210774k.setFloatValues(0.0f, 1.0f);
            this.f210774k.addUpdateListener(c22731b);
            this.f210774k.addListener(new C22732c());
            this.f210774k.start();
        }

        /* JADX INFO: renamed from: L */
        public final void m224908L() {
            setOrientation(!VNavigationTabLayout.this.f210706K ? 1 : 0);
            TextView textView = this.f210770g;
            if (textView == null && this.f210771h == null) {
                m224909M(this.f210765b, this.f210766c);
            } else {
                m224909M(textView, this.f210771h);
            }
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: M */
        public final void m224909M(@Nullable TextView textView, @Nullable ImageView imageView) {
            C22738f c22738f = this.f210764a;
            Drawable drawableMutate = (c22738f == null || c22738f.m224932e() == null) ? null : oce.m167178r(this.f210764a.m224932e()).mutate();
            C22738f c22738f2 = this.f210764a;
            CharSequence charSequenceM224935h = c22738f2 != null ? c22738f2.m224935h() : null;
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
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM224935h);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(charSequenceM224935h);
                    if (this.f210764a.f210792g == 1) {
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
                if (VNavigationTabLayout.this.f210706K) {
                    if (iDpToPx != pxw.m174248a(marginLayoutParams)) {
                        pxw.m174250c(marginLayoutParams, iDpToPx);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iDpToPx != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iDpToPx;
                    pxw.m174250c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C22738f c22738f3 = this.f210764a;
            h2j0.m133392a(this, zIsEmpty ? c22738f3 != null ? c22738f3.f210789d : null : null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f210772i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f210772i.setState(drawableState)) {
                invalidate();
                VNavigationTabLayout.this.invalidate();
            }
        }

        @Nullable
        public ImageView getIconView() {
            return this.f210766c;
        }

        @Nullable
        public C22738f getTab() {
            return this.f210764a;
        }

        @Nullable
        public TextView getTextView() {
            return this.f210765b;
        }

        /* JADX INFO: renamed from: j */
        public final void m224910j(@Nullable View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC22730a(view));
        }

        /* JADX INFO: renamed from: k */
        public void m224911k(boolean z, int i) {
            ValueAnimator valueAnimator = this.f210774k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f210774k.cancel();
            }
            m224907K(true, z, i);
        }

        /* JADX INFO: renamed from: l */
        public final void m224912l(float f) {
            int iM224917q;
            TextView textView = this.f210765b;
            if (textView != null) {
                float fM224921u = m224921u(f);
                if (fM224921u >= 0.0f) {
                    textView.setScaleX(fM224921u);
                    textView.setScaleY(fM224921u);
                }
                int iM224922v = m224922v(f);
                if (iM224922v != -1) {
                    textView.setTextColor(iM224922v);
                }
            }
            ImageView imageView = this.f210766c;
            if (imageView != null) {
                int iM224919s = m224919s(f);
                if (iM224919s != -1) {
                    Drawable drawableMutate = imageView.getDrawable() != null ? oce.m167178r(imageView.getDrawable()).mutate() : null;
                    if (drawableMutate != null) {
                        oce.m167175o(drawableMutate, VNavigationTabLayout.m224840o(iM224919s, iM224919s));
                    }
                }
                float fM224920t = m224920t(f);
                if (fM224920t >= 0.0f) {
                    imageView.setScaleX(fM224920t);
                    imageView.setScaleY(fM224920t);
                }
            }
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            int i = vNavigationTabLayout.f210746z;
            if (i == 0 || i == vNavigationTabLayout.f210696A || (iM224917q = m224917q(f)) == -1) {
                return;
            }
            Drawable background = getBackground();
            if (!(background instanceof GradientDrawable)) {
                background = new GradientDrawable();
            }
            ((GradientDrawable) background).setColor(VNavigationTabLayout.m224840o(iM224917q, iM224917q));
            kkl0.m150170m0(this, background);
        }

        /* JADX INFO: renamed from: m */
        public final float m224913m(@NonNull Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* JADX INFO: renamed from: n */
        public final void m224914n(boolean z) {
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
        public final FrameLayout m224915o() {
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
            BadgeDrawable badgeDrawable = this.f210768e;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f210768e.getContentDescription()));
            }
            C15967bc c15967bcM103355T0 = C15967bc.m103355T0(accessibilityNodeInfo);
            c15967bcM103355T0.m103436r0(C15967bc.f.m103467a(0, 1, this.f210764a.m224933f(), 1, false, isSelected()));
            if (isSelected()) {
                c15967bcM103355T0.m103433p0(false);
                c15967bcM103355T0.m103414f0(C15967bc.a.f76060i);
            }
            c15967bcM103355T0.m103378I0("Tab");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f210774k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            m224907K(false, false, -1);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = VNavigationTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(VNavigationTabLayout.this.f210697B, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f210765b != null) {
                float f = VNavigationTabLayout.this.f210734o;
                int i3 = this.f210773j;
                ImageView imageView = this.f210766c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f210765b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = VNavigationTabLayout.this.f210737q;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f210765b.getTextSize();
                int lineCount = this.f210765b.getLineCount();
                int iM159806d = msi0.m159806d(this.f210765b);
                if (f != textSize || (iM159806d >= 0 && i3 != iM159806d)) {
                    if (VNavigationTabLayout.this.f210705J != 1 || f <= textSize || lineCount != 1 || ((layout = this.f210765b.getLayout()) != null && m224913m(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f210765b.setTextSize(0, f);
                        this.f210765b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m224916p(@NonNull Canvas canvas) {
            Drawable drawable = this.f210772i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f210772i.draw(canvas);
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f210764a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f210764a.m224938k();
            return true;
        }

        /* JADX INFO: renamed from: q */
        public int m224917q(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m224918r(f, vNavigationTabLayout.f210696A, vNavigationTabLayout.f210746z);
        }

        /* JADX INFO: renamed from: r */
        public final int m224918r(float f, @ColorInt int i, @ColorInt int i2) {
            if (i == 0) {
                return -1;
            }
            if (this.f210775l == null) {
                this.f210775l = new ArgbEvaluator();
            }
            if (VNavigationTabLayout.this.f210728j != null) {
                return ((Integer) this.f210775l.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
            }
            return -1;
        }

        /* JADX INFO: renamed from: s */
        public int m224919s(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m224918r(f, vNavigationTabLayout.f210740t, vNavigationTabLayout.f210741u);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.f210765b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f210766c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f210769f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable C22738f c22738f) {
            if (c22738f != this.f210764a) {
                this.f210764a = c22738f;
                m224905I();
            }
        }

        /* JADX INFO: renamed from: t */
        public float m224920t(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (vNavigationTabLayout.f210743w <= 0 || vNavigationTabLayout.f210742v <= 0) {
                return -1.0f;
            }
            float f2 = vNavigationTabLayout.f210744x;
            if (f2 <= 0.0f) {
                return -1.0f;
            }
            return f2 - (f * (f2 - 1.0f));
        }

        /* JADX INFO: renamed from: u */
        public float m224921u(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            float f2 = vNavigationTabLayout.f210735p;
            if (f2 <= 0.0f) {
                return -1.0f;
            }
            float f3 = vNavigationTabLayout.f210734o;
            return (f2 / f3) - (f * ((f2 / f3) - 1.0f));
        }

        /* JADX INFO: renamed from: v */
        public int m224922v(float f) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            return m224918r(f, vNavigationTabLayout.f210738r, vNavigationTabLayout.f210739s);
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        public final FrameLayout m224923w(@NonNull View view) {
            if ((view == this.f210766c || view == this.f210765b) && BadgeUtils.USE_COMPAT_PARENT) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: renamed from: x */
        public final boolean m224924x() {
            return this.f210768e != null;
        }

        /* JADX INFO: renamed from: y */
        public final void m224925y() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutM224915o = m224915o();
                addView(frameLayoutM224915o, 0);
                viewGroup = frameLayoutM224915o;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(gec0.f103813z, viewGroup, false);
            this.f210766c = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* JADX INFO: renamed from: z */
        public final void m224926z() {
            ViewGroup viewGroup;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                FrameLayout frameLayoutM224915o = m224915o();
                addView(frameLayoutM224915o);
                viewGroup = frameLayoutM224915o;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(gec0.f103782A, viewGroup, false);
            this.f210765b = textView;
            viewGroup.addView(textView);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$a */
    public class C22733a implements ValueAnimator.AnimatorUpdateListener {
        public C22733a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            VNavigationTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$b */
    public class C22734b implements ViewPager.InterfaceC0717i {

        /* JADX INFO: renamed from: a */
        public boolean f210783a;

        public C22734b() {
        }

        /* JADX INFO: renamed from: a */
        public void m224927a(boolean z) {
            this.f210783a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0717i
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable cf60 cf60Var, @Nullable cf60 cf60Var2) {
            VNavigationTabLayout vNavigationTabLayout = VNavigationTabLayout.this;
            if (vNavigationTabLayout.f210713R == viewPager) {
                vNavigationTabLayout.m224846F(cf60Var2, this.f210783a);
            }
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$c */
    @Deprecated
    public interface InterfaceC22735c<T extends C22738f> {
        /* JADX INFO: renamed from: a */
        void mo65022a(T t);

        /* JADX INFO: renamed from: b */
        void mo65023b(T t);

        /* JADX INFO: renamed from: c */
        void mo65024c(T t);
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$d */
    public interface InterfaceC22736d extends InterfaceC22735c<C22738f> {
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$e */
    public class C22737e extends DataSetObserver {
        public C22737e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VNavigationTabLayout.this.m224875y();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VNavigationTabLayout.this.m224875y();
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$f */
    public static class C22738f {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Object f210786a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Drawable f210787b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public CharSequence f210788c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public CharSequence f210789d;

        /* JADX INFO: renamed from: f */
        @Nullable
        public View f210791f;

        /* JADX INFO: renamed from: h */
        @Nullable
        public VNavigationTabLayout f210793h;

        /* JADX INFO: renamed from: i */
        @NonNull
        public TabView f210794i;

        /* JADX INFO: renamed from: e */
        public int f210790e = -1;

        /* JADX INFO: renamed from: g */
        public int f210792g = 1;

        @Nullable
        /* JADX INFO: renamed from: d */
        public View m224931d() {
            return this.f210791f;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public Drawable m224932e() {
            return this.f210787b;
        }

        /* JADX INFO: renamed from: f */
        public int m224933f() {
            return this.f210790e;
        }

        /* JADX INFO: renamed from: g */
        public int m224934g() {
            return this.f210792g;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public CharSequence m224935h() {
            return this.f210788c;
        }

        /* JADX INFO: renamed from: i */
        public boolean m224936i() {
            VNavigationTabLayout vNavigationTabLayout = this.f210793h;
            if (vNavigationTabLayout != null) {
                return vNavigationTabLayout.getSelectedTabPosition() == this.f210790e;
            }
            wg3.m206174a("Tab not attached to a TabLayout");
            return false;
        }

        /* JADX INFO: renamed from: j */
        public void m224937j() {
            this.f210793h = null;
            this.f210794i = null;
            this.f210786a = null;
            this.f210787b = null;
            this.f210788c = null;
            this.f210789d = null;
            this.f210790e = -1;
            this.f210791f = null;
        }

        /* JADX INFO: renamed from: k */
        public void m224938k() {
            VNavigationTabLayout vNavigationTabLayout = this.f210793h;
            if (vNavigationTabLayout != null) {
                vNavigationTabLayout.m224844D(this);
            } else {
                wg3.m206174a("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public C22738f m224939l(@Nullable CharSequence charSequence) {
            this.f210789d = charSequence;
            m224945r();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: m */
        public C22738f m224940m(@LayoutRes int i) {
            return m224941n(LayoutInflater.from(this.f210794i.getContext()).inflate(i, (ViewGroup) this.f210794i, false));
        }

        @NonNull
        /* JADX INFO: renamed from: n */
        public C22738f m224941n(@Nullable View view) {
            this.f210791f = view;
            m224945r();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: o */
        public C22738f m224942o(@Nullable Drawable drawable) {
            this.f210787b = drawable;
            VNavigationTabLayout vNavigationTabLayout = this.f210793h;
            if (vNavigationTabLayout.f210702G == 1 || vNavigationTabLayout.f210705J == 2) {
                vNavigationTabLayout.m224853M(true);
            }
            m224945r();
            if (BadgeUtils.USE_COMPAT_PARENT && this.f210794i.m224924x() && this.f210794i.f210768e.isVisible()) {
                this.f210794i.invalidate();
            }
            this.f210794i.m224897A();
            return this;
        }

        /* JADX INFO: renamed from: p */
        public void m224943p(int i) {
            this.f210790e = i;
        }

        @NonNull
        /* JADX INFO: renamed from: q */
        public C22738f m224944q(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f210789d) && !TextUtils.isEmpty(charSequence)) {
                this.f210794i.setContentDescription(charSequence);
            }
            this.f210788c = charSequence;
            if (charSequence != null && charSequence.length() > 0) {
                this.f210794i.m224898B(charSequence.toString());
            }
            m224945r();
            return this;
        }

        /* JADX INFO: renamed from: r */
        public void m224945r() {
            TabView tabView = this.f210794i;
            if (tabView != null) {
                tabView.m224905I();
            }
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$g */
    public static class C22739g implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<VNavigationTabLayout> f210795a;

        /* JADX INFO: renamed from: b */
        public int f210796b;

        /* JADX INFO: renamed from: c */
        public int f210797c;

        public C22739g(VNavigationTabLayout vNavigationTabLayout) {
            this.f210795a = new WeakReference<>(vNavigationTabLayout);
        }

        /* JADX INFO: renamed from: a */
        public void m224946a() {
            this.f210797c = 0;
            this.f210796b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            this.f210796b = this.f210797c;
            this.f210797c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            VNavigationTabLayout vNavigationTabLayout = this.f210795a.get();
            if (vNavigationTabLayout != null) {
                int i3 = this.f210797c;
                vNavigationTabLayout.m224848H(i, f, i3 != 2 || this.f210796b == 1, (i3 == 2 && this.f210796b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            VNavigationTabLayout vNavigationTabLayout = this.f210795a.get();
            if (vNavigationTabLayout == null || vNavigationTabLayout.getSelectedTabPosition() == i || i >= vNavigationTabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f210797c;
            vNavigationTabLayout.m224845E(vNavigationTabLayout.m224873w(i), i2 == 0 || (i2 == 2 && this.f210796b == 0));
        }
    }

    /* JADX INFO: renamed from: v.navigationbar.VNavigationTabLayout$h */
    public static class C22740h implements InterfaceC22736d {

        /* JADX INFO: renamed from: a */
        public final ViewPager f210798a;

        public C22740h(ViewPager viewPager) {
            this.f210798a = viewPager;
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: a */
        public void mo65022a(C22738f c22738f) {
            if (c22738f.f210794i.f210765b != null) {
                c22738f.f210794i.f210765b.setTypeface(Typeface.DEFAULT);
            }
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: b */
        public void mo65023b(C22738f c22738f) {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: c */
        public void mo65024c(@NonNull C22738f c22738f) {
            this.f210798a.setCurrentItem(c22738f.m224933f());
            if (c22738f.f210794i.f210765b != null) {
                c22738f.f210794i.f210765b.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public VNavigationTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210719a = new ArrayList<>();
        this.f210721c = new RectF();
        this.f210735p = -1.0f;
        this.f210738r = 0;
        this.f210740t = 0;
        this.f210742v = 0;
        this.f210743w = 0;
        this.f210744x = -1.0f;
        this.f210746z = 0;
        this.f210696A = 0;
        this.f210697B = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f210710O = new ArrayList<>();
        this.f210730k0 = new pj80(12);
        this.f210736p0 = 0.0f;
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.f210722d = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, hhc0.f109760j2, i, f210694E0, hhc0.f109625O2);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(kkl0.m150183t(this));
            kkl0.m150170m0(this, materialShapeDrawable);
        }
        slidingTabIndicator.m224885i(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109865y2, -1));
        slidingTabIndicator.m224884h(typedArrayObtainStyledAttributes.getColor(hhc0.f109844v2, 0));
        setSelectedTabIndicator(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, hhc0.f109830t2));
        setSelectedTabIndicatorGravity(typedArrayObtainStyledAttributes.getInt(hhc0.f109858x2, 0));
        setTabIndicatorFullWidth(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109851w2, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109566F2, 0);
        this.f210726h = dimensionPixelSize;
        this.f210725g = dimensionPixelSize;
        this.f210724f = dimensionPixelSize;
        this.f210723e = dimensionPixelSize;
        this.f210723e = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109587I2, dimensionPixelSize);
        this.f210724f = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109594J2, this.f210724f);
        this.f210725g = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109580H2, this.f210725g);
        this.f210726h = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109573G2, this.f210726h);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109625O2, tgc0.f174062h);
        this.f210727i = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, gic0.f104327V2);
        try {
            this.f210734o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(gic0.f104331W2, 0);
            this.f210728j = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes2, gic0.f104343Z2);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109637Q2)) {
                float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109637Q2, 0);
                this.f210734o = dimensionPixelSize2;
                this.f210735p = dimensionPixelSize2;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109619N2)) {
                this.f210735p = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109619N2, 0);
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109631P2)) {
                ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, hhc0.f109631P2);
                this.f210728j = colorStateList;
                this.f210739s = colorStateList != null ? colorStateList.getDefaultColor() : -7829368;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109613M2)) {
                int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109613M2, 0);
                ColorStateList colorStateListM224840o = m224840o(this.f210728j.getDefaultColor(), color);
                this.f210728j = colorStateListM224840o;
                this.f210739s = colorStateListM224840o.getDefaultColor();
                this.f210738r = color;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109809q2)) {
                ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, hhc0.f109809q2);
                this.f210729k = colorStateList2;
                int defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : -7829368;
                this.f210741u = defaultColor;
                this.f210740t = defaultColor;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109607L2)) {
                int color2 = typedArrayObtainStyledAttributes.getColor(hhc0.f109607L2, 0);
                ColorStateList colorStateListM224840o2 = m224840o(this.f210729k.getDefaultColor(), color2);
                this.f210729k = colorStateListM224840o2;
                this.f210741u = colorStateListM224840o2.getDefaultColor();
                this.f210740t = color2;
            }
            this.f210733n = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(hhc0.f109816r2, -1), null);
            this.f210731l = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, hhc0.f109601K2);
            this.f210703H = typedArrayObtainStyledAttributes.getInt(hhc0.f109837u2, 300);
            this.f210698C = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109552D2, -1);
            this.f210699D = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109545C2, -1);
            this.f210745y = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109767k2, 0);
            this.f210701F = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109774l2, 0);
            this.f210705J = typedArrayObtainStyledAttributes.getInt(hhc0.f109559E2, 1);
            this.f210702G = typedArrayObtainStyledAttributes.getInt(hhc0.f109781m2, 0);
            this.f210706K = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109872z2, false);
            this.f210708M = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109643R2, false);
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109823s2)) {
                this.f210742v = typedArrayObtainStyledAttributes.getLayoutDimension(hhc0.f109823s2, -2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109788n2)) {
                this.f210743w = typedArrayObtainStyledAttributes.getLayoutDimension(hhc0.f109788n2, -2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109802p2)) {
                int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(hhc0.f109802p2, -2);
                this.f210743w = layoutDimension;
                this.f210742v = layoutDimension;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109795o2)) {
                this.f210744x = typedArrayObtainStyledAttributes.getFloat(hhc0.f109795o2, 1.0f);
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109531A2)) {
                this.f210746z = typedArrayObtainStyledAttributes.getColor(hhc0.f109531A2, 0);
                this.f210745y = 0;
            }
            if (typedArrayObtainStyledAttributes.hasValue(hhc0.f109538B2)) {
                this.f210696A = typedArrayObtainStyledAttributes.getColor(hhc0.f109538B2, 0);
                this.f210745y = 0;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f210737q = getResources().getDimensionPixelSize(bac0.f75675n);
            this.f210700E = 0;
            m224863l();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f210719a.size();
        for (int i = 0; i < size; i++) {
            C22738f c22738f = this.f210719a.get(i);
            if (c22738f != null && c22738f.m224932e() != null && !TextUtils.isEmpty(c22738f.m224935h())) {
                return !this.f210706K ? 72 : 44;
            }
        }
        return 44;
    }

    private int getTabMinWidth() {
        int i = this.f210698C;
        if (i != -1) {
            return i;
        }
        int i2 = this.f210705J;
        if (i2 == 0 || i2 == 2) {
            return this.f210700E;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f210722d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static ColorStateList m224840o(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f210722d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f210722d.getChildAt(i2);
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
    public void m224841A() {
        for (int childCount = this.f210722d.getChildCount() - 1; childCount >= 0; childCount--) {
            m224843C(childCount);
        }
        Iterator<C22738f> it = this.f210719a.iterator();
        while (it.hasNext()) {
            C22738f next = it.next();
            it.remove();
            next.m224937j();
            m224876z(next);
        }
        this.f210720b = null;
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public void m224842B(@Nullable InterfaceC22735c interfaceC22735c) {
        this.f210710O.remove(interfaceC22735c);
    }

    /* JADX INFO: renamed from: C */
    public final void m224843C(int i) {
        TabView tabView = (TabView) this.f210722d.getChildAt(i);
        this.f210722d.removeViewAt(i);
        if (tabView != null) {
            tabView.m224899C();
            this.f210730k0.release(tabView);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: D */
    public void m224844D(@Nullable C22738f c22738f) {
        m224845E(c22738f, true);
    }

    /* JADX INFO: renamed from: E */
    public void m224845E(@Nullable C22738f c22738f, boolean z) {
        C22738f c22738f2 = this.f210720b;
        if (c22738f2 == c22738f) {
            if (c22738f2 != null) {
                m224869s(c22738f);
                m224861j(c22738f.m224933f());
                return;
            }
            return;
        }
        int iM224933f = c22738f != null ? c22738f.m224933f() : -1;
        if (z) {
            if ((c22738f2 == null || c22738f2.m224933f() == -1) && iM224933f != -1) {
                m224847G(iM224933f, 0.0f, true);
            } else {
                m224861j(iM224933f);
            }
            if (iM224933f != -1) {
                setSelectedTabView(iM224933f);
            }
        }
        this.f210720b = c22738f;
        if (c22738f2 != null) {
            m224871u(c22738f2);
        }
        if (c22738f != null) {
            m224870t(c22738f);
            float fM224921u = c22738f.f210794i.m224921u(0.0f);
            if (fM224921u >= 0.0f) {
                c22738f.f210794i.f210765b.setScaleY(fM224921u);
                c22738f.f210794i.f210765b.setScaleX(fM224921u);
            }
            float fM224920t = c22738f.f210794i.m224920t(0.0f);
            if (fM224920t >= 0.0f) {
                c22738f.f210794i.f210766c.setScaleX(fM224920t);
                c22738f.f210794i.f210766c.setScaleY(fM224920t);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m224846F(@Nullable cf60 cf60Var, boolean z) {
        DataSetObserver dataSetObserver;
        cf60 cf60Var2 = this.f210714S;
        if (cf60Var2 != null && (dataSetObserver = this.f210715T) != null) {
            cf60Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f210714S = cf60Var;
        if (z && cf60Var != null) {
            if (this.f210715T == null) {
                this.f210715T = new C22737e();
            }
            cf60Var.registerDataSetObserver(this.f210715T);
        }
        m224875y();
    }

    /* JADX INFO: renamed from: G */
    public void m224847G(int i, float f, boolean z) {
        m224848H(i, f, z, true);
    }

    /* JADX INFO: renamed from: H */
    public void m224848H(int i, float f, boolean z, boolean z2) {
        C22738f c22738fM224873w;
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.f210722d.getChildCount()) {
            return;
        }
        if (z2) {
            this.f210722d.m224883g(i, f);
        }
        if (z2 && (c22738fM224873w = m224873w(i)) != null) {
            c22738fM224873w.f210794i.m224900D(i, f);
            int i2 = i + 1;
            if (f == 0.0f && this.f210736p0 > 0.5d) {
                i2 = i - 1;
            }
            C22738f c22738fM224873w2 = m224873w(i2);
            if (c22738fM224873w2 != null) {
                c22738fM224873w2.f210794i.m224900D(i2, 1.0f - f);
            }
            this.f210736p0 = f;
        }
        ValueAnimator valueAnimator = this.f210712Q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f210712Q.cancel();
        }
        scrollTo(m224864m(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m224849I(@Nullable ViewPager viewPager, boolean z) {
        m224850J(viewPager, z, false);
    }

    /* JADX INFO: renamed from: J */
    public final void m224850J(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f210713R;
        if (viewPager2 != null) {
            C22739g c22739g = this.f210716U;
            if (c22739g != null) {
                viewPager2.m4177P(c22739g);
            }
            C22734b c22734b = this.f210717V;
            if (c22734b != null) {
                this.f210713R.m4176O(c22734b);
            }
        }
        InterfaceC22735c interfaceC22735c = this.f210711P;
        if (interfaceC22735c != null) {
            m224842B(interfaceC22735c);
            this.f210711P = null;
        }
        if (viewPager != null) {
            this.f210713R = viewPager;
            if (this.f210716U == null) {
                this.f210716U = new C22739g(this);
            }
            this.f210716U.m224946a();
            viewPager.m4187d(this.f210716U);
            C22740h c22740h = new C22740h(viewPager);
            this.f210711P = c22740h;
            m224854c(c22740h);
            cf60 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m224846F(adapter, z);
            }
            if (this.f210717V == null) {
                this.f210717V = new C22734b();
            }
            this.f210717V.m224927a(z);
            viewPager.m4186c(this.f210717V);
            m224847G(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f210713R = null;
            m224846F(null, false);
        }
        this.f210718W = z2;
    }

    /* JADX INFO: renamed from: K */
    public final void m224851K() {
        int size = this.f210719a.size();
        for (int i = 0; i < size; i++) {
            this.f210719a.get(i).m224945r();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m224852L(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f210705J == 1 && this.f210702G == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m224853M(boolean z) {
        for (int i = 0; i < this.f210722d.getChildCount(); i++) {
            View childAt = this.f210722d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m224852L((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m224860i(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m224854c(@Nullable InterfaceC22735c interfaceC22735c) {
        if (this.f210710O.contains(interfaceC22735c)) {
            return;
        }
        this.f210710O.add(interfaceC22735c);
    }

    /* JADX INFO: renamed from: d */
    public void m224855d(@NonNull C22738f c22738f) {
        m224857f(c22738f, this.f210719a.isEmpty());
    }

    /* JADX INFO: renamed from: e */
    public void m224856e(@NonNull C22738f c22738f, int i, boolean z) {
        if (c22738f.f210793h != this) {
            wg3.m206174a("Tab belongs to a different TabLayout.");
            return;
        }
        m224865n(c22738f, i);
        m224859h(c22738f);
        if (z) {
            c22738f.m224938k();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m224857f(@NonNull C22738f c22738f, boolean z) {
        m224856e(c22738f, this.f210719a.size(), z);
    }

    /* JADX INFO: renamed from: g */
    public final void m224858g(@NonNull NavigationTabItem navigationTabItem) {
        C22738f c22738fM224874x = m224874x();
        CharSequence charSequence = navigationTabItem.f210683a;
        if (charSequence != null) {
            c22738fM224874x.m224944q(charSequence);
        }
        Drawable drawable = navigationTabItem.f210684b;
        if (drawable != null) {
            c22738fM224874x.m224942o(drawable);
        }
        int i = navigationTabItem.f210685c;
        if (i != 0) {
            c22738fM224874x.m224940m(i);
        }
        if (!TextUtils.isEmpty(navigationTabItem.getContentDescription())) {
            c22738fM224874x.m224939l(navigationTabItem.getContentDescription());
        }
        m224855d(c22738fM224874x);
    }

    public int getSelectedTabPosition() {
        C22738f c22738f = this.f210720b;
        if (c22738f != null) {
            return c22738f.m224933f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f210719a.size();
    }

    public int getTabGravity() {
        return this.f210702G;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f210729k;
    }

    public int getTabIndicatorGravity() {
        return this.f210704I;
    }

    public int getTabMaxWidth() {
        return this.f210697B;
    }

    public int getTabMode() {
        return this.f210705J;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f210731l;
    }

    @Nullable
    public Drawable getTabSelectedIndicator() {
        return this.f210732m;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f210728j;
    }

    /* JADX INFO: renamed from: h */
    public final void m224859h(@NonNull C22738f c22738f) {
        TabView tabView = c22738f.f210794i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f210722d.addView(tabView, c22738f.m224933f(), m224866p());
    }

    /* JADX INFO: renamed from: i */
    public final void m224860i(View view) {
        if (view instanceof NavigationTabItem) {
            m224858g((NavigationTabItem) view);
        } else {
            wg3.m206174a("Only TabItem instances can be added to TabLayout");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m224861j(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !kkl0.m150134P(this) || this.f210722d.m224881e()) {
            m224847G(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM224864m = m224864m(i, 0.0f);
        if (scrollX != iM224864m) {
            m224872v();
            this.f210712Q.setIntValues(scrollX, iM224864m);
            this.f210712Q.start();
        }
        this.f210722d.m224879c(i, this.f210703H);
        if (i != getSelectedTabPosition()) {
            C22738f c22738fM224873w = m224873w(i);
            C22738f c22738fM224873w2 = m224873w(getSelectedTabPosition());
            if (c22738fM224873w == null || c22738fM224873w2 == null) {
                return;
            }
            c22738fM224873w.f210794i.m224911k(false, this.f210703H);
            c22738fM224873w2.f210794i.m224911k(true, this.f210703H);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m224862k(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f210722d.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.f210722d.setGravity(8388611);
    }

    /* JADX INFO: renamed from: l */
    public final void m224863l() {
        int i = this.f210705J;
        kkl0.m150196z0(this.f210722d, (i == 0 || i == 2) ? Math.max(0, this.f210701F - this.f210723e) : 0, 0, 0, 0);
        int i2 = this.f210705J;
        if (i2 == 0) {
            m224862k(this.f210702G);
        } else if (i2 == 1 || i2 == 2) {
            this.f210722d.setGravity(1);
        }
        m224853M(true);
    }

    /* JADX INFO: renamed from: m */
    public final int m224864m(int i, float f) {
        int i2 = this.f210705J;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f210722d.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f210722d.getChildCount() ? this.f210722d.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return kkl0.m150191x(this) == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: n */
    public final void m224865n(@NonNull C22738f c22738f, int i) {
        c22738f.m224943p(i);
        this.f210719a.add(i, c22738f);
        int size = this.f210719a.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f210719a.get(i).m224943p(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.f210713R == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m224850J((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f210718W) {
            setupWithViewPager(null);
            this.f210718W = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < this.f210722d.getChildCount(); i++) {
            View childAt = this.f210722d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m224916p(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C15967bc.m103355T0(accessibilityNodeInfo).m103435q0(C15967bc.e.m103466b(1, getTabCount(), false, 1));
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
            int iDpToPx = this.f210699D;
            if (iDpToPx <= 0) {
                iDpToPx = (int) (size - ViewUtils.dpToPx(getContext(), 56));
            }
            this.f210697B = iDpToPx;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f210705J;
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
    public final LinearLayout.LayoutParams m224866p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m224852L(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: renamed from: q */
    public C22738f m224867q() {
        C22738f c22738fAcquire = f210695F0.acquire();
        return c22738fAcquire == null ? new C22738f() : c22738fAcquire;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final TabView m224868r(@NonNull C22738f c22738f) {
        nj80<TabView> nj80Var = this.f210730k0;
        TabView tabViewAcquire = nj80Var != null ? nj80Var.acquire() : null;
        if (tabViewAcquire == null) {
            tabViewAcquire = new TabView(getContext());
        }
        tabViewAcquire.setTab(c22738f);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c22738f.f210789d)) {
            tabViewAcquire.setContentDescription(c22738f.f210788c);
            return tabViewAcquire;
        }
        tabViewAcquire.setContentDescription(c22738f.f210789d);
        return tabViewAcquire;
    }

    /* JADX INFO: renamed from: s */
    public final void m224869s(@NonNull C22738f c22738f) {
        for (int size = this.f210710O.size() - 1; size >= 0; size--) {
            this.f210710O.get(size).mo65023b(c22738f);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f210706K != z) {
            this.f210706K = z;
            for (int i = 0; i < this.f210722d.getChildCount(); i++) {
                View childAt = this.f210722d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m224908L();
                }
            }
            m224863l();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable InterfaceC22735c interfaceC22735c) {
        InterfaceC22735c interfaceC22735c2 = this.f210709N;
        if (interfaceC22735c2 != null) {
            m224842B(interfaceC22735c2);
        }
        this.f210709N = interfaceC22735c;
        if (interfaceC22735c != null) {
            m224854c(interfaceC22735c);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m224872v();
        this.f210712Q.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(tu0.m192702b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f210722d.m224884h(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f210704I != i) {
            this.f210704I = i;
            kkl0.m150146a0(this.f210722d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f210722d.m224885i(i);
    }

    public void setTabGravity(int i) {
        if (this.f210702G != i) {
            this.f210702G = i;
            m224863l();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f210729k != colorStateList) {
            this.f210729k = colorStateList;
            m224851K();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(tu0.m192701a(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f210707L = z;
        kkl0.m150146a0(this.f210722d);
    }

    public void setTabMode(int i) {
        if (i != this.f210705J) {
            this.f210705J = i;
            m224863l();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f210731l != colorStateList) {
            this.f210731l = colorStateList;
            for (int i = 0; i < this.f210722d.getChildCount(); i++) {
                View childAt = this.f210722d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m224906J(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(tu0.m192701a(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f210728j != colorStateList) {
            this.f210728j = colorStateList;
            m224851K();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable cf60 cf60Var) {
        m224846F(cf60Var, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f210708M != z) {
            this.f210708M = z;
            for (int i = 0; i < this.f210722d.getChildCount(); i++) {
                View childAt = this.f210722d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m224906J(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        m224849I(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m224870t(@NonNull C22738f c22738f) {
        for (int size = this.f210710O.size() - 1; size >= 0; size--) {
            this.f210710O.get(size).mo65024c(c22738f);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m224871u(@NonNull C22738f c22738f) {
        for (int size = this.f210710O.size() - 1; size >= 0; size--) {
            this.f210710O.get(size).mo65022a(c22738f);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m224872v() {
        if (this.f210712Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f210712Q = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.f210712Q.setDuration(this.f210703H);
            this.f210712Q.addUpdateListener(new C22733a());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public C22738f m224873w(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f210719a.get(i);
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public C22738f m224874x() {
        C22738f c22738fM224867q = m224867q();
        c22738fM224867q.f210793h = this;
        c22738fM224867q.f210794i = m224868r(c22738fM224867q);
        return c22738fM224867q;
    }

    /* JADX INFO: renamed from: y */
    public void m224875y() {
        int currentItem;
        m224841A();
        cf60 cf60Var = this.f210714S;
        if (cf60Var != null) {
            int count = cf60Var.getCount();
            for (int i = 0; i < count; i++) {
                m224857f(m224874x().m224944q(this.f210714S.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f210713R;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m224844D(m224873w(currentItem));
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m224876z(C22738f c22738f) {
        return f210695F0.release(c22738f);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m224860i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m224860i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m224860i(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable InterfaceC22736d interfaceC22736d) {
        setOnTabSelectedListener((InterfaceC22735c) interfaceC22736d);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (this.f210732m != drawable) {
            this.f210732m = drawable;
            kkl0.m150146a0(this.f210722d);
        }
    }

    public VNavigationTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o8c0.f145401k);
    }

    public VNavigationTabLayout(@NonNull Context context) {
        this(context, null);
    }
}
