package p149l;

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
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes8.dex */
public class bt0 {

    /* JADX INFO: renamed from: a */
    public static final Interpolator f77154a = new lig();

    /* JADX INFO: renamed from: b */
    public static final Interpolator f77155b = new jig();

    /* JADX INFO: renamed from: c */
    public static final Interpolator f77156c = new DecelerateInterpolator();

    /* JADX INFO: renamed from: d */
    public static final Interpolator f77157d = new OvershootInterpolator(1.0f);

    /* JADX INFO: renamed from: e */
    public static final Interpolator f77158e = new OvershootInterpolator(3.0f);

    /* JADX INFO: renamed from: f */
    public static final Interpolator f77159f = new AnticipateOvershootInterpolator(1.0f);

    /* JADX INFO: renamed from: g */
    public static final Property<View, Integer> f77160g;

    /* JADX INFO: renamed from: h */
    public static final Property<View, Integer> f77161h;

    /* JADX INFO: renamed from: i */
    public static Property<View, Float> f77162i;

    /* JADX INFO: renamed from: j */
    public static Property<CardView, Float> f77163j;

    /* JADX INFO: renamed from: k */
    public static final Property<View, Integer> f77164k;

    /* JADX INFO: renamed from: l */
    public static Property<TextView, Integer> f77165l;

    /* JADX INFO: renamed from: l.bt0$a */
    public class C15957a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f77166a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f77167b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f77168c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f77169d;

