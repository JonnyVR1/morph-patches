package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown;

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
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import p151v.VDraweeView;
import p153l.bju;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.n0k;
import p153l.qa00;
import p153l.wo0;
import p153l.x20;
import p153l.zft;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f46119a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f46120b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f46121c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f46122d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f46123e;

    /* JADX INFO: renamed from: f */
    public x20 f46124f;

    /* JADX INFO: renamed from: g */
    public jjs f46125g;

    /* JADX INFO: renamed from: h */
    public Animator f46126h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f46127i;

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f46128j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f46129k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f46130l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView$a */
    public class C12687a implements CommonGiftCountDownView.InterfaceC12967a {
        public C12687a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: a */
        public void mo70782a() {
            if (LiveVChatCountdownView.this.f46124f != null) {
                LiveVChatCountdownView.this.f46124f.call();
            }
            if (LiveVChatCountdownView.this.f46127i != null && LiveVChatCountdownView.this.f46127i.isRunning()) {
                LiveVChatCountdownView.this.f46127i.pause();
            }
            if (LiveVChatCountdownView.this.f46128j != null && LiveVChatCountdownView.this.f46128j.isRunning()) {
                LiveVChatCountdownView.this.f46128j.pause();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LiveVChatCountdownView.this.f46119a, (Property<VDraweeView, Float>) View.ALPHA, LiveVChatCountdownView.this.f46119a.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(180L);
            objectAnimatorOfFloat.start();
            LiveVChatCountdownView.this.f46130l.start();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: b */
        public void mo70783b() {
            LiveVChatCountdownView.this.m70781x(false);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: c */
        public void mo70784c() {
            LiveVChatCountdownView.this.m70781x(true);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: d */
        public void mo70785d(boolean z) {
            LiveVChatCountdownView.this.f46126h.start();
            LiveVChatCountdownView.this.f46128j.start();
            LiveVChatCountdownView.this.m70781x(z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView$b */
    public class C12688b extends wo0 {
        public C12688b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            bnl0.m105524M(LiveVChatCountdownView.this.f46123e, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            bnl0.m105524M(LiveVChatCountdownView.this.f46123e, true);
        }
    }

    public LiveVChatCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m70765h(View view) {
        bju.m104771a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m70766i(x20 x20Var) {
        this.f46124f = x20Var;
    }

    /* JADX INFO: renamed from: j */
    public void m70767j() {
        this.f46122d.m74922B();
    }

    /* JADX INFO: renamed from: k */
    public final String m70768k(jjs jjsVar) {
        return BaseSei.f14624X + jjsVar.m145121g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l */
    public final ObjectAnimator m70769l(boolean z) {
        float rotation = this.f46119a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f46119a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f46127i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f46127i.setRepeatMode(-1);
        this.f46127i.setRepeatCount(-1);
        this.f46127i.setDuration(z ? 4000L : 12000L);
        return this.f46127i;
    }

    /* JADX INFO: renamed from: m */
    public final void m70770m() {
        m70771n();
        m70772o();
        n0k.m161008e(this.f46121c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: n */
    public final void m70771n() {
        Animator animatorM132168n = gt0.m132168n(this.f46119a, gt0.f106354i, 0.0f, 1.1f, 1.0f);
        this.f46126h = animatorM132168n;
        animatorM132168n.setDuration(600L);
        this.f46126h.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f46119a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f46128j = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f46128j.setDuration(2000L);
        this.f46128j.setRepeatMode(-1);
        this.f46128j.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: o */
    public final void m70772o() {
        AnimatorSet animatorSet = this.f46129k;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f46121c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            gt0.m132176v(objectAnimatorOfFloat, new Runnable() { // from class: l.aju
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71881a.m70774q();
                }
            });
            Animator animatorM132168n = gt0.m132168n(this.f46121c, gt0.f106354i, 3.0f, 0.7f);
            animatorM132168n.setDuration(140L);
            Animator animatorM132168n2 = gt0.m132168n(this.f46121c, gt0.f106354i, 0.7f, 1.0f);
            animatorM132168n2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorM132168n, animatorM132168n2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f46129k = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f46130l == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f46121c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f46130l = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70765h(this);
        m70773p();
        m70770m();
        izs.m142870u("context_livingAct", this.f46119a, zft.f204207b, qa00.m175859d(230.0f), qa00.m175859d(230.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m70773p() {
        this.f46122d.setOnCountDownListener(new C12687a());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m70774q() {
        this.f46121c.setText(m70768k(this.f46125g));
    }

    /* JADX INFO: renamed from: r */
    public void m70775r() {
        this.f46122d.m74937o();
        m70780w(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m70776s(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f46120b.clearAnimation();
        this.f46120b.m69683j(str, 1);
    }

    /* JADX INFO: renamed from: t */
    public void m70777t() {
        this.f46125g = null;
        this.f46122d.m74924D();
        this.f46120b.clearAnimation();
        this.f46122d.m74922B();
        this.f46119a.setController(null);
    }

    /* JADX INFO: renamed from: u */
    public void m70778u() {
        bnl0.m105525M0(this, false);
        this.f46122d.m74933M();
        this.f46122d.m74924D();
        this.f46119a.setController(null);
    }

    /* JADX INFO: renamed from: v */
    public void m70779v(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, boolean z) {
        jjs jjsVar2 = this.f46125g;
        if (jjsVar2 != null && !jjsVar2.m145131q(jjsVar)) {
            this.f46122d.m74924D();
        }
        this.f46125g = jjsVar;
        this.f46122d.setCountdownTime(jjsVar.m145120f());
        if (z && liveVChatGiftItemView.m70603B0()) {
            this.f46122d.m74931K();
            if (jjsVar.m145132r()) {
                m70780w(true);
            }
        } else {
            this.f46122d.m74930J();
            m70776s(jjsVar.m145117c());
        }
        if (jjsVar.m145117c()) {
            bnl0.m105524M(this.f46121c, false);
            return;
        }
        izs.m142870u("context_livingAct", this.f46119a, zft.f204207b, qa00.m175859d(230.0f), qa00.m175859d(230.0f));
        bnl0.m105524M(this.f46121c, true);
        this.f46129k.cancel();
        this.f46129k.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m70780w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f46123e;
        if (z) {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C12688b());
        } else {
            animEffectPlayer.clearAnimation();
            bnl0.m105524M(this.f46123e, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m70781x(boolean z) {
        ObjectAnimator objectAnimator = this.f46127i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            it0.m142007A(this.f46127i);
        }
        ObjectAnimator objectAnimatorM70769l = m70769l(z);
        this.f46127i = objectAnimatorM70769l;
        objectAnimatorM70769l.start();
    }

    public LiveVChatCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
