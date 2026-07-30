package com.p046p1.mobile.putong.live.livingroom.voice.usercard.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.bgv;
import p149l.e51;
import p149l.fld0;
import p149l.h1c0;
import p149l.hfw;
import p149l.hxs;
import p149l.i7n;
import p149l.kvc0;
import p149l.kxb;
import p149l.mep0;
import p149l.ryo0;
import p149l.sum0;
import p149l.t100;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCardAnchorLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f53870a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53871b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53872c;

    /* JADX INFO: renamed from: d */
    public VText f53873d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f53874e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f53875f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53876g;

    /* JADX INFO: renamed from: h */
    public VFrame f53877h;

    /* JADX INFO: renamed from: i */
    public View f53878i;

    /* JADX INFO: renamed from: j */
    public VText f53879j;

    /* JADX INFO: renamed from: k */
    public VText f53880k;

    /* JADX INFO: renamed from: l */
    public VText f53881l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f53882m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f53883n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView$a */
    public class C13050a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f53884a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f53885b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f53886c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f53887d;

        public C13050a(View view, View view2, boolean z, View view3) {
            this.f53884a = view;
            this.f53885b = view2;
            this.f53886c = z;
            this.f53887d = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceCardAnchorLevelView.this.f53870a.setClickable(true);
            VoiceCardAnchorLevelView.this.f53875f.setClickable(true);
            this.f53887d.setVisibility(8);
            this.f53887d.setAlpha(1.0f);
            if (!this.f53886c) {
                VoiceCardAnchorLevelView.this.setShadowProgress(0);
            }
            VoiceCardAnchorLevelView.this.f53882m.m68504n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f53884a.setAlpha(0.0f);
            this.f53885b.setAlpha(0.0f);
            this.f53884a.setVisibility(0);
            VoiceCardAnchorLevelView.this.f53870a.setClickable(false);
            VoiceCardAnchorLevelView.this.f53875f.setClickable(false);
            VoiceCardAnchorLevelView.this.setShadowProgress(0);
            if (this.f53886c) {
                VoiceCardAnchorLevelView.this.m78736N(true);
            }
        }
    }

    public VoiceCardAnchorLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    private int m78732E(long j) {
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
    private int m78733F(Long l2) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m78734G(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m78735M() {
        m78736N(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m78736N(boolean z) {
        if (i7n.m134916b()) {
            return;
        }
        AnimEffectPlayer animEffectPlayer = this.f53882m;
        if (z) {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/e428f9b1-b6b8-406f-b35a-1532e6146fc611.pdf", 1, null);
        } else {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/0fd04768-e495-4471-ba3f-728dad45e2fa11.pdf", 2, null);
        }
    }

    /* JADX INFO: renamed from: R */
    private void m78737R() {
        xdl0.m208344M(this.f53870a, true);
        xdl0.m208344M(this.f53875f, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        xdl0.m208327D0((int) Math.min(this.f53870a.getWidth() - t100.m186890d(12.0f), i * (this.f53870a.getWidth() - t100.m186890d(12.0f)) * 0.01f), this.f53878i);
    }

    /* JADX INFO: renamed from: B */
    public final void m78744B(View view) {
        sum0.m186015a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m78745C(View view, View view2, View view3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, boolean z) {
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
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rum0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f161079a.m78734G(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f53883n = animatorSet;
        animatorSet.addListener(new C13050a(view2, view3, z, view));
        this.f53883n.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f53883n.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f53883n.start();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m78746K(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m78745C(this.f53870a, this.f53875f, this.f53876g, bLiveUserProfileConfigHierarchy, true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m78747L(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m78745C(this.f53875f, this.f53870a, this.f53871b, bLiveUserProfileConfigHierarchy, false);
    }

    /* JADX INFO: renamed from: O */
    public void m78748O(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str, String str2) {
        m78737R();
        m78750Q(bLiveUserProfileConfigHierarchy, str);
        m78749P(bLiveUserProfileConfigHierarchy, str2);
        xdl0.m208329E0(this.f53870a, new View.OnClickListener() { // from class: l.oum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145714a.m78746K(bLiveUserProfileConfigHierarchy, view);
            }
        });
        xdl0.m208329E0(this.f53875f, new View.OnClickListener() { // from class: l.pum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151322a.m78747L(bLiveUserProfileConfigHierarchy, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m78749P(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        mep0.m154302d1(this.f53877h, xdl0.m208407w(11.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f53879j.setTypeface(null);
        long j = bLiveUserProfileConfigHierarchy.gap;
        if (j <= 999999 || w8u.m202212o(x8u.m207433c(j)) == -1) {
            this.f53879j.setTypeface(typeface);
            this.f53879j.setText(String.valueOf(bLiveUserProfileConfigHierarchy.gap));
        } else {
            SpannableString spannableString = new SpannableString(x8u.m207433c(bLiveUserProfileConfigHierarchy.gap));
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, ryo0.f161569o), 0, w8u.m202212o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, ryo0.f161570p), w8u.m202212o(spannableString.toString()), spannableString.length(), 18);
            this.f53879j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f53876g;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        setShadowProgress(0);
        CardUserLevelView.m76435O(m78732E(bLiveUserProfileConfigHierarchy.grade), this.f53878i);
        double d = bLiveUserProfileConfigHierarchy.wealthRatio;
        VText vText = this.f53880k;
        if (d == 1.0d) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f53879j, false);
            xdl0.m208344M(this.f53881l, true);
        } else {
            vText.setText(kvc0.m147355d(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f46610C9 : R$string.f46566A9));
            xdl0.m208344M(this.f53880k, true);
            xdl0.m208344M(this.f53879j, true);
            xdl0.m208344M(this.f53881l, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m78750Q(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        hxs.m133407t("context_livingAct", this.f53872c, bLiveUserProfileConfigHierarchy.iconUrl, t100.m186890d(46.0f));
        hfw.m130790a("VoiceCardAnchorLevelView", "anchorLevel.iconUrl:" + bLiveUserProfileConfigHierarchy.iconUrl);
        this.f53873d.setText(String.valueOf(bLiveUserProfileConfigHierarchy.grade));
        this.f53873d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f53873d.setTextColor(kvc0.m147352a(m78733F(Long.valueOf(bLiveUserProfileConfigHierarchy.grade))));
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f53871b;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, str);
        }
        CardUserLevelView.m76434M(this.f53873d, this.f53874e);
        e51.m114743H(getContext(), new Runnable() { // from class: l.qum0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156523a.m78735M();
            }
        }, 450L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f53883n;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f53883n.end();
        }
        this.f53875f.setScaleX(1.0f);
        this.f53875f.setScaleY(1.0f);
        this.f53875f.setAlpha(1.0f);
        this.f53876g.setAlpha(1.0f);
        this.f53870a.setScaleX(1.0f);
        this.f53870a.setScaleY(1.0f);
        this.f53870a.setAlpha(1.0f);
        this.f53871b.setAlpha(1.0f);
        this.f53882m.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78744B(this);
    }

    public VoiceCardAnchorLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardAnchorLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