        public C15957a(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
            this.f77166a = runnable;
            this.f77167b = runnable2;
            this.f77168c = runnable3;
            this.f77169d = runnable4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Runnable runnable = this.f77168c;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f77167b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Runnable runnable = this.f77169d;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Runnable runnable = this.f77166a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: l.bt0$d */
    public class C15960d extends Property<View, Integer> {
        public C15960d(Class cls, String str) {
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
    public class C15961e extends Property<View, Integer> {
        public C15961e(Class cls, String str) {
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
    public class C15962f extends Property<View, Float> {
        public C15962f(Class cls, String str) {
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
            if (xdl0.m208355S(f.floatValue())) {
                return;
            }
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: l.bt0$g */
    public class C15963g extends Property<CardView, Float> {
        public C15963g(Class cls, String str) {
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
    public class C15964h extends Property<View, Integer> {
        public C15964h(Class cls, String str) {
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
    public class C15965i extends Property<TextView, Integer> {
        public C15965i(Class cls, String str) {
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
        f77160g = new C15960d(cls, "viewHeight");
        f77161h = new C15961e(cls, "viewWidth");
        Class cls2 = Float.TYPE;
        f77162i = new C15962f(cls2, BigEyeFilter.UNIFORM_SCALE);
        f77163j = new C15963g(cls2, "cornerRadius");
        f77164k = new C15964h(cls, "backgroundDrawableAlpha");
        f77165l = new C15965i(cls, "textGreyScale");
    }

    /* JADX INFO: renamed from: a */
    public static Animator m103728a(View view) {
        Object tag = view.getTag(p4c0.f147105a0);
        if (tag instanceof Animator) {
            return (Animator) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Animator m103729b(View view, Animator animator) {
        Object tag = view.getTag(p4c0.f147105a0);
        if (tag != null) {
            ((Animator) tag).cancel();
        }
        view.setTag(p4c0.f147105a0, animator);
        animator.addListener(new C15958b(view));
        animator.start();
        return animator;
    }

    /* JADX INFO: renamed from: c */
    public static void m103730c(View view, long j, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d */
    public static void m103731d(View view, long j, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: e */
    public static void m103732e(View view) {
        Animator animatorM103728a = m103728a(view);
        if (animatorM103728a != null) {
            animatorM103728a.cancel();
            view.setTag(p4c0.f147105a0, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Animator m103733f(Animator animator, Runnable runnable) {
        animator.addListener(m103735h(null, runnable, null));
        return animator;
    }

    /* JADX INFO: renamed from: g */
    public static Animator m103734g(Animator animator, Runnable runnable, Runnable runnable2) {
        animator.addListener(m103735h(null, runnable, runnable2));
        return animator;
    }

    /* JADX INFO: renamed from: h */
    public static Animator.AnimatorListener m103735h(Runnable runnable, Runnable runnable2, Runnable runnable3) {
        return m103736i(runnable, runnable2, runnable3, null);
    }

    /* JADX INFO: renamed from: i */
    public static Animator.AnimatorListener m103736i(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        return new C15957a(runnable, runnable2, runnable3, runnable4);
    }

    /* JADX INFO: renamed from: j */
    public static Animator m103737j(int i) {
        return ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i);
    }

    /* JADX INFO: renamed from: k */
    public static Animator m103738k(Animator animator, Interpolator interpolator, long j, long j2) {
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
    public static Animator m103739l(View view, Property<View, Float> property, long j, long j2, Interpolator interpolator, float... fArr) {
        return m103738k(ObjectAnimator.ofFloat(view, property, fArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: m */
    public static Animator m103740m(View view, Property<View, Integer> property, long j, long j2, Interpolator interpolator, int... iArr) {
        return m103738k(ObjectAnimator.ofInt(view, property, iArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: n */
    public static Animator m103741n(View view, Property<View, Float> property, float... fArr) {
        return m103739l(view, property, 0L, -1L, null, fArr);
    }

    /* JADX INFO: renamed from: o */
    public static Animator m103742o(View view, Property<View, Integer> property, int... iArr) {
        return m103740m(view, property, 0L, -1L, null, iArr);
    }

    /* JADX INFO: renamed from: p */
    public static Animator m103743p(View view, String str, long j, long j2, Interpolator interpolator, float... fArr) {
        return m103738k(ObjectAnimator.ofFloat(view, str, fArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public static Animator m103744q(View view, String str, float... fArr) {
        return m103743p(view, str, 0L, -1L, null, fArr);
    }

    /* JADX INFO: renamed from: r */
    public static Animator m103745r(Animator animator, Runnable runnable) {
        animator.addListener(m103736i(null, null, null, runnable));
        return animator;
    }

    /* JADX INFO: renamed from: s */
    public static Animator m103746s(Animator... animatorArr) {
        return m103748u(false, null, -1L, animatorArr);
    }

    /* JADX INFO: renamed from: t */
    public static Animator m103747t(boolean z, Interpolator interpolator, long j, Animator.AnimatorListener animatorListener, Animator... animatorArr) {
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
    public static Animator m103748u(boolean z, Interpolator interpolator, long j, Animator... animatorArr) {
        return m103747t(z, interpolator, j, null, animatorArr);
    }

    /* JADX INFO: renamed from: v */
    public static Animator m103749v(Animator animator, Runnable runnable) {
        animator.addListener(m103735h(runnable, null, null));
        return animator;
    }

    /* JADX INFO: renamed from: w */
    public static Animator m103750w(Animator animator, Runnable runnable, Runnable runnable2) {
        animator.addListener(new C15959c(runnable, runnable2));
        return animator;
    }

    /* JADX INFO: renamed from: x */
    public static Animator m103751x(long j, Animator... animatorArr) {
        return m103748u(true, null, j, animatorArr);
    }

    /* JADX INFO: renamed from: y */
    public static Animator m103752y(Interpolator interpolator, long j, Animator... animatorArr) {
        return m103748u(true, interpolator, j, animatorArr);
    }

    /* JADX INFO: renamed from: z */
    public static Animator m103753z(Animator... animatorArr) {
        return m103748u(true, null, -1L, animatorArr);
    }

    /* JADX INFO: renamed from: l.bt0$b */
    public class C15958b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f77170a;

        public C15958b(View view) {
            this.f77170a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f77170a.setTag(p4c0.f147105a0, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f77170a.setTag(p4c0.f147105a0, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.bt0$c */
    public class C15959c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f77171a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f77172b;

        public C15959c(Runnable runnable, Runnable runnable2) {
            this.f77171a = runnable;
            this.f77172b = runnable2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f77172b.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f77171a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.bt0$j */
    public static class C15966j implements Animator.AnimatorListener {
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
