package com.p046p1.mobile.putong.live.livingroom.other.floatwindow;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.Keep;
import p149l.f30;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class AnimatorWrapper {

    /* JADX INFO: renamed from: a */
    public final int f51156a;

    /* JADX INFO: renamed from: b */
    public float f51157b;

    /* JADX INFO: renamed from: c */
    public float f51158c;

    /* JADX INFO: renamed from: d */
    public float f51159d;

    /* JADX INFO: renamed from: e */
    public float f51160e;

    /* JADX INFO: renamed from: f */
    public MoveDirection f51161f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f51162g;

    /* JADX INFO: renamed from: h */
    public f30<Integer, Integer> f51163h;

    /* JADX INFO: renamed from: i */
    public View f51164i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.AnimatorWrapper$a */
    public static /* synthetic */ class C12882a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51165a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f51165a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51165a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51165a[MoveDirection.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AnimatorWrapper(f30<Integer, Integer> f30Var, View view, int i) {
        this.f51163h = f30Var;
        this.f51156a = i;
        this.f51164i = view;
    }

    /* JADX INFO: renamed from: a */
    public void m75434a(MoveDirection moveDirection, float f, float f2, float f3, float f4) {
        this.f51161f = moveDirection;
        this.f51157b = f3;
        this.f51158c = f4;
        this.f51159d = f;
        this.f51160e = f2;
        float fMax = (Math.max(Math.abs(f3 - f), Math.abs(f4 - f2)) / xdl0.m208412y0()) * this.f51156a;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f51162g = animatorSet;
        animatorSet.setDuration((long) fMax);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", 0.0f, 1.0f);
        if (Math.abs(1.0f - this.f51164i.getAlpha()) > 1.0E-5d) {
            View view = this.f51164i;
            this.f51162g.play(objectAnimatorOfFloat).with(ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f));
        } else {
            this.f51162g.play(objectAnimatorOfFloat);
        }
        this.f51162g.start();
    }

    /* JADX INFO: renamed from: b */
    public void m75435b() {
        AnimatorSet animatorSet = this.f51162g;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f51162g.cancel();
    }

    @Keep
    public void setProgress(float f) {
        float f2;
        float f3;
        if (this.f51163h == null) {
            return;
        }
        int i = C12882a.f51165a[this.f51161f.ordinal()];
        if (i == 1) {
            f2 = (this.f51159d - this.f51157b) * (1.0f - f);
            f3 = this.f51160e;
        } else if (i != 2) {
            f2 = this.f51159d;
            if (i != 3) {
                float f4 = this.f51160e;
                f3 = f4 + ((this.f51158c - f4) * f);
            } else {
                float f5 = this.f51158c;
                f3 = f5 + ((this.f51160e - f5) * (1.0f - f));
            }
        } else {
            float f6 = this.f51159d;
            f2 = ((this.f51157b - f6) * f) + f6;
            f3 = this.f51160e;
        }
        this.f51163h.call(Integer.valueOf((int) f2), Integer.valueOf((int) f3));
    }
}
