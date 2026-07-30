package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class pqc0 extends z560 {

    /* JADX INFO: renamed from: c */
    public ValueAnimator f153657c;

    /* JADX INFO: renamed from: e */
    public View[] f153659e;

    /* JADX INFO: renamed from: f */
    public qow f153660f;

    /* JADX INFO: renamed from: g */
    public View f153661g;

    /* JADX INFO: renamed from: d */
    public float f153658d = 0.0f;

    /* JADX INFO: renamed from: h */
    public ValueAnimator.AnimatorUpdateListener f153662h = new C19420a();

    /* JADX INFO: renamed from: l.pqc0$a */
    public class C19420a implements ValueAnimator.AnimatorUpdateListener {
        public C19420a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            pqc0 pqc0Var = pqc0.this;
            pqc0Var.m173346r(fFloatValue, pqc0Var.f153659e);
        }
    }

    /* JADX INFO: renamed from: l.pqc0$b */
    public class C19421b extends AnimatorListenerAdapter {
        public C19421b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (pqc0.this.f153661g == null) {
                return;
            }
            float unused = pqc0.this.f153658d;
        }
    }

    @Override // p153l.z560
    /* JADX INFO: renamed from: b */
    public void mo173337b() {
        m173347s(90.0f, -90.0f);
        this.f153658d = -90.0f;
        m173344p();
    }

    @Override // p153l.z560
    /* JADX INFO: renamed from: c */
    public void mo173338c() {
        m173347s(-90.0f, 90.0f);
        this.f153658d = 90.0f;
        m173344p();
    }

    @Override // p153l.z560
    /* JADX INFO: renamed from: d */
    public long mo173339d() {
        return 1000L;
    }

    @Override // p153l.z560
    /* JADX INFO: renamed from: h */
    public void mo173340h() {
        m173347s(0.0f, 90.0f);
        this.f153658d = 90.0f;
        m173344p();
    }

    @Override // p153l.z560
    /* JADX INFO: renamed from: i */
    public void mo173341i() {
        m173347s(this.f153658d, 0.0f);
        this.f153658d = 0.0f;
        m173344p();
    }

    @Override // p153l.z560
    /* JADX INFO: renamed from: j */
    public void mo173342j() {
        m173347s(0.0f, -90.0f);
        this.f153658d = -90.0f;
        m173344p();
    }

    /* JADX INFO: renamed from: o */
    public final void m173343o() {
        if (this.f153657c == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f153657c = valueAnimator;
            valueAnimator.addUpdateListener(this.f153662h);
            this.f153657c.addListener(new C19421b());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m173344p() {
        if (NullChecker.m82486a(this.f153660f)) {
            float f = this.f153658d;
            qow qowVar = this.f153660f;
            if (f == 0.0f) {
                qowVar.m177347W(0);
            } else {
                qowVar.m177347W((int) (f + 180.0f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m173345q(qow qowVar) {
        this.f153660f = qowVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m173346r(float f, View[] viewArr) {
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
    public final void m173347s(float f, float f2) {
        m173343o();
        this.f153657c.setFloatValues(f, f2);
        this.f153657c.setDuration(200L);
        this.f153657c.start();
    }
}
