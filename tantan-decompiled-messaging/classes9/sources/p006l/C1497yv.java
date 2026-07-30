package p006l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import l.rlw;

/* JADX INFO: renamed from: l.yv */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1497yv extends AbstractC1232ru {

    /* JADX INFO: renamed from: c */
    public ValueAnimator f28410c;

    /* JADX INFO: renamed from: e */
    public View[] f28412e;

    /* JADX INFO: renamed from: f */
    public rlw f28413f;

    /* JADX INFO: renamed from: g */
    public View f28414g;

    /* JADX INFO: renamed from: d */
    public float f28411d = 0.0f;

    /* JADX INFO: renamed from: h */
    public ValueAnimator.AnimatorUpdateListener f28415h = new a();

    /* JADX INFO: renamed from: l.yv$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1497yv c1497yv = C1497yv.this;
            c1497yv.m28416r(fFloatValue, c1497yv.f28412e);
        }
    }

    /* JADX INFO: renamed from: l.yv$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C1497yv.this.f28414g == null) {
                return;
            }
            float unused = C1497yv.this.f28411d;
        }
    }

    @Override // p006l.AbstractC1232ru
    /* JADX INFO: renamed from: b */
    public void mo22940b() {
        m28417s(90.0f, -90.0f);
        this.f28411d = -90.0f;
        m28414p();
    }

    @Override // p006l.AbstractC1232ru
    /* JADX INFO: renamed from: c */
    public void mo22941c() {
        m28417s(-90.0f, 90.0f);
        this.f28411d = 90.0f;
        m28414p();
    }

    @Override // p006l.AbstractC1232ru
    /* JADX INFO: renamed from: d */
    public long mo22942d() {
        return 1000L;
    }

    @Override // p006l.AbstractC1232ru
    /* JADX INFO: renamed from: h */
    public void mo22946h() {
        m28417s(0.0f, 90.0f);
        this.f28411d = 90.0f;
        m28414p();
    }

    @Override // p006l.AbstractC1232ru
    /* JADX INFO: renamed from: i */
    public void mo22947i() {
        m28417s(this.f28411d, 0.0f);
        this.f28411d = 0.0f;
        m28414p();
    }

    @Override // p006l.AbstractC1232ru
    /* JADX INFO: renamed from: j */
    public void mo22948j() {
        m28417s(0.0f, -90.0f);
        this.f28411d = -90.0f;
        m28414p();
    }

    /* JADX INFO: renamed from: o */
    public final void m28413o() {
        if (this.f28410c == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f28410c = valueAnimator;
            valueAnimator.addUpdateListener(this.f28415h);
            this.f28410c.addListener(new b());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m28414p() {
        if (NullChecker.a(this.f28413f)) {
            float f = this.f28411d;
            rlw rlwVar = this.f28413f;
            if (f == 0.0f) {
                rlwVar.W(0);
            } else {
                rlwVar.W((int) (f + 180.0f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m28415q(rlw rlwVar) {
        this.f28413f = rlwVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m28416r(float f, View[] viewArr) {
        if (!NullChecker.a(viewArr) || viewArr.length <= 0) {
            return;
        }
        for (View view : viewArr) {
            if (NullChecker.a(view)) {
                view.setRotation(f);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m28417s(float f, float f2) {
        m28413o();
        this.f28410c.setFloatValues(f, f2);
        this.f28410c.setDuration(200L);
        this.f28410c.start();
    }
}
