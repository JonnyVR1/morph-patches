package p153l;

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
public final class rfq0 {

    /* JADX INFO: renamed from: a */
    public C19831e f162826a;

    /* JADX INFO: renamed from: l.rfq0$b */
    public static abstract class AbstractC19828b {

        /* JADX INFO: renamed from: a */
        public WindowInsets f162829a;

        /* JADX INFO: renamed from: b */
        public final int f162830b;

        public AbstractC19828b(int i) {
            this.f162830b = i;
        }

        /* JADX INFO: renamed from: a */
        public final int m181258a() {
            return this.f162830b;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo45931b(@NonNull rfq0 rfq0Var);

        /* JADX INFO: renamed from: c */
        public abstract void mo45932c(@NonNull rfq0 rfq0Var);

        @NonNull
        /* JADX INFO: renamed from: d */
        public abstract dgq0 mo45933d(@NonNull dgq0 dgq0Var, @NonNull List<rfq0> list);

        @NonNull
        /* JADX INFO: renamed from: e */
        public abstract C19827a mo45934e(@NonNull rfq0 rfq0Var, @NonNull C19827a c19827a);
    }

    /* JADX INFO: renamed from: l.rfq0$c */
    @RequiresApi(21)
    public static class C19829c extends C19831e {

        /* JADX INFO: renamed from: e */
        public static final Interpolator f162831e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f */
        public static final Interpolator f162832f = new yjg();

        /* JADX INFO: renamed from: g */
        public static final Interpolator f162833g = new DecelerateInterpolator();

        /* JADX INFO: renamed from: l.rfq0$c$a */
        @RequiresApi(21)
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public final AbstractC19828b f162834a;

            /* JADX INFO: renamed from: b */
            public dgq0 f162835b;

            /* JADX INFO: renamed from: l.rfq0$c$a$a, reason: collision with other inner class name */
            public class C22843a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rfq0 f162836a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ dgq0 f162837b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ dgq0 f162838c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f162839d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f162840e;

                public C22843a(rfq0 rfq0Var, dgq0 dgq0Var, dgq0 dgq0Var2, int i, View view) {
                    this.f162836a = rfq0Var;
                    this.f162837b = dgq0Var;
                    this.f162838c = dgq0Var2;
                    this.f162839d = i;
                    this.f162840e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f162836a.m181253d(valueAnimator.getAnimatedFraction());
                    C19829c.m181265j(this.f162840e, C19829c.m181269n(this.f162837b, this.f162838c, this.f162836a.m181252b(), this.f162839d), Collections.singletonList(this.f162836a));
                }
            }

            /* JADX INFO: renamed from: l.rfq0$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rfq0 f162842a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f162843b;

                public b(rfq0 rfq0Var, View view) {
                    this.f162842a = rfq0Var;
                    this.f162843b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f162842a.m181253d(1.0f);
                    C19829c.m181263h(this.f162843b, this.f162842a);
                }
            }

            /* JADX INFO: renamed from: l.rfq0$c$a$c */
            public class c implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f162845a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rfq0 f162846b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C19827a f162847c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ValueAnimator f162848d;

                public c(View view, rfq0 rfq0Var, C19827a c19827a, ValueAnimator valueAnimator) {
                    this.f162845a = view;
                    this.f162846b = rfq0Var;
                    this.f162847c = c19827a;
                    this.f162848d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C19829c.m181266k(this.f162845a, this.f162846b, this.f162847c);
                    this.f162848d.start();
                }
            }

