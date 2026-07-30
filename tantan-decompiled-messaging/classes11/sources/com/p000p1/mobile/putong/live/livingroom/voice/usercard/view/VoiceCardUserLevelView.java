package com.p000p1.mobile.putong.live.livingroom.voice.usercard.view;

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
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.R;
import l.d30;
import l.e51;
import l.h1c0;
import l.hfw;
import l.hxs;
import l.kvc0;
import l.kxb;
import l.mep0;
import l.mm4;
import l.p1k0;
import l.t100;
import l.w8u;
import l.wvm0;
import l.xdl0;
import p009l.ryo0;
import p009l.x8u;
import v.VDraweeView;
import v.VFrame;
import v.VMarqueeText;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCardUserLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7495a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7496b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7497c;

    /* JADX INFO: renamed from: d */
    public VText f7498d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f7499e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f7500f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7501g;

    /* JADX INFO: renamed from: h */
    public VFrame f7502h;

    /* JADX INFO: renamed from: i */
    public View f7503i;

    /* JADX INFO: renamed from: j */
    public VText f7504j;

    /* JADX INFO: renamed from: k */
    public VText f7505k;

    /* JADX INFO: renamed from: l */
    public VText f7506l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f7507m;

    /* JADX INFO: renamed from: n */
    public p1k0 f7508n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f7509o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView$a */
    public class C0453a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f7510a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f7511b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f7512c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BLiveUserProfileConfigHierarchy f7513d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f7514e;

        public C0453a(View view, View view2, boolean z, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view3) {
            this.f7510a = view;
            this.f7511b = view2;
            this.f7512c = z;
            this.f7513d = bLiveUserProfileConfigHierarchy;
            this.f7514e = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceCardUserLevelView.this.f7495a.setClickable(true);
            VoiceCardUserLevelView.this.f7500f.setClickable(true);
            this.f7514e.setVisibility(8);
            this.f7514e.setAlpha(1.0f);
            if (!this.f7512c) {
                VoiceCardUserLevelView.this.setShadowProgress(0);
            }
            VoiceCardUserLevelView.this.f7507m.n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VoiceCardUserLevelView.this.setShadowProgress(0);
            this.f7510a.setAlpha(0.0f);
            this.f7511b.setAlpha(0.0f);
            this.f7510a.setVisibility(0);
            VoiceCardUserLevelView.this.f7495a.setClickable(false);
            VoiceCardUserLevelView.this.f7500f.setClickable(false);
            if (this.f7512c) {
                p1k0 p1k0Var = VoiceCardUserLevelView.this.f7508n;
                AnimEffectPlayer animEffectPlayer = VoiceCardUserLevelView.this.f7507m;
                BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = this.f7513d;
                mm4.c(p1k0Var, animEffectPlayer, true, true, bLiveUserProfileConfigHierarchy.grade, bLiveUserProfileConfigHierarchy.superGrade);
            }
        }
    }

    public VoiceCardUserLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m8967E(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m8968F(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m8979C(this.f7500f, this.f7495a, this.f7496b, bLiveUserProfileConfigHierarchy, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    private void m8969L(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        mep0.d1(this.f7502h, xdl0.w(11.0f));
        long j = bLiveUserProfileConfigHierarchy.superGrade;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f7504j.setTypeface(null);
        long j2 = bLiveUserProfileConfigHierarchy.gap;
        if (j2 <= 999999 || w8u.o(x8u.m24745c(j2)) == -1) {
            this.f7504j.setTypeface(typeface);
            this.f7504j.setText(String.valueOf(bLiveUserProfileConfigHierarchy.gap));
        } else {
            SpannableString spannableString = new SpannableString(x8u.m24745c(bLiveUserProfileConfigHierarchy.gap));
            int color = getContext().getResources().getColor(h1c0.w1);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, ryo0.f20028o), 0, w8u.o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, ryo0.f20029p), w8u.o(spannableString.toString()), spannableString.length(), 18);
            this.f7504j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f7501g;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            hxs.s("context_livingAct", vDraweeView, str);
        }
        if (j > 0) {
            setShadowProgress(0);
        }
        mm4.f(this.f7508n, true, bLiveUserProfileConfigHierarchy.grade, this.f7503i);
        double d = bLiveUserProfileConfigHierarchy.wealthRatio;
        VText vText = this.f7505k;
        if (d == 1.0d) {
            xdl0.M(vText, false);
            xdl0.M(this.f7504j, false);
            xdl0.M(this.f7506l, true);
        } else {
            xdl0.M(vText, true);
            xdl0.M(this.f7504j, true);
            xdl0.M(this.f7506l, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    private void m8970M(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        hxs.t("context_livingAct", this.f7497c, bLiveUserProfileConfigHierarchy.iconUrl, t100.d(46.0f));
        hfw.a("VoiceCardUserLevelView", "hierarchy.iconUrl:" + bLiveUserProfileConfigHierarchy.iconUrl);
        this.f7498d.setTypeface(Typeface.DEFAULT_BOLD);
        long j = bLiveUserProfileConfigHierarchy.superGrade;
        p1k0 p1k0Var = this.f7508n;
        if (j > 0) {
            mm4.h(p1k0Var, true, this.f7498d);
            this.f7499e.setText(R.string.Ue);
            this.f7498d.setText(String.valueOf(j));
        } else {
            mm4.g(p1k0Var, true, bLiveUserProfileConfigHierarchy.grade, this.f7498d);
            this.f7499e.setText(R.string.Ve);
            this.f7498d.setText(String.valueOf(bLiveUserProfileConfigHierarchy.grade));
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f7496b;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            hxs.s("context_livingAct", vDraweeView, str);
        }
        m8982N(this.f7498d, this.f7499e);
        e51.H(getContext(), new Runnable() { // from class: l.vvm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21804a.m8980G(bLiveUserProfileConfigHierarchy);
            }
        }, 450L);
    }

    /* JADX INFO: renamed from: O */
    private void m8971O() {
        xdl0.M(this.f7495a, true);
        xdl0.M(this.f7500f, false);
    }

    public static GradientDrawable getDefaultCardBgDraw() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.d(16.0f));
        gradientDrawable.setColor(Color.parseColor("#242429"));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8973s(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        xdl0.D0((int) Math.min(this.f7495a.getWidth() - t100.d(12.0f), i * (this.f7495a.getWidth() - t100.d(12.0f)) * 0.01f), new View[]{this.f7503i});
    }

    /* JADX INFO: renamed from: B */
    public final void m8978B(View view) {
        wvm0.a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m8979C(View view, View view2, View view3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, boolean z) {
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
        duration.setInterpolator(new kxb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.svm0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20484a.m8967E(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7509o = animatorSet;
        animatorSet.addListener(new C0453a(view2, view3, z, bLiveUserProfileConfigHierarchy, view));
        this.f7509o.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f7509o.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f7509o.start();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m8980G(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy) {
        mm4.c(this.f7508n, this.f7507m, true, false, bLiveUserProfileConfigHierarchy.grade, bLiveUserProfileConfigHierarchy.superGrade);
    }

    /* JADX INFO: renamed from: K */
    public void m8981K(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, p1k0 p1k0Var, String str, String str2, final d30 d30Var) {
        if (mm4.b(p1k0Var)) {
            this.f7508n = p1k0Var;
        }
        m8971O();
        m8970M(bLiveUserProfileConfigHierarchy, str);
        m8969L(bLiveUserProfileConfigHierarchy, str2);
        xdl0.E0(this.f7495a, new View.OnClickListener() { // from class: l.tvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCardUserLevelView.m8973s(d30Var, view);
            }
        });
        xdl0.E0(this.f7500f, new View.OnClickListener() { // from class: l.uvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21352a.m8968F(bLiveUserProfileConfigHierarchy, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m8982N(VText vText, VText vText2) {
        if (!mm4.b(this.f7508n) || TextUtils.isEmpty(this.f7508n.j().textColor)) {
            vText2.setTextColor(Color.parseColor(kvc0.j(vText.getCurrentTextColor(), "80")));
        } else {
            vText2.setTextColor(kvc0.h(this.f7508n.j().textColor, kvc0.a(h1c0.w1)));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m8983P(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy) {
        m8979C(this.f7495a, this.f7500f, this.f7501g, bLiveUserProfileConfigHierarchy, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f7509o;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f7509o.end();
        }
        this.f7500f.setScaleX(1.0f);
        this.f7500f.setScaleY(1.0f);
        this.f7500f.setAlpha(1.0f);
        this.f7501g.setAlpha(1.0f);
        this.f7495a.setScaleX(1.0f);
        this.f7495a.setScaleY(1.0f);
        this.f7495a.setAlpha(1.0f);
        this.f7496b.setAlpha(1.0f);
        this.f7507m.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8978B(this);
    }

    public VoiceCardUserLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardUserLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
