package com.p046p1.mobile.putong.core.p053ui.messages.voicecall;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.voicecall.VoiceCallControlView;
import com.p046p1.mobile.putong.core.p053ui.view.VoiceCallCheckeableImage;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.bt0;
import p149l.c4g0;
import p149l.e30;
import p149l.j760;
import p149l.jig;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqm0;
import p149l.o6j0;
import p149l.ssm0;
import p149l.t100;
import p149l.tqm0;
import p149l.vpm0;
import p149l.w9j;
import p149l.xdl0;
import p149l.xhx;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceCallControlView extends LinearLayout implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public TextView f32533a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f32534b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f32535c;

    /* JADX INFO: renamed from: d */
    public TextView f32536d;

    /* JADX INFO: renamed from: e */
    public VImage f32537e;

    /* JADX INFO: renamed from: f */
    public VoiceCallCheckeableImage f32538f;

    /* JADX INFO: renamed from: g */
    public VoiceCallCheckeableImage f32539g;

    /* JADX INFO: renamed from: h */
    public VImage f32540h;

    /* JADX INFO: renamed from: i */
    public View[] f32541i;

    /* JADX INFO: renamed from: j */
    public float[] f32542j;

    /* JADX INFO: renamed from: k */
    public int[] f32543k;

    /* JADX INFO: renamed from: l */
    public Interpolator f32544l;

    /* JADX INFO: renamed from: m */
    public final float f32545m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f32546n;

    /* JADX INFO: renamed from: o */
    public PathInterpolator f32547o;

    /* JADX INFO: renamed from: p */
    public View f32548p;

    /* JADX INFO: renamed from: q */
    public int f32549q;

    /* JADX INFO: renamed from: r */
    public InterfaceC8599b f32550r;

    /* JADX INFO: renamed from: s */
    public int f32551s;

    /* JADX INFO: renamed from: t */
    public c4g0 f32552t;

    /* JADX INFO: renamed from: u */
    public boolean f32553u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView$a */
    public class C8598a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f32554a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f32555b;

        public C8598a(boolean z) {
            this.f32555b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f32554a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f32554a) {
                return;
            }
            if (!this.f32555b) {
                xdl0.m208344M(VoiceCallControlView.this, false);
            }
            if (NullChecker.m81303a(VoiceCallControlView.this.f32550r)) {
                VoiceCallControlView.this.f32550r.mo50090a(this.f32555b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f32554a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView$b */
    public interface InterfaceC8599b {
        /* JADX INFO: renamed from: a */
        void mo50090a(boolean z);

        /* JADX INFO: renamed from: b */
        void mo50091b(float f, int i, int i2, boolean z);
    }

    public VoiceCallControlView(Context context) {
        super(context);
        this.f32544l = new jig();
        this.f32545m = 0.0f;
        this.f32549q = 1;
        this.f32553u = true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m50069g(View view) {
    }

    private String getPageId() {
        return OMSDialogPositon.p_chat_view;
    }

    private void setPercent(float f) {
        for (int i = 0; i < 4; i++) {
            View view = this.f32541i[i];
            view.setTranslationY(m50076m(i, f));
            view.setAlpha(m50075l(i, f));
        }
        float f2 = f - 0.0f;
        if (f2 > 600.0f) {
            f2 = 600.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float interpolation = this.f32547o.getInterpolation(f2 / 600.0f);
        View view2 = this.f32548p;
        if (interpolation < 0.0f) {
            view2.setAlpha(0.0f);
        } else {
            view2.setAlpha(interpolation);
            float f3 = (0.19999999f * interpolation) + 0.8f;
            this.f32548p.setScaleY(f3);
            this.f32548p.setScaleX(f3);
        }
        if (this.f32553u || m50080q()) {
            if (!NullChecker.m81303a(this.f32550r) || interpolation > 1.0f) {
                return;
            }
            this.f32550r.mo50091b(interpolation, this.f32551s, getHeight(), this.f32553u);
            return;
        }
        if (NullChecker.m81303a(this.f32550r)) {
            float f4 = 660.0f - f;
            if (f4 >= 390.0f) {
                f4 = 390.0f;
            }
            this.f32550r.mo50091b(1.0f - this.f32544l.getInterpolation(f4 / 390.0f), this.f32551s, getHeight(), this.f32553u);
        }
    }

    private void setViewStateForAnim(boolean z) {
        if (z) {
            for (int i = 0; i < 4; i++) {
                View view = this.f32541i[i];
                view.setTranslationY(this.f32543k[i]);
                view.setAlpha(0.0f);
            }
            this.f32533a.setAlpha(0.0f);
            this.f32534b.setAlpha(0.0f);
        }
    }

    private void setVoiceCallTime(long j) {
        this.f32536d.setText(String.format(CoreModule.f17544b.getResources().getString(R$string.f20827O6), ssm0.m185758b(j)));
    }

    /* JADX INFO: renamed from: A */
    public final void m50072A(float f, float f2, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f32546n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new C8598a(z));
        this.f32546n.setDuration(660L);
        this.f32546n.addUpdateListener(this);
        this.f32546n.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m50073j(View view) {
        vpm0.m199280a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m50074k() {
        TextView textView = this.f32533a;
        Animator animatorM103743p = bt0.m103743p(textView, "alpha", 0L, 600L, null, textView.getAlpha(), 0.0f);
        FrameLayout frameLayout = this.f32534b;
        bt0.m103753z(animatorM103743p, bt0.m103743p(frameLayout, "alpha", 0L, 600L, null, frameLayout.getAlpha(), 1.0f)).start();
        this.f32534b.setScaleX(1.0f);
        this.f32534b.setScaleY(1.0f);
        if (getContext() instanceof Act) {
            setVoiceCallTime(0L);
            this.f32552t = ((Act) getContext()).duringCreated(xhx.m208850C().f192943l).filter(new w9j() { // from class: l.tpm0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Long) obj).longValue() > 0);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.upm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177646a.m50081r((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final float m50075l(int i, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = f - this.f32542j[i];
        if (f3 > 600.0f) {
            f2 = 600.0f;
        } else if (f3 >= 0.0f) {
            f2 = f3;
        }
        return this.f32547o.getInterpolation(f2 / 600.0f);
    }

    /* JADX INFO: renamed from: m */
    public final int m50076m(int i, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = f - this.f32542j[i];
        if (f3 > 600.0f) {
            f2 = 600.0f;
        } else if (f3 >= 0.0f) {
            f2 = f3;
        }
        return (int) ((1.0f - this.f32547o.getInterpolation(f2 / 600.0f)) * this.f32543k[i]);
    }

    /* JADX INFO: renamed from: n */
    public final void m50077n() {
        tqm0.m190131p().m190142n();
    }

    /* JADX INFO: renamed from: o */
    public final void m50078o() {
        m50073j(this);
        this.f32548p = this.f32533a;
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.npm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallControlView.m50069g(view);
            }
        });
        xdl0.m208329E0(this.f32537e, new View.OnClickListener() { // from class: l.opm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145017a.m50082s(view);
            }
        });
        xdl0.m208329E0(this.f32540h, new View.OnClickListener() { // from class: l.ppm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150664a.m50083t(view);
            }
        });
        this.f32538f.setCheckChangeListener(new VoiceCallCheckeableImage.InterfaceC8934a() { // from class: l.qpm0
            @Override // com.p046p1.mobile.putong.core.p053ui.view.VoiceCallCheckeableImage.InterfaceC8934a
            /* JADX INFO: renamed from: a */
            public final void mo56183a(VImage vImage, boolean z) {
                this.f155781a.m50084u(vImage, z);
            }
        });
        this.f32539g.setCheckChangeListener(new VoiceCallCheckeableImage.InterfaceC8934a() { // from class: l.rpm0
            @Override // com.p046p1.mobile.putong.core.p053ui.view.VoiceCallCheckeableImage.InterfaceC8934a
            /* JADX INFO: renamed from: a */
            public final void mo56183a(VImage vImage, boolean z) {
                this.f160523a.m50085v(vImage, z);
            }
        });
        this.f32541i = new View[]{this.f32537e, this.f32538f, this.f32539g, this.f32540h};
        this.f32542j = new float[]{0.0f, 20.0f, 40.0f, 60.0f};
        this.f32543k = new int[]{t100.m186890d(68.0f), t100.m186890d(68.0f), t100.m186890d(68.0f), t100.m186890d(68.0f)};
        this.f32547o = new PathInterpolator(0.3f, 0.6f, 0.0f, 1.0f);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        setPercent(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f32552t);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50078o();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m50079p(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m50080q() {
        if (getContext() instanceof MessagesAct) {
            return ((MessagesAct) getContext()).mo48971c0().m213051E0();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m50081r(Long l2) {
        setVoiceCallTime(l2.longValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m50082s(View view) {
        o6j0.m162859c("e_voice_talking_hangup", getPageId(), new o6j0.C18854a[0]);
        mqm0.m155965h().m155972e("Hangup", tqm0.m190131p().m190139k());
        m50077n();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f32549q == 8 && NullChecker.m81303a(this.f32535c)) {
            this.f32535c.stopAnimation(false);
        }
    }

    public void setVoiceCallAnimListener(InterfaceC8599b interfaceC8599b) {
        this.f32550r = interfaceC8599b;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m50083t(View view) {
        o6j0.m162859c("e_voice_small", getPageId(), new o6j0.C18854a[0]);
        mqm0.m155965h().m155972e("ZoomClick", tqm0.m190131p().m190139k());
        tqm0.m190131p().m190152y(getContext());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m50084u(VImage vImage, boolean z) {
        o6j0.m162859c("e_voice_talking_mute", getPageId(), o6j0.C18854a.m162878h("mute_handsfree", z ? "on" : BLiveOperationTitleShowType.off));
        mqm0.m155965h().m155972e("MutExchange", "status:" + z + ",Detail:" + tqm0.m190131p().m190139k());
        ssm0.m185764h(z);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m50085v(VImage vImage, boolean z) {
        o6j0.m162859c("e_voice_talking_open", getPageId(), o6j0.C18854a.m162878h("mute_handsfree", z ? "on" : BLiveOperationTitleShowType.off));
        mqm0.m155965h().m155972e("TalkingOpen", "status:" + z + ",Detail:" + tqm0.m190131p().m190139k());
        ssm0.m185763g(z);
        lsi0.m151593w(z ? R$string.f20978g7 : R$string.f20969f7);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m50086w(View view, float f, float f2) {
        this.f32551s = view.getHeight();
        m50072A(f, f2, true);
    }

    /* JADX INFO: renamed from: x */
    public void m50087x(int i) {
        this.f32538f.setCheckWithoutCallback(ssm0.m185762f());
        this.f32539g.setCheckWithoutCallback(ssm0.m185759c());
        mkd0.m154992z(this.f32552t);
        if (i == 1) {
            this.f32533a.setText(R$string.f20779I6);
            xdl0.m208344M(this.f32533a, true);
            this.f32548p = this.f32533a;
        } else if (i == 2) {
            this.f32533a.setText(R$string.f20960e7);
            xdl0.m208344M(this.f32533a, true);
            this.f32548p = this.f32533a;
        } else if (i == 3) {
            xdl0.m208344M(this.f32534b, true);
            FrameLayout frameLayout = this.f32534b;
            this.f32548p = frameLayout;
            frameLayout.setAlpha(0.0f);
            m50074k();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m50088y(int i, int i2) {
        if (i2 != 1) {
            m50089z(false);
            return;
        }
        xdl0.m208344M(this, true);
        setViewStateForAnim(true);
        m50087x(i);
        m50089z(true);
        zvf0.m220368A("e_voice_call_panel", getPageId(), j760.m140076a("if_accepted", Boolean.valueOf(!m50079p(i))));
    }

    /* JADX INFO: renamed from: z */
    public final void m50089z(boolean z) {
        if (z || xdl0.m208349O0(this)) {
            if (z && !this.f32535c.isAnimating()) {
                SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/067d4299-324f-4cc5-8322-db0c9f14d0b111.so").into(this.f32535c);
            }
            final float fFloatValue = z ? 0.0f : 660.0f;
            final float f = z ? 660.0f : 0.0f;
            ValueAnimator valueAnimator = this.f32546n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                fFloatValue = ((Float) this.f32546n.getAnimatedValue()).floatValue();
                this.f32546n.cancel();
            }
            if (!z) {
                if (getContext() instanceof MessagesAct) {
                    View messageBarRoot = ((MessagesAct) getContext()).mo48954A0().m156457g0().m128210t0().getMessageBarRoot();
                    messageBarRoot.measure(View.MeasureSpec.makeMeasureSpec(messageBarRoot.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(t100.m186890d(1000.0f), Integer.MIN_VALUE));
                    this.f32551s = messageBarRoot.getMeasuredHeight();
                }
                m50072A(fFloatValue, f, false);
            } else if (getContext() instanceof MessagesAct) {
                final View messageBarRoot2 = ((MessagesAct) getContext()).mo48954A0().m156457g0().m128210t0().getMessageBarRoot();
                int height = messageBarRoot2.getHeight();
                this.f32551s = height;
                if (height > 0) {
                    m50072A(fFloatValue, f, true);
                } else {
                    messageBarRoot2.post(new Runnable() { // from class: l.spm0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f165867a.m50086w(messageBarRoot2, fFloatValue, f);
                        }
                    });
                }
            }
            this.f32553u = z;
        }
    }

    public VoiceCallControlView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32544l = new jig();
        this.f32545m = 0.0f;
        this.f32549q = 1;
        this.f32553u = true;
    }

    public VoiceCallControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32544l = new jig();
        this.f32545m = 0.0f;
        this.f32549q = 1;
        this.f32553u = true;
    }
}
