package p153l;

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
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class bnl0 {

    /* JADX INFO: renamed from: c */
    public static long f77542c;

    /* JADX INFO: renamed from: a */
    public static vxd0 f77540a = new vxd0("status_bar_height_cache", 0);

    /* JADX INFO: renamed from: b */
    public static final boolean f77541b = m105512G();

    /* JADX INFO: renamed from: d */
    public static final Handler f77543d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    public static int f77544e = -1;

    /* JADX INFO: renamed from: f */
    public static int f77545f = -2;

    /* JADX INFO: renamed from: g */
    public static int f77546g = -1;

    /* JADX INFO: renamed from: h */
    public static long f77547h = 0;

    /* JADX INFO: renamed from: l.bnl0$a */
    public class ViewOnClickListenerC16061a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f77548a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View.OnClickListener f77549b;

        public ViewOnClickListenerC16061a(View.OnClickListener onClickListener) {
            this.f77549b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f77548a > 500) {
                this.f77548a = SystemClock.uptimeMillis();
                this.f77549b.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: l.bnl0$b */
    public class ViewOnClickListenerC16062b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f77550a = SystemClock.uptimeMillis();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y20 f77551b;

        public ViewOnClickListenerC16062b(y20 y20Var) {
            this.f77551b = y20Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Math.abs(SystemClock.uptimeMillis() - this.f77550a) < 500) {
                this.f77551b.call(view);
            } else {
                this.f77550a = SystemClock.uptimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: l.bnl0$c */
    public class ViewOnLayoutChangeListenerC16063c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f77552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f77553b;

        public ViewOnLayoutChangeListenerC16063c(y20 y20Var, View view) {
            this.f77552a = y20Var;
            this.f77553b = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i8 - i6;
            int i10 = i3 - i;
            int i11 = i4 - i2;
            if ((i7 - i5 == i10 && i9 == i11) || i10 == 0 || i11 == 0) {
                return;
            }
            this.f77552a.call(new int[]{i10, i11});
            this.f77553b.removeOnLayoutChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.bnl0$d */
    public class ViewTreeObserverOnGlobalLayoutListenerC16064d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f77554a;

        public ViewTreeObserverOnGlobalLayoutListenerC16064d(View view) {
            this.f77554a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WindowInsets rootWindowInsets = this.f77554a.getRootWindowInsets();
            if (rootWindowInsets != null && rootWindowInsets.hasSystemWindowInsets() && rootWindowInsets.getSystemWindowInsetTop() != 0) {
                bnl0.f77546g = rootWindowInsets.getSystemWindowInsetTop();
                bnl0.f77540a.put(Integer.valueOf(bnl0.f77546g));
            }
            this.f77554a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.bnl0$e */
    public class ViewTreeObserverOnPreDrawListenerC16065e implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public boolean f77555a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewTreeObserver f77556b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ pcj f77557c;

        public ViewTreeObserverOnPreDrawListenerC16065e(ViewTreeObserver viewTreeObserver, pcj pcjVar) {
            this.f77556b = viewTreeObserver;
            this.f77557c = pcjVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f77555a) {
                return true;
            }
            this.f77555a = true;
            if (this.f77556b.isAlive()) {
                this.f77556b.removeOnPreDrawListener(this);
            }
            return ((Boolean) this.f77557c.call()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.bnl0$f */
    public class C16066f implements C22421c.a<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f77558a;

        public C16066f(View view) {
            this.f77558a = view;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final gcg0<? super Integer> gcg0Var) {
            final View view = this.f77558a;
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.fnl0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    gcg0Var.onNext(Integer.valueOf(view.getWidth()));
                }
            };
            if (!gcg0Var.isUnsubscribed()) {
                this.f77558a.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            final View view2 = this.f77558a;
            gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.gnl0
                @Override // p153l.x20
                public final void call() {
                    view2.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.bnl0$g */
    public static class C16067g {

        /* JADX INFO: renamed from: a */
        public int f77559a;

        /* JADX INFO: renamed from: b */
        public int f77560b;

        /* JADX INFO: renamed from: c */
        public int f77561c;

        /* JADX INFO: renamed from: d */
        public int f77562d;

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof C16067g) {
                C16067g c16067g = (C16067g) obj;
                if (c16067g.f77559a == this.f77559a && c16067g.f77562d == this.f77562d && c16067g.f77561c == this.f77561c && c16067g.f77560b == this.f77560b) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            if (!kmk0.f127510c) {
                return super.toString();
            }
            return "x = " + this.f77559a + ", y = " + this.f77560b + ", w = " + this.f77561c + ", h = " + this.f77562d;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m105500A(View view) {
        m105502B(view, true);
    }

    /* JADX INFO: renamed from: A0 */
    public static void m105501A0(Context context, View view, @DrawableRes int i) {
        m105503B0(view, j26.m143192e(context, i));
    }

    /* JADX INFO: renamed from: B */
    public static void m105502B(View view, boolean z) {
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
    public static void m105503B0(View view, Drawable drawable) {
        kkl0.m150170m0(view, drawable);
    }

    /* JADX INFO: renamed from: C */
    public static int m105504C(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    /* JADX INFO: renamed from: C0 */
    public static void m105505C0(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: D */
    public static Activity m105506D(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static void m105507D0(final int i, View... viewArr) {
        C22421c.from(viewArr).doOnNext(new y20() { // from class: l.wml0
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105559i(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: E */
    public static Activity m105508E(View view) {
        return m105506D(view.getContext());
    }

    /* JADX INFO: renamed from: E0 */
    public static void m105509E0(View view, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new ViewOnClickListenerC16061a(onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: F */
    public static Point m105510F(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    @Deprecated
    /* JADX INFO: renamed from: F0 */
    public static int m105511F0() {
        return m105513G0(false);
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m105512G() {
        try {
            return Build.BRAND.equals("Meizu") || Math.max(ViewConfiguration.get(k26.m147943a()).getScaledOverscrollDistance(), ViewConfiguration.get(k26.m147943a()).getScaledOverflingDistance()) > m105587w(12.0f);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("Vu getBigOverscroll :" + e.getMessage(), e));
            return false;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: G0 */
    public static int m105513G0(boolean z) {
        int i = f77546g;
        if (i > 0) {
            return i;
        }
        if (f77540a.get().intValue() != 0) {
            return f77540a.get().intValue();
        }
        if (f77546g <= 0 || z) {
            Application applicationM147943a = k26.m147943a();
            int identifier = applicationM147943a.getResources().getIdentifier("android:dimen/status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = applicationM147943a.getResources().getDimensionPixelSize(identifier);
                if (f77546g <= 0 && dimensionPixelSize > 0) {
                    f77546g = dimensionPixelSize;
                } else if (z && dimensionPixelSize > 0) {
                    return dimensionPixelSize;
                }
            }
        }
        int i2 = f77546g;
        return i2 <= 0 ? qa00.f156288A : i2;
    }

    /* JADX INFO: renamed from: H */
    public static void m105514H(View view, Rect rect, Rect rect2) {
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
    public static boolean m105515H0(TextView textView, String str) {
        if (textView.getText().equals(str)) {
            return false;
        }
        textView.setText(str);
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static int m105516I(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m105517I0(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        m105524M(textView, !TextUtils.isEmpty(charSequence));
    }

    /* JADX INFO: renamed from: J */
    public static Point m105518J(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    /* JADX INFO: renamed from: J0 */
    public static TextView m105519J0(View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                return (TextView) view;
            }
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            TextView textViewM105519J0 = m105519J0(viewGroup.getChildAt(i));
            if (textViewM105519J0 != null) {
                return textViewM105519J0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static C22421c<Integer> m105520K(View view) {
        return C22421c.create(new C16066f(view)).compose(trd0.m192475e(fo0.m126432a()));
    }

    /* JADX INFO: renamed from: K0 */
    public static void m105521K0(View view, C16067g c16067g, C16067g c16067g2) {
        m105523L0(view, c16067g, c16067g2, false);
    }

    /* JADX INFO: renamed from: L */
    public static void m105522L(View view, @NonNull final View.OnClickListener onClickListener) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.zml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bnl0.m105553f(onClickListener, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public static void m105523L0(View view, C16067g c16067g, C16067g c16067g2, boolean z) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f = (c16067g.f77561c * 1.0f) / c16067g2.f77561c;
        float f2 = (c16067g.f77562d * 1.0f) / c16067g2.f77562d;
        if (m105535S(f) || m105535S(f2)) {
            return;
        }
        if (!z) {
            view.setScaleX(f);
            view.setScaleY(f2);
            view.setTranslationX(c16067g.f77559a - c16067g2.f77559a);
            view.setTranslationY(c16067g.f77560b - c16067g2.f77560b);
            return;
        }
        if (f2 >= f) {
            view.setScaleX(f2);
            view.setScaleY(f2);
            view.setTranslationX((c16067g.f77559a - c16067g2.f77559a) - (((c16067g2.f77561c * f2) - c16067g.f77561c) / 2.0f));
            view.setTranslationY(c16067g.f77560b - c16067g2.f77560b);
            return;
        }
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationX(c16067g.f77559a - c16067g2.f77559a);
        view.setTranslationY((c16067g.f77560b - c16067g2.f77560b) - (((c16067g2.f77562d * f) - c16067g.f77562d) / 2.0f));
    }

    /* JADX INFO: renamed from: M */
    public static void m105524M(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: M0 */
    public static void m105525M0(View view, boolean z) {
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        } else if (view.getVisibility() == 0) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m105526N(ImageView imageView, int i) {
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        if (imageView.getDrawable() == null || imageView.getDrawable() != drawable) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static void m105527N0(TextView textView) {
        m105524M(textView, textView.getText() != null && textView.getText().length() > 0);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m105528O(View view, MotionEvent motionEvent) {
        return motionEvent.getX() > 0.0f && motionEvent.getY() > 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() < ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: O0 */
    public static boolean m105529O0(View view) {
        return view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: P */
    public static int m105530P(View view) {
        return m105532Q((ViewGroup) view.getParent(), view);
    }

    /* JADX INFO: renamed from: P0 */
    public static int m105531P0(ViewGroup viewGroup) {
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: Q */
    public static int m105532Q(ViewGroup viewGroup, View view) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m105533Q0(final View view, final y20<int[]> y20Var) {
        if (view.getHeight() == 0 || view.getWidth() == 0) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC16063c(y20Var, view));
        } else {
            m105580s0(new Runnable() { // from class: l.yml0
                @Override // java.lang.Runnable
                public final void run() {
                    y20 y20Var2 = y20Var;
                    View view2 = view;
                    y20Var2.call(new int[]{view2.getWidth(), view2.getHeight()});
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m105534R(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16064d(view));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m105535S(float f) {
        return f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY || Float.compare(f, Float.NaN) == 0;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m105536T(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: U */
    public static void m105537U(View view, int i) {
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
    public static void m105538V(View view, int i) {
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
    public static void m105539W(View view, int i) {
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
    public static void m105540X(View view, int i) {
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
    public static void m105541Y(final int i, View... viewArr) {
        C22421c.from(viewArr).doOnNext(new y20() { // from class: l.uml0
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105557h(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: Z */
    public static void m105542Z(View... viewArr) {
        C22421c.from(viewArr).doOnNext(new y20() { // from class: l.xml0
            @Override // p153l.y20
            public final void call(Object obj) {
                View view = (View) obj;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new dnl0(view));
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m105543a(ViewGroup viewGroup, Integer num) {
        View childAt = viewGroup.getChildAt(num.intValue());
        return childAt instanceof ViewGroup ? jyb.m147500c(m105579s((ViewGroup) childAt), childAt) : Collections.singletonList(childAt);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m105544a0(View view) {
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
    public static void m105546b0(View view, pcj<Boolean> pcjVar) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC16065e(viewTreeObserver, pcjVar));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m105547c(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(view.getWidth(), view.getHeight());
        }
        layoutParams.height += i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m105548c0(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m105550d0(View view, int i) {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    /* JADX INFO: renamed from: e0 */
    public static void m105552e0(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m105553f(View.OnClickListener onClickListener, View view) {
        if (SystemClock.uptimeMillis() - f77542c < 500) {
            return;
        }
        f77542c = SystemClock.uptimeMillis();
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m105554f0(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* JADX INFO: renamed from: g0 */
    public static void m105556g0(View... viewArr) {
        C22421c.from(viewArr).doOnNext(new y20() { // from class: l.vml0
            @Override // p153l.y20
            public final void call(Object obj) {
                View view = (View) obj;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new cnl0(view));
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m105557h(int i, View view) {
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
    public static void m105558h0(View view, int i) {
        view.setPadding(i, i, i, i);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m105559i(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(view.getWidth(), view.getHeight());
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: i0 */
    public static C16067g m105560i0(View view) {
        return m105562j0(view, m105508E(view).getWindow().getDecorView());
    }

    /* JADX INFO: renamed from: j0 */
    public static C16067g m105562j0(View view, View view2) {
        C16067g c16067g = new C16067g();
        c16067g.f77561c = view.getWidth();
        c16067g.f77562d = view.getHeight();
        while (view != null && view != view2) {
            c16067g.f77559a = (int) (c16067g.f77559a + (view.getLeft() - view.getScrollX()) + view.getTranslationX());
            c16067g.f77560b = (int) (c16067g.f77560b + (view.getTop() - view.getScrollY()) + view.getTranslationY());
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return c16067g;
    }

    /* JADX INFO: renamed from: k */
    public static void m105563k(TextView textView, Drawable drawable) {
        m105567m(textView, drawable, null, null, null);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m105564k0(View view) {
        view.measure(dox.m117364b(view.getWidth()), dox.m117364b(view.getHeight()));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: renamed from: l */
    public static void m105565l(TextView textView, Drawable drawable) {
        m105567m(textView, null, null, drawable, null);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m105566l0(View view, int i, boolean z, boolean z2) {
        int left = (view.getLeft() + view.getRight()) / 2;
        view.measure(z ? dox.m117367e() : dox.m117364b(view.getWidth()), z2 ? dox.m117367e() : dox.m117364b(view.getHeight()));
        view.layout(left - (view.getMeasuredWidth() / 2), i, left + (view.getMeasuredWidth() / 2), view.getMeasuredHeight() + i);
    }

    /* JADX INFO: renamed from: m */
    public static void m105567m(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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
    public static void m105568m0(View view, int i, int i2) {
        view.layout(view.getLeft() + i, view.getTop() + i2, view.getRight() + i, view.getBottom() + i2);
    }

    /* JADX INFO: renamed from: n */
    public static void m105569n(View view, int i, int i2, int i3, int i4) {
        view.setPadding(view.getPaddingLeft() + i, view.getPaddingTop() + i2, view.getPaddingRight() + i3, view.getPaddingBottom() + i4);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m105570n0(View view) {
        view.measure(dox.m117367e(), dox.m117367e());
        view.layout(view.getLeft(), view.getTop(), view.getLeft() + view.getMeasuredWidth(), view.getTop() + view.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: o */
    public static void m105571o(Activity activity, int i) {
        ImageView imageView = new ImageView(activity);
        imageView.setBackgroundResource(i);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(imageView, 0);
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    /* JADX INFO: renamed from: o0 */
    public static int m105572o0(View view, View view2) {
        int top = 0;
        while (view != view2) {
            top += view.getTop();
            view = (View) view.getParent();
        }
        return top;
    }

    /* JADX INFO: renamed from: p */
    public static void m105573p(View view) {
        view.callOnClick();
    }

    /* JADX INFO: renamed from: p0 */
    public static void m105574p0(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* JADX INFO: renamed from: q */
    public static View m105575q(ViewGroup viewGroup, qcj<View, Boolean> qcjVar) {
        return m105577r(viewGroup, qcjVar);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m105576q0(final int i, View... viewArr) {
        C22421c.from(viewArr).doOnNext(new y20() { // from class: l.tml0
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105547c(i, (View) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: r */
    public static View m105577r(View view, qcj<View, Boolean> qcjVar) {
        if (qcjVar.call(view).booleanValue()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewM105577r = m105577r(viewGroup.getChildAt(i), qcjVar);
                if (viewM105577r != null) {
                    return viewM105577r;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m105578r0(View... viewArr) {
        C22421c.from(viewArr).doOnNext(new y20() { // from class: l.sml0
            @Override // p153l.y20
            public final void call(Object obj) {
                View view = (View) obj;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new enl0(view));
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: s */
    public static List<View> m105579s(final ViewGroup viewGroup) {
        return jyb.m147534w(jyb.m147497a0(viewGroup.getChildCount()), new qcj() { // from class: l.anl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bnl0.m105543a(viewGroup, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static void m105580s0(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f77543d.post(runnable);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m105581t(View view, y20<View> y20Var) {
        view.setOnClickListener(new ViewOnClickListenerC16062b(y20Var));
    }

    /* JADX INFO: renamed from: t0 */
    public static void m105582t0(View view, float f) {
        if (m105535S(f)) {
            return;
        }
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: u */
    public static void m105583u(View view) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, view.getWidth() / 2, view.getHeight() / 2, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, view.getWidth() / 2, view.getHeight() / 2, 0));
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("Vu downAndCancelTouchEvent:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m105584u0(View view, float f) {
        view.setPadding((int) (view.getPaddingLeft() * f), (int) (view.getPaddingTop() * f), (int) (view.getPaddingRight() * f), (int) (view.getPaddingBottom() * f));
    }

    /* JADX INFO: renamed from: v */
    public static void m105585v(View view) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, view.getWidth() / 2, view.getHeight() / 2, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 2, view.getWidth() / 2, view.getHeight() / 2, 0));
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("Vu downTouchEvent:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static float m105586v0(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(context instanceof Activity)) {
            return context.getResources().getDisplayMetrics().scaledDensity;
        }
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.scaledDensity;
    }

    /* JADX INFO: renamed from: w */
    public static int m105587w(float f) {
        return (int) (k26.m147943a().getResources().getDisplayMetrics().density * f);
    }

    /* JADX INFO: renamed from: w0 */
    public static int m105588w0() {
        return k26.m147943a().getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: renamed from: x */
    public static Bitmap m105589x(View view, int i) {
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
    public static int m105590x0(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(context instanceof Activity)) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: y */
    public static void m105591y(View view, boolean z) {
        view.setEnabled(z);
        view.setClickable(z);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m105592y0() {
        return k26.m147943a().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: z */
    public static void m105593z(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSingleLine(true);
        textView.setSelected(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setMarqueeRepeatLimit(-1);
        textView.setHorizontallyScrolling(true);
    }

    /* JADX INFO: renamed from: z0 */
    public static int m105594z0(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
