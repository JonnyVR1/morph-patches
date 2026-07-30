package com.p046p1.mobile.putong.live.livingroom.view;

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
import com.p046p1.mobile.putong.data.LiveAnchorLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.bgv;
import p149l.e51;
import p149l.fld0;
import p149l.h1c0;
import p149l.hxs;
import p149l.i7n;
import p149l.kvc0;
import p149l.kxb;
import p149l.mep0;
import p149l.n1k0;
import p149l.ng4;
import p149l.t100;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class CardAnchorLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f51864a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51865b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51866c;

    /* JADX INFO: renamed from: d */
    public VText f51867d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f51868e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f51869f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51870g;

    /* JADX INFO: renamed from: h */
    public VFrame f51871h;

    /* JADX INFO: renamed from: i */
    public View f51872i;

    /* JADX INFO: renamed from: j */
    public VText f51873j;

    /* JADX INFO: renamed from: k */
    public VText f51874k;

    /* JADX INFO: renamed from: l */
    public VText f51875l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f51876m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f51877n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.CardAnchorLevelView$a */
    public class C12918a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f51878a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f51879b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f51880c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f51881d;

        public C12918a(View view, View view2, boolean z, View view3) {
            this.f51878a = view;
            this.f51879b = view2;
            this.f51880c = z;
            this.f51881d = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardAnchorLevelView.this.f51864a.setClickable(true);
            CardAnchorLevelView.this.f51869f.setClickable(true);
            this.f51881d.setVisibility(8);
            this.f51881d.setAlpha(1.0f);
            if (!this.f51880c) {
                CardAnchorLevelView.this.setShadowProgress(0);
            }
            CardAnchorLevelView.this.f51876m.m68504n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f51878a.setAlpha(0.0f);
            this.f51879b.setAlpha(0.0f);
            this.f51878a.setVisibility(0);
            CardAnchorLevelView.this.f51864a.setClickable(false);
            CardAnchorLevelView.this.f51869f.setClickable(false);
            CardAnchorLevelView.this.setShadowProgress(0);
            if (this.f51880c) {
                CardAnchorLevelView.this.m76409N(true);
            }
        }
    }

    public CardAnchorLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m76395K(User user, View view) {
        m76404C(this.f51864a, this.f51869f, this.f51870g, user, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m76396L(User user, View view) {
        m76404C(this.f51869f, this.f51864a, this.f51865b, user, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        xdl0.m208327D0((int) Math.min(this.f51864a.getWidth() - t100.m186890d(12.0f), i * (this.f51864a.getWidth() - t100.m186890d(12.0f)) * 0.01f), this.f51872i);
    }

    /* JADX INFO: renamed from: B */
    public final void m76403B(View view) {
        ng4.m159292a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m76404C(View view, View view2, View view3, User user, boolean z) {
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
        duration.setInterpolator(new kxb());
        duration.setStartDelay(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mg4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f133641a.m76407G(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f51877n = animatorSet;
        animatorSet.addListener(new C12918a(view2, view3, z, view));
        this.f51877n.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f51877n.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f51877n.start();
    }

    /* JADX INFO: renamed from: E */
    public final int m76405E(long j) {
        if (j == 0) {
            return h1c0.f105402s;
        }
        if (j < 5) {
            return h1c0.f105381l;
        }
        if (j < 10) {
            return h1c0.f105393p;
        }
        if (j < 20) {
            return h1c0.f105405t;
        }
        if (j < 30) {
            return h1c0.f105384m;
        }
        if (j < 40) {
            return h1c0.f105419y;
        }
        return j < 50 ? h1c0.f105312I : h1c0.f105336U;
    }

    /* JADX INFO: renamed from: F */
    public final int m76406F(Long l2) {
        if (l2.longValue() == 0) {
            return h1c0.f105362e1;
        }
        if (l2.longValue() < 5) {
            return h1c0.f105300C;
        }
        if (l2.longValue() < 10) {
            return h1c0.f105304E;
        }
        if (l2.longValue() < 20) {
            return h1c0.f105306F;
        }
        if (l2.longValue() < 30) {
            return h1c0.f105344Y;
        }
        if (l2.longValue() < 40) {
            return h1c0.f105342X;
        }
        return l2.longValue() < 50 ? h1c0.f105367g0 : h1c0.f105311H0;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m76407G(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m76408M() {
        m76409N(false);
    }

    /* JADX INFO: renamed from: N */
    public final void m76409N(boolean z) {
        if (i7n.m134916b()) {
            return;
        }
        AnimEffectPlayer animEffectPlayer = this.f51876m;
        if (z) {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/e428f9b1-b6b8-406f-b35a-1532e6146fc611.pdf", 1, null);
        } else {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/0fd04768-e495-4471-ba3f-728dad45e2fa11.pdf", 2, null);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m76410O(final User user, String str, String str2) {
        m76413R();
        m76412Q(user, str);
        m76411P(user, str2);
        xdl0.m208329E0(this.f51864a, new View.OnClickListener() { // from class: l.jg4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117708a.m76395K(user, view);
            }
        });
        xdl0.m208329E0(this.f51869f, new View.OnClickListener() { // from class: l.kg4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122998a.m76396L(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m76411P(User user, String str) {
        mep0.m154302d1(this.f51871h, xdl0.m208407w(11.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        LiveAnchorLevel liveAnchorLevel = user.anchorHierarchy;
        this.f51873j.setTypeface(null);
        long j = liveAnchorLevel.gap;
        if (j <= 999999 || w8u.m202212o(x8u.m207433c(j)) == -1) {
            this.f51873j.setTypeface(typeface);
            this.f51873j.setText(String.valueOf(liveAnchorLevel.gap));
        } else {
            SpannableString spannableString = new SpannableString(x8u.m207433c(liveAnchorLevel.gap));
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, n1k0.f136654p), 0, w8u.m202212o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, n1k0.f136655q), w8u.m202212o(spannableString.toString()), spannableString.length(), 18);
            this.f51873j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f51870g;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        setShadowProgress(0);
        CardUserLevelView.m76435O(m76405E(user.anchorHierarchy.grade), this.f51872i);
        double d = liveAnchorLevel.wealthRatio;
        VText vText = this.f51874k;
        if (d == 1.0d) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f51873j, false);
            xdl0.m208344M(this.f51875l, true);
        } else {
            vText.setText(kvc0.m147355d(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f46610C9 : R$string.f46566A9));
            xdl0.m208344M(this.f51874k, true);
            xdl0.m208344M(this.f51873j, true);
            xdl0.m208344M(this.f51875l, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m76412Q(User user, String str) {
        hxs.m133407t("context_livingAct", this.f51866c, user.anchorHierarchy.iconUrl, t100.m186890d(46.0f));
        this.f51867d.setText(String.valueOf(user.anchorHierarchy.grade));
        this.f51867d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f51867d.setTextColor(kvc0.m147352a(m76406F(Long.valueOf(user.anchorHierarchy.grade))));
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f51865b;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        CardUserLevelView.m76434M(this.f51867d, this.f51868e);
        e51.m114743H(getContext(), new Runnable() { // from class: l.lg4
            @Override // java.lang.Runnable
            public final void run() {
                this.f127947a.m76408M();
            }
        }, 450L);
    }

    /* JADX INFO: renamed from: R */
    public final void m76413R() {
        xdl0.m208344M(this.f51864a, true);
        xdl0.m208344M(this.f51869f, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f51877n;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f51877n.end();
        }
        this.f51869f.setScaleX(1.0f);
        this.f51869f.setScaleY(1.0f);
        this.f51869f.setAlpha(1.0f);
        this.f51870g.setAlpha(1.0f);
        this.f51864a.setScaleX(1.0f);
        this.f51864a.setScaleY(1.0f);
        this.f51864a.setAlpha(1.0f);
        this.f51865b.setAlpha(1.0f);
        this.f51876m.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76403B(this);
        mep0.m154302d1(this.f51876m, t100.m186890d(16.0f));
    }

    public CardAnchorLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardAnchorLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
