package com.p000p1.mobile.putong.live.livingroom.intl.gift;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
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
import p002l.ihs;
import p002l.xtn;
import p002l.xxj;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlLiveCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7057a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f7058b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f7059c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f7060d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f7061e;

    /* JADX INFO: renamed from: f */
    public ImageView f7062f;

    /* JADX INFO: renamed from: g */
    public TextView f7063g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f7064h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7065i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f7066j;

    /* JADX INFO: renamed from: k */
    public d30 f7067k;

    /* JADX INFO: renamed from: l */
    public ihs f7068l;

    /* JADX INFO: renamed from: m */
    public Animator f7069m;

    /* JADX INFO: renamed from: n */
    public ObjectAnimator f7070n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f7071o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f7072p;

    /* JADX INFO: renamed from: q */
    public ObjectAnimator f7073q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView$a */
    public class C0465a implements CommonGiftCountDownView.InterfaceC0393a {
        public C0465a() {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: a */
        public void mo7316a() {
            if (IntlLiveCountdownView.this.f7067k != null) {
                IntlLiveCountdownView.this.f7067k.call();
            }
            if (IntlLiveCountdownView.this.f7070n != null && IntlLiveCountdownView.this.f7070n.isRunning()) {
                IntlLiveCountdownView.this.f7070n.pause();
            }
            if (IntlLiveCountdownView.this.f7071o != null && IntlLiveCountdownView.this.f7071o.isRunning()) {
                IntlLiveCountdownView.this.f7071o.pause();
            }
            xdl0.M0(IntlLiveCountdownView.this.f7059c, false);
            xdl0.M0(IntlLiveCountdownView.this.f7064h, true);
            xdl0.M0(IntlLiveCountdownView.this.f7060d, false);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: b */
        public void mo7317b() {
            IntlLiveCountdownView.this.m8966x(false);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: c */
        public void mo7318c() {
            IntlLiveCountdownView.this.m8966x(true);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC0393a
        /* JADX INFO: renamed from: d */
        public void mo7319d(boolean z) {
            IntlLiveCountdownView.this.f7069m.start();
            IntlLiveCountdownView.this.f7071o.start();
            IntlLiveCountdownView.this.m8966x(z);
            xdl0.M0(IntlLiveCountdownView.this.f7064h, false);
            xdl0.M0(IntlLiveCountdownView.this.f7060d, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView$b */
    public class C0466b extends ap0 {
        public C0466b() {
        }

        /* JADX INFO: renamed from: b */
        public void m8967b() {
            xdl0.M(IntlLiveCountdownView.this.f7066j, false);
        }

        /* JADX INFO: renamed from: g */
        public void m8968g() {
            xdl0.M(IntlLiveCountdownView.this.f7066j, true);
        }
    }

    public IntlLiveCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m8949g(View view) {
        xtn.m26112a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m8950h(d30 d30Var) {
        this.f7067k = d30Var;
    }

    /* JADX INFO: renamed from: i */
    public void m8951i() {
        this.f7060d.m7289B();
    }

    /* JADX INFO: renamed from: j */
    public final String m8952j(ihs ihsVar) {
        if (ihsVar.m15159g().combos > 99) {
            this.f7059c.setTextSize(18.0f);
        } else {
            int i = ihsVar.m15159g().combos;
            AppCompatTextView appCompatTextView = this.f7059c;
            if (i > 999) {
                appCompatTextView.setTextSize(14.0f);
            } else {
                appCompatTextView.setTextSize(24.0f);
            }
        }
        return "x" + ihsVar.m15159g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final ObjectAnimator m8953k(boolean z) {
        float rotation = this.f7057a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7057a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f7070n = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f7070n.setRepeatMode(-1);
        this.f7070n.setRepeatCount(-1);
        this.f7070n.setDuration(z ? 4000L : 12000L);
        return this.f7070n;
    }

    /* JADX INFO: renamed from: l */
    public final void m8954l() {
        m8955m();
        m8956n();
        xxj.m26168e(this.f7059c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public final void m8955m() {
        Animator animatorN = bt0.n(this.f7057a, bt0.i, new float[]{0.0f, 1.1f, 1.0f});
        this.f7069m = animatorN;
        animatorN.setDuration(600L);
        this.f7069m.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7057a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f7071o = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f7071o.setDuration(2000L);
        this.f7071o.setRepeatMode(-1);
        this.f7071o.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: n */
    public final void m8956n() {
        AnimatorSet animatorSet = this.f7072p;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7059c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            bt0.v(objectAnimatorOfFloat, new Runnable() { // from class: l.wtn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21975a.m8958p();
                }
            });
            Animator animatorN = bt0.n(this.f7059c, bt0.i, new float[]{3.0f, 0.7f});
            animatorN.setDuration(140L);
            Animator animatorN2 = bt0.n(this.f7059c, bt0.i, new float[]{0.7f, 1.0f});
            animatorN2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorN, animatorN2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f7072p = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f7073q == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f7059c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f7073q = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8957o() {
        this.f7060d.setOnCountDownListener(new C0465a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8949g(this);
        m8957o();
        m8954l();
        hxs.u("context_livingAct", this.f7057a, ydt.e, t100.d(210.0f), t100.d(210.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m8958p() {
        this.f7059c.setText(m8952j(this.f7068l));
    }

    /* JADX INFO: renamed from: q */
    public final void m8959q(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f7058b.clearAnimation();
        this.f7058b.j(str, 1);
    }

    /* JADX INFO: renamed from: r */
    public void m8960r() {
        this.f7068l = null;
        this.f7060d.m7291D();
        this.f7058b.clearAnimation();
        this.f7060d.m7289B();
        this.f7057a.setController((hce) null);
    }

    /* JADX INFO: renamed from: s */
    public void m8961s() {
        xdl0.M0(this, false);
        this.f7060d.m7300M();
        this.f7060d.m7291D();
        this.f7057a.setController((hce) null);
    }

    /* JADX INFO: renamed from: t */
    public void m8962t(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        ihs ihsVar2 = this.f7068l;
        if (ihsVar2 != null && !ihsVar2.m15169q(ihsVar)) {
            this.f7060d.m7291D();
        }
        this.f7068l = ihsVar;
        this.f7060d.setCountdownTime(ihsVar.m15158f());
        hxs.s("context_single_room", this.f7065i, this.f7068l.m15160h().url);
        if (z && liveGiftItemView.m7016E0()) {
            this.f7060d.m7298K();
            if (ihsVar.m15170r()) {
                m8965w(true);
            }
        } else {
            this.f7060d.m7297J();
            m8959q(ihsVar.m15155c());
        }
        if (ihsVar.m15155c()) {
            xdl0.M(this.f7059c, false);
            return;
        }
        hxs.u("context_livingAct", this.f7057a, ydt.e, t100.d(210.0f), t100.d(210.0f));
        xdl0.M(this.f7059c, true);
        this.f7072p.cancel();
        this.f7072p.start();
    }

    /* JADX INFO: renamed from: u */
    public void m8963u() {
        m8964v();
        ObjectAnimator objectAnimator = this.f7073q;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        this.f7073q.start();
    }

    /* JADX INFO: renamed from: v */
    public final void m8964v() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7057a, (Property<VDraweeView, Float>) View.ALPHA, this.f7057a.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(180L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m8965w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f7066j;
        if (z) {
            animEffectPlayer.l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C0466b());
        } else {
            animEffectPlayer.clearAnimation();
            xdl0.M(this.f7066j, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8966x(boolean z) {
        ObjectAnimator objectAnimator = this.f7070n;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            dt0.A(this.f7070n);
        }
        ObjectAnimator objectAnimatorM8953k = m8953k(z);
        this.f7070n = objectAnimatorM8953k;
        objectAnimatorM8953k.start();
    }

    public IntlLiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
