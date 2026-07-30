package com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice;

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
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationItemViewBindings;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.arl;
import p153l.bnl0;
import p153l.dhw;
import p153l.fc2;
import p153l.fo0;
import p153l.ft5;
import p153l.gt0;
import p153l.izs;
import p153l.leo0;
import p153l.psd0;
import p153l.qa00;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceUserNotificationItemView extends LiveVoiceChatUserNotificationItemViewBindings implements arl {

    /* JADX INFO: renamed from: h */
    public ft5 f49793h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f49794i;

    /* JADX INFO: renamed from: j */
    public Animator f49795j;

    /* JADX INFO: renamed from: k */
    public y20<leo0> f49796k;

    /* JADX INFO: renamed from: l */
    public leo0 f49797l;

    public VoiceUserNotificationItemView(Context context) {
        super(context);
        this.f49796k = null;
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
        m73944p();
    }

    /* JADX INFO: renamed from: i */
    public void m73938i(@Nullable y20<leo0> y20Var) {
        AnimatorSet animatorSet = this.f49794i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator animator = this.f49795j;
        if (animator == null || !animator.isRunning()) {
            psd0.m173633z(this.f49793h);
            m73949w(y20Var);
        }
    }

    public boolean isShowing() {
        return bnl0.m105529O0(this);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73939j(leo0 leo0Var, y20 y20Var, View view) {
        if (TextUtils.isEmpty(leo0Var.m153920d())) {
            return;
        }
        y20Var.call(leo0Var);
        psd0.m173633z(this.f49793h);
        m73938i(null);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73940k(y20 y20Var, Long l2) {
        m73949w(y20Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m73941l() {
        bnl0.m105524M(this, false);
        y20<leo0> y20Var = this.f49796k;
        if (y20Var != null) {
            y20Var.call(this.f49797l);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m73942m(x20 x20Var) {
        setAlpha(0.0f);
        bnl0.m105524M(this, true);
        x20Var.call();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f49793h);
    }

    /* JADX INFO: renamed from: p */
    public void m73944p() {
        psd0.m173633z(this.f49793h);
        m73945q(this.f49794i);
        m73945q(this.f49795j);
        this.f49796k = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m73945q(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m73946s(leo0 leo0Var, y20<leo0> y20Var, x20 x20Var, @Nullable y20<leo0> y20Var2) {
        int i;
        if (leo0Var == null) {
            return;
        }
        this.f49797l = leo0Var;
        bnl0.m105524M(this, true);
        psd0.m173633z(this.f49793h);
        bnl0.m105524M(this.f49166e, true);
        bnl0.m105524M(this.f49167f, false);
        bnl0.m105524M(this.f49168g, false);
        m73947u(this, leo0Var, y20Var);
        if (leo0Var.m153923g() && !TextUtils.isEmpty(leo0Var.m153917a().getStartColor()) && !TextUtils.isEmpty(leo0Var.m153917a().getEndColor())) {
            Drawable drawableM124975e = fc2.m124975e(new int[]{Color.parseColor(leo0Var.m153917a().getStartColor()), Color.parseColor(leo0Var.m153917a().getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.f156322i, false);
            try {
                i = (int) (Float.parseFloat(leo0Var.m153917a().getAlpha()) * 255.0f);
            } catch (NumberFormatException unused) {
                i = 255;
            }
            drawableM124975e.setAlpha(i);
            getRoot().setBackground(drawableM124975e);
        }
        String strM153919c = leo0Var.m153919c();
        boolean zIsEmpty = TextUtils.isEmpty(strM153919c);
        bnl0.m105538V(this.f49165d, !zIsEmpty ? qa00.f156320g : qa00.m175859d(12.0f));
        bnl0.m105539W(this.f49165d, 0);
        if (!zIsEmpty) {
            izs.m142869t("context_livingAct", this.f49164c, strM153919c, qa00.f156332s);
        }
        this.f49165d.setText(leo0Var.m153918b());
        this.f49165d.setMaxLines(2);
        m73950x(x20Var, y20Var2);
    }

    /* JADX INFO: renamed from: u */
    public final void m73947u(View view, final leo0 leo0Var, final y20<leo0> y20Var) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.n8p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f140703a.m73939j(leo0Var, y20Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m73943n(@Nullable final y20<leo0> y20Var) {
        ft5 ft5Var = new ft5();
        this.f49793h = ft5Var;
        ft5Var.m127297a(C22421c.timer(this.f49797l.m153921e(), TimeUnit.SECONDS).observeOn(fo0.m126432a()).onBackpressureLatest().subscribe(dhw.m115825d(new y20() { // from class: l.o8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145455a.m73940k(y20Var, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: w */
    public final void m73949w(@Nullable y20<leo0> y20Var) {
        this.f49796k = y20Var;
        if (this.f49795j == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<VoiceUserNotificationItemView, Float>) View.ALPHA, 1.0f, 0.0f);
            this.f49795j = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            gt0.m132160f(this.f49795j, new Runnable() { // from class: l.p8p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151054a.m73941l();
                }
            });
        }
        this.f49795j.start();
    }

    /* JADX INFO: renamed from: x */
    public final void m73950x(final x20 x20Var, @Nullable final y20<leo0> y20Var) {
        if (this.f49794i == null) {
            this.f49794i = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -qa00.m175859d(232.0f), 0.0f);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(300L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(400L);
            this.f49794i.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            gt0.m132177w(this.f49794i, new Runnable() { // from class: l.l8p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130507a.m73942m(x20Var);
                }
            }, new Runnable() { // from class: l.m8p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135271a.m73943n(y20Var);
                }
            });
        }
        this.f49794i.start();
    }

    public VoiceUserNotificationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49796k = null;
    }

    public VoiceUserNotificationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49796k = null;
    }
}
