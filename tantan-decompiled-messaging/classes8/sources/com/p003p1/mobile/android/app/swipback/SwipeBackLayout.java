package com.p003p1.mobile.android.app.swipback;

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
import com.p003p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.bne0;
import l.gbl0;
import l.ig3;
import l.t100;
import l.ubl0;
import l.xdl0;
import org.joor.Reflect;
import p007l.mbh0;
import p007l.sek0;
import p007l.u2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SwipeBackLayout extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public static Field f1261E;

    /* JADX INFO: renamed from: A */
    public Paint f1263A;

    /* JADX INFO: renamed from: B */
    public boolean f1264B;

    /* JADX INFO: renamed from: a */
    public float f1265a;

    /* JADX INFO: renamed from: b */
    public boolean f1266b;

    /* JADX INFO: renamed from: c */
    public View f1267c;

    /* JADX INFO: renamed from: d */
    public ubl0 f1268d;

    /* JADX INFO: renamed from: e */
    public float f1269e;

    /* JADX INFO: renamed from: f */
    public int f1270f;

    /* JADX INFO: renamed from: g */
    public List<mbh0> f1271g;

    /* JADX INFO: renamed from: h */
    public Drawable f1272h;

    /* JADX INFO: renamed from: i */
    public float f1273i;

    /* JADX INFO: renamed from: j */
    public int f1274j;

    /* JADX INFO: renamed from: k */
    public boolean f1275k;

    /* JADX INFO: renamed from: l */
    public boolean f1276l;

    /* JADX INFO: renamed from: m */
    public Rect f1277m;

    /* JADX INFO: renamed from: n */
    public int f1278n;

    /* JADX INFO: renamed from: o */
    public int f1279o;

    /* JADX INFO: renamed from: p */
    public boolean f1280p;

    /* JADX INFO: renamed from: q */
    public boolean f1281q;

    /* JADX INFO: renamed from: r */
    public float f1282r;

    /* JADX INFO: renamed from: s */
    public float f1283s;

    /* JADX INFO: renamed from: t */
    public int f1284t;

    /* JADX INFO: renamed from: u */
    public int f1285u;

    /* JADX INFO: renamed from: v */
    public int[] f1286v;

    /* JADX INFO: renamed from: w */
    public Point f1287w;

    /* JADX INFO: renamed from: x */
    public long f1288x;

    /* JADX INFO: renamed from: y */
    public Paint f1289y;

    /* JADX INFO: renamed from: z */
    public Shader f1290z;

    /* JADX INFO: renamed from: C */
    public static final int f1259C = t100.d(10.0f);

    /* JADX INFO: renamed from: D */
    public static boolean f1260D = true;

    /* JADX INFO: renamed from: F */
    public static HashMap<Integer, ArrayList<WeakReference<SwipeBackLayout>>> f1262F = new HashMap<>();

    /* JADX INFO: renamed from: com.p1.mobile.android.app.swipback.SwipeBackLayout$a */
    public class C0232a extends ubl0.c {

        /* JADX INFO: renamed from: a */
        public boolean f1291a;

        /* JADX INFO: renamed from: b */
        public boolean f1292b;

        public C0232a() {
            this.f1292b = true;
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return Math.min(view.getWidth(), Math.max(i, 0));
        }

        public int getViewHorizontalDragRange(View view) {
            return SwipeBackLayout.this.f1278n;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onViewCaptured(View view, int i) {
            super.onViewCaptured(view, i);
            sek0.m10655b((Activity) SwipeBackLayout.this.getContext());
            if (SwipeBackLayout.this.f1271g != null && !SwipeBackLayout.this.f1271g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f1271g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).m9865Z();
                }
            }
            this.f1291a = true;
            this.f1292b = false;
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            super.onViewPositionChanged(view, i, i2, i3, i4);
            SwipeBackLayout swipeBackLayoutM911F = SwipeBackLayout.this.m911F();
            if (((Activity) SwipeBackLayout.this.getContext()).isFinishing() && swipeBackLayoutM911F != null) {
                swipeBackLayoutM911F.setX(0.0f);
                return;
            }
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            swipeBackLayout.f1269e = Math.abs(i / swipeBackLayout.f1267c.getWidth());
            SwipeBackLayout.this.f1270f = i;
            SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
            swipeBackLayout2.m913H(swipeBackLayout2.f1270f);
            SwipeBackLayout.this.invalidate();
            if (SwipeBackLayout.this.f1269e < SwipeBackLayout.this.f1265a && !this.f1291a) {
                this.f1291a = true;
            }
            if (this.f1292b && SwipeBackLayout.this.f1269e == 0.0f && SwipeBackLayout.this.f1280p) {
                sek0.m10654a((Activity) SwipeBackLayout.this.getContext());
            }
            if (swipeBackLayoutM911F != null) {
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                swipeBackLayoutM911F.setX((-swipeBackLayout3.f1279o) * Math.max(1.0f - swipeBackLayout3.f1269e, 0.0f));
                if (SwipeBackLayout.this.f1269e == 0.0f) {
                    swipeBackLayoutM911F.setX(0.0f);
                }
            }
            if (SwipeBackLayout.this.f1271g != null && !SwipeBackLayout.this.f1271g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f1271g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).m9862D0(this.f1292b, SwipeBackLayout.this.f1269e, SwipeBackLayout.this.f1270f);
                }
            }
            if (SwipeBackLayout.this.f1269e >= 1.0f) {
                Activity activity = (Activity) SwipeBackLayout.this.getContext();
                if (activity.isFinishing()) {
                    return;
                }
                if (swipeBackLayoutM911F != null) {
                    swipeBackLayoutM911F.setX(0.0f);
                    if (SwipeBackLayout.this.f1271g != null && !SwipeBackLayout.this.f1271g.isEmpty() && SwipeBackLayout.this.f1269e >= SwipeBackLayout.this.f1265a && this.f1291a) {
                        this.f1291a = false;
                        Iterator it2 = SwipeBackLayout.this.f1271g.iterator();
                        while (it2.hasNext()) {
                            ((mbh0) it2.next()).m9864O();
                        }
                    }
                }
                activity.finish();
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            this.f1292b = true;
            if (SwipeBackLayout.this.f1269e == 0.0f && SwipeBackLayout.this.f1271g != null) {
                Iterator it = SwipeBackLayout.this.f1271g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).m9862D0(this.f1292b, SwipeBackLayout.this.f1269e, SwipeBackLayout.this.f1270f);
                }
            }
            if (!((Activity) SwipeBackLayout.this.getContext()).isFinishing()) {
                SwipeBackLayout.this.f1268d.O((f > 0.0f || (f == 0.0f && SwipeBackLayout.this.f1269e > SwipeBackLayout.this.f1265a)) ? view.getWidth() + SwipeBackLayout.this.f1272h.getIntrinsicWidth() + 10 : 0, 0);
                SwipeBackLayout.this.invalidate();
            } else {
                SwipeBackLayout swipeBackLayoutM912G = SwipeBackLayout.this.m912G();
                if (swipeBackLayoutM912G != null) {
                    swipeBackLayoutM912G.setX(0.0f);
                }
            }
        }

        public boolean tryCaptureView(View view, int i) {
            boolean z = SwipeBackLayout.this.f1281q;
            SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
            boolean zC = true;
            if (!z) {
                zC = swipeBackLayout.f1268d.C(1, i);
            } else if (!swipeBackLayout.f1268d.D(i) || Math.abs(SwipeBackLayout.this.f1283s - SwipeBackLayout.this.f1282r) >= SwipeBackLayout.f1259C) {
                zC = false;
            }
            SwipeBackLayout.this.f1268d.A();
            if (zC && SwipeBackLayout.this.f1271g != null && !SwipeBackLayout.this.f1271g.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f1271g.iterator();
                while (it.hasNext()) {
                    ((mbh0) it.next()).m9863E0();
                }
            }
            return zC;
        }
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f1265a = 0.3f;
        this.f1266b = true;
        this.f1274j = -1728053248;
        this.f1277m = new Rect();
        this.f1279o = xdl0.y0() / 10;
        this.f1280p = true;
        this.f1281q = false;
        this.f1284t = xdl0.F0();
        this.f1286v = new int[2];
        this.f1287w = new Point();
        this.f1288x = 0L;
        this.f1289y = new Paint();
        this.f1263A = new Paint();
        this.f1289y.setColor(-16777216);
        this.f1289y.setAlpha(255);
        this.f1263A.setColor(-1);
        this.f1268d = ubl0.p(this, new C0232a());
        setShadow(u2c0.f4777p6);
        float f = getResources().getDisplayMetrics().density * 400.0f;
        m921y(getResources().getDisplayMetrics().widthPixels);
        this.f1268d.N(f);
        this.f1268d.M(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static SwipeBackLayout m905w(Act act) {
        new SwipeBackLayout(act).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        SwipeBackLayout swipeBackLayout = new SwipeBackLayout(act);
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f1262F.get(Integer.valueOf(act.getTaskId()));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f1262F.put(Integer.valueOf(act.getTaskId()), arrayList);
        }
        arrayList.add(new WeakReference<>(swipeBackLayout));
        return swipeBackLayout;
    }

    /* JADX INFO: renamed from: A */
    public SwipeBackLayout m906A(int i) {
        if (Build.VERSION.SDK_INT <= 34) {
            return this;
        }
        this.f1263A.setColor(i);
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: B */
    public SwipeBackLayout m907B(int i) {
        this.f1289y.setColor(i);
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: C */
    public int m908C() {
        return this.f1289y.getColor();
    }

    /* JADX INFO: renamed from: D */
    public SwipeBackLayout m909D(boolean z) {
        if (Build.VERSION.SDK_INT <= 34) {
            return this;
        }
        this.f1264B = z;
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final void m910E() {
        if (((Activity) getContext()).isInMultiWindowMode()) {
            if (xdl0.T(getContext())) {
                if (!bne0.l() || Build.VERSION.SDK_INT < 27) {
                    return;
                }
                this.f1289y.setAlpha(0);
                return;
            }
            getLocationOnScreen(this.f1286v);
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getRealSize(this.f1287w);
            if (this.f1286v[1] > this.f1287w.y / 4) {
                this.f1289y.setAlpha(0);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final SwipeBackLayout m911F() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f1262F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
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
    public final SwipeBackLayout m912G() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f1262F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
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
    public final void m913H(int i) {
        if (this.f1276l) {
            LinearGradient linearGradient = new LinearGradient(i, xdl0.F0(), i + xdl0.y0(), 0.0f, new int[]{Color.parseColor("#c42d16"), Color.parseColor("#d46813")}, (float[]) null, Shader.TileMode.CLAMP);
            this.f1290z = linearGradient;
            this.f1289y.setShader(linearGradient);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f1273i = 1.0f - this.f1269e;
        if (this.f1268d.n(true)) {
            gbl0.a0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f1288x > 100) {
            m910E();
            this.f1288x = jCurrentTimeMillis;
        }
        canvas.drawRect(this.f1270f, 0.0f, getWidth(), this.f1284t, this.f1289y);
        if (this.f1264B) {
            canvas.drawRect(this.f1270f, getHeight() - this.f1285u, getWidth(), getHeight(), this.f1263A);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1282r = motionEvent.getY();
        } else if (action == 2) {
            this.f1283s = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.f1267c;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.f1273i > 0.0f && z && this.f1268d.A() != 0) {
            m919v(canvas, view);
            m918u(canvas, view);
        }
        return zDrawChild;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets != null && Build.VERSION.SDK_INT > 34) {
            this.f1284t = windowInsets.getSystemWindowInsetTop();
            this.f1285u = windowInsets.getSystemWindowInsetBottom();
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f1266b) {
            return false;
        }
        try {
            return this.f1268d.P(motionEvent);
        } catch (Exception e) {
            CrashHelper.c(new Exception("SwipeBackLayout onInterceptTouchEvent:" + e.getMessage(), e));
            return false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1275k = true;
        View view = this.f1267c;
        if (view != null) {
            int i5 = this.f1270f;
            view.layout(i5, 0, view.getMeasuredWidth() + i5, this.f1267c.getMeasuredHeight());
        }
        this.f1275k = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1266b) {
            return false;
        }
        try {
            this.f1268d.G(motionEvent);
            return true;
        } catch (Exception e) {
            CrashHelper.c(new Exception("SwipeBackLayout onTouchEvent:" + e.getMessage(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m914q(mbh0 mbh0Var) {
        if (this.f1271g == null) {
            this.f1271g = new ArrayList();
        }
        this.f1271g.add(mbh0Var);
    }

    /* JADX INFO: renamed from: r */
    public void m915r() {
        Activity activity = (Activity) getContext();
        Drawable background = activity.getWindow().getDecorView().getBackground();
        activity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        activity.getWindow().getDecorView().setBackgroundColor(0);
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        if (viewGroup.getChildCount() == 0) {
            this.f1267c = childAt;
        } else {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.addView(childAt);
            while (viewGroup.getChildCount() > 0) {
                View childAt2 = viewGroup.getChildAt(0);
                viewGroup.removeView(childAt2);
                frameLayout.addView(childAt2);
            }
            this.f1267c = frameLayout;
        }
        this.f1267c.setBackgroundDrawable(background);
        addView(this.f1267c);
        viewGroup.addView(this);
        if (f1260D) {
            try {
                if (f1261E == null) {
                    f1261E = Reflect.on(viewGroup.getClass()).field0("mContentRoot");
                }
                f1261E.set(viewGroup, this);
            } catch (Throwable unused) {
                f1260D = false;
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1275k) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public void m916s() {
        if (getX() != 0.0f) {
            setX(0.0f);
        }
    }

    public void setEdgeSizePercent(float f) {
        this.f1278n = (int) (getResources().getDisplayMetrics().widthPixels * f);
    }

    public void setEnableConvertActivityFromTranslucent(boolean z) {
        this.f1280p = z;
    }

    public void setEnableGesture(boolean z) {
        this.f1266b = z;
    }

    public void setFullSlide(boolean z) {
        this.f1281q = z;
    }

    public void setScrimColor(int i) {
        this.f1274j = i;
        invalidate();
    }

    public void setScrollThreshold(float f) {
        if (f >= 1.0f || f <= 0.0f) {
            ig3.a("Threshold value should be between 0 and 1.0");
        } else {
            this.f1265a = f;
        }
    }

    public void setShadow(int i) {
        setShadow(getResources().getDrawable(i));
    }

    @Deprecated
    public void setSwipeListener(mbh0 mbh0Var) {
        m914q(mbh0Var);
    }

    /* JADX INFO: renamed from: t */
    public View m917t() {
        View view = this.f1267c;
        return view == null ? ((Activity) getContext()).getWindow().getDecorView() : view;
    }

    /* JADX INFO: renamed from: u */
    public final void m918u(Canvas canvas, View view) {
        int i = this.f1274j;
        int i2 = ((int) ((((-16777216) & i) >>> 24) * this.f1273i)) << 24;
        canvas.clipRect(0, 0, view.getLeft(), getHeight());
        canvas.drawColor((i & 16777215) | i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m919v(Canvas canvas, View view) {
        Rect rect = this.f1277m;
        view.getHitRect(rect);
        Drawable drawable = this.f1272h;
        drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
        this.f1272h.setAlpha((int) (this.f1273i * 255.0f));
        this.f1272h.draw(canvas);
    }

    /* JADX INFO: renamed from: x */
    public void m920x() {
        ArrayList<WeakReference<SwipeBackLayout>> arrayList = f1262F.get(Integer.valueOf(((Activity) getContext()).getTaskId()));
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
    public SwipeBackLayout m921y(int i) {
        this.f1278n = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public SwipeBackLayout m922z() {
        this.f1276l = true;
        m913H(0);
        invalidate();
        return this;
    }

    public void setShadow(Drawable drawable) {
        this.f1272h = drawable;
        invalidate();
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeBackLayout(Context context) {
        this(context, null);
    }
}
