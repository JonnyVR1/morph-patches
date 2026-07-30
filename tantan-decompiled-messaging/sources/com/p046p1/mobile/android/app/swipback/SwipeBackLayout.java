package com.p046p1.mobile.android.app.swipback;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.joor.Reflect;
import p149l.bne0;
import p149l.gbl0;
import p149l.ig3;
import p149l.mbh0;
import p149l.sek0;
import p149l.t100;
import p149l.u2c0;
import p149l.ubl0;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class SwipeBackLayout extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public static Field f15562E;

    /* JADX INFO: renamed from: A */
    public Paint f15564A;

    /* JADX INFO: renamed from: B */
    public boolean f15565B;

    /* JADX INFO: renamed from: a */
    public float f15566a;

    /* JADX INFO: renamed from: b */
    public boolean f15567b;

    /* JADX INFO: renamed from: c */
    public View f15568c;

    /* JADX INFO: renamed from: d */
    public ubl0 f15569d;

    /* JADX INFO: renamed from: e */
    public float f15570e;

    /* JADX INFO: renamed from: f */
    public int f15571f;

    /* JADX INFO: renamed from: g */
    public List<mbh0> f15572g;

    /* JADX INFO: renamed from: h */
    public Drawable f15573h;

    /* JADX INFO: renamed from: i */
    public float f15574i;

    /* JADX INFO: renamed from: j */
    public int f15575j;

    /* JADX INFO: renamed from: k */
    public boolean f15576k;

    /* JADX INFO: renamed from: l */
    public boolean f15577l;

    /* JADX INFO: renamed from: m */
    public Rect f15578m;

    /* JADX INFO: renamed from: n */
    public int f15579n;

    /* JADX INFO: renamed from: o */
    public int f15580o;

    /* JADX INFO: renamed from: p */
    public boolean f15581p;

    /* JADX INFO: renamed from: q */
    public boolean f15582q;

    /* JADX INFO: renamed from: r */
    public float f15583r;

    /* JADX INFO: renamed from: s */
    public float f15584s;

    /* JADX INFO: renamed from: t */
    public int f15585t;

    /* JADX INFO: renamed from: u */
    public int f15586u;

    /* JADX INFO: renamed from: v */
    public int[] f15587v;

    /* JADX INFO: renamed from: w */
    public Point f15588w;

    /* JADX INFO: renamed from: x */
    public long f15589x;

    /* JADX INFO: renamed from: y */
    public Paint f15590y;

    /* JADX INFO: renamed from: z */
    public Shader f15591z;

    /* JADX INFO: renamed from: C */
    public static final int f15560C = t100.m186890d(10.0f);

    /* JADX INFO: renamed from: D */
    public static boolean f15561D = true;

    /* JADX INFO: renamed from: F */
    public static HashMap<Integer, ArrayList<WeakReference<SwipeBackLayout>>> f15563F = new HashMap<>();

    /* JADX INFO: renamed from: com.p1.mobile.android.app.swipback.SwipeBackLayout$a */
    public class C4320a extends ubl0.AbstractC20403c {

        /* JADX INFO: renamed from: a */
        public boolean f15592a;

        /* JADX INFO: renamed from: b */
        public boolean f15593b;

        public C4320a() {
            this.f15593b = true;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return Math.min(view.getWidth(), Math.max(i, 0));
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int getViewHorizontalDragRange(View view) {
            return SwipeBackLayout.this.f15579n;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewCaptured(View view, int i) {
            super.onViewCaptured(view, i);
            sek0.m183672b((Activity) SwipeBackLayout.this.getContext());
            if (SwipeBackLayout.this.f15572g != null && !SwipeBackLayout.this.f15572g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f15572g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).mo43538Z();
                }
            }
            this.f15592a = true;
            this.f15593b = false;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            super.onViewPositionChanged(view, i, i2, i3, i4);
            SwipeBackLayout swipeBackLayoutM20640F = SwipeBackLayout.this.m20640F();
            if (((Activity) SwipeBackLayout.this.getContext()).isFinishing() && swipeBackLayoutM20640F != null) {
                swipeBackLayoutM20640F.setX(0.0f);
                return;
            }
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            swipeBackLayout.f15570e = Math.abs(i / swipeBackLayout.f15568c.getWidth());
            SwipeBackLayout.this.f15571f = i;
            SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
            swipeBackLayout2.m20642H(swipeBackLayout2.f15571f);
            SwipeBackLayout.this.invalidate();
            if (SwipeBackLayout.this.f15570e < SwipeBackLayout.this.f15566a && !this.f15592a) {
                this.f15592a = true;
            }
            if (this.f15593b && SwipeBackLayout.this.f15570e == 0.0f && SwipeBackLayout.this.f15581p) {
                sek0.m183671a((Activity) SwipeBackLayout.this.getContext());
            }
            if (swipeBackLayoutM20640F != null) {
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                swipeBackLayoutM20640F.setX((-swipeBackLayout3.f15580o) * Math.max(1.0f - swipeBackLayout3.f15570e, 0.0f));
                if (SwipeBackLayout.this.f15570e == 0.0f) {
                    swipeBackLayoutM20640F.setX(0.0f);
                }
            }
            if (SwipeBackLayout.this.f15572g != null && !SwipeBackLayout.this.f15572g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f15572g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).mo43534D0(this.f15593b, SwipeBackLayout.this.f15570e, SwipeBackLayout.this.f15571f);
                }
            }
            if (SwipeBackLayout.this.f15570e >= 1.0f) {
                Activity activity = (Activity) SwipeBackLayout.this.getContext();
                if (activity.isFinishing()) {
                    return;
                }
                if (swipeBackLayoutM20640F != null) {
                    swipeBackLayoutM20640F.setX(0.0f);
                    if (SwipeBackLayout.this.f15572g != null && !SwipeBackLayout.this.f15572g.isEmpty() && SwipeBackLayout.this.f15570e >= SwipeBackLayout.this.f15566a && this.f15592a) {
                        this.f15592a = false;
                        Iterator it2 = SwipeBackLayout.this.f15572g.iterator();
                        while (it2.hasNext()) {
                            ((mbh0) it2.next()).mo43536O();
                        }
                    }
                }
                activity.finish();
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewReleased(View view, float f, float f2) {
            this.f15593b = true;
            if (SwipeBackLayout.this.f15570e == 0.0f && SwipeBackLayout.this.f15572g != null) {
                Iterator it = SwipeBackLayout.this.f15572g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).mo43534D0(this.f15593b, SwipeBackLayout.this.f15570e, SwipeBackLayout.this.f15571f);
                }
            }
            if (!((Activity) SwipeBackLayout.this.getContext()).isFinishing()) {
                SwipeBackLayout.this.f15569d.m192851O((f > 0.0f || (f == 0.0f && SwipeBackLayout.this.f15570e > SwipeBackLayout.this.f15566a)) ? view.getWidth() + SwipeBackLayout.this.f15573h.getIntrinsicWidth() + 10 : 0, 0);
                SwipeBackLayout.this.invalidate();
            } else {
                SwipeBackLayout swipeBackLayoutM20641G = SwipeBackLayout.this.m20641G();
                if (swipeBackLayoutM20641G != null) {
                    swipeBackLayoutM20641G.setX(0.0f);
                }
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public boolean tryCaptureView(View view, int i) {
            boolean z = SwipeBackLayout.this.f15582q;
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            boolean zM192839C = true;
            if (!z) {
                zM192839C = swipeBackLayout.f15569d.m192839C(1, i);
            } else if (!swipeBackLayout.f15569d.m192840D(i) || Math.abs(SwipeBackLayout.this.f15584s - SwipeBackLayout.this.f15583r) >= SwipeBackLayout.f15560C) {
                zM192839C = false;
            }
            SwipeBackLayout.this.f15569d.m192837A();
            if (zM192839C && SwipeBackLayout.this.f15572g != null && !SwipeBackLayout.this.f15572g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f15572g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).mo43535E0();
                }
            }
            return zM192839C;
        }
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f15566a = 0.3f;
        this.f15567b = true;
        this.f15575j = -1728053248;
        this.f15578m = new Rect();
        this.f15580o = xdl0.m208412y0() / 10;
        this.f15581p = true;
        this.f15582q = false;
        this.f15585t = xdl0.m208331F0();
        this.f15587v = new int[2];
        this.f15588w = new Point();
        this.f15589x = 0L;
        this.f15590y = new Paint();
        this.f15564A = new Paint();
        this.f15590y.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f15590y.setAlpha(255);
        this.f15564A.setColor(-1);
        this.f15569d = ubl0.m192836p(this, new C4320a());
        setShadow(u2c0.f173409p6);
        float f = getResources().getDisplayMetrics().density * 400.0f;
        m20650y(getResources().getDisplayMetrics().widthPixels);
        this.f15569d.m192850N(f);
        this.f15569d.m192849M(1);
    }

    /* JADX INFO: renamed from: w */
    public static SwipeBackLayout m20634w(Act act) {
        new SwipeBackLayout(act).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        SwipeBackLayout swipeBackLayout = new SwipeBackLayout(act);
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f15563F.get(Integer.valueOf(act.getTaskId()));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f15563F.put(Integer.valueOf(act.getTaskId()), arrayList);
        }
        arrayList.add(new WeakReference<>(swipeBackLayout));
        return swipeBackLayout;
    }

    /* JADX INFO: renamed from: A */
    public SwipeBackLayout m20635A(int i) {
        if (Build.VERSION.SDK_INT <= 34) {
            return this;
        }
        this.f15564A.setColor(i);
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: B */
    public SwipeBackLayout m20636B(int i) {
        this.f15590y.setColor(i);
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: C */
    public int m20637C() {
        return this.f15590y.getColor();
    }

    /* JADX INFO: renamed from: D */
    public SwipeBackLayout m20638D(boolean z) {
        if (Build.VERSION.SDK_INT <= 34) {
            return this;
        }
        this.f15565B = z;
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final void m20639E() {
        if (((Activity) getContext()).isInMultiWindowMode()) {
            if (xdl0.m208356T(getContext())) {
                if (!bne0.m102783l() || Build.VERSION.SDK_INT < 27) {
                    return;
                }
                this.f15590y.setAlpha(0);
                return;
            }
            getLocationOnScreen(this.f15587v);
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getRealSize(this.f15588w);
            if (this.f15587v[1] > this.f15588w.y / 4) {
                this.f15590y.setAlpha(0);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final SwipeBackLayout m20640F() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f15563F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
        while (arrayList != null && arrayList.size() > 1) {
            WeakReference<SwipeBackLayout> weakReference = arrayList.get(arrayList.size() - 2);
            if (weakReference == null) {
                arrayList.remove(arrayList.size() - 2);
            } else {
                SwipeBackLayout swipeBackLayout = weakReference.get();
                if (swipeBackLayout != null) {
                    return swipeBackLayout;
                }
                arrayList.remove(arrayList.size() - 2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final SwipeBackLayout m20641G() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f15563F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
        while (arrayList != null && arrayList.size() > 0) {
            WeakReference<SwipeBackLayout> weakReference = arrayList.get(arrayList.size() - 1);
            if (weakReference == null) {
                arrayList.remove(arrayList.size() - 1);
            } else {
                SwipeBackLayout swipeBackLayout = weakReference.get();
                if (swipeBackLayout != null) {
                    return swipeBackLayout;
                }
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final void m20642H(int i) {
        if (this.f15577l) {
            LinearGradient linearGradient = new LinearGradient(i, xdl0.m208331F0(), i + xdl0.m208412y0(), 0.0f, new int[]{Color.parseColor("#c42d16"), Color.parseColor("#d46813")}, (float[]) null, Shader.TileMode.CLAMP);
            this.f15591z = linearGradient;
            this.f15590y.setShader(linearGradient);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f15574i = 1.0f - this.f15570e;
        if (this.f15569d.m192868n(true)) {
            gbl0.m125183a0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f15589x > 100) {
            m20639E();
            this.f15589x = jCurrentTimeMillis;
        }
        canvas.drawRect(this.f15571f, 0.0f, getWidth(), this.f15585t, this.f15590y);
        if (this.f15565B) {
            canvas.drawRect(this.f15571f, getHeight() - this.f15586u, getWidth(), getHeight(), this.f15564A);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15583r = motionEvent.getY();
        } else if (action == 2) {
            this.f15584s = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.f15568c;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.f15574i > 0.0f && z && this.f15569d.m192837A() != 0) {
            m20648v(canvas, view);
            m20647u(canvas, view);
        }
        return zDrawChild;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets != null && Build.VERSION.SDK_INT > 34) {
            this.f15585t = windowInsets.getSystemWindowInsetTop();
            this.f15586u = windowInsets.getSystemWindowInsetBottom();
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f15567b) {
            return false;
        }
        try {
            return this.f15569d.m192852P(motionEvent);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("SwipeBackLayout onInterceptTouchEvent:" + e.getMessage(), e));
            return false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f15576k = true;
        View view = this.f15568c;
        if (view != null) {
            int i5 = this.f15571f;
            view.layout(i5, 0, view.getMeasuredWidth() + i5, this.f15568c.getMeasuredHeight());
        }
        this.f15576k = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15567b) {
            return false;
        }
        try {
            this.f15569d.m192843G(motionEvent);
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("SwipeBackLayout onTouchEvent:" + e.getMessage(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m20643q(mbh0 mbh0Var) {
        if (this.f15572g == null) {
            this.f15572g = new ArrayList();
        }
        this.f15572g.add(mbh0Var);
    }

    /* JADX INFO: renamed from: r */
    public void m20644r() {
        Activity activity = (Activity) getContext();
        Drawable background = activity.getWindow().getDecorView().getBackground();
        activity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        activity.getWindow().getDecorView().setBackgroundColor(0);
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        if (viewGroup.getChildCount() == 0) {
            this.f15568c = childAt;
        } else {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.addView(childAt);
            while (viewGroup.getChildCount() > 0) {
                View childAt2 = viewGroup.getChildAt(0);
                viewGroup.removeView(childAt2);
                frameLayout.addView(childAt2);
            }
            this.f15568c = frameLayout;
        }
        this.f15568c.setBackgroundDrawable(background);
        addView(this.f15568c);
        viewGroup.addView(this);
        if (f15561D) {
            try {
                if (f15562E == null) {
                    f15562E = Reflect.m221135on(viewGroup.getClass()).field0("mContentRoot");
                }
                f15562E.set(viewGroup, this);
            } catch (Throwable unused) {
                f15561D = false;
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f15576k) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public void m20645s() {
        if (getX() != 0.0f) {
            setX(0.0f);
        }
    }

    public void setEdgeSizePercent(float f) {
        this.f15579n = (int) (getResources().getDisplayMetrics().widthPixels * f);
    }

    public void setEnableConvertActivityFromTranslucent(boolean z) {
        this.f15581p = z;
    }

    public void setEnableGesture(boolean z) {
        this.f15567b = z;
    }

    public void setFullSlide(boolean z) {
        this.f15582q = z;
    }

    public void setScrimColor(int i) {
        this.f15575j = i;
        invalidate();
    }

    public void setScrollThreshold(float f) {
        if (f >= 1.0f || f <= 0.0f) {
            ig3.m135964a("Threshold value should be between 0 and 1.0");
        } else {
            this.f15566a = f;
        }
    }

    public void setShadow(int i) {
        setShadow(getResources().getDrawable(i));
    }

    @Deprecated
    public void setSwipeListener(mbh0 mbh0Var) {
        m20643q(mbh0Var);
    }

    /* JADX INFO: renamed from: t */
    public View m20646t() {
        View view = this.f15568c;
        return view == null ? ((Activity) getContext()).getWindow().getDecorView() : view;
    }

    /* JADX INFO: renamed from: u */
    public final void m20647u(Canvas canvas, View view) {
        int i = this.f15575j;
        int i2 = ((int) ((((-16777216) & i) >>> 24) * this.f15574i)) << 24;
        canvas.clipRect(0, 0, view.getLeft(), getHeight());
        canvas.drawColor((i & 16777215) | i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m20648v(Canvas canvas, View view) {
        Rect rect = this.f15578m;
        view.getHitRect(rect);
        Drawable drawable = this.f15573h;
        drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
        this.f15573h.setAlpha((int) (this.f15574i * 255.0f));
        this.f15573h.draw(canvas);
    }

    /* JADX INFO: renamed from: x */
    public void m20649x() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f15563F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                SwipeBackLayout swipeBackLayout = arrayList.get(size).get();
                if (swipeBackLayout != null && swipeBackLayout == this) {
                    arrayList.remove(size);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public SwipeBackLayout m20650y(int i) {
        this.f15579n = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public SwipeBackLayout m20651z() {
        this.f15577l = true;
        m20642H(0);
        invalidate();
        return this;
    }

    public void setShadow(Drawable drawable) {
        this.f15573h = drawable;
        invalidate();
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeBackLayout(Context context) {
        this(context, null);
    }
}
