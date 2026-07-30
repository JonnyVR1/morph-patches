package com.p051p1.mobile.putong.live.livingroom.view;

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
import com.p051p1.mobile.putong.data.LiveFansClubLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.i9n;
import p153l.izs;
import p153l.l51;
import p153l.ok4;
import p153l.qa00;
import p153l.qnp0;
import p153l.tak0;
import p153l.x20;
import p153l.xau;
import p153l.yau;
import p153l.yyb;

/* JADX INFO: loaded from: classes5.dex */
public class CardFansClubLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f52731a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52732b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52733c;

    /* JADX INFO: renamed from: d */
    public VText f52734d;

    /* JADX INFO: renamed from: e */
    public VText f52735e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f52736f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f52737g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f52738h;

    /* JADX INFO: renamed from: i */
    public VFrame f52739i;

    /* JADX INFO: renamed from: j */
    public View f52740j;

    /* JADX INFO: renamed from: k */
    public VText f52741k;

    /* JADX INFO: renamed from: l */
    public VText f52742l;

    /* JADX INFO: renamed from: m */
    public VText f52743m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f52744n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f52745o;

    /* JADX INFO: renamed from: p */
    public String f52746p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardFansClubLevelView$a */
    public class RunnableC13082a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f52747a;

        public RunnableC13082a(String str) {
            this.f52747a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardFansClubLevelView.this.m77609K(this.f52747a, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardFansClubLevelView$b */
    public class C13083b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f52749a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f52750b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f52751c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f52752d;

        public C13083b(View view, View view2, boolean z, View view3) {
            this.f52749a = view;
            this.f52750b = view2;
            this.f52751c = z;
            this.f52752d = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardFansClubLevelView.this.f52731a.setClickable(true);
            CardFansClubLevelView.this.f52737g.setClickable(true);
            this.f52752d.setVisibility(8);
            this.f52752d.setAlpha(1.0f);
            if (!this.f52751c) {
                CardFansClubLevelView.this.setShadowProgress(0);
            }
            CardFansClubLevelView.this.f52744n.m69687n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f52749a.setAlpha(0.0f);
            this.f52750b.setAlpha(0.0f);
            this.f52749a.setVisibility(0);
            CardFansClubLevelView.this.f52731a.setClickable(false);
            CardFansClubLevelView.this.f52737g.setClickable(false);
            CardFansClubLevelView.this.setShadowProgress(0);
            if (this.f52751c) {
                CardFansClubLevelView cardFansClubLevelView = CardFansClubLevelView.this;
                cardFansClubLevelView.m77609K(cardFansClubLevelView.f52746p, true);
            }
        }
    }

    public CardFansClubLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m77597G(User user, View view) {
        m77606C(this.f52737g, this.f52731a, this.f52732b, user, false);
    }

    /* JADX INFO: renamed from: P */
    private void m77598P() {
        bnl0.m105524M(this.f52731a, true);
        bnl0.m105524M(this.f52737g, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        bnl0.m105507D0((int) Math.min(this.f52731a.getWidth() - qa00.m175859d(12.0f), i * (this.f52731a.getWidth() - qa00.m175859d(12.0f)) * 0.01f), this.f52740j);
    }

    /* JADX INFO: renamed from: B */
    public final void m77605B(View view) {
        ok4.m167977a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m77606C(View view, View view2, View view3, User user, boolean z) {
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
        duration.setInterpolator(new yyb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nk4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f142430a.m77607E(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52745o = animatorSet;
        animatorSet.addListener(new C13083b(view2, view3, z, view));
        this.f52745o.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f52745o.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f52745o.start();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m77607E(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m77608F(boolean z, x20 x20Var, boolean z2, User user, View view) {
        if (z) {
            x20Var.call();
        } else {
            if (z2) {
                return;
            }
            m77606C(this.f52731a, this.f52737g, this.f52738h, user, true);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m77609K(String str, boolean z) {
        String str2;
        if (i9n.m139127b() || TextUtils.isEmpty(str)) {
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
        this.f52744n.mo69685l(str2, z ? 1 : 2, null);
    }

    /* JADX INFO: renamed from: L */
    public void m77610L(final User user, String str, String str2, final boolean z, final boolean z2, String str3, final x20 x20Var) {
        m77598P();
        m77613O(user, str, z, str3);
        m77611M(user, str2, str3);
        bnl0.m105509E0(this.f52731a, new View.OnClickListener() { // from class: l.lk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132433a.m77608F(z2, x20Var, z, user, view);
            }
        });
        bnl0.m105509E0(this.f52737g, new View.OnClickListener() { // from class: l.mk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137221a.m77597G(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m77611M(User user, String str, String str2) {
        qnp0.m177261d1(this.f52739i, bnl0.m105587w(11.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        LiveFansClubLevel liveFansClubLevel = user.fanbaseHierarchy;
        this.f52741k.setTypeface(null);
        long j = liveFansClubLevel.gap;
        if (j <= 999999 || xau.m209905o(yau.m214935c(j)) == -1) {
            this.f52741k.setTypeface(typeface);
            this.f52741k.setText(String.valueOf(liveFansClubLevel.gap));
        } else {
            SpannableString spannableString = new SpannableString(yau.m214935c(liveFansClubLevel.gap));
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, tak0.f172738p), 0, xau.m209905o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, tak0.f172739q), xau.m209905o(spannableString.toString()), spannableString.length(), 18);
            this.f52741k.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f52738h;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        setShadowProgress(0);
        m77612N(str2, this.f52740j);
        double d = liveFansClubLevel.wealthRatio;
        VText vText = this.f52742l;
        if (d == 1.0d) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f52741k, false);
            bnl0.m105524M(this.f52743m, true);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f52741k, true);
            bnl0.m105524M(this.f52743m, false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m77612N(String str, View view) {
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
        gradientDrawable.setCornerRadius(qa00.m175859d(16.0f));
        gradientDrawable.setColor(Color.parseColor(str2));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: O */
    public final void m77613O(User user, String str, boolean z, String str2) {
        this.f52746p = str2;
        LiveFansClubLevel liveFansClubLevel = user.fanbaseHierarchy;
        izs.m142869t("context_livingAct", this.f52733c, liveFansClubLevel.iconUrl, qa00.m175859d(46.0f));
        m77614Q(liveFansClubLevel, z, this.f52734d, this.f52735e);
        this.f52734d.setTypeface(Typeface.DEFAULT_BOLD);
        if (!TextUtils.isEmpty(liveFansClubLevel.textColor)) {
            this.f52734d.setTextColor(Color.parseColor(liveFansClubLevel.textColor));
            this.f52735e.setTextColor(Color.parseColor(liveFansClubLevel.textColor));
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f52732b;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        this.f52736f.setText(liveFansClubLevel.title);
        CardUserLevelView.m77617M(this.f52734d, this.f52736f);
        l51.m152888H(getContext(), new RunnableC13082a(str2), 450L);
    }

    /* JADX INFO: renamed from: Q */
    public final void m77614Q(LiveFansClubLevel liveFansClubLevel, boolean z, VText vText, VText vText2) {
        boolean z2 = z && liveFansClubLevel.memberCount >= 10000;
        bnl0.m105524M(vText2, z);
        vText2.setText(z2 ? xau.m209910t(R$string.f47682Me) : xau.m209910t(R$string.f47703Ne));
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
        AnimatorSet animatorSet = this.f52745o;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f52745o.end();
        }
        this.f52737g.setScaleX(1.0f);
        this.f52737g.setScaleY(1.0f);
        this.f52737g.setAlpha(1.0f);
        this.f52738h.setAlpha(1.0f);
        this.f52731a.setScaleX(1.0f);
        this.f52731a.setScaleY(1.0f);
        this.f52731a.setAlpha(1.0f);
        this.f52732b.setAlpha(1.0f);
        this.f52744n.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77605B(this);
        qnp0.m177261d1(this.f52744n, qa00.m175859d(16.0f));
    }

    public CardFansClubLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardFansClubLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
