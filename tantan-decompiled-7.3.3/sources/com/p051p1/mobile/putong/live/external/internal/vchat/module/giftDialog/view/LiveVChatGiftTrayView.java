package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.view.TrayBackground;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.gt0;
import p153l.hnu;
import p153l.i9n;
import p153l.it0;
import p153l.izs;
import p153l.muj;
import p153l.nsv;
import p153l.qa00;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftTrayView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVChatGiftTrayView f46081d;

    /* JADX INFO: renamed from: e */
    public LiveVChatTrayBackground f46082e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f46083f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f46084g;

    /* JADX INFO: renamed from: h */
    public VText f46085h;

    /* JADX INFO: renamed from: i */
    public VText f46086i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f46087j;

    /* JADX INFO: renamed from: k */
    public VImage f46088k;

    /* JADX INFO: renamed from: l */
    public VText f46089l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f46090m;

    /* JADX INFO: renamed from: n */
    public VText f46091n;

    /* JADX INFO: renamed from: o */
    public VText f46092o;

    /* JADX INFO: renamed from: p */
    public AnimEffectPlayer f46093p;

    /* JADX INFO: renamed from: q */
    public GiftTrayData f46094q;

    /* JADX INFO: renamed from: r */
    public Integer f46095r;

    /* JADX INFO: renamed from: s */
    public TrayStatus f46096s;

    /* JADX INFO: renamed from: t */
    public ObjectAnimator f46097t;

    /* JADX INFO: renamed from: u */
    public AnimatorSet f46098u;

    /* JADX INFO: renamed from: v */
    public ObjectAnimator f46099v;

    /* JADX INFO: renamed from: w */
    public ValueAnimator f46100w;

    /* JADX INFO: renamed from: x */
    public y20<GiftTrayData> f46101x;

    /* JADX INFO: renamed from: y */
    public boolean f46102y;

    public enum TrayStatus {
        empty,
        show,
        combo,
        pending,
        dismissing
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$a */
    public class C12681a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ObjectAnimator f46103a;

        public C12681a(ObjectAnimator objectAnimator) {
            this.f46103a = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f46103a.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVChatGiftTrayView.this.m70738z0();
            LiveVChatGiftTrayView.this.f46102y = false;
            if (LiveVChatGiftTrayView.this.f46101x != null) {
                LiveVChatGiftTrayView.this.f46101x.call(LiveVChatGiftTrayView.this.f46094q);
                LiveVChatGiftTrayView.this.f46101x = null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVChatGiftTrayView.this.m70718B0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$b */
    public class C12682b extends AnimatorListenerAdapter {
        public C12682b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVChatGiftTrayView.this.m70738z0();
            LiveVChatGiftTrayView.this.f46102y = false;
            if (LiveVChatGiftTrayView.this.f46101x != null) {
                LiveVChatGiftTrayView.this.f46101x.call(LiveVChatGiftTrayView.this.f46094q);
                LiveVChatGiftTrayView.this.f46101x = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVChatGiftTrayView.this.m70718B0();
            muj.m160160C(LiveVChatGiftTrayView.this.f46094q);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$c */
    public class C12683c extends AnimatorListenerAdapter {
        public C12683c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVChatGiftTrayView.this.m70728O0();
            muj.m160159B(LiveVChatGiftTrayView.this.f46094q, LiveVChatGiftTrayView.this.f46095r.intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$d */
    public class C12684d implements Animator.AnimatorListener {
        public C12684d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LiveVChatGiftTrayView.this.f46097t.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (LiveVChatGiftTrayView.this.f46094q.f50936R == null || TextUtils.isEmpty(LiveVChatGiftTrayView.this.f46094q.f50936R.svg)) {
                boolean zM77839u = TrayBackground.m77839u(LiveVChatGiftTrayView.this.f46094q.f50946d);
                LiveVChatGiftTrayView liveVChatGiftTrayView = LiveVChatGiftTrayView.this;
                if (zM77839u) {
                    liveVChatGiftTrayView.f46082e.m70742v();
                    bnl0.m105525M0(LiveVChatGiftTrayView.this.f46093p, true);
                    if (LiveVChatGiftTrayView.this.f46094q.f50946d == 300 && !i9n.m139127b()) {
                        LiveVChatGiftTrayView.this.f46093p.m69683j("https://auto.tancdn.com/v1/raw/e9fdcb78-6e0b-4ab8-b94c-05227d3b49fd10.so", 1);
                    }
                } else {
                    bnl0.m105524M(liveVChatGiftTrayView.f46082e.f46110c, false);
                }
            } else {
                LiveVChatGiftTrayView liveVChatGiftTrayView2 = LiveVChatGiftTrayView.this;
                liveVChatGiftTrayView2.f46082e.m70743w(liveVChatGiftTrayView2.f46094q.f50936R.svg);
            }
            if (LiveVChatGiftTrayView.this.f46100w != null) {
                LiveVChatGiftTrayView.this.f46100w.start();
            }
            LiveVChatGiftTrayView.this.m70727N0(true, 400);
            muj.m160161D(LiveVChatGiftTrayView.this.f46094q);
        }
    }

    public LiveVChatGiftTrayView(Context context) {
        super(context);
        this.f46096s = TrayStatus.empty;
        this.f46102y = false;
    }

    /* JADX INFO: renamed from: V0 */
    private void m70701V0() {
        final nsv nsvVarM164641e;
        GiftTrayData giftTrayData = this.f46094q;
        if (giftTrayData.f50927I) {
            nsv nsvVarM164636f = nsv.m164636f(giftTrayData);
            GiftTrayData giftTrayData2 = this.f46094q;
            nsvVarM164641e = nsvVarM164636f.m164639c(giftTrayData2.f50920B, giftTrayData2.f50928J, true);
        } else {
            nsvVarM164641e = nsv.m164636f(giftTrayData).m164641e(this.f46094q.f50928J);
        }
        biv.m104518c(this.f46083f, qa00.f156288A, nsvVarM164641e, new qcj() { // from class: l.gnu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((GiftTrayData) nsvVarM164641e.f143542a).f50968z;
            }
        }, 1);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    private void m70712r() {
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray;
        m70701V0();
        this.f46085h.setText(this.f46094q.f50919A);
        this.f46086i.setText(this.f46094q.f50964v);
        VDraweeView vDraweeView = this.f46087j;
        String str = this.f46094q.f50965w;
        int i = qa00.f156289B;
        izs.m142869t("context_livingAct", vDraweeView, str, i);
        this.f46092o.setText(this.f46095r + "  ");
        GiftTrayData giftTrayData = this.f46094q;
        int i2 = giftTrayData.f50946d;
        if (i2 == 1) {
            this.f46082e.m70741u(LiveVChatTrayBackground.Type.first, giftTrayData.f50926H);
        } else if (i2 == 100) {
            this.f46082e.m70741u(LiveVChatTrayBackground.Type.second, giftTrayData.f50926H);
        } else if (i2 == 200) {
            this.f46082e.m70741u(LiveVChatTrayBackground.Type.third, giftTrayData.f50926H);
        } else if (i2 == 300) {
            this.f46082e.m70741u(LiveVChatTrayBackground.Type.fourth, giftTrayData.f50926H);
        }
        GiftTrayData giftTrayData2 = this.f46094q;
        if (giftTrayData2 == null || (bLiveGivenGiftBriefTray = giftTrayData2.f50936R) == null || TextUtils.isEmpty(bLiveGivenGiftBriefTray.background)) {
            bnl0.m105524M(this.f46082e.f46109b, false);
            bnl0.m105524M(this.f46082e.f46108a, true);
        } else {
            this.f46082e.setBackgroundImg(this.f46094q.f50936R.background);
        }
        bnl0.m105524M(this.f46088k, this.f46094q.f50962t);
        bnl0.m105524M(this.f46089l, this.f46094q.f50962t);
        if (bnl0.m105529O0(this.f46089l)) {
            this.f46089l.getPaint().setFakeBoldText(true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f46094q.f50939U);
        VDraweeView vDraweeView2 = this.f46084g;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            izs.m142870u("context_livingAct", this.f46084g, this.f46094q.f50939U, i, qa00.f156323j);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m70718B0() {
        this.f46096s = TrayStatus.dismissing;
        if (TrayBackground.m77839u(this.f46094q.f50946d)) {
            this.f46082e.m70744z();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m70719D0(y20 y20Var) {
        this.f46101x = y20Var;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -getWidth(), qa00.m175859d(36.0f), 0.0f);
        this.f46097t = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(600L).setInterpolator(new OvershootInterpolator());
        this.f46097t.removeAllListeners();
        this.f46097t.addListener(new C12684d());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -qa00.m175859d(3.0f), 0.0f, qa00.m175859d(3.0f), 0.0f);
        this.f46100w = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1400L).setRepeatCount(-1);
        this.f46100w.setInterpolator(new LinearInterpolator());
        this.f46100w.setStartDelay(300L);
        this.f46100w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dnu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f89844a.m70723I0(valueAnimator);
            }
        });
        gt0.m132177w(this.f46100w, new Runnable() { // from class: l.enu
            @Override // java.lang.Runnable
            public final void run() {
                this.f94828a.m70724J0();
            }
        }, new Runnable() { // from class: l.fnu
            @Override // java.lang.Runnable
            public final void run() {
                this.f99960a.m70725K0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m70720E0() {
        this.f46102y = true;
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m70721G0(@NonNull String str) {
        if (!m70722H0()) {
            return false;
        }
        GiftTrayData giftTrayData = this.f46094q;
        return giftTrayData.f50959q && str.equals(giftTrayData.f50967y);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m70722H0() {
        return this.f46096s != TrayStatus.empty;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m70723I0(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.f46087j.setTranslationY(f.floatValue());
        if (this.f46094q.f50962t) {
            this.f46088k.setTranslationY(f.floatValue());
            this.f46089l.setTranslationY(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m70724J0() {
        this.f46087j.setTranslationY(0.0f);
        if (this.f46094q.f50962t) {
            this.f46088k.setTranslationY(0.0f);
            this.f46089l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m70725K0() {
        this.f46087j.setTranslationY(0.0f);
        if (this.f46094q.f50962t) {
            this.f46088k.setTranslationY(0.0f);
            this.f46089l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m70726L0(boolean z) {
        m70727N0(z, 0);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m70727N0(boolean z, int i) {
        this.f46096s = TrayStatus.combo;
        if (!z) {
            this.f46095r = this.f46094q.m75340C();
        }
        this.f46092o.setText(this.f46095r + "  ");
        AnimatorSet animatorSet = this.f46098u;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        if (this.f46098u == null) {
            this.f46098u = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f46090m, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            this.f46098u.play(gt0.m132166l(this.f46090m, gt0.f106354i, 0L, 140L, new LinearInterpolator(), 3.0f, 0.7f)).with(gt0.m132166l(this.f46090m, gt0.f106354i, 140L, 160L, new LinearInterpolator(), 0.7f, 1.0f)).with(objectAnimatorOfFloat);
        }
        this.f46098u.addListener(new C12683c());
        this.f46098u.setStartDelay(i);
        this.f46098u.start();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m70728O0() {
        if (this.f46102y) {
            m70731R0();
        } else if (m70733T0() && this.f46096s != TrayStatus.dismissing) {
            m70726L0(false);
        } else {
            this.f46096s = TrayStatus.pending;
            m70729P0();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m70729P0() {
        it0.m142007A(this.f46099v);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LiveVChatGiftTrayView, Float>) View.TRANSLATION_X, 0.0f, -getWidth());
        this.f46099v = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        this.f46099v.setStartDelay(this.f46094q.f50951i);
        this.f46099v.addListener(new C12682b());
        this.f46099v.start();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m70730Q0() {
        ObjectAnimator objectAnimator = this.f46099v;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f46099v.cancel();
        }
        m70731R0();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m70731R0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", 0.0f, -getWidth());
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new C12681a(objectAnimatorOfFloat));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: S0 */
    public void m70732S0() {
        muj.m160209m0(this.f46094q);
        this.f46096s = TrayStatus.show;
        bnl0.m105525M0(this.f46081d, this.f46094q.f50958p);
        this.f46097t.start();
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m70733T0() {
        return !this.f46094q.m75350t();
    }

    /* JADX INFO: renamed from: U0 */
    public void m70734U0(GiftTrayData giftTrayData, y20<GiftTrayData> y20Var) {
        this.f46094q = giftTrayData;
        this.f46095r = giftTrayData.m75340C();
        m70712r();
        m70719D0(y20Var);
    }

    /* JADX INFO: renamed from: X0 */
    public void m70735X0() {
        GiftTrayData giftTrayData = this.f46094q;
        if (giftTrayData != null) {
            giftTrayData.m75343d();
        }
        m70738z0();
    }

    public String getPlayingComboId() {
        GiftTrayData giftTrayData = this.f46094q;
        if (giftTrayData == null || this.f46096s == TrayStatus.empty) {
            return null;
        }
        return giftTrayData.f50956n;
    }

    public GiftTrayData.GiftPriority getPlayingGiftPriority() {
        GiftTrayData giftTrayData = this.f46094q;
        if (giftTrayData == null) {
            return null;
        }
        return giftTrayData.m75345i();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70736w0(this);
        VText vText = this.f46091n;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f46092o.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m70736w0(View view) {
        hnu.m136275a(this, view);
    }

    /* JADX INFO: renamed from: y0 */
    public void m70737y0(GiftTrayData giftTrayData) {
        if (this.f46102y || this.f46096s != TrayStatus.pending) {
            this.f46094q.m75342c(Integer.valueOf(giftTrayData.f50953k));
            return;
        }
        this.f46096s = TrayStatus.combo;
        it0.m142007A(this.f46099v);
        this.f46094q.m75342c(Integer.valueOf(giftTrayData.f50953k));
        m70726L0(false);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m70738z0() {
        bnl0.m105525M0(this.f46081d, false);
        this.f46096s = TrayStatus.empty;
        ValueAnimator valueAnimator = this.f46100w;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    public LiveVChatGiftTrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46096s = TrayStatus.empty;
        this.f46102y = false;
    }

    public LiveVChatGiftTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46096s = TrayStatus.empty;
        this.f46102y = false;
    }
}
