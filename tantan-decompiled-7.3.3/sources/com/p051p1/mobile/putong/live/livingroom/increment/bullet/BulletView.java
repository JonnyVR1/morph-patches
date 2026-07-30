package com.p051p1.mobile.putong.live.livingroom.increment.bullet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.ki3;
import p153l.l51;
import p153l.li3;
import p153l.mdc0;
import p153l.pf2;
import p153l.si3;
import p153l.ti3;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class BulletView extends FrameLayout implements iam<ki3> {

    /* JADX INFO: renamed from: a */
    public BulletView f50290a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f50291b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f50292c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f50293d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f50294e;

    /* JADX INFO: renamed from: f */
    public boolean f50295f;

    /* JADX INFO: renamed from: g */
    public pf2 f50296g;

    /* JADX INFO: renamed from: h */
    public si3 f50297h;

    /* JADX INFO: renamed from: i */
    public x20 f50298i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f50299j;

    /* JADX INFO: renamed from: k */
    public Runnable f50300k;

    /* JADX INFO: renamed from: l */
    public Runnable f50301l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$a */
    public class C12950a extends AnimatorListenerAdapter {
        public C12950a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BulletView.this.f50295f = false;
            BulletView.this.m74559z(false);
            BulletView.this.f50290a.removeAllViews();
            if (BulletView.this.f50298i != null) {
                BulletView.this.f50298i.call();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BulletView.this.f50295f = true;
            BulletView.this.m74559z(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$b */
    public class RunnableC12951b implements Runnable {
        public RunnableC12951b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewFindViewById = BulletView.this.f50290a.findViewById(mdc0.f135911D0);
            TextView textView = (TextView) BulletView.this.f50290a.findViewById(mdc0.f136040R3);
            if (viewFindViewById == null || textView == null || BulletView.this.f50296g == null) {
                return;
            }
            textView.setText(BulletView.this.f50296g.mo114496i());
            bnl0.m105525M0(viewFindViewById, false);
            bnl0.m105525M0(textView, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$c */
    public class RunnableC12952c implements Runnable {
        public RunnableC12952c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BulletView.this.f50296g.mo172082s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$d */
    public class C12953d extends AnimatorListenerAdapter {
        public C12953d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BulletView.this.m74556w(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BulletView.this.m74556w(true);
            l51.m152888H(BulletView.this.getContext(), BulletView.this.f50300k, 1000L);
            l51.m152888H(BulletView.this.getContext(), BulletView.this.f50301l, 0L);
            li3.m154292g(BulletView.this.f50296g);
        }
    }

    public BulletView(@NonNull Context context) {
        super(context);
        this.f50295f = false;
        this.f50297h = new si3();
        this.f50299j = new C12950a();
        this.f50300k = new RunnableC12951b();
        this.f50301l = new RunnableC12952c();
    }

    /* JADX INFO: renamed from: q */
    private void m74549q() {
        float[] fArr = {bnl0.m105592y0(), 0.0f};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<BulletView, Float>) property, fArr);
        this.f50293d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        gt0.m132176v(this.f50293d, new Runnable() { // from class: l.qi3
            @Override // java.lang.Runnable
            public final void run() {
                this.f157795a.m74554u();
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<BulletView, Float>) property, 0.0f, -bnl0.m105592y0());
        this.f50294e = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(500L);
        gt0.m132176v(this.f50294e, new Runnable() { // from class: l.ri3
            @Override // java.lang.Runnable
            public final void run() {
                this.f163333a.m74555v();
            }
        });
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        this.f50292c = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f50296g.mo172078m());
        this.f50292c.addListener(new C12953d());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f50290a.getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        it0.m142007A(this.f50292c);
        AnimatorSet animatorSet = this.f50291b;
        if (animatorSet != null) {
            animatorSet.end();
            this.f50291b.removeAllListeners();
            this.f50291b = null;
        }
        l51.m152890J(this.f50300k);
        l51.m152890J(this.f50301l);
        if (NullChecker.m82486a(this.f50296g)) {
            this.f50296g.m172080p();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m74550m(View view) {
        ti3.m191313a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74550m(this);
        setTranslationZ(1.0f);
    }

    /* JADX INFO: renamed from: p */
    public final AnimatorSet m74552p() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(this.f50293d, this.f50292c, this.f50294e);
        animatorSet.addListener(this.f50299j);
        return animatorSet;
    }

    /* JADX INFO: renamed from: s */
    public boolean m74553s() {
        return this.f50295f;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m74554u() {
        li3.m154291f(this.f50296g);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m74555v() {
        li3.m154287b(this.f50296g);
    }

    /* JADX INFO: renamed from: w */
    public final void m74556w(boolean z) {
        if (findViewById(mdc0.f136341x5) != null) {
            findViewById(mdc0.f136341x5).setClickable(z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m74557x(final pf2 pf2Var, x20 x20Var) {
        this.f50296g = pf2Var;
        this.f50298i = x20Var;
        pf2Var.mo114498r(this.f50290a, this.f50297h);
        if (this.f50290a.findViewById(mdc0.f136341x5) != null) {
            this.f50290a.findViewById(mdc0.f136341x5).setOnClickListener(new View.OnClickListener() { // from class: l.pi3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pf2Var.mo114497o();
                }
            });
        }
        m74558y();
        li3.m154290e(pf2Var);
    }

    /* JADX INFO: renamed from: y */
    public final void m74558y() {
        if (this.f50293d == null) {
            m74549q();
        }
        if (this.f50291b == null || this.f50292c.getDuration() != this.f50296g.mo172078m()) {
            this.f50292c.setDuration(this.f50296g.mo172078m());
            this.f50291b = m74552p();
        }
        this.f50291b.start();
    }

    /* JADX INFO: renamed from: z */
    public final void m74559z(boolean z) {
        bnl0.m105525M0(this, z);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ki3 ki3Var) {
    }

    public BulletView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50295f = false;
        this.f50297h = new si3();
        this.f50299j = new C12950a();
        this.f50300k = new RunnableC12951b();
        this.f50301l = new RunnableC12952c();
    }

    public BulletView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50295f = false;
        this.f50297h = new si3();
        this.f50299j = new C12950a();
        this.f50300k = new RunnableC12951b();
        this.f50301l = new RunnableC12952c();
    }
}
