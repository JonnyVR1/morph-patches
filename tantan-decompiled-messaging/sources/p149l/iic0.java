package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class iic0 extends ux50 {

    /* JADX INFO: renamed from: c */
    public ValueAnimator f113388c;

    /* JADX INFO: renamed from: e */
    public View[] f113390e;

    /* JADX INFO: renamed from: f */
    public rlw f113391f;

    /* JADX INFO: renamed from: g */
    public View f113392g;

    /* JADX INFO: renamed from: d */
    public float f113389d = 0.0f;

    /* JADX INFO: renamed from: h */
    public ValueAnimator.AnimatorUpdateListener f113393h = new C17559a();

    /* JADX INFO: renamed from: l.iic0$a */
    public class C17559a implements ValueAnimator.AnimatorUpdateListener {
        public C17559a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            iic0 iic0Var = iic0.this;
            iic0Var.m136379r(fFloatValue, iic0Var.f113390e);
        }
    }

    /* JADX INFO: renamed from: l.iic0$b */
    public class C17560b extends AnimatorListenerAdapter {
        public C17560b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (iic0.this.f113392g == null) {
                return;
            }
            float unused = iic0.this.f113389d;
        }
    }

    @Override // p149l.ux50
    /* JADX INFO: renamed from: b */
    public void mo136370b() {
        m136380s(90.0f, -90.0f);
        this.f113389d = -90.0f;
        m136377p();
    }

    @Override // p149l.ux50
    /* JADX INFO: renamed from: c */
    public void mo136371c() {
        m136380s(-90.0f, 90.0f);
        this.f113389d = 90.0f;
        m136377p();
    }

    @Override // p149l.ux50
    /* JADX INFO: renamed from: d */
    public long mo136372d() {
        return 1000L;
    }

    @Override // p149l.ux50
    /* JADX INFO: renamed from: h */
    public void mo136373h() {
        m136380s(0.0f, 90.0f);
        this.f113389d = 90.0f;
        m136377p();
    }

    @Override // p149l.ux50
    /* JADX INFO: renamed from: i */
    public void mo136374i() {
        m136380s(this.f113389d, 0.0f);
        this.f113389d = 0.0f;
        m136377p();
    }

    @Override // p149l.ux50
    /* JADX INFO: renamed from: j */
    public void mo136375j() {
        m136380s(0.0f, -90.0f);
        this.f113389d = -90.0f;
        m136377p();
    }

    /* JADX INFO: renamed from: o */
    public final void m136376o() {
        if (this.f113388c == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f113388c = valueAnimator;
            valueAnimator.addUpdateListener(this.f113393h);
            this.f113388c.addListener(new C17560b());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m136377p() {
        if (NullChecker.m81303a(this.f113391f)) {
            float f = this.f113389d;
            rlw rlwVar = this.f113391f;
            if (f == 0.0f) {
                rlwVar.m179907W(0);
            } else {
                rlwVar.m179907W((int) (f + 180.0f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m136378q(rlw rlwVar) {
        this.f113391f = rlwVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m136379r(float f, View[] viewArr) {
        if (!NullChecker.m81303a(viewArr) || viewArr.length <= 0) {
            return;
        }
        for (View view : viewArr) {
            if (NullChecker.m81303a(view)) {
                view.setRotation(f);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m136380s(float f, float f2) {
        m136376o();
        this.f113388c.setFloatValues(f, f2);
        this.f113388c.setDuration(200L);
        this.f113388c.start();
    }
}
