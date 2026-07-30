package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.live.intl.giftleaderboard.LongLinkLiveIntlGiftLeaderboard;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.LiveIntlStarLeaderBoardEffectView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dhw;
import p153l.ft5;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jk20;
import p153l.jyb;
import p153l.obc0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qnp0;
import p153l.s1t;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;
import p153l.z3j0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveIntlStarLeaderBoardEffectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveIntlStarLeaderBoardEffectView f50838a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50839b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f50840c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f50841d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f50842e;

    /* JADX INFO: renamed from: f */
    public VText f50843f;

    /* JADX INFO: renamed from: g */
    public Animator f50844g;

    /* JADX INFO: renamed from: h */
    public boolean f50845h;

    /* JADX INFO: renamed from: i */
    public Animator f50846i;

    /* JADX INFO: renamed from: j */
    public ft5 f50847j;

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context) {
        super(context);
        this.f50845h = true;
        this.f50846i = null;
        this.f50847j = new ft5();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ uxj0 m75233f(jk20 jk20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            jk20Var.m145151e(bitmap.copy(bitmap.getConfig(), false));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: h */
    public final void m75235h(View view) {
        s1t.m184060a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m75236i() {
        this.f50845h = true;
        if (NullChecker.m82486a(this.f50846i)) {
            this.f50846i.end();
            this.f50846i.removeAllListeners();
        }
        it0.m142009C(this.f50844g);
    }

    /* JADX INFO: renamed from: j */
    public final int[] m75237j(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        int color;
        int color2;
        try {
            color = Color.parseColor("#" + giftLeaderboardTopEffect.getStartBackendColor());
            color2 = Color.parseColor("#" + giftLeaderboardTopEffect.getEndBackendColor());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            color = Color.parseColor("#7613F3");
            color2 = Color.parseColor("#7613F3");
        }
        return new int[]{color, color2};
    }

    /* JADX INFO: renamed from: k */
    public final GradientDrawable m75238k(LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(24.0f));
        gradientDrawable.setColors(m75237j(giftLeaderboardTopEffect));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: l */
    public boolean m75239l() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m75240m() {
        if (this.f50845h) {
            return;
        }
        this.f50846i.start();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75241n() {
        this.f50845h = true;
        this.f50846i.end();
        this.f50846i.removeAllListeners();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m75242o() {
        bnl0.m105524M(this, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m75236i();
        this.f50847j.m127299c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75235h(this);
        qnp0.m177260c1(this.f50840c, 0, 0, 0, 0, qa00.m175859d(12.0f));
        qnp0.m177260c1(this.f50841d, 0, 0, 0, 0, qa00.m175859d(12.0f));
        qnp0.m177260c1(this.f50842e, 0, 0, 0, 0, qa00.m175859d(12.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m75243p(x20 x20Var) {
        bnl0.m105524M(this, false);
        this.f50845h = true;
        this.f50847j.m127299c();
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m75244q(SpannableStringBuilder spannableStringBuilder, uxj0 uxj0Var) {
        this.f50843f.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m75245r(Act act, final SpannableStringBuilder spannableStringBuilder, final jk20 jk20Var) {
        if (jk20Var.m145150d()) {
            return;
        }
        this.f50847j.m127297a(act.duringCreated(izs.m142854e("context_common", jk20Var.m145149c().trim()).map(new qcj() { // from class: l.q1t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveIntlStarLeaderBoardEffectView.m75233f(jk20Var, (Bitmap) obj);
            }
        }).compose(psd0.m173592C())).subscribe(dhw.m115825d(new y20() { // from class: l.r1t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160852a.m75244q(spannableStringBuilder, (uxj0) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public void m75246s(String str, final x20 x20Var, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f50842e.m69683j(str, -1);
        }
        this.f50845h = false;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50840c, "translationY", -qa00.m175859d(56.0f), qa00.m175859d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50839b, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50840c, "translationY", qa00.m175859d(59.0f), qa00.m175859d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        Animator animatorM132171q = gt0.m132171q(this.f50839b, "alpha", 1.0f, 0.5f);
        animatorM132171q.setDuration(650L);
        Animator animatorM132171q2 = gt0.m132171q(this.f50839b, "alpha", 0.5f, 1.0f);
        animatorM132171q2.setDuration(350L);
        Animator animatorM132173s = gt0.m132173s(animatorM132171q, animatorM132171q2);
        this.f50846i = animatorM132173s;
        animatorM132173s.setInterpolator(new LinearInterpolator());
        gt0.m132160f(this.f50846i, new Runnable() { // from class: l.m1t
            @Override // java.lang.Runnable
            public final void run() {
                this.f134464a.m75240m();
            }
        });
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50840c, "translationY", qa00.m175859d(49.0f), -qa00.m175859d(105.0f));
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setStartDelay(j);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        gt0.m132176v(objectAnimatorOfFloat4, new Runnable() { // from class: l.n1t
            @Override // java.lang.Runnable
            public final void run() {
                this.f139792a.m75241n();
            }
        });
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50839b, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setStartDelay(j);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        Animator animatorM132173s2 = gt0.m132173s(gt0.m132180z(objectAnimatorOfFloat, objectAnimatorOfFloat2), objectAnimatorOfFloat3, this.f50846i, gt0.m132180z(objectAnimatorOfFloat4, objectAnimatorOfFloat5));
        this.f50844g = animatorM132173s2;
        gt0.m132177w(animatorM132173s2, new Runnable() { // from class: l.o1t
            @Override // java.lang.Runnable
            public final void run() {
                this.f144685a.m75242o();
            }
        }, new Runnable() { // from class: l.p1t
            @Override // java.lang.Runnable
            public final void run() {
                this.f150195a.m75243p(x20Var);
            }
        });
        this.f50844g.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m75247t(final Act act, final SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null) {
            return;
        }
        jyb.m147537z(Arrays.asList((jk20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), jk20.class)), new y20() { // from class: l.l1t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129721a.m75245r(act, spannableStringBuilder, (jk20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m75248u(Act act, z3j0 z3j0Var, x20 x20Var) {
        LongLinkLiveIntlGiftLeaderboard.GiftLeaderboardTopEffect giftLeaderboardTopEffectM218482b = z3j0Var.m218482b();
        m75247t(act, z3j0Var.m218481a());
        if (giftLeaderboardTopEffectM218482b == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(giftLeaderboardTopEffectM218482b.getEffectBackgroundUrl());
        VDraweeView vDraweeView = this.f50839b;
        if (zIsEmpty) {
            vDraweeView.setImageResource(obc0.f146117M7);
        } else {
            izs.m142868s("context_single_room", vDraweeView, giftLeaderboardTopEffectM218482b.getEffectBackgroundUrl());
        }
        long duration = giftLeaderboardTopEffectM218482b.getDuration();
        boolean zIsEmpty2 = TextUtils.isEmpty(giftLeaderboardTopEffectM218482b.getBackgroundUrl());
        VDraweeView vDraweeView2 = this.f50841d;
        if (zIsEmpty2) {
            vDraweeView2.setImageResource(obc0.f146490s8);
            this.f50841d.setBackground(m75238k(giftLeaderboardTopEffectM218482b));
        } else {
            vDraweeView2.setImageResource(obc0.f146490s8);
            izs.m142870u("context_single_room", this.f50841d, giftLeaderboardTopEffectM218482b.getBackgroundUrl(), qa00.m175859d(180.0f), qa00.m175859d(56.0f));
        }
        String backgroundSvgaUrl = giftLeaderboardTopEffectM218482b.getBackgroundSvgaUrl();
        if (duration == 0) {
            duration = 3000;
        }
        m75246s(backgroundSvgaUrl, x20Var, duration);
    }

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50845h = true;
        this.f50846i = null;
        this.f50847j = new ft5();
    }

    public LiveIntlStarLeaderBoardEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50845h = true;
        this.f50846i = null;
        this.f50847j = new ft5();
    }
}
