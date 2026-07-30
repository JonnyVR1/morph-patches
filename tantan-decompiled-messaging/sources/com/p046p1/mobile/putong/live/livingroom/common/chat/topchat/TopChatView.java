package com.p046p1.mobile.putong.live.livingroom.common.chat.topchat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bii0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.e51;
import p149l.hxs;
import p149l.jui0;
import p149l.kvc0;
import p149l.s7m;
import p149l.sui0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TopChatView extends ConstraintLayout implements s7m<jui0> {

    /* JADX INFO: renamed from: d */
    public TopChatView f48951d;

    /* JADX INFO: renamed from: e */
    public CardView f48952e;

    /* JADX INFO: renamed from: f */
    public View f48953f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f48954g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f48955h;

    /* JADX INFO: renamed from: i */
    public VText f48956i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f48957j;

    /* JADX INFO: renamed from: k */
    public jui0 f48958k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f48959l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f48960m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f48961n;

    /* JADX INFO: renamed from: o */
    public int f48962o;

    /* JADX INFO: renamed from: p */
    public boolean f48963p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView$a */
    public class C12748a extends AnimatorListenerAdapter {
        public C12748a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(TopChatView.this.f48953f, false);
            TopChatView.this.m72785D0(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.m208344M(TopChatView.this.f48953f, true);
        }
    }

    public TopChatView(Context context) {
        super(context);
        this.f48962o = -1;
        this.f48963p = false;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m72784B0(BLiveTopChatMessage bLiveTopChatMessage, View view) {
        this.f48958k.m143316R3(bLiveTopChatMessage.userId);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public void m72785D0(final d30 d30Var) {
        if (this.f48960m == null) {
            this.f48960m = new AnimatorSet();
            this.f48960m.playTogether(ObjectAnimator.ofFloat(this.f48951d, (Property<TopChatView, Float>) View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f48951d, (Property<TopChatView, Float>) View.TRANSLATION_X, 0.0f, t100.m186890d(31.0f)));
            this.f48960m.setDuration(250L);
        }
        dt0.m113501A(this.f48960m);
        bt0.m103750w(this.f48960m, new Runnable() { // from class: l.mui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135793a.m72793s0();
            }
        }, new Runnable() { // from class: l.nui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140629a.m72794t0(d30Var);
            }
        });
        this.f48960m.start();
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void m72798y0(long j, float f) {
        dt0.m113501A(this.f48961n);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f48961n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f48961n.setInterpolator(new LinearInterpolator());
        this.f48961n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qui0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f156513a.m72795u0(valueAnimator);
            }
        });
        this.f48961n.addListener(new C12748a());
        this.f48961n.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m72787G0(final String str, final long j, final float f) {
        if (this.f48959l == null) {
            this.f48959l = new ObjectAnimator();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48951d, (Property<TopChatView, Float>) View.TRANSLATION_X, -t100.m186890d(300.0f), 0.0f);
            this.f48959l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(250L);
            this.f48959l.setInterpolator(new LinearInterpolator());
        }
        dt0.m113501A(this.f48959l);
        bt0.m103750w(this.f48959l, new Runnable() { // from class: l.oui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f145706a.m72797w0(str);
            }
        }, new Runnable() { // from class: l.pui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151294a.m72798y0(j, f);
            }
        });
        this.f48959l.start();
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public void m72799z0(final BLiveTopChatMessage bLiveTopChatMessage) {
        if (bLiveTopChatMessage.seqId <= this.f48962o || !bLiveTopChatMessage.isInValidMessage()) {
            return;
        }
        long j = bLiveTopChatMessage.endTime;
        long j2 = j - bLiveTopChatMessage.startTime;
        long j3 = j - bLiveTopChatMessage.currentTime;
        float f = j3 / j2;
        if (this.f48963p) {
            m72785D0(new d30() { // from class: l.kui0
                @Override // p149l.d30
                public final void call() {
                    this.f124694a.m72799z0(bLiveTopChatMessage);
                }
            });
            return;
        }
        this.f48962o = bLiveTopChatMessage.seqId;
        this.f48956i.setText(bLiveTopChatMessage.content);
        this.f48951d.requestLayout();
        hxs.m133406s("context_livingAct", this.f48955h, bLiveTopChatMessage.userImage);
        this.f48952e.setCardBackgroundColor(kvc0.m147358g(bLiveTopChatMessage.backgroundColor));
        this.f48953f.setBackground(kvc0.m147354c(bLiveTopChatMessage.maskColor, 10));
        xdl0.m208329E0(this.f48951d, new View.OnClickListener() { // from class: l.lui0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130069a.m72784B0(bLiveTopChatMessage, view);
            }
        });
        m72787G0(bLiveTopChatMessage.cornerUrl, j3, f);
    }

    /* JADX INFO: renamed from: I0 */
    public void m72789I0(boolean z) {
        xdl0.m208344M(this.f48951d, z);
    }

    @Override // p149l.s7m
    public void destroy() {
        m72792r0();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72790p0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m72790p0(View view) {
        sui0.m186014a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jui0 jui0Var) {
        this.f48958k = jui0Var;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m72792r0() {
        dt0.m113501A(this.f48959l);
        dt0.m113501A(this.f48961n);
        dt0.m113501A(this.f48960m);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m72793s0() {
        dt0.m113501A(this.f48961n);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m72794t0(d30 d30Var) {
        xdl0.m208344M(this.f48957j, false);
        this.f48963p = false;
        if (d30Var != null) {
            postDelayed(new bii0(d30Var), 100L);
        } else {
            xdl0.m208344M(this.f48951d, false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m72795u0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
            return;
        }
        xdl0.m208327D0((int) (fFloatValue * this.f48952e.getWidth()), this.f48953f);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m72796v0(String str) {
        this.f48957j.mo68497g(str, 1, null, true);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m72797w0(final String str) {
        xdl0.m208344M(this.f48951d, true);
        this.f48951d.setAlpha(1.0f);
        this.f48963p = true;
        xdl0.m208345M0(this.f48957j, true);
        e51.m114743H(getContext(), new Runnable() { // from class: l.rui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161060a.m72796v0(str);
            }
        }, 100L);
    }

    public TopChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48962o = -1;
        this.f48963p = false;
    }

    public TopChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48962o = -1;
        this.f48963p = false;
    }
}
