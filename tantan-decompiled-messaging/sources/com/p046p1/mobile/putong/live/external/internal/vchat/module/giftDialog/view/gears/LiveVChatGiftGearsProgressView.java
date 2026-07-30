package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears;

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
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VProgressBar;
import p149l.bii0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.hku;
import p149l.hxs;
import p149l.ihs;
import p149l.nmj;
import p149l.qpj;
import p149l.t100;
import p149l.xdl0;
import p149l.xxj;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftGearsProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f45295a;

    /* JADX INFO: renamed from: b */
    public LiveMarqueeTextView f45296b;

    /* JADX INFO: renamed from: c */
    public TextView f45297c;

    /* JADX INFO: renamed from: d */
    public TextView f45298d;

    /* JADX INFO: renamed from: e */
    public TextView f45299e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f45300f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f45301g;

    /* JADX INFO: renamed from: h */
    public ihs f45302h;

    /* JADX INFO: renamed from: i */
    public qpj f45303i;

    /* JADX INFO: renamed from: j */
    public boolean f45304j;

    /* JADX INFO: renamed from: k */
    public Animator f45305k;

    /* JADX INFO: renamed from: l */
    public Animator f45306l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f45307m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f45308n;

    /* JADX INFO: renamed from: o */
    public int f45309o;

    /* JADX INFO: renamed from: p */
    public boolean f45310p;

    public LiveVChatGiftGearsProgressView(Context context) {
        super(context);
        this.f45304j = false;
        this.f45309o = 0;
        this.f45310p = false;
    }

    /* JADX INFO: renamed from: A */
    public final void m69632A() {
        if (this.f45307m == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fku
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f98098a.m69644o(valueAnimator);
                }
            });
            bt0.m103733f(valueAnimatorOfFloat, new Runnable() { // from class: l.gku
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103237a.m69645p();
                }
            });
            Animator animatorM103741n = bt0.m103741n(this.f45296b, View.ALPHA, 0.0f, 1.0f);
            animatorM103741n.setDuration(160L);
            animatorM103741n.setInterpolator(null);
            animatorM103741n.setStartDelay(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f45307m = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM103741n);
        }
        this.f45307m.start();
    }

    /* JADX INFO: renamed from: B */
    public void m69633B() {
        dt0.m113503C(this.f45308n);
        if (this.f45308n == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.eku
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f92014a.m69646q(valueAnimator);
                }
            });
            Animator animatorM103741n = bt0.m103741n(this.f45296b, View.ALPHA, 1.0f, 0.0f);
            animatorM103741n.setInterpolator(null);
            animatorM103741n.setDuration(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f45308n = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM103741n);
        }
        this.f45308n.start();
    }

    /* JADX INFO: renamed from: C */
    public final void m69634C() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM136282g = this.f45302h.m136282g();
        if (!bLiveGivenGiftBriefM136282g.canShowPreviewText || TextUtils.isEmpty(bLiveGivenGiftBriefM136282g.previewText)) {
            m69654y(bLiveGivenGiftBriefM136282g);
            this.f45309o = 0;
        } else {
            m69653x(bLiveGivenGiftBriefM136282g);
            this.f45309o = 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m69635D(final int[] iArr, @Nullable final LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView, boolean z) {
        m69637h();
        float fM136280e = z ? 1.0f : this.f45302h.m136280e();
        xdl0.m208345M0(this.f45301g, true);
        hxs.m133406s("context_livingAct", this.f45301g, this.f45302h.m136283h().url);
        this.f45300f.setProgress((int) fM136280e);
        m69655z();
        if (this.f45302h.m136276a() && fM136280e == 100.0f && liveVChatGiftGearsFlyView != null) {
            this.f45303i.m175847e(iArr, liveVChatGiftGearsFlyView, new d30() { // from class: l.bku
                @Override // p149l.d30
                public final void call() {
                    this.f76140a.m69647r();
                }
            }, new d30() { // from class: l.cku
                @Override // p149l.d30
                public final void call() {
                    this.f81352a.m69648s(iArr, liveVChatGiftGearsFlyView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m69636g(View view) {
        hku.m131585a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m69637h() {
        this.f45296b.setText("");
        this.f45297c.setText("");
        this.f45299e.setText("");
    }

    /* JADX INFO: renamed from: i */
    public void m69638i(d30 d30Var) {
        if (this.f45304j) {
            if (this.f45306l == null) {
                m69639j();
            }
            this.f45306l.removeAllListeners();
            Animator animator = this.f45306l;
            Objects.requireNonNull(d30Var);
            bt0.m103733f(animator, new bii0(d30Var));
            this.f45306l.start();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m69639j() {
        this.f45306l = bt0.m103753z(bt0.m103739l(this.f45295a, View.TRANSLATION_Y, 0L, 180L, null, 0.0f, t100.m186890d(60.0f)), bt0.m103739l(this.f45295a, bt0.f77162i, 0L, 180L, null, 1.0f, 0.0f), bt0.m103739l(this.f45295a, View.ALPHA, 0L, 230L, null, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: k */
    public final void m69640k() {
        ConstraintLayout constraintLayout = this.f45295a;
        float[] fArr = {t100.m186890d(60.0f), -t100.m186890d(10.0f)};
        Property property = View.TRANSLATION_Y;
        this.f45305k = bt0.m103753z(bt0.m103746s(bt0.m103739l(constraintLayout, property, 100L, 180L, null, fArr), bt0.m103739l(constraintLayout, property, 0L, 120L, null, -t100.m186890d(10.0f), 0.0f)), bt0.m103746s(bt0.m103739l(constraintLayout, bt0.f77162i, 100L, 180L, null, 0.0f, 1.1f), bt0.m103739l(constraintLayout, bt0.f77162i, 0L, 120L, null, 1.1f, 1.0f)), bt0.m103739l(constraintLayout, View.ALPHA, 100L, 230L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: l */
    public final void m69641l() {
        TextView textView = this.f45297c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        xxj.m211504e(textView, typeface);
        xxj.m211504e(this.f45299e, typeface);
        this.f45295a.setScaleX(0.0f);
        this.f45295a.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m69642m(ihs ihsVar) {
        ihs ihsVar2;
        return (!this.f45304j || (ihsVar2 = this.f45302h) == null || ihsVar2.m136292q(ihsVar)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m69643n() {
        this.f45304j = true;
        m69651v();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m69644o(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f45297c.setAlpha(fFloatValue);
        this.f45298d.setAlpha(fFloatValue);
        this.f45299e.setAlpha(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69636g(this);
        m69641l();
        this.f45303i = new qpj(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m69645p() {
        xdl0.m208345M0(this.f45297c, false);
        xdl0.m208345M0(this.f45298d, false);
        xdl0.m208345M0(this.f45299e, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m69646q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f45297c.setAlpha(fFloatValue);
        this.f45298d.setAlpha(fFloatValue);
        this.f45299e.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m69647r() {
        this.f45304j = false;
        this.f45310p = true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m69648s(int[] iArr, LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView) {
        ihs ihsVar;
        if (this.f45310p && (ihsVar = this.f45302h) != null && ihsVar.m136277b()) {
            this.f45310p = false;
            this.f45302h.m136296u();
            m69635D(iArr, liveVChatGiftGearsFlyView, true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f45304j = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m69649t(LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        int width = iArr[0] + (liveVChatGiftItemView.getWidth() / 2);
        int i = iArr[1];
        setTranslationX(width - t100.m186890d(44.0f));
        setTranslationY((i - t100.m186890d(60.0f)) - LiveVChatGiftOperationView.f45212i);
    }

    /* JADX INFO: renamed from: u */
    public void m69650u() {
        this.f45302h = null;
        this.f45304j = false;
        dt0.m113501A(this.f45305k);
        dt0.m113501A(this.f45307m);
        dt0.m113501A(this.f45308n);
        this.f45303i.m175846d();
    }

    /* JADX INFO: renamed from: v */
    public final void m69651v() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM136282g = this.f45302h.m136282g();
        if (bLiveGivenGiftBriefM136282g.canShowPreviewText && !TextUtils.isEmpty(bLiveGivenGiftBriefM136282g.previewText)) {
            xdl0.m208345M0(this.f45297c, false);
            xdl0.m208345M0(this.f45299e, false);
            xdl0.m208345M0(this.f45298d, false);
            xdl0.m208345M0(this.f45296b, true);
            this.f45296b.setText(nmj.m160107s(bLiveGivenGiftBriefM136282g.previewText));
            this.f45309o = 1;
            return;
        }
        int iIntValue = bLiveGivenGiftBriefM136282g.gearPercentInfo.get(0).intValue();
        int iIntValue2 = bLiveGivenGiftBriefM136282g.gearPercentInfo.get(1).intValue();
        this.f45297c.setText(String.valueOf(iIntValue));
        this.f45299e.setText(String.valueOf(iIntValue2));
        xdl0.m208345M0(this.f45297c, true);
        xdl0.m208345M0(this.f45299e, true);
        xdl0.m208345M0(this.f45298d, true);
        this.f45297c.setAlpha(1.0f);
        this.f45299e.setAlpha(1.0f);
        this.f45298d.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: w */
    public void m69652w(ihs ihsVar, int[] iArr, @Nullable LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView) {
        xdl0.m208344M(this, true);
        if (m69642m(ihsVar)) {
            this.f45304j = false;
        }
        this.f45310p = false;
        this.f45302h = ihsVar;
        m69635D(iArr, liveVChatGiftGearsFlyView, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m69653x(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = this.f45309o;
        LiveMarqueeTextView liveMarqueeTextView = this.f45296b;
        if (i == 1) {
            xdl0.m208345M0(liveMarqueeTextView, true);
            this.f45296b.setText(nmj.m160107s(bLiveGivenGiftBrief.previewText));
            xdl0.m208345M0(this.f45298d, false);
        } else {
            liveMarqueeTextView.setAlpha(0.0f);
            this.f45296b.setText(nmj.m160107s(bLiveGivenGiftBrief.previewText));
            xdl0.m208345M0(this.f45296b, true);
            m69632A();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: y */
    public final void m69654y(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        xdl0.m208345M0(this.f45296b, false);
        int i = this.f45309o;
        TextView textView = this.f45297c;
        if (i == 0) {
            textView.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
            this.f45299e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
            return;
        }
        textView.setAlpha(0.0f);
        this.f45298d.setAlpha(0.0f);
        this.f45299e.setAlpha(0.0f);
        xdl0.m208345M0(this.f45297c, true);
        xdl0.m208345M0(this.f45298d, true);
        xdl0.m208345M0(this.f45299e, true);
        this.f45297c.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
        this.f45299e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
        m69633B();
    }

    /* JADX INFO: renamed from: z */
    public final void m69655z() {
        if (this.f45304j) {
            m69634C();
            return;
        }
        this.f45309o = 0;
        if (this.f45305k == null) {
            m69640k();
        }
        this.f45305k.removeAllListeners();
        bt0.m103749v(this.f45305k, new Runnable() { // from class: l.dku
            @Override // java.lang.Runnable
            public final void run() {
                this.f86708a.m69643n();
            }
        });
        this.f45305k.start();
    }

    public LiveVChatGiftGearsProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45304j = false;
        this.f45309o = 0;
        this.f45310p = false;
    }

    public LiveVChatGiftGearsProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45304j = false;
        this.f45309o = 0;
        this.f45310p = false;
    }
}
