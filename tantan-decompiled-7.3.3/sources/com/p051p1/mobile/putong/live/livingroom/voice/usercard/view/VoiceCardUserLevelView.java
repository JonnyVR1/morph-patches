package com.p051p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.a5n0;
import p153l.bnl0;
import p153l.fhw;
import p153l.izs;
import p153l.l51;
import p153l.ln4;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;
import p153l.qnp0;
import p153l.v7p0;
import p153l.vak0;
import p153l.x20;
import p153l.xau;
import p153l.yau;
import p153l.yyb;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceCardUserLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f54737a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54738b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f54739c;

    /* JADX INFO: renamed from: d */
    public VText f54740d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f54741e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f54742f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54743g;

    /* JADX INFO: renamed from: h */
    public VFrame f54744h;

    /* JADX INFO: renamed from: i */
    public View f54745i;

    /* JADX INFO: renamed from: j */
    public VText f54746j;

    /* JADX INFO: renamed from: k */
    public VText f54747k;

    /* JADX INFO: renamed from: l */
    public VText f54748l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f54749m;

    /* JADX INFO: renamed from: n */
    public vak0 f54750n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f54751o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView$a */
    public class C13214a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f54752a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f54753b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f54754c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BLiveUserProfileConfigHierarchy f54755d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f54756e;

        public C13214a(View view, View view2, boolean z, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view3) {
            this.f54752a = view;
            this.f54753b = view2;
            this.f54754c = z;
            this.f54755d = bLiveUserProfileConfigHierarchy;
            this.f54756e = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceCardUserLevelView.this.f54737a.setClickable(true);
            VoiceCardUserLevelView.this.f54742f.setClickable(true);
            this.f54756e.setVisibility(8);
            this.f54756e.setAlpha(1.0f);
            if (!this.f54754c) {
                VoiceCardUserLevelView.this.setShadowProgress(0);
            }
            VoiceCardUserLevelView.this.f54749m.m69687n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VoiceCardUserLevelView.this.setShadowProgress(0);
            this.f54752a.setAlpha(0.0f);
            this.f54753b.setAlpha(0.0f);
            this.f54752a.setVisibility(0);
            VoiceCardUserLevelView.this.f54737a.setClickable(false);
            VoiceCardUserLevelView.this.f54742f.setClickable(false);
            if (this.f54754c) {
                vak0 vak0Var = VoiceCardUserLevelView.this.f54750n;
                AnimEffectPlayer animEffectPlayer = VoiceCardUserLevelView.this.f54749m;
                BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = this.f54755d;
                ln4.m154946c(vak0Var, animEffectPlayer, true, true, bLiveUserProfileConfigHierarchy.grade, bLiveUserProfileConfigHierarchy.superGrade);
            }
        }
    }

    public VoiceCardUserLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m79934E(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m79935F(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m79946C(this.f54742f, this.f54737a, this.f54738b, bLiveUserProfileConfigHierarchy, false);
    }

    /* JADX INFO: renamed from: L */
    private void m79936L(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        qnp0.m177261d1(this.f54744h, bnl0.m105587w(11.0f));
        long j = bLiveUserProfileConfigHierarchy.superGrade;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f54746j.setTypeface(null);
        long j2 = bLiveUserProfileConfigHierarchy.gap;
        if (j2 <= 999999 || xau.m209905o(yau.m214935c(j2)) == -1) {
            this.f54746j.setTypeface(typeface);
            this.f54746j.setText(String.valueOf(bLiveUserProfileConfigHierarchy.gap));
        } else {
            SpannableString spannableString = new SpannableString(yau.m214935c(bLiveUserProfileConfigHierarchy.gap));
            int color = getContext().getResources().getColor(n9c0.f140877w1);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, v7p0.f182790o), 0, xau.m209905o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, v7p0.f182791p), xau.m209905o(spannableString.toString()), spannableString.length(), 18);
            this.f54746j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f54743g;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        if (j > 0) {
            setShadowProgress(0);
        }
        ln4.m154949f(this.f54750n, true, bLiveUserProfileConfigHierarchy.grade, this.f54745i);
        double d = bLiveUserProfileConfigHierarchy.wealthRatio;
        VText vText = this.f54747k;
        if (d == 1.0d) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f54746j, false);
            bnl0.m105524M(this.f54748l, true);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f54746j, true);
            bnl0.m105524M(this.f54748l, false);
        }
    }

    /* JADX INFO: renamed from: M */
    private void m79937M(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        izs.m142869t("context_livingAct", this.f54739c, bLiveUserProfileConfigHierarchy.iconUrl, qa00.m175859d(46.0f));
        fhw.m125605a("VoiceCardUserLevelView", "hierarchy.iconUrl:" + bLiveUserProfileConfigHierarchy.iconUrl);
        this.f54740d.setTypeface(Typeface.DEFAULT_BOLD);
        long j = bLiveUserProfileConfigHierarchy.superGrade;
        vak0 vak0Var = this.f54750n;
        if (j > 0) {
            ln4.m154951h(vak0Var, true, this.f54740d);
            this.f54741e.setText(R$string.f47850Ue);
            this.f54740d.setText(String.valueOf(j));
        } else {
            ln4.m154950g(vak0Var, true, bLiveUserProfileConfigHierarchy.grade, this.f54740d);
            this.f54741e.setText(R$string.f47871Ve);
            this.f54740d.setText(String.valueOf(bLiveUserProfileConfigHierarchy.grade));
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f54738b;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        m79949N(this.f54740d, this.f54741e);
        l51.m152888H(getContext(), new Runnable() { // from class: l.z4n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f202967a.m79947G(bLiveUserProfileConfigHierarchy);
            }
        }, 450L);
    }

    /* JADX INFO: renamed from: O */
    private void m79938O() {
        bnl0.m105524M(this.f54737a, true);
        bnl0.m105524M(this.f54742f, false);
    }

    public static GradientDrawable getDefaultCardBgDraw() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(16.0f));
        gradientDrawable.setColor(Color.parseColor("#242429"));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m79940s(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        bnl0.m105507D0((int) Math.min(this.f54737a.getWidth() - qa00.m175859d(12.0f), i * (this.f54737a.getWidth() - qa00.m175859d(12.0f)) * 0.01f), this.f54745i);
    }

    /* JADX INFO: renamed from: B */
    public final void m79945B(View view) {
        a5n0.m96238a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m79946C(View view, View view2, View view3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.85f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.85f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(300L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view2, "scaleX", 0.85f, 1.05f);
        objectAnimatorOfFloat4.setDuration(200L);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, "scaleY", 0.85f, 1.05f);
        objectAnimatorOfFloat5.setDuration(200L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, "scaleX", 1.05f, 1.0f);
        objectAnimatorOfFloat6.setDuration(300L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view2, "scaleY", 1.05f, 1.0f);
        objectAnimatorOfFloat7.setDuration(300L);
        objectAnimatorOfFloat7.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat8.setDuration(300L);
        objectAnimatorOfFloat8.setStartDelay(100L);
        objectAnimatorOfFloat8.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat9.setDuration(300L);
        objectAnimatorOfFloat9.setInterpolator(new LinearInterpolator());
        ValueAnimator duration = ValueAnimator.ofInt(0, (int) (bLiveUserProfileConfigHierarchy.wealthRatio * 100.0d)).setDuration(220L);
        duration.setInterpolator(new yyb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.w4n0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f187419a.m79934E(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f54751o = animatorSet;
        animatorSet.addListener(new C13214a(view2, view3, z, bLiveUserProfileConfigHierarchy, view));
        this.f54751o.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f54751o.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f54751o.start();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m79947G(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy) {
        ln4.m154946c(this.f54750n, this.f54749m, true, false, bLiveUserProfileConfigHierarchy.grade, bLiveUserProfileConfigHierarchy.superGrade);
    }

    /* JADX INFO: renamed from: K */
    public void m79948K(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, vak0 vak0Var, String str, String str2, final x20 x20Var) {
        if (ln4.m154945b(vak0Var)) {
            this.f54750n = vak0Var;
        }
        m79938O();
        m79937M(bLiveUserProfileConfigHierarchy, str);
        m79936L(bLiveUserProfileConfigHierarchy, str2);
        bnl0.m105509E0(this.f54737a, new View.OnClickListener() { // from class: l.x4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCardUserLevelView.m79940s(x20Var, view);
            }
        });
        bnl0.m105509E0(this.f54742f, new View.OnClickListener() { // from class: l.y4n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197508a.m79935F(bLiveUserProfileConfigHierarchy, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m79949N(VText vText, VText vText2) {
        if (!ln4.m154945b(this.f54750n) || TextUtils.isEmpty(this.f54750n.m200535j().textColor)) {
            vText2.setTextColor(Color.parseColor(n3d0.m161286j(vText.getCurrentTextColor(), "80")));
        } else {
            vText2.setTextColor(n3d0.m161284h(this.f54750n.m200535j().textColor, n3d0.m161277a(n9c0.f140877w1)));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m79950P(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy) {
        m79946C(this.f54737a, this.f54742f, this.f54743g, bLiveUserProfileConfigHierarchy, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f54751o;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f54751o.end();
        }
        this.f54742f.setScaleX(1.0f);
        this.f54742f.setScaleY(1.0f);
        this.f54742f.setAlpha(1.0f);
        this.f54743g.setAlpha(1.0f);
        this.f54737a.setScaleX(1.0f);
        this.f54737a.setScaleY(1.0f);
        this.f54737a.setAlpha(1.0f);
        this.f54738b.setAlpha(1.0f);
        this.f54749m.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79945B(this);
    }

    public VoiceCardUserLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardUserLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
