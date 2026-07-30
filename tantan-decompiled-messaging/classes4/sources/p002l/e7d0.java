package p002l;

import android.animation.Animator;
import com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import l.bt0;
import l.e30;
import l.ffw;
import l.rwb;
import l.xdl0;
import rx.c;
import v.VFrame;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e7d0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final VFrame f9606i;

    /* JADX INFO: renamed from: j */
    public final VRelative f9607j;

    /* JADX INFO: renamed from: k */
    public boolean f9608k;

    /* JADX INFO: renamed from: l */
    public RightSideViewGroup.c f9609l;

    public e7d0(bsm<? extends ho2> bsmVar, VFrame vFrame, VRelative vRelative) {
        super(bsmVar);
        this.f9608k = false;
        this.f9609l = new C0538a();
        this.f9606i = vFrame;
        this.f9607j = vRelative;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m12256O3(rwb rwbVar) {
        if (rwbVar == null) {
            return;
        }
        if (rwbVar.a != 3) {
            this.f9608k = true;
            return;
        }
        this.f9608k = false;
        this.f9606i.setTranslationX(0.0f);
        this.f9607j.setVisibility(4);
        m12259S3(true);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m12257P3(Float f) {
        if (this.f9608k) {
            if ((this.f9606i.getTranslationX() > xdl0.y0() / 2.0f && f.floatValue() >= 0.0f) || f.floatValue() > 200.0f) {
                this.f9606i.setTranslationX(xdl0.y0());
                this.f9607j.setVisibility(0);
                m12259S3(false);
            } else if (this.f9606i.getTranslationX() < xdl0.y0() / 2.0f || f.floatValue() < -200.0f) {
                this.f9606i.setTranslationX(0.0f);
                this.f9607j.setVisibility(4);
                m12259S3(true);
            }
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m12258R3(Integer num) {
        if (this.f9608k) {
            float translationX = this.f9606i.getTranslationX() + num.intValue();
            if (translationX < 0.0f) {
                return;
            }
            this.f9606i.setAlpha(1.0f);
            this.f9606i.setTranslationX(translationX);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m12259S3(boolean z) {
        if (this.f9606i.getAlpha() == 1.0f && z) {
            return;
        }
        VFrame vFrame = this.f9606i;
        if (z) {
            bt0.c(vFrame, 300L, (Animator.AnimatorListener) null);
        } else {
            bt0.d(vFrame, 300L, (Animator.AnimatorListener) null);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m12260T() {
        super.T();
        duringCreated((c) m25548F2().PlayerEvent.ctypChanged().g()).subscribe(ffw.h(new e30() { // from class: l.d7d0
            public final void call(Object obj) {
                this.f9085a.m12256O3((rwb) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m25548F2().ClearScreenEvent.removeClearScreenCallBack().j(this.f9609l);
    }

    /* JADX INFO: renamed from: t */
    public void m12261t() {
        super.t();
        m25548F2().ClearScreenEvent.addClearScreenCallBack().j(this.f9609l);
        this.f9606i.setTranslationX(0.0f);
        this.f9606i.setAlpha(1.0f);
        this.f9606i.setVisibility(0);
        m12256O3((rwb) m14184F3(new swb(6000)));
    }

    /* JADX INFO: renamed from: l.e7d0$a */
    public class C0538a implements RightSideViewGroup.c {
        public C0538a() {
        }

        /* JADX INFO: renamed from: a */
        public Boolean m12262a() {
            if (e7d0.this.f9606i != null) {
                return Boolean.valueOf(e7d0.this.f9606i.getAlpha() != 1.0f);
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: renamed from: b */
        public Boolean m12263b() {
            return Boolean.valueOf(e7d0.this.f9608k);
        }

        /* JADX INFO: renamed from: c */
        public void m12264c(float f) {
            e7d0.this.m12257P3(Float.valueOf(f));
        }

        /* JADX INFO: renamed from: e */
        public void m12266e(int i) {
            e7d0.this.m12258R3(Integer.valueOf(i));
        }

        /* JADX INFO: renamed from: d */
        public void m12265d(boolean z) {
        }
    }
}
