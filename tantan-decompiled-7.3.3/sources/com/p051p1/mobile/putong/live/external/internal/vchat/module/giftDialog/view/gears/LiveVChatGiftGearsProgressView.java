package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VProgressBar;
import p153l.bnl0;
import p153l.bri0;
import p153l.dpj;
import p153l.gsj;
import p153l.gt0;
import p153l.imu;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.n0k;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftGearsProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f46143a;

    /* JADX INFO: renamed from: b */
    public LiveMarqueeTextView f46144b;

    /* JADX INFO: renamed from: c */
    public TextView f46145c;

    /* JADX INFO: renamed from: d */
    public TextView f46146d;

    /* JADX INFO: renamed from: e */
    public TextView f46147e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f46148f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f46149g;

    /* JADX INFO: renamed from: h */
    public jjs f46150h;

    /* JADX INFO: renamed from: i */
    public gsj f46151i;

    /* JADX INFO: renamed from: j */
    public boolean f46152j;

    /* JADX INFO: renamed from: k */
    public Animator f46153k;

    /* JADX INFO: renamed from: l */
    public Animator f46154l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f46155m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f46156n;

    /* JADX INFO: renamed from: o */
    public int f46157o;

    /* JADX INFO: renamed from: p */
    public boolean f46158p;

    public LiveVChatGiftGearsProgressView(Context context) {
        super(context);
        this.f46152j = false;
        this.f46157o = 0;
        this.f46158p = false;
    }

    /* JADX INFO: renamed from: A */
    public final void m70815A() {
        if (this.f46155m == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gmu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f105035a.m70827o(valueAnimator);
                }
            });
            gt0.m132160f(valueAnimatorOfFloat, new Runnable() { // from class: l.hmu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110673a.m70828p();
                }
            });
            Animator animatorM132168n = gt0.m132168n(this.f46144b, View.ALPHA, 0.0f, 1.0f);
            animatorM132168n.setDuration(160L);
            animatorM132168n.setInterpolator(null);
            animatorM132168n.setStartDelay(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f46155m = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM132168n);
        }
        this.f46155m.start();
    }

    /* JADX INFO: renamed from: B */
    public void m70816B() {
        it0.m142009C(this.f46156n);
        if (this.f46156n == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fmu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f99839a.m70829q(valueAnimator);
                }
            });
            Animator animatorM132168n = gt0.m132168n(this.f46144b, View.ALPHA, 1.0f, 0.0f);
            animatorM132168n.setInterpolator(null);
            animatorM132168n.setDuration(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f46156n = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM132168n);
        }
        this.f46156n.start();
    }

    /* JADX INFO: renamed from: C */
    public final void m70817C() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM145121g = this.f46150h.m145121g();
        if (!bLiveGivenGiftBriefM145121g.canShowPreviewText || TextUtils.isEmpty(bLiveGivenGiftBriefM145121g.previewText)) {
            m70837y(bLiveGivenGiftBriefM145121g);
            this.f46157o = 0;
        } else {
            m70836x(bLiveGivenGiftBriefM145121g);
            this.f46157o = 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m70818D(final int[] iArr, @Nullable final LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView, boolean z) {
        m70820h();
        float fM145119e = z ? 1.0f : this.f46150h.m145119e();
        bnl0.m105525M0(this.f46149g, true);
        izs.m142868s("context_livingAct", this.f46149g, this.f46150h.m145122h().url);
        this.f46148f.setProgress((int) fM145119e);
        m70838z();
        if (this.f46150h.m145115a() && fM145119e == 100.0f && liveVChatGiftGearsFlyView != null) {
            this.f46151i.m132056e(iArr, liveVChatGiftGearsFlyView, new x20() { // from class: l.cmu
                @Override // p153l.x20
                public final void call() {
                    this.f82649a.m70830r();
                }
            }, new x20() { // from class: l.dmu
                @Override // p153l.x20
                public final void call() {
                    this.f89728a.m70831s(iArr, liveVChatGiftGearsFlyView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m70819g(View view) {
        imu.m140990a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m70820h() {
        this.f46144b.setText("");
        this.f46145c.setText("");
        this.f46147e.setText("");
    }

    /* JADX INFO: renamed from: i */
    public void m70821i(x20 x20Var) {
        if (this.f46152j) {
            if (this.f46154l == null) {
                m70822j();
            }
            this.f46154l.removeAllListeners();
            Animator animator = this.f46154l;
            Objects.requireNonNull(x20Var);
            gt0.m132160f(animator, new bri0(x20Var));
            this.f46154l.start();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m70822j() {
        this.f46154l = gt0.m132180z(gt0.m132166l(this.f46143a, View.TRANSLATION_Y, 0L, 180L, null, 0.0f, qa00.m175859d(60.0f)), gt0.m132166l(this.f46143a, gt0.f106354i, 0L, 180L, null, 1.0f, 0.0f), gt0.m132166l(this.f46143a, View.ALPHA, 0L, 230L, null, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: k */
    public final void m70823k() {
        ConstraintLayout constraintLayout = this.f46143a;
        float[] fArr = {qa00.m175859d(60.0f), -qa00.m175859d(10.0f)};
        Property property = View.TRANSLATION_Y;
        this.f46153k = gt0.m132180z(gt0.m132173s(gt0.m132166l(constraintLayout, property, 100L, 180L, null, fArr), gt0.m132166l(constraintLayout, property, 0L, 120L, null, -qa00.m175859d(10.0f), 0.0f)), gt0.m132173s(gt0.m132166l(constraintLayout, gt0.f106354i, 100L, 180L, null, 0.0f, 1.1f), gt0.m132166l(constraintLayout, gt0.f106354i, 0L, 120L, null, 1.1f, 1.0f)), gt0.m132166l(constraintLayout, View.ALPHA, 100L, 230L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: l */
    public final void m70824l() {
        TextView textView = this.f46145c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        n0k.m161008e(textView, typeface);
        n0k.m161008e(this.f46147e, typeface);
        this.f46143a.setScaleX(0.0f);
        this.f46143a.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m70825m(jjs jjsVar) {
        jjs jjsVar2;
        return (!this.f46152j || (jjsVar2 = this.f46150h) == null || jjsVar2.m145131q(jjsVar)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m70826n() {
        this.f46152j = true;
        m70834v();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m70827o(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f46145c.setAlpha(fFloatValue);
        this.f46146d.setAlpha(fFloatValue);
        this.f46147e.setAlpha(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70819g(this);
        m70824l();
        this.f46151i = new gsj(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m70828p() {
        bnl0.m105525M0(this.f46145c, false);
        bnl0.m105525M0(this.f46146d, false);
        bnl0.m105525M0(this.f46147e, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m70829q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f46145c.setAlpha(fFloatValue);
        this.f46146d.setAlpha(fFloatValue);
        this.f46147e.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m70830r() {
        this.f46152j = false;
        this.f46158p = true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m70831s(int[] iArr, LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView) {
        jjs jjsVar;
        if (this.f46158p && (jjsVar = this.f46150h) != null && jjsVar.m145116b()) {
            this.f46158p = false;
            this.f46150h.m145135u();
            m70818D(iArr, liveVChatGiftGearsFlyView, true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f46152j = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m70832t(LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        int width = iArr[0] + (liveVChatGiftItemView.getWidth() / 2);
        int i = iArr[1];
        setTranslationX(width - qa00.m175859d(44.0f));
        setTranslationY((i - qa00.m175859d(60.0f)) - LiveVChatGiftOperationView.f46060i);
    }

    /* JADX INFO: renamed from: u */
    public void m70833u() {
        this.f46150h = null;
        this.f46152j = false;
        it0.m142007A(this.f46153k);
        it0.m142007A(this.f46155m);
        it0.m142007A(this.f46156n);
        this.f46151i.m132055d();
    }

    /* JADX INFO: renamed from: v */
    public final void m70834v() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM145121g = this.f46150h.m145121g();
        if (bLiveGivenGiftBriefM145121g.canShowPreviewText && !TextUtils.isEmpty(bLiveGivenGiftBriefM145121g.previewText)) {
            bnl0.m105525M0(this.f46145c, false);
            bnl0.m105525M0(this.f46147e, false);
            bnl0.m105525M0(this.f46146d, false);
            bnl0.m105525M0(this.f46144b, true);
            this.f46144b.setText(dpj.m117399s(bLiveGivenGiftBriefM145121g.previewText));
            this.f46157o = 1;
            return;
        }
        int iIntValue = bLiveGivenGiftBriefM145121g.gearPercentInfo.get(0).intValue();
        int iIntValue2 = bLiveGivenGiftBriefM145121g.gearPercentInfo.get(1).intValue();
        this.f46145c.setText(String.valueOf(iIntValue));
        this.f46147e.setText(String.valueOf(iIntValue2));
        bnl0.m105525M0(this.f46145c, true);
        bnl0.m105525M0(this.f46147e, true);
        bnl0.m105525M0(this.f46146d, true);
        this.f46145c.setAlpha(1.0f);
        this.f46147e.setAlpha(1.0f);
        this.f46146d.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: w */
    public void m70835w(jjs jjsVar, int[] iArr, @Nullable LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView) {
        bnl0.m105524M(this, true);
        if (m70825m(jjsVar)) {
            this.f46152j = false;
        }
        this.f46158p = false;
        this.f46150h = jjsVar;
        m70818D(iArr, liveVChatGiftGearsFlyView, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m70836x(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = this.f46157o;
        LiveMarqueeTextView liveMarqueeTextView = this.f46144b;
        if (i == 1) {
            bnl0.m105525M0(liveMarqueeTextView, true);
            this.f46144b.setText(dpj.m117399s(bLiveGivenGiftBrief.previewText));
            bnl0.m105525M0(this.f46146d, false);
        } else {
            liveMarqueeTextView.setAlpha(0.0f);
            this.f46144b.setText(dpj.m117399s(bLiveGivenGiftBrief.previewText));
            bnl0.m105525M0(this.f46144b, true);
            m70815A();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: y */
    public final void m70837y(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bnl0.m105525M0(this.f46144b, false);
        int i = this.f46157o;
        TextView textView = this.f46145c;
        if (i == 0) {
            textView.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
            this.f46147e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
            return;
        }
        textView.setAlpha(0.0f);
        this.f46146d.setAlpha(0.0f);
        this.f46147e.setAlpha(0.0f);
        bnl0.m105525M0(this.f46145c, true);
        bnl0.m105525M0(this.f46146d, true);
        bnl0.m105525M0(this.f46147e, true);
        this.f46145c.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
        this.f46147e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
        m70816B();
    }

    /* JADX INFO: renamed from: z */
    public final void m70838z() {
        if (this.f46152j) {
            m70817C();
            return;
        }
        this.f46157o = 0;
        if (this.f46153k == null) {
            m70823k();
        }
        this.f46153k.removeAllListeners();
        gt0.m132176v(this.f46153k, new Runnable() { // from class: l.emu
            @Override // java.lang.Runnable
            public final void run() {
                this.f94693a.m70826n();
            }
        });
        this.f46153k.start();
    }

    public LiveVChatGiftGearsProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46152j = false;
        this.f46157o = 0;
        this.f46158p = false;
    }

    public LiveVChatGiftGearsProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46152j = false;
        this.f46157o = 0;
        this.f46158p = false;
    }
}
