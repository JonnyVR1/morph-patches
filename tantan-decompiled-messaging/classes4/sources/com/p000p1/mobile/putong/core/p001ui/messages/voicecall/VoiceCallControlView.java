package com.p000p1.mobile.putong.core.p001ui.messages.voicecall;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.voicecall.VoiceCallControlView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.view.VoiceCallCheckeableImage;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.c4g0;
import l.e30;
import l.j760;
import l.jig;
import l.lsi0;
import l.mkd0;
import l.mqm0;
import l.o6j0;
import l.ssm0;
import l.t100;
import l.tqm0;
import l.vpm0;
import l.w9j;
import l.xdl0;
import l.xhx;
import l.zvf0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceCallControlView extends LinearLayout implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public TextView f355a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f356b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f357c;

    /* JADX INFO: renamed from: d */
    public TextView f358d;

    /* JADX INFO: renamed from: e */
    public VImage f359e;

    /* JADX INFO: renamed from: f */
    public VoiceCallCheckeableImage f360f;

    /* JADX INFO: renamed from: g */
    public VoiceCallCheckeableImage f361g;

    /* JADX INFO: renamed from: h */
    public VImage f362h;

    /* JADX INFO: renamed from: i */
    public View[] f363i;

    /* JADX INFO: renamed from: j */
    public float[] f364j;

    /* JADX INFO: renamed from: k */
    public int[] f365k;

    /* JADX INFO: renamed from: l */
    public Interpolator f366l;

    /* JADX INFO: renamed from: m */
    public final float f367m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f368n;

    /* JADX INFO: renamed from: o */
    public PathInterpolator f369o;

    /* JADX INFO: renamed from: p */
    public View f370p;

    /* JADX INFO: renamed from: q */
    public int f371q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0024b f372r;

    /* JADX INFO: renamed from: s */
    public int f373s;

    /* JADX INFO: renamed from: t */
    public c4g0 f374t;

    /* JADX INFO: renamed from: u */
    public boolean f375u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView$a */
    public class C0023a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f376a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f377b;

        public C0023a(boolean z) {
            this.f377b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f376a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f376a) {
                return;
            }
            if (!this.f377b) {
                xdl0.M(VoiceCallControlView.this, false);
            }
            if (NullChecker.a(VoiceCallControlView.this.f372r)) {
                VoiceCallControlView.this.f372r.m515a(this.f377b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f376a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView$b */
    public interface InterfaceC0024b {
        /* JADX INFO: renamed from: a */
        void m515a(boolean z);

        /* JADX INFO: renamed from: b */
        void m516b(float f, int i, int i2, boolean z);
    }

    public VoiceCallControlView(Context context) {
        super(context);
        this.f366l = new jig();
        this.f367m = 0.0f;
        this.f371q = 1;
        this.f375u = true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m494g(View view) {
    }

    private String getPageId() {
        return "p_chat_view";
    }

    private void setPercent(float f) {
        for (int i = 0; i < 4; i++) {
            View view = this.f363i[i];
            view.setTranslationY(m501m(i, f));
            view.setAlpha(m500l(i, f));
        }
        float f2 = f - 0.0f;
        if (f2 > 600.0f) {
            f2 = 600.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float interpolation = this.f369o.getInterpolation(f2 / 600.0f);
        View view2 = this.f370p;
        if (interpolation < 0.0f) {
            view2.setAlpha(0.0f);
        } else {
            view2.setAlpha(interpolation);
            float f3 = (0.19999999f * interpolation) + 0.8f;
            this.f370p.setScaleY(f3);
            this.f370p.setScaleX(f3);
        }
        if (this.f375u || m505q()) {
            if (!NullChecker.a(this.f372r) || interpolation > 1.0f) {
                return;
            }
            this.f372r.m516b(interpolation, this.f373s, getHeight(), this.f375u);
            return;
        }
        if (NullChecker.a(this.f372r)) {
            float f4 = 660.0f - f;
            if (f4 >= 390.0f) {
                f4 = 390.0f;
            }
            this.f372r.m516b(1.0f - this.f366l.getInterpolation(f4 / 390.0f), this.f373s, getHeight(), this.f375u);
        }
    }

    private void setViewStateForAnim(boolean z) {
        if (z) {
            for (int i = 0; i < 4; i++) {
                View view = this.f363i[i];
                view.setTranslationY(this.f365k[i]);
                view.setAlpha(0.0f);
            }
            this.f355a.setAlpha(0.0f);
            this.f356b.setAlpha(0.0f);
        }
    }

    private void setVoiceCallTime(long j) {
        this.f358d.setText(String.format(CoreModule.b.getResources().getString(R.string.O6), ssm0.b(j)));
    }

    /* JADX INFO: renamed from: A */
    public final void m497A(float f, float f2, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f368n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new C0023a(z));
        this.f368n.setDuration(660L);
        this.f368n.addUpdateListener(this);
        this.f368n.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m498j(View view) {
        vpm0.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m499k() {
        TextView textView = this.f355a;
        Animator animatorP = bt0.p(textView, "alpha", 0L, 600L, (Interpolator) null, new float[]{textView.getAlpha(), 0.0f});
        FrameLayout frameLayout = this.f356b;
        bt0.z(new Animator[]{animatorP, bt0.p(frameLayout, "alpha", 0L, 600L, (Interpolator) null, new float[]{frameLayout.getAlpha(), 1.0f})}).start();
        this.f356b.setScaleX(1.0f);
        this.f356b.setScaleY(1.0f);
        if (getContext() instanceof Act) {
            setVoiceCallTime(0L);
            this.f374t = getContext().duringCreated(xhx.C().l).filter(new w9j() { // from class: l.tpm0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Long) obj).longValue() > 0);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.upm0
                public final void call(Object obj) {
                    this.f20748a.m506r((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final float m500l(int i, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = f - this.f364j[i];
        if (f3 > 600.0f) {
            f2 = 600.0f;
        } else if (f3 >= 0.0f) {
            f2 = f3;
        }
        return this.f369o.getInterpolation(f2 / 600.0f);
    }

    /* JADX INFO: renamed from: m */
    public final int m501m(int i, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = f - this.f364j[i];
        if (f3 > 600.0f) {
            f2 = 600.0f;
        } else if (f3 >= 0.0f) {
            f2 = f3;
        }
        return (int) ((1.0f - this.f369o.getInterpolation(f2 / 600.0f)) * this.f365k[i]);
    }

    /* JADX INFO: renamed from: n */
    public final void m502n() {
        tqm0.p().n();
    }

    /* JADX INFO: renamed from: o */
    public final void m503o() {
        m498j(this);
        this.f370p = this.f355a;
        xdl0.E0(this, new View.OnClickListener() { // from class: l.npm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallControlView.m494g(view);
            }
        });
        xdl0.E0(this.f359e, new View.OnClickListener() { // from class: l.opm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16740a.m507s(view);
            }
        });
        xdl0.E0(this.f362h, new View.OnClickListener() { // from class: l.ppm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17570a.m508t(view);
            }
        });
        this.f360f.setCheckChangeListener(new VoiceCallCheckeableImage.a() { // from class: l.qpm0
            /* JADX INFO: renamed from: a */
            public final void m21503a(VImage vImage, boolean z) {
                this.f18176a.m509u(vImage, z);
            }
        });
        this.f361g.setCheckChangeListener(new VoiceCallCheckeableImage.a() { // from class: l.rpm0
            /* JADX INFO: renamed from: a */
            public final void m22095a(VImage vImage, boolean z) {
                this.f18638a.m510v(vImage, z);
            }
        });
        this.f363i = new View[]{this.f359e, this.f360f, this.f361g, this.f362h};
        this.f364j = new float[]{0.0f, 20.0f, 40.0f, 60.0f};
        this.f365k = new int[]{t100.d(68.0f), t100.d(68.0f), t100.d(68.0f), t100.d(68.0f)};
        this.f369o = new PathInterpolator(0.3f, 0.6f, 0.0f, 1.0f);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        setPercent(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f374t);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m503o();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m504p(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m505q() {
        if (getContext() instanceof MessagesAct) {
            return getContext().c0().E0();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m506r(Long l2) {
        setVoiceCallTime(l2.longValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m507s(View view) {
        o6j0.c("e_voice_talking_hangup", getPageId(), new o6j0.a[0]);
        mqm0.h().e("Hangup", tqm0.p().k());
        m502n();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f371q == 8 && NullChecker.a(this.f357c)) {
            this.f357c.stopAnimation(false);
        }
    }

    public void setVoiceCallAnimListener(InterfaceC0024b interfaceC0024b) {
        this.f372r = interfaceC0024b;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m508t(View view) {
        o6j0.c("e_voice_small", getPageId(), new o6j0.a[0]);
        mqm0.h().e("ZoomClick", tqm0.p().k());
        tqm0.p().y(getContext());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m509u(VImage vImage, boolean z) {
        o6j0.c("e_voice_talking_mute", getPageId(), new o6j0.a[]{o6j0.a.h("mute_handsfree", z ? "on" : "off")});
        mqm0.h().e("MutExchange", "status:" + z + ",Detail:" + tqm0.p().k());
        ssm0.h(z);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m510v(VImage vImage, boolean z) {
        o6j0.c("e_voice_talking_open", getPageId(), new o6j0.a[]{o6j0.a.h("mute_handsfree", z ? "on" : "off")});
        mqm0.h().e("TalkingOpen", "status:" + z + ",Detail:" + tqm0.p().k());
        ssm0.g(z);
        lsi0.w(z ? R.string.g7 : R.string.f7);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m511w(View view, float f, float f2) {
        this.f373s = view.getHeight();
        m497A(f, f2, true);
    }

    /* JADX INFO: renamed from: x */
    public void m512x(int i) {
        this.f360f.setCheckWithoutCallback(ssm0.f());
        this.f361g.setCheckWithoutCallback(ssm0.c());
        mkd0.z(this.f374t);
        if (i == 1) {
            this.f355a.setText(R.string.I6);
            xdl0.M(this.f355a, true);
            this.f370p = this.f355a;
        } else if (i == 2) {
            this.f355a.setText(R.string.e7);
            xdl0.M(this.f355a, true);
            this.f370p = this.f355a;
        } else if (i == 3) {
            xdl0.M(this.f356b, true);
            FrameLayout frameLayout = this.f356b;
            this.f370p = frameLayout;
            frameLayout.setAlpha(0.0f);
            m499k();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m513y(int i, int i2) {
        if (i2 != 1) {
            m514z(false);
            return;
        }
        xdl0.M(this, true);
        setViewStateForAnim(true);
        m512x(i);
        m514z(true);
        zvf0.A("e_voice_call_panel", getPageId(), new j760[]{j760.a("if_accepted", Boolean.valueOf(!m504p(i)))});
    }

    /* JADX INFO: renamed from: z */
    public final void m514z(boolean z) {
        if (z || xdl0.O0(this)) {
            if (z && !this.f357c.isAnimating()) {
                SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/067d4299-324f-4cc5-8322-db0c9f14d0b111.so").into(this.f357c);
            }
            final float fFloatValue = z ? 0.0f : 660.0f;
            final float f = z ? 660.0f : 0.0f;
            ValueAnimator valueAnimator = this.f368n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                fFloatValue = ((Float) this.f368n.getAnimatedValue()).floatValue();
                this.f368n.cancel();
            }
            if (!z) {
                if (getContext() instanceof MessagesAct) {
                    View messageBarRoot = getContext().A0().g0().t0().getMessageBarRoot();
                    messageBarRoot.measure(View.MeasureSpec.makeMeasureSpec(messageBarRoot.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(t100.d(1000.0f), Integer.MIN_VALUE));
                    this.f373s = messageBarRoot.getMeasuredHeight();
                }
                m497A(fFloatValue, f, false);
            } else if (getContext() instanceof MessagesAct) {
                final View messageBarRoot2 = getContext().A0().g0().t0().getMessageBarRoot();
                int height = messageBarRoot2.getHeight();
                this.f373s = height;
                if (height > 0) {
                    m497A(fFloatValue, f, true);
                } else {
                    messageBarRoot2.post(new Runnable() { // from class: l.spm0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f19238a.m511w(messageBarRoot2, fFloatValue, f);
                        }
                    });
                }
            }
            this.f375u = z;
        }
    }

    public VoiceCallControlView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f366l = new jig();
        this.f367m = 0.0f;
        this.f371q = 1;
        this.f375u = true;
    }

    public VoiceCallControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f366l = new jig();
        this.f367m = 0.0f;
        this.f371q = 1;
        this.f375u = true;
    }
}
