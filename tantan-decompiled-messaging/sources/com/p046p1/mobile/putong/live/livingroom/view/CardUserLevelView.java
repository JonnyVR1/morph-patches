package com.p046p1.mobile.putong.live.livingroom.view;

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
import com.p046p1.mobile.putong.data.LiveUserLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.d30;
import p149l.dt0;
import p149l.e51;
import p149l.h1c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.kxb;
import p149l.mm4;
import p149l.n1k0;
import p149l.nm4;
import p149l.p1k0;
import p149l.t100;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;
import p149l.zb2;

/* JADX INFO: loaded from: classes5.dex */
public class CardUserLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f51906a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51907b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51908c;

    /* JADX INFO: renamed from: d */
    public VText f51909d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f51910e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f51911f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51912g;

    /* JADX INFO: renamed from: h */
    public VFrame f51913h;

    /* JADX INFO: renamed from: i */
    public View f51914i;

    /* JADX INFO: renamed from: j */
    public VText f51915j;

    /* JADX INFO: renamed from: k */
    public VText f51916k;

    /* JADX INFO: renamed from: l */
    public VText f51917l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f51918m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f51919n;

    /* JADX INFO: renamed from: o */
    public p1k0 f51920o;

    /* JADX INFO: renamed from: p */
    public String f51921p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardUserLevelView$a */
    public class C12921a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f51922a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f51923b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f51924c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ User f51925d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f51926e;

        public C12921a(View view, View view2, boolean z, User user, View view3) {
            this.f51922a = view;
            this.f51923b = view2;
            this.f51924c = z;
            this.f51925d = user;
            this.f51926e = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardUserLevelView.this.f51906a.setClickable(true);
            CardUserLevelView.this.f51911f.setClickable(true);
            this.f51926e.setVisibility(8);
            this.f51926e.setAlpha(1.0f);
            if (!this.f51924c) {
                CardUserLevelView.this.setShadowProgress(0);
            }
            CardUserLevelView.this.f51918m.m68504n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CardUserLevelView.this.setShadowProgress(0);
            this.f51922a.setAlpha(0.0f);
            this.f51923b.setAlpha(0.0f);
            this.f51922a.setVisibility(0);
            CardUserLevelView.this.f51906a.setClickable(false);
            CardUserLevelView.this.f51911f.setClickable(false);
            if (this.f51924c) {
                p1k0 p1k0Var = CardUserLevelView.this.f51920o;
                AnimEffectPlayer animEffectPlayer = CardUserLevelView.this.f51918m;
                LiveUserLevel liveUserLevel = this.f51925d.hierarchy;
                mm4.m155299c(p1k0Var, animEffectPlayer, false, true, liveUserLevel.grade, liveUserLevel.superGrade);
            }
        }
    }

    public CardUserLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m76432E(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m76433F(User user, View view) {
        m76444C(this.f51911f, this.f51906a, this.f51907b, user, false);
    }

    /* JADX INFO: renamed from: M */
    public static void m76434M(VText vText, VText vText2) {
        vText2.setTextColor(Color.parseColor(kvc0.m147361j(vText.getCurrentTextColor(), "80")));
    }

    /* JADX INFO: renamed from: O */
    public static void m76435O(int i, View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(11.0f));
        gradientDrawable.setColor(kvc0.m147352a(i));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: R */
    private void m76436R() {
        xdl0.m208344M(this.f51906a, true);
        xdl0.m208344M(this.f51911f, false);
    }

    public static GradientDrawable getDefaultCardBgDraw() {
        return zb2.m217814b("#242429", t100.m186890d(0.0f));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m76438s(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        xdl0.m208327D0((int) Math.min(this.f51906a.getWidth() - t100.m186890d(12.0f), i * (this.f51906a.getWidth() - t100.m186890d(12.0f)) * 0.01f), this.f51914i);
    }

    /* JADX INFO: renamed from: B */
    public final void m76443B(View view) {
        nm4.m160085a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m76444C(View view, View view2, View view3, User user, boolean z) {
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
        ValueAnimator duration = ValueAnimator.ofInt(0, (int) (user.hierarchy.wealthRatio * 100.0d)).setDuration(220L);
        duration.setInterpolator(new kxb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.im4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f113895a.m76432E(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f51919n = animatorSet;
        animatorSet.addListener(new C12921a(view2, view3, z, user, view));
        this.f51919n.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f51919n.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f51919n.start();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m76445G(LiveUserLevel liveUserLevel) {
        xdl0.m208344M(this.f51918m, true);
        mm4.m155299c(this.f51920o, this.f51918m, false, false, liveUserLevel.grade, liveUserLevel.superGrade);
    }

    /* JADX INFO: renamed from: K */
    public void m76446K() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f51921p);
        VDraweeView vDraweeView = this.f51912g;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            xdl0.m208344M(vDraweeView, true);
            hxs.m133406s("context_livingAct", this.f51912g, this.f51921p);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m76447L(final User user, p1k0 p1k0Var, String str, String str2, final d30 d30Var) {
        if (mm4.m155297a(p1k0Var)) {
            this.f51920o = p1k0Var;
        }
        this.f51921p = str2;
        m76436R();
        m76449P(user.hierarchy, str);
        m76448N(user.hierarchy, str2);
        xdl0.m208329E0(this.f51906a, new View.OnClickListener() { // from class: l.jm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardUserLevelView.m76438s(d30Var, view);
            }
        });
        xdl0.m208329E0(this.f51911f, new View.OnClickListener() { // from class: l.km4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123734a.m76433F(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m76448N(LiveUserLevel liveUserLevel, String str) {
        long j = liveUserLevel.superGrade;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f51915j.setTypeface(null);
        long j2 = liveUserLevel.gap;
        if (j2 <= 999999 || w8u.m202212o(x8u.m207433c(j2)) == -1) {
            this.f51915j.setTypeface(typeface);
            this.f51915j.setText(String.valueOf(liveUserLevel.gap));
        } else {
            SpannableString spannableString = new SpannableString(x8u.m207433c(liveUserLevel.gap));
            int color = getContext().getResources().getColor(h1c0.f105416w1);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, n1k0.f136654p), 0, w8u.m202212o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, n1k0.f136655q), w8u.m202212o(spannableString.toString()), spannableString.length(), 18);
            this.f51915j.setText(spannableString);
        }
        if (j > 0) {
            setShadowProgress(0);
        }
        mm4.m155302f(this.f51920o, false, liveUserLevel.grade, this.f51914i);
        double d = liveUserLevel.wealthRatio;
        VText vText = this.f51916k;
        if (d == 1.0d) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f51915j, false);
            xdl0.m208344M(this.f51917l, true);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f51915j, true);
            xdl0.m208344M(this.f51917l, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m76449P(final LiveUserLevel liveUserLevel, String str) {
        hxs.m133407t("context_livingAct", this.f51908c, liveUserLevel.iconUrl, t100.m186890d(46.0f));
        this.f51909d.setTypeface(Typeface.DEFAULT_BOLD);
        long j = liveUserLevel.superGrade;
        if (j > 0) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            VDraweeView vDraweeView = this.f51907b;
            if (zIsEmpty) {
                vDraweeView.setBackground(getDefaultCardBgDraw());
            } else {
                hxs.m133406s("context_livingAct", vDraweeView, str);
            }
        } else {
            boolean zIsEmpty2 = TextUtils.isEmpty(str);
            VDraweeView vDraweeView2 = this.f51907b;
            if (zIsEmpty2) {
                vDraweeView2.setBackground(getDefaultCardBgDraw());
            } else {
                hxs.m133406s("context_livingAct", vDraweeView2, str);
            }
        }
        p1k0 p1k0Var = this.f51920o;
        if (j > 0) {
            mm4.m155304h(p1k0Var, false, this.f51909d);
            this.f51910e.setText(R$string.f47002Ue);
            this.f51909d.setText(String.valueOf(j));
        } else {
            mm4.m155303g(p1k0Var, false, liveUserLevel.grade, this.f51909d);
            this.f51910e.setText(R$string.f47023Ve);
            this.f51909d.setText(String.valueOf(liveUserLevel.grade));
        }
        m76450Q(this.f51909d, this.f51910e);
        xdl0.m208344M(this.f51918m, false);
        e51.m114743H(getContext(), new Runnable() { // from class: l.lm4
            @Override // java.lang.Runnable
            public final void run() {
                this.f128769a.m76445G(liveUserLevel);
            }
        }, 450L);
    }

    /* JADX INFO: renamed from: Q */
    public void m76450Q(VText vText, VText vText2) {
        if (!mm4.m155297a(this.f51920o) || TextUtils.isEmpty(this.f51920o.m167090j().textColor)) {
            vText2.setTextColor(Color.parseColor(kvc0.m147361j(vText.getCurrentTextColor(), "80")));
        } else {
            vText2.setTextColor(kvc0.m147359h(this.f51920o.m167090j().textColor, kvc0.m147352a(h1c0.f105416w1)));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m76451S(User user) {
        m76446K();
        m76444C(this.f51906a, this.f51911f, this.f51912g, user, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dt0.m113503C(this.f51919n);
        this.f51911f.setScaleX(1.0f);
        this.f51911f.setScaleY(1.0f);
        this.f51911f.setAlpha(1.0f);
        this.f51912g.setAlpha(1.0f);
        this.f51906a.setScaleX(1.0f);
        this.f51906a.setScaleY(1.0f);
        this.f51906a.setAlpha(1.0f);
        this.f51907b.setAlpha(1.0f);
        this.f51918m.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76443B(this);
    }

    public CardUserLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardUserLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
