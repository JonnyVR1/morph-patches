package com.p000p1.mobile.putong.live.livingroom.increment.bullet;

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
import l.bt0;
import l.d30;
import l.dt0;
import l.e51;
import l.s7m;
import l.xdl0;
import p002l.ei3;
import p002l.fi3;
import p002l.g5c0;
import p002l.if2;
import p002l.wh3;
import p002l.xh3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BulletView extends FrameLayout implements s7m<wh3> {

    /* JADX INFO: renamed from: a */
    public BulletView f5484a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f5485b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f5486c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f5487d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f5488e;

    /* JADX INFO: renamed from: f */
    public boolean f5489f;

    /* JADX INFO: renamed from: g */
    public if2 f5490g;

    /* JADX INFO: renamed from: h */
    public ei3 f5491h;

    /* JADX INFO: renamed from: i */
    public d30 f5492i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f5493j;

    /* JADX INFO: renamed from: k */
    public Runnable f5494k;

    /* JADX INFO: renamed from: l */
    public Runnable f5495l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$a */
    public class C0376a extends AnimatorListenerAdapter {
        public C0376a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BulletView.this.f5489f = false;
            BulletView.this.m6914z(false);
            BulletView.this.f5484a.removeAllViews();
            if (BulletView.this.f5492i != null) {
                BulletView.this.f5492i.call();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BulletView.this.f5489f = true;
            BulletView.this.m6914z(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$b */
    public class RunnableC0377b implements Runnable {
        public RunnableC0377b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewFindViewById = BulletView.this.f5484a.findViewById(g5c0.f10816D0);
            TextView textView = (TextView) BulletView.this.f5484a.findViewById(g5c0.f10945R3);
            if (viewFindViewById == null || textView == null || BulletView.this.f5490g == null) {
                return;
            }
            textView.setText(BulletView.this.f5490g.mo15118i());
            xdl0.M0(viewFindViewById, false);
            xdl0.M0(textView, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$c */
    public class RunnableC0378c implements Runnable {
        public RunnableC0378c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BulletView.this.f5490g.mo15128s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletView$d */
    public class C0379d extends AnimatorListenerAdapter {
        public C0379d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BulletView.this.m6911w(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BulletView.this.m6911w(true);
            e51.H(BulletView.this.getContext(), BulletView.this.f5494k, 1000L);
            e51.H(BulletView.this.getContext(), BulletView.this.f5495l, 0L);
            xh3.m25937g(BulletView.this.f5490g);
        }
    }

    public BulletView(@NonNull Context context) {
        super(context);
        this.f5489f = false;
        this.f5491h = new ei3();
        this.f5493j = new C0376a();
        this.f5494k = new RunnableC0377b();
        this.f5495l = new RunnableC0378c();
    }

    /* JADX INFO: renamed from: q */
    private void m6902q() {
        float[] fArr = {xdl0.y0(), 0.0f};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<BulletView, Float>) property, fArr);
        this.f5487d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        bt0.v(this.f5487d, new Runnable() { // from class: l.ci3
            @Override // java.lang.Runnable
            public final void run() {
                this.f8684a.m6909u();
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<BulletView, Float>) property, 0.0f, -xdl0.y0());
        this.f5488e = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(500L);
        bt0.v(this.f5488e, new Runnable() { // from class: l.di3
            @Override // java.lang.Runnable
            public final void run() {
                this.f9285a.m6910v();
            }
        });
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        this.f5486c = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f5490g.mo15122m());
        this.f5486c.addListener(new C0379d());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6903C0() {
        return this.f5484a.getContext();
    }

    public void destroy() {
        dt0.A(this.f5486c);
        AnimatorSet animatorSet = this.f5485b;
        if (animatorSet != null) {
            animatorSet.end();
            this.f5485b.removeAllListeners();
            this.f5485b = null;
        }
        e51.J(this.f5494k);
        e51.J(this.f5495l);
        if (NullChecker.a(this.f5490g)) {
            this.f5490g.m15125p();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m6905m(View view) {
        fi3.m13247a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6905m(this);
        setTranslationZ(1.0f);
    }

    /* JADX INFO: renamed from: p */
    public final AnimatorSet m6907p() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(this.f5487d, this.f5486c, this.f5488e);
        animatorSet.addListener(this.f5493j);
        return animatorSet;
    }

    /* JADX INFO: renamed from: s */
    public boolean m6908s() {
        return this.f5489f;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m6909u() {
        xh3.m25936f(this.f5490g);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m6910v() {
        xh3.m25932b(this.f5490g);
    }

    /* JADX INFO: renamed from: w */
    public final void m6911w(boolean z) {
        if (findViewById(g5c0.f11246x5) != null) {
            findViewById(g5c0.f11246x5).setClickable(z);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m6912x(final if2 if2Var, d30 d30Var) {
        this.f5490g = if2Var;
        this.f5492i = d30Var;
        if2Var.mo15127r(this.f5484a, this.f5491h);
        if (this.f5484a.findViewById(g5c0.f11246x5) != null) {
            this.f5484a.findViewById(g5c0.f11246x5).setOnClickListener(new View.OnClickListener() { // from class: l.bi3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if2Var.mo15124o();
                }
            });
        }
        m6913y();
        xh3.m25935e(if2Var);
    }

    /* JADX INFO: renamed from: y */
    public final void m6913y() {
        if (this.f5487d == null) {
            m6902q();
        }
        if (this.f5485b == null || this.f5486c.getDuration() != this.f5490g.mo15122m()) {
            this.f5486c.setDuration(this.f5490g.mo15122m());
            this.f5485b = m6907p();
        }
        this.f5485b.start();
    }

    /* JADX INFO: renamed from: z */
    public final void m6914z(boolean z) {
        xdl0.M0(this, z);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m6904i1(wh3 wh3Var) {
    }

    public BulletView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5489f = false;
        this.f5491h = new ei3();
        this.f5493j = new C0376a();
        this.f5494k = new RunnableC0377b();
        this.f5495l = new RunnableC0378c();
    }

    public BulletView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5489f = false;
        this.f5491h = new ei3();
        this.f5493j = new C0376a();
        this.f5494k = new RunnableC0377b();
        this.f5495l = new RunnableC0378c();
    }
}
