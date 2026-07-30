package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class hml0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference<View> f110640a;

    /* JADX INFO: renamed from: l.hml0$a */
    public class C17509a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jml0 f110641a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f110642b;

        public C17509a(jml0 jml0Var, View view) {
            this.f110641a = jml0Var;
            this.f110642b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f110641a.onAnimationCancel(this.f110642b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f110641a.onAnimationEnd(this.f110642b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f110641a.onAnimationStart(this.f110642b);
        }
    }

    public hml0(View view) {
        this.f110640a = new WeakReference<>(view);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public hml0 m135939b(float f) {
        View view = this.f110640a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m135940c() {
        View view = this.f110640a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public long m135941d() {
        View view = this.f110640a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public hml0 m135942e(long j) {
        View view = this.f110640a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public hml0 m135943f(@Nullable Interpolator interpolator) {
        View view = this.f110640a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public hml0 m135944g(@Nullable jml0 jml0Var) {
        View view = this.f110640a.get();
        if (view != null) {
            m135945h(view, jml0Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m135945h(View view, jml0 jml0Var) {
        if (jml0Var != null) {
            view.animate().setListener(new C17509a(jml0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public hml0 m135946i(long j) {
        View view = this.f110640a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public hml0 m135947j(@Nullable final lml0 lml0Var) {
        final View view = this.f110640a.get();
        if (view != null) {
            view.animate().setUpdateListener(lml0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: l.gml0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    lml0Var.mo154876a(view);
                }
            } : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m135948k() {
        View view = this.f110640a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public hml0 m135949l(float f) {
        View view = this.f110640a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
