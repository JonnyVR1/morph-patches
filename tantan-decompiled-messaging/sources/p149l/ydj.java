package p149l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class ydj {

    /* JADX INFO: renamed from: a */
    public View f197571a;

    /* JADX INFO: renamed from: b */
    public Animator f197572b;

    public ydj(View view) {
        this.f197571a = view;
        m214282b();
    }

    /* JADX INFO: renamed from: a */
    public void m214281a() {
        this.f197572b.cancel();
    }

    /* JADX INFO: renamed from: b */
    public void m214282b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f197571a, "scaleX", 1.0f, 0.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f197571a, "scaleY", 1.0f, 0.5f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        this.f197572b = bt0.m103753z(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: c */
    public void m214283c() {
        this.f197572b.start();
    }
}
