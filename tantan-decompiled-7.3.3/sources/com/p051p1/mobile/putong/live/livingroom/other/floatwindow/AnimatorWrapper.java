package com.p051p1.mobile.putong.live.livingroom.other.floatwindow;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.Keep;
import p153l.bnl0;
import p153l.z20;

/* JADX INFO: loaded from: classes5.dex */
public class AnimatorWrapper {

    /* JADX INFO: renamed from: a */
    public final int f52004a;

    /* JADX INFO: renamed from: b */
    public float f52005b;

    /* JADX INFO: renamed from: c */
    public float f52006c;

    /* JADX INFO: renamed from: d */
    public float f52007d;

    /* JADX INFO: renamed from: e */
    public float f52008e;

    /* JADX INFO: renamed from: f */
    public MoveDirection f52009f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f52010g;

    /* JADX INFO: renamed from: h */
    public z20<Integer, Integer> f52011h;

    /* JADX INFO: renamed from: i */
    public View f52012i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.AnimatorWrapper$a */
    public static /* synthetic */ class C13045a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52013a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f52013a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52013a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52013a[MoveDirection.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AnimatorWrapper(z20<Integer, Integer> z20Var, View view, int i) {
        this.f52011h = z20Var;
        this.f52004a = i;
        this.f52012i = view;
    }

    /* JADX INFO: renamed from: a */
    public void m76617a(MoveDirection moveDirection, float f, float f2, float f3, float f4) {
        this.f52009f = moveDirection;
        this.f52005b = f3;
        this.f52006c = f4;
        this.f52007d = f;
        this.f52008e = f2;
        float fMax = (Math.max(Math.abs(f3 - f), Math.abs(f4 - f2)) / bnl0.m105592y0()) * this.f52004a;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52010g = animatorSet;
        animatorSet.setDuration((long) fMax);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", 0.0f, 1.0f);
        if (Math.abs(1.0f - this.f52012i.getAlpha()) > 1.0E-5d) {
            View view = this.f52012i;
            this.f52010g.play(objectAnimatorOfFloat).with(ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f));
        } else {
            this.f52010g.play(objectAnimatorOfFloat);
        }
        this.f52010g.start();
    }

    /* JADX INFO: renamed from: b */
    public void m76618b() {
        AnimatorSet animatorSet = this.f52010g;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f52010g.cancel();
    }

    @Keep
    public void setProgress(float f) {
        float f2;
        float f3;
        if (this.f52011h == null) {
            return;
        }
        int i = C13045a.f52013a[this.f52009f.ordinal()];
        if (i == 1) {
            f2 = (this.f52007d - this.f52005b) * (1.0f - f);
            f3 = this.f52008e;
        } else if (i != 2) {
            f2 = this.f52007d;
            if (i != 3) {
                float f4 = this.f52008e;
                f3 = f4 + ((this.f52006c - f4) * f);
            } else {
                float f5 = this.f52006c;
                f3 = f5 + ((this.f52008e - f5) * (1.0f - f));
            }
        } else {
            float f6 = this.f52007d;
            f2 = ((this.f52005b - f6) * f) + f6;
            f3 = this.f52008e;
        }
        this.f52011h.call(Integer.valueOf((int) f2), Integer.valueOf((int) f3));
    }
}
