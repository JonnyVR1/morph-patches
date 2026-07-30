package com.p051p1.mobile.android.app.swipback;

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
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.joor.Reflect;
import p153l.abc0;
import p153l.bnl0;
import p153l.ive0;
import p153l.kkl0;
import p153l.qa00;
import p153l.ujh0;
import p153l.wg3;
import p153l.ykl0;
import p153l.ynk0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class SwipeBackLayout extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public static Field f16281E;

    /* JADX INFO: renamed from: A */
    public Paint f16283A;

    /* JADX INFO: renamed from: B */
    public boolean f16284B;

    /* JADX INFO: renamed from: a */
    public float f16285a;

    /* JADX INFO: renamed from: b */
    public boolean f16286b;

    /* JADX INFO: renamed from: c */
    public View f16287c;

    /* JADX INFO: renamed from: d */
    public ykl0 f16288d;

    /* JADX INFO: renamed from: e */
    public float f16289e;

    /* JADX INFO: renamed from: f */
    public int f16290f;

    /* JADX INFO: renamed from: g */
    public List<ujh0> f16291g;

    /* JADX INFO: renamed from: h */
    public Drawable f16292h;

    /* JADX INFO: renamed from: i */
    public float f16293i;

    /* JADX INFO: renamed from: j */
    public int f16294j;

    /* JADX INFO: renamed from: k */
    public boolean f16295k;

    /* JADX INFO: renamed from: l */
    public boolean f16296l;

    /* JADX INFO: renamed from: m */
    public Rect f16297m;

    /* JADX INFO: renamed from: n */
    public int f16298n;

    /* JADX INFO: renamed from: o */
    public int f16299o;

    /* JADX INFO: renamed from: p */
    public boolean f16300p;

    /* JADX INFO: renamed from: q */
    public boolean f16301q;

    /* JADX INFO: renamed from: r */
    public float f16302r;

    /* JADX INFO: renamed from: s */
    public float f16303s;

    /* JADX INFO: renamed from: t */
    public int f16304t;

    /* JADX INFO: renamed from: u */
    public int f16305u;

    /* JADX INFO: renamed from: v */
    public int[] f16306v;

    /* JADX INFO: renamed from: w */
    public Point f16307w;

    /* JADX INFO: renamed from: x */
    public long f16308x;

    /* JADX INFO: renamed from: y */
    public Paint f16309y;

    /* JADX INFO: renamed from: z */
    public Shader f16310z;

    /* JADX INFO: renamed from: C */
    public static final int f16279C = qa00.m175859d(10.0f);

    /* JADX INFO: renamed from: D */
    public static boolean f16280D = true;

    /* JADX INFO: renamed from: F */
    public static HashMap<Integer, ArrayList<WeakReference<SwipeBackLayout>>> f16282F = new HashMap<>();

    /* JADX INFO: renamed from: com.p1.mobile.android.app.swipback.SwipeBackLayout$a */
    public class C4471a extends ykl0.AbstractC21619c {

        /* JADX INFO: renamed from: a */
        public boolean f16311a;

        /* JADX INFO: renamed from: b */
        public boolean f16312b;

        public C4471a() {
            this.f16312b = true;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return Math.min(view.getWidth(), Math.max(i, 0));
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int getViewHorizontalDragRange(View view) {
            return SwipeBackLayout.this.f16298n;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewCaptured(View view, int i) {
            super.onViewCaptured(view, i);
            ynk0.m216872b((Activity) SwipeBackLayout.this.getContext());
            if (SwipeBackLayout.this.f16291g != null && !SwipeBackLayout.this.f16291g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f16291g.iterator();
                while (it.hasNext()) {
                    ((ujh0) it.next()).mo44724a0();
                }
            }
            this.f16311a = true;
            this.f16312b = false;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            super.onViewPositionChanged(view, i, i2, i3, i4);
            SwipeBackLayout swipeBackLayoutM21639F = SwipeBackLayout.this.m21639F();
            if (((Activity) SwipeBackLayout.this.getContext()).isFinishing() && swipeBackLayoutM21639F != null) {
                swipeBackLayoutM21639F.setX(0.0f);
                return;
            }
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            swipeBackLayout.f16289e = Math.abs(i / swipeBackLayout.f16287c.getWidth());
            SwipeBackLayout.this.f16290f = i;
            SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
            swipeBackLayout2.m21641H(swipeBackLayout2.f16290f);
            SwipeBackLayout.this.invalidate();
            if (SwipeBackLayout.this.f16289e < SwipeBackLayout.this.f16285a && !this.f16311a) {
                this.f16311a = true;
            }
            if (this.f16312b && SwipeBackLayout.this.f16289e == 0.0f && SwipeBackLayout.this.f16300p) {
                ynk0.m216871a((Activity) SwipeBackLayout.this.getContext());
            }
            if (swipeBackLayoutM21639F != null) {
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                swipeBackLayoutM21639F.setX((-swipeBackLayout3.f16299o) * Math.max(1.0f - swipeBackLayout3.f16289e, 0.0f));
                if (SwipeBackLayout.this.f16289e == 0.0f) {
                    swipeBackLayoutM21639F.setX(0.0f);
                }
            }
            if (SwipeBackLayout.this.f16291g != null && !SwipeBackLayout.this.f16291g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f16291g.iterator();
                while (it.hasNext()) {
                    ((ujh0) it.next()).mo44720E0(this.f16312b, SwipeBackLayout.this.f16289e, SwipeBackLayout.this.f16290f);
                }
            }
            if (SwipeBackLayout.this.f16289e >= 1.0f) {
                Activity activity = (Activity) SwipeBackLayout.this.getContext();
                if (activity.isFinishing()) {
                    return;
                }
                if (swipeBackLayoutM21639F != null) {
                    swipeBackLayoutM21639F.setX(0.0f);
                    if (SwipeBackLayout.this.f16291g != null && !SwipeBackLayout.this.f16291g.isEmpty() && SwipeBackLayout.this.f16289e >= SwipeBackLayout.this.f16285a && this.f16311a) {
                        this.f16311a = false;
                        Iterator it2 = SwipeBackLayout.this.f16291g.iterator();
                        while (it2.hasNext()) {
                            ((ujh0) it2.next()).mo44722P();
                        }
                    }
                }
                activity.finish();
            }
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewReleased(View view, float f, float f2) {
            this.f16312b = true;
            if (SwipeBackLayout.this.f16289e == 0.0f && SwipeBackLayout.this.f16291g != null) {
                Iterator it = SwipeBackLayout.this.f16291g.iterator();
                while (it.hasNext()) {
                    ((ujh0) it.next()).mo44720E0(this.f16312b, SwipeBackLayout.this.f16289e, SwipeBackLayout.this.f16290f);
                }
            }
            if (!((Activity) SwipeBackLayout.this.getContext()).isFinishing()) {
                SwipeBackLayout.this.f16288d.m216499O((f > 0.0f || (f == 0.0f && SwipeBackLayout.this.f16289e > SwipeBackLayout.this.f16285a)) ? view.getWidth() + SwipeBackLayout.this.f16292h.getIntrinsicWidth() + 10 : 0, 0);
                SwipeBackLayout.this.invalidate();
            } else {
                SwipeBackLayout swipeBackLayoutM21640G = SwipeBackLayout.this.m21640G();
                if (swipeBackLayoutM21640G != null) {
                    swipeBackLayoutM21640G.setX(0.0f);
                }
            }
        }

        @Override // p153l.ykl0.AbstractC21619c
        public boolean tryCaptureView(View view, int i) {
            boolean z = SwipeBackLayout.this.f16301q;
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            boolean zM216487C = true;
            if (!z) {
                zM216487C = swipeBackLayout.f16288d.m216487C(1, i);
            } else if (!swipeBackLayout.f16288d.m216488D(i) || Math.abs(SwipeBackLayout.this.f16303s - SwipeBackLayout.this.f16302r) >= SwipeBackLayout.f16279C) {
                zM216487C = false;
            }
            SwipeBackLayout.this.f16288d.m216485A();
            if (zM216487C && SwipeBackLayout.this.f16291g != null && !SwipeBackLayout.this.f16291g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f16291g.iterator();
                while (it.hasNext()) {
                    ((ujh0) it.next()).mo44721G0();
                }
            }
            return zM216487C;
        }
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f16285a = 0.3f;
        this.f16286b = true;
        this.f16294j = -1728053248;
        this.f16297m = new Rect();
        this.f16299o = bnl0.m105592y0() / 10;
        this.f16300p = true;
        this.f16301q = false;
        this.f16304t = bnl0.m105511F0();
        this.f16306v = new int[2];
        this.f16307w = new Point();
        this.f16308x = 0L;
        this.f16309y = new Paint();
        this.f16283A = new Paint();
        this.f16309y.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f16309y.setAlpha(255);
        this.f16283A.setColor(-1);
        this.f16288d = ykl0.m216484p(this, new C4471a());
        setShadow(abc0.f69529p6);
        float f = getResources().getDisplayMetrics().density * 400.0f;
        m21649y(getResources().getDisplayMetrics().widthPixels);
        this.f16288d.m216498N(f);
        this.f16288d.m216497M(1);
    }

    /* JADX INFO: renamed from: w */
    public static SwipeBackLayout m21633w(Act act) {
        new SwipeBackLayout(act).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        SwipeBackLayout swipeBackLayout = new SwipeBackLayout(act);
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f16282F.get(Integer.valueOf(act.getTaskId()));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f16282F.put(Integer.valueOf(act.getTaskId()), arrayList);
        }
        arrayList.add(new WeakReference<>(swipeBackLayout));
        return swipeBackLayout;
    }

    /* JADX INFO: renamed from: A */
    public SwipeBackLayout m21634A(int i) {
        if (Build.VERSION.SDK_INT <= 34) {
            return this;
        }
        this.f16283A.setColor(i);
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: B */
    public SwipeBackLayout m21635B(int i) {
        this.f16309y.setColor(i);
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: C */
    public int m21636C() {
        return this.f16309y.getColor();
    }

    /* JADX INFO: renamed from: D */
    public SwipeBackLayout m21637D(boolean z) {
        if (Build.VERSION.SDK_INT <= 34) {
            return this;
        }
        this.f16284B = z;
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final void m21638E() {
        if (((Activity) getContext()).isInMultiWindowMode()) {
            if (bnl0.m105536T(getContext())) {
                if (!ive0.m142298l() || Build.VERSION.SDK_INT < 27) {
                    return;
                }
                this.f16309y.setAlpha(0);
                return;
            }
            getLocationOnScreen(this.f16306v);
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getRealSize(this.f16307w);
            if (this.f16306v[1] > this.f16307w.y / 4) {
                this.f16309y.setAlpha(0);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final SwipeBackLayout m21639F() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f16282F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
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
    public final SwipeBackLayout m21640G() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f16282F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
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
    public final void m21641H(int i) {
        if (this.f16296l) {
            LinearGradient linearGradient = new LinearGradient(i, bnl0.m105511F0(), i + bnl0.m105592y0(), 0.0f, new int[]{Color.parseColor("#c42d16"), Color.parseColor("#d46813")}, (float[]) null, Shader.TileMode.CLAMP);
            this.f16310z = linearGradient;
            this.f16309y.setShader(linearGradient);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f16293i = 1.0f - this.f16289e;
        if (this.f16288d.m216516n(true)) {
            kkl0.m150146a0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f16308x > 100) {
            m21638E();
            this.f16308x = jCurrentTimeMillis;
        }
        canvas.drawRect(this.f16290f, 0.0f, getWidth(), this.f16304t, this.f16309y);
        if (this.f16284B) {
            canvas.drawRect(this.f16290f, getHeight() - this.f16305u, getWidth(), getHeight(), this.f16283A);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f16302r = motionEvent.getY();
        } else if (action == 2) {
            this.f16303s = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.f16287c;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.f16293i > 0.0f && z && this.f16288d.m216485A() != 0) {
            m21647v(canvas, view);
            m21646u(canvas, view);
        }
        return zDrawChild;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets != null && Build.VERSION.SDK_INT > 34) {
            this.f16304t = windowInsets.getSystemWindowInsetTop();
            this.f16305u = windowInsets.getSystemWindowInsetBottom();
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f16286b) {
            return false;
        }
        try {
            return this.f16288d.m216500P(motionEvent);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("SwipeBackLayout onInterceptTouchEvent:" + e.getMessage(), e));
            return false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f16295k = true;
        View view = this.f16287c;
        if (view != null) {
            int i5 = this.f16290f;
            view.layout(i5, 0, view.getMeasuredWidth() + i5, this.f16287c.getMeasuredHeight());
        }
        this.f16295k = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16286b) {
            return false;
        }
        try {
            this.f16288d.m216491G(motionEvent);
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("SwipeBackLayout onTouchEvent:" + e.getMessage(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21642q(ujh0 ujh0Var) {
        if (this.f16291g == null) {
            this.f16291g = new ArrayList();
        }
        this.f16291g.add(ujh0Var);
    }

    /* JADX INFO: renamed from: r */
    public void m21643r() {
        Activity activity = (Activity) getContext();
        Drawable background = activity.getWindow().getDecorView().getBackground();
        activity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        activity.getWindow().getDecorView().setBackgroundColor(0);
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        if (viewGroup.getChildCount() == 0) {
            this.f16287c = childAt;
        } else {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.addView(childAt);
            while (viewGroup.getChildCount() > 0) {
                View childAt2 = viewGroup.getChildAt(0);
                viewGroup.removeView(childAt2);
                frameLayout.addView(childAt2);
            }
            this.f16287c = frameLayout;
        }
        this.f16287c.setBackgroundDrawable(background);
        addView(this.f16287c);
        viewGroup.addView(this);
        if (f16280D) {
            try {
                if (f16281E == null) {
                    f16281E = Reflect.m222381on(viewGroup.getClass()).field0("mContentRoot");
                }
                f16281E.set(viewGroup, this);
            } catch (Throwable unused) {
                f16280D = false;
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f16295k) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public void m21644s() {
        if (getX() != 0.0f) {
            setX(0.0f);
        }
    }

    public void setEdgeSizePercent(float f) {
        this.f16298n = (int) (getResources().getDisplayMetrics().widthPixels * f);
    }

    public void setEnableConvertActivityFromTranslucent(boolean z) {
        this.f16300p = z;
    }

    public void setEnableGesture(boolean z) {
        this.f16286b = z;
    }

    public void setFullSlide(boolean z) {
        this.f16301q = z;
    }

    public void setScrimColor(int i) {
        this.f16294j = i;
        invalidate();
    }

    public void setScrollThreshold(float f) {
        if (f >= 1.0f || f <= 0.0f) {
            wg3.m206174a("Threshold value should be between 0 and 1.0");
        } else {
            this.f16285a = f;
        }
    }

    public void setShadow(int i) {
        setShadow(getResources().getDrawable(i));
    }

    @Deprecated
    public void setSwipeListener(ujh0 ujh0Var) {
        m21642q(ujh0Var);
    }

    /* JADX INFO: renamed from: t */
    public View m21645t() {
        View view = this.f16287c;
        return view == null ? ((Activity) getContext()).getWindow().getDecorView() : view;
    }

    /* JADX INFO: renamed from: u */
    public final void m21646u(Canvas canvas, View view) {
        int i = this.f16294j;
        int i2 = ((int) ((((-16777216) & i) >>> 24) * this.f16293i)) << 24;
        canvas.clipRect(0, 0, view.getLeft(), getHeight());
        canvas.drawColor((i & 16777215) | i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m21647v(Canvas canvas, View view) {
        Rect rect = this.f16297m;
        view.getHitRect(rect);
        Drawable drawable = this.f16292h;
        drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
        this.f16292h.setAlpha((int) (this.f16293i * 255.0f));
        this.f16292h.draw(canvas);
    }

    /* JADX INFO: renamed from: x */
    public void m21648x() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f16282F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
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
    public SwipeBackLayout m21649y(int i) {
        this.f16298n = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public SwipeBackLayout m21650z() {
        this.f16296l = true;
        m21641H(0);
        invalidate();
        return this;
    }

    public void setShadow(Drawable drawable) {
        this.f16292h = drawable;
        invalidate();
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeBackLayout(Context context) {
        this(context, null);
    }
}
