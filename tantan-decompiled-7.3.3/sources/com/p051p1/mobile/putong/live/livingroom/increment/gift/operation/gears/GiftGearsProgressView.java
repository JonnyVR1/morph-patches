package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

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
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VProgressBar;
import p153l.bnl0;
import p153l.bri0;
import p153l.cpj;
import p153l.fsj;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.n0k;
import p153l.qa00;
import p153l.x20;
import p153l.xsj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftGearsProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f50697a;

    /* JADX INFO: renamed from: b */
    public LiveMarqueeTextView f50698b;

    /* JADX INFO: renamed from: c */
    public TextView f50699c;

    /* JADX INFO: renamed from: d */
    public TextView f50700d;

    /* JADX INFO: renamed from: e */
    public TextView f50701e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f50702f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50703g;

    /* JADX INFO: renamed from: h */
    public jjs f50704h;

    /* JADX INFO: renamed from: i */
    public fsj f50705i;

    /* JADX INFO: renamed from: j */
    public boolean f50706j;

    /* JADX INFO: renamed from: k */
    public Animator f50707k;

    /* JADX INFO: renamed from: l */
    public Animator f50708l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f50709m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f50710n;

    /* JADX INFO: renamed from: o */
    public int f50711o;

    /* JADX INFO: renamed from: p */
    public boolean f50712p;

    public GiftGearsProgressView(Context context) {
        super(context);
        this.f50706j = false;
        this.f50711o = 0;
        this.f50712p = false;
    }

    /* JADX INFO: renamed from: A */
    public final void m75028A() {
        if (this.f50709m == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vsj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f185632a.m75040o(valueAnimator);
                }
            });
            gt0.m132160f(valueAnimatorOfFloat, new Runnable() { // from class: l.wsj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190654a.m75041p();
                }
            });
            Animator animatorM132168n = gt0.m132168n(this.f50698b, View.ALPHA, 0.0f, 1.0f);
            animatorM132168n.setDuration(160L);
            animatorM132168n.setInterpolator(null);
            animatorM132168n.setStartDelay(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f50709m = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM132168n);
        }
        this.f50709m.start();
    }

    /* JADX INFO: renamed from: B */
    public void m75029B() {
        it0.m142009C(this.f50710n);
        if (this.f50710n == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(320L);
            valueAnimatorOfFloat.setInterpolator(null);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.usj
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f180834a.m75042q(valueAnimator);
                }
            });
            Animator animatorM132168n = gt0.m132168n(this.f50698b, View.ALPHA, 1.0f, 0.0f);
            animatorM132168n.setInterpolator(null);
            animatorM132168n.setDuration(160L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f50710n = animatorSet;
            animatorSet.playTogether(valueAnimatorOfFloat, animatorM132168n);
        }
        this.f50710n.start();
    }

    /* JADX INFO: renamed from: C */
    public final void m75030C() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM145121g = this.f50704h.m145121g();
        if (!bLiveGivenGiftBriefM145121g.canShowPreviewText || TextUtils.isEmpty(bLiveGivenGiftBriefM145121g.previewText)) {
            m75050y(bLiveGivenGiftBriefM145121g);
            this.f50711o = 0;
        } else {
            m75049x(bLiveGivenGiftBriefM145121g);
            this.f50711o = 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m75031D(final int[] iArr, @Nullable final GiftGearsFlyView giftGearsFlyView, boolean z) {
        m75033h();
        float fM145119e = z ? 1.0f : this.f50704h.m145119e();
        bnl0.m105525M0(this.f50703g, true);
        izs.m142868s("context_livingAct", this.f50703g, this.f50704h.m145122h().url);
        this.f50702f.setProgress((int) fM145119e);
        m75051z();
        if (this.f50704h.m145115a() && fM145119e == 100.0f && giftGearsFlyView != null) {
            this.f50705i.m127198e(iArr, giftGearsFlyView, new x20() { // from class: l.rsj
                @Override // p153l.x20
                public final void call() {
                    this.f164697a.m75043r();
                }
            }, new x20() { // from class: l.ssj
                @Override // p153l.x20
                public final void call() {
                    this.f170462a.m75044s(iArr, giftGearsFlyView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m75032g(View view) {
        xsj.m212986a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m75033h() {
        this.f50698b.setText("");
        this.f50699c.setText("");
        this.f50701e.setText("");
    }

    /* JADX INFO: renamed from: i */
    public void m75034i(x20 x20Var) {
        if (this.f50706j) {
            if (this.f50708l == null) {
                m75035j();
            }
            this.f50708l.removeAllListeners();
            Animator animator = this.f50708l;
            Objects.requireNonNull(x20Var);
            gt0.m132160f(animator, new bri0(x20Var));
            this.f50708l.start();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m75035j() {
        this.f50708l = gt0.m132180z(gt0.m132166l(this.f50697a, View.TRANSLATION_Y, 0L, 180L, null, 0.0f, qa00.m175859d(60.0f)), gt0.m132166l(this.f50697a, gt0.f106354i, 0L, 180L, null, 1.0f, 0.0f), gt0.m132166l(this.f50697a, View.ALPHA, 0L, 230L, null, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: k */
    public final void m75036k() {
        ConstraintLayout constraintLayout = this.f50697a;
        float[] fArr = {qa00.m175859d(60.0f), -qa00.m175859d(10.0f)};
        Property property = View.TRANSLATION_Y;
        this.f50707k = gt0.m132180z(gt0.m132173s(gt0.m132166l(constraintLayout, property, 100L, 180L, null, fArr), gt0.m132166l(constraintLayout, property, 0L, 120L, null, -qa00.m175859d(10.0f), 0.0f)), gt0.m132173s(gt0.m132166l(constraintLayout, gt0.f106354i, 100L, 180L, null, 0.0f, 1.1f), gt0.m132166l(constraintLayout, gt0.f106354i, 0L, 120L, null, 1.1f, 1.0f)), gt0.m132166l(constraintLayout, View.ALPHA, 100L, 230L, null, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: l */
    public final void m75037l() {
        TextView textView = this.f50699c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        n0k.m161008e(textView, typeface);
        n0k.m161008e(this.f50701e, typeface);
        this.f50697a.setScaleX(0.0f);
        this.f50697a.setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m75038m(jjs jjsVar) {
        jjs jjsVar2;
        return (!this.f50706j || (jjsVar2 = this.f50704h) == null || jjsVar2.m145131q(jjsVar)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75039n() {
        this.f50706j = true;
        m75047v();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m75040o(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f50699c.setAlpha(fFloatValue);
        this.f50700d.setAlpha(fFloatValue);
        this.f50701e.setAlpha(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75032g(this);
        m75037l();
        this.f50705i = new fsj(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m75041p() {
        bnl0.m105525M0(this.f50699c, false);
        bnl0.m105525M0(this.f50700d, false);
        bnl0.m105525M0(this.f50701e, false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m75042q(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f50699c.setAlpha(fFloatValue);
        this.f50700d.setAlpha(fFloatValue);
        this.f50701e.setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m75043r() {
        this.f50706j = false;
        this.f50712p = true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m75044s(int[] iArr, GiftGearsFlyView giftGearsFlyView) {
        jjs jjsVar;
        if (this.f50712p && (jjsVar = this.f50704h) != null && jjsVar.m145116b()) {
            this.f50712p = false;
            this.f50704h.m145135u();
            m75031D(iArr, giftGearsFlyView, true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f50706j = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m75045t(LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        int width = iArr[0] + (liveGiftItemView.getWidth() / 2);
        int i = iArr[1];
        setTranslationX(width - qa00.m175859d(44.0f));
        setTranslationY((i - qa00.m175859d(60.0f)) - GiftOperationView.f50609i);
    }

    /* JADX INFO: renamed from: u */
    public void m75046u() {
        this.f50704h = null;
        this.f50706j = false;
        it0.m142007A(this.f50707k);
        it0.m142007A(this.f50709m);
        it0.m142007A(this.f50710n);
        this.f50705i.m127197d();
    }

    /* JADX INFO: renamed from: v */
    public final void m75047v() {
        BLiveGivenGiftBrief bLiveGivenGiftBriefM145121g = this.f50704h.m145121g();
        if (bLiveGivenGiftBriefM145121g.canShowPreviewText && !TextUtils.isEmpty(bLiveGivenGiftBriefM145121g.previewText)) {
            bnl0.m105525M0(this.f50699c, false);
            bnl0.m105525M0(this.f50701e, false);
            bnl0.m105525M0(this.f50700d, false);
            bnl0.m105525M0(this.f50698b, true);
            this.f50698b.setText(cpj.m111768D(bLiveGivenGiftBriefM145121g.previewText));
            this.f50711o = 1;
            return;
        }
        int iIntValue = bLiveGivenGiftBriefM145121g.gearPercentInfo.get(0).intValue();
        int iIntValue2 = bLiveGivenGiftBriefM145121g.gearPercentInfo.get(1).intValue();
        this.f50699c.setText(String.valueOf(iIntValue));
        this.f50701e.setText(String.valueOf(iIntValue2));
        bnl0.m105525M0(this.f50699c, true);
        bnl0.m105525M0(this.f50701e, true);
        bnl0.m105525M0(this.f50700d, true);
        this.f50699c.setAlpha(1.0f);
        this.f50701e.setAlpha(1.0f);
        this.f50700d.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: w */
    public void m75048w(jjs jjsVar, int[] iArr, @Nullable GiftGearsFlyView giftGearsFlyView) {
        bnl0.m105524M(this, true);
        if (m75038m(jjsVar)) {
            this.f50706j = false;
        }
        this.f50712p = false;
        this.f50704h = jjsVar;
        m75031D(iArr, giftGearsFlyView, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m75049x(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        int i = this.f50711o;
        LiveMarqueeTextView liveMarqueeTextView = this.f50698b;
        if (i == 1) {
            bnl0.m105525M0(liveMarqueeTextView, true);
            this.f50698b.setText(cpj.m111768D(bLiveGivenGiftBrief.previewText));
            bnl0.m105525M0(this.f50700d, false);
        } else {
            liveMarqueeTextView.setAlpha(0.0f);
            this.f50698b.setText(cpj.m111768D(bLiveGivenGiftBrief.previewText));
            bnl0.m105525M0(this.f50698b, true);
            m75028A();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: y */
    public final void m75050y(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bnl0.m105525M0(this.f50698b, false);
        int i = this.f50711o;
        TextView textView = this.f50699c;
        if (i == 0) {
            textView.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
            this.f50701e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
            return;
        }
        textView.setAlpha(0.0f);
        this.f50700d.setAlpha(0.0f);
        this.f50701e.setAlpha(0.0f);
        bnl0.m105525M0(this.f50699c, true);
        bnl0.m105525M0(this.f50700d, true);
        bnl0.m105525M0(this.f50701e, true);
        this.f50699c.setText(bLiveGivenGiftBrief.gearPercentInfo.get(0).toString());
        this.f50701e.setText(bLiveGivenGiftBrief.gearPercentInfo.get(1).toString());
        m75029B();
    }

    /* JADX INFO: renamed from: z */
    public final void m75051z() {
        if (this.f50706j) {
            m75030C();
            return;
        }
        this.f50711o = 0;
        if (this.f50707k == null) {
            m75036k();
        }
        this.f50707k.removeAllListeners();
        gt0.m132176v(this.f50707k, new Runnable() { // from class: l.tsj
            @Override // java.lang.Runnable
            public final void run() {
                this.f176006a.m75039n();
            }
        });
        this.f50707k.start();
    }

    public GiftGearsProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50706j = false;
        this.f50711o = 0;
        this.f50712p = false;
    }

    public GiftGearsProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50706j = false;
        this.f50711o = 0;
        this.f50712p = false;
    }
}
