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
import com.p046p1.mobile.putong.data.LiveFansClubLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.d30;
import p149l.e51;
import p149l.hxs;
import p149l.i7n;
import p149l.kxb;
import p149l.mep0;
import p149l.n1k0;
import p149l.pj4;
import p149l.t100;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class CardFansClubLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f51883a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51884b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51885c;

    /* JADX INFO: renamed from: d */
    public VText f51886d;

    /* JADX INFO: renamed from: e */
    public VText f51887e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f51888f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f51889g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f51890h;

    /* JADX INFO: renamed from: i */
    public VFrame f51891i;

    /* JADX INFO: renamed from: j */
    public View f51892j;

    /* JADX INFO: renamed from: k */
    public VText f51893k;

    /* JADX INFO: renamed from: l */
    public VText f51894l;

    /* JADX INFO: renamed from: m */
    public VText f51895m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f51896n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f51897o;

    /* JADX INFO: renamed from: p */
    public String f51898p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardFansClubLevelView$a */
    public class RunnableC12919a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f51899a;

        public RunnableC12919a(String str) {
            this.f51899a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardFansClubLevelView.this.m76426K(this.f51899a, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardFansClubLevelView$b */
    public class C12920b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f51901a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f51902b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f51903c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f51904d;

        public C12920b(View view, View view2, boolean z, View view3) {
            this.f51901a = view;
            this.f51902b = view2;
            this.f51903c = z;
            this.f51904d = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardFansClubLevelView.this.f51883a.setClickable(true);
            CardFansClubLevelView.this.f51889g.setClickable(true);
            this.f51904d.setVisibility(8);
            this.f51904d.setAlpha(1.0f);
            if (!this.f51903c) {
                CardFansClubLevelView.this.setShadowProgress(0);
            }
            CardFansClubLevelView.this.f51896n.m68504n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f51901a.setAlpha(0.0f);
            this.f51902b.setAlpha(0.0f);
            this.f51901a.setVisibility(0);
            CardFansClubLevelView.this.f51883a.setClickable(false);
            CardFansClubLevelView.this.f51889g.setClickable(false);
            CardFansClubLevelView.this.setShadowProgress(0);
            if (this.f51903c) {
                CardFansClubLevelView cardFansClubLevelView = CardFansClubLevelView.this;
                cardFansClubLevelView.m76426K(cardFansClubLevelView.f51898p, true);
            }
        }
    }

    public CardFansClubLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m76414G(User user, View view) {
        m76423C(this.f51889g, this.f51883a, this.f51884b, user, false);
    }

    /* JADX INFO: renamed from: P */
    private void m76415P() {
        xdl0.m208344M(this.f51883a, true);
        xdl0.m208344M(this.f51889g, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        xdl0.m208327D0((int) Math.min(this.f51883a.getWidth() - t100.m186890d(12.0f), i * (this.f51883a.getWidth() - t100.m186890d(12.0f)) * 0.01f), this.f51892j);
    }

    /* JADX INFO: renamed from: B */
    public final void m76422B(View view) {
        pj4.m169784a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m76423C(View view, View view2, View view3, User user, boolean z) {
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
        ValueAnimator duration = ValueAnimator.ofInt(0, (int) (user.fanbaseHierarchy.wealthRatio * 100.0d)).setDuration(220L);
        duration.setInterpolator(new kxb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oj4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f144247a.m76424E(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f51897o = animatorSet;
        animatorSet.addListener(new C12920b(view2, view3, z, view));
        this.f51897o.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f51897o.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f51897o.start();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m76424E(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m76425F(boolean z, d30 d30Var, boolean z2, User user, View view) {
        if (z) {
            d30Var.call();
        } else {
            if (z2) {
                return;
            }
            m76423C(this.f51883a, this.f51889g, this.f51890h, user, true);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m76426K(String str, boolean z) {
        String str2;
        if (i7n.m134916b() || TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("pink")) {
            str2 = z ? "https://auto.tancdn.com/v1/raw/85069e36-7e42-44ca-a1ed-1d0c154ccfdb10.pdf" : "https://auto.tancdn.com/v1/raw/06c77811-480d-45d2-a0fa-4f93d71b6ab610.pdf";
        } else if (str.equals("green")) {
            str2 = z ? "https://auto.tancdn.com/v1/raw/8fcfec5b-586e-4d47-907b-4f154ef82d2711.pdf" : "https://auto.tancdn.com/v1/raw/7230e9c7-c2d9-4271-8382-a65a804a3aab10.pdf";
        } else {
            str2 = z ? "https://auto.tancdn.com/v1/raw/da1c92bb-10bd-4be5-8a7c-484a3114fc3f10.pdf" : "https://auto.tancdn.com/v1/raw/325aa354-d86c-4da9-94d7-ab96d03ed2d810.pdf";
        }
        this.f51896n.mo68502l(str2, z ? 1 : 2, null);
    }

    /* JADX INFO: renamed from: L */
    public void m76427L(final User user, String str, String str2, final boolean z, final boolean z2, String str3, final d30 d30Var) {
        m76415P();
        m76430O(user, str, z, str3);
        m76428M(user, str2, str3);
        xdl0.m208329E0(this.f51883a, new View.OnClickListener() { // from class: l.mj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134096a.m76425F(z2, d30Var, z, user, view);
            }
        });
        xdl0.m208329E0(this.f51889g, new View.OnClickListener() { // from class: l.nj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139210a.m76414G(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m76428M(User user, String str, String str2) {
        mep0.m154302d1(this.f51891i, xdl0.m208407w(11.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        LiveFansClubLevel liveFansClubLevel = user.fanbaseHierarchy;
        this.f51893k.setTypeface(null);
        long j = liveFansClubLevel.gap;
        if (j <= 999999 || w8u.m202212o(x8u.m207433c(j)) == -1) {
            this.f51893k.setTypeface(typeface);
            this.f51893k.setText(String.valueOf(liveFansClubLevel.gap));
        } else {
            SpannableString spannableString = new SpannableString(x8u.m207433c(liveFansClubLevel.gap));
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, n1k0.f136654p), 0, w8u.m202212o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, n1k0.f136655q), w8u.m202212o(spannableString.toString()), spannableString.length(), 18);
            this.f51893k.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f51890h;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        setShadowProgress(0);
        m76429N(str2, this.f51892j);
        double d = liveFansClubLevel.wealthRatio;
        VText vText = this.f51894l;
        if (d == 1.0d) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f51893k, false);
            xdl0.m208344M(this.f51895m, true);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f51893k, true);
            xdl0.m208344M(this.f51895m, false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m76429N(String str, View view) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("pink")) {
            str2 = "#F83899";
        } else {
            str2 = !str.equals("green") ? "#FF9A0E" : "#07C26D";
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(16.0f));
        gradientDrawable.setColor(Color.parseColor(str2));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: O */
    public final void m76430O(User user, String str, boolean z, String str2) {
        this.f51898p = str2;
        LiveFansClubLevel liveFansClubLevel = user.fanbaseHierarchy;
        hxs.m133407t("context_livingAct", this.f51885c, liveFansClubLevel.iconUrl, t100.m186890d(46.0f));
        m76431Q(liveFansClubLevel, z, this.f51886d, this.f51887e);
        this.f51886d.setTypeface(Typeface.DEFAULT_BOLD);
        if (!TextUtils.isEmpty(liveFansClubLevel.textColor)) {
            this.f51886d.setTextColor(Color.parseColor(liveFansClubLevel.textColor));
            this.f51887e.setTextColor(Color.parseColor(liveFansClubLevel.textColor));
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f51884b;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        this.f51888f.setText(liveFansClubLevel.title);
        CardUserLevelView.m76434M(this.f51886d, this.f51888f);
        e51.m114743H(getContext(), new RunnableC12919a(str2), 450L);
    }

    /* JADX INFO: renamed from: Q */
    public final void m76431Q(LiveFansClubLevel liveFansClubLevel, boolean z, VText vText, VText vText2) {
        boolean z2 = z && liveFansClubLevel.memberCount >= 10000;
        xdl0.m208344M(vText2, z);
        vText2.setText(z2 ? w8u.m202217t(R$string.f46834Me) : w8u.m202217t(R$string.f46855Ne));
        if (!z) {
            vText.setText(String.valueOf(liveFansClubLevel.grade));
        } else {
            long j = liveFansClubLevel.memberCount;
            vText.setText(j >= 10000 ? String.valueOf(j / 10000) : String.valueOf(j));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f51897o;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f51897o.end();
        }
        this.f51889g.setScaleX(1.0f);
        this.f51889g.setScaleY(1.0f);
        this.f51889g.setAlpha(1.0f);
        this.f51890h.setAlpha(1.0f);
        this.f51883a.setScaleX(1.0f);
        this.f51883a.setScaleY(1.0f);
        this.f51883a.setAlpha(1.0f);
        this.f51884b.setAlpha(1.0f);
        this.f51896n.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76422B(this);
        mep0.m154302d1(this.f51896n, t100.m186890d(16.0f));
    }

    public CardFansClubLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardFansClubLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
