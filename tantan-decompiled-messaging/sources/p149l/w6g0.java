package p149l;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class w6g0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t7g0 f184842a;

    public w6g0(t7g0 t7g0Var) {
        this.f184842a = t7g0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f184842a.m187458c(0, true, ((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
    }
}
