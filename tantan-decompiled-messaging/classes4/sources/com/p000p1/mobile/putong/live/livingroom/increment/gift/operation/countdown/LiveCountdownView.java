package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.ap0;
import l.bt0;
import l.d30;
import l.dt0;
import l.hce;
import l.hxs;
import l.t100;
import l.xdl0;
import l.ydt;
import p002l.d5s;
import p002l.ihs;
import p002l.xxj;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5847a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f5848b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f5849c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f5850d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f5851e;

    /* JADX INFO: renamed from: f */
    public d30 f5852f;

    /* JADX INFO: renamed from: g */
    public ihs f5853g;

    /* JADX INFO: renamed from: h */
    public Animator f5854h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f5855i;

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f5856j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f5857k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f5858l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView$a */
    public class C0396a implements CommonGiftCountDownView.InterfaceC0393a {
        public C0396a() {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: a */
        public void mo7316a() {
            if (LiveCountdownView.this.f5852f != null) {
                LiveCountdownView.this.f5852f.call();
            }
            if (LiveCountdownView.this.f5855i != null && LiveCountdownView.this.f5855i.isRunning()) {
                LiveCountdownView.this.f5855i.pause();
            }
            if (LiveCountdownView.this.f5856j != null && LiveCountdownView.this.f5856j.isRunning()) {
                LiveCountdownView.this.f5856j.pause();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LiveCountdownView.this.f5847a, (Property<VDraweeView, Float>) View.ALPHA, LiveCountdownView.this.f5847a.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(180L);
            objectAnimatorOfFloat.start();
            LiveCountdownView.this.f5858l.start();
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: b */
        public void mo7317b() {
            LiveCountdownView.this.m7353x(false);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: c */
        public void mo7318c() {
            LiveCountdownView.this.m7353x(true);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: d */
        public void mo7319d(boolean z) {
            LiveCountdownView.this.f5854h.start();
            LiveCountdownView.this.f5856j.start();
            LiveCountdownView.this.m7353x(z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView$b */
    public class C0397b extends ap0 {
        public C0397b() {
        }

        /* JADX INFO: renamed from: b */
        public void m7354b() {
            xdl0.M(LiveCountdownView.this.f5851e, false);
        }

        /* JADX INFO: renamed from: g */
        public void m7355g() {
            xdl0.M(LiveCountdownView.this.f5851e, true);
        }
    }

    public LiveCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m7337h(View view) {
        d5s.m11604a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m7338i(d30 d30Var) {
        this.f5852f = d30Var;
    }

    /* JADX INFO: renamed from: j */
    public void m7339j() {
        this.f5850d.m7289B();
    }

    /* JADX INFO: renamed from: k */
    public final String m7340k(ihs ihsVar) {
        return "x" + ihsVar.m15159g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l */
    public final ObjectAnimator m7341l(boolean z) {
        float rotation = this.f5847a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5847a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f5855i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f5855i.setRepeatMode(-1);
        this.f5855i.setRepeatCount(-1);
        this.f5855i.setDuration(z ? 4000L : 12000L);
        return this.f5855i;
    }

    /* JADX INFO: renamed from: m */
    public final void m7342m() {
        m7343n();
        m7344o();
        xxj.m26168e(this.f5849c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: n */
    public final void m7343n() {
        Animator animatorN = bt0.n(this.f5847a, bt0.i, new float[]{0.0f, 1.1f, 1.0f});
        this.f5854h = animatorN;
        animatorN.setDuration(600L);
        this.f5854h.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5847a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f5856j = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f5856j.setDuration(2000L);
        this.f5856j.setRepeatMode(-1);
        this.f5856j.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: o */
    public final void m7344o() {
        AnimatorSet animatorSet = this.f5857k;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5849c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            bt0.v(objectAnimatorOfFloat, new Runnable() { // from class: l.c5s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8491a.m7346q();
                }
            });
            Animator animatorN = bt0.n(this.f5849c, bt0.i, new float[]{3.0f, 0.7f});
            animatorN.setDuration(140L);
            Animator animatorN2 = bt0.n(this.f5849c, bt0.i, new float[]{0.7f, 1.0f});
            animatorN2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorN, animatorN2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f5857k = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f5858l == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f5849c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f5858l = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7337h(this);
        m7345p();
        m7342m();
        hxs.u("context_livingAct", this.f5847a, ydt.b, t100.d(230.0f), t100.d(230.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m7345p() {
        this.f5850d.setOnCountDownListener(new C0396a());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m7346q() {
        this.f5849c.setText(m7340k(this.f5853g));
    }

    /* JADX INFO: renamed from: r */
    public void m7347r() {
        this.f5850d.m7304o();
        m7352w(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m7348s(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f5848b.clearAnimation();
        this.f5848b.j(str, 1);
    }

    /* JADX INFO: renamed from: t */
    public void m7349t() {
        this.f5853g = null;
        this.f5850d.m7291D();
        this.f5848b.clearAnimation();
        this.f5850d.m7289B();
        this.f5847a.setController((hce) null);
    }

    /* JADX INFO: renamed from: u */
    public void m7350u() {
        xdl0.M0(this, false);
        this.f5850d.m7300M();
        this.f5850d.m7291D();
        this.f5847a.setController((hce) null);
    }

    /* JADX INFO: renamed from: v */
    public void m7351v(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        ihs ihsVar2 = this.f5853g;
        if (ihsVar2 != null && !ihsVar2.m15169q(ihsVar)) {
            this.f5850d.m7291D();
        }
        this.f5853g = ihsVar;
        this.f5850d.setCountdownTime(ihsVar.m15158f());
        if (z && liveGiftItemView.m7016E0()) {
            this.f5850d.m7298K();
            if (ihsVar.m15170r()) {
                m7352w(true);
            }
        } else {
            this.f5850d.m7297J();
            m7348s(ihsVar.m15155c());
        }
        if (ihsVar.m15155c()) {
            xdl0.M(this.f5849c, false);
            return;
        }
        hxs.u("context_livingAct", this.f5847a, ydt.b, t100.d(230.0f), t100.d(230.0f));
        xdl0.M(this.f5849c, true);
        this.f5857k.cancel();
        this.f5857k.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m7352w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f5851e;
        if (z) {
            animEffectPlayer.l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C0397b());
        } else {
            animEffectPlayer.clearAnimation();
            xdl0.M(this.f5851e, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7353x(boolean z) {
        ObjectAnimator objectAnimator = this.f5855i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            dt0.A(this.f5855i);
        }
        ObjectAnimator objectAnimatorM7341l = m7341l(z);
        this.f5855i = objectAnimatorM7341l;
        objectAnimatorM7341l.start();
    }

    public LiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