            public a(@NonNull View view, @NonNull AbstractC19828b abstractC19828b) {
                this.f162834a = abstractC19828b;
                dgq0 dgq0VarM150116D = kkl0.m150116D(view);
                this.f162835b = dgq0VarM150116D != null ? new dgq0.C16520a(dgq0VarM150116D).m115696a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f162835b = dgq0.m115674x(windowInsets, view);
                    return C19829c.m181267l(view, windowInsets);
                }
                dgq0 dgq0VarM115674x = dgq0.m115674x(windowInsets, view);
                if (this.f162835b == null) {
                    this.f162835b = kkl0.m150116D(view);
                }
                if (this.f162835b == null) {
                    this.f162835b = dgq0VarM115674x;
                    return C19829c.m181267l(view, windowInsets);
                }
                AbstractC19828b abstractC19828bM181268m = C19829c.m181268m(view);
                if (abstractC19828bM181268m != null && Objects.equals(abstractC19828bM181268m.f162829a, windowInsets)) {
                    return C19829c.m181267l(view, windowInsets);
                }
                int iM181259d = C19829c.m181259d(dgq0VarM115674x, this.f162835b);
                if (iM181259d == 0) {
                    return C19829c.m181267l(view, windowInsets);
                }
                dgq0 dgq0Var = this.f162835b;
                rfq0 rfq0Var = new rfq0(iM181259d, C19829c.m181261f(iM181259d, dgq0VarM115674x, dgq0Var), 160L);
                rfq0Var.m181253d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(rfq0Var.m181251a());
                C19827a c19827aM181260e = C19829c.m181260e(dgq0VarM115674x, dgq0Var, iM181259d);
                C19829c.m181264i(view, rfq0Var, windowInsets, false);
                duration.addUpdateListener(new C22843a(rfq0Var, dgq0VarM115674x, dgq0Var, iM181259d, view));
                duration.addListener(new b(rfq0Var, view));
                eq50.m121892a(view, new c(view, rfq0Var, c19827aM181260e, duration));
                this.f162835b = dgq0VarM115674x;
                return C19829c.m181267l(view, windowInsets);
            }
        }

        public C19829c(int i, @Nullable Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: d */
        public static int m181259d(@NonNull dgq0 dgq0Var, @NonNull dgq0 dgq0Var2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!dgq0Var.m115680f(i2).equals(dgq0Var2.m115680f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public static C19827a m181260e(@NonNull dgq0 dgq0Var, @NonNull dgq0 dgq0Var2, int i) {
            svm svmVarM115680f = dgq0Var.m115680f(i);
            svm svmVarM115680f2 = dgq0Var2.m115680f(i);
            return new C19827a(svm.m188213b(Math.min(svmVarM115680f.f170857a, svmVarM115680f2.f170857a), Math.min(svmVarM115680f.f170858b, svmVarM115680f2.f170858b), Math.min(svmVarM115680f.f170859c, svmVarM115680f2.f170859c), Math.min(svmVarM115680f.f170860d, svmVarM115680f2.f170860d)), svm.m188213b(Math.max(svmVarM115680f.f170857a, svmVarM115680f2.f170857a), Math.max(svmVarM115680f.f170858b, svmVarM115680f2.f170858b), Math.max(svmVarM115680f.f170859c, svmVarM115680f2.f170859c), Math.max(svmVarM115680f.f170860d, svmVarM115680f2.f170860d)));
        }

        /* JADX INFO: renamed from: f */
        public static Interpolator m181261f(int i, dgq0 dgq0Var, dgq0 dgq0Var2) {
            if ((i & 8) != 0) {
                return dgq0Var.m115680f(dgq0.C16531l.m115733b()).f170860d > dgq0Var2.m115680f(dgq0.C16531l.m115733b()).f170860d ? f162831e : f162832f;
            }
            return f162833g;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public static View.OnApplyWindowInsetsListener m181262g(@NonNull View view, @NonNull AbstractC19828b abstractC19828b) {
            return new a(view, abstractC19828b);
        }

        /* JADX INFO: renamed from: h */
        public static void m181263h(@NonNull View view, @NonNull rfq0 rfq0Var) {
            AbstractC19828b abstractC19828bM181268m = m181268m(view);
            if (abstractC19828bM181268m != null) {
                abstractC19828bM181268m.mo45931b(rfq0Var);
                if (abstractC19828bM181268m.m181258a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m181263h(viewGroup.getChildAt(i), rfq0Var);
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public static void m181264i(View view, rfq0 rfq0Var, WindowInsets windowInsets, boolean z) {
            AbstractC19828b abstractC19828bM181268m = m181268m(view);
            if (abstractC19828bM181268m != null) {
                abstractC19828bM181268m.f162829a = windowInsets;
                if (!z) {
                    abstractC19828bM181268m.mo45932c(rfq0Var);
                    z = abstractC19828bM181268m.m181258a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m181264i(viewGroup.getChildAt(i), rfq0Var, windowInsets, z);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public static void m181265j(@NonNull View view, @NonNull dgq0 dgq0Var, @NonNull List<rfq0> list) {
            AbstractC19828b abstractC19828bM181268m = m181268m(view);
            if (abstractC19828bM181268m != null) {
                dgq0Var = abstractC19828bM181268m.mo45933d(dgq0Var, list);
                if (abstractC19828bM181268m.m181258a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m181265j(viewGroup.getChildAt(i), dgq0Var, list);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m181266k(View view, rfq0 rfq0Var, C19827a c19827a) {
            AbstractC19828b abstractC19828bM181268m = m181268m(view);
            if (abstractC19828bM181268m != null) {
                abstractC19828bM181268m.mo45934e(rfq0Var, c19827a);
                if (abstractC19828bM181268m.m181258a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m181266k(viewGroup.getChildAt(i), rfq0Var, c19827a);
                }
            }
        }

        @NonNull
        /* JADX INFO: renamed from: l */
        public static WindowInsets m181267l(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(kdc0.f125187Z) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @Nullable
        /* JADX INFO: renamed from: m */
        public static AbstractC19828b m181268m(View view) {
            Object tag = view.getTag(kdc0.f125197e0);
            if (tag instanceof a) {
                return ((a) tag).f162834a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: n */
        public static dgq0 m181269n(dgq0 dgq0Var, dgq0 dgq0Var2, float f, int i) {
            dgq0.C16520a c16520a = new dgq0.C16520a(dgq0Var);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    c16520a.m115697b(i2, dgq0Var.m115680f(i2));
                } else {
                    svm svmVarM115680f = dgq0Var.m115680f(i2);
                    svm svmVarM115680f2 = dgq0Var2.m115680f(i2);
                    float f2 = 1.0f - f;
                    c16520a.m115697b(i2, dgq0.m115672n(svmVarM115680f, (int) (((double) ((svmVarM115680f.f170857a - svmVarM115680f2.f170857a) * f2)) + 0.5d), (int) (((double) ((svmVarM115680f.f170858b - svmVarM115680f2.f170858b) * f2)) + 0.5d), (int) (((double) ((svmVarM115680f.f170859c - svmVarM115680f2.f170859c) * f2)) + 0.5d), (int) (((double) ((svmVarM115680f.f170860d - svmVarM115680f2.f170860d) * f2)) + 0.5d)));
                }
            }
            return c16520a.m115696a();
        }

        /* JADX INFO: renamed from: o */
        public static void m181270o(@NonNull View view, @Nullable AbstractC19828b abstractC19828b) {
            Object tag = view.getTag(kdc0.f125187Z);
            if (abstractC19828b == null) {
                view.setTag(kdc0.f125197e0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM181262g = m181262g(view, abstractC19828b);
            view.setTag(kdc0.f125197e0, onApplyWindowInsetsListenerM181262g);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM181262g);
            }
        }
    }

    /* JADX INFO: renamed from: l.rfq0$e */
    public static class C19831e {

        /* JADX INFO: renamed from: a */
        public final int f162855a;

        /* JADX INFO: renamed from: b */
        public float f162856b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Interpolator f162857c;

        /* JADX INFO: renamed from: d */
        public final long f162858d;

        public C19831e(int i, @Nullable Interpolator interpolator, long j) {
            this.f162855a = i;
            this.f162857c = interpolator;
            this.f162858d = j;
        }

        /* JADX INFO: renamed from: a */
        public long mo181275a() {
            return this.f162858d;
        }

        /* JADX INFO: renamed from: b */
        public float mo181276b() {
            Interpolator interpolator = this.f162857c;
            float f = this.f162856b;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }

        /* JADX INFO: renamed from: c */
        public void mo181277c(float f) {
            this.f162856b = f;
        }
    }

    public rfq0(int i, @Nullable Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f162826a = new C19830d(i, interpolator, j);
        } else {
            this.f162826a = new C19829c(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m181249c(@NonNull View view, @Nullable AbstractC19828b abstractC19828b) {
        if (Build.VERSION.SDK_INT >= 30) {
            C19830d.m181274g(view, abstractC19828b);
        } else {
            C19829c.m181270o(view, abstractC19828b);
        }
    }

    @RequiresApi(30)
    /* JADX INFO: renamed from: e */
    public static rfq0 m181250e(WindowInsetsAnimation windowInsetsAnimation) {
        return new rfq0(windowInsetsAnimation);
    }

    /* JADX INFO: renamed from: a */
    public long m181251a() {
        return this.f162826a.mo181275a();
    }

    /* JADX INFO: renamed from: b */
    public float m181252b() {
        return this.f162826a.mo181276b();
    }

    /* JADX INFO: renamed from: d */
    public void m181253d(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.f162826a.mo181277c(f);
    }

    /* JADX INFO: renamed from: l.rfq0$d */
    @RequiresApi(30)
    public static class C19830d extends C19831e {

        /* JADX INFO: renamed from: e */
        @NonNull
        public final WindowInsetsAnimation f162850e;

        /* JADX INFO: renamed from: l.rfq0$d$a */
        @RequiresApi(30)
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            public final AbstractC19828b f162851a;

            /* JADX INFO: renamed from: b */
            public List<rfq0> f162852b;

            /* JADX INFO: renamed from: c */
            public ArrayList<rfq0> f162853c;

            /* JADX INFO: renamed from: d */
            public final HashMap<WindowInsetsAnimation, rfq0> f162854d;

            public a(@NonNull AbstractC19828b abstractC19828b) {
                super(abstractC19828b.m181258a());
                this.f162854d = new HashMap<>();
                this.f162851a = abstractC19828b;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public final rfq0 m181278a(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                rfq0 rfq0Var = this.f162854d.get(windowInsetsAnimation);
                if (rfq0Var != null) {
                    return rfq0Var;
                }
                rfq0 rfq0VarM181250e = rfq0.m181250e(windowInsetsAnimation);
                this.f162854d.put(windowInsetsAnimation, rfq0VarM181250e);
                return rfq0VarM181250e;
            }

            public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f162851a.mo45931b(m181278a(windowInsetsAnimation));
                this.f162854d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.f162851a.mo45932c(m181278a(windowInsetsAnimation));
            }

            @NonNull
            public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<rfq0> arrayList = this.f162853c;
                if (arrayList == null) {
                    ArrayList<rfq0> arrayList2 = new ArrayList<>(list.size());
                    this.f162853c = arrayList2;
                    this.f162852b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM104236a = bgq0.m104236a(list.get(size));
                    rfq0 rfq0VarM181278a = m181278a(windowInsetsAnimationM104236a);
                    rfq0VarM181278a.m181253d(windowInsetsAnimationM104236a.getFraction());
                    this.f162853c.add(rfq0VarM181278a);
                }
                return this.f162851a.mo45933d(dgq0.m115673w(windowInsets), this.f162852b).m115695v();
            }

            @NonNull
            public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                return this.f162851a.mo45934e(m181278a(windowInsetsAnimation), C19827a.m181254d(bounds)).m181257c();
            }
        }

        public C19830d(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f162850e = windowInsetsAnimation;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public static WindowInsetsAnimation.Bounds m181271d(@NonNull C19827a c19827a) {
            ufq0.m195856a();
            return tfq0.m190958a(c19827a.m181255a().m188216e(), c19827a.m181256b().m188216e());
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public static svm m181272e(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return svm.m188215d(bounds.getUpperBound());
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public static svm m181273f(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return svm.m188215d(bounds.getLowerBound());
        }

        /* JADX INFO: renamed from: g */
        public static void m181274g(@NonNull View view, @Nullable AbstractC19828b abstractC19828b) {
            view.setWindowInsetsAnimationCallback(abstractC19828b != null ? new a(abstractC19828b) : null);
        }

        @Override // p153l.rfq0.C19831e
        /* JADX INFO: renamed from: a */
        public long mo181275a() {
            return this.f162850e.getDurationMillis();
        }

        @Override // p153l.rfq0.C19831e
        /* JADX INFO: renamed from: b */
        public float mo181276b() {
            return this.f162850e.getInterpolatedFraction();
        }

        @Override // p153l.rfq0.C19831e
        /* JADX INFO: renamed from: c */
        public void mo181277c(float f) {
            this.f162850e.setFraction(f);
        }

        public C19830d(int i, Interpolator interpolator, long j) {
            this(sfq0.m185661a(i, interpolator, j));
        }
    }

    /* JADX INFO: renamed from: l.rfq0$a */
    public static final class C19827a {

        /* JADX INFO: renamed from: a */
        public final svm f162827a;

        /* JADX INFO: renamed from: b */
        public final svm f162828b;

        @RequiresApi(30)
        public C19827a(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.f162827a = C19830d.m181273f(bounds);
            this.f162828b = C19830d.m181272e(bounds);
        }

        @NonNull
        @RequiresApi(30)
        /* JADX INFO: renamed from: d */
        public static C19827a m181254d(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new C19827a(bounds);
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public svm m181255a() {
            return this.f162827a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public svm m181256b() {
            return this.f162828b;
        }

        @NonNull
        @RequiresApi(30)
        /* JADX INFO: renamed from: c */
        public WindowInsetsAnimation.Bounds m181257c() {
            return C19830d.m181271d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f162827a + " upper=" + this.f162828b + "}";
        }

        public C19827a(@NonNull svm svmVar, @NonNull svm svmVar2) {
            this.f162827a = svmVar;
            this.f162828b = svmVar2;
        }
    }

    @RequiresApi(30)
    public rfq0(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f162826a = new C19830d(windowInsetsAnimation);
        }
    }
}
