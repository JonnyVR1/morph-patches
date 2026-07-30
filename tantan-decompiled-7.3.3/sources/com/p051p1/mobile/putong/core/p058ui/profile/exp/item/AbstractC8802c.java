package com.p051p1.mobile.putong.core.p058ui.profile.exp.item;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import p153l.bnl0;
import p153l.c9c0;
import p153l.fwk;
import p153l.ner;
import p153l.qa00;
import p153l.t3m;
import p153l.zvk;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8802c extends AbstractC8800a {

    /* JADX INFO: renamed from: p */
    public View f34109p;

    /* JADX INFO: renamed from: q */
    public String f34110q;

    /* JADX INFO: renamed from: r */
    public boolean f34111r;

    /* JADX INFO: renamed from: s */
    public int f34112s;

    /* JADX INFO: renamed from: t */
    public int f34113t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.c$a */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Drawable f34114a;

        public a(Drawable drawable) {
            this.f34114a = drawable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f34114a != null) {
                AbstractC8802c.this.f34109p.setBackground(this.f34114a);
                AbstractC8802c.this.f34109p.getBackground().setAlpha(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            AbstractC8802c.this.f34109p.setBackgroundColor(AbstractC8802c.this.f34109p.getResources().getColor(c9c0.f80318A));
            AbstractC8802c.this.f34109p.getBackground().setAlpha(0);
        }
    }

    public AbstractC8802c(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f34112s = 0;
        this.f34113t = 0;
    }

    /* JADX INFO: renamed from: J */
    public void m52402J() {
        if (this.f34110q != null) {
            fwk.m127777h().m127779g(this.f34110q);
        }
    }

    /* JADX INFO: renamed from: K */
    public String m52403K(View view) {
        return view instanceof ExpEditItemView ? ((ExpEditItemView) view).getBlankTip() : mo52344m();
    }

    /* JADX INFO: renamed from: L */
    public boolean m52404L() {
        return this.f34111r;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m52405M(ValueAnimator valueAnimator) {
        this.f34109p.getBackground().setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m52406N(String str) {
        this.f34110q = "";
    }

    /* JADX INFO: renamed from: O */
    public boolean m52407O() {
        if (this.f34109p == null) {
            this.f34109p = this.f34089g;
        }
        View view = this.f34109p;
        if (view == null) {
            return false;
        }
        Drawable background = view.getBackground();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.3f, 0.0f, 0.3f, 0.0f, 0.3f, 0.0f, 0.3f, 0.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rgf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f163010a.m52405M(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a(background));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m52408P(int i, int i2, String str, String str2) {
        if (i2 <= 0) {
            this.f34111r = false;
        } else {
            this.f34111r = i < i2;
        }
        m52328B(new ExpProfileIntegrityOptView.C8799a(i, i2, str, str2));
    }

    /* JADX INFO: renamed from: Q */
    public void m52409Q(ExpEditItemView expEditItemView, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f34112s++;
            expEditItemView.m52011c(str, 2);
            return;
        }
        if (this.f34109p == null && bnl0.m105529O0(expEditItemView)) {
            this.f34109p = expEditItemView;
            this.f34113t = this.f34112s;
        }
        expEditItemView.m52011c("添加", 1);
    }

    /* JADX INFO: renamed from: R */
    public void m52410R(boolean z) {
        if (!z) {
            if (this.f34110q != null) {
                fwk.m127777h().m127779g(this.f34110q);
                return;
            }
            return;
        }
        View view = this.f34109p;
        if (view == null) {
            return;
        }
        String strM52403K = m52403K(view);
        if (TextUtils.isEmpty(strM52403K)) {
            return;
        }
        zvk zvkVarM221766k = new zvk(m52355x().getContext()).m221776u("填写" + strM52403K + ", 提升资料完整度").m221760e(m52355x().getContext().getResources().getColor(c9c0.f80318A)).m221766k(true);
        int i = qa00.f156322i;
        this.f34110q = fwk.m127777h().m127791t(zvkVarM221766k.m221771p(i).m221775t(13).m221777v(false).m221774s(i, i, i, i).m221764i(zvk.f206227D).m221759d(new zvk.InterfaceC21906b() { // from class: l.qgf
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str) {
                this.f157405a.m52406N(str);
            }
        }).m221756a(3000L), this.f34109p);
    }
}
