package p153l;

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
public class gt0 {

    /* JADX INFO: renamed from: a */
    public static final Interpolator f106346a = new zjg();

    /* JADX INFO: renamed from: b */
    public static final Interpolator f106347b = new xjg();

    /* JADX INFO: renamed from: c */
    public static final Interpolator f106348c = new DecelerateInterpolator();

    /* JADX INFO: renamed from: d */
    public static final Interpolator f106349d = new OvershootInterpolator(1.0f);

    /* JADX INFO: renamed from: e */
    public static final Interpolator f106350e = new OvershootInterpolator(3.0f);

    /* JADX INFO: renamed from: f */
    public static final Interpolator f106351f = new AnticipateOvershootInterpolator(1.0f);

    /* JADX INFO: renamed from: g */
    public static final Property<View, Integer> f106352g;

    /* JADX INFO: renamed from: h */
    public static final Property<View, Integer> f106353h;

    /* JADX INFO: renamed from: i */
    public static Property<View, Float> f106354i;

    /* JADX INFO: renamed from: j */
    public static Property<CardView, Float> f106355j;

    /* JADX INFO: renamed from: k */
    public static final Property<View, Integer> f106356k;

    /* JADX INFO: renamed from: l */
    public static Property<TextView, Integer> f106357l;

    /* JADX INFO: renamed from: l.gt0$a */
    public class C17299a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f106358a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f106359b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f106360c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f106361d;

