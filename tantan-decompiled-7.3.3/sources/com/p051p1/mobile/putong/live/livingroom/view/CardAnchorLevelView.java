package com.p051p1.mobile.putong.live.livingroom.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.data.LiveAnchorLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.civ;
import p153l.htd0;
import p153l.i9n;
import p153l.izs;
import p153l.l51;
import p153l.mh4;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;
import p153l.qnp0;
import p153l.tak0;
import p153l.xau;
import p153l.yau;
import p153l.yyb;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class CardAnchorLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f52712a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52713b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52714c;

    /* JADX INFO: renamed from: d */
    public VText f52715d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f52716e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f52717f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52718g;

    /* JADX INFO: renamed from: h */
    public VFrame f52719h;

    /* JADX INFO: renamed from: i */
    public View f52720i;

    /* JADX INFO: renamed from: j */
    public VText f52721j;

    /* JADX INFO: renamed from: k */
    public VText f52722k;

    /* JADX INFO: renamed from: l */
    public VText f52723l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f52724m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f52725n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardAnchorLevelView$a */
    public class C13081a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f52726a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f52727b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f52728c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f52729d;

        public C13081a(View view, View view2, boolean z, View view3) {
            this.f52726a = view;
            this.f52727b = view2;
            this.f52728c = z;
            this.f52729d = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardAnchorLevelView.this.f52712a.setClickable(true);
            CardAnchorLevelView.this.f52717f.setClickable(true);
            this.f52729d.setVisibility(8);
            this.f52729d.setAlpha(1.0f);
            if (!this.f52728c) {
                CardAnchorLevelView.this.setShadowProgress(0);
            }
            CardAnchorLevelView.this.f52724m.m69687n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f52726a.setAlpha(0.0f);
            this.f52727b.setAlpha(0.0f);
            this.f52726a.setVisibility(0);
            CardAnchorLevelView.this.f52712a.setClickable(false);
            CardAnchorLevelView.this.f52717f.setClickable(false);
            CardAnchorLevelView.this.setShadowProgress(0);
            if (this.f52728c) {
                CardAnchorLevelView.this.m77592N(true);
            }
        }
    }

    public CardAnchorLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m77578K(User user, View view) {
        m77587C(this.f52712a, this.f52717f, this.f52718g, user, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m77579L(User user, View view) {
        m77587C(this.f52717f, this.f52712a, this.f52713b, user, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        bnl0.m105507D0((int) Math.min(this.f52712a.getWidth() - qa00.m175859d(12.0f), i * (this.f52712a.getWidth() - qa00.m175859d(12.0f)) * 0.01f), this.f52720i);
    }

    /* JADX INFO: renamed from: B */
    public final void m77586B(View view) {
        mh4.m158410a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m77587C(View view, View view2, View view3, User user, boolean z) {
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
        ValueAnimator duration = ValueAnimator.ofInt(0, (int) (user.anchorHierarchy.wealthRatio * 100.0d)).setDuration(220L);
        duration.setInterpolator(new yyb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lh4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f132068a.m77590G(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52725n = animatorSet;
        animatorSet.addListener(new C13081a(view2, view3, z, view));
        this.f52725n.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f52725n.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f52725n.start();
    }

    /* JADX INFO: renamed from: E */
    public final int m77588E(long j) {
        if (j == 0) {
            return n9c0.f140863s;
        }
        if (j < 5) {
            return n9c0.f140842l;
        }
        if (j < 10) {
            return n9c0.f140854p;
        }
        if (j < 20) {
            return n9c0.f140866t;
        }
        if (j < 30) {
            return n9c0.f140845m;
        }
        if (j < 40) {
            return n9c0.f140880y;
        }
        return j < 50 ? n9c0.f140773I : n9c0.f140797U;
    }

    /* JADX INFO: renamed from: F */
    public final int m77589F(Long l2) {
        if (l2.longValue() == 0) {
            return n9c0.f140823e1;
        }
        if (l2.longValue() < 5) {
            return n9c0.f140761C;
        }
        if (l2.longValue() < 10) {
            return n9c0.f140765E;
        }
        if (l2.longValue() < 20) {
            return n9c0.f140767F;
        }
        if (l2.longValue() < 30) {
            return n9c0.f140805Y;
        }
        if (l2.longValue() < 40) {
            return n9c0.f140803X;
        }
        return l2.longValue() < 50 ? n9c0.f140828g0 : n9c0.f140772H0;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m77590G(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m77591M() {
        m77592N(false);
    }

    /* JADX INFO: renamed from: N */
    public final void m77592N(boolean z) {
        if (i9n.m139127b()) {
            return;
        }
        AnimEffectPlayer animEffectPlayer = this.f52724m;
        if (z) {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/e428f9b1-b6b8-406f-b35a-1532e6146fc611.pdf", 1, null);
        } else {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/0fd04768-e495-4471-ba3f-728dad45e2fa11.pdf", 2, null);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m77593O(final User user, String str, String str2) {
        m77596R();
        m77595Q(user, str);
        m77594P(user, str2);
        bnl0.m105509E0(this.f52712a, new View.OnClickListener() { // from class: l.ih4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114868a.m77578K(user, view);
            }
        });
        bnl0.m105509E0(this.f52717f, new View.OnClickListener() { // from class: l.jh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120804a.m77579L(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m77594P(User user, String str) {
        qnp0.m177261d1(this.f52719h, bnl0.m105587w(11.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        LiveAnchorLevel liveAnchorLevel = user.anchorHierarchy;
        this.f52721j.setTypeface(null);
        long j = liveAnchorLevel.gap;
        if (j <= 999999 || xau.m209905o(yau.m214935c(j)) == -1) {
            this.f52721j.setTypeface(typeface);
            this.f52721j.setText(String.valueOf(liveAnchorLevel.gap));
        } else {
            SpannableString spannableString = new SpannableString(yau.m214935c(liveAnchorLevel.gap));
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, tak0.f172738p), 0, xau.m209905o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, tak0.f172739q), xau.m209905o(spannableString.toString()), spannableString.length(), 18);
            this.f52721j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f52718g;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        setShadowProgress(0);
        CardUserLevelView.m77618O(m77588E(user.anchorHierarchy.grade), this.f52720i);
        double d = liveAnchorLevel.wealthRatio;
        VText vText = this.f52722k;
        if (d == 1.0d) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f52721j, false);
            bnl0.m105524M(this.f52723l, true);
        } else {
            vText.setText(n3d0.m161280d(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f47458C9 : R$string.f47414A9));
            bnl0.m105524M(this.f52722k, true);
            bnl0.m105524M(this.f52721j, true);
            bnl0.m105524M(this.f52723l, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m77595Q(User user, String str) {
        izs.m142869t("context_livingAct", this.f52714c, user.anchorHierarchy.iconUrl, qa00.m175859d(46.0f));
        this.f52715d.setText(String.valueOf(user.anchorHierarchy.grade));
        this.f52715d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f52715d.setTextColor(n3d0.m161277a(m77589F(Long.valueOf(user.anchorHierarchy.grade))));
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f52713b;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        CardUserLevelView.m77617M(this.f52715d, this.f52716e);
        l51.m152888H(getContext(), new Runnable() { // from class: l.kh4
            @Override // java.lang.Runnable
            public final void run() {
                this.f126693a.m77591M();
            }
        }, 450L);
    }

    /* JADX INFO: renamed from: R */
    public final void m77596R() {
        bnl0.m105524M(this.f52712a, true);
        bnl0.m105524M(this.f52717f, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f52725n;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f52725n.end();
        }
        this.f52717f.setScaleX(1.0f);
        this.f52717f.setScaleY(1.0f);
        this.f52717f.setAlpha(1.0f);
        this.f52718g.setAlpha(1.0f);
        this.f52712a.setScaleX(1.0f);
        this.f52712a.setScaleY(1.0f);
        this.f52712a.setAlpha(1.0f);
        this.f52713b.setAlpha(1.0f);
        this.f52724m.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77586B(this);
        qnp0.m177261d1(this.f52724m, qa00.m175859d(16.0f));
    }

    public CardAnchorLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardAnchorLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
