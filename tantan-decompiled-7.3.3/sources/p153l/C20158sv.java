package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.sv */
/* JADX INFO: loaded from: classes9.dex */
public class C20158sv extends AbstractC18464lu {

    /* JADX INFO: renamed from: c */
    public ValueAnimator f170776c;

    /* JADX INFO: renamed from: e */
    public View[] f170778e;

    /* JADX INFO: renamed from: f */
    public qow f170779f;

    /* JADX INFO: renamed from: g */
    public View f170780g;

    /* JADX INFO: renamed from: d */
    public float f170777d = 0.0f;

    /* JADX INFO: renamed from: h */
    public ValueAnimator.AnimatorUpdateListener f170781h = new a();

    /* JADX INFO: renamed from: l.sv$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C20158sv c20158sv = C20158sv.this;
            c20158sv.m188107r(fFloatValue, c20158sv.f170778e);
        }
    }

    /* JADX INFO: renamed from: l.sv$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C20158sv.this.f170780g == null) {
                return;
            }
            float unused = C20158sv.this.f170777d;
        }
    }

    @Override // p153l.AbstractC18464lu
    /* JADX INFO: renamed from: b */
    public void mo155829b() {
        m188108s(90.0f, -90.0f);
        this.f170777d = -90.0f;
        m188105p();
    }

    @Override // p153l.AbstractC18464lu
    /* JADX INFO: renamed from: c */
    public void mo155830c() {
        m188108s(-90.0f, 90.0f);
        this.f170777d = 90.0f;
        m188105p();
    }

    @Override // p153l.AbstractC18464lu
    /* JADX INFO: renamed from: d */
    public long mo155831d() {
        return 1000L;
    }

    @Override // p153l.AbstractC18464lu
    /* JADX INFO: renamed from: h */
    public void mo155835h() {
        m188108s(0.0f, 90.0f);
        this.f170777d = 90.0f;
        m188105p();
    }

    @Override // p153l.AbstractC18464lu
    /* JADX INFO: renamed from: i */
    public void mo155836i() {
        m188108s(this.f170777d, 0.0f);
        this.f170777d = 0.0f;
        m188105p();
    }

    @Override // p153l.AbstractC18464lu
    /* JADX INFO: renamed from: j */
    public void mo155837j() {
        m188108s(0.0f, -90.0f);
        this.f170777d = -90.0f;
        m188105p();
    }

    /* JADX INFO: renamed from: o */
    public final void m188104o() {
        if (this.f170776c == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f170776c = valueAnimator;
            valueAnimator.addUpdateListener(this.f170781h);
            this.f170776c.addListener(new b());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m188105p() {
        if (NullChecker.m82486a(this.f170779f)) {
            float f = this.f170777d;
            qow qowVar = this.f170779f;
            if (f == 0.0f) {
                qowVar.m177347W(0);
            } else {
                qowVar.m177347W((int) (f + 180.0f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m188106q(qow qowVar) {
        this.f170779f = qowVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m188107r(float f, View[] viewArr) {
        if (!NullChecker.m82486a(viewArr) || viewArr.length <= 0) {
            return;
        }
        for (View view : viewArr) {
            if (NullChecker.m82486a(view)) {
                view.setRotation(f);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m188108s(float f, float f2) {
        m188104o();
        this.f170776c.setFloatValues(f, f2);
        this.f170776c.setDuration(200L);
        this.f170776c.start();
    }
}
