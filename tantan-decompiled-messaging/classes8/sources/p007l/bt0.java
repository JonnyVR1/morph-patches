package p007l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import l.lig;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class bt0 {

    /* JADX INFO: renamed from: a */
    public static final Interpolator f2324a = new lig();

    /* JADX INFO: renamed from: b */
    public static final Interpolator f2325b = new jig();

    /* JADX INFO: renamed from: c */
    public static final Interpolator f2326c = new DecelerateInterpolator();

    /* JADX INFO: renamed from: d */
    public static final Interpolator f2327d = new OvershootInterpolator(1.0f);

    /* JADX INFO: renamed from: e */
    public static final Interpolator f2328e = new OvershootInterpolator(3.0f);

    /* JADX INFO: renamed from: f */
    public static final Interpolator f2329f = new AnticipateOvershootInterpolator(1.0f);

    /* JADX INFO: renamed from: g */
    public static final Property<View, Integer> f2330g;

    /* JADX INFO: renamed from: h */
    public static final Property<View, Integer> f2331h;

    /* JADX INFO: renamed from: i */
    public static Property<View, Float> f2332i;

    /* JADX INFO: renamed from: j */
    public static Property<CardView, Float> f2333j;

    /* JADX INFO: renamed from: k */
    public static final Property<View, Integer> f2334k;

    /* JADX INFO: renamed from: l */
    public static Property<TextView, Integer> f2335l;

    /* JADX INFO: renamed from: l.bt0$a */
    public class C0500a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f2336a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f2337b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f2338c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f2339d;

        public C0500a(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
            this.f2336a = runnable;
            this.f2337b = runnable2;
            this.f2338c = runnable3;
            this.f2339d = runnable4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Runnable runnable = this.f2338c;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f2337b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Runnable runnable = this.f2339d;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Runnable runnable = this.f2336a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: l.bt0$d */
    public class C0503d extends Property<View, Integer> {
        public C0503d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.bt0$e */
    public class C0504e extends Property<View, Integer> {
        public C0504e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.bt0$f */
    public class C0505f extends Property<View, Float> {
        public C0505f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getScaleX());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            if (xdl0.S(f.floatValue())) {
                return;
            }
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: l.bt0$g */
    public class C0506g extends Property<CardView, Float> {
        public C0506g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(CardView cardView) {
            return Float.valueOf(cardView.getRadius());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(CardView cardView, Float f) {
            cardView.setRadius(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: l.bt0$h */
    public class C0507h extends Property<View, Integer> {
        public C0507h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getBackground() != null ? view.getBackground().getAlpha() : 0);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            if (view.getBackground() != null) {
                view.getBackground().setAlpha(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: l.bt0$i */
    public class C0508i extends Property<TextView, Integer> {
        public C0508i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(TextView textView) {
            return Integer.valueOf(Color.red(textView.getCurrentTextColor()));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(TextView textView, Integer num) {
            textView.setTextColor(Color.rgb(num.intValue(), num.intValue(), num.intValue()));
        }
    }

    static {
        Class cls = Integer.TYPE;
        f2330g = new C0503d(cls, "viewHeight");
        f2331h = new C0504e(cls, "viewWidth");
        Class cls2 = Float.TYPE;
        f2332i = new C0505f(cls2, "scale");
        f2333j = new C0506g(cls2, "cornerRadius");
        f2334k = new C0507h(cls, "backgroundDrawableAlpha");
        f2335l = new C0508i(cls, "textGreyScale");
    }

    /* JADX INFO: renamed from: a */
    public static Animator m8646a(View view) {
        Object tag = view.getTag(p4c0.f3653a0);
        if (tag instanceof Animator) {
            return (Animator) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Animator m8647b(View view, Animator animator) {
        Object tag = view.getTag(p4c0.f3653a0);
        if (tag != null) {
            ((Animator) tag).cancel();
        }
        view.setTag(p4c0.f3653a0, animator);
        animator.addListener(new C0501b(view));
        animator.start();
        return animator;
    }

    /* JADX INFO: renamed from: c */
    public static void m8648c(View view, long j, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d */
    public static void m8649d(View view, long j, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: e */
    public static void m8650e(View view) {
        Animator animatorM8646a = m8646a(view);
        if (animatorM8646a != null) {
            animatorM8646a.cancel();
            view.setTag(p4c0.f3653a0, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Animator m8651f(Animator animator, Runnable runnable) {
        animator.addListener(m8653h(null, runnable, null));
        return animator;
    }

    /* JADX INFO: renamed from: g */
    public static Animator m8652g(Animator animator, Runnable runnable, Runnable runnable2) {
        animator.addListener(m8653h(null, runnable, runnable2));
        return animator;
    }

    /* JADX INFO: renamed from: h */
    public static Animator.AnimatorListener m8653h(Runnable runnable, Runnable runnable2, Runnable runnable3) {
        return m8654i(runnable, runnable2, runnable3, null);
    }

    /* JADX INFO: renamed from: i */
    public static Animator.AnimatorListener m8654i(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        return new C0500a(runnable, runnable2, runnable3, runnable4);
    }

    /* JADX INFO: renamed from: j */
    public static Animator m8655j(int i) {
        return ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i);
    }

    /* JADX INFO: renamed from: k */
    public static Animator m8656k(Animator animator, Interpolator interpolator, long j, long j2) {
        if (j2 != -1) {
            animator.setDuration(j2);
        }
        if (interpolator != null) {
            animator.setInterpolator(interpolator);
        }
        if (j != 0) {
            animator.setStartDelay(j);
        }
        return animator;
    }

    /* JADX INFO: renamed from: l */
    public static Animator m8657l(View view, Property<View, Float> property, long j, long j2, Interpolator interpolator, float... fArr) {
        return m8656k(ObjectAnimator.ofFloat(view, property, fArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: m */
    public static Animator m8658m(View view, Property<View, Integer> property, long j, long j2, Interpolator interpolator, int... iArr) {
        return m8656k(ObjectAnimator.ofInt(view, property, iArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: n */
    public static Animator m8659n(View view, Property<View, Float> property, float... fArr) {
        return m8657l(view, property, 0L, -1L, null, fArr);
    }

    /* JADX INFO: renamed from: o */
    public static Animator m8660o(View view, Property<View, Integer> property, int... iArr) {
        return m8658m(view, property, 0L, -1L, null, iArr);
    }

    /* JADX INFO: renamed from: p */
    public static Animator m8661p(View view, String str, long j, long j2, Interpolator interpolator, float... fArr) {
        return m8656k(ObjectAnimator.ofFloat(view, str, fArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public static Animator m8662q(View view, String str, float... fArr) {
        return m8661p(view, str, 0L, -1L, null, fArr);
    }

    /* JADX INFO: renamed from: r */
    public static Animator m8663r(Animator animator, Runnable runnable) {
        animator.addListener(m8654i(null, null, null, runnable));
        return animator;
    }

    /* JADX INFO: renamed from: s */
    public static Animator m8664s(Animator... animatorArr) {
        return m8666u(false, null, -1L, animatorArr);
    }

    /* JADX INFO: renamed from: t */
    public static Animator m8665t(boolean z, Interpolator interpolator, long j, Animator.AnimatorListener animatorListener, Animator... animatorArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            animatorSet.playTogether(animatorArr);
        } else {
            animatorSet.playSequentially(animatorArr);
        }
        if (interpolator != null) {
            animatorSet.setInterpolator(interpolator);
        }
        if (j != -1) {
            animatorSet.setDuration(j);
        }
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: u */
    public static Animator m8666u(boolean z, Interpolator interpolator, long j, Animator... animatorArr) {
        return m8665t(z, interpolator, j, null, animatorArr);
    }

    /* JADX INFO: renamed from: v */
    public static Animator m8667v(Animator animator, Runnable runnable) {
        animator.addListener(m8653h(runnable, null, null));
        return animator;
    }

    /* JADX INFO: renamed from: w */
    public static Animator m8668w(Animator animator, Runnable runnable, Runnable runnable2) {
        animator.addListener(new C0502c(runnable, runnable2));
        return animator;
    }

    /* JADX INFO: renamed from: x */
    public static Animator m8669x(long j, Animator... animatorArr) {
        return m8666u(true, null, j, animatorArr);
    }

    /* JADX INFO: renamed from: y */
    public static Animator m8670y(Interpolator interpolator, long j, Animator... animatorArr) {
        return m8666u(true, interpolator, j, animatorArr);
    }

    /* JADX INFO: renamed from: z */
    public static Animator m8671z(Animator... animatorArr) {
        return m8666u(true, null, -1L, animatorArr);
    }

    /* JADX INFO: renamed from: l.bt0$b */
    public class C0501b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f2340a;

        public C0501b(View view) {
            this.f2340a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2340a.setTag(p4c0.f3653a0, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2340a.setTag(p4c0.f3653a0, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.bt0$c */
    public class C0502c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f2341a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f2342b;

        public C0502c(Runnable runnable, Runnable runnable2) {
            this.f2341a = runnable;
            this.f2342b = runnable2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2342b.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2341a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.bt0$j */
    public static class C0509j implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
