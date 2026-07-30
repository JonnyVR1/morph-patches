package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown;

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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import p147v.VDraweeView;
import p149l.ahu;
import p149l.ap0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.hxs;
import p149l.ihs;
import p149l.t100;
import p149l.xdl0;
import p149l.xxj;
import p149l.ydt;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f45271a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f45272b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f45273c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f45274d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f45275e;

    /* JADX INFO: renamed from: f */
    public d30 f45276f;

    /* JADX INFO: renamed from: g */
    public ihs f45277g;

    /* JADX INFO: renamed from: h */
    public Animator f45278h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f45279i;

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f45280j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f45281k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f45282l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView$a */
    public class C12524a implements CommonGiftCountDownView.InterfaceC12804a {
        public C12524a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: a */
        public void mo69599a() {
            if (LiveVChatCountdownView.this.f45276f != null) {
                LiveVChatCountdownView.this.f45276f.call();
            }
            if (LiveVChatCountdownView.this.f45279i != null && LiveVChatCountdownView.this.f45279i.isRunning()) {
                LiveVChatCountdownView.this.f45279i.pause();
            }
            if (LiveVChatCountdownView.this.f45280j != null && LiveVChatCountdownView.this.f45280j.isRunning()) {
                LiveVChatCountdownView.this.f45280j.pause();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LiveVChatCountdownView.this.f45271a, (Property<VDraweeView, Float>) View.ALPHA, LiveVChatCountdownView.this.f45271a.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(180L);
            objectAnimatorOfFloat.start();
            LiveVChatCountdownView.this.f45282l.start();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: b */
        public void mo69600b() {
            LiveVChatCountdownView.this.m69598x(false);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: c */
        public void mo69601c() {
            LiveVChatCountdownView.this.m69598x(true);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: d */
        public void mo69602d(boolean z) {
            LiveVChatCountdownView.this.f45278h.start();
            LiveVChatCountdownView.this.f45280j.start();
            LiveVChatCountdownView.this.m69598x(z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView$b */
    public class C12525b extends ap0 {
        public C12525b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            xdl0.m208344M(LiveVChatCountdownView.this.f45275e, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            xdl0.m208344M(LiveVChatCountdownView.this.f45275e, true);
        }
    }

    public LiveVChatCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m69582h(View view) {
        ahu.m96734a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m69583i(d30 d30Var) {
        this.f45276f = d30Var;
    }

    /* JADX INFO: renamed from: j */
    public void m69584j() {
        this.f45274d.m73739B();
    }

    /* JADX INFO: renamed from: k */
    public final String m69585k(ihs ihsVar) {
        return BaseSei.f13930X + ihsVar.m136282g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l */
    public final ObjectAnimator m69586l(boolean z) {
        float rotation = this.f45271a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f45271a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f45279i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f45279i.setRepeatMode(-1);
        this.f45279i.setRepeatCount(-1);
        this.f45279i.setDuration(z ? 4000L : 12000L);
        return this.f45279i;
    }

    /* JADX INFO: renamed from: m */
    public final void m69587m() {
        m69588n();
        m69589o();
        xxj.m211504e(this.f45273c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: n */
    public final void m69588n() {
        Animator animatorM103741n = bt0.m103741n(this.f45271a, bt0.f77162i, 0.0f, 1.1f, 1.0f);
        this.f45278h = animatorM103741n;
        animatorM103741n.setDuration(600L);
        this.f45278h.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f45271a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f45280j = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f45280j.setDuration(2000L);
        this.f45280j.setRepeatMode(-1);
        this.f45280j.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: o */
    public final void m69589o() {
        AnimatorSet animatorSet = this.f45281k;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f45273c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            bt0.m103749v(objectAnimatorOfFloat, new Runnable() { // from class: l.zgu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203097a.m69591q();
                }
            });
            Animator animatorM103741n = bt0.m103741n(this.f45273c, bt0.f77162i, 3.0f, 0.7f);
            animatorM103741n.setDuration(140L);
            Animator animatorM103741n2 = bt0.m103741n(this.f45273c, bt0.f77162i, 0.7f, 1.0f);
            animatorM103741n2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorM103741n, animatorM103741n2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f45281k = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f45282l == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f45273c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f45282l = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69582h(this);
        m69590p();
        m69587m();
        hxs.m133408u("context_livingAct", this.f45271a, ydt.f197612b, t100.m186890d(230.0f), t100.m186890d(230.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m69590p() {
        this.f45274d.setOnCountDownListener(new C12524a());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m69591q() {
        this.f45273c.setText(m69585k(this.f45277g));
    }

    /* JADX INFO: renamed from: r */
    public void m69592r() {
        this.f45274d.m73754o();
        m69597w(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m69593s(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f45272b.clearAnimation();
        this.f45272b.m68500j(str, 1);
    }

    /* JADX INFO: renamed from: t */
    public void m69594t() {
        this.f45277g = null;
        this.f45274d.m73741D();
        this.f45272b.clearAnimation();
        this.f45274d.m73739B();
        this.f45271a.setController(null);
    }

    /* JADX INFO: renamed from: u */
    public void m69595u() {
        xdl0.m208345M0(this, false);
        this.f45274d.m73750M();
        this.f45274d.m73741D();
        this.f45271a.setController(null);
    }

    /* JADX INFO: renamed from: v */
    public void m69596v(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, boolean z) {
        ihs ihsVar2 = this.f45277g;
        if (ihsVar2 != null && !ihsVar2.m136292q(ihsVar)) {
            this.f45274d.m73741D();
        }
        this.f45277g = ihsVar;
        this.f45274d.setCountdownTime(ihsVar.m136281f());
        if (z && liveVChatGiftItemView.m69420B0()) {
            this.f45274d.m73748K();
            if (ihsVar.m136293r()) {
                m69597w(true);
            }
        } else {
            this.f45274d.m73747J();
            m69593s(ihsVar.m136278c());
        }
        if (ihsVar.m136278c()) {
            xdl0.m208344M(this.f45273c, false);
            return;
        }
        hxs.m133408u("context_livingAct", this.f45271a, ydt.f197612b, t100.m186890d(230.0f), t100.m186890d(230.0f));
        xdl0.m208344M(this.f45273c, true);
        this.f45281k.cancel();
        this.f45281k.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m69597w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f45275e;
        if (z) {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C12525b());
        } else {
            animEffectPlayer.clearAnimation();
            xdl0.m208344M(this.f45275e, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m69598x(boolean z) {
        ObjectAnimator objectAnimator = this.f45279i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            dt0.m113501A(this.f45279i);
        }
        ObjectAnimator objectAnimatorM69586l = m69586l(z);
        this.f45279i = objectAnimatorM69586l;
        objectAnimatorM69586l.start();
    }

    public LiveVChatCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
