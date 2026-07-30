package p002l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import l.bt0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ydj {

    /* JADX INFO: renamed from: a */
    public View f22812a;

    /* JADX INFO: renamed from: b */
    public Animator f22813b;

    public ydj(View view) {
        this.f22812a = view;
        m26655b();
    }

    /* JADX INFO: renamed from: a */
    public void m26654a() {
        this.f22813b.cancel();
    }

    /* JADX INFO: renamed from: b */
    public void m26655b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f22812a, "scaleX", 1.0f, 0.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f22812a, "scaleY", 1.0f, 0.5f, 1.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        this.f22813b = bt0.z(new Animator[]{objectAnimatorOfFloat, objectAnimatorOfFloat2});
    }

    /* JADX INFO: renamed from: c */
    public void m26656c() {
        this.f22813b.start();
    }
}
