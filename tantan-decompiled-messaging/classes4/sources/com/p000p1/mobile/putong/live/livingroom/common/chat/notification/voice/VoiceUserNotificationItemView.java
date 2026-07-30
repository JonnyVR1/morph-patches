package com.p000p1.mobile.putong.live.livingroom.common.chat.notification.voice;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationItemViewBindings;
import java.util.concurrent.TimeUnit;
import l.bs5;
import l.bt0;
import l.d30;
import l.e30;
import l.ffw;
import l.hxs;
import l.jo0;
import l.mkd0;
import l.t100;
import l.xdl0;
import l.yb2;
import p002l.h5o0;
import p002l.pol;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceUserNotificationItemView extends LiveVoiceChatUserNotificationItemViewBindings implements pol {

    /* JADX INFO: renamed from: h */
    public bs5 f4987h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f4988i;

    /* JADX INFO: renamed from: j */
    public Animator f4989j;

    /* JADX INFO: renamed from: k */
    public e30<h5o0> f4990k;

    /* JADX INFO: renamed from: l */
    public h5o0 f4991l;

    public VoiceUserNotificationItemView(Context context) {
        super(context);
        this.f4990k = null;
    }

    @Override // p002l.pol
    /* JADX INFO: renamed from: M */
    public void mo5986M() {
        m6268p();
    }

    /* JADX INFO: renamed from: i */
    public void m6262i(@Nullable e30<h5o0> e30Var) {
        AnimatorSet animatorSet = this.f4988i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator animator = this.f4989j;
        if (animator == null || !animator.isRunning()) {
            mkd0.z(this.f4987h);
            m6273w(e30Var);
        }
    }

    public boolean isShowing() {
        return xdl0.O0(this);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6263j(h5o0 h5o0Var, e30 e30Var, View view) {
        if (TextUtils.isEmpty(h5o0Var.m14213d())) {
            return;
        }
        e30Var.call(h5o0Var);
        mkd0.z(this.f4987h);
        m6262i(null);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6264k(e30 e30Var, Long l2) {
        m6273w(e30Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m6265l() {
        xdl0.M(this, false);
        e30<h5o0> e30Var = this.f4990k;
        if (e30Var != null) {
            e30Var.call(this.f4991l);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m6266m(d30 d30Var) {
        setAlpha(0.0f);
        xdl0.M(this, true);
        d30Var.call();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f4987h);
    }

    /* JADX INFO: renamed from: p */
    public void m6268p() {
        mkd0.z(this.f4987h);
        m6269q(this.f4988i);
        m6269q(this.f4989j);
        this.f4990k = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m6269q(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m6270s(h5o0 h5o0Var, e30<h5o0> e30Var, d30 d30Var, @Nullable e30<h5o0> e30Var2) {
        int i;
        if (h5o0Var == null) {
            return;
        }
        this.f4991l = h5o0Var;
        xdl0.M(this, true);
        mkd0.z(this.f4987h);
        xdl0.M(this.f4360e, true);
        xdl0.M(this.f4361f, false);
        xdl0.M(this.f4362g, false);
        m6271u(this, h5o0Var, e30Var);
        if (h5o0Var.m14216g() && !TextUtils.isEmpty(h5o0Var.m14210a().getStartColor()) && !TextUtils.isEmpty(h5o0Var.m14210a().getEndColor())) {
            Drawable drawableE = yb2.e(new int[]{Color.parseColor(h5o0Var.m14210a().getStartColor()), Color.parseColor(h5o0Var.m14210a().getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, t100.i, false);
            try {
                i = (int) (Float.parseFloat(h5o0Var.m14210a().getAlpha()) * 255.0f);
            } catch (NumberFormatException unused) {
                i = 255;
            }
            drawableE.setAlpha(i);
            getRoot().setBackground(drawableE);
        }
        String strM14212c = h5o0Var.m14212c();
        boolean zIsEmpty = TextUtils.isEmpty(strM14212c);
        xdl0.V(this.f4359d, !zIsEmpty ? t100.g : t100.d(12.0f));
        xdl0.W(this.f4359d, 0);
        if (!zIsEmpty) {
            hxs.t("context_livingAct", this.f4358c, strM14212c, t100.s);
        }
        this.f4359d.setText(h5o0Var.m14211b());
        this.f4359d.setMaxLines(2);
        m6274x(d30Var, e30Var2);
    }

    /* JADX INFO: renamed from: u */
    public final void m6271u(View view, final h5o0 h5o0Var, final e30<h5o0> e30Var) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.jzo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14152a.m6263j(h5o0Var, e30Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m6267n(@Nullable final e30<h5o0> e30Var) {
        bs5 bs5Var = new bs5();
        this.f4987h = bs5Var;
        bs5Var.a(c.timer(this.f4991l.m14214e(), TimeUnit.SECONDS).observeOn(jo0.a()).onBackpressureLatest().subscribe(ffw.d(new e30() { // from class: l.kzo0
            public final void call(Object obj) {
                this.f14609a.m6264k(e30Var, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: w */
    public final void m6273w(@Nullable e30<h5o0> e30Var) {
        this.f4990k = e30Var;
        if (this.f4989j == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<VoiceUserNotificationItemView, Float>) View.ALPHA, 1.0f, 0.0f);
            this.f4989j = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            bt0.f(this.f4989j, new Runnable() { // from class: l.lzo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15187a.m6265l();
                }
            });
        }
        this.f4989j.start();
    }

    /* JADX INFO: renamed from: x */
    public final void m6274x(final d30 d30Var, @Nullable final e30<h5o0> e30Var) {
        if (this.f4988i == null) {
            this.f4988i = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -t100.d(232.0f), 0.0f);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(300L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(400L);
            this.f4988i.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            bt0.w(this.f4988i, new Runnable() { // from class: l.hzo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12380a.m6266m(d30Var);
                }
            }, new Runnable() { // from class: l.izo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13512a.m6267n(e30Var);
                }
            });
        }
        this.f4988i.start();
    }

    public VoiceUserNotificationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4990k = null;
    }

    public VoiceUserNotificationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4990k = null;
    }
}
