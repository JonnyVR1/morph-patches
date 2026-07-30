package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.gt0;
import p153l.qa00;
import p153l.rlr;

/* JADX INFO: loaded from: classes12.dex */
public class LikersNewLikeBubble extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38165a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f38166b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f38167c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f38168d;

    /* JADX INFO: renamed from: e */
    public View f38169e;

    /* JADX INFO: renamed from: f */
    public View f38170f;

    /* JADX INFO: renamed from: g */
    public View f38171g;

    /* JADX INFO: renamed from: h */
    public Animator f38172h;

    /* JADX INFO: renamed from: i */
    public Animator f38173i;

    public LikersNewLikeBubble(Context context) {
        super(context);
    }

    private Animator getAnimatorDismiss() {
        if (NullChecker.m82486a(this.f38173i)) {
            this.f38173i.cancel();
        }
        Animator animatorM132170p = gt0.m132170p(this.f38169e, "alpha", 200L, 200L, null, 1.0f, 0.0f);
        this.f38173i = animatorM132170p;
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.plr
            @Override // java.lang.Runnable
            public final void run() {
                this.f153064a.m57793d();
            }
        });
        return this.f38173i;
    }

    private Animator getAnimatorShow() {
        if (NullChecker.m82486a(this.f38172h)) {
            this.f38172h.cancel();
        }
        Animator animatorM132170p = gt0.m132170p(this.f38171g, "alpha", 0L, 600L, null, 0.0f, 1.0f);
        View view = this.f38169e;
        Animator animatorM132170p2 = gt0.m132170p(view, "translationX", 0L, 600L, null, view.getTranslationX(), this.f38169e.getTranslationX() - qa00.m175859d(10.0f));
        View view2 = this.f38170f;
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, animatorM132170p2, gt0.m132170p(view2, "translationX", 100L, 600L, null, view2.getTranslationX(), this.f38170f.getTranslationX() - qa00.m175859d(10.0f)));
        this.f38172h = animatorM132180z;
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.qlr
            @Override // java.lang.Runnable
            public final void run() {
                this.f158269a.m57794e();
            }
        });
        return this.f38172h;
    }

    /* JADX INFO: renamed from: c */
    public final void m57792c(View view) {
        rlr.m182023a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m57793d() {
        View view = this.f38169e;
        this.f38169e = this.f38170f;
        this.f38170f = this.f38171g;
        this.f38171g = view;
        view.setTranslationX(this.f38166b.getLeft() - this.f38171g.getLeft());
        this.f38170f.bringToFront();
        this.f38169e.bringToFront();
        getAnimatorShow().start();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m57794e() {
        Animator animatorDismiss = getAnimatorDismiss();
        animatorDismiss.setStartDelay(600L);
        animatorDismiss.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f38173i)) {
            this.f38173i.cancel();
            this.f38173i = null;
        }
        if (NullChecker.m82486a(this.f38172h)) {
            this.f38172h.cancel();
            this.f38172h = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57792c(this);
    }

    public LikersNewLikeBubble(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersNewLikeBubble(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
