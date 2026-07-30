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
import com.p051p1.mobile.putong.data.LiveUserLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.gc2;
import p153l.it0;
import p153l.izs;
import p153l.l51;
import p153l.ln4;
import p153l.mn4;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;
import p153l.tak0;
import p153l.vak0;
import p153l.x20;
import p153l.xau;
import p153l.yau;
import p153l.yyb;

/* JADX INFO: loaded from: classes5.dex */
public class CardUserLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f52754a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52755b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52756c;

    /* JADX INFO: renamed from: d */
    public VText f52757d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f52758e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f52759f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52760g;

    /* JADX INFO: renamed from: h */
    public VFrame f52761h;

    /* JADX INFO: renamed from: i */
    public View f52762i;

    /* JADX INFO: renamed from: j */
    public VText f52763j;

    /* JADX INFO: renamed from: k */
    public VText f52764k;

    /* JADX INFO: renamed from: l */
    public VText f52765l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f52766m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f52767n;

    /* JADX INFO: renamed from: o */
    public vak0 f52768o;

    /* JADX INFO: renamed from: p */
    public String f52769p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardUserLevelView$a */
    public class C13084a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f52770a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f52771b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f52772c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ User f52773d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f52774e;

        public C13084a(View view, View view2, boolean z, User user, View view3) {
            this.f52770a = view;
            this.f52771b = view2;
            this.f52772c = z;
            this.f52773d = user;
            this.f52774e = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardUserLevelView.this.f52754a.setClickable(true);
            CardUserLevelView.this.f52759f.setClickable(true);
            this.f52774e.setVisibility(8);
            this.f52774e.setAlpha(1.0f);
            if (!this.f52772c) {
                CardUserLevelView.this.setShadowProgress(0);
            }
            CardUserLevelView.this.f52766m.m69687n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            CardUserLevelView.this.setShadowProgress(0);
            this.f52770a.setAlpha(0.0f);
            this.f52771b.setAlpha(0.0f);
            this.f52770a.setVisibility(0);
            CardUserLevelView.this.f52754a.setClickable(false);
            CardUserLevelView.this.f52759f.setClickable(false);
            if (this.f52772c) {
                vak0 vak0Var = CardUserLevelView.this.f52768o;
                AnimEffectPlayer animEffectPlayer = CardUserLevelView.this.f52766m;
                LiveUserLevel liveUserLevel = this.f52773d.hierarchy;
                ln4.m154946c(vak0Var, animEffectPlayer, false, true, liveUserLevel.grade, liveUserLevel.superGrade);
            }
        }
    }

    public CardUserLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m77615E(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m77616F(User user, View view) {
        m77627C(this.f52759f, this.f52754a, this.f52755b, user, false);
    }

    /* JADX INFO: renamed from: M */
    public static void m77617M(VText vText, VText vText2) {
        vText2.setTextColor(Color.parseColor(n3d0.m161286j(vText.getCurrentTextColor(), "80")));
    }

    /* JADX INFO: renamed from: O */
    public static void m77618O(int i, View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(11.0f));
        gradientDrawable.setColor(n3d0.m161277a(i));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: R */
    private void m77619R() {
        bnl0.m105524M(this.f52754a, true);
        bnl0.m105524M(this.f52759f, false);
    }

    public static GradientDrawable getDefaultCardBgDraw() {
        return gc2.m129823b("#242429", qa00.m175859d(0.0f));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m77621s(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        bnl0.m105507D0((int) Math.min(this.f52754a.getWidth() - qa00.m175859d(12.0f), i * (this.f52754a.getWidth() - qa00.m175859d(12.0f)) * 0.01f), this.f52762i);
    }

    /* JADX INFO: renamed from: B */
    public final void m77626B(View view) {
        mn4.m159112a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m77627C(View view, View view2, View view3, User user, boolean z) {
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
        duration.setInterpolator(new yyb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hn4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f110699a.m77615E(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52767n = animatorSet;
        animatorSet.addListener(new C13084a(view2, view3, z, user, view));
        this.f52767n.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f52767n.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f52767n.start();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m77628G(LiveUserLevel liveUserLevel) {
        bnl0.m105524M(this.f52766m, true);
        ln4.m154946c(this.f52768o, this.f52766m, false, false, liveUserLevel.grade, liveUserLevel.superGrade);
    }

    /* JADX INFO: renamed from: K */
    public void m77629K() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f52769p);
        VDraweeView vDraweeView = this.f52760g;
        if (zIsEmpty) {
            vDraweeView.setBackground(getDefaultCardBgDraw());
        } else {
            bnl0.m105524M(vDraweeView, true);
            izs.m142868s("context_livingAct", this.f52760g, this.f52769p);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m77630L(final User user, vak0 vak0Var, String str, String str2, final x20 x20Var) {
        if (ln4.m154944a(vak0Var)) {
            this.f52768o = vak0Var;
        }
        this.f52769p = str2;
        m77619R();
        m77632P(user.hierarchy, str);
        m77631N(user.hierarchy, str2);
        bnl0.m105509E0(this.f52754a, new View.OnClickListener() { // from class: l.in4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardUserLevelView.m77621s(x20Var, view);
            }
        });
        bnl0.m105509E0(this.f52759f, new View.OnClickListener() { // from class: l.jn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121743a.m77616F(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m77631N(LiveUserLevel liveUserLevel, String str) {
        long j = liveUserLevel.superGrade;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f52763j.setTypeface(null);
        long j2 = liveUserLevel.gap;
        if (j2 <= 999999 || xau.m209905o(yau.m214935c(j2)) == -1) {
            this.f52763j.setTypeface(typeface);
            this.f52763j.setText(String.valueOf(liveUserLevel.gap));
        } else {
            SpannableString spannableString = new SpannableString(yau.m214935c(liveUserLevel.gap));
            int color = getContext().getResources().getColor(n9c0.f140877w1);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, tak0.f172738p), 0, xau.m209905o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, color, tak0.f172739q), xau.m209905o(spannableString.toString()), spannableString.length(), 18);
            this.f52763j.setText(spannableString);
        }
        if (j > 0) {
            setShadowProgress(0);
        }
        ln4.m154949f(this.f52768o, false, liveUserLevel.grade, this.f52762i);
        double d = liveUserLevel.wealthRatio;
        VText vText = this.f52764k;
        if (d == 1.0d) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f52763j, false);
            bnl0.m105524M(this.f52765l, true);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f52763j, true);
            bnl0.m105524M(this.f52765l, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m77632P(final LiveUserLevel liveUserLevel, String str) {
        izs.m142869t("context_livingAct", this.f52756c, liveUserLevel.iconUrl, qa00.m175859d(46.0f));
        this.f52757d.setTypeface(Typeface.DEFAULT_BOLD);
        long j = liveUserLevel.superGrade;
        if (j > 0) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            VDraweeView vDraweeView = this.f52755b;
            if (zIsEmpty) {
                vDraweeView.setBackground(getDefaultCardBgDraw());
            } else {
                izs.m142868s("context_livingAct", vDraweeView, str);
            }
        } else {
            boolean zIsEmpty2 = TextUtils.isEmpty(str);
            VDraweeView vDraweeView2 = this.f52755b;
            if (zIsEmpty2) {
                vDraweeView2.setBackground(getDefaultCardBgDraw());
            } else {
                izs.m142868s("context_livingAct", vDraweeView2, str);
            }
        }
        vak0 vak0Var = this.f52768o;
        if (j > 0) {
            ln4.m154951h(vak0Var, false, this.f52757d);
            this.f52758e.setText(R$string.f47850Ue);
            this.f52757d.setText(String.valueOf(j));
        } else {
            ln4.m154950g(vak0Var, false, liveUserLevel.grade, this.f52757d);
            this.f52758e.setText(R$string.f47871Ve);
            this.f52757d.setText(String.valueOf(liveUserLevel.grade));
        }
        m77633Q(this.f52757d, this.f52758e);
        bnl0.m105524M(this.f52766m, false);
        l51.m152888H(getContext(), new Runnable() { // from class: l.kn4
            @Override // java.lang.Runnable
            public final void run() {
                this.f127554a.m77628G(liveUserLevel);
            }
        }, 450L);
    }

    /* JADX INFO: renamed from: Q */
    public void m77633Q(VText vText, VText vText2) {
        if (!ln4.m154944a(this.f52768o) || TextUtils.isEmpty(this.f52768o.m200535j().textColor)) {
            vText2.setTextColor(Color.parseColor(n3d0.m161286j(vText.getCurrentTextColor(), "80")));
        } else {
            vText2.setTextColor(n3d0.m161284h(this.f52768o.m200535j().textColor, n3d0.m161277a(n9c0.f140877w1)));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m77634S(User user) {
        m77629K();
        m77627C(this.f52754a, this.f52759f, this.f52760g, user, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        it0.m142009C(this.f52767n);
        this.f52759f.setScaleX(1.0f);
        this.f52759f.setScaleY(1.0f);
        this.f52759f.setAlpha(1.0f);
        this.f52760g.setAlpha(1.0f);
        this.f52754a.setScaleX(1.0f);
        this.f52754a.setScaleY(1.0f);
        this.f52754a.setAlpha(1.0f);
        this.f52755b.setAlpha(1.0f);
        this.f52766m.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77626B(this);
    }

    public CardUserLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardUserLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
