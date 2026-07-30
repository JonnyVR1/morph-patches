package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import l.ac20;
import l.bs5;
import l.bt0;
import l.d30;
import l.dt0;
import l.e30;
import l.ffw;
import l.hxs;
import l.mep0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import p002l.i3c0;
import p002l.rzs;
import p002l.vui0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveIntlStarLeaderBoardEffectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveIntlStarLeaderBoardEffectView f6032a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f6033b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f6034c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f6035d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f6036e;

    /* JADX INFO: renamed from: f */
    public VText f6037f;

    /* JADX INFO: renamed from: g */
    public Animator f6038g;

    /* JADX INFO: renamed from: h */
    public boolean f6039h;

    /* JADX INFO: renamed from: i */
    public Animator f6040i;

    /* JADX INFO: renamed from: j */
    public bs5 f6041j;

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context) {
        super(context);
        this.f6039h = true;
        this.f6040i = null;
        this.f6041j = new bs5();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ roj0 m7611f(ac20 ac20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ac20Var.e(bitmap.copy(bitmap.getConfig(), false));
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: h */
    public final void m7613h(View view) {
        rzs.m22153a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m7614i() {
        this.f6039h = true;
        if (NullChecker.a(this.f6040i)) {
            this.f6040i.end();
            this.f6040i.removeAllListeners();
        }
        dt0.C(this.f6038g);
    }

    /* JADX INFO: renamed from: j */
    public final int[] m7615j(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        int color;
        int color2;
        try {
            color = Color.parseColor("#" + giftLeaderboardTopEffect.getStartBackendColor());
            color2 = Color.parseColor("#" + giftLeaderboardTopEffect.getEndBackendColor());
        } catch (Exception e) {
            CrashHelper.c(e);
            color = Color.parseColor("#7613F3");
            color2 = Color.parseColor("#7613F3");
        }
        return new int[]{color, color2};
    }

    /* JADX INFO: renamed from: k */
    public final GradientDrawable m7616k(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.d(24.0f));
        gradientDrawable.setColors(m7615j(giftLeaderboardTopEffect));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: l */
    public boolean m7617l() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m7618m() {
        if (this.f6039h) {
            return;
        }
        this.f6040i.start();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7619n() {
        this.f6039h = true;
        this.f6040i.end();
        this.f6040i.removeAllListeners();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7620o() {
        xdl0.M(this, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7614i();
        this.f6041j.c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7613h(this);
        mep0.c1(this.f6034c, 0, 0, 0, 0, t100.d(12.0f));
        mep0.c1(this.f6035d, 0, 0, 0, 0, t100.d(12.0f));
        mep0.c1(this.f6036e, 0, 0, 0, 0, t100.d(12.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m7621p(d30 d30Var) {
        xdl0.M(this, false);
        this.f6039h = true;
        this.f6041j.c();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m7622q(SpannableStringBuilder spannableStringBuilder, roj0 roj0Var) {
        this.f6037f.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7623r(Act act, final SpannableStringBuilder spannableStringBuilder, final ac20 ac20Var) {
        if (ac20Var.d()) {
            return;
        }
        this.f6041j.a(act.duringCreated(hxs.e("context_common", ac20Var.c().trim()).map(new w9j() { // from class: l.pzs
            public final Object call(Object obj) {
                return LiveIntlStarLeaderBoardEffectView.m7611f(ac20Var, (Bitmap) obj);
            }
        }).compose(mkd0.C())).subscribe(ffw.d(new e30() { // from class: l.qzs
            public final void call(Object obj) {
                this.f18295a.m7622q(spannableStringBuilder, (roj0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public void m7624s(String str, final d30 d30Var, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f6036e.j(str, -1);
        }
        this.f6039h = false;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6034c, "translationY", -t100.d(56.0f), t100.d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6033b, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6034c, "translationY", t100.d(59.0f), t100.d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        Animator animatorQ = bt0.q(this.f6033b, "alpha", new float[]{1.0f, 0.5f});
        animatorQ.setDuration(650L);
        Animator animatorQ2 = bt0.q(this.f6033b, "alpha", new float[]{0.5f, 1.0f});
        animatorQ2.setDuration(350L);
        Animator animatorS = bt0.s(new Animator[]{animatorQ, animatorQ2});
        this.f6040i = animatorS;
        animatorS.setInterpolator(new LinearInterpolator());
        bt0.f(this.f6040i, new Runnable() { // from class: l.lzs
            @Override // java.lang.Runnable
            public final void run() {
                this.f15188a.m7618m();
            }
        });
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6034c, "translationY", t100.d(49.0f), -t100.d(105.0f));
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setStartDelay(j);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        bt0.v(objectAnimatorOfFloat4, new Runnable() { // from class: l.mzs
            @Override // java.lang.Runnable
            public final void run() {
                this.f15757a.m7619n();
            }
        });
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6033b, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setStartDelay(j);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        Animator animatorS2 = bt0.s(new Animator[]{bt0.z(new Animator[]{objectAnimatorOfFloat, objectAnimatorOfFloat2}), objectAnimatorOfFloat3, this.f6040i, bt0.z(new Animator[]{objectAnimatorOfFloat4, objectAnimatorOfFloat5})});
        this.f6038g = animatorS2;
        bt0.w(animatorS2, new Runnable() { // from class: l.nzs
            @Override // java.lang.Runnable
            public final void run() {
                this.f16319a.m7620o();
            }
        }, new Runnable() { // from class: l.ozs
            @Override // java.lang.Runnable
            public final void run() {
                this.f16922a.m7621p(d30Var);
            }
        });
        this.f6038g.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m7625t(final Act act, final SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null) {
            return;
        }
        vwb.z(Arrays.asList((ac20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ac20.class)), new e30() { // from class: l.kzs
            public final void call(Object obj) {
                this.f14611a.m7623r(act, spannableStringBuilder, (ac20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m7626u(Act act, vui0 vui0Var, d30 d30Var) {
        LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffectM24161b = vui0Var.m24161b();
        m7625t(act, vui0Var.m24160a());
        if (giftLeaderboardTopEffectM24161b == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(giftLeaderboardTopEffectM24161b.getEffectBackgroundUrl());
        VDraweeView vDraweeView = this.f6033b;
        if (zIsEmpty) {
            vDraweeView.setImageResource(i3c0.f12574M7);
        } else {
            hxs.s("context_single_room", vDraweeView, giftLeaderboardTopEffectM24161b.getEffectBackgroundUrl());
        }
        long duration = giftLeaderboardTopEffectM24161b.getDuration();
        boolean zIsEmpty2 = TextUtils.isEmpty(giftLeaderboardTopEffectM24161b.getBackgroundUrl());
        VDraweeView vDraweeView2 = this.f6035d;
        if (zIsEmpty2) {
            vDraweeView2.setImageResource(i3c0.f12947s8);
            this.f6035d.setBackground(m7616k(giftLeaderboardTopEffectM24161b));
        } else {
            vDraweeView2.setImageResource(i3c0.f12947s8);
            hxs.u("context_single_room", this.f6035d, giftLeaderboardTopEffectM24161b.getBackgroundUrl(), t100.d(180.0f), t100.d(56.0f));
        }
        String backgroundSvgaUrl = giftLeaderboardTopEffectM24161b.getBackgroundSvgaUrl();
        if (duration == 0) {
            duration = 3000;
        }
        m7624s(backgroundSvgaUrl, d30Var, duration);
    }

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6039h = true;
        this.f6040i = null;
        this.f6041j = new bs5();
    }

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6039h = true;
        this.f6040i = null;
        this.f6041j = new bs5();
    }
}
