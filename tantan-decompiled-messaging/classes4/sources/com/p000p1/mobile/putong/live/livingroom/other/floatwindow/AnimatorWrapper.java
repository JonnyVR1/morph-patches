package com.p000p1.mobile.putong.live.livingroom.other.floatwindow;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.Keep;
import l.f30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AnimatorWrapper {

    /* JADX INFO: renamed from: a */
    public final int f7198a;

    /* JADX INFO: renamed from: b */
    public float f7199b;

    /* JADX INFO: renamed from: c */
    public float f7200c;

    /* JADX INFO: renamed from: d */
    public float f7201d;

    /* JADX INFO: renamed from: e */
    public float f7202e;

    /* JADX INFO: renamed from: f */
    public MoveDirection f7203f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f7204g;

    /* JADX INFO: renamed from: h */
    public f30<Integer, Integer> f7205h;

    /* JADX INFO: renamed from: i */
    public View f7206i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.AnimatorWrapper$a */
    public static /* synthetic */ class C0471a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7207a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f7207a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7207a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7207a[MoveDirection.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AnimatorWrapper(f30<Integer, Integer> f30Var, View view, int i) {
        this.f7205h = f30Var;
        this.f7198a = i;
        this.f7206i = view;
    }

    /* JADX INFO: renamed from: a */
    public void m9067a(MoveDirection moveDirection, float f, float f2, float f3, float f4) {
        this.f7203f = moveDirection;
        this.f7199b = f3;
        this.f7200c = f4;
        this.f7201d = f;
        this.f7202e = f2;
        float fMax = (Math.max(Math.abs(f3 - f), Math.abs(f4 - f2)) / xdl0.y0()) * this.f7198a;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7204g = animatorSet;
        animatorSet.setDuration((long) fMax);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", 0.0f, 1.0f);
        if (Math.abs(1.0f - this.f7206i.getAlpha()) > 1.0E-5d) {
            View view = this.f7206i;
            this.f7204g.play(objectAnimatorOfFloat).with(ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f));
        } else {
            this.f7204g.play(objectAnimatorOfFloat);
        }
        this.f7204g.start();
    }

    /* JADX INFO: renamed from: b */
    public void m9068b() {
        AnimatorSet animatorSet = this.f7204g;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f7204g.cancel();
    }

    @Keep
    public void setProgress(float f) {
        float f2;
        float f3;
        if (this.f7205h == null) {
            return;
        }
        int i = C0471a.f7207a[this.f7203f.ordinal()];
        if (i == 1) {
            f2 = (this.f7201d - this.f7199b) * (1.0f - f);
            f3 = this.f7202e;
        } else if (i != 2) {
            f2 = this.f7201d;
            if (i != 3) {
                float f4 = this.f7202e;
                f3 = f4 + ((this.f7200c - f4) * f);
            } else {
                float f5 = this.f7200c;
                f3 = f5 + ((this.f7202e - f5) * (1.0f - f));
            }
        } else {
            float f6 = this.f7201d;
            f2 = ((this.f7199b - f6) * f) + f6;
            f3 = this.f7202e;
        }
        this.f7205h.call(Integer.valueOf((int) f2), Integer.valueOf((int) f3));
    }
}