        public C17299a(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
            this.f106358a = runnable;
            this.f106359b = runnable2;
            this.f106360c = runnable3;
            this.f106361d = runnable4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Runnable runnable = this.f106360c;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f106359b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Runnable runnable = this.f106361d;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Runnable runnable = this.f106358a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: l.gt0$d */
    public class C17302d extends Property<View, Integer> {
        public C17302d(Class cls, String str) {
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

    /* JADX INFO: renamed from: l.gt0$e */
    public class C17303e extends Property<View, Integer> {
        public C17303e(Class cls, String str) {
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

    /* JADX INFO: renamed from: l.gt0$f */
    public class C17304f extends Property<View, Float> {
        public C17304f(Class cls, String str) {
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
            if (bnl0.m105535S(f.floatValue())) {
                return;
            }
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: l.gt0$g */
    public class C17305g extends Property<CardView, Float> {
        public C17305g(Class cls, String str) {
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

    /* JADX INFO: renamed from: l.gt0$h */
    public class C17306h extends Property<View, Integer> {
        public C17306h(Class cls, String str) {
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

    /* JADX INFO: renamed from: l.gt0$i */
    public class C17307i extends Property<TextView, Integer> {
        public C17307i(Class cls, String str) {
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
        f106352g = new C17302d(cls, "viewHeight");
        f106353h = new C17303e(cls, "viewWidth");
        Class cls2 = Float.TYPE;
        f106354i = new C17304f(cls2, BigEyeFilter.UNIFORM_SCALE);
        f106355j = new C17305g(cls2, "cornerRadius");
        f106356k = new C17306h(cls, "backgroundDrawableAlpha");
        f106357l = new C17307i(cls, "textGreyScale");
    }

    /* JADX INFO: renamed from: a */
    public static Animator m132155a(View view) {
        Object tag = view.getTag(vcc0.f183405a0);
        if (tag instanceof Animator) {
            return (Animator) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Animator m132156b(View view, Animator animator) {
        Object tag = view.getTag(vcc0.f183405a0);
        if (tag != null) {
            ((Animator) tag).cancel();
        }
        view.setTag(vcc0.f183405a0, animator);
        animator.addListener(new C17300b(view));
        animator.start();
        return animator;
    }

    /* JADX INFO: renamed from: c */
    public static void m132157c(View view, long j, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d */
    public static void m132158d(View view, long j, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: e */
    public static void m132159e(View view) {
        Animator animatorM132155a = m132155a(view);
        if (animatorM132155a != null) {
            animatorM132155a.cancel();
            view.setTag(vcc0.f183405a0, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Animator m132160f(Animator animator, Runnable runnable) {
        animator.addListener(m132162h(null, runnable, null));
        return animator;
    }

    /* JADX INFO: renamed from: g */
    public static Animator m132161g(Animator animator, Runnable runnable, Runnable runnable2) {
        animator.addListener(m132162h(null, runnable, runnable2));
        return animator;
    }

    /* JADX INFO: renamed from: h */
    public static Animator.AnimatorListener m132162h(Runnable runnable, Runnable runnable2, Runnable runnable3) {
        return m132163i(runnable, runnable2, runnable3, null);
    }

    /* JADX INFO: renamed from: i */
    public static Animator.AnimatorListener m132163i(Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        return new C17299a(runnable, runnable2, runnable3, runnable4);
    }

    /* JADX INFO: renamed from: j */
    public static Animator m132164j(int i) {
        return ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i);
    }

    /* JADX INFO: renamed from: k */
    public static Animator m132165k(Animator animator, Interpolator interpolator, long j, long j2) {
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
    public static Animator m132166l(View view, Property<View, Float> property, long j, long j2, Interpolator interpolator, float... fArr) {
        return m132165k(ObjectAnimator.ofFloat(view, property, fArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: m */
    public static Animator m132167m(View view, Property<View, Integer> property, long j, long j2, Interpolator interpolator, int... iArr) {
        return m132165k(ObjectAnimator.ofInt(view, property, iArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: n */
    public static Animator m132168n(View view, Property<View, Float> property, float... fArr) {
        return m132166l(view, property, 0L, -1L, null, fArr);
    }

    /* JADX INFO: renamed from: o */
    public static Animator m132169o(View view, Property<View, Integer> property, int... iArr) {
        return m132167m(view, property, 0L, -1L, null, iArr);
    }

    /* JADX INFO: renamed from: p */
    public static Animator m132170p(View view, String str, long j, long j2, Interpolator interpolator, float... fArr) {
        return m132165k(ObjectAnimator.ofFloat(view, str, fArr), interpolator, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public static Animator m132171q(View view, String str, float... fArr) {
        return m132170p(view, str, 0L, -1L, null, fArr);
    }

    /* JADX INFO: renamed from: r */
    public static Animator m132172r(Animator animator, Runnable runnable) {
        animator.addListener(m132163i(null, null, null, runnable));
        return animator;
    }

    /* JADX INFO: renamed from: s */
    public static Animator m132173s(Animator... animatorArr) {
        return m132175u(false, null, -1L, animatorArr);
    }

    /* JADX INFO: renamed from: t */
    public static Animator m132174t(boolean z, Interpolator interpolator, long j, Animator.AnimatorListener animatorListener, Animator... animatorArr) {
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
    public static Animator m132175u(boolean z, Interpolator interpolator, long j, Animator... animatorArr) {
        return m132174t(z, interpolator, j, null, animatorArr);
    }

    /* JADX INFO: renamed from: v */
    public static Animator m132176v(Animator animator, Runnable runnable) {
        animator.addListener(m132162h(runnable, null, null));
        return animator;
    }

    /* JADX INFO: renamed from: w */
    public static Animator m132177w(Animator animator, Runnable runnable, Runnable runnable2) {
        animator.addListener(new C17301c(runnable, runnable2));
        return animator;
    }

    /* JADX INFO: renamed from: x */
    public static Animator m132178x(long j, Animator... animatorArr) {
        return m132175u(true, null, j, animatorArr);
    }

    /* JADX INFO: renamed from: y */
    public static Animator m132179y(Interpolator interpolator, long j, Animator... animatorArr) {
        return m132175u(true, interpolator, j, animatorArr);
    }

    /* JADX INFO: renamed from: z */
    public static Animator m132180z(Animator... animatorArr) {
        return m132175u(true, null, -1L, animatorArr);
    }

    /* JADX INFO: renamed from: l.gt0$b */
    public class C17300b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f106362a;

        public C17300b(View view) {
            this.f106362a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f106362a.setTag(vcc0.f183405a0, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f106362a.setTag(vcc0.f183405a0, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.gt0$c */
    public class C17301c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f106363a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f106364b;

        public C17301c(Runnable runnable, Runnable runnable2) {
            this.f106363a = runnable;
            this.f106364b = runnable2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f106364b.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f106363a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.gt0$j */
    public static class C17308j implements Animator.AnimatorListener {
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
