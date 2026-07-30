package p153l;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class efg0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bgg0 f93785a;

    public efg0(bgg0 bgg0Var) {
        this.f93785a = bgg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f93785a.m104164c(0, true, ((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
    }
}
