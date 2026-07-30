package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m6q0 {

    /* JADX INFO: renamed from: a */
    public C18409e f131718a;

    /* JADX INFO: renamed from: l.m6q0$b */
    public static abstract class AbstractC18406b {

        /* JADX INFO: renamed from: a */
        public WindowInsets f131721a;

        /* JADX INFO: renamed from: b */
        public final int f131722b;

        public AbstractC18406b(int i) {
            this.f131722b = i;
        }

        /* JADX INFO: renamed from: a */
        public final int m153273a() {
            return this.f131722b;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo44748b(@NonNull m6q0 m6q0Var);

        /* JADX INFO: renamed from: c */
        public abstract void mo44749c(@NonNull m6q0 m6q0Var);

        @NonNull
        /* JADX INFO: renamed from: d */
        public abstract y6q0 mo44750d(@NonNull y6q0 y6q0Var, @NonNull List<m6q0> list);

        @NonNull
        /* JADX INFO: renamed from: e */
        public abstract C18405a mo44751e(@NonNull m6q0 m6q0Var, @NonNull C18405a c18405a);
    }

    /* JADX INFO: renamed from: l.m6q0$c */
    @RequiresApi(21)
    public static class C18407c extends C18409e {

        /* JADX INFO: renamed from: e */
        public static final Interpolator f131723e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f */
        public static final Interpolator f131724f = new kig();

        /* JADX INFO: renamed from: g */
        public static final Interpolator f131725g = new DecelerateInterpolator();

        /* JADX INFO: renamed from: l.m6q0$c$a */
        @RequiresApi(21)
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public final AbstractC18406b f131726a;

            /* JADX INFO: renamed from: b */
            public y6q0 f131727b;

            /* JADX INFO: renamed from: l.m6q0$c$a$a, reason: collision with other inner class name */
            public class C22727a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ m6q0 f131728a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ y6q0 f131729b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ y6q0 f131730c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f131731d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f131732e;

                public C22727a(m6q0 m6q0Var, y6q0 y6q0Var, y6q0 y6q0Var2, int i, View view) {
                    this.f131728a = m6q0Var;
                    this.f131729b = y6q0Var;
                    this.f131730c = y6q0Var2;
                    this.f131731d = i;
                    this.f131732e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f131728a.m153268d(valueAnimator.getAnimatedFraction());
                    C18407c.m153280j(this.f131732e, C18407c.m153284n(this.f131729b, this.f131730c, this.f131728a.m153267b(), this.f131731d), Collections.singletonList(this.f131728a));
                }
            }

            /* JADX INFO: renamed from: l.m6q0$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ m6q0 f131734a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f131735b;

                public b(m6q0 m6q0Var, View view) {
                    this.f131734a = m6q0Var;
                    this.f131735b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f131734a.m153268d(1.0f);
                    C18407c.m153278h(this.f131735b, this.f131734a);
                }
            }

            /* JADX INFO: renamed from: l.m6q0$c$a$c */
            public class c implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f131737a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ m6q0 f131738b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C18405a f131739c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ValueAnimator f131740d;

                public c(View view, m6q0 m6q0Var, C18405a c18405a, ValueAnimator valueAnimator) {
                    this.f131737a = view;
                    this.f131738b = m6q0Var;
                    this.f131739c = c18405a;
                    this.f131740d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C18407c.m153281k(this.f131737a, this.f131738b, this.f131739c);
                    this.f131740d.start();
                }
            }

            public a(@NonNull View view, @NonNull AbstractC18406b abstractC18406b) {
                this.f131726a = abstractC18406b;
                y6q0 y6q0VarM125153D = gbl0.m125153D(view);
                this.f131727b = y6q0VarM125153D != null ? new y6q0.C21315a(y6q0VarM125153D).m213195a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f131727b = y6q0.m213173x(windowInsets, view);
                    return C18407c.m153282l(view, windowInsets);
                }
                y6q0 y6q0VarM213173x = y6q0.m213173x(windowInsets, view);
                if (this.f131727b == null) {
                    this.f131727b = gbl0.m125153D(view);
                }
                if (this.f131727b == null) {
                    this.f131727b = y6q0VarM213173x;
                    return C18407c.m153282l(view, windowInsets);
                }
                AbstractC18406b abstractC18406bM153283m = C18407c.m153283m(view);
                if (abstractC18406bM153283m != null && Objects.equals(abstractC18406bM153283m.f131721a, windowInsets)) {
                    return C18407c.m153282l(view, windowInsets);
                }
                int iM153274d = C18407c.m153274d(y6q0VarM213173x, this.f131727b);
                if (iM153274d == 0) {
                    return C18407c.m153282l(view, windowInsets);
                }
                y6q0 y6q0Var = this.f131727b;
                m6q0 m6q0Var = new m6q0(iM153274d, C18407c.m153276f(iM153274d, y6q0VarM213173x, y6q0Var), 160L);
                m6q0Var.m153268d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(m6q0Var.m153266a());
                C18405a c18405aM153275e = C18407c.m153275e(y6q0VarM213173x, y6q0Var, iM153274d);
                C18407c.m153279i(view, m6q0Var, windowInsets, false);
                duration.addUpdateListener(new C22727a(m6q0Var, y6q0VarM213173x, y6q0Var, iM153274d, view));
                duration.addListener(new b(m6q0Var, view));
                yh50.m214787a(view, new c(view, m6q0Var, c18405aM153275e, duration));
                this.f131727b = y6q0VarM213173x;
                return C18407c.m153282l(view, windowInsets);
            }
        }

        public C18407c(int i, @Nullable Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: d */
        public static int m153274d(@NonNull y6q0 y6q0Var, @NonNull y6q0 y6q0Var2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!y6q0Var.m213179f(i2).equals(y6q0Var2.m213179f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public static C18405a m153275e(@NonNull y6q0 y6q0Var, @NonNull y6q0 y6q0Var2, int i) {
            rtm rtmVarM213179f = y6q0Var.m213179f(i);
            rtm rtmVarM213179f2 = y6q0Var2.m213179f(i);
            return new C18405a(rtm.m180814b(Math.min(rtmVarM213179f.f160972a, rtmVarM213179f2.f160972a), Math.min(rtmVarM213179f.f160973b, rtmVarM213179f2.f160973b), Math.min(rtmVarM213179f.f160974c, rtmVarM213179f2.f160974c), Math.min(rtmVarM213179f.f160975d, rtmVarM213179f2.f160975d)), rtm.m180814b(Math.max(rtmVarM213179f.f160972a, rtmVarM213179f2.f160972a), Math.max(rtmVarM213179f.f160973b, rtmVarM213179f2.f160973b), Math.max(rtmVarM213179f.f160974c, rtmVarM213179f2.f160974c), Math.max(rtmVarM213179f.f160975d, rtmVarM213179f2.f160975d)));
        }

        /* JADX INFO: renamed from: f */
        public static Interpolator m153276f(int i, y6q0 y6q0Var, y6q0 y6q0Var2) {
            if ((i & 8) != 0) {
                return y6q0Var.m213179f(y6q0.C21326l.m213232b()).f160975d > y6q0Var2.m213179f(y6q0.C21326l.m213232b()).f160975d ? f131723e : f131724f;
            }
            return f131725g;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public static View.OnApplyWindowInsetsListener m153277g(@NonNull View view, @NonNull AbstractC18406b abstractC18406b) {
            return new a(view, abstractC18406b);
        }

        /* JADX INFO: renamed from: h */
        public static void m153278h(@NonNull View view, @NonNull m6q0 m6q0Var) {
            AbstractC18406b abstractC18406bM153283m = m153283m(view);
            if (abstractC18406bM153283m != null) {
                abstractC18406bM153283m.mo44748b(m6q0Var);
                if (abstractC18406bM153283m.m153273a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m153278h(viewGroup.getChildAt(i), m6q0Var);
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public static void m153279i(View view, m6q0 m6q0Var, WindowInsets windowInsets, boolean z) {
            AbstractC18406b abstractC18406bM153283m = m153283m(view);
            if (abstractC18406bM153283m != null) {
                abstractC18406bM153283m.f131721a = windowInsets;
                if (!z) {
                    abstractC18406bM153283m.mo44749c(m6q0Var);
                    z = abstractC18406bM153283m.m153273a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m153279i(viewGroup.getChildAt(i), m6q0Var, windowInsets, z);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public static void m153280j(@NonNull View view, @NonNull y6q0 y6q0Var, @NonNull List<m6q0> list) {
            AbstractC18406b abstractC18406bM153283m = m153283m(view);
            if (abstractC18406bM153283m != null) {
                y6q0Var = abstractC18406bM153283m.mo44750d(y6q0Var, list);
                if (abstractC18406bM153283m.m153273a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m153280j(viewGroup.getChildAt(i), y6q0Var, list);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m153281k(View view, m6q0 m6q0Var, C18405a c18405a) {
            AbstractC18406b abstractC18406bM153283m = m153283m(view);
            if (abstractC18406bM153283m != null) {
                abstractC18406bM153283m.mo44751e(m6q0Var, c18405a);
                if (abstractC18406bM153283m.m153273a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m153281k(viewGroup.getChildAt(i), m6q0Var, c18405a);
                }
            }
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public static WindowInsets m153282l(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(e5c0.f89387Z) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @Nullable
        /* JADX INFO: renamed from: m */
        public static AbstractC18406b m153283m(View view) {
            Object tag = view.getTag(e5c0.f89397e0);
            if (tag instanceof a) {
                return ((a) tag).f131726a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: n */
        public static y6q0 m153284n(y6q0 y6q0Var, y6q0 y6q0Var2, float f, int i) {
            y6q0.C21315a c21315a = new y6q0.C21315a(y6q0Var);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    c21315a.m213196b(i2, y6q0Var.m213179f(i2));
                } else {
                    rtm rtmVarM213179f = y6q0Var.m213179f(i2);
                    rtm rtmVarM213179f2 = y6q0Var2.m213179f(i2);
                    float f2 = 1.0f - f;
                    c21315a.m213196b(i2, y6q0.m213171n(rtmVarM213179f, (int) (((double) ((rtmVarM213179f.f160972a - rtmVarM213179f2.f160972a) * f2)) + 0.5d), (int) (((double) ((rtmVarM213179f.f160973b - rtmVarM213179f2.f160973b) * f2)) + 0.5d), (int) (((double) ((rtmVarM213179f.f160974c - rtmVarM213179f2.f160974c) * f2)) + 0.5d), (int) (((double) ((rtmVarM213179f.f160975d - rtmVarM213179f2.f160975d) * f2)) + 0.5d)));
                }
            }
            return c21315a.m213195a();
        }

        /* JADX INFO: renamed from: o */
        public static void m153285o(@NonNull View view, @Nullable AbstractC18406b abstractC18406b) {
            Object tag = view.getTag(e5c0.f89387Z);
            if (abstractC18406b == null) {
                view.setTag(e5c0.f89397e0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM153277g = m153277g(view, abstractC18406b);
            view.setTag(e5c0.f89397e0, onApplyWindowInsetsListenerM153277g);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM153277g);
            }
        }
    }

    /* JADX INFO: renamed from: l.m6q0$e */
    public static class C18409e {

        /* JADX INFO: renamed from: a */
        public final int f131747a;

        /* JADX INFO: renamed from: b */
        public float f131748b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Interpolator f131749c;

        /* JADX INFO: renamed from: d */
        public final long f131750d;

        public C18409e(int i, @Nullable Interpolator interpolator, long j) {
            this.f131747a = i;
            this.f131749c = interpolator;
            this.f131750d = j;
        }

        /* JADX INFO: renamed from: a */
        public long mo153290a() {
            return this.f131750d;
        }

        /* JADX INFO: renamed from: b */
        public float mo153291b() {
            Interpolator interpolator = this.f131749c;
            float f = this.f131748b;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }

        /* JADX INFO: renamed from: c */
        public void mo153292c(float f) {
            this.f131748b = f;
        }
    }

    public m6q0(int i, @Nullable Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f131718a = new C18408d(i, interpolator, j);
        } else {
            this.f131718a = new C18407c(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m153264c(@NonNull View view, @Nullable AbstractC18406b abstractC18406b) {
        if (Build.VERSION.SDK_INT >= 30) {
            C18408d.m153289g(view, abstractC18406b);
        } else {
            C18407c.m153285o(view, abstractC18406b);
        }
    }

    @RequiresApi(30)
    /* JADX INFO: renamed from: e */
    public static m6q0 m153265e(WindowInsetsAnimation windowInsetsAnimation) {
        return new m6q0(windowInsetsAnimation);
    }

    /* JADX INFO: renamed from: a */
    public long m153266a() {
        return this.f131718a.mo153290a();
    }

    /* JADX INFO: renamed from: b */
    public float m153267b() {
        return this.f131718a.mo153291b();
    }

    /* JADX INFO: renamed from: d */
    public void m153268d(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.f131718a.mo153292c(f);
    }

    /* JADX INFO: renamed from: l.m6q0$d */
    @RequiresApi(30)
    public static class C18408d extends C18409e {

        /* JADX INFO: renamed from: e */
        @NonNull
        public final WindowInsetsAnimation f131742e;

        /* JADX INFO: renamed from: l.m6q0$d$a */
        @RequiresApi(30)
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            public final AbstractC18406b f131743a;

            /* JADX INFO: renamed from: b */
            public List<m6q0> f131744b;

            /* JADX INFO: renamed from: c */
            public ArrayList<m6q0> f131745c;

            /* JADX INFO: renamed from: d */
            public final HashMap<WindowInsetsAnimation, m6q0> f131746d;

            public a(@NonNull AbstractC18406b abstractC18406b) {
                super(abstractC18406b.m153273a());
                this.f131746d = new HashMap<>();
                this.f131743a = abstractC18406b;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public final m6q0 m153293a(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                m6q0 m6q0Var = this.f131746d.get(windowInsetsAnimation);
                if (m6q0Var != null) {
                    return m6q0Var;
                }
                m6q0 m6q0VarM153265e = m6q0.m153265e(windowInsetsAnimation);
                this.f131746d.put(windowInsetsAnimation, m6q0VarM153265e);
                return m6q0VarM153265e;
            }

            public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f131743a.mo44748b(m153293a(windowInsetsAnimation));
                this.f131746d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f131743a.mo44749c(m153293a(windowInsetsAnimation));
            }

            @NonNull
            public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<m6q0> arrayList = this.f131745c;
                if (arrayList == null) {
                    ArrayList<m6q0> arrayList2 = new ArrayList<>(list.size());
                    this.f131745c = arrayList2;
                    this.f131744b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM201958a = w6q0.m201958a(list.get(size));
                    m6q0 m6q0VarM153293a = m153293a(windowInsetsAnimationM201958a);
                    m6q0VarM153293a.m153268d(windowInsetsAnimationM201958a.getFraction());
                    this.f131745c.add(m6q0VarM153293a);
                }
                return this.f131743a.mo44750d(y6q0.m213172w(windowInsets), this.f131744b).m213194v();
            }

            @NonNull
            public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                return this.f131743a.mo44751e(m153293a(windowInsetsAnimation), C18405a.m153269d(bounds)).m153272c();
            }
        }

        public C18408d(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f131742e = windowInsetsAnimation;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public static WindowInsetsAnimation.Bounds m153286d(@NonNull C18405a c18405a) {
            p6q0.m167688a();
            return o6q0.m162940a(c18405a.m153270a().m180817e(), c18405a.m153271b().m180817e());
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public static rtm m153287e(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return rtm.m180816d(bounds.getUpperBound());
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public static rtm m153288f(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return rtm.m180816d(bounds.getLowerBound());
        }

        /* JADX INFO: renamed from: g */
        public static void m153289g(@NonNull View view, @Nullable AbstractC18406b abstractC18406b) {
            view.setWindowInsetsAnimationCallback(abstractC18406b != null ? new a(abstractC18406b) : null);
        }

        @Override // p149l.m6q0.C18409e
        /* JADX INFO: renamed from: a */
        public long mo153290a() {
            return this.f131742e.getDurationMillis();
        }

        @Override // p149l.m6q0.C18409e
        /* JADX INFO: renamed from: b */
        public float mo153291b() {
            return this.f131742e.getInterpolatedFraction();
        }

        @Override // p149l.m6q0.C18409e
        /* JADX INFO: renamed from: c */
        public void mo153292c(float f) {
            this.f131742e.setFraction(f);
        }

        public C18408d(int i, Interpolator interpolator, long j) {
            this(n6q0.m158066a(i, interpolator, j));
        }
    }

    /* JADX INFO: renamed from: l.m6q0$a */
    public static final class C18405a {

        /* JADX INFO: renamed from: a */
        public final rtm f131719a;

        /* JADX INFO: renamed from: b */
        public final rtm f131720b;

        @RequiresApi(30)
        public C18405a(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.f131719a = C18408d.m153288f(bounds);
            this.f131720b = C18408d.m153287e(bounds);
        }

        @NonNull
        @RequiresApi(30)
        /* JADX INFO: renamed from: d */
        public static C18405a m153269d(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new C18405a(bounds);
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public rtm m153270a() {
            return this.f131719a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public rtm m153271b() {
            return this.f131720b;
        }

        @NonNull
        @RequiresApi(30)
        /* JADX INFO: renamed from: c */
        public WindowInsetsAnimation.Bounds m153272c() {
            return C18408d.m153286d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f131719a + " upper=" + this.f131720b + "}";
        }

        public C18405a(@NonNull rtm rtmVar, @NonNull rtm rtmVar2) {
            this.f131719a = rtmVar;
            this.f131720b = rtmVar2;
        }
    }

    @RequiresApi(30)
    public m6q0(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f131718a = new C18408d(windowInsetsAnimation);
        }
    }
}
