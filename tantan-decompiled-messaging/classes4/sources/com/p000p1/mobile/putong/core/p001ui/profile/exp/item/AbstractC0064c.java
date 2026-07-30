package com.p000p1.mobile.putong.core.p001ui.profile.exp.item;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import l.jtk;
import l.mcr;
import l.ptk;
import l.t100;
import l.w0c0;
import l.xdl0;
import p002l.a1m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0064c extends AbstractC0062a {

    /* JADX INFO: renamed from: p */
    public View f1083p;

    /* JADX INFO: renamed from: q */
    public String f1084q;

    /* JADX INFO: renamed from: r */
    public boolean f1085r;

    /* JADX INFO: renamed from: s */
    public int f1086s;

    /* JADX INFO: renamed from: t */
    public int f1087t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.c$a */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Drawable f1088a;

        public a(Drawable drawable) {
            this.f1088a = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f1088a != null) {
                AbstractC0064c.this.f1083p.setBackground(this.f1088a);
                AbstractC0064c.this.f1083p.getBackground().setAlpha(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            AbstractC0064c.this.f1083p.setBackgroundColor(AbstractC0064c.this.f1083p.getResources().getColor(w0c0.A));
            AbstractC0064c.this.f1083p.getBackground().setAlpha(0);
        }
    }

    public AbstractC0064c(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f1086s = 0;
        this.f1087t = 0;
    }

    /* JADX INFO: renamed from: J */
    public void m1674J() {
        if (this.f1084q != null) {
            ptk.h().g(this.f1084q);
        }
    }

    /* JADX INFO: renamed from: K */
    public String m1675K(View view) {
        return view instanceof ExpEditItemView ? ((ExpEditItemView) view).getBlankTip() : mo1613m();
    }

    /* JADX INFO: renamed from: L */
    public boolean m1676L() {
        return this.f1085r;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m1677M(ValueAnimator valueAnimator) {
        this.f1083p.getBackground().setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m1678N(String str) {
        this.f1084q = "";
    }

    /* JADX INFO: renamed from: O */
    public boolean m1679O() {
        if (this.f1083p == null) {
            this.f1083p = this.f1063g;
        }
        View view = this.f1083p;
        if (view == null) {
            return false;
        }
        Drawable background = view.getBackground();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.3f, 0.0f, 0.3f, 0.0f, 0.3f, 0.0f, 0.3f, 0.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lff
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14839a.m1677M(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a(background));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m1680P(int i, int i2, String str, String str2) {
        if (i2 <= 0) {
            this.f1085r = false;
        } else {
            this.f1085r = i < i2;
        }
        m1597B(new ExpProfileIntegrityOptView.C0061a(i, i2, str, str2));
    }

    /* JADX INFO: renamed from: Q */
    public void m1681Q(ExpEditItemView expEditItemView, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1086s++;
            expEditItemView.m1274c(str, 2);
            return;
        }
        if (this.f1083p == null && xdl0.O0(expEditItemView)) {
            this.f1083p = expEditItemView;
            this.f1087t = this.f1086s;
        }
        expEditItemView.m1274c("添加", 1);
    }

    /* JADX INFO: renamed from: R */
    public void m1682R(boolean z) {
        if (!z) {
            if (this.f1084q != null) {
                ptk.h().g(this.f1084q);
                return;
            }
            return;
        }
        View view = this.f1083p;
        if (view == null) {
            return;
        }
        String strM1675K = m1675K(view);
        if (TextUtils.isEmpty(strM1675K)) {
            return;
        }
        jtk jtkVarK = new jtk(m1624x().getContext()).u("填写" + strM1675K + ", 提升资料完整度").e(new int[]{m1624x().getContext().getResources().getColor(w0c0.A)}).k(true);
        int i = t100.i;
        this.f1084q = ptk.h().t(jtkVarK.p(i).t(13).v(false).s(i, i, i, i).i(jtk.D).d(new jtk.b() { // from class: l.kff
            /* JADX INFO: renamed from: a */
            public final void m16608a(String str) {
                this.f14311a.m1678N(str);
            }
        }).a(3000L), this.f1083p);
    }
}
