package com.p051p1.mobile.putong.core.p058ui.messages.voicecall;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.voicecall.VoiceCallControlView;
import com.p051p1.mobile.putong.core.p058ui.view.VoiceCallCheckeableImage;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.bnl0;
import p153l.gt0;
import p153l.i4g0;
import p153l.kcg0;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qzm0;
import p153l.sfj0;
import p153l.uqx;
import p153l.w1n0;
import p153l.xjg;
import p153l.xzm0;
import p153l.y20;
import p153l.zym0;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceCallControlView extends LinearLayout implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public TextView f33381a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f33382b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f33383c;

    /* JADX INFO: renamed from: d */
    public TextView f33384d;

    /* JADX INFO: renamed from: e */
    public VImage f33385e;

    /* JADX INFO: renamed from: f */
    public VoiceCallCheckeableImage f33386f;

    /* JADX INFO: renamed from: g */
    public VoiceCallCheckeableImage f33387g;

    /* JADX INFO: renamed from: h */
    public VImage f33388h;

    /* JADX INFO: renamed from: i */
    public View[] f33389i;

    /* JADX INFO: renamed from: j */
    public float[] f33390j;

    /* JADX INFO: renamed from: k */
    public int[] f33391k;

    /* JADX INFO: renamed from: l */
    public Interpolator f33392l;

    /* JADX INFO: renamed from: m */
    public final float f33393m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f33394n;

    /* JADX INFO: renamed from: o */
    public PathInterpolator f33395o;

    /* JADX INFO: renamed from: p */
    public View f33396p;

    /* JADX INFO: renamed from: q */
    public int f33397q;

    /* JADX INFO: renamed from: r */
    public InterfaceC8762b f33398r;

    /* JADX INFO: renamed from: s */
    public int f33399s;

    /* JADX INFO: renamed from: t */
    public kcg0 f33400t;

    /* JADX INFO: renamed from: u */
    public boolean f33401u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView$a */
    public class C8761a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f33402a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f33403b;

        public C8761a(boolean z) {
            this.f33403b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f33402a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f33402a) {
                return;
            }
            if (!this.f33403b) {
                bnl0.m105524M(VoiceCallControlView.this, false);
            }
            if (NullChecker.m82486a(VoiceCallControlView.this.f33398r)) {
                VoiceCallControlView.this.f33398r.mo51273a(this.f33403b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f33402a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView$b */
    public interface InterfaceC8762b {
        /* JADX INFO: renamed from: a */
        void mo51273a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo51274b(float f, int i, int i2, boolean z);
    }

    public VoiceCallControlView(Context context) {
        super(context);
        this.f33392l = new xjg();
        this.f33393m = 0.0f;
        this.f33397q = 1;
        this.f33401u = true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m51252g(View view) {
    }

    private String getPageId() {
        return OMSDialogPositon.p_chat_view;
    }

    private void setPercent(float f) {
        for (int i = 0; i < 4; i++) {
            View view = this.f33389i[i];
            view.setTranslationY(m51259m(i, f));
            view.setAlpha(m51258l(i, f));
        }
        float f2 = f - 0.0f;
        if (f2 > 600.0f) {
            f2 = 600.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float interpolation = this.f33395o.getInterpolation(f2 / 600.0f);
        View view2 = this.f33396p;
        if (interpolation < 0.0f) {
            view2.setAlpha(0.0f);
        } else {
            view2.setAlpha(interpolation);
            float f3 = (0.19999999f * interpolation) + 0.8f;
            this.f33396p.setScaleY(f3);
            this.f33396p.setScaleX(f3);
        }
        if (this.f33401u || m51263q()) {
            if (!NullChecker.m82486a(this.f33398r) || interpolation > 1.0f) {
                return;
            }
            this.f33398r.mo51274b(interpolation, this.f33399s, getHeight(), this.f33401u);
            return;
        }
        if (NullChecker.m82486a(this.f33398r)) {
            float f4 = 660.0f - f;
            if (f4 >= 390.0f) {
                f4 = 390.0f;
            }
            this.f33398r.mo51274b(1.0f - this.f33392l.getInterpolation(f4 / 390.0f), this.f33399s, getHeight(), this.f33401u);
        }
    }

    private void setViewStateForAnim(boolean z) {
        if (z) {
            for (int i = 0; i < 4; i++) {
                View view = this.f33389i[i];
                view.setTranslationY(this.f33391k[i]);
                view.setAlpha(0.0f);
            }
            this.f33381a.setAlpha(0.0f);
            this.f33382b.setAlpha(0.0f);
        }
    }

    private void setVoiceCallTime(long j) {
        this.f33384d.setText(String.format(CoreModule.f18263b.getResources().getString(R$string.f21569O6), w1n0.m204455b(j)));
    }

    /* JADX INFO: renamed from: A */
    public final void m51255A(float f, float f2, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f33394n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new C8761a(z));
        this.f33394n.setDuration(660L);
        this.f33394n.addUpdateListener(this);
        this.f33394n.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m51256j(View view) {
        zym0.m222140a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m51257k() {
        TextView textView = this.f33381a;
        Animator animatorM132170p = gt0.m132170p(textView, "alpha", 0L, 600L, null, textView.getAlpha(), 0.0f);
        FrameLayout frameLayout = this.f33382b;
        gt0.m132180z(animatorM132170p, gt0.m132170p(frameLayout, "alpha", 0L, 600L, null, frameLayout.getAlpha(), 1.0f)).start();
        this.f33382b.setScaleX(1.0f);
        this.f33382b.setScaleY(1.0f);
        if (getContext() instanceof Act) {
            setVoiceCallTime(0L);
            this.f33400t = ((Act) getContext()).duringCreated(uqx.m197379C().f180530l).filter(new qcj() { // from class: l.xym0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Long) obj).longValue() > 0);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.yym0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202119a.m51264r((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final float m51258l(int i, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = f - this.f33390j[i];
        if (f3 > 600.0f) {
            f2 = 600.0f;
        } else if (f3 >= 0.0f) {
            f2 = f3;
        }
        return this.f33395o.getInterpolation(f2 / 600.0f);
    }

    /* JADX INFO: renamed from: m */
    public final int m51259m(int i, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = f - this.f33390j[i];
        if (f3 > 600.0f) {
            f2 = 600.0f;
        } else if (f3 >= 0.0f) {
            f2 = f3;
        }
        return (int) ((1.0f - this.f33395o.getInterpolation(f2 / 600.0f)) * this.f33391k[i]);
    }

    /* JADX INFO: renamed from: n */
    public final void m51260n() {
        xzm0.m213760p().m213771n();
    }

    /* JADX INFO: renamed from: o */
    public final void m51261o() {
        m51256j(this);
        this.f33396p = this.f33381a;
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.rym0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallControlView.m51252g(view);
            }
        });
        bnl0.m105509E0(this.f33385e, new View.OnClickListener() { // from class: l.sym0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171276a.m51265s(view);
            }
        });
        bnl0.m105509E0(this.f33388h, new View.OnClickListener() { // from class: l.tym0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176687a.m51266t(view);
            }
        });
        this.f33386f.setCheckChangeListener(new VoiceCallCheckeableImage.InterfaceC9097a() { // from class: l.uym0
            @Override // com.p051p1.mobile.putong.core.p058ui.view.VoiceCallCheckeableImage.InterfaceC9097a
            /* JADX INFO: renamed from: a */
            public final void mo57366a(VImage vImage, boolean z) {
                this.f181644a.m51267u(vImage, z);
            }
        });
        this.f33387g.setCheckChangeListener(new VoiceCallCheckeableImage.InterfaceC9097a() { // from class: l.vym0
            @Override // com.p051p1.mobile.putong.core.p058ui.view.VoiceCallCheckeableImage.InterfaceC9097a
            /* JADX INFO: renamed from: a */
            public final void mo57366a(VImage vImage, boolean z) {
                this.f186389a.m51268v(vImage, z);
            }
        });
        this.f33389i = new View[]{this.f33385e, this.f33386f, this.f33387g, this.f33388h};
        this.f33390j = new float[]{0.0f, 20.0f, 40.0f, 60.0f};
        this.f33391k = new int[]{qa00.m175859d(68.0f), qa00.m175859d(68.0f), qa00.m175859d(68.0f), qa00.m175859d(68.0f)};
        this.f33395o = new PathInterpolator(0.3f, 0.6f, 0.0f, 1.0f);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        setPercent(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f33400t);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51261o();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m51262p(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m51263q() {
        if (getContext() instanceof MessagesAct) {
            return ((MessagesAct) getContext()).mo50155d0().m201096E0();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m51264r(Long l2) {
        setVoiceCallTime(l2.longValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m51265s(View view) {
        sfj0.m185596c("e_voice_talking_hangup", getPageId(), new sfj0.C20032a[0]);
        qzm0.m178812h().m178819e("Hangup", xzm0.m213760p().m213768k());
        m51260n();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f33397q == 8 && NullChecker.m82486a(this.f33383c)) {
            this.f33383c.stopAnimation(false);
        }
    }

    public void setVoiceCallAnimListener(InterfaceC8762b interfaceC8762b) {
        this.f33398r = interfaceC8762b;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m51266t(View view) {
        sfj0.m185596c("e_voice_small", getPageId(), new sfj0.C20032a[0]);
        qzm0.m178812h().m178819e("ZoomClick", xzm0.m213760p().m213768k());
        xzm0.m213760p().m213781y(getContext());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m51267u(VImage vImage, boolean z) {
        sfj0.m185596c("e_voice_talking_mute", getPageId(), sfj0.C20032a.m185615h("mute_handsfree", z ? "on" : BLiveOperationTitleShowType.off));
        qzm0.m178812h().m178819e("MutExchange", "status:" + z + ",Detail:" + xzm0.m213760p().m213768k());
        w1n0.m204461h(z);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m51268v(VImage vImage, boolean z) {
        sfj0.m185596c("e_voice_talking_open", getPageId(), sfj0.C20032a.m185615h("mute_handsfree", z ? "on" : BLiveOperationTitleShowType.off));
        qzm0.m178812h().m178819e("TalkingOpen", "status:" + z + ",Detail:" + xzm0.m213760p().m213768k());
        w1n0.m204460g(z);
        o1j0.m165649w(z ? R$string.f21720g7 : R$string.f21711f7);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m51269w(View view, float f, float f2) {
        this.f33399s = view.getHeight();
        m51255A(f, f2, true);
    }

    /* JADX INFO: renamed from: x */
    public void m51270x(int i) {
        this.f33386f.setCheckWithoutCallback(w1n0.m204459f());
        this.f33387g.setCheckWithoutCallback(w1n0.m204456c());
        psd0.m173633z(this.f33400t);
        if (i == 1) {
            this.f33381a.setText(R$string.f21521I6);
            bnl0.m105524M(this.f33381a, true);
            this.f33396p = this.f33381a;
        } else if (i == 2) {
            this.f33381a.setText(R$string.f21702e7);
            bnl0.m105524M(this.f33381a, true);
            this.f33396p = this.f33381a;
        } else if (i == 3) {
            bnl0.m105524M(this.f33382b, true);
            FrameLayout frameLayout = this.f33382b;
            this.f33396p = frameLayout;
            frameLayout.setAlpha(0.0f);
            m51257k();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m51271y(int i, int i2) {
        if (i2 != 1) {
            m51272z(false);
            return;
        }
        bnl0.m105524M(this, true);
        setViewStateForAnim(true);
        m51270x(i);
        m51272z(true);
        i4g0.m138492A("e_voice_call_panel", getPageId(), pf60.m172085a("if_accepted", Boolean.valueOf(!m51262p(i))));
    }

    /* JADX INFO: renamed from: z */
    public final void m51272z(boolean z) {
        if (z || bnl0.m105529O0(this)) {
            if (z && !this.f33383c.isAnimating()) {
                SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/067d4299-324f-4cc5-8322-db0c9f14d0b111.so").into(this.f33383c);
            }
            final float fFloatValue = z ? 0.0f : 660.0f;
            final float f = z ? 660.0f : 0.0f;
            ValueAnimator valueAnimator = this.f33394n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                fFloatValue = ((Float) this.f33394n.getAnimatedValue()).floatValue();
                this.f33394n.cancel();
            }
            if (!z) {
                if (getContext() instanceof MessagesAct) {
                    View messageBarRoot = ((MessagesAct) getContext()).mo50138B0().m143374g0().m114041t0().getMessageBarRoot();
                    messageBarRoot.measure(View.MeasureSpec.makeMeasureSpec(messageBarRoot.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(1000.0f), Integer.MIN_VALUE));
                    this.f33399s = messageBarRoot.getMeasuredHeight();
                }
                m51255A(fFloatValue, f, false);
            } else if (getContext() instanceof MessagesAct) {
                final View messageBarRoot2 = ((MessagesAct) getContext()).mo50138B0().m143374g0().m114041t0().getMessageBarRoot();
                int height = messageBarRoot2.getHeight();
                this.f33399s = height;
                if (height > 0) {
                    m51255A(fFloatValue, f, true);
                } else {
                    messageBarRoot2.post(new Runnable() { // from class: l.wym0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f191661a.m51269w(messageBarRoot2, fFloatValue, f);
                        }
                    });
                }
            }
            this.f33401u = z;
        }
    }

    public VoiceCallControlView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33392l = new xjg();
        this.f33393m = 0.0f;
        this.f33397q = 1;
        this.f33401u = true;
    }

    public VoiceCallControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33392l = new xjg();
        this.f33393m = 0.0f;
        this.f33397q = 1;
        this.f33401u = true;
    }
}
