package com.p000p1.mobile.putong.live.livingroom.voice.usercard.view;

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
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.view.CardUserLevelView;
import l.ap0;
import l.e51;
import l.h1c0;
import l.hfw;
import l.hxs;
import l.i7n;
import l.kvc0;
import l.kxb;
import l.mep0;
import l.sum0;
import l.t100;
import l.w8u;
import l.xdl0;
import p009l.bgv;
import p009l.fld0;
import p009l.ryo0;
import p009l.x8u;
import p009l.ypv;
import v.VDraweeView;
import v.VFrame;
import v.VMarqueeText;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCardAnchorLevelView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7476a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7477b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7478c;

    /* JADX INFO: renamed from: d */
    public VText f7479d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f7480e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f7481f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7482g;

    /* JADX INFO: renamed from: h */
    public VFrame f7483h;

    /* JADX INFO: renamed from: i */
    public View f7484i;

    /* JADX INFO: renamed from: j */
    public VText f7485j;

    /* JADX INFO: renamed from: k */
    public VText f7486k;

    /* JADX INFO: renamed from: l */
    public VText f7487l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f7488m;

    /* JADX INFO: renamed from: n */
    public AnimatorSet f7489n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView$a */
    public class C0452a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f7490a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f7491b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f7492c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f7493d;

        public C0452a(View view, View view2, boolean z, View view3) {
            this.f7490a = view;
            this.f7491b = view2;
            this.f7492c = z;
            this.f7493d = view3;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VoiceCardAnchorLevelView.this.f7476a.setClickable(true);
            VoiceCardAnchorLevelView.this.f7481f.setClickable(true);
            this.f7493d.setVisibility(8);
            this.f7493d.setAlpha(1.0f);
            if (!this.f7492c) {
                VoiceCardAnchorLevelView.this.setShadowProgress(0);
            }
            VoiceCardAnchorLevelView.this.f7488m.n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f7490a.setAlpha(0.0f);
            this.f7491b.setAlpha(0.0f);
            this.f7490a.setVisibility(0);
            VoiceCardAnchorLevelView.this.f7476a.setClickable(false);
            VoiceCardAnchorLevelView.this.f7481f.setClickable(false);
            VoiceCardAnchorLevelView.this.setShadowProgress(0);
            if (this.f7492c) {
                VoiceCardAnchorLevelView.this.m8952N(true);
            }
        }
    }

    public VoiceCardAnchorLevelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    private int m8948E(long j) {
        if (j == 0) {
            return h1c0.s;
        }
        if (j < 5) {
            return h1c0.l;
        }
        if (j < 10) {
            return h1c0.p;
        }
        if (j < 20) {
            return h1c0.t;
        }
        if (j < 30) {
            return h1c0.m;
        }
        if (j < 40) {
            return h1c0.y;
        }
        return j < 50 ? h1c0.I : h1c0.U;
    }

    /* JADX INFO: renamed from: F */
    private int m8949F(Long l2) {
        if (l2.longValue() == 0) {
            return h1c0.e1;
        }
        if (l2.longValue() < 5) {
            return h1c0.C;
        }
        if (l2.longValue() < 10) {
            return h1c0.E;
        }
        if (l2.longValue() < 20) {
            return h1c0.F;
        }
        if (l2.longValue() < 30) {
            return h1c0.Y;
        }
        if (l2.longValue() < 40) {
            return h1c0.X;
        }
        return l2.longValue() < 50 ? h1c0.g0 : h1c0.H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m8950G(ValueAnimator valueAnimator) {
        setShadowProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m8951M() {
        m8952N(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m8952N(boolean z) {
        if (i7n.b()) {
            return;
        }
        AnimEffectPlayer animEffectPlayer = this.f7488m;
        if (z) {
            animEffectPlayer.l("https://auto.tancdn.com/v1/raw/e428f9b1-b6b8-406f-b35a-1532e6146fc611.pdf", 1, (ap0) null);
        } else {
            animEffectPlayer.l("https://auto.tancdn.com/v1/raw/0fd04768-e495-4471-ba3f-728dad45e2fa11.pdf", 2, (ap0) null);
        }
    }

    /* JADX INFO: renamed from: R */
    private void m8953R() {
        xdl0.M(this.f7476a, true);
        xdl0.M(this.f7481f, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShadowProgress(int i) {
        xdl0.D0((int) Math.min(this.f7476a.getWidth() - t100.d(12.0f), i * (this.f7476a.getWidth() - t100.d(12.0f)) * 0.01f), new View[]{this.f7484i});
    }

    /* JADX INFO: renamed from: B */
    public final void m8960B(View view) {
        sum0.a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m8961C(View view, View view2, View view3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, boolean z) {
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
                this.f19986a.m8950G(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7489n = animatorSet;
        animatorSet.addListener(new C0452a(view2, view3, z, view));
        this.f7489n.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9).before(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7);
        if (z) {
            this.f7489n.play(duration).after(objectAnimatorOfFloat6);
        }
        this.f7489n.start();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m8962K(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m8961C(this.f7476a, this.f7481f, this.f7482g, bLiveUserProfileConfigHierarchy, true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m8963L(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, View view) {
        m8961C(this.f7481f, this.f7476a, this.f7477b, bLiveUserProfileConfigHierarchy, false);
    }

    /* JADX INFO: renamed from: O */
    public void m8964O(final BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str, String str2) {
        m8953R();
        m8966Q(bLiveUserProfileConfigHierarchy, str);
        m8965P(bLiveUserProfileConfigHierarchy, str2);
        xdl0.E0(this.f7476a, new View.OnClickListener() { // from class: l.oum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18257a.m8962K(bLiveUserProfileConfigHierarchy, view);
            }
        });
        xdl0.E0(this.f7481f, new View.OnClickListener() { // from class: l.pum0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18929a.m8963L(bLiveUserProfileConfigHierarchy, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final void m8965P(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        mep0.d1(this.f7483h, xdl0.w(11.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.f7485j.setTypeface(null);
        long j = bLiveUserProfileConfigHierarchy.gap;
        if (j <= 999999 || w8u.o(x8u.m24745c(j)) == -1) {
            this.f7485j.setTypeface(typeface);
            this.f7485j.setText(String.valueOf(bLiveUserProfileConfigHierarchy.gap));
        } else {
            SpannableString spannableString = new SpannableString(x8u.m24745c(bLiveUserProfileConfigHierarchy.gap));
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, ryo0.f20028o), 0, w8u.o(spannableString.toString()), 18);
            spannableString.setSpan(new CustomTypefaceSpan("sans-serif", typeface, -1, ryo0.f20029p), w8u.o(spannableString.toString()), spannableString.length(), 18);
            this.f7485j.setText(spannableString);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f7482g;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.s("context_livingAct", vDraweeView, str);
        }
        setShadowProgress(0);
        CardUserLevelView.O(m8948E(bLiveUserProfileConfigHierarchy.grade), this.f7484i);
        double d = bLiveUserProfileConfigHierarchy.wealthRatio;
        VText vText = this.f7486k;
        if (d == 1.0d) {
            xdl0.M(vText, false);
            xdl0.M(this.f7485j, false);
            xdl0.M(this.f7487l, true);
        } else {
            vText.setText(kvc0.d(((bgv) ypv.m25491l(fld0.f13080f)).m12018n() ? R.string.C9 : R.string.A9));
            xdl0.M(this.f7486k, true);
            xdl0.M(this.f7485j, true);
            xdl0.M(this.f7487l, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m8966Q(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str) {
        hxs.t("context_livingAct", this.f7478c, bLiveUserProfileConfigHierarchy.iconUrl, t100.d(46.0f));
        hfw.a("VoiceCardAnchorLevelView", "anchorLevel.iconUrl:" + bLiveUserProfileConfigHierarchy.iconUrl);
        this.f7479d.setText(String.valueOf(bLiveUserProfileConfigHierarchy.grade));
        this.f7479d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7479d.setTextColor(kvc0.a(m8949F(Long.valueOf(bLiveUserProfileConfigHierarchy.grade))));
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VDraweeView vDraweeView = this.f7477b;
        if (zIsEmpty) {
            vDraweeView.setBackground(CardUserLevelView.getDefaultCardBgDraw());
        } else {
            hxs.s("context_livingAct", vDraweeView, str);
        }
        CardUserLevelView.M(this.f7479d, this.f7480e);
        e51.H(getContext(), new Runnable() { // from class: l.qum0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19556a.m8951M();
            }
        }, 450L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f7489n;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f7489n.end();
        }
        this.f7481f.setScaleX(1.0f);
        this.f7481f.setScaleY(1.0f);
        this.f7481f.setAlpha(1.0f);
        this.f7482g.setAlpha(1.0f);
        this.f7476a.setScaleX(1.0f);
        this.f7476a.setScaleY(1.0f);
        this.f7476a.setAlpha(1.0f);
        this.f7477b.setAlpha(1.0f);
        this.f7488m.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8960B(this);
    }

    public VoiceCardAnchorLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardAnchorLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
