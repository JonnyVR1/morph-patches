package com.p046p1.mobile.putong.live.livingroom.voice.usercard.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.d30;
import p149l.e51;
import p149l.h1c0;
import p149l.hfw;
import p149l.hxs;
import p149l.kvc0;
import p149l.kxb;
import p149l.mep0;
import p149l.mm4;
import p149l.p1k0;
import p149l.ryo0;
import p149l.t100;
import p149l.w8u;
import p149l.wvm0;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCardUserLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f53889a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53890b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53891c;

    /* JADX INFO: renamed from: d */
    public VText f53892d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f53893e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f53894f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53895g;

    /* JADX INFO: renamed from: h */
    public VFrame f53896h;

    /* JADX INFO: renamed from: i */
    public View f53897i;

    /* JADX INFO: renamed from: j */
    public VText f53898j;

    /* JADX INFO: renamed from: k */
    public VText f53899k;

    /* JADX INFO: renamed from: l */
    public VText f53900l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f53901m;

    /* JADX INFO: renamed from: n */
    public p1k0 f53902n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f53903o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView$a */
    public class C13051a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f53904a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f53905b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f53906c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BLiveUserProfileConfigHierarchy f53907d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f53908e;

        public C13051a(View view, View view2, boolean z, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view3) {
            this.f53904a = view;
            this.f53905b = view2;
            this.f53906c = z;
            this.f53907d = bLiveUserProfileConfigHierarchy;
            this.f53908e = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceCardUserLevelView.this.f53889a.setClickable(true);
            VoiceCardUserLevelView.this.f53894f.setClickable(true);
            this.f53908e.setVisibility(8);
            this.f53908e.setAlpha(1.0f);
            if (!this.f53906c) {
                VoiceCardUserLevelView.this.setShadowProgress(0);
            }
            VoiceCardUserLevelView.this.f53901m.m68504n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VoiceCardUserLevelView.this.setShadowProgress(0);
            this.f53904a.setAlpha(0.0f);
            this.f53905b.setAlpha(0.0f);
            this.f53904a.setVisibility(0);
            VoiceCardUserLevelView.this.f53889a.setClickable(false);
            VoiceCardUserLevelView.this.f53894f.setClickable(false);
            if (this.f53906c) {
                p1k0 p1k0Var = VoiceCardUserLevelView.this.f53902n;
                AnimEffectPlayer animEffectPlayer = VoiceCardUserLevelView.this.f53901m;
                BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = this.f53907d;
                mm4.m155299c(p1k0Var, animEffectPlayer, true, true, bLiveUserProfileConfigHierarchy.grade, bLiveUserProfileConfigHierarchy.superGrade);
            }
        }
    }

    public VoiceCardUserLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m78751E(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m78752F(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m78763C(this.f53894f, this.f53889a, this.f53890b, bLiveUserProfileConfigHierarchy, false);
    }

    /* JADX INFO: renamed from: L */
    private void m78753L(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        mep0.m154302d1(this.f53896h, xdl0.m208407w(11.0f));
        long j = bLiveUserProfileConfigHierarchy.superGrade;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f53898j.setTypeface(null);
        long j2 = bLiveUserProfileConfigHierarchy.gap;
        if (j2 <= 999999 || w8u.m202212o(x8u.m207433c(j2)) == -1) {
            this.f53898j.setTypeface(typeface);
            this.f53898j.setText(String.valueOf(bLiveUserProfileConfigHierarchy.gap));
        } else {
            SpannableString spannableString = new SpannableString(x8u.m207433c(bLiveUserProfileConfigHierarchy.gap));
            int color = getContext().getResources().getColor(h1c0.f105416w1);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, ryo0.f161569o), 0, w8u.m202212o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, ryo0.f161570p), w8u.m202212o(spannableString.toString()), spannableString.length(), 18);
            this.f53898j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f53895g;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        if (j > 0) {
            setShadowProgress(0);
        }
        mm4.m155302f(this.f53902n, true, bLiveUserProfileConfigHierarchy.grade, this.f53897i);
        double d = bLiveUserProfileConfigHierarchy.wealthRatio;
        VText vText = this.f53899k;
        if (d == 1.0d) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f53898j, false);
            xdl0.m208344M(this.f53900l, true);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f53898j, true);
            xdl0.m208344M(this.f53900l, false);
        }
    }

    /* JADX INFO: renamed from: M */
    private void m78754M(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        hxs.m133407t("context_livingAct", this.f53891c, bLiveUserProfileConfigHierarchy.iconUrl, t100.m186890d(46.0f));
        hfw.m130790a("VoiceCardUserLevelView", "hierarchy.iconUrl:" + bLiveUserProfileConfigHierarchy.iconUrl);
        this.f53892d.setTypeface(Typeface.DEFAULT_BOLD);
        long j = bLiveUserProfileConfigHierarchy.superGrade;
        p1k0 p1k0Var = this.f53902n;
        if (j > 0) {
            mm4.m155304h(p1k0Var, true, this.f53892d);
            this.f53893e.setText(R$string.f47002Ue);
            this.f53892d.setText(String.valueOf(j));
        } else {
            mm4.m155303g(p1k0Var, true, bLiveUserProfileConfigHierarchy.grade, this.f53892d);
            this.f53893e.setText(R$string.f47023Ve);
            this.f53892d.setText(String.valueOf(bLiveUserProfileConfigHierarchy.grade));
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f53890b;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        m78766N(this.f53892d, this.f53893e);
        e51.m114743H(getContext(), new Runnable() { // from class: l.vvm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f183242a.m78764G(bLiveUserProfileConfigHierarchy);
            }
        }, 450L);
    }

    /* JADX INFO: renamed from: O */
    private void m78755O() {
        xdl0.m208344M(this.f53889a, true);
        xdl0.m208344M(this.f53894f, false);
    }

    public static GradientDrawable getDefaultCardBgDraw() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(16.0f));
        gradientDrawable.setColor(Color.parseColor("#242429"));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m78757s(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        xdl0.m208327D0((int) Math.min(this.f53889a.getWidth() - t100.m186890d(12.0f), i * (this.f53889a.getWidth() - t100.m186890d(12.0f)) * 0.01f), this.f53897i);
    }

    /* JADX INFO: renamed from: B */
    public final void m78762B(View view) {
        wvm0.m205754a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m78763C(View view, View view2, View view3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, boolean z) {
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
                this.f166582a.m78751E(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f53903o = animatorSet;
        animatorSet.addListener(new C13051a(view2, view3, z, bLiveUserProfileConfigHierarchy, view));
        this.f53903o.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f53903o.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f53903o.start();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m78764G(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy) {
        mm4.m155299c(this.f53902n, this.f53901m, true, false, bLiveUserProfileConfigHierarchy.grade, bLiveUserProfileConfigHierarchy.superGrade);
    }

    /* JADX INFO: renamed from: K */
    public void m78765K(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, p1k0 p1k0Var, String str, String str2, final d30 d30Var) {
        if (mm4.m155298b(p1k0Var)) {
            this.f53902n = p1k0Var;
        }
        m78755O();
        m78754M(bLiveUserProfileConfigHierarchy, str);
        m78753L(bLiveUserProfileConfigHierarchy, str2);
        xdl0.m208329E0(this.f53889a, new View.OnClickListener() { // from class: l.tvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCardUserLevelView.m78757s(d30Var, view);
            }
        });
        xdl0.m208329E0(this.f53894f, new View.OnClickListener() { // from class: l.uvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178546a.m78752F(bLiveUserProfileConfigHierarchy, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m78766N(VText vText, VText vText2) {
        if (!mm4.m155298b(this.f53902n) || TextUtils.isEmpty(this.f53902n.m167090j().textColor)) {
            vText2.setTextColor(Color.parseColor(kvc0.m147361j(vText.getCurrentTextColor(), "80")));
        } else {
            vText2.setTextColor(kvc0.m147359h(this.f53902n.m167090j().textColor, kvc0.m147352a(h1c0.f105416w1)));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m78767P(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy) {
        m78763C(this.f53889a, this.f53894f, this.f53895g, bLiveUserProfileConfigHierarchy, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f53903o;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f53903o.end();
        }
        this.f53894f.setScaleX(1.0f);
        this.f53894f.setScaleY(1.0f);
        this.f53894f.setAlpha(1.0f);
        this.f53895g.setAlpha(1.0f);
        this.f53889a.setScaleX(1.0f);
        this.f53889a.setScaleY(1.0f);
        this.f53889a.setAlpha(1.0f);
        this.f53890b.setAlpha(1.0f);
        this.f53901m.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78762B(this);
    }

    public VoiceCardUserLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardUserLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
