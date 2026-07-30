package com.p046p1.mobile.putong.live.livingroom.intl.gift;

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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import p147v.VDraweeView;
import p149l.ap0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.hxs;
import p149l.ihs;
import p149l.t100;
import p149l.xdl0;
import p149l.xtn;
import p149l.xxj;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51015a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f51016b;

    /* JADX INFO: renamed from: c */
    public LiveStrokeTextView f51017c;

    /* JADX INFO: renamed from: d */
    public CommonGiftCountDownView f51018d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f51019e;

    /* JADX INFO: renamed from: f */
    public ImageView f51020f;

    /* JADX INFO: renamed from: g */
    public TextView f51021g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f51022h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f51023i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f51024j;

    /* JADX INFO: renamed from: k */
    public d30 f51025k;

    /* JADX INFO: renamed from: l */
    public ihs f51026l;

    /* JADX INFO: renamed from: m */
    public Animator f51027m;

    /* JADX INFO: renamed from: n */
    public ObjectAnimator f51028n;

    /* JADX INFO: renamed from: o */
    public ObjectAnimator f51029o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f51030p;

    /* JADX INFO: renamed from: q */
    public ObjectAnimator f51031q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView$a */
    public class C12876a implements CommonGiftCountDownView.InterfaceC12804a {
        public C12876a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: a */
        public void mo69599a() {
            if (IntlLiveCountdownView.this.f51025k != null) {
                IntlLiveCountdownView.this.f51025k.call();
            }
            if (IntlLiveCountdownView.this.f51028n != null && IntlLiveCountdownView.this.f51028n.isRunning()) {
                IntlLiveCountdownView.this.f51028n.pause();
            }
            if (IntlLiveCountdownView.this.f51029o != null && IntlLiveCountdownView.this.f51029o.isRunning()) {
                IntlLiveCountdownView.this.f51029o.pause();
            }
            xdl0.m208345M0(IntlLiveCountdownView.this.f51017c, false);
            xdl0.m208345M0(IntlLiveCountdownView.this.f51022h, true);
            xdl0.m208345M0(IntlLiveCountdownView.this.f51018d, false);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: b */
        public void mo69600b() {
            IntlLiveCountdownView.this.m75345x(false);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: c */
        public void mo69601c() {
            IntlLiveCountdownView.this.m75345x(true);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView.InterfaceC12804a
        /* JADX INFO: renamed from: d */
        public void mo69602d(boolean z) {
            IntlLiveCountdownView.this.f51027m.start();
            IntlLiveCountdownView.this.f51029o.start();
            IntlLiveCountdownView.this.m75345x(z);
            xdl0.m208345M0(IntlLiveCountdownView.this.f51022h, false);
            xdl0.m208345M0(IntlLiveCountdownView.this.f51018d, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView$b */
    public class C12877b extends ap0 {
        public C12877b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            xdl0.m208344M(IntlLiveCountdownView.this.f51024j, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            xdl0.m208344M(IntlLiveCountdownView.this.f51024j, true);
        }
    }

    public IntlLiveCountdownView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m75328g(View view) {
        xtn.m211004a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m75329h(d30 d30Var) {
        this.f51025k = d30Var;
    }

    /* JADX INFO: renamed from: i */
    public void m75330i() {
        this.f51018d.m73739B();
    }

    /* JADX INFO: renamed from: j */
    public final String m75331j(ihs ihsVar) {
        if (ihsVar.m136282g().combos > 99) {
            this.f51017c.setTextSize(18.0f);
        } else {
            int i = ihsVar.m136282g().combos;
            LiveStrokeTextView liveStrokeTextView = this.f51017c;
            if (i > 999) {
                liveStrokeTextView.setTextSize(14.0f);
            } else {
                liveStrokeTextView.setTextSize(24.0f);
            }
        }
        return BaseSei.f13930X + ihsVar.m136282g().combos;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final ObjectAnimator m75332k(boolean z) {
        float rotation = this.f51015a.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51015a, (Property<VDraweeView, Float>) View.ROTATION, rotation, 360.0f + rotation);
        this.f51028n = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f51028n.setRepeatMode(-1);
        this.f51028n.setRepeatCount(-1);
        this.f51028n.setDuration(z ? 4000L : 12000L);
        return this.f51028n;
    }

    /* JADX INFO: renamed from: l */
    public final void m75333l() {
        m75334m();
        m75335n();
        xxj.m211504e(this.f51017c, Typeface.DEFAULT_BOLD);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public final void m75334m() {
        Animator animatorM103741n = bt0.m103741n(this.f51015a, bt0.f77162i, 0.0f, 1.1f, 1.0f);
        this.f51027m = animatorM103741n;
        animatorM103741n.setDuration(600L);
        this.f51027m.setInterpolator(null);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51015a, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.8f, 1.0f);
        this.f51029o = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(null);
        this.f51029o.setDuration(2000L);
        this.f51029o.setRepeatMode(-1);
        this.f51029o.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: n */
    public final void m75335n() {
        AnimatorSet animatorSet = this.f51030p;
        Property property = View.ALPHA;
        if (animatorSet == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51017c, (Property<LiveStrokeTextView, Float>) property, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            bt0.m103749v(objectAnimatorOfFloat, new Runnable() { // from class: l.wtn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188031a.m75337p();
                }
            });
            Animator animatorM103741n = bt0.m103741n(this.f51017c, bt0.f77162i, 3.0f, 0.7f);
            animatorM103741n.setDuration(140L);
            Animator animatorM103741n2 = bt0.m103741n(this.f51017c, bt0.f77162i, 0.7f, 1.0f);
            animatorM103741n2.setDuration(160L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(animatorM103741n, animatorM103741n2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f51030p = animatorSet3;
            animatorSet3.playTogether(objectAnimatorOfFloat, animatorSet2);
        }
        if (this.f51031q == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f51017c, (Property<LiveStrokeTextView, Float>) property, 1.0f, 0.0f);
            this.f51031q = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(180L);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m75336o() {
        this.f51018d.setOnCountDownListener(new C12876a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75328g(this);
        m75336o();
        m75333l();
        hxs.m133408u("context_livingAct", this.f51015a, ydt.f197615e, t100.m186890d(210.0f), t100.m186890d(210.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m75337p() {
        this.f51017c.setText(m75331j(this.f51026l));
    }

    /* JADX INFO: renamed from: q */
    public final void m75338q(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/raw/9a39e64d-1028-40f3-9088-791bbac78e7611.pdf" : "https://auto.tancdn.com/v1/raw/976325c8-b40a-4a25-a316-629c4b348db810.pdf";
        this.f51016b.clearAnimation();
        this.f51016b.m68500j(str, 1);
    }

    /* JADX INFO: renamed from: r */
    public void m75339r() {
        this.f51026l = null;
        this.f51018d.m73741D();
        this.f51016b.clearAnimation();
        this.f51018d.m73739B();
        this.f51015a.setController(null);
    }

    /* JADX INFO: renamed from: s */
    public void m75340s() {
        xdl0.m208345M0(this, false);
        this.f51018d.m73750M();
        this.f51018d.m73741D();
        this.f51015a.setController(null);
    }

    /* JADX INFO: renamed from: t */
    public void m75341t(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        ihs ihsVar2 = this.f51026l;
        if (ihsVar2 != null && !ihsVar2.m136292q(ihsVar)) {
            this.f51018d.m73741D();
        }
        this.f51026l = ihsVar;
        this.f51018d.setCountdownTime(ihsVar.m136281f());
        hxs.m133406s("context_single_room", this.f51023i, this.f51026l.m136283h().url);
        if (z && liveGiftItemView.m73474E0()) {
            this.f51018d.m73748K();
            if (ihsVar.m136293r()) {
                m75344w(true);
            }
        } else {
            this.f51018d.m73747J();
            m75338q(ihsVar.m136278c());
        }
        if (ihsVar.m136278c()) {
            xdl0.m208344M(this.f51017c, false);
            return;
        }
        hxs.m133408u("context_livingAct", this.f51015a, ydt.f197615e, t100.m186890d(210.0f), t100.m186890d(210.0f));
        xdl0.m208344M(this.f51017c, true);
        this.f51030p.cancel();
        this.f51030p.start();
    }

    /* JADX INFO: renamed from: u */
    public void m75342u() {
        m75343v();
        ObjectAnimator objectAnimator = this.f51031q;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        this.f51031q.start();
    }

    /* JADX INFO: renamed from: v */
    public final void m75343v() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51015a, (Property<VDraweeView, Float>) View.ALPHA, this.f51015a.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(180L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w */
    public final void m75344w(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f51024j;
        if (z) {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/7b02d224-8e47-4182-8d6c-486c6d86f7c810.pdf", 1, new C12877b());
        } else {
            animEffectPlayer.clearAnimation();
            xdl0.m208344M(this.f51024j, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m75345x(boolean z) {
        ObjectAnimator objectAnimator = this.f51028n;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            dt0.m113501A(this.f51028n);
        }
        ObjectAnimator objectAnimatorM75332k = m75332k(z);
        this.f51028n = objectAnimatorM75332k;
        objectAnimatorM75332k.start();
    }

    public IntlLiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
