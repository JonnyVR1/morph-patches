package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p147v.VDraweeView;
import p147v.VText;
import p149l.ac20;
import p149l.bs5;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.e30;
import p149l.ffw;
import p149l.hxs;
import p149l.i3c0;
import p149l.mep0;
import p149l.mkd0;
import p149l.roj0;
import p149l.rzs;
import p149l.t100;
import p149l.vui0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveIntlStarLeaderBoardEffectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveIntlStarLeaderBoardEffectView f49990a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49991b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f49992c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f49993d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f49994e;

    /* JADX INFO: renamed from: f */
    public VText f49995f;

    /* JADX INFO: renamed from: g */
    public Animator f49996g;

    /* JADX INFO: renamed from: h */
    public boolean f49997h;

    /* JADX INFO: renamed from: i */
    public Animator f49998i;

    /* JADX INFO: renamed from: j */
    public bs5 f49999j;

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context) {
        super(context);
        this.f49997h = true;
        this.f49998i = null;
        this.f49999j = new bs5();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ roj0 m74050f(ac20 ac20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ac20Var.m95712e(bitmap.copy(bitmap.getConfig(), false));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: h */
    public final void m74052h(View view) {
        rzs.m181761a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m74053i() {
        this.f49997h = true;
        if (NullChecker.m81303a(this.f49998i)) {
            this.f49998i.end();
            this.f49998i.removeAllListeners();
        }
        dt0.m113503C(this.f49996g);
    }

    /* JADX INFO: renamed from: j */
    public final int[] m74054j(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        int color;
        int color2;
        try {
            color = Color.parseColor("#" + giftLeaderboardTopEffect.getStartBackendColor());
            color2 = Color.parseColor("#" + giftLeaderboardTopEffect.getEndBackendColor());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            color = Color.parseColor("#7613F3");
            color2 = Color.parseColor("#7613F3");
        }
        return new int[]{color, color2};
    }

    /* JADX INFO: renamed from: k */
    public final GradientDrawable m74055k(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(24.0f));
        gradientDrawable.setColors(m74054j(giftLeaderboardTopEffect));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: l */
    public boolean m74056l() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m74057m() {
        if (this.f49997h) {
            return;
        }
        this.f49998i.start();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m74058n() {
        this.f49997h = true;
        this.f49998i.end();
        this.f49998i.removeAllListeners();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m74059o() {
        xdl0.m208344M(this, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74053i();
        this.f49999j.m103657c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74052h(this);
        mep0.m154301c1(this.f49992c, 0, 0, 0, 0, t100.m186890d(12.0f));
        mep0.m154301c1(this.f49993d, 0, 0, 0, 0, t100.m186890d(12.0f));
        mep0.m154301c1(this.f49994e, 0, 0, 0, 0, t100.m186890d(12.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m74060p(d30 d30Var) {
        xdl0.m208344M(this, false);
        this.f49997h = true;
        this.f49999j.m103657c();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m74061q(SpannableStringBuilder spannableStringBuilder, roj0 roj0Var) {
        this.f49995f.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m74062r(Act act, final SpannableStringBuilder spannableStringBuilder, final ac20 ac20Var) {
        if (ac20Var.m95711d()) {
            return;
        }
        this.f49999j.m103655a(act.duringCreated(hxs.m133392e("context_common", ac20Var.m95710c().trim()).map(new w9j() { // from class: l.pzs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveIntlStarLeaderBoardEffectView.m74050f(ac20Var, (Bitmap) obj);
            }
        }).compose(mkd0.m154951C())).subscribe(ffw.m121193d(new e30() { // from class: l.qzs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157093a.m74061q(spannableStringBuilder, (roj0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public void m74063s(String str, final d30 d30Var, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f49994e.m68500j(str, -1);
        }
        this.f49997h = false;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49992c, "translationY", -t100.m186890d(56.0f), t100.m186890d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f49991b, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f49992c, "translationY", t100.m186890d(59.0f), t100.m186890d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        Animator animatorM103744q = bt0.m103744q(this.f49991b, "alpha", 1.0f, 0.5f);
        animatorM103744q.setDuration(650L);
        Animator animatorM103744q2 = bt0.m103744q(this.f49991b, "alpha", 0.5f, 1.0f);
        animatorM103744q2.setDuration(350L);
        Animator animatorM103746s = bt0.m103746s(animatorM103744q, animatorM103744q2);
        this.f49998i = animatorM103746s;
        animatorM103746s.setInterpolator(new LinearInterpolator());
        bt0.m103733f(this.f49998i, new Runnable() { // from class: l.lzs
            @Override // java.lang.Runnable
            public final void run() {
                this.f130674a.m74057m();
            }
        });
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f49992c, "translationY", t100.m186890d(49.0f), -t100.m186890d(105.0f));
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setStartDelay(j);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        bt0.m103749v(objectAnimatorOfFloat4, new Runnable() { // from class: l.mzs
            @Override // java.lang.Runnable
            public final void run() {
                this.f136419a.m74058n();
            }
        });
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f49991b, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setStartDelay(j);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        Animator animatorM103746s2 = bt0.m103746s(bt0.m103753z(objectAnimatorOfFloat, objectAnimatorOfFloat2), objectAnimatorOfFloat3, this.f49998i, bt0.m103753z(objectAnimatorOfFloat4, objectAnimatorOfFloat5));
        this.f49996g = animatorM103746s2;
        bt0.m103750w(animatorM103746s2, new Runnable() { // from class: l.nzs
            @Override // java.lang.Runnable
            public final void run() {
                this.f141248a.m74059o();
            }
        }, new Runnable() { // from class: l.ozs
            @Override // java.lang.Runnable
            public final void run() {
                this.f146495a.m74060p(d30Var);
            }
        });
        this.f49996g.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m74064t(final Act act, final SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null) {
            return;
        }
        vwb.m200354z(Arrays.asList((ac20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ac20.class)), new e30() { // from class: l.kzs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125415a.m74062r(act, spannableStringBuilder, (ac20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m74065u(Act act, vui0 vui0Var, d30 d30Var) {
        LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffectM200074b = vui0Var.m200074b();
        m74064t(act, vui0Var.m200073a());
        if (giftLeaderboardTopEffectM200074b == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(giftLeaderboardTopEffectM200074b.getEffectBackgroundUrl());
        VDraweeView vDraweeView = this.f49991b;
        if (zIsEmpty) {
            vDraweeView.setImageResource(i3c0.f110789M7);
        } else {
            hxs.m133406s("context_single_room", vDraweeView, giftLeaderboardTopEffectM200074b.getEffectBackgroundUrl());
        }
        long duration = giftLeaderboardTopEffectM200074b.getDuration();
        boolean zIsEmpty2 = TextUtils.isEmpty(giftLeaderboardTopEffectM200074b.getBackgroundUrl());
        VDraweeView vDraweeView2 = this.f49993d;
        if (zIsEmpty2) {
            vDraweeView2.setImageResource(i3c0.f111162s8);
            this.f49993d.setBackground(m74055k(giftLeaderboardTopEffectM200074b));
        } else {
            vDraweeView2.setImageResource(i3c0.f111162s8);
            hxs.m133408u("context_single_room", this.f49993d, giftLeaderboardTopEffectM200074b.getBackgroundUrl(), t100.m186890d(180.0f), t100.m186890d(56.0f));
        }
        String backgroundSvgaUrl = giftLeaderboardTopEffectM200074b.getBackgroundSvgaUrl();
        if (duration == 0) {
            duration = 3000;
        }
        m74063s(backgroundSvgaUrl, d30Var, duration);
    }

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49997h = true;
        this.f49998i = null;
        this.f49999j = new bs5();
    }

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49997h = true;
        this.f49998i = null;
        this.f49999j = new bs5();
    }
}
