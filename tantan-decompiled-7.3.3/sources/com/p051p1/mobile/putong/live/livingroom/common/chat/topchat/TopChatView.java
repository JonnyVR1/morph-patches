package com.p051p1.mobile.putong.live.livingroom.common.chat.topchat;

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
import com.p051p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.bri0;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.l51;
import p153l.n3d0;
import p153l.n3j0;
import p153l.qa00;
import p153l.w3j0;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class TopChatView extends ConstraintLayout implements iam<n3j0> {

    /* JADX INFO: renamed from: d */
    public TopChatView f49799d;

    /* JADX INFO: renamed from: e */
    public CardView f49800e;

    /* JADX INFO: renamed from: f */
    public View f49801f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49802g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49803h;

    /* JADX INFO: renamed from: i */
    public VText f49804i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f49805j;

    /* JADX INFO: renamed from: k */
    public n3j0 f49806k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f49807l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f49808m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f49809n;

    /* JADX INFO: renamed from: o */
    public int f49810o;

    /* JADX INFO: renamed from: p */
    public boolean f49811p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView$a */
    public class C12911a extends AnimatorListenerAdapter {
        public C12911a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(TopChatView.this.f49801f, false);
            TopChatView.this.m73968D0(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bnl0.m105524M(TopChatView.this.f49801f, true);
        }
    }

    public TopChatView(Context context) {
        super(context);
        this.f49810o = -1;
        this.f49811p = false;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m73967B0(BLiveTopChatMessage bLiveTopChatMessage, View view) {
        this.f49806k.m161324R3(bLiveTopChatMessage.userId);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public void m73968D0(final x20 x20Var) {
        if (this.f49808m == null) {
            this.f49808m = new AnimatorSet();
            this.f49808m.playTogether(ObjectAnimator.ofFloat(this.f49799d, (Property<TopChatView, Float>) View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f49799d, (Property<TopChatView, Float>) View.TRANSLATION_X, 0.0f, qa00.m175859d(31.0f)));
            this.f49808m.setDuration(250L);
        }
        it0.m142007A(this.f49808m);
        gt0.m132177w(this.f49808m, new Runnable() { // from class: l.q3j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155452a.m73976s0();
            }
        }, new Runnable() { // from class: l.r3j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161044a.m73977t0(x20Var);
            }
        });
        this.f49808m.start();
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void m73981y0(long j, float f) {
        it0.m142007A(this.f49809n);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f49809n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f49809n.setInterpolator(new LinearInterpolator());
        this.f49809n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.u3j0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f177347a.m73978u0(valueAnimator);
            }
        });
        this.f49809n.addListener(new C12911a());
        this.f49809n.start();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m73970G0(final String str, final long j, final float f) {
        if (this.f49807l == null) {
            this.f49807l = new ObjectAnimator();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49799d, (Property<TopChatView, Float>) View.TRANSLATION_X, -qa00.m175859d(300.0f), 0.0f);
            this.f49807l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(250L);
            this.f49807l.setInterpolator(new LinearInterpolator());
        }
        it0.m142007A(this.f49807l);
        gt0.m132177w(this.f49807l, new Runnable() { // from class: l.s3j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f166015a.m73980w0(str);
            }
        }, new Runnable() { // from class: l.t3j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171925a.m73981y0(j, f);
            }
        });
        this.f49807l.start();
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public void m73982z0(final BLiveTopChatMessage bLiveTopChatMessage) {
        if (bLiveTopChatMessage.seqId <= this.f49810o || !bLiveTopChatMessage.isInValidMessage()) {
            return;
        }
        long j = bLiveTopChatMessage.endTime;
        long j2 = j - bLiveTopChatMessage.startTime;
        long j3 = j - bLiveTopChatMessage.currentTime;
        float f = j3 / j2;
        if (this.f49811p) {
            m73968D0(new x20() { // from class: l.o3j0
                @Override // p153l.x20
                public final void call() {
                    this.f144840a.m73982z0(bLiveTopChatMessage);
                }
            });
            return;
        }
        this.f49810o = bLiveTopChatMessage.seqId;
        this.f49804i.setText(bLiveTopChatMessage.content);
        this.f49799d.requestLayout();
        izs.m142868s("context_livingAct", this.f49803h, bLiveTopChatMessage.userImage);
        this.f49800e.setCardBackgroundColor(n3d0.m161283g(bLiveTopChatMessage.backgroundColor));
        this.f49801f.setBackground(n3d0.m161279c(bLiveTopChatMessage.maskColor, 10));
        bnl0.m105509E0(this.f49799d, new View.OnClickListener() { // from class: l.p3j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150410a.m73967B0(bLiveTopChatMessage, view);
            }
        });
        m73970G0(bLiveTopChatMessage.cornerUrl, j3, f);
    }

    /* JADX INFO: renamed from: I0 */
    public void m73972I0(boolean z) {
        bnl0.m105524M(this.f49799d, z);
    }

    @Override // p153l.iam
    public void destroy() {
        m73975r0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73973p0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m73973p0(View view) {
        w3j0.m204767a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(n3j0 n3j0Var) {
        this.f49806k = n3j0Var;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m73975r0() {
        it0.m142007A(this.f49807l);
        it0.m142007A(this.f49809n);
        it0.m142007A(this.f49808m);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m73976s0() {
        it0.m142007A(this.f49809n);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m73977t0(x20 x20Var) {
        bnl0.m105524M(this.f49805j, false);
        this.f49811p = false;
        if (x20Var != null) {
            postDelayed(new bri0(x20Var), 100L);
        } else {
            bnl0.m105524M(this.f49799d, false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m73978u0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
            return;
        }
        bnl0.m105507D0((int) (fFloatValue * this.f49800e.getWidth()), this.f49801f);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m73979v0(String str) {
        this.f49805j.mo69680g(str, 1, null, true);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m73980w0(final String str) {
        bnl0.m105524M(this.f49799d, true);
        this.f49799d.setAlpha(1.0f);
        this.f49811p = true;
        bnl0.m105525M0(this.f49805j, true);
        l51.m152888H(getContext(), new Runnable() { // from class: l.v3j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182213a.m73979v0(str);
            }
        }, 100L);
    }

    public TopChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49810o = -1;
        this.f49811p = false;
    }

    public TopChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49810o = -1;
        this.f49811p = false;
    }
}
