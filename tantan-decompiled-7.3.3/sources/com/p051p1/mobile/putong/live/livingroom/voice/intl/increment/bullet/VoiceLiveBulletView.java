package com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

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
import p153l.bnl0;
import p153l.evn0;
import p153l.fvn0;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.iun0;
import p153l.l51;
import p153l.mdc0;
import p153l.x20;
import p153l.yun0;
import p153l.zun0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveBulletView extends FrameLayout implements iam<yun0> {

    /* JADX INFO: renamed from: a */
    public VoiceLiveBulletView f54045a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f54046b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f54047c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f54048d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f54049e;

    /* JADX INFO: renamed from: f */
    public boolean f54050f;

    /* JADX INFO: renamed from: g */
    public iun0 f54051g;

    /* JADX INFO: renamed from: h */
    public evn0 f54052h;

    /* JADX INFO: renamed from: i */
    public x20 f54053i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f54054j;

    /* JADX INFO: renamed from: k */
    public Runnable f54055k;

    /* JADX INFO: renamed from: l */
    public Runnable f54056l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$a */
    public class C13188a extends AnimatorListenerAdapter {
        public C13188a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceLiveBulletView.this.f54050f = false;
            VoiceLiveBulletView.this.m79386x(false);
            VoiceLiveBulletView.this.f54045a.removeAllViews();
            if (VoiceLiveBulletView.this.f54053i != null) {
                VoiceLiveBulletView.this.f54053i.call();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VoiceLiveBulletView.this.f54050f = true;
            VoiceLiveBulletView.this.m79386x(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$b */
    public class RunnableC13189b implements Runnable {
        public RunnableC13189b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewFindViewById = VoiceLiveBulletView.this.f54045a.findViewById(mdc0.f135911D0);
            TextView textView = (TextView) VoiceLiveBulletView.this.f54045a.findViewById(mdc0.f136040R3);
            if (viewFindViewById == null || textView == null || VoiceLiveBulletView.this.f54051g == null) {
                return;
            }
            textView.setText(VoiceLiveBulletView.this.f54051g.mo133662f());
            bnl0.m105525M0(viewFindViewById, false);
            bnl0.m105525M0(textView, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$c */
    public class RunnableC13190c implements Runnable {
        public RunnableC13190c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoiceLiveBulletView.this.f54051g.mo133666l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$d */
    public class C13191d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ iun0 f54060a;

        public C13191d(iun0 iun0Var) {
            this.f54060a = iun0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceLiveBulletView.this.m79384u(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VoiceLiveBulletView.this.m79384u(true);
            l51.m152888H(VoiceLiveBulletView.this.getContext(), VoiceLiveBulletView.this.f54055k, 1000L);
            l51.m152888H(VoiceLiveBulletView.this.getContext(), VoiceLiveBulletView.this.f54056l, 0L);
            zun0.m221682f(this.f54060a);
        }
    }

    public VoiceLiveBulletView(@NonNull Context context) {
        super(context);
        this.f54050f = false;
        this.f54052h = new evn0();
        this.f54054j = new C13188a();
        this.f54055k = new RunnableC13189b();
        this.f54056l = new RunnableC13190c();
    }

    /* JADX INFO: renamed from: p */
    private AnimatorSet m79383p() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(this.f54048d, this.f54047c, this.f54049e);
        animatorSet.addListener(this.f54054j);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m79384u(boolean z) {
        if (findViewById(mdc0.f136341x5) != null) {
            findViewById(mdc0.f136341x5).setClickable(z);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m79385w() {
        if (this.f54048d == null) {
            m79389q(this.f54051g);
        }
        if (this.f54046b == null || this.f54047c.getDuration() != this.f54051g.mo133663h()) {
            this.f54047c.setDuration(this.f54051g.mo133663h());
            this.f54046b = m79383p();
        }
        this.f54046b.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m79386x(boolean z) {
        bnl0.m105525M0(this, z);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f54045a.getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        it0.m142007A(this.f54047c);
        AnimatorSet animatorSet = this.f54046b;
        if (animatorSet != null) {
            animatorSet.end();
            this.f54046b.removeAllListeners();
            this.f54046b = null;
        }
        l51.m152890J(this.f54055k);
        l51.m152890J(this.f54056l);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m79387m(View view) {
        fvn0.m127678a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79387m(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m79389q(final iun0 iun0Var) {
        float[] fArr = {bnl0.m105592y0(), 0.0f};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<VoiceLiveBulletView, Float>) property, fArr);
        this.f54048d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        gt0.m132176v(this.f54048d, new Runnable() { // from class: l.cvn0
            @Override // java.lang.Runnable
            public final void run() {
                zun0.m221681e(iun0Var);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<VoiceLiveBulletView, Float>) property, 0.0f, -bnl0.m105592y0());
        this.f54049e = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(500L);
        gt0.m132176v(this.f54049e, new Runnable() { // from class: l.dvn0
            @Override // java.lang.Runnable
            public final void run() {
                zun0.m221678b(iun0Var);
            }
        });
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        this.f54047c = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(iun0Var.mo133663h());
        this.f54047c.addListener(new C13191d(iun0Var));
    }

    /* JADX INFO: renamed from: s */
    public boolean m79390s() {
        return this.f54050f;
    }

    /* JADX INFO: renamed from: v */
    public void m79391v(final iun0 iun0Var, x20 x20Var) {
        this.f54051g = iun0Var;
        this.f54053i = x20Var;
        iun0Var.mo133665k(this.f54045a, this.f54052h);
        if (this.f54045a.findViewById(mdc0.f136341x5) != null) {
            this.f54045a.findViewById(mdc0.f136341x5).setOnClickListener(new View.OnClickListener() { // from class: l.bvn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iun0Var.mo133664j();
                }
            });
        }
        m79385w();
        zun0.m221680d(iun0Var);
    }

    public VoiceLiveBulletView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54050f = false;
        this.f54052h = new evn0();
        this.f54054j = new C13188a();
        this.f54055k = new RunnableC13189b();
        this.f54056l = new RunnableC13190c();
    }

    public VoiceLiveBulletView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54050f = false;
        this.f54052h = new evn0();
        this.f54054j = new C13188a();
        this.f54055k = new RunnableC13189b();
        this.f54056l = new RunnableC13190c();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yun0 yun0Var) {
    }
}
