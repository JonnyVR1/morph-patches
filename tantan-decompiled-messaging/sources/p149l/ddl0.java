package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ddl0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference<View> f85605a;

    /* JADX INFO: renamed from: l.ddl0$a */
    public class C16337a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fdl0 f85606a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f85607b;

        public C16337a(fdl0 fdl0Var, View view) {
            this.f85606a = fdl0Var;
            this.f85607b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f85606a.onAnimationCancel(this.f85607b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f85606a.onAnimationEnd(this.f85607b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f85606a.onAnimationStart(this.f85607b);
        }
    }

    public ddl0(View view) {
        this.f85605a = new WeakReference<>(view);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public ddl0 m111030b(float f) {
        View view = this.f85605a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m111031c() {
        View view = this.f85605a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public long m111032d() {
        View view = this.f85605a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public ddl0 m111033e(long j) {
        View view = this.f85605a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public ddl0 m111034f(@Nullable Interpolator interpolator) {
        View view = this.f85605a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public ddl0 m111035g(@Nullable fdl0 fdl0Var) {
        View view = this.f85605a.get();
        if (view != null) {
            m111036h(view, fdl0Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m111036h(View view, fdl0 fdl0Var) {
        if (fdl0Var != null) {
            view.animate().setListener(new C16337a(fdl0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public ddl0 m111037i(long j) {
        View view = this.f85605a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public ddl0 m111038j(@Nullable final hdl0 hdl0Var) {
        final View view = this.f85605a.get();
        if (view != null) {
            view.animate().setUpdateListener(hdl0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: l.cdl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    hdl0Var.mo130594a(view);
                }
            } : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m111039k() {
        View view = this.f85605a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public ddl0 m111040l(float f) {
        View view = this.f85605a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
