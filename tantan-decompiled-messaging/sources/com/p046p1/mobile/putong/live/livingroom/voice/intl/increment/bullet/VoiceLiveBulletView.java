package com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

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
import p149l.amn0;
import p149l.bmn0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.e51;
import p149l.eln0;
import p149l.g5c0;
import p149l.s7m;
import p149l.uln0;
import p149l.vln0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveBulletView extends FrameLayout implements s7m<uln0> {

    /* JADX INFO: renamed from: a */
    public VoiceLiveBulletView f53197a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f53198b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f53199c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f53200d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f53201e;

    /* JADX INFO: renamed from: f */
    public boolean f53202f;

    /* JADX INFO: renamed from: g */
    public eln0 f53203g;

    /* JADX INFO: renamed from: h */
    public amn0 f53204h;

    /* JADX INFO: renamed from: i */
    public d30 f53205i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f53206j;

    /* JADX INFO: renamed from: k */
    public Runnable f53207k;

    /* JADX INFO: renamed from: l */
    public Runnable f53208l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$a */
    public class C13025a extends AnimatorListenerAdapter {
        public C13025a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceLiveBulletView.this.f53202f = false;
            VoiceLiveBulletView.this.m78203x(false);
            VoiceLiveBulletView.this.f53197a.removeAllViews();
            if (VoiceLiveBulletView.this.f53205i != null) {
                VoiceLiveBulletView.this.f53205i.call();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VoiceLiveBulletView.this.f53202f = true;
            VoiceLiveBulletView.this.m78203x(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$b */
    public class RunnableC13026b implements Runnable {
        public RunnableC13026b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewFindViewById = VoiceLiveBulletView.this.f53197a.findViewById(g5c0.f100666D0);
            TextView textView = (TextView) VoiceLiveBulletView.this.f53197a.findViewById(g5c0.f100795R3);
            if (viewFindViewById == null || textView == null || VoiceLiveBulletView.this.f53203g == null) {
                return;
            }
            textView.setText(VoiceLiveBulletView.this.f53203g.mo113892f());
            xdl0.m208345M0(viewFindViewById, false);
            xdl0.m208345M0(textView, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$c */
    public class RunnableC13027c implements Runnable {
        public RunnableC13027c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoiceLiveBulletView.this.f53203g.mo113896l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView$d */
    public class C13028d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eln0 f53212a;

        public C13028d(eln0 eln0Var) {
            this.f53212a = eln0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceLiveBulletView.this.m78201u(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VoiceLiveBulletView.this.m78201u(true);
            e51.m114743H(VoiceLiveBulletView.this.getContext(), VoiceLiveBulletView.this.f53207k, 1000L);
            e51.m114743H(VoiceLiveBulletView.this.getContext(), VoiceLiveBulletView.this.f53208l, 0L);
            vln0.m198820f(this.f53212a);
        }
    }

    public VoiceLiveBulletView(@NonNull Context context) {
        super(context);
        this.f53202f = false;
        this.f53204h = new amn0();
        this.f53206j = new C13025a();
        this.f53207k = new RunnableC13026b();
        this.f53208l = new RunnableC13027c();
    }

    /* JADX INFO: renamed from: p */
    private AnimatorSet m78200p() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(this.f53200d, this.f53199c, this.f53201e);
        animatorSet.addListener(this.f53206j);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m78201u(boolean z) {
        if (findViewById(g5c0.f101096x5) != null) {
            findViewById(g5c0.f101096x5).setClickable(z);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m78202w() {
        if (this.f53200d == null) {
            m78206q(this.f53203g);
        }
        if (this.f53198b == null || this.f53199c.getDuration() != this.f53203g.mo113893h()) {
            this.f53199c.setDuration(this.f53203g.mo113893h());
            this.f53198b = m78200p();
        }
        this.f53198b.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m78203x(boolean z) {
        xdl0.m208345M0(this, z);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f53197a.getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        dt0.m113501A(this.f53199c);
        AnimatorSet animatorSet = this.f53198b;
        if (animatorSet != null) {
            animatorSet.end();
            this.f53198b.removeAllListeners();
            this.f53198b = null;
        }
        e51.m114745J(this.f53207k);
        e51.m114745J(this.f53208l);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m78204m(View view) {
        bmn0.m102656a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78204m(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m78206q(final eln0 eln0Var) {
        float[] fArr = {xdl0.m208412y0(), 0.0f};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<VoiceLiveBulletView, Float>) property, fArr);
        this.f53200d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        bt0.m103749v(this.f53200d, new Runnable() { // from class: l.yln0
            @Override // java.lang.Runnable
            public final void run() {
                vln0.m198819e(eln0Var);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<VoiceLiveBulletView, Float>) property, 0.0f, -xdl0.m208412y0());
        this.f53201e = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(500L);
        bt0.m103749v(this.f53201e, new Runnable() { // from class: l.zln0
            @Override // java.lang.Runnable
            public final void run() {
                vln0.m198816b(eln0Var);
            }
        });
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        this.f53199c = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(eln0Var.mo113893h());
        this.f53199c.addListener(new C13028d(eln0Var));
    }

    /* JADX INFO: renamed from: s */
    public boolean m78207s() {
        return this.f53202f;
    }

    /* JADX INFO: renamed from: v */
    public void m78208v(final eln0 eln0Var, d30 d30Var) {
        this.f53203g = eln0Var;
        this.f53205i = d30Var;
        eln0Var.mo113895k(this.f53197a, this.f53204h);
        if (this.f53197a.findViewById(g5c0.f101096x5) != null) {
            this.f53197a.findViewById(g5c0.f101096x5).setOnClickListener(new View.OnClickListener() { // from class: l.xln0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eln0Var.mo113894j();
                }
            });
        }
        m78202w();
        vln0.m198818d(eln0Var);
    }

    public VoiceLiveBulletView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53202f = false;
        this.f53204h = new amn0();
        this.f53206j = new C13025a();
        this.f53207k = new RunnableC13026b();
        this.f53208l = new RunnableC13027c();
    }

    public VoiceLiveBulletView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53202f = false;
        this.f53204h = new amn0();
        this.f53206j = new C13025a();
        this.f53207k = new RunnableC13026b();
        this.f53208l = new RunnableC13027c();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(uln0 uln0Var) {
    }
}
