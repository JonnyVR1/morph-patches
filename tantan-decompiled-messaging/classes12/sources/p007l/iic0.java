package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import l.rlw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class iic0 extends ux50 {

    /* JADX INFO: renamed from: c */
    public ValueAnimator f9031c;

    /* JADX INFO: renamed from: e */
    public View[] f9033e;

    /* JADX INFO: renamed from: f */
    public rlw f9034f;

    /* JADX INFO: renamed from: g */
    public View f9035g;

    /* JADX INFO: renamed from: d */
    public float f9032d = 0.0f;

    /* JADX INFO: renamed from: h */
    public ValueAnimator.AnimatorUpdateListener f9036h = new C2396a();

    /* JADX INFO: renamed from: l.iic0$a */
    public class C2396a implements ValueAnimator.AnimatorUpdateListener {
        public C2396a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            iic0 iic0Var = iic0.this;
            iic0Var.m10886r(fFloatValue, iic0Var.f9033e);
        }
    }

    /* JADX INFO: renamed from: l.iic0$b */
    public class C2397b extends AnimatorListenerAdapter {
        public C2397b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (iic0.this.f9035g == null) {
                return;
            }
            float unused = iic0.this.f9032d;
        }
    }

    @Override // p007l.ux50
    /* JADX INFO: renamed from: b */
    public void mo10877b() {
        m10887s(90.0f, -90.0f);
        this.f9032d = -90.0f;
        m10884p();
    }

    @Override // p007l.ux50
    /* JADX INFO: renamed from: c */
    public void mo10878c() {
        m10887s(-90.0f, 90.0f);
        this.f9032d = 90.0f;
        m10884p();
    }

    @Override // p007l.ux50
    /* JADX INFO: renamed from: d */
    public long mo10879d() {
        return 1000L;
    }

    @Override // p007l.ux50
    /* JADX INFO: renamed from: h */
    public void mo10880h() {
        m10887s(0.0f, 90.0f);
        this.f9032d = 90.0f;
        m10884p();
    }

    @Override // p007l.ux50
    /* JADX INFO: renamed from: i */
    public void mo10881i() {
        m10887s(this.f9032d, 0.0f);
        this.f9032d = 0.0f;
        m10884p();
    }

    @Override // p007l.ux50
    /* JADX INFO: renamed from: j */
    public void mo10882j() {
        m10887s(0.0f, -90.0f);
        this.f9032d = -90.0f;
        m10884p();
    }

    /* JADX INFO: renamed from: o */
    public final void m10883o() {
        if (this.f9031c == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9031c = valueAnimator;
            valueAnimator.addUpdateListener(this.f9036h);
            this.f9031c.addListener(new C2397b());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m10884p() {
        if (NullChecker.a(this.f9034f)) {
            float f = this.f9032d;
            rlw rlwVar = this.f9034f;
            if (f == 0.0f) {
                rlwVar.W(0);
            } else {
                rlwVar.W((int) (f + 180.0f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m10885q(rlw rlwVar) {
        this.f9034f = rlwVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m10886r(float f, View[] viewArr) {
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
    public final void m10887s(float f, float f2) {
        m10883o();
        this.f9031c.setFloatValues(f, f2);
        this.f9031c.setDuration(200L);
        this.f9031c.start();
    }
}
