package com.p046p1.mobile.putong.live.livingroom.increment.bullet;

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
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.e51;
import p149l.ei3;
import p149l.fi3;
import p149l.g5c0;
import p149l.if2;
import p149l.s7m;
import p149l.wh3;
import p149l.xdl0;
import p149l.xh3;

/* JADX INFO: loaded from: classes4.dex */
public class BulletView extends FrameLayout implements s7m<wh3> {

    /* JADX INFO: renamed from: a */
    public BulletView f49442a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f49443b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f49444c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f49445d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f49446e;

    /* JADX INFO: renamed from: f */
    public boolean f49447f;

    /* JADX INFO: renamed from: g */
    public if2 f49448g;

    /* JADX INFO: renamed from: h */
    public ei3 f49449h;

    /* JADX INFO: renamed from: i */
    public d30 f49450i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f49451j;

    /* JADX INFO: renamed from: k */
    public Runnable f49452k;

    /* JADX INFO: renamed from: l */
    public Runnable f49453l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$a */
    public class C12787a extends AnimatorListenerAdapter {
        public C12787a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BulletView.this.f49447f = false;
            BulletView.this.m73376z(false);
            BulletView.this.f49442a.removeAllViews();
            if (BulletView.this.f49450i != null) {
                BulletView.this.f49450i.call();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BulletView.this.f49447f = true;
            BulletView.this.m73376z(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$b */
    public class RunnableC12788b implements Runnable {
        public RunnableC12788b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewFindViewById = BulletView.this.f49442a.findViewById(g5c0.f100666D0);
            TextView textView = (TextView) BulletView.this.f49442a.findViewById(g5c0.f100795R3);
            if (viewFindViewById == null || textView == null || BulletView.this.f49448g == null) {
                return;
            }
            textView.setText(BulletView.this.f49448g.mo135870i());
            xdl0.m208345M0(viewFindViewById, false);
            xdl0.m208345M0(textView, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$c */
    public class RunnableC12789c implements Runnable {
        public RunnableC12789c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BulletView.this.f49448g.mo135880s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$d */
    public class C12790d extends AnimatorListenerAdapter {
        public C12790d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BulletView.this.m73373w(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BulletView.this.m73373w(true);
            e51.m114743H(BulletView.this.getContext(), BulletView.this.f49452k, 1000L);
            e51.m114743H(BulletView.this.getContext(), BulletView.this.f49453l, 0L);
            xh3.m208748g(BulletView.this.f49448g);
        }
    }

    public BulletView(@NonNull Context context) {
        super(context);
        this.f49447f = false;
        this.f49449h = new ei3();
        this.f49451j = new C12787a();
        this.f49452k = new RunnableC12788b();
        this.f49453l = new RunnableC12789c();
    }

    /* JADX INFO: renamed from: q */
    private void m73366q() {
        float[] fArr = {xdl0.m208412y0(), 0.0f};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<BulletView, Float>) property, fArr);
        this.f49445d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        bt0.m103749v(this.f49445d, new Runnable() { // from class: l.ci3
            @Override // java.lang.Runnable
            public final void run() {
                this.f81031a.m73371u();
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<BulletView, Float>) property, 0.0f, -xdl0.m208412y0());
        this.f49446e = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(500L);
        bt0.m103749v(this.f49446e, new Runnable() { // from class: l.di3
            @Override // java.lang.Runnable
            public final void run() {
                this.f86352a.m73372v();
            }
        });
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        this.f49444c = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f49448g.mo135874m());
        this.f49444c.addListener(new C12790d());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f49442a.getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        dt0.m113501A(this.f49444c);
        AnimatorSet animatorSet = this.f49443b;
        if (animatorSet != null) {
            animatorSet.end();
            this.f49443b.removeAllListeners();
            this.f49443b = null;
        }
        e51.m114745J(this.f49452k);
        e51.m114745J(this.f49453l);
        if (NullChecker.m81303a(this.f49448g)) {
            this.f49448g.m135877p();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m73367m(View view) {
        fi3.m121490a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73367m(this);
        setTranslationZ(1.0f);
    }

    /* JADX INFO: renamed from: p */
    public final AnimatorSet m73369p() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(this.f49445d, this.f49444c, this.f49446e);
        animatorSet.addListener(this.f49451j);
        return animatorSet;
    }

    /* JADX INFO: renamed from: s */
    public boolean m73370s() {
        return this.f49447f;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m73371u() {
        xh3.m208747f(this.f49448g);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m73372v() {
        xh3.m208743b(this.f49448g);
    }

    /* JADX INFO: renamed from: w */
    public final void m73373w(boolean z) {
        if (findViewById(g5c0.f101096x5) != null) {
            findViewById(g5c0.f101096x5).setClickable(z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m73374x(final if2 if2Var, d30 d30Var) {
        this.f49448g = if2Var;
        this.f49450i = d30Var;
        if2Var.mo135879r(this.f49442a, this.f49449h);
        if (this.f49442a.findViewById(g5c0.f101096x5) != null) {
            this.f49442a.findViewById(g5c0.f101096x5).setOnClickListener(new View.OnClickListener() { // from class: l.bi3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if2Var.mo135876o();
                }
            });
        }
        m73375y();
        xh3.m208746e(if2Var);
    }

    /* JADX INFO: renamed from: y */
    public final void m73375y() {
        if (this.f49445d == null) {
            m73366q();
        }
        if (this.f49443b == null || this.f49444c.getDuration() != this.f49448g.mo135874m()) {
            this.f49444c.setDuration(this.f49448g.mo135874m());
            this.f49443b = m73369p();
        }
        this.f49443b.start();
    }

    /* JADX INFO: renamed from: z */
    public final void m73376z(boolean z) {
        xdl0.m208345M0(this, z);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wh3 wh3Var) {
    }

    public BulletView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49447f = false;
        this.f49449h = new ei3();
        this.f49451j = new C12787a();
        this.f49452k = new RunnableC12788b();
        this.f49453l = new RunnableC12789c();
    }

    public BulletView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49447f = false;
        this.f49449h = new ei3();
        this.f49451j = new C12787a();
        this.f49452k = new RunnableC12788b();
        this.f49453l = new RunnableC12789c();
    }
}
