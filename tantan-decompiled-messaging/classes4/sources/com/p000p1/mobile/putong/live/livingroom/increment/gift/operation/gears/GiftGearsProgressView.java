package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.Objects;
import l.bii0;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.hqj;
import p002l.ihs;
import p002l.mmj;
import p002l.ppj;
import p002l.xxj;
import v.VDraweeView;
import v.VProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftGearsProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f5891a;

    /* JADX INFO: renamed from: b */
    public LiveMarqueeTextView f5892b;

    /* JADX INFO: renamed from: c */
    public TextView f5893c;

    /* JADX INFO: renamed from: d */
    public TextView f5894d;

    /* JADX INFO: renamed from: e */
    public TextView f5895e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f5896f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5897g;

    /* JADX INFO: renamed from: h */
    public ihs f5898h;

    /* JADX INFO: renamed from: i */
    public ppj f5899i;

    /* JADX INFO: renamed from: j */
    public boolean f5900j;

    /* JADX INFO: renamed from: k */
    public Animator f5901k;

    /* JADX INFO: renamed from: l */
    public Animator f5902l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f5903m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f5904n;

    /* JADX INFO: renamed from: o */
    public int f5905o;

    /* JADX INFO: renamed from: p */
    public boolean f5906p;

    public GiftGearsProgressView(Context context) {
        super(context);
        this.f5900j = false;
        this.f5905o = 0;
        this.f5906p = false;
    }

    /* JADX INFO: renamed from: A */
    public final void m7401A() {
        if (this.f5903m == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fqj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f10598a.m7413o(valueAnimator);
                }
            });
            bt0.f(valueAnimatorOfFloat, new Runnable() { // from class: l.gqj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11579a.m7414p();
                }
            });
            Animator animatorN = bt0.n(this.f5892b, View.ALPHA, new float[]{0.0f, 1.0f});
            animatorN.setDuration(160L);
            animatorN.setInterpolator(null);
            animatorN.setStartDelay(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5903m = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorN);
        }
        this.f5903m.start();
    }

    /* JADX INFO: renamed from: B */
    public void m7402B() {
        dt0.C(this.f5904n);
        if (this.f5904n == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.eqj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9932a.m7415q(valueAnimator);
                }
            });
            Animator animatorN = bt0.n(this.f5892b, View.ALPHA, new float[]{1.0f, 0.0f});
            animatorN.setInterpolator(null);
            animatorN.setDuration(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5904n = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorN);
        }
        this.f5904n.start();
    }

    /* JADX INFO: renamed from: C */
    public final void m7403C() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM15159g = this.f5898h.m15159g();
        if (!bLiveGivenGiftBriefM15159g.canShowPreviewText || TextUtils.isEmpty(bLiveGivenGiftBriefM15159g.previewText)) {
            m7423y(bLiveGivenGiftBriefM15159g);
            this.f5905o = 0;
        } else {
            m7422x(bLiveGivenGiftBriefM15159g);
            this.f5905o = 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m7404D(final int[] iArr, @Nullable final GiftGearsFlyView giftGearsFlyView, boolean z) {
        m7406h();
        float fM15157e = z ? 1.0f : this.f5898h.m15157e();
        xdl0.M0(this.f5897g, true);
        hxs.s("context_livingAct", this.f5897g, this.f5898h.m15160h().url);
        this.f5896f.setProgress((int) fM15157e);
        m7424z();
        if (this.f5898h.m15153a() && fM15157e == 100.0f && giftGearsFlyView != null) {
            this.f5899i.m20527e(iArr, giftGearsFlyView, new d30() { // from class: l.bqj
                public final void call() {
                    this.f8310a.m7416r();
                }
            }, new d30() { // from class: l.cqj
                public final void call() {
                    this.f8903a.m7417s(iArr, giftGearsFlyView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7405g(View view) {
        hqj.m14677a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m7406h() {
        this.f5892b.setText("");
        this.f5893c.setText("");
        this.f5895e.setText("");
    }

    /* JADX INFO: renamed from: i */
    public void m7407i(d30 d30Var) {
        if (this.f5900j) {
            if (this.f5902l == null) {
                m7408j();
            }
            this.f5902l.removeAllListeners();
            Animator animator = this.f5902l;
            Objects.requireNonNull(d30Var);
            bt0.f(animator, new bii0(d30Var));
            this.f5902l.start();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7408j() {
        this.f5902l = bt0.z(new Animator[]{bt0.l(this.f5891a, View.TRANSLATION_Y, 0L, 180L, (Interpolator) null, new float[]{0.0f, t100.d(60.0f)}), bt0.l(this.f5891a, bt0.i, 0L, 180L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.l(this.f5891a, View.ALPHA, 0L, 230L, (Interpolator) null, new float[]{1.0f, 0.0f})});
    }

    /* JADX INFO: renamed from: k */
    public final void m7409k() {
        ConstraintLayout constraintLayout = this.f5891a;
        float[] fArr = {t100.d(60.0f), -t100.d(10.0f)};
        Property property = View.TRANSLATION_Y;
        this.f5901k = bt0.z(new Animator[]{bt0.s(new Animator[]{bt0.l(constraintLayout, property, 100L, 180L, (Interpolator) null, fArr), bt0.l(constraintLayout, property, 0L, 120L, (Interpolator) null, new float[]{-t100.d(10.0f), 0.0f})}), bt0.s(new Animator[]{bt0.l(constraintLayout, bt0.i, 100L, 180L, (Interpolator) null, new float[]{0.0f, 1.1f}), bt0.l(constraintLayout, bt0.i, 0L, 120L, (Interpolator) null, new float[]{1.1f, 1.0f})}), bt0.l(constraintLayout, View.ALPHA, 100L, 230L, (Interpolator) null, new float[]{0.0f, 1.0f})});
    }

    /* JADX INFO: renamed from: l */
    public final void m7410l() {
        TextView textView = this.f5893c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        xxj.m26168e(textView, typeface);
        xxj.m26168e(this.f5895e, typeface);
        this.f5891a.setScaleX(0.0f);
        this.f5891a.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m7411m(ihs ihsVar) {
        ihs ihsVar2;
        return (!this.f5900j || (ihsVar2 = this.f5898h) == null || ihsVar2.m15169q(ihsVar)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7412n() {
        this.f5900j = true;
        m7420v();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7413o(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5893c.setAlpha(fFloatValue);
        this.f5894d.setAlpha(fFloatValue);
        this.f5895e.setAlpha(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7405g(this);
        m7410l();
        this.f5899i = new ppj(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m7414p() {
        xdl0.M0(this.f5893c, false);
        xdl0.M0(this.f5894d, false);
        xdl0.M0(this.f5895e, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m7415q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5893c.setAlpha(fFloatValue);
        this.f5894d.setAlpha(fFloatValue);
        this.f5895e.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7416r() {
        this.f5900j = false;
        this.f5906p = true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7417s(int[] iArr, GiftGearsFlyView giftGearsFlyView) {
        ihs ihsVar;
        if (this.f5906p && (ihsVar = this.f5898h) != null && ihsVar.m15154b()) {
            this.f5906p = false;
            this.f5898h.m15173u();
            m7404D(iArr, giftGearsFlyView, true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f5900j = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m7418t(LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        int width = iArr[0] + (liveGiftItemView.getWidth() / 2);
        int i = iArr[1];
        setTranslationX(width - t100.d(44.0f));
        setTranslationY((i - t100.d(60.0f)) - GiftOperationView.f5803i);
    }

    /* JADX INFO: renamed from: u */
    public void m7419u() {
        this.f5898h = null;
        this.f5900j = false;
        dt0.A(this.f5901k);
        dt0.A(this.f5903m);
        dt0.A(this.f5904n);
        this.f5899i.m20526d();
    }

    /* JADX INFO: renamed from: v */
    public final void m7420v() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM15159g = this.f5898h.m15159g();
        if (bLiveGivenGiftBriefM15159g.canShowPreviewText && !TextUtils.isEmpty(bLiveGivenGiftBriefM15159g.previewText)) {
            xdl0.M0(this.f5893c, false);
            xdl0.M0(this.f5895e, false);
            xdl0.M0(this.f5894d, false);
            xdl0.M0(this.f5892b, true);
            this.f5892b.setText(mmj.m18043D(bLiveGivenGiftBriefM15159g.previewText));
            this.f5905o = 1;
            return;
        }
        int iIntValue = ((Integer) bLiveGivenGiftBriefM15159g.gearPercentInfo.get(0)).intValue();
        int iIntValue2 = ((Integer) bLiveGivenGiftBriefM15159g.gearPercentInfo.get(1)).intValue();
        this.f5893c.setText(String.valueOf(iIntValue));
        this.f5895e.setText(String.valueOf(iIntValue2));
        xdl0.M0(this.f5893c, true);
        xdl0.M0(this.f5895e, true);
        xdl0.M0(this.f5894d, true);
        this.f5893c.setAlpha(1.0f);
        this.f5895e.setAlpha(1.0f);
        this.f5894d.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: w */
    public void m7421w(ihs ihsVar, int[] iArr, @Nullable GiftGearsFlyView giftGearsFlyView) {
        xdl0.M(this, true);
        if (m7411m(ihsVar)) {
            this.f5900j = false;
        }
        this.f5906p = false;
        this.f5898h = ihsVar;
        m7404D(iArr, giftGearsFlyView, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m7422x(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = this.f5905o;
        AppCompatTextView appCompatTextView = this.f5892b;
        if (i == 1) {
            xdl0.M0(appCompatTextView, true);
            this.f5892b.setText(mmj.m18043D(bLiveGivenGiftBrief.previewText));
            xdl0.M0(this.f5894d, false);
        } else {
            appCompatTextView.setAlpha(0.0f);
            this.f5892b.setText(mmj.m18043D(bLiveGivenGiftBrief.previewText));
            xdl0.M0(this.f5892b, true);
            m7401A();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: y */
    public final void m7423y(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        xdl0.M0(this.f5892b, false);
        int i = this.f5905o;
        TextView textView = this.f5893c;
        if (i == 0) {
            textView.setText(((Integer) bLiveGivenGiftBrief.gearPercentInfo.get(0)).toString());
            this.f5895e.setText(((Integer) bLiveGivenGiftBrief.gearPercentInfo.get(1)).toString());
            return;
        }
        textView.setAlpha(0.0f);
        this.f5894d.setAlpha(0.0f);
        this.f5895e.setAlpha(0.0f);
        xdl0.M0(this.f5893c, true);
        xdl0.M0(this.f5894d, true);
        xdl0.M0(this.f5895e, true);
        this.f5893c.setText(((Integer) bLiveGivenGiftBrief.gearPercentInfo.get(0)).toString());
        this.f5895e.setText(((Integer) bLiveGivenGiftBrief.gearPercentInfo.get(1)).toString());
        m7402B();
    }

    /* JADX INFO: renamed from: z */
    public final void m7424z() {
        if (this.f5900j) {
            m7403C();
            return;
        }
        this.f5905o = 0;
        if (this.f5901k == null) {
            m7409k();
        }
        this.f5901k.removeAllListeners();
        bt0.v(this.f5901k, new Runnable() { // from class: l.dqj
            @Override // java.lang.Runnable
            public final void run() {
                this.f9393a.m7412n();
            }
        });
        this.f5901k.start();
    }

    public GiftGearsProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5900j = false;
        this.f5905o = 0;
        this.f5906p = false;
    }

    public GiftGearsProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5900j = false;
        this.f5905o = 0;
        this.f5906p = false;
    }
}
