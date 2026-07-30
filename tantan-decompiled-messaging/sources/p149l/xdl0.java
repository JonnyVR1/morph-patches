package p149l;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class xdl0 {

    /* JADX INFO: renamed from: c */
    public static long f192401c;

    /* JADX INFO: renamed from: a */
    public static tpd0 f192399a = new tpd0("status_bar_height_cache", 0);

    /* JADX INFO: renamed from: b */
    public static final boolean f192400b = m208332G();

    /* JADX INFO: renamed from: d */
    public static final Handler f192402d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    public static int f192403e = -1;

    /* JADX INFO: renamed from: f */
    public static int f192404f = -2;

    /* JADX INFO: renamed from: g */
    public static int f192405g = -1;

    /* JADX INFO: renamed from: h */
    public static long f192406h = 0;

    /* JADX INFO: renamed from: l.xdl0$a */
    public class ViewOnClickListenerC21098a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f192407a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnClickListener f192408b;

        public ViewOnClickListenerC21098a(View.OnClickListener onClickListener) {
            this.f192408b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f192407a > 500) {
                this.f192407a = SystemClock.uptimeMillis();
                this.f192408b.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: l.xdl0$b */
    public class ViewOnClickListenerC21099b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f192409a = SystemClock.uptimeMillis();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e30 f192410b;

        public ViewOnClickListenerC21099b(e30 e30Var) {
            this.f192410b = e30Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Math.abs(SystemClock.uptimeMillis() - this.f192409a) < 500) {
                this.f192410b.call(view);
            } else {
                this.f192409a = SystemClock.uptimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: l.xdl0$c */
    public class ViewOnLayoutChangeListenerC21100c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f192411a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f192412b;

        public ViewOnLayoutChangeListenerC21100c(e30 e30Var, View view) {
            this.f192411a = e30Var;
            this.f192412b = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i8 - i6;
            int i10 = i3 - i;
            int i11 = i4 - i2;
            if ((i7 - i5 == i10 && i9 == i11) || i10 == 0 || i11 == 0) {
                return;
            }
            this.f192411a.call(new int[]{i10, i11});
            this.f192412b.removeOnLayoutChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.xdl0$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC21101d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f192413a;

        public ViewTreeObserverOnGlobalLayoutListenerC21101d(View view) {
            this.f192413a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WindowInsets rootWindowInsets = this.f192413a.getRootWindowInsets();
            if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
                xdl0.f192405g = rootWindowInsets.getSystemWindowInsetTop();
                xdl0.f192399a.put(Integer.valueOf(xdl0.f192405g));
            }
            this.f192413a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.xdl0$e */
    public class ViewTreeObserverOnPreDrawListenerC21102e implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public boolean f192414a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserver f192415b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ v9j f192416c;

        public ViewTreeObserverOnPreDrawListenerC21102e(ViewTreeObserver viewTreeObserver, v9j v9jVar) {
            this.f192415b = viewTreeObserver;
            this.f192416c = v9jVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f192414a) {
                return true;
            }
            this.f192414a = true;
            if (this.f192415b.isAlive()) {
                this.f192415b.removeOnPreDrawListener(this);
            }
            return ((Boolean) this.f192416c.call()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.xdl0$f */
    public class C21103f implements C22306c.a<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f192417a;

        public C21103f(View view) {
            this.f192417a = view;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Integer> z3g0Var) {
            final View view = this.f192417a;
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.bel0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    z3g0Var.onNext(Integer.valueOf(view.getWidth()));
                }
            };
            if (!z3g0Var.isUnsubscribed()) {
                this.f192417a.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            final View view2 = this.f192417a;
            z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.cel0
                @Override // p149l.d30
                public final void call() {
                    view2.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.xdl0$g */
    public static class C21104g {

        /* JADX INFO: renamed from: a */
        public int f192418a;

        /* JADX INFO: renamed from: b */
        public int f192419b;

        /* JADX INFO: renamed from: c */
        public int f192420c;

        /* JADX INFO: renamed from: d */
        public int f192421d;

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof C21104g) {
                C21104g c21104g = (C21104g) obj;
                if (c21104g.f192418a == this.f192418a && c21104g.f192421d == this.f192421d && c21104g.f192420c == this.f192420c && c21104g.f192419b == this.f192419b) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            if (!edk0.f90613c) {
                return super.toString();
            }
            return "x = " + this.f192418a + ", y = " + this.f192419b + ", w = " + this.f192420c + ", h = " + this.f192421d;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m208320A(View view) {
        m208322B(view, true);
    }

    /* JADX INFO: renamed from: A0 */
    public static void m208321A0(Context context, View view, @DrawableRes int i) {
        m208323B0(view, e16.m114377e(context, i));
    }

    /* JADX INFO: renamed from: B */
    public static void m208322B(View view, boolean z) {
        if (z) {
            if (view.hasFocus()) {
                return;
            }
            view.requestFocus();
        } else if (view.hasFocus()) {
            view.clearFocus();
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static void m208323B0(View view, Drawable drawable) {
        gbl0.m125207m0(view, drawable);
    }

    /* JADX INFO: renamed from: C */
    public static int m208324C(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    /* JADX INFO: renamed from: C0 */
    public static void m208325C0(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: D */
    public static Activity m208326D(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static void m208327D0(final int i, View... viewArr) {
        C22306c.from(viewArr).doOnNext(new e30() { // from class: l.sdl0
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208379i(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: E */
    public static Activity m208328E(View view) {
        return m208326D(view.getContext());
    }

    /* JADX INFO: renamed from: E0 */
    public static void m208329E0(View view, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new ViewOnClickListenerC21098a(onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: F */
    public static Point m208330F(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    @Deprecated
    /* JADX INFO: renamed from: F0 */
    public static int m208331F0() {
        return m208333G0(false);
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m208332G() {
        try {
            return Build.BRAND.equals("Meizu") || Math.max(ViewConfiguration.get(f16.m119092a()).getScaledOverscrollDistance(), ViewConfiguration.get(f16.m119092a()).getScaledOverflingDistance()) > m208407w(12.0f);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("Vu getBigOverscroll :" + e.getMessage(), e));
            return false;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: G0 */
    public static int m208333G0(boolean z) {
        int i = f192405g;
        if (i > 0) {
            return i;
        }
        if (f192399a.get().intValue() != 0) {
            return f192399a.get().intValue();
        }
        if (f192405g <= 0 || z) {
            Application applicationM119092a = f16.m119092a();
            int identifier = applicationM119092a.getResources().getIdentifier("android:dimen/status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = applicationM119092a.getResources().getDimensionPixelSize(identifier);
                if (f192405g <= 0 && dimensionPixelSize > 0) {
                    f192405g = dimensionPixelSize;
                } else if (z && dimensionPixelSize > 0) {
                    return dimensionPixelSize;
                }
            }
        }
        int i2 = f192405g;
        return i2 <= 0 ? t100.f167226A : i2;
    }

    /* JADX INFO: renamed from: H */
    public static void m208334H(View view, Rect rect, Rect rect2) {
        view.getGlobalVisibleRect(rect2);
        rect2.top = Math.abs(rect2.top);
        rect2.bottom = Math.abs(rect2.bottom);
        rect2.left = Math.abs(rect2.left);
        int iAbs = Math.abs(rect2.right);
        rect2.right = iAbs;
        int i = rect2.top;
        int i2 = rect2.bottom;
        if (i > i2) {
            rect2.top = i2;
            rect2.bottom = i;
        }
        int i3 = rect2.left;
        if (i3 > iAbs) {
            rect2.left = iAbs;
            rect2.right = i3;
        }
        rect2.top += rect.top;
        rect2.left += rect.left;
        rect2.bottom += rect.top;
        rect2.right += rect.left;
    }

    /* JADX INFO: renamed from: H0 */
    public static boolean m208335H0(TextView textView, String str) {
        if (textView.getText().equals(str)) {
            return false;
        }
        textView.setText(str);
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static int m208336I(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m208337I0(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        m208344M(textView, !TextUtils.isEmpty(charSequence));
    }

    /* JADX INFO: renamed from: J */
    public static Point m208338J(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    /* JADX INFO: renamed from: J0 */
    public static TextView m208339J0(View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                return (TextView) view;
            }
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            TextView textViewM208339J0 = m208339J0(viewGroup.getChildAt(i));
            if (textViewM208339J0 != null) {
                return textViewM208339J0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static C22306c<Integer> m208340K(View view) {
        return C22306c.create(new C21103f(view)).compose(qjd0.m174993e(jo0.m142408a()));
    }

    /* JADX INFO: renamed from: K0 */
    public static void m208341K0(View view, C21104g c21104g, C21104g c21104g2) {
        m208343L0(view, c21104g, c21104g2, false);
    }

    /* JADX INFO: renamed from: L */
    public static void m208342L(View view, @NonNull final View.OnClickListener onClickListener) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.vdl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xdl0.m208373f(onClickListener, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public static void m208343L0(View view, C21104g c21104g, C21104g c21104g2, boolean z) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f = (c21104g.f192420c * 1.0f) / c21104g2.f192420c;
        float f2 = (c21104g.f192421d * 1.0f) / c21104g2.f192421d;
        if (m208355S(f) || m208355S(f2)) {
            return;
        }
        if (!z) {
            view.setScaleX(f);
            view.setScaleY(f2);
            view.setTranslationX(c21104g.f192418a - c21104g2.f192418a);
            view.setTranslationY(c21104g.f192419b - c21104g2.f192419b);
            return;
        }
        if (f2 >= f) {
            view.setScaleX(f2);
            view.setScaleY(f2);
            view.setTranslationX((c21104g.f192418a - c21104g2.f192418a) - (((c21104g2.f192420c * f2) - c21104g.f192420c) / 2.0f));
            view.setTranslationY(c21104g.f192419b - c21104g2.f192419b);
            return;
        }
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationX(c21104g.f192418a - c21104g2.f192418a);
        view.setTranslationY((c21104g.f192419b - c21104g2.f192419b) - (((c21104g2.f192421d * f) - c21104g.f192421d) / 2.0f));
    }

    /* JADX INFO: renamed from: M */
    public static void m208344M(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: M0 */
    public static void m208345M0(View view, boolean z) {
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        } else if (view.getVisibility() == 0) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m208346N(ImageView imageView, int i) {
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        if (imageView.getDrawable() == null || imageView.getDrawable() != drawable) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static void m208347N0(TextView textView) {
        m208344M(textView, textView.getText() != null && textView.getText().length() > 0);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m208348O(View view, MotionEvent motionEvent) {
        return motionEvent.getX() > 0.0f && motionEvent.getY() > 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() < ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: O0 */
    public static boolean m208349O0(View view) {
        return view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: P */
    public static int m208350P(View view) {
        return m208352Q((ViewGroup) view.getParent(), view);
    }

    /* JADX INFO: renamed from: P0 */
    public static int m208351P0(ViewGroup viewGroup) {
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: Q */
    public static int m208352Q(ViewGroup viewGroup, View view) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m208353Q0(final View view, final e30<int[]> e30Var) {
        if (view.getHeight() == 0 || view.getWidth() == 0) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21100c(e30Var, view));
        } else {
            m208400s0(new Runnable() { // from class: l.udl0
                @Override // java.lang.Runnable
                public final void run() {
                    e30 e30Var2 = e30Var;
                    View view2 = view;
                    e30Var2.call(new int[]{view2.getWidth(), view2.getHeight()});
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m208354R(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC21101d(view));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m208355S(float f) {
        return f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY || Float.compare(f, Float.NaN) == 0;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m208356T(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: U */
    public static void m208357U(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: V */
    public static void m208358V(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: W */
    public static void m208359W(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: X */
    public static void m208360X(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Y */
    public static void m208361Y(final int i, View... viewArr) {
        C22306c.from(viewArr).doOnNext(new e30() { // from class: l.qdl0
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208377h(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: Z */
    public static void m208362Z(View... viewArr) {
        C22306c.from(viewArr).doOnNext(new e30() { // from class: l.tdl0
            @Override // p149l.e30
            public final void call(Object obj) {
                View view = (View) obj;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new zdl0(view));
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m208363a(ViewGroup viewGroup, Integer num) {
        View childAt = viewGroup.getChildAt(num.intValue());
        return childAt instanceof ViewGroup ? vwb.m200317c(m208399s((ViewGroup) childAt), childAt) : Collections.singletonList(childAt);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m208364a0(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getId() == 16908290) {
                return;
            }
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            parent = viewGroup.getParent();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m208366b0(View view, v9j<Boolean> v9jVar) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC21102e(viewTreeObserver, v9jVar));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m208367c(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(view.getWidth(), view.getHeight());
        }
        layoutParams.height += i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m208368c0(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m208370d0(View view, int i) {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    /* JADX INFO: renamed from: e0 */
    public static void m208372e0(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m208373f(View.OnClickListener onClickListener, View view) {
        if (SystemClock.uptimeMillis() - f192401c < 500) {
            return;
        }
        f192401c = SystemClock.uptimeMillis();
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m208374f0(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* JADX INFO: renamed from: g0 */
    public static void m208376g0(View... viewArr) {
        C22306c.from(viewArr).doOnNext(new e30() { // from class: l.rdl0
            @Override // p149l.e30
            public final void call(Object obj) {
                View view = (View) obj;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ydl0(view));
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m208377h(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        try {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        } catch (ClassCastException unused) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(view.getWidth(), view.getHeight());
        }
        marginLayoutParams.topMargin += i;
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m208378h0(View view, int i) {
        view.setPadding(i, i, i, i);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m208379i(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(view.getWidth(), view.getHeight());
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: i0 */
    public static C21104g m208380i0(View view) {
        return m208382j0(view, m208328E(view).getWindow().getDecorView());
    }

    /* JADX INFO: renamed from: j0 */
    public static C21104g m208382j0(View view, View view2) {
        C21104g c21104g = new C21104g();
        c21104g.f192420c = view.getWidth();
        c21104g.f192421d = view.getHeight();
        while (view != null && view != view2) {
            c21104g.f192418a = (int) (c21104g.f192418a + (view.getLeft() - view.getScrollX()) + view.getTranslationX());
            c21104g.f192419b = (int) (c21104g.f192419b + (view.getTop() - view.getScrollY()) + view.getTranslationY());
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return c21104g;
    }

    /* JADX INFO: renamed from: k */
    public static void m208383k(TextView textView, Drawable drawable) {
        m208387m(textView, drawable, null, null, null);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m208384k0(View view) {
        view.measure(ffx.m121199b(view.getWidth()), ffx.m121199b(view.getHeight()));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: renamed from: l */
    public static void m208385l(TextView textView, Drawable drawable) {
        m208387m(textView, null, null, drawable, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m208386l0(View view, int i, boolean z, boolean z2) {
        int left = (view.getLeft() + view.getRight()) / 2;
        view.measure(z ? ffx.m121202e() : ffx.m121199b(view.getWidth()), z2 ? ffx.m121202e() : ffx.m121199b(view.getHeight()));
        view.layout(left - (view.getMeasuredWidth() / 2), i, left + (view.getMeasuredWidth() / 2), view.getMeasuredHeight() + i);
    }

    /* JADX INFO: renamed from: m */
    public static void m208387m(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (compoundDrawables == null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m208388m0(View view, int i, int i2) {
        view.layout(view.getLeft() + i, view.getTop() + i2, view.getRight() + i, view.getBottom() + i2);
    }

    /* JADX INFO: renamed from: n */
    public static void m208389n(View view, int i, int i2, int i3, int i4) {
        view.setPadding(view.getPaddingLeft() + i, view.getPaddingTop() + i2, view.getPaddingRight() + i3, view.getPaddingBottom() + i4);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m208390n0(View view) {
        view.measure(ffx.m121202e(), ffx.m121202e());
        view.layout(view.getLeft(), view.getTop(), view.getLeft() + view.getMeasuredWidth(), view.getTop() + view.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: o */
    public static void m208391o(Activity activity, int i) {
        ImageView imageView = new ImageView(activity);
        imageView.setBackgroundResource(i);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(imageView, 0);
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    /* JADX INFO: renamed from: o0 */
    public static int m208392o0(View view, View view2) {
        int top = 0;
        while (view != view2) {
            top += view.getTop();
            view = (View) view.getParent();
        }
        return top;
    }

    /* JADX INFO: renamed from: p */
    public static void m208393p(View view) {
        view.callOnClick();
    }

    /* JADX INFO: renamed from: p0 */
    public static void m208394p0(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* JADX INFO: renamed from: q */
    public static View m208395q(ViewGroup viewGroup, w9j<View, Boolean> w9jVar) {
        return m208397r(viewGroup, w9jVar);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m208396q0(final int i, View... viewArr) {
        C22306c.from(viewArr).doOnNext(new e30() { // from class: l.pdl0
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208367c(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: r */
    public static View m208397r(View view, w9j<View, Boolean> w9jVar) {
        if (w9jVar.call(view).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewM208397r = m208397r(viewGroup.getChildAt(i), w9jVar);
                if (viewM208397r != null) {
                    return viewM208397r;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m208398r0(View... viewArr) {
        C22306c.from(viewArr).doOnNext(new e30() { // from class: l.odl0
            @Override // p149l.e30
            public final void call(Object obj) {
                View view = (View) obj;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ael0(view));
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: s */
    public static List<View> m208399s(final ViewGroup viewGroup) {
        return vwb.m200351w(vwb.m200314a0(viewGroup.getChildCount()), new w9j() { // from class: l.wdl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xdl0.m208363a(viewGroup, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static void m208400s0(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f192402d.post(runnable);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m208401t(View view, e30<View> e30Var) {
        view.setOnClickListener(new ViewOnClickListenerC21099b(e30Var));
    }

    /* JADX INFO: renamed from: t0 */
    public static void m208402t0(View view, float f) {
        if (m208355S(f)) {
            return;
        }
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: u */
    public static void m208403u(View view) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, view.getWidth() / 2, view.getHeight() / 2, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, view.getWidth() / 2, view.getHeight() / 2, 0));
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("Vu downAndCancelTouchEvent:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m208404u0(View view, float f) {
        view.setPadding((int) (view.getPaddingLeft() * f), (int) (view.getPaddingTop() * f), (int) (view.getPaddingRight() * f), (int) (view.getPaddingBottom() * f));
    }

    /* JADX INFO: renamed from: v */
    public static void m208405v(View view) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, view.getWidth() / 2, view.getHeight() / 2, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 2, view.getWidth() / 2, view.getHeight() / 2, 0));
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("Vu downTouchEvent:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static float m208406v0(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(context instanceof Activity)) {
            return context.getResources().getDisplayMetrics().scaledDensity;
        }
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.scaledDensity;
    }

    /* JADX INFO: renamed from: w */
    public static int m208407w(float f) {
        return (int) (f16.m119092a().getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: w0 */
    public static int m208408w0() {
        return f16.m119092a().getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: renamed from: x */
    public static Bitmap m208409x(View view, int i) {
        float f = 1.0f / i;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (view.getMeasuredWidth() * f), (int) (view.getMeasuredHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (i > 1) {
            canvas.scale(f, f);
        }
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m208410x0(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(context instanceof Activity)) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: y */
    public static void m208411y(View view, boolean z) {
        view.setEnabled(z);
        view.setClickable(z);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m208412y0() {
        return f16.m119092a().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: z */
    public static void m208413z(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSingleLine(true);
        textView.setSelected(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setMarqueeRepeatLimit(-1);
        textView.setHorizontallyScrolling(true);
    }

    /* JADX INFO: renamed from: z0 */
    public static int m208414z0(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
