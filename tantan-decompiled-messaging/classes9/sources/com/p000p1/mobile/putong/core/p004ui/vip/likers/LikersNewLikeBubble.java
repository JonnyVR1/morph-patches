package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.qjr;
import l.t100;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LikersNewLikeBubble extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7098a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7099b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7100c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f7101d;

    /* JADX INFO: renamed from: e */
    public View f7102e;

    /* JADX INFO: renamed from: f */
    public View f7103f;

    /* JADX INFO: renamed from: g */
    public View f7104g;

    /* JADX INFO: renamed from: h */
    public Animator f7105h;

    /* JADX INFO: renamed from: i */
    public Animator f7106i;

    public LikersNewLikeBubble(Context context) {
        super(context);
    }

    private Animator getAnimatorDismiss() {
        if (NullChecker.a(this.f7106i)) {
            this.f7106i.cancel();
        }
        Animator animatorP = bt0.p(this.f7102e, "alpha", 200L, 200L, (Interpolator) null, new float[]{1.0f, 0.0f});
        this.f7106i = animatorP;
        bt0.f(animatorP, new Runnable() { // from class: l.ojr
            @Override // java.lang.Runnable
            public final void run() {
                this.f18261a.m10053d();
            }
        });
        return this.f7106i;
    }

    private Animator getAnimatorShow() {
        if (NullChecker.a(this.f7105h)) {
            this.f7105h.cancel();
        }
        Animator animatorP = bt0.p(this.f7104g, "alpha", 0L, 600L, (Interpolator) null, new float[]{0.0f, 1.0f});
        View view = this.f7102e;
        Animator animatorP2 = bt0.p(view, "translationX", 0L, 600L, (Interpolator) null, new float[]{view.getTranslationX(), this.f7102e.getTranslationX() - t100.d(10.0f)});
        View view2 = this.f7103f;
        Animator animatorZ = bt0.z(new Animator[]{animatorP, animatorP2, bt0.p(view2, "translationX", 100L, 600L, (Interpolator) null, new float[]{view2.getTranslationX(), this.f7103f.getTranslationX() - t100.d(10.0f)})});
        this.f7105h = animatorZ;
        bt0.f(animatorZ, new Runnable() { // from class: l.pjr
            @Override // java.lang.Runnable
            public final void run() {
                this.f19163a.m10054e();
            }
        });
        return this.f7105h;
    }

    /* JADX INFO: renamed from: c */
    public final void m10052c(View view) {
        qjr.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m10053d() {
        View view = this.f7102e;
        this.f7102e = this.f7103f;
        this.f7103f = this.f7104g;
        this.f7104g = view;
        view.setTranslationX(this.f7099b.getLeft() - this.f7104g.getLeft());
        this.f7103f.bringToFront();
        this.f7102e.bringToFront();
        getAnimatorShow().start();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m10054e() {
        Animator animatorDismiss = getAnimatorDismiss();
        animatorDismiss.setStartDelay(600L);
        animatorDismiss.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f7106i)) {
            this.f7106i.cancel();
            this.f7106i = null;
        }
        if (NullChecker.a(this.f7105h)) {
            this.f7105h.cancel();
            this.f7105h = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10052c(this);
    }

    public LikersNewLikeBubble(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersNewLikeBubble(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
