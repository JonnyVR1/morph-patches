package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.e7s;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.n0k;
import p153l.qa00;
import p153l.wo0;
import p153l.x20;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50653a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50654b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f50655c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f50656d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f50657e;

    /* JADX INFO: renamed from: f */
    public x20 f50658f;

    /* JADX INFO: renamed from: g */
    public jjs f50659g;

    /* JADX INFO: renamed from: h */
    public Animator f50660h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f50661i;

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f50662j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f50663k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f50664l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView$a */
    public class C12970a implements CommonGiftCountDownView.InterfaceC12967a {
        public C12970a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: a */
        public void mo70782a() {
            if (LiveCountdownView.this.f50658f != null) {
                LiveCountdownView.this.f50658f.call();
            }
            if (LiveCountdownView.this.f50661i != null && LiveCountdownView.this.f50661i.isRunning()) {
                LiveCountdownView.this.f50661i.pause();
            }
            if (LiveCountdownView.this.f50662j != null && LiveCountdownView.this.f50662j.isRunning()) {
                LiveCountdownView.this.f50662j.pause();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LiveCountdownView.this.f50653a, (Property<VDraweeView, Float>) View.ALPHA, LiveCountdownView.this.f50653a.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(180L);
            objectAnimatorOfFloat.start();
            LiveCountdownView.this.f50664l.start();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: b */
        public void mo70783b() {
            LiveCountdownView.this.m74982x(false);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: c */
        public void mo70784c() {
            LiveCountdownView.this.m74982x(true);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12967a
        /* JADX INFO: renamed from: d */
        public void mo70785d(boolean z) {
            LiveCountdownView.this.f50660h.start();
            LiveCountdownView.this.f50662j.start();
            LiveCountdownView.this.m74982x(z);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView$b */
    public class C12971b extends wo0 {
        public C12971b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            bnl0.m105524M(LiveCountdownView.this.f50657e, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            bnl0.m105524M(LiveCountdownView.this.f50657e, true);
        }
    }

    public LiveCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m74966h(View view) {
        e7s.m119768a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m74967i(x20 x20Var) {
        this.f50658f = x20Var;
    }

    /* JADX INFO: renamed from: j */
    public void m74968j() {
        this.f50656d.m74922B();
    }

    /* JADX INFO: renamed from: k */
    public final String m74969k(jjs jjsVar) {
        return BaseSei.f14624X + jjsVar.m145121g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: l */
    public final ObjectAnimator m74970l(boolean z) {
        float rotation = this.f50653a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50653a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f50661i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f50661i.setRepeatMode(-1);
        this.f50661i.setRepeatCount(-1);
        this.f50661i.setDuration(z ? 4000L : 12000L);
        return this.f50661i;
    }

    /* JADX INFO: renamed from: m */
    public final void m74971m() {
        m74972n();
        m74973o();
        n0k.m161008e(this.f50655c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: n */
    public final void m74972n() {
        Animator animatorM132168n = gt0.m132168n(this.f50653a, gt0.f106354i, 0.0f, 1.1f, 1.0f);
        this.f50660h = animatorM132168n;
        animatorM132168n.setDuration(600L);
        this.f50660h.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50653a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f50662j = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f50662j.setDuration(2000L);
        this.f50662j.setRepeatMode(-1);
        this.f50662j.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: o */
    public final void m74973o() {
        AnimatorSet animatorSet = this.f50663k;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50655c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            gt0.m132176v(objectAnimatorOfFloat, new Runnable() { // from class: l.d7s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85546a.m74975q();
                }
            });
            Animator animatorM132168n = gt0.m132168n(this.f50655c, gt0.f106354i, 3.0f, 0.7f);
            animatorM132168n.setDuration(140L);
            Animator animatorM132168n2 = gt0.m132168n(this.f50655c, gt0.f106354i, 0.7f, 1.0f);
            animatorM132168n2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorM132168n, animatorM132168n2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f50663k = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f50664l == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50655c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f50664l = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74966h(this);
        m74974p();
        m74971m();
        izs.m142870u("context_livingAct", this.f50653a, zft.f204207b, qa00.m175859d(230.0f), qa00.m175859d(230.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m74974p() {
        this.f50656d.setOnCountDownListener(new C12970a());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m74975q() {
        this.f50655c.setText(m74969k(this.f50659g));
    }

    /* JADX INFO: renamed from: r */
    public void m74976r() {
        this.f50656d.m74937o();
        m74981w(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m74977s(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f50654b.clearAnimation();
        this.f50654b.m69683j(str, 1);
    }

    /* JADX INFO: renamed from: t */
    public void m74978t() {
        this.f50659g = null;
        this.f50656d.m74924D();
        this.f50654b.clearAnimation();
        this.f50656d.m74922B();
        this.f50653a.setController(null);
    }

    /* JADX INFO: renamed from: u */
    public void m74979u() {
        bnl0.m105525M0(this, false);
        this.f50656d.m74933M();
        this.f50656d.m74924D();
        this.f50653a.setController(null);
    }

    /* JADX INFO: renamed from: v */
    public void m74980v(LiveGiftItemView liveGiftItemView, jjs jjsVar, boolean z) {
        jjs jjsVar2 = this.f50659g;
        if (jjsVar2 != null && !jjsVar2.m145131q(jjsVar)) {
            this.f50656d.m74924D();
        }
        this.f50659g = jjsVar;
        this.f50656d.setCountdownTime(jjsVar.m145120f());
        if (z && liveGiftItemView.m74657E0()) {
            this.f50656d.m74931K();
            if (jjsVar.m145132r()) {
                m74981w(true);
            }
        } else {
            this.f50656d.m74930J();
            m74977s(jjsVar.m145117c());
        }
        if (jjsVar.m145117c()) {
            bnl0.m105524M(this.f50655c, false);
            return;
        }
        izs.m142870u("context_livingAct", this.f50653a, zft.f204207b, qa00.m175859d(230.0f), qa00.m175859d(230.0f));
        bnl0.m105524M(this.f50655c, true);
        this.f50663k.cancel();
        this.f50663k.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m74981w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f50657e;
        if (z) {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C12971b());
        } else {
            animEffectPlayer.clearAnimation();
            bnl0.m105524M(this.f50657e, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m74982x(boolean z) {
        ObjectAnimator objectAnimator = this.f50661i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            it0.m142007A(this.f50661i);
        }
        ObjectAnimator objectAnimatorM74970l = m74970l(z);
        this.f50661i = objectAnimatorM74970l;
        objectAnimatorM74970l.start();
    }

    public LiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
