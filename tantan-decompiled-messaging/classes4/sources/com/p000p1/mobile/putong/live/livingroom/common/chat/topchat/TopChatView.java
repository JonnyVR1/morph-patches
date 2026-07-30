package com.p000p1.mobile.putong.live.livingroom.common.chat.topchat;

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
import com.p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.ap0;
import l.bii0;
import l.bt0;
import l.d30;
import l.dt0;
import l.e51;
import l.hxs;
import l.kvc0;
import l.s7m;
import l.t100;
import l.xdl0;
import p002l.jui0;
import p002l.sui0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TopChatView extends ConstraintLayout implements s7m<jui0> {

    /* JADX INFO: renamed from: d */
    public TopChatView f4993d;

    /* JADX INFO: renamed from: e */
    public CardView f4994e;

    /* JADX INFO: renamed from: f */
    public View f4995f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4996g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4997h;

    /* JADX INFO: renamed from: i */
    public VText f4998i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f4999j;

    /* JADX INFO: renamed from: k */
    public jui0 f5000k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f5001l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f5002m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f5003n;

    /* JADX INFO: renamed from: o */
    public int f5004o;

    /* JADX INFO: renamed from: p */
    public boolean f5005p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView$a */
    public class C0337a extends AnimatorListenerAdapter {
        public C0337a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(TopChatView.this.f4995f, false);
            TopChatView.this.m6293D0(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.M(TopChatView.this.f4995f, true);
        }
    }

    public TopChatView(Context context) {
        super(context);
        this.f5004o = -1;
        this.f5005p = false;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m6291B0(BLiveTopChatMessage bLiveTopChatMessage, View view) {
        this.f5000k.m16266R3(bLiveTopChatMessage.userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6292C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public void m6293D0(final d30 d30Var) {
        if (this.f5002m == null) {
            this.f5002m = new AnimatorSet();
            this.f5002m.playTogether(ObjectAnimator.ofFloat(this.f4993d, (Property<TopChatView, Float>) View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f4993d, (Property<TopChatView, Float>) View.TRANSLATION_X, 0.0f, t100.d(31.0f)));
            this.f5002m.setDuration(250L);
        }
        dt0.A(this.f5002m);
        bt0.w(this.f5002m, new Runnable() { // from class: l.mui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15640a.m6302s0();
            }
        }, new Runnable() { // from class: l.nui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16203a.m6303t0(d30Var);
            }
        });
        this.f5002m.start();
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void m6307y0(long j, float f) {
        dt0.A(this.f5003n);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f5003n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f5003n.setInterpolator(new LinearInterpolator());
        this.f5003n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qui0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18239a.m6304u0(valueAnimator);
            }
        });
        this.f5003n.addListener(new C0337a());
        this.f5003n.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m6295G0(final String str, final long j, final float f) {
        if (this.f5001l == null) {
            this.f5001l = new ObjectAnimator();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4993d, (Property<TopChatView, Float>) View.TRANSLATION_X, -t100.d(300.0f), 0.0f);
            this.f5001l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(250L);
            this.f5001l.setInterpolator(new LinearInterpolator());
        }
        dt0.A(this.f5001l);
        bt0.w(this.f5001l, new Runnable() { // from class: l.oui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16798a.m6306w0(str);
            }
        }, new Runnable() { // from class: l.pui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17655a.m6307y0(j, f);
            }
        });
        this.f5001l.start();
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public void m6308z0(final BLiveTopChatMessage bLiveTopChatMessage) {
        if (bLiveTopChatMessage.seqId <= this.f5004o || !bLiveTopChatMessage.isInValidMessage()) {
            return;
        }
        long j = bLiveTopChatMessage.endTime;
        long j2 = j - bLiveTopChatMessage.startTime;
        long j3 = j - bLiveTopChatMessage.currentTime;
        float f = j3 / j2;
        if (this.f5005p) {
            m6293D0(new d30() { // from class: l.kui0
                public final void call() {
                    this.f14536a.m6308z0(bLiveTopChatMessage);
                }
            });
            return;
        }
        this.f5004o = bLiveTopChatMessage.seqId;
        this.f4998i.setText(bLiveTopChatMessage.content);
        this.f4993d.requestLayout();
        hxs.s("context_livingAct", this.f4997h, bLiveTopChatMessage.userImage);
        this.f4994e.setCardBackgroundColor(kvc0.g(bLiveTopChatMessage.backgroundColor));
        this.f4995f.setBackground(kvc0.c(bLiveTopChatMessage.maskColor, 10));
        xdl0.E0(this.f4993d, new View.OnClickListener() { // from class: l.lui0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15071a.m6291B0(bLiveTopChatMessage, view);
            }
        });
        m6295G0(bLiveTopChatMessage.cornerUrl, j3, f);
    }

    /* JADX INFO: renamed from: I0 */
    public void m6297I0(boolean z) {
        xdl0.M(this.f4993d, z);
    }

    public void destroy() {
        m6301r0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6299p0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m6299p0(View view) {
        sui0.m22705a(this, view);
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void m6298i1(jui0 jui0Var) {
        this.f5000k = jui0Var;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m6301r0() {
        dt0.A(this.f5001l);
        dt0.A(this.f5003n);
        dt0.A(this.f5002m);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m6302s0() {
        dt0.A(this.f5003n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m6303t0(d30 d30Var) {
        xdl0.M(this.f4999j, false);
        this.f5005p = false;
        if (d30Var != null) {
            postDelayed(new bii0(d30Var), 100L);
        } else {
            xdl0.M(this.f4993d, false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m6304u0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
            return;
        }
        xdl0.D0((int) (fFloatValue * this.f4994e.getWidth()), new View[]{this.f4995f});
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m6305v0(String str) {
        this.f4999j.g(str, 1, (ap0) null, true);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m6306w0(final String str) {
        xdl0.M(this.f4993d, true);
        this.f4993d.setAlpha(1.0f);
        this.f5005p = true;
        xdl0.M0(this.f4999j, true);
        e51.H(m6292C0(), new Runnable() { // from class: l.rui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18686a.m6305v0(str);
            }
        }, 100L);
    }

    public TopChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5004o = -1;
        this.f5005p = false;
    }

    public TopChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5004o = -1;
        this.f5005p = false;
    }
}
