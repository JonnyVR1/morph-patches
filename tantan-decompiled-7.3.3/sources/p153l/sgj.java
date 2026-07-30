package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class sgj {

    /* JADX INFO: renamed from: a */
    public View f167879a;

    /* JADX INFO: renamed from: b */
    public Animator f167880b;

    public sgj(View view) {
        this.f167879a = view;
        m185782b();
    }

    /* JADX INFO: renamed from: a */
    public void m185781a() {
        this.f167880b.cancel();
    }

    /* JADX INFO: renamed from: b */
    public void m185782b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f167879a, "scaleX", 1.0f, 0.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f167879a, "scaleY", 1.0f, 0.5f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        this.f167880b = gt0.m132180z(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: c */
    public void m185783c() {
        this.f167880b.start();
    }
}
