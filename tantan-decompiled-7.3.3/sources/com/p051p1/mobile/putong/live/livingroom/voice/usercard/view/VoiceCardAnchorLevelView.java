package com.p051p1.mobile.putong.live.livingroom.voice.usercard.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.civ;
import p153l.fhw;
import p153l.htd0;
import p153l.i9n;
import p153l.izs;
import p153l.l51;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;
import p153l.qnp0;
import p153l.v7p0;
import p153l.w3n0;
import p153l.xau;
import p153l.yau;
import p153l.yyb;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceCardAnchorLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f54718a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54719b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f54720c;

    /* JADX INFO: renamed from: d */
    public VText f54721d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f54722e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f54723f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54724g;

    /* JADX INFO: renamed from: h */
    public VFrame f54725h;

    /* JADX INFO: renamed from: i */
    public View f54726i;

    /* JADX INFO: renamed from: j */
    public VText f54727j;

    /* JADX INFO: renamed from: k */
    public VText f54728k;

    /* JADX INFO: renamed from: l */
    public VText f54729l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f54730m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f54731n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView$a */
    public class C13213a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f54732a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f54733b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f54734c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f54735d;

        public C13213a(View view, View view2, boolean z, View view3) {
            this.f54732a = view;
            this.f54733b = view2;
            this.f54734c = z;
            this.f54735d = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceCardAnchorLevelView.this.f54718a.setClickable(true);
            VoiceCardAnchorLevelView.this.f54723f.setClickable(true);
            this.f54735d.setVisibility(8);
            this.f54735d.setAlpha(1.0f);
            if (!this.f54734c) {
                VoiceCardAnchorLevelView.this.setShadowProgress(0);
            }
            VoiceCardAnchorLevelView.this.f54730m.m69687n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f54732a.setAlpha(0.0f);
            this.f54733b.setAlpha(0.0f);
            this.f54732a.setVisibility(0);
            VoiceCardAnchorLevelView.this.f54718a.setClickable(false);
            VoiceCardAnchorLevelView.this.f54723f.setClickable(false);
            VoiceCardAnchorLevelView.this.setShadowProgress(0);
            if (this.f54734c) {
                VoiceCardAnchorLevelView.this.m79919N(true);
            }
        }
    }

    public VoiceCardAnchorLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    private int m79915E(long j) {
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
    private int m79916F(Long l2) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m79917G(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m79918M() {
        m79919N(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m79919N(boolean z) {
        if (i9n.m139127b()) {
            return;
        }
        AnimEffectPlayer animEffectPlayer = this.f54730m;
        if (z) {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/e428f9b1-b6b8-406f-b35a-1532e6146fc611.pdf", 1, null);
        } else {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/0fd04768-e495-4471-ba3f-728dad45e2fa11.pdf", 2, null);
        }
    }

    /* JADX INFO: renamed from: R */
    private void m79920R() {
        bnl0.m105524M(this.f54718a, true);
        bnl0.m105524M(this.f54723f, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        bnl0.m105507D0((int) Math.min(this.f54718a.getWidth() - qa00.m175859d(12.0f), i * (this.f54718a.getWidth() - qa00.m175859d(12.0f)) * 0.01f), this.f54726i);
    }

    /* JADX INFO: renamed from: B */
    public final void m79927B(View view) {
        w3n0.m204778a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m79928C(View view, View view2, View view3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, boolean z) {
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
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.v3n0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f182224a.m79917G(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f54731n = animatorSet;
        animatorSet.addListener(new C13213a(view2, view3, z, view));
        this.f54731n.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f54731n.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f54731n.start();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m79929K(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m79928C(this.f54718a, this.f54723f, this.f54724g, bLiveUserProfileConfigHierarchy, true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m79930L(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m79928C(this.f54723f, this.f54718a, this.f54719b, bLiveUserProfileConfigHierarchy, false);
    }

    /* JADX INFO: renamed from: O */
    public void m79931O(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str, String str2) {
        m79920R();
        m79933Q(bLiveUserProfileConfigHierarchy, str);
        m79932P(bLiveUserProfileConfigHierarchy, str2);
        bnl0.m105509E0(this.f54718a, new View.OnClickListener() { // from class: l.s3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166022a.m79929K(bLiveUserProfileConfigHierarchy, view);
            }
        });
        bnl0.m105509E0(this.f54723f, new View.OnClickListener() { // from class: l.t3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171936a.m79930L(bLiveUserProfileConfigHierarchy, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m79932P(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        qnp0.m177261d1(this.f54725h, bnl0.m105587w(11.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f54727j.setTypeface(null);
        long j = bLiveUserProfileConfigHierarchy.gap;
        if (j <= 999999 || xau.m209905o(yau.m214935c(j)) == -1) {
            this.f54727j.setTypeface(typeface);
            this.f54727j.setText(String.valueOf(bLiveUserProfileConfigHierarchy.gap));
        } else {
            SpannableString spannableString = new SpannableString(yau.m214935c(bLiveUserProfileConfigHierarchy.gap));
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, v7p0.f182790o), 0, xau.m209905o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, v7p0.f182791p), xau.m209905o(spannableString.toString()), spannableString.length(), 18);
            this.f54727j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f54724g;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        setShadowProgress(0);
        CardUserLevelView.m77618O(m79915E(bLiveUserProfileConfigHierarchy.grade), this.f54726i);
        double d = bLiveUserProfileConfigHierarchy.wealthRatio;
        VText vText = this.f54728k;
        if (d == 1.0d) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f54727j, false);
            bnl0.m105524M(this.f54729l, true);
        } else {
            vText.setText(n3d0.m161280d(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f47458C9 : R$string.f47414A9));
            bnl0.m105524M(this.f54728k, true);
            bnl0.m105524M(this.f54727j, true);
            bnl0.m105524M(this.f54729l, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m79933Q(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        izs.m142869t("context_livingAct", this.f54720c, bLiveUserProfileConfigHierarchy.iconUrl, qa00.m175859d(46.0f));
        fhw.m125605a("VoiceCardAnchorLevelView", "anchorLevel.iconUrl:" + bLiveUserProfileConfigHierarchy.iconUrl);
        this.f54721d.setText(String.valueOf(bLiveUserProfileConfigHierarchy.grade));
        this.f54721d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f54721d.setTextColor(n3d0.m161277a(m79916F(Long.valueOf(bLiveUserProfileConfigHierarchy.grade))));
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f54719b;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            izs.m142868s("context_livingAct", vDraweeView, str);
        }
        CardUserLevelView.m77617M(this.f54721d, this.f54722e);
        l51.m152888H(getContext(), new Runnable() { // from class: l.u3n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f177356a.m79918M();
            }
        }, 450L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f54731n;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f54731n.end();
        }
        this.f54723f.setScaleX(1.0f);
        this.f54723f.setScaleY(1.0f);
        this.f54723f.setAlpha(1.0f);
        this.f54724g.setAlpha(1.0f);
        this.f54718a.setScaleX(1.0f);
        this.f54718a.setScaleY(1.0f);
        this.f54718a.setAlpha(1.0f);
        this.f54719b.setAlpha(1.0f);
        this.f54730m.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79927B(this);
    }

    public VoiceCardAnchorLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardAnchorLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
