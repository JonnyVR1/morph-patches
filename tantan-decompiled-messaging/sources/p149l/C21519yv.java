package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.yv */
/* JADX INFO: loaded from: classes9.dex */
public class C21519yv extends AbstractC19782ru {

    /* JADX INFO: renamed from: c */
    public ValueAnimator f200142c;

    /* JADX INFO: renamed from: e */
    public View[] f200144e;

    /* JADX INFO: renamed from: f */
    public rlw f200145f;

    /* JADX INFO: renamed from: g */
    public View f200146g;

    /* JADX INFO: renamed from: d */
    public float f200143d = 0.0f;

    /* JADX INFO: renamed from: h */
    public ValueAnimator.AnimatorUpdateListener f200147h = new a();

    /* JADX INFO: renamed from: l.yv$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C21519yv c21519yv = C21519yv.this;
            c21519yv.m216172r(fFloatValue, c21519yv.f200144e);
        }
    }

    /* JADX INFO: renamed from: l.yv$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (C21519yv.this.f200146g == null) {
                return;
            }
            float unused = C21519yv.this.f200143d;
        }
    }

    @Override // p149l.AbstractC19782ru
    /* JADX INFO: renamed from: b */
    public void mo180838b() {
        m216173s(90.0f, -90.0f);
        this.f200143d = -90.0f;
        m216170p();
    }

    @Override // p149l.AbstractC19782ru
    /* JADX INFO: renamed from: c */
    public void mo180839c() {
        m216173s(-90.0f, 90.0f);
        this.f200143d = 90.0f;
        m216170p();
    }

    @Override // p149l.AbstractC19782ru
    /* JADX INFO: renamed from: d */
    public long mo180840d() {
        return 1000L;
    }

    @Override // p149l.AbstractC19782ru
    /* JADX INFO: renamed from: h */
    public void mo180844h() {
        m216173s(0.0f, 90.0f);
        this.f200143d = 90.0f;
        m216170p();
    }

    @Override // p149l.AbstractC19782ru
    /* JADX INFO: renamed from: i */
    public void mo180845i() {
        m216173s(this.f200143d, 0.0f);
        this.f200143d = 0.0f;
        m216170p();
    }

    @Override // p149l.AbstractC19782ru
    /* JADX INFO: renamed from: j */
    public void mo180846j() {
        m216173s(0.0f, -90.0f);
        this.f200143d = -90.0f;
        m216170p();
    }

    /* JADX INFO: renamed from: o */
    public final void m216169o() {
        if (this.f200142c == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f200142c = valueAnimator;
            valueAnimator.addUpdateListener(this.f200147h);
            this.f200142c.addListener(new b());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m216170p() {
        if (NullChecker.m81303a(this.f200145f)) {
            float f = this.f200143d;
            rlw rlwVar = this.f200145f;
            if (f == 0.0f) {
                rlwVar.m179907W(0);
            } else {
                rlwVar.m179907W((int) (f + 180.0f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m216171q(rlw rlwVar) {
        this.f200145f = rlwVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m216172r(float f, View[] viewArr) {
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
    public final void m216173s(float f, float f2) {
        m216169o();
        this.f200142c.setFloatValues(f, f2);
        this.f200142c.setDuration(200L);
        this.f200142c.start();
    }
}
