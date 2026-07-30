package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import p147v.VDraweeView;
import p149l.ap0;
import p149l.bt0;
import p149l.d30;
import p149l.d5s;
import p149l.dt0;
import p149l.hxs;
import p149l.ihs;
import p149l.t100;
import p149l.xdl0;
import p149l.xxj;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49805a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49806b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f49807c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f49808d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f49809e;

    /* JADX INFO: renamed from: f */
    public d30 f49810f;

    /* JADX INFO: renamed from: g */
    public ihs f49811g;

    /* JADX INFO: renamed from: h */
    public Animator f49812h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f49813i;

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f49814j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f49815k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f49816l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView$a */
    public class C12807a implements CommonGiftCountDownView.InterfaceC12804a {
        public C12807a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: a */
        public void mo69599a() {
            if (LiveCountdownView.this.f49810f != null) {
                LiveCountdownView.this.f49810f.call();
            }
            if (LiveCountdownView.this.f49813i != null && LiveCountdownView.this.f49813i.isRunning()) {
                LiveCountdownView.this.f49813i.pause();
            }
            if (LiveCountdownView.this.f49814j != null && LiveCountdownView.this.f49814j.isRunning()) {
                LiveCountdownView.this.f49814j.pause();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LiveCountdownView.this.f49805a, (Property<VDraweeView, Float>) View.ALPHA, LiveCountdownView.this.f49805a.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(180L);
            objectAnimatorOfFloat.start();
            LiveCountdownView.this.f49816l.start();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: b */
        public void mo69600b() {
            LiveCountdownView.this.m73799x(false);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: c */
        public void mo69601c() {
            LiveCountdownView.this.m73799x(true);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: d */
        public void mo69602d(boolean z) {
            LiveCountdownView.this.f49812h.start();
            LiveCountdownView.this.f49814j.start();
            LiveCountdownView.this.m73799x(z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView$b */
    public class C12808b extends ap0 {
        public C12808b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            xdl0.m208344M(LiveCountdownView.this.f49809e, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            xdl0.m208344M(LiveCountdownView.this.f49809e, true);
        }
    }

    public LiveCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m73783h(View view) {
        d5s.m110070a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m73784i(d30 d30Var) {
        this.f49810f = d30Var;
    }

    /* JADX INFO: renamed from: j */
    public void m73785j() {
        this.f49808d.m73739B();
    }

    /* JADX INFO: renamed from: k */
    public final String m73786k(ihs ihsVar) {
        return BaseSei.f13930X + ihsVar.m136282g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l */
    public final ObjectAnimator m73787l(boolean z) {
        float rotation = this.f49805a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49805a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f49813i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f49813i.setRepeatMode(-1);
        this.f49813i.setRepeatCount(-1);
        this.f49813i.setDuration(z ? 4000L : 12000L);
        return this.f49813i;
    }

    /* JADX INFO: renamed from: m */
    public final void m73788m() {
        m73789n();
        m73790o();
        xxj.m211504e(this.f49807c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: n */
    public final void m73789n() {
        Animator animatorM103741n = bt0.m103741n(this.f49805a, bt0.f77162i, 0.0f, 1.1f, 1.0f);
        this.f49812h = animatorM103741n;
        animatorM103741n.setDuration(600L);
        this.f49812h.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49805a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f49814j = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f49814j.setDuration(2000L);
        this.f49814j.setRepeatMode(-1);
        this.f49814j.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: o */
    public final void m73790o() {
        AnimatorSet animatorSet = this.f49815k;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49807c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            bt0.m103749v(objectAnimatorOfFloat, new Runnable() { // from class: l.c5s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79410a.m73792q();
                }
            });
            Animator animatorM103741n = bt0.m103741n(this.f49807c, bt0.f77162i, 3.0f, 0.7f);
            animatorM103741n.setDuration(140L);
            Animator animatorM103741n2 = bt0.m103741n(this.f49807c, bt0.f77162i, 0.7f, 1.0f);
            animatorM103741n2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorM103741n, animatorM103741n2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f49815k = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f49816l == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f49807c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f49816l = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73783h(this);
        m73791p();
        m73788m();
        hxs.m133408u("context_livingAct", this.f49805a, ydt.f197612b, t100.m186890d(230.0f), t100.m186890d(230.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m73791p() {
        this.f49808d.setOnCountDownListener(new C12807a());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m73792q() {
        this.f49807c.setText(m73786k(this.f49811g));
    }

    /* JADX INFO: renamed from: r */
    public void m73793r() {
        this.f49808d.m73754o();
        m73798w(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m73794s(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f49806b.clearAnimation();
        this.f49806b.m68500j(str, 1);
    }

    /* JADX INFO: renamed from: t */
    public void m73795t() {
        this.f49811g = null;
        this.f49808d.m73741D();
        this.f49806b.clearAnimation();
        this.f49808d.m73739B();
        this.f49805a.setController(null);
    }

    /* JADX INFO: renamed from: u */
    public void m73796u() {
        xdl0.m208345M0(this, false);
        this.f49808d.m73750M();
        this.f49808d.m73741D();
        this.f49805a.setController(null);
    }

    /* JADX INFO: renamed from: v */
    public void m73797v(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        ihs ihsVar2 = this.f49811g;
        if (ihsVar2 != null && !ihsVar2.m136292q(ihsVar)) {
            this.f49808d.m73741D();
        }
        this.f49811g = ihsVar;
        this.f49808d.setCountdownTime(ihsVar.m136281f());
        if (z && liveGiftItemView.m73474E0()) {
            this.f49808d.m73748K();
            if (ihsVar.m136293r()) {
                m73798w(true);
            }
        } else {
            this.f49808d.m73747J();
            m73794s(ihsVar.m136278c());
        }
        if (ihsVar.m136278c()) {
            xdl0.m208344M(this.f49807c, false);
            return;
        }
        hxs.m133408u("context_livingAct", this.f49805a, ydt.f197612b, t100.m186890d(230.0f), t100.m186890d(230.0f));
        xdl0.m208344M(this.f49807c, true);
        this.f49815k.cancel();
        this.f49815k.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m73798w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f49809e;
        if (z) {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C12808b());
        } else {
            animEffectPlayer.clearAnimation();
            xdl0.m208344M(this.f49809e, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m73799x(boolean z) {
        ObjectAnimator objectAnimator = this.f49813i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            dt0.m113501A(this.f49813i);
        }
        ObjectAnimator objectAnimatorM73787l = m73787l(z);
        this.f49813i = objectAnimatorM73787l;
        objectAnimatorM73787l.start();
    }

    public LiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
