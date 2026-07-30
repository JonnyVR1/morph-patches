package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class sfn0 {

    /* JADX INFO: renamed from: a */
    public int[] f167730a;

    /* JADX INFO: renamed from: b */
    public int[] f167731b;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f167734e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f167735f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f167736g;

    /* JADX INFO: renamed from: h */
    public VoiceFlyMicContainer f167737h;

    /* JADX INFO: renamed from: k */
    public int f167740k;

    /* JADX INFO: renamed from: l */
    public int f167741l;

    /* JADX INFO: renamed from: m */
    public Animator f167742m;

    /* JADX INFO: renamed from: n */
    public Animator f167743n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f167744o;

    /* JADX INFO: renamed from: p */
    public boolean f167745p;

    /* JADX INFO: renamed from: q */
    public int f167746q = qa00.f156289B;

    /* JADX INFO: renamed from: c */
    public int[] f167732c = new int[2];

    /* JADX INFO: renamed from: d */
    public float[] f167733d = new float[2];

    /* JADX INFO: renamed from: i */
    public Path f167738i = new Path();

    /* JADX INFO: renamed from: j */
    public PathMeasure f167739j = new PathMeasure();

    /* JADX INFO: renamed from: l.sfn0$a */
    public class C20035a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveIntlFlyMicEffectConfig f167747a;

        public C20035a(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
            this.f167747a = bLiveIntlFlyMicEffectConfig;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean zM185650o = sfn0.this.m185650o();
            sfn0 sfn0Var = sfn0.this;
            if (!zM185650o) {
                sfn0Var.m185654s(this.f167747a);
            } else {
                sfn0Var.m185641f();
                qfn0.m176376e(sfn0.this);
            }
        }
    }

    /* JADX INFO: renamed from: l.sfn0$b */
    public class C20036b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveIntlFlyMicEffectConfig f167749a;

        public C20036b(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
            this.f167749a = bLiveIntlFlyMicEffectConfig;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            sfn0.this.m185641f();
            qfn0.m176376e(sfn0.this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            sfn0.this.m185653r(this.f167749a.endEffectIcon);
        }
    }

    public sfn0() {
        int i = this.f167746q;
        this.f167740k = i / 2;
        this.f167741l = i / 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m185641f() {
        VDraweeView vDraweeView;
        if (this.f167737h == null || (vDraweeView = this.f167736g) == null) {
            return;
        }
        if (vDraweeView.getParent() != null) {
            this.f167737h.removeView(this.f167736g);
        }
        this.f167736g.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final void m185642g(VoiceFlyMicContainer voiceFlyMicContainer) {
        this.f167736g = new VDraweeView(voiceFlyMicContainer.getContext());
        wlj wljVarM211638a = new xlj(voiceFlyMicContainer.getResources()).m211638a();
        wljVarM211638a.m207062w(h1e0.f107451h);
        this.f167736g.setHierarchy(wljVarM211638a);
        VDraweeView vDraweeView = this.f167736g;
        int i = this.f167746q;
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }

    /* JADX INFO: renamed from: h */
    public final float m185643h(float[] fArr) {
        return fArr[0] - this.f167740k;
    }

    /* JADX INFO: renamed from: i */
    public final float m185644i(int[] iArr) {
        return iArr[0] - this.f167740k;
    }

    /* JADX INFO: renamed from: j */
    public final float m185645j(float[] fArr) {
        return fArr[1] - this.f167741l;
    }

    /* JADX INFO: renamed from: k */
    public final float m185646k(int[] iArr) {
        return iArr[1] - this.f167741l;
    }

    /* JADX INFO: renamed from: l */
    public final void m185647l() {
        this.f167738i.reset();
        Path path = this.f167738i;
        int[] iArr = this.f167730a;
        path.moveTo(iArr[0], iArr[1]);
        Path path2 = this.f167738i;
        int[] iArr2 = this.f167732c;
        float f = iArr2[0];
        float f2 = iArr2[1];
        int[] iArr3 = this.f167731b;
        path2.quadTo(f, f2, iArr3[0], iArr3[1]);
        this.f167739j.setPath(this.f167738i, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m185648m(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        int[] iArr = bLiveIntlFlyMicEffectConfig.startPosition;
        this.f167730a = iArr;
        int[] iArr2 = bLiveIntlFlyMicEffectConfig.endPosition;
        this.f167731b = iArr2;
        int[] iArr3 = this.f167732c;
        iArr3[0] = iArr[0];
        iArr3[1] = iArr2[1];
    }

    /* JADX INFO: renamed from: n */
    public final void m185649n() {
        this.f167736g.setX(m185644i(this.f167730a));
        this.f167736g.setY(m185646k(this.f167730a));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m185650o() {
        boolean zM139127b = i9n.m139127b();
        if (zM139127b) {
            nsh0.m164608j("intl_fly_mic", "userId:" + zrv.f205799a.m207631D0() + "is low  device");
        }
        return zM139127b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m185651p() {
        return this.f167745p;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m185652q(ValueAnimator valueAnimator) {
        this.f167739j.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f167733d, null);
        this.f167736g.setX(m185643h(this.f167733d));
        this.f167736g.setY(m185645j(this.f167733d));
    }

    /* JADX INFO: renamed from: r */
    public final void m185653r(String str) {
        izs.m142869t("context_livingAct", this.f167736g, str, this.f167746q);
    }

    /* JADX INFO: renamed from: s */
    public final void m185654s(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        AnimatorSet animatorSet = this.f167735f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        if (this.f167735f == null) {
            this.f167735f = new AnimatorSet();
            if (this.f167744o == null) {
                this.f167744o = ObjectAnimator.ofFloat(this.f167736g, "alpha", 1.0f, 0.0f);
            }
            this.f167744o.setDuration(185L);
            this.f167744o.setStartDelay(650L);
            if (this.f167742m == null) {
                this.f167742m = gt0.m132166l(this.f167736g, gt0.f106354i, 50L, 100L, new LinearInterpolator(), 1.0f, 1.4f);
            }
            if (this.f167743n == null) {
                this.f167743n = gt0.m132166l(this.f167736g, gt0.f106354i, 150L, 110L, new LinearInterpolator(), 1.4f, 1.0f);
            }
            this.f167735f.play(this.f167742m).with(this.f167743n).with(this.f167744o);
        }
        this.f167735f.addListener(new C20036b(bLiveIntlFlyMicEffectConfig));
        this.f167735f.start();
    }

    /* JADX INFO: renamed from: t */
    public void m185655t() {
        this.f167745p = false;
        ValueAnimator valueAnimator = this.f167734e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            if (this.f167734e.isRunning()) {
                this.f167734e.cancel();
            }
        }
        AnimatorSet animatorSet = this.f167735f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            if (this.f167735f.isRunning()) {
                this.f167735f.cancel();
            }
        }
        Animator animator = this.f167742m;
        if (animator != null) {
            animator.removeAllListeners();
        }
        m185641f();
    }

    /* JADX INFO: renamed from: u */
    public void m185656u(boolean z) {
        this.f167745p = z;
    }

    /* JADX INFO: renamed from: v */
    public void m185657v(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig, int i, VoiceFlyMicContainer voiceFlyMicContainer) {
        this.f167737h = voiceFlyMicContainer;
        if (i > 0) {
            this.f167746q = i;
        }
        m185648m(bLiveIntlFlyMicEffectConfig);
        if (this.f167736g == null) {
            m185642g(voiceFlyMicContainer);
        }
        bnl0.m105507D0(i, this.f167736g);
        bnl0.m105505C0(this.f167736g, i);
        int i2 = i / 2;
        this.f167740k = i2;
        this.f167741l = i2;
        if (this.f167736g.getParent() != null) {
            m185641f();
        }
        voiceFlyMicContainer.addView(this.f167736g);
        m185653r(bLiveIntlFlyMicEffectConfig.startEffectIcon);
        m185649n();
        m185647l();
        ValueAnimator valueAnimator = this.f167734e;
        PathMeasure pathMeasure = this.f167739j;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
            this.f167734e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            this.f167734e.setDuration(500L);
        } else {
            valueAnimator.setFloatValues(0.0f, pathMeasure.getLength());
        }
        this.f167734e.removeAllListeners();
        this.f167734e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rfn0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f162812a.m185652q(valueAnimator2);
            }
        });
        this.f167734e.addListener(new C20035a(bLiveIntlFlyMicEffectConfig));
        this.f167734e.start();
    }
}
