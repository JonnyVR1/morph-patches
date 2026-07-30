package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

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
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VProgressBar;
import p149l.bii0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.hqj;
import p149l.hxs;
import p149l.ihs;
import p149l.mmj;
import p149l.ppj;
import p149l.t100;
import p149l.xdl0;
import p149l.xxj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftGearsProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f49849a;

    /* JADX INFO: renamed from: b */
    public LiveMarqueeTextView f49850b;

    /* JADX INFO: renamed from: c */
    public TextView f49851c;

    /* JADX INFO: renamed from: d */
    public TextView f49852d;

    /* JADX INFO: renamed from: e */
    public TextView f49853e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f49854f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49855g;

    /* JADX INFO: renamed from: h */
    public ihs f49856h;

    /* JADX INFO: renamed from: i */
    public ppj f49857i;

    /* JADX INFO: renamed from: j */
    public boolean f49858j;

    /* JADX INFO: renamed from: k */
    public Animator f49859k;

    /* JADX INFO: renamed from: l */
    public Animator f49860l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f49861m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f49862n;

    /* JADX INFO: renamed from: o */
    public int f49863o;

    /* JADX INFO: renamed from: p */
    public boolean f49864p;

    public GiftGearsProgressView(Context context) {
        super(context);
        this.f49858j = false;
        this.f49863o = 0;
        this.f49864p = false;
    }

    /* JADX INFO: renamed from: A */
    public final void m73845A() {
        if (this.f49861m == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fqj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f98819a.m73857o(valueAnimator);
                }
            });
            bt0.m103733f(valueAnimatorOfFloat, new Runnable() { // from class: l.gqj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103955a.m73858p();
                }
            });
            Animator animatorM103741n = bt0.m103741n(this.f49850b, View.ALPHA, 0.0f, 1.0f);
            animatorM103741n.setDuration(160L);
            animatorM103741n.setInterpolator(null);
            animatorM103741n.setStartDelay(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f49861m = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM103741n);
        }
        this.f49861m.start();
    }

    /* JADX INFO: renamed from: B */
    public void m73846B() {
        dt0.m113503C(this.f49862n);
        if (this.f49862n == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.eqj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f92806a.m73859q(valueAnimator);
                }
            });
            Animator animatorM103741n = bt0.m103741n(this.f49850b, View.ALPHA, 1.0f, 0.0f);
            animatorM103741n.setInterpolator(null);
            animatorM103741n.setDuration(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f49862n = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM103741n);
        }
        this.f49862n.start();
    }

    /* JADX INFO: renamed from: C */
    public final void m73847C() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM136282g = this.f49856h.m136282g();
        if (!bLiveGivenGiftBriefM136282g.canShowPreviewText || TextUtils.isEmpty(bLiveGivenGiftBriefM136282g.previewText)) {
            m73867y(bLiveGivenGiftBriefM136282g);
            this.f49863o = 0;
        } else {
            m73866x(bLiveGivenGiftBriefM136282g);
            this.f49863o = 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m73848D(final int[] iArr, @Nullable final GiftGearsFlyView giftGearsFlyView, boolean z) {
        m73850h();
        float fM136280e = z ? 1.0f : this.f49856h.m136280e();
        xdl0.m208345M0(this.f49855g, true);
        hxs.m133406s("context_livingAct", this.f49855g, this.f49856h.m136283h().url);
        this.f49854f.setProgress((int) fM136280e);
        m73868z();
        if (this.f49856h.m136276a() && fM136280e == 100.0f && giftGearsFlyView != null) {
            this.f49857i.m170738e(iArr, giftGearsFlyView, new d30() { // from class: l.bqj
                @Override // p149l.d30
                public final void call() {
                    this.f76785a.m73860r();
                }
            }, new d30() { // from class: l.cqj
                @Override // p149l.d30
                public final void call() {
                    this.f82084a.m73861s(iArr, giftGearsFlyView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m73849g(View view) {
        hqj.m132455a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m73850h() {
        this.f49850b.setText("");
        this.f49851c.setText("");
        this.f49853e.setText("");
    }

    /* JADX INFO: renamed from: i */
    public void m73851i(d30 d30Var) {
        if (this.f49858j) {
            if (this.f49860l == null) {
                m73852j();
            }
            this.f49860l.removeAllListeners();
            Animator animator = this.f49860l;
            Objects.requireNonNull(d30Var);
            bt0.m103733f(animator, new bii0(d30Var));
            this.f49860l.start();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m73852j() {
        this.f49860l = bt0.m103753z(bt0.m103739l(this.f49849a, View.TRANSLATION_Y, 0L, 180L, null, 0.0f, t100.m186890d(60.0f)), bt0.m103739l(this.f49849a, bt0.f77162i, 0L, 180L, null, 1.0f, 0.0f), bt0.m103739l(this.f49849a, View.ALPHA, 0L, 230L, null, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: k */
    public final void m73853k() {
        ConstraintLayout constraintLayout = this.f49849a;
        float[] fArr = {t100.m186890d(60.0f), -t100.m186890d(10.0f)};
        Property property = View.TRANSLATION_Y;
        this.f49859k = bt0.m103753z(bt0.m103746s(bt0.m103739l(constraintLayout, property, 100L, 180L, null, fArr), bt0.m103739l(constraintLayout, property, 0L, 120L, null, -t100.m186890d(10.0f), 0.0f)), bt0.m103746s(bt0.m103739l(constraintLayout, bt0.f77162i, 100L, 180L, null, 0.0f, 1.1f), bt0.m103739l(constraintLayout, bt0.f77162i, 0L, 120L, null, 1.1f, 1.0f)), bt0.m103739l(constraintLayout, View.ALPHA, 100L, 230L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: l */
    public final void m73854l() {
        TextView textView = this.f49851c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        xxj.m211504e(textView, typeface);
        xxj.m211504e(this.f49853e, typeface);
        this.f49849a.setScaleX(0.0f);
        this.f49849a.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m73855m(ihs ihsVar) {
        ihs ihsVar2;
        return (!this.f49858j || (ihsVar2 = this.f49856h) == null || ihsVar2.m136292q(ihsVar)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m73856n() {
        this.f49858j = true;
        m73864v();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m73857o(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f49851c.setAlpha(fFloatValue);
        this.f49852d.setAlpha(fFloatValue);
        this.f49853e.setAlpha(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73849g(this);
        m73854l();
        this.f49857i = new ppj(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m73858p() {
        xdl0.m208345M0(this.f49851c, false);
        xdl0.m208345M0(this.f49852d, false);
        xdl0.m208345M0(this.f49853e, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m73859q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f49851c.setAlpha(fFloatValue);
        this.f49852d.setAlpha(fFloatValue);
        this.f49853e.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m73860r() {
        this.f49858j = false;
        this.f49864p = true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m73861s(int[] iArr, GiftGearsFlyView giftGearsFlyView) {
        ihs ihsVar;
        if (this.f49864p && (ihsVar = this.f49856h) != null && ihsVar.m136277b()) {
            this.f49864p = false;
            this.f49856h.m136296u();
            m73848D(iArr, giftGearsFlyView, true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f49858j = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m73862t(LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        int width = iArr[0] + (liveGiftItemView.getWidth() / 2);
        int i = iArr[1];
        setTranslationX(width - t100.m186890d(44.0f));
        setTranslationY((i - t100.m186890d(60.0f)) - GiftOperationView.f49761i);
    }

    /* JADX INFO: renamed from: u */
    public void m73863u() {
        this.f49856h = null;
        this.f49858j = false;
        dt0.m113501A(this.f49859k);
        dt0.m113501A(this.f49861m);
        dt0.m113501A(this.f49862n);
        this.f49857i.m170737d();
    }

    /* JADX INFO: renamed from: v */
    public final void m73864v() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM136282g = this.f49856h.m136282g();
        if (bLiveGivenGiftBriefM136282g.canShowPreviewText && !TextUtils.isEmpty(bLiveGivenGiftBriefM136282g.previewText)) {
            xdl0.m208345M0(this.f49851c, false);
            xdl0.m208345M0(this.f49853e, false);
            xdl0.m208345M0(this.f49852d, false);
            xdl0.m208345M0(this.f49850b, true);
            this.f49850b.setText(mmj.m155401D(bLiveGivenGiftBriefM136282g.previewText));
            this.f49863o = 1;
            return;
        }
        int iIntValue = bLiveGivenGiftBriefM136282g.gearPercentInfo.get(0).intValue();
        int iIntValue2 = bLiveGivenGiftBriefM136282g.gearPercentInfo.get(1).intValue();
        this.f49851c.setText(String.valueOf(iIntValue));
        this.f49853e.setText(String.valueOf(iIntValue2));
        xdl0.m208345M0(this.f49851c, true);
        xdl0.m208345M0(this.f49853e, true);
        xdl0.m208345M0(this.f49852d, true);
        this.f49851c.setAlpha(1.0f);
        this.f49853e.setAlpha(1.0f);
        this.f49852d.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: w */
    public void m73865w(ihs ihsVar, int[] iArr, @Nullable GiftGearsFlyView giftGearsFlyView) {
        xdl0.m208344M(this, true);
        if (m73855m(ihsVar)) {
            this.f49858j = false;
        }
        this.f49864p = false;
        this.f49856h = ihsVar;
        m73848D(iArr, giftGearsFlyView, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m73866x(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = this.f49863o;
        LiveMarqueeTextView liveMarqueeTextView = this.f49850b;
        if (i == 1) {
            xdl0.m208345M0(liveMarqueeTextView, true);
            this.f49850b.setText(mmj.m155401D(bLiveGivenGiftBrief.previewText));
            xdl0.m208345M0(this.f49852d, false);
        } else {
            liveMarqueeTextView.setAlpha(0.0f);
            this.f49850b.setText(mmj.m155401D(bLiveGivenGiftBrief.previewText));
            xdl0.m208345M0(this.f49850b, true);
            m73845A();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: y */
    public final void m73867y(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        xdl0.m208345M0(this.f49850b, false);
        int i = this.f49863o;
        TextView textView = this.f49851c;
        if (i == 0) {
            textView.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
            this.f49853e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
            return;
        }
        textView.setAlpha(0.0f);
        this.f49852d.setAlpha(0.0f);
        this.f49853e.setAlpha(0.0f);
        xdl0.m208345M0(this.f49851c, true);
        xdl0.m208345M0(this.f49852d, true);
        xdl0.m208345M0(this.f49853e, true);
        this.f49851c.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
        this.f49853e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
        m73846B();
    }

    /* JADX INFO: renamed from: z */
    public final void m73868z() {
        if (this.f49858j) {
            m73847C();
            return;
        }
        this.f49863o = 0;
        if (this.f49859k == null) {
            m73853k();
        }
        this.f49859k.removeAllListeners();
        bt0.m103749v(this.f49859k, new Runnable() { // from class: l.dqj
            @Override // java.lang.Runnable
            public final void run() {
                this.f87426a.m73856n();
            }
        });
        this.f49859k.start();
    }

    public GiftGearsProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49858j = false;
        this.f49863o = 0;
        this.f49864p = false;
    }

    public GiftGearsProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49858j = false;
        this.f49863o = 0;
        this.f49864p = false;
    }
}
