package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class o6n0 {

    /* JADX INFO: renamed from: a */
    public int[] f142393a;

    /* JADX INFO: renamed from: b */
    public int[] f142394b;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f142397e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f142398f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f142399g;

    /* JADX INFO: renamed from: h */
    public VoiceFlyMicContainer f142400h;

    /* JADX INFO: renamed from: k */
    public int f142403k;

    /* JADX INFO: renamed from: l */
    public int f142404l;

    /* JADX INFO: renamed from: m */
    public Animator f142405m;

    /* JADX INFO: renamed from: n */
    public Animator f142406n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f142407o;

    /* JADX INFO: renamed from: p */
    public boolean f142408p;

    /* JADX INFO: renamed from: q */
    public int f142409q = t100.f167227B;

    /* JADX INFO: renamed from: c */
    public int[] f142395c = new int[2];

    /* JADX INFO: renamed from: d */
    public float[] f142396d = new float[2];

    /* JADX INFO: renamed from: i */
    public Path f142401i = new Path();

    /* JADX INFO: renamed from: j */
    public PathMeasure f142402j = new PathMeasure();

    /* JADX INFO: renamed from: l.o6n0$a */
    public class C18859a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveIntlFlyMicEffectConfig f142410a;

        public C18859a(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
            this.f142410a = bLiveIntlFlyMicEffectConfig;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean zM162931o = o6n0.this.m162931o();
            o6n0 o6n0Var = o6n0.this;
            if (!zM162931o) {
                o6n0Var.m162935s(this.f142410a);
            } else {
                o6n0Var.m162922f();
                m6n0.m153250e(o6n0.this);
            }
        }
    }

    /* JADX INFO: renamed from: l.o6n0$b */
    public class C18860b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveIntlFlyMicEffectConfig f142412a;

        public C18860b(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
            this.f142412a = bLiveIntlFlyMicEffectConfig;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o6n0.this.m162922f();
            m6n0.m153250e(o6n0.this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o6n0.this.m162934r(this.f142412a.endEffectIcon);
        }
    }

    public o6n0() {
        int i = this.f142409q;
        this.f142403k = i / 2;
        this.f142404l = i / 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m162922f() {
        VDraweeView vDraweeView;
        if (this.f142400h == null || (vDraweeView = this.f142399g) == null) {
            return;
        }
        if (vDraweeView.getParent() != null) {
            this.f142400h.removeView(this.f142399g);
        }
        this.f142399g.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final void m162923g(VoiceFlyMicContainer voiceFlyMicContainer) {
        this.f142399g = new VDraweeView(voiceFlyMicContainer.getContext());
        djj djjVarM116872a = new ejj(voiceFlyMicContainer.getResources()).m116872a();
        djjVarM116872a.m112076w(ftd0.f99184h);
        this.f142399g.setHierarchy(djjVarM116872a);
        VDraweeView vDraweeView = this.f142399g;
        int i = this.f142409q;
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }

    /* JADX INFO: renamed from: h */
    public final float m162924h(float[] fArr) {
        return fArr[0] - this.f142403k;
    }

    /* JADX INFO: renamed from: i */
    public final float m162925i(int[] iArr) {
        return iArr[0] - this.f142403k;
    }

    /* JADX INFO: renamed from: j */
    public final float m162926j(float[] fArr) {
        return fArr[1] - this.f142404l;
    }

    /* JADX INFO: renamed from: k */
    public final float m162927k(int[] iArr) {
        return iArr[1] - this.f142404l;
    }

    /* JADX INFO: renamed from: l */
    public final void m162928l() {
        this.f142401i.reset();
        Path path = this.f142401i;
        int[] iArr = this.f142393a;
        path.moveTo(iArr[0], iArr[1]);
        Path path2 = this.f142401i;
        int[] iArr2 = this.f142395c;
        float f = iArr2[0];
        float f2 = iArr2[1];
        int[] iArr3 = this.f142394b;
        path2.quadTo(f, f2, iArr3[0], iArr3[1]);
        this.f142402j.setPath(this.f142401i, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m162929m(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        int[] iArr = bLiveIntlFlyMicEffectConfig.startPosition;
        this.f142393a = iArr;
        int[] iArr2 = bLiveIntlFlyMicEffectConfig.endPosition;
        this.f142394b = iArr2;
        int[] iArr3 = this.f142395c;
        iArr3[0] = iArr[0];
        iArr3[1] = iArr2[1];
    }

    /* JADX INFO: renamed from: n */
    public final void m162930n() {
        this.f142399g.setX(m162925i(this.f142393a));
        this.f142399g.setY(m162927k(this.f142393a));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m162931o() {
        boolean zM134916b = i7n.m134916b();
        if (zM134916b) {
            gkh0.m126627j("intl_fly_mic", "userId:" + ypv.f199493a.m199309D0() + "is low  device");
        }
        return zM134916b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m162932p() {
        return this.f142408p;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m162933q(ValueAnimator valueAnimator) {
        this.f142402j.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f142396d, null);
        this.f142399g.setX(m162924h(this.f142396d));
        this.f142399g.setY(m162926j(this.f142396d));
    }

    /* JADX INFO: renamed from: r */
    public final void m162934r(String str) {
        hxs.m133407t("context_livingAct", this.f142399g, str, this.f142409q);
    }

    /* JADX INFO: renamed from: s */
    public final void m162935s(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        AnimatorSet animatorSet = this.f142398f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        if (this.f142398f == null) {
            this.f142398f = new AnimatorSet();
            if (this.f142407o == null) {
                this.f142407o = ObjectAnimator.ofFloat(this.f142399g, "alpha", 1.0f, 0.0f);
            }
            this.f142407o.setDuration(185L);
            this.f142407o.setStartDelay(650L);
            if (this.f142405m == null) {
                this.f142405m = bt0.m103739l(this.f142399g, bt0.f77162i, 50L, 100L, new LinearInterpolator(), 1.0f, 1.4f);
            }
            if (this.f142406n == null) {
                this.f142406n = bt0.m103739l(this.f142399g, bt0.f77162i, 150L, 110L, new LinearInterpolator(), 1.4f, 1.0f);
            }
            this.f142398f.play(this.f142405m).with(this.f142406n).with(this.f142407o);
        }
        this.f142398f.addListener(new C18860b(bLiveIntlFlyMicEffectConfig));
        this.f142398f.start();
    }

    /* JADX INFO: renamed from: t */
    public void m162936t() {
        this.f142408p = false;
        ValueAnimator valueAnimator = this.f142397e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            if (this.f142397e.isRunning()) {
                this.f142397e.cancel();
            }
        }
        AnimatorSet animatorSet = this.f142398f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            if (this.f142398f.isRunning()) {
                this.f142398f.cancel();
            }
        }
        Animator animator = this.f142405m;
        if (animator != null) {
            animator.removeAllListeners();
        }
        m162922f();
    }

    /* JADX INFO: renamed from: u */
    public void m162937u(boolean z) {
        this.f142408p = z;
    }

    /* JADX INFO: renamed from: v */
    public void m162938v(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig, int i, VoiceFlyMicContainer voiceFlyMicContainer) {
        this.f142400h = voiceFlyMicContainer;
        if (i > 0) {
            this.f142409q = i;
        }
        m162929m(bLiveIntlFlyMicEffectConfig);
        if (this.f142399g == null) {
            m162923g(voiceFlyMicContainer);
        }
        xdl0.m208327D0(i, this.f142399g);
        xdl0.m208325C0(this.f142399g, i);
        int i2 = i / 2;
        this.f142403k = i2;
        this.f142404l = i2;
        if (this.f142399g.getParent() != null) {
            m162922f();
        }
        voiceFlyMicContainer.addView(this.f142399g);
        m162934r(bLiveIntlFlyMicEffectConfig.startEffectIcon);
        m162930n();
        m162928l();
        ValueAnimator valueAnimator = this.f142397e;
        PathMeasure pathMeasure = this.f142402j;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
            this.f142397e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            this.f142397e.setDuration(500L);
        } else {
            valueAnimator.setFloatValues(0.0f, pathMeasure.getLength());
        }
        this.f142397e.removeAllListeners();
        this.f142397e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n6n0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f137430a.m162933q(valueAnimator2);
            }
        });
        this.f142397e.addListener(new C18859a(bLiveIntlFlyMicEffectConfig));
        this.f142397e.start();
    }
}
