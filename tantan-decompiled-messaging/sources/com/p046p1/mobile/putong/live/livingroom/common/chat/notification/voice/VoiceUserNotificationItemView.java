package com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice;

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
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationItemViewBindings;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.bs5;
import p149l.bt0;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.h5o0;
import p149l.hxs;
import p149l.jo0;
import p149l.mkd0;
import p149l.pol;
import p149l.t100;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceUserNotificationItemView extends LiveVoiceChatUserNotificationItemViewBindings implements pol {

    /* JADX INFO: renamed from: h */
    public bs5 f48945h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f48946i;

    /* JADX INFO: renamed from: j */
    public Animator f48947j;

    /* JADX INFO: renamed from: k */
    public e30<h5o0> f48948k;

    /* JADX INFO: renamed from: l */
    public h5o0 f48949l;

    public VoiceUserNotificationItemView(Context context) {
        super(context);
        this.f48948k = null;
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
        m72761p();
    }

    /* JADX INFO: renamed from: i */
    public void m72755i(@Nullable e30<h5o0> e30Var) {
        AnimatorSet animatorSet = this.f48946i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator animator = this.f48947j;
        if (animator == null || !animator.isRunning()) {
            mkd0.m154992z(this.f48945h);
            m72766w(e30Var);
        }
    }

    public boolean isShowing() {
        return xdl0.m208349O0(this);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m72756j(h5o0 h5o0Var, e30 e30Var, View view) {
        if (TextUtils.isEmpty(h5o0Var.m129438d())) {
            return;
        }
        e30Var.call(h5o0Var);
        mkd0.m154992z(this.f48945h);
        m72755i(null);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m72757k(e30 e30Var, Long l2) {
        m72766w(e30Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m72758l() {
        xdl0.m208344M(this, false);
        e30<h5o0> e30Var = this.f48948k;
        if (e30Var != null) {
            e30Var.call(this.f48949l);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m72759m(d30 d30Var) {
        setAlpha(0.0f);
        xdl0.m208344M(this, true);
        d30Var.call();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f48945h);
    }

    /* JADX INFO: renamed from: p */
    public void m72761p() {
        mkd0.m154992z(this.f48945h);
        m72762q(this.f48946i);
        m72762q(this.f48947j);
        this.f48948k = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m72762q(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m72763s(h5o0 h5o0Var, e30<h5o0> e30Var, d30 d30Var, @Nullable e30<h5o0> e30Var2) {
        int i;
        if (h5o0Var == null) {
            return;
        }
        this.f48949l = h5o0Var;
        xdl0.m208344M(this, true);
        mkd0.m154992z(this.f48945h);
        xdl0.m208344M(this.f48318e, true);
        xdl0.m208344M(this.f48319f, false);
        xdl0.m208344M(this.f48320g, false);
        m72764u(this, h5o0Var, e30Var);
        if (h5o0Var.m129441g() && !TextUtils.isEmpty(h5o0Var.m129435a().getStartColor()) && !TextUtils.isEmpty(h5o0Var.m129435a().getEndColor())) {
            Drawable drawableM213880e = yb2.m213880e(new int[]{Color.parseColor(h5o0Var.m129435a().getStartColor()), Color.parseColor(h5o0Var.m129435a().getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, t100.f167260i, false);
            try {
                i = (int) (Float.parseFloat(h5o0Var.m129435a().getAlpha()) * 255.0f);
            } catch (NumberFormatException unused) {
                i = 255;
            }
            drawableM213880e.setAlpha(i);
            getRoot().setBackground(drawableM213880e);
        }
        String strM129437c = h5o0Var.m129437c();
        boolean zIsEmpty = TextUtils.isEmpty(strM129437c);
        xdl0.m208358V(this.f48317d, !zIsEmpty ? t100.f167258g : t100.m186890d(12.0f));
        xdl0.m208359W(this.f48317d, 0);
        if (!zIsEmpty) {
            hxs.m133407t("context_livingAct", this.f48316c, strM129437c, t100.f167270s);
        }
        this.f48317d.setText(h5o0Var.m129436b());
        this.f48317d.setMaxLines(2);
        m72767x(d30Var, e30Var2);
    }

    /* JADX INFO: renamed from: u */
    public final void m72764u(View view, final h5o0 h5o0Var, final e30<h5o0> e30Var) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.jzo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f120405a.m72756j(h5o0Var, e30Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m72760n(@Nullable final e30<h5o0> e30Var) {
        bs5 bs5Var = new bs5();
        this.f48945h = bs5Var;
        bs5Var.m103655a(C22306c.timer(this.f48949l.m129439e(), TimeUnit.SECONDS).observeOn(jo0.m142408a()).onBackpressureLatest().subscribe(ffw.m121193d(new e30() { // from class: l.kzo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125403a.m72757k(e30Var, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: w */
    public final void m72766w(@Nullable e30<h5o0> e30Var) {
        this.f48948k = e30Var;
        if (this.f48947j == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<VoiceUserNotificationItemView, Float>) View.ALPHA, 1.0f, 0.0f);
            this.f48947j = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            bt0.m103733f(this.f48947j, new Runnable() { // from class: l.lzo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130665a.m72758l();
                }
            });
        }
        this.f48947j.start();
    }

    /* JADX INFO: renamed from: x */
    public final void m72767x(final d30 d30Var, @Nullable final e30<h5o0> e30Var) {
        if (this.f48946i == null) {
            this.f48946i = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -t100.m186890d(232.0f), 0.0f);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(300L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(400L);
            this.f48946i.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            bt0.m103750w(this.f48946i, new Runnable() { // from class: l.hzo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110218a.m72759m(d30Var);
                }
            }, new Runnable() { // from class: l.izo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115585a.m72760n(e30Var);
                }
            });
        }
        this.f48946i.start();
    }

    public VoiceUserNotificationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48948k = null;
    }

    public VoiceUserNotificationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48948k = null;
    }
}
