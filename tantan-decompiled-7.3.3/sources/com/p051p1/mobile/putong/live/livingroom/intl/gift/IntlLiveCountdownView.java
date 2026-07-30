package com.p051p1.mobile.putong.live.livingroom.intl.gift;

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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.n0k;
import p153l.qa00;
import p153l.wo0;
import p153l.x20;
import p153l.xvn;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class IntlLiveCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51863a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f51864b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f51865c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f51866d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f51867e;

    /* JADX INFO: renamed from: f */
    public ImageView f51868f;

    /* JADX INFO: renamed from: g */
    public TextView f51869g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f51870h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f51871i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f51872j;

    /* JADX INFO: renamed from: k */
    public x20 f51873k;

    /* JADX INFO: renamed from: l */
    public jjs f51874l;

    /* JADX INFO: renamed from: m */
    public Animator f51875m;

    /* JADX INFO: renamed from: n */
    public ObjectAnimator f51876n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f51877o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f51878p;

    /* JADX INFO: renamed from: q */
    public ObjectAnimator f51879q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView$a */
    public class C13039a implements CommonGiftCountDownView.InterfaceC12967a {
        public C13039a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: a */
        public void mo70782a() {
            if (IntlLiveCountdownView.this.f51873k != null) {
                IntlLiveCountdownView.this.f51873k.call();
            }
            if (IntlLiveCountdownView.this.f51876n != null && IntlLiveCountdownView.this.f51876n.isRunning()) {
                IntlLiveCountdownView.this.f51876n.pause();
            }
            if (IntlLiveCountdownView.this.f51877o != null && IntlLiveCountdownView.this.f51877o.isRunning()) {
                IntlLiveCountdownView.this.f51877o.pause();
            }
            bnl0.m105525M0(IntlLiveCountdownView.this.f51865c, false);
            bnl0.m105525M0(IntlLiveCountdownView.this.f51870h, true);
            bnl0.m105525M0(IntlLiveCountdownView.this.f51866d, false);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: b */
        public void mo70783b() {
            IntlLiveCountdownView.this.m76528x(false);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: c */
        public void mo70784c() {
            IntlLiveCountdownView.this.m76528x(true);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: d */
        public void mo70785d(boolean z) {
            IntlLiveCountdownView.this.f51875m.start();
            IntlLiveCountdownView.this.f51877o.start();
            IntlLiveCountdownView.this.m76528x(z);
            bnl0.m105525M0(IntlLiveCountdownView.this.f51870h, false);
            bnl0.m105525M0(IntlLiveCountdownView.this.f51866d, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView$b */
    public class C13040b extends wo0 {
        public C13040b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            bnl0.m105524M(IntlLiveCountdownView.this.f51872j, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            bnl0.m105524M(IntlLiveCountdownView.this.f51872j, true);
        }
    }

    public IntlLiveCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m76511g(View view) {
        xvn.m213236a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m76512h(x20 x20Var) {
        this.f51873k = x20Var;
    }

    /* JADX INFO: renamed from: i */
    public void m76513i() {
        this.f51866d.m74922B();
    }

    /* JADX INFO: renamed from: j */
    public final String m76514j(jjs jjsVar) {
        if (jjsVar.m145121g().combos > 99) {
            this.f51865c.setTextSize(18.0f);
        } else {
            int i = jjsVar.m145121g().combos;
            LiveStrokeTextView liveStrokeTextView = this.f51865c;
            if (i > 999) {
                liveStrokeTextView.setTextSize(14.0f);
            } else {
                liveStrokeTextView.setTextSize(24.0f);
            }
        }
        return BaseSei.f14624X + jjsVar.m145121g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final ObjectAnimator m76515k(boolean z) {
        float rotation = this.f51863a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51863a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f51876n = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f51876n.setRepeatMode(-1);
        this.f51876n.setRepeatCount(-1);
        this.f51876n.setDuration(z ? 4000L : 12000L);
        return this.f51876n;
    }

    /* JADX INFO: renamed from: l */
    public final void m76516l() {
        m76517m();
        m76518n();
        n0k.m161008e(this.f51865c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public final void m76517m() {
        Animator animatorM132168n = gt0.m132168n(this.f51863a, gt0.f106354i, 0.0f, 1.1f, 1.0f);
        this.f51875m = animatorM132168n;
        animatorM132168n.setDuration(600L);
        this.f51875m.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51863a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f51877o = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f51877o.setDuration(2000L);
        this.f51877o.setRepeatMode(-1);
        this.f51877o.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: n */
    public final void m76518n() {
        AnimatorSet animatorSet = this.f51878p;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51865c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            gt0.m132176v(objectAnimatorOfFloat, new Runnable() { // from class: l.wvn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190974a.m76520p();
                }
            });
            Animator animatorM132168n = gt0.m132168n(this.f51865c, gt0.f106354i, 3.0f, 0.7f);
            animatorM132168n.setDuration(140L);
            Animator animatorM132168n2 = gt0.m132168n(this.f51865c, gt0.f106354i, 0.7f, 1.0f);
            animatorM132168n2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorM132168n, animatorM132168n2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f51878p = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f51879q == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f51865c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f51879q = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m76519o() {
        this.f51866d.setOnCountDownListener(new C13039a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76511g(this);
        m76519o();
        m76516l();
        izs.m142870u("context_livingAct", this.f51863a, zft.f204210e, qa00.m175859d(210.0f), qa00.m175859d(210.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m76520p() {
        this.f51865c.setText(m76514j(this.f51874l));
    }

    /* JADX INFO: renamed from: q */
    public final void m76521q(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f51864b.clearAnimation();
        this.f51864b.m69683j(str, 1);
    }

    /* JADX INFO: renamed from: r */
    public void m76522r() {
        this.f51874l = null;
        this.f51866d.m74924D();
        this.f51864b.clearAnimation();
        this.f51866d.m74922B();
        this.f51863a.setController(null);
    }

    /* JADX INFO: renamed from: s */
    public void m76523s() {
        bnl0.m105525M0(this, false);
        this.f51866d.m74933M();
        this.f51866d.m74924D();
        this.f51863a.setController(null);
    }

    /* JADX INFO: renamed from: t */
    public void m76524t(LiveGiftItemView liveGiftItemView, jjs jjsVar, boolean z) {
        jjs jjsVar2 = this.f51874l;
        if (jjsVar2 != null && !jjsVar2.m145131q(jjsVar)) {
            this.f51866d.m74924D();
        }
        this.f51874l = jjsVar;
        this.f51866d.setCountdownTime(jjsVar.m145120f());
        izs.m142868s("context_single_room", this.f51871i, this.f51874l.m145122h().url);
        if (z && liveGiftItemView.m74657E0()) {
            this.f51866d.m74931K();
            if (jjsVar.m145132r()) {
                m76527w(true);
            }
        } else {
            this.f51866d.m74930J();
            m76521q(jjsVar.m145117c());
        }
        if (jjsVar.m145117c()) {
            bnl0.m105524M(this.f51865c, false);
            return;
        }
        izs.m142870u("context_livingAct", this.f51863a, zft.f204210e, qa00.m175859d(210.0f), qa00.m175859d(210.0f));
        bnl0.m105524M(this.f51865c, true);
        this.f51878p.cancel();
        this.f51878p.start();
    }

    /* JADX INFO: renamed from: u */
    public void m76525u() {
        m76526v();
        ObjectAnimator objectAnimator = this.f51879q;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        this.f51879q.start();
    }

    /* JADX INFO: renamed from: v */
    public final void m76526v() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51863a, (Property<VDraweeView, Float>) View.ALPHA, this.f51863a.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(180L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m76527w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f51872j;
        if (z) {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C13040b());
        } else {
            animEffectPlayer.clearAnimation();
            bnl0.m105524M(this.f51872j, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m76528x(boolean z) {
        ObjectAnimator objectAnimator = this.f51876n;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            it0.m142007A(this.f51876n);
        }
        ObjectAnimator objectAnimatorM76515k = m76515k(z);
        this.f51876n = objectAnimatorM76515k;
        objectAnimatorM76515k.start();
    }

    public IntlLiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
