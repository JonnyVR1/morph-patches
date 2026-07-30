package com.p046p1.mobile.putong.core.p053ui.profile.exp.item;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import p149l.a1m;
import p149l.jtk;
import p149l.mcr;
import p149l.ptk;
import p149l.t100;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8639c extends AbstractC8637a {

    /* JADX INFO: renamed from: p */
    public View f33261p;

    /* JADX INFO: renamed from: q */
    public String f33262q;

    /* JADX INFO: renamed from: r */
    public boolean f33263r;

    /* JADX INFO: renamed from: s */
    public int f33264s;

    /* JADX INFO: renamed from: t */
    public int f33265t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.c$a */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Drawable f33266a;

        public a(Drawable drawable) {
            this.f33266a = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f33266a != null) {
                AbstractC8639c.this.f33261p.setBackground(this.f33266a);
                AbstractC8639c.this.f33261p.getBackground().setAlpha(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            AbstractC8639c.this.f33261p.setBackgroundColor(AbstractC8639c.this.f33261p.getResources().getColor(w0c0.f183749A));
            AbstractC8639c.this.f33261p.getBackground().setAlpha(0);
        }
    }

    public AbstractC8639c(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f33264s = 0;
        this.f33265t = 0;
    }

    /* JADX INFO: renamed from: J */
    public void m51219J() {
        if (this.f33262q != null) {
            ptk.m171332h().m171334g(this.f33262q);
        }
    }

    /* JADX INFO: renamed from: K */
    public String m51220K(View view) {
        return view instanceof ExpEditItemView ? ((ExpEditItemView) view).getBlankTip() : mo51161m();
    }

    /* JADX INFO: renamed from: L */
    public boolean m51221L() {
        return this.f33263r;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m51222M(ValueAnimator valueAnimator) {
        this.f33261p.getBackground().setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m51223N(String str) {
        this.f33262q = "";
    }

    /* JADX INFO: renamed from: O */
    public boolean m51224O() {
        if (this.f33261p == null) {
            this.f33261p = this.f33241g;
        }
        View view = this.f33261p;
        if (view == null) {
            return false;
        }
        Drawable background = view.getBackground();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.3f, 0.0f, 0.3f, 0.0f, 0.3f, 0.0f, 0.3f, 0.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lff
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f127870a.m51222M(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a(background));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m51225P(int i, int i2, String str, String str2) {
        if (i2 <= 0) {
            this.f33263r = false;
        } else {
            this.f33263r = i < i2;
        }
        m51145B(new ExpProfileIntegrityOptView.C8636a(i, i2, str, str2));
    }

    /* JADX INFO: renamed from: Q */
    public void m51226Q(ExpEditItemView expEditItemView, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33264s++;
            expEditItemView.m50828c(str, 2);
            return;
        }
        if (this.f33261p == null && xdl0.m208349O0(expEditItemView)) {
            this.f33261p = expEditItemView;
            this.f33265t = this.f33264s;
        }
        expEditItemView.m50828c("添加", 1);
    }

    /* JADX INFO: renamed from: R */
    public void m51227R(boolean z) {
        if (!z) {
            if (this.f33262q != null) {
                ptk.m171332h().m171334g(this.f33262q);
                return;
            }
            return;
        }
        View view = this.f33261p;
        if (view == null) {
            return;
        }
        String strM51220K = m51220K(view);
        if (TextUtils.isEmpty(strM51220K)) {
            return;
        }
        jtk jtkVarM143119k = new jtk(m51172x().getContext()).m143129u("填写" + strM51220K + ", 提升资料完整度").m143113e(m51172x().getContext().getResources().getColor(w0c0.f183749A)).m143119k(true);
        int i = t100.f167260i;
        this.f33262q = ptk.m171332h().m171346t(jtkVarM143119k.m143124p(i).m143128t(13).m143130v(false).m143127s(i, i, i, i).m143117i(jtk.f119617D).m143112d(new jtk.InterfaceC17857b() { // from class: l.kff
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str) {
                this.f122922a.m51223N(str);
            }
        }).m143109a(3000L), this.f33261p);
    }
}
